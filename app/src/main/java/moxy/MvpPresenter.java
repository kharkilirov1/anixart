package moxy;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import moxy.MvpView;
import moxy.locators.ViewStateLocator;
import moxy.viewstate.MvpViewState;

@InjectViewState
/* loaded from: classes3.dex */
public abstract class MvpPresenter<View extends MvpView> {
    public OnDestroyListener coroutineScope;
    private boolean isFirstLaunch = true;
    private Class<? extends MvpPresenter> presenterClass;
    private String tag;
    private MvpViewState<View> viewState;
    private View viewStateAsView;
    private Set<View> views;

    public static class Binder {
        private Binder() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void bind(MvpPresenter mvpPresenter) {
            MvpViewState viewState = ViewStateLocator.getViewState(mvpPresenter.getClass());
            mvpPresenter.viewStateAsView = (MvpView) viewState;
            mvpPresenter.viewState = viewState;
        }
    }

    public MvpPresenter() {
        Binder.bind(this);
        this.views = Collections.newSetFromMap(new WeakHashMap());
    }

    public void attachView(View view) {
        MvpViewState<View> mvpViewState = this.viewState;
        if (mvpViewState != null) {
            mvpViewState.attachView(view);
        } else {
            this.views.add(view);
        }
        if (this.isFirstLaunch) {
            this.isFirstLaunch = false;
            onFirstViewAttach();
        }
    }

    public void destroyView(View view) {
        MvpViewState<View> mvpViewState = this.viewState;
        if (mvpViewState != null) {
            mvpViewState.destroyView(view);
        }
    }

    public void detachView(View view) {
        MvpViewState<View> mvpViewState = this.viewState;
        if (mvpViewState != null) {
            mvpViewState.detachView(view);
        } else {
            this.views.remove(view);
        }
    }

    public Set<View> getAttachedViews() {
        MvpViewState<View> mvpViewState = this.viewState;
        return mvpViewState != null ? mvpViewState.getViews() : this.views;
    }

    public Class<? extends MvpPresenter> getPresenterClass() {
        return this.presenterClass;
    }

    public String getTag() {
        return this.tag;
    }

    public View getViewState() {
        return this.viewStateAsView;
    }

    public boolean isInRestoreState(View view) {
        MvpViewState<View> mvpViewState = this.viewState;
        if (mvpViewState != null) {
            return mvpViewState.isInRestoreState(view);
        }
        return false;
    }

    public void onDestroy() {
    }

    public void onFirstViewAttach() {
    }

    public void setPresenterClass(Class<? extends MvpPresenter> cls) {
        this.presenterClass = cls;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewState(MvpViewState<View> mvpViewState) {
        this.viewStateAsView = (View) mvpViewState;
        this.viewState = mvpViewState;
    }
}

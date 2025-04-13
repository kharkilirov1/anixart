package moxy;

import android.os.Bundle;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import moxy.presenter.PresenterField;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class MvpDelegate<Delegated> {
    private static final Comparator<PresenterField> COMPARE_BY_TAGS = C1062a.f12101m;
    private static final String KEY_TAG = "moxy.MvpDelegate.KEY_TAG";
    public static final String MOXY_DELEGATE_TAGS_KEY = "MoxyDelegateBundle";
    private Bundle bundle;
    private String delegateTag;
    private final Delegated delegated;
    private boolean isAttached;
    private MvpDelegate parentDelegate;
    private String keyTag = KEY_TAG;
    private Set<PresenterField<? super Delegated>> externalPresenterFields = new TreeSet(COMPARE_BY_TAGS);
    private List<MvpPresenter<? super Delegated>> presenters = Collections.emptyList();
    private List<MvpDelegate> childDelegates = new ArrayList();

    public MvpDelegate(Delegated delegated) {
        this.delegated = delegated;
    }

    private void addChildDelegate(MvpDelegate mvpDelegate) {
        this.childDelegates.add(mvpDelegate);
    }

    private void closeCoroutineScope(MvpPresenter mvpPresenter) {
        OnDestroyListener onDestroyListener = mvpPresenter.coroutineScope;
        if (onDestroyListener != null) {
            onDestroyListener.onDestroy();
        } else {
            mvpPresenter.coroutineScope = OnDestroyListener.EMPTY;
        }
    }

    private String generateTag() {
        StringBuilder m24u = C0000a.m24u(this.parentDelegate != null ? C0000a.m20q(new StringBuilder(), this.parentDelegate.delegateTag, " ") : "");
        m24u.append(this.delegated.getClass().getSimpleName());
        m24u.append("$");
        m24u.append(getClass().getSimpleName());
        m24u.append(toString().replace(getClass().getName(), ""));
        return m24u.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(PresenterField presenterField, PresenterField presenterField2) {
        return presenterField.getTag(null).compareTo(presenterField2.getTag(null));
    }

    private void removeChildDelegate(MvpDelegate mvpDelegate) {
        this.childDelegates.remove(mvpDelegate);
    }

    public void freeParentDelegate() {
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate == null) {
            throw new IllegalStateException("You should call freeParentDelegate() before first call to setParentDelegate()");
        }
        mvpDelegate.removeChildDelegate(this);
    }

    public Bundle getChildrenSaveState() {
        return this.bundle;
    }

    public void onAttach() {
        for (MvpPresenter<? super Delegated> mvpPresenter : this.presenters) {
            if (!this.isAttached || !mvpPresenter.getAttachedViews().contains(this.delegated)) {
                mvpPresenter.attachView((MvpView) this.delegated);
            }
        }
        Iterator<MvpDelegate> it = this.childDelegates.iterator();
        while (it.hasNext()) {
            it.next().onAttach();
        }
        this.isAttached = true;
    }

    public void onCreate() {
        Bundle bundle = new Bundle();
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate != null) {
            bundle = mvpDelegate.bundle;
        }
        onCreate(bundle);
    }

    public void onDestroy() {
        PresentersCounter presentersCounter = MvpFacade.getInstance().getPresentersCounter();
        PresenterStore presenterStore = MvpFacade.getInstance().getPresenterStore();
        for (MvpPresenter mvpPresenter : presentersCounter.getAll(this.delegateTag)) {
            if (presentersCounter.rejectPresenter(mvpPresenter, this.delegateTag)) {
                presenterStore.remove(mvpPresenter.getTag());
                closeCoroutineScope(mvpPresenter);
                mvpPresenter.onDestroy();
            }
        }
    }

    public void onDestroyView() {
        Iterator<MvpPresenter<? super Delegated>> it = this.presenters.iterator();
        while (it.hasNext()) {
            it.next().destroyView((MvpView) this.delegated);
        }
        ArrayList arrayList = new ArrayList(this.childDelegates.size());
        arrayList.addAll(this.childDelegates);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MvpDelegate mvpDelegate = (MvpDelegate) it2.next();
            mvpDelegate.onSaveInstanceState();
            mvpDelegate.onDestroyView();
        }
        if (this.parentDelegate != null) {
            freeParentDelegate();
        }
    }

    public void onDetach() {
        for (MvpPresenter<? super Delegated> mvpPresenter : this.presenters) {
            if (this.isAttached || mvpPresenter.getAttachedViews().contains(this.delegated)) {
                mvpPresenter.detachView((MvpView) this.delegated);
            }
        }
        this.isAttached = false;
        Iterator<MvpDelegate> it = this.childDelegates.iterator();
        while (it.hasNext()) {
            it.next().onDetach();
        }
    }

    public void onSaveInstanceState() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        MvpDelegate mvpDelegate = this.parentDelegate;
        if (mvpDelegate != null && (bundle = mvpDelegate.bundle) != null) {
            bundle2 = bundle;
        }
        onSaveInstanceState(bundle2);
    }

    public void registerExternalPresenterField(PresenterField<? super Delegated> presenterField) {
        this.externalPresenterFields.add(presenterField);
    }

    public void removeAllChildDelegates() {
        ArrayList arrayList = new ArrayList(this.childDelegates.size());
        arrayList.addAll(this.childDelegates);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MvpDelegate) it.next()).freeParentDelegate();
        }
        this.childDelegates = new ArrayList();
    }

    public void setParentDelegate(MvpDelegate mvpDelegate, String str) {
        if (this.bundle != null) {
            throw new IllegalStateException("You should call setParentDelegate() before first call to onCreate()");
        }
        List<MvpDelegate> list = this.childDelegates;
        if (list != null && list.size() > 0) {
            throw new IllegalStateException("You could not set parent delegate when there are some child presenters already");
        }
        this.parentDelegate = mvpDelegate;
        this.keyTag = C0000a.m21r(new StringBuilder(), this.parentDelegate.keyTag, "$", str);
        mvpDelegate.addChildDelegate(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.parentDelegate == null) {
            Bundle bundle2 = new Bundle();
            bundle.putBundle(MOXY_DELEGATE_TAGS_KEY, bundle2);
            bundle = bundle2;
        }
        bundle.putAll(this.bundle);
        bundle.putString(this.keyTag, this.delegateTag);
        Iterator<MvpDelegate> it = this.childDelegates.iterator();
        while (it.hasNext()) {
            it.next().onSaveInstanceState(bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        if (this.parentDelegate == null && bundle != null) {
            bundle = bundle.getBundle(MOXY_DELEGATE_TAGS_KEY);
        }
        this.isAttached = false;
        Bundle bundle2 = bundle != null ? bundle : new Bundle();
        this.bundle = bundle2;
        if (bundle != null && bundle2.containsKey(this.keyTag)) {
            this.delegateTag = bundle.getString(this.keyTag);
        } else {
            this.delegateTag = generateTag();
        }
        this.presenters = MvpFacade.getInstance().getMvpProcessor().getMvpPresenters(this.delegated, this.delegateTag, this.externalPresenterFields);
        Iterator<MvpDelegate> it = this.childDelegates.iterator();
        while (it.hasNext()) {
            it.next().onCreate(bundle);
        }
    }
}

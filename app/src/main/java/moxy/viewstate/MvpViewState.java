package moxy.viewstate;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import moxy.MvpView;

/* loaded from: classes3.dex */
public abstract class MvpViewState<View extends MvpView> {
    public ViewCommands<View> viewCommands = new ViewCommands<>();
    public Set<View> views = Collections.newSetFromMap(new WeakHashMap());
    public Set<View> inRestoreState = Collections.newSetFromMap(new WeakHashMap());
    public Map<View, Set<ViewCommand<View>>> viewStates = new WeakHashMap();

    public void attachView(View view) {
        if (view == null) {
            throw new IllegalArgumentException("Mvp view must be not null");
        }
        if (this.views.add(view)) {
            this.inRestoreState.add(view);
            Set<ViewCommand<View>> set = this.viewStates.get(view);
            if (set == null) {
                set = Collections.emptySet();
            }
            restoreState(view, set);
            this.viewStates.remove(view);
            this.inRestoreState.remove(view);
        }
    }

    public void destroyView(View view) {
        this.viewStates.remove(view);
    }

    public void detachView(View view) {
        this.views.remove(view);
        this.inRestoreState.remove(view);
        Set<ViewCommand<View>> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        newSetFromMap.addAll(this.viewCommands.getCurrentState());
        this.viewStates.put(view, newSetFromMap);
    }

    public Set<View> getViews() {
        return this.views;
    }

    public Boolean hasNotView() {
        Set<View> set = this.views;
        return Boolean.valueOf(set == null || set.isEmpty());
    }

    public boolean isInRestoreState(View view) {
        return this.inRestoreState.contains(view);
    }

    public void restoreState(View view, Set<ViewCommand<View>> set) {
        if (this.viewCommands.isEmpty()) {
            return;
        }
        this.viewCommands.reapply(view, set);
    }
}

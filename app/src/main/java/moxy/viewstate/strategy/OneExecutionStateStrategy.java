package moxy.viewstate.strategy;

import java.util.List;
import moxy.MvpView;
import moxy.viewstate.ViewCommand;

/* loaded from: classes3.dex */
public class OneExecutionStateStrategy implements StateStrategy {
    @Override // moxy.viewstate.strategy.StateStrategy
    public <View extends MvpView> void afterApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand) {
        list.remove(viewCommand);
    }

    @Override // moxy.viewstate.strategy.StateStrategy
    public <View extends MvpView> void beforeApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand) {
        list.add(viewCommand);
    }
}

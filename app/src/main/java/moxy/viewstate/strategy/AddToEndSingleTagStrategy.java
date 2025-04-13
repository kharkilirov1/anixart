package moxy.viewstate.strategy;

import java.util.Iterator;
import java.util.List;
import moxy.MvpView;
import moxy.viewstate.ViewCommand;

/* loaded from: classes3.dex */
public class AddToEndSingleTagStrategy implements StateStrategy {
    @Override // moxy.viewstate.strategy.StateStrategy
    public <View extends MvpView> void afterApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand) {
    }

    @Override // moxy.viewstate.strategy.StateStrategy
    public <View extends MvpView> void beforeApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand) {
        Iterator<ViewCommand<View>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getTag().equals(viewCommand.getTag())) {
                it.remove();
            }
        }
        list.add(viewCommand);
    }
}

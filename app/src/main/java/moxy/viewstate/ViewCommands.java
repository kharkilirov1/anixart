package moxy.viewstate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import moxy.MvpView;
import moxy.locators.StrategyLocator;
import moxy.viewstate.strategy.StateStrategy;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class ViewCommands<View extends MvpView> {
    private List<ViewCommand<View>> state = new ArrayList();
    private Map<Class<? extends StateStrategy>, StateStrategy> strategies = new HashMap();

    private StateStrategy getStateStrategy(ViewCommand<View> viewCommand) {
        StateStrategy strategy = StrategyLocator.getStrategy(viewCommand.getStrategyType());
        if (strategy == null) {
            try {
                strategy = viewCommand.getStrategyType().newInstance();
                this.strategies.put(viewCommand.getStrategyType(), strategy);
            } catch (IllegalAccessException unused) {
                StringBuilder m24u = C0000a.m24u("Unable to create state strategy: ");
                m24u.append(viewCommand.toString());
                throw new IllegalArgumentException(m24u.toString());
            } catch (InstantiationException unused2) {
                StringBuilder m24u2 = C0000a.m24u("Unable to create state strategy: ");
                m24u2.append(viewCommand.toString());
                throw new IllegalArgumentException(m24u2.toString());
            }
        }
        return strategy;
    }

    public void afterApply(ViewCommand<View> viewCommand) {
        getStateStrategy(viewCommand).afterApply(this.state, viewCommand);
    }

    public void beforeApply(ViewCommand<View> viewCommand) {
        getStateStrategy(viewCommand).beforeApply(this.state, viewCommand);
    }

    public List<ViewCommand<View>> getCurrentState() {
        return this.state;
    }

    public boolean isEmpty() {
        return this.state.isEmpty();
    }

    public void reapply(View view, Set<ViewCommand<View>> set) {
        Iterator it = new ArrayList(this.state).iterator();
        while (it.hasNext()) {
            ViewCommand<View> viewCommand = (ViewCommand) it.next();
            if (!set.contains(viewCommand)) {
                viewCommand.apply(view);
                afterApply(viewCommand);
            }
        }
    }
}

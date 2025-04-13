package moxy.locators;

import java.util.HashMap;
import java.util.Map;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategy;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class StrategyLocator {
    private static Map<Class, StateStrategy> strategies;

    static {
        HashMap hashMap = new HashMap();
        strategies = hashMap;
        hashMap.put(AddToEndSingleStrategy.class, new AddToEndSingleStrategy());
        strategies.put(AddToEndStrategy.class, new AddToEndStrategy());
        strategies.put(OneExecutionStateStrategy.class, new OneExecutionStateStrategy());
    }

    private StrategyLocator() {
    }

    public static StateStrategy getStrategy(Class cls) {
        try {
            StateStrategy stateStrategy = strategies.get(cls);
            return stateStrategy != null ? stateStrategy : (StateStrategy) cls.newInstance();
        } catch (Exception unused) {
            StringBuilder m24u = C0000a.m24u("Cannot instantiate ");
            m24u.append(cls.getName());
            throw new RuntimeException(m24u.toString());
        }
    }
}

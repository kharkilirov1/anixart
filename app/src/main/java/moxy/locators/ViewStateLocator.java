package moxy.locators;

import moxy.MvpProcessor;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

/* loaded from: classes3.dex */
public class ViewStateLocator {
    private ViewStateLocator() {
    }

    public static MvpViewState getViewState(Class<?> cls) {
        try {
            return ((ViewStateProvider) Class.forName(cls.getName() + MvpProcessor.VIEW_STATE_PROVIDER_SUFFIX).newInstance()).getViewState();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

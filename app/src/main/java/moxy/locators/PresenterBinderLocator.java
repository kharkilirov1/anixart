package moxy.locators;

import moxy.MvpProcessor;
import moxy.PresenterBinder;

/* loaded from: classes3.dex */
public class PresenterBinderLocator {
    private PresenterBinderLocator() {
    }

    public static <Delegated> PresenterBinder<Delegated> getPresenterBinders(Class<?> cls) {
        do {
            PresenterBinder<Delegated> presenterBinder = (PresenterBinder<Delegated>) locatePresenterBinder(cls);
            if (presenterBinder != null) {
                return presenterBinder;
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return null;
    }

    private static PresenterBinder<?> locatePresenterBinder(Class<?> cls) {
        try {
            return (PresenterBinder) Class.forName(cls.getName() + MvpProcessor.PRESENTER_BINDER_SUFFIX).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}

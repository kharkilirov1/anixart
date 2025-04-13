package dagger.android;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.util.Log;
import dagger.internal.Preconditions;

/* loaded from: classes3.dex */
public final class AndroidInjection {
    /* renamed from: a */
    public static void m30778a(Activity activity) {
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof HasAndroidInjector)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), HasAndroidInjector.class.getCanonicalName()));
        }
        m30781d(activity, (HasAndroidInjector) application);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m30779b(Fragment fragment) {
        HasAndroidInjector hasAndroidInjector;
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == 0) {
                Activity activity = fragment.getActivity();
                if (activity instanceof HasAndroidInjector) {
                    hasAndroidInjector = (HasAndroidInjector) activity;
                } else {
                    if (!(activity.getApplication() instanceof HasAndroidInjector)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
                    }
                    hasAndroidInjector = (HasAndroidInjector) activity.getApplication();
                }
            } else if (fragment2 instanceof HasAndroidInjector) {
                hasAndroidInjector = (HasAndroidInjector) fragment2;
                break;
            }
        }
        if (Log.isLoggable("dagger.android", 3)) {
            Log.d("dagger.android", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), hasAndroidInjector.getClass().getCanonicalName()));
        }
        m30781d(fragment, hasAndroidInjector);
    }

    /* renamed from: c */
    public static void m30780c(Service service) {
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof HasAndroidInjector)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), HasAndroidInjector.class.getCanonicalName()));
        }
        m30781d(service, (HasAndroidInjector) application);
    }

    /* renamed from: d */
    public static void m30781d(Object obj, HasAndroidInjector hasAndroidInjector) {
        AndroidInjector<Object> mo30786k1 = hasAndroidInjector.mo30786k1();
        Preconditions.m30794b(mo30786k1, "%s.androidInjector() returned null", hasAndroidInjector.getClass());
        mo30786k1.mo30782a(obj);
    }
}

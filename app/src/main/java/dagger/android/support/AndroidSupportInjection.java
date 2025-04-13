package dagger.android.support;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.internal.Preconditions;

/* loaded from: classes3.dex */
public final class AndroidSupportInjection {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m30789a(Fragment fragment) {
        HasAndroidInjector hasAndroidInjector;
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == 0) {
                FragmentActivity activity = fragment.getActivity();
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
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), hasAndroidInjector.getClass().getCanonicalName()));
        }
        AndroidInjector<Object> mo30786k1 = hasAndroidInjector.mo30786k1();
        Preconditions.m30794b(mo30786k1, "%s.androidInjector() returned null", hasAndroidInjector.getClass());
        mo30786k1.mo30782a(fragment);
    }
}

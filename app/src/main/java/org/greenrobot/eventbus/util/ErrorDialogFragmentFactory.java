package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;

/* loaded from: classes3.dex */
public abstract class ErrorDialogFragmentFactory<T> {

    @TargetApi
    public static class Honeycomb extends ErrorDialogFragmentFactory<Fragment> {
    }

    public static class Support extends ErrorDialogFragmentFactory<androidx.fragment.app.Fragment> {
    }
}

package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class BundleUtil {

    /* renamed from: a */
    @Nullable
    public static Method f14613a;

    /* renamed from: b */
    @Nullable
    public static Method f14614b;

    @Nullable
    /* renamed from: a */
    public static IBinder m7520a(Bundle bundle, @Nullable String str) {
        if (Util.f14736a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f14613a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f14613a = method2;
                method2.setAccessible(true);
                method = f14613a;
            } catch (NoSuchMethodException e2) {
                Log.m7587d("BundleUtil", "Failed to retrieve getIBinder method", e2);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            Log.m7587d("BundleUtil", "Failed to invoke getIBinder via reflection", e3);
            return null;
        }
    }

    /* renamed from: b */
    public static void m7521b(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Util.f14736a >= 18) {
            bundle.putBinder(str, iBinder);
            return;
        }
        Method method = f14614b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f14614b = method2;
                method2.setAccessible(true);
                method = f14614b;
            } catch (NoSuchMethodException e2) {
                Log.m7587d("BundleUtil", "Failed to retrieve putIBinder method", e2);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            Log.m7587d("BundleUtil", "Failed to invoke putIBinder via reflection", e3);
        }
    }
}

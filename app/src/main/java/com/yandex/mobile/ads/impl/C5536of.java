package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.of */
/* loaded from: classes3.dex */
public final class C5536of {

    /* renamed from: a */
    @Nullable
    private static Method f53263a;

    @Nullable
    /* renamed from: a */
    public static IBinder m27083a(Bundle bundle, @Nullable String str) {
        if (s91.f54530a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f53263a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f53263a = method2;
                method2.setAccessible(true);
                method = f53263a;
            } catch (NoSuchMethodException e2) {
                d90.m23836a("Failed to retrieve getIBinder method", (Exception) e2);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            d90.m23836a("Failed to invoke getIBinder via reflection", e3);
            return null;
        }
    }
}

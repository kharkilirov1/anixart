package com.yandex.mobile.ads.impl;

import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.common.MobileAds;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f0 */
/* loaded from: classes3.dex */
public final class C5052f0 {
    @Nullable
    /* renamed from: a */
    public static String m24285a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader());
            Intrinsics.m32178g(cls, "forName(\n        \"androi…ss.java.classLoader\n    )");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke = declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
            Intrinsics.m32177f(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable th) {
            n60.m26808a(th, "Failed to get process name", new Object[0]);
            return null;
        }
    }

    @RequiresApi
    @Nullable
    /* renamed from: b */
    public static String m24286b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader());
            Intrinsics.m32178g(cls, "forName(\n        \"androi…ss.java.classLoader\n    )");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.m32177f(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable th) {
            n60.m26808a(th, "Failed to get process name", new Object[0]);
            return null;
        }
    }
}

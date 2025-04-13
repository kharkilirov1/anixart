package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qi */
/* loaded from: classes3.dex */
public final class C5640qi {

    /* renamed from: a */
    @Nullable
    private final Method f54053a;

    /* renamed from: b */
    @Nullable
    private final Method f54054b;

    /* renamed from: c */
    @Nullable
    private final Method f54055c;

    /* renamed from: com.yandex.mobile.ads.impl.qi$a */
    public static final class a {
        @NotNull
        /* renamed from: a */
        public static C5640qi m27726a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C5640qi(method3, method2, method);
        }
    }

    public C5640qi(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f54053a = method;
        this.f54054b = method2;
        this.f54055c = method3;
    }

    @Nullable
    /* renamed from: a */
    public final Object m27724a() {
        Method method = this.f54053a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f54054b;
                Intrinsics.m32176e(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m27725a(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f54055c;
            Intrinsics.m32176e(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

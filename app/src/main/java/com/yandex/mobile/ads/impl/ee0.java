package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.mobile.ads.impl.de0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ee0 {

    /* renamed from: a */
    @Nullable
    private static volatile de0 f49937a;

    /* renamed from: a */
    private static de0 m24131a(Context context) {
        l01 l01Var = new l01();
        xz0 m29823b = xz0.m29823b();
        Intrinsics.m32178g(m29823b, "getInstance()");
        xv0 xv0Var = new xv0(l01Var, m29823b);
        IReporter m29198a = new C5907v9(xv0Var).m29198a(context);
        new dz0(m29198a, xv0Var).m23965a();
        return new de0(m29198a);
    }

    @JvmStatic
    @NotNull
    /* renamed from: b */
    public static final vv0 m24132b(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        if (f49937a == null) {
            int i2 = de0.f49639c;
            synchronized (de0.C4968a.m23877a()) {
                if (f49937a == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.m32178g(applicationContext, "applicationContext");
                    f49937a = m24131a(applicationContext);
                }
            }
        }
        de0 de0Var = f49937a;
        if (de0Var != null) {
            return de0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

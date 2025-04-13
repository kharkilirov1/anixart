package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.k10;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s9 */
/* loaded from: classes3.dex */
public final class C5732s9 {

    /* renamed from: a */
    @SuppressLint
    @Nullable
    private static volatile k10 f54526a;

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final k10 m28080a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        if (f54526a == null) {
            int i2 = k10.f51801i;
            synchronized (k10.C5314a.m26012a()) {
                if (f54526a == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.m32178g(applicationContext, "context.applicationContext");
                    f54526a = new k10(applicationContext);
                }
            }
        }
        k10 k10Var = f54526a;
        Intrinsics.m32176e(k10Var);
        return k10Var;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class do0 {

    /* renamed from: a */
    @Nullable
    private static volatile co0 f49721a;

    /* renamed from: b */
    @NotNull
    private static final Object f49722b = new Object();

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final co0 m23924a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        if (f49721a == null) {
            synchronized (f49722b) {
                if (f49721a == null) {
                    f49721a = new co0(r80.m27863a(context));
                }
            }
        }
        co0 co0Var = f49721a;
        if (co0Var != null) {
            return co0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

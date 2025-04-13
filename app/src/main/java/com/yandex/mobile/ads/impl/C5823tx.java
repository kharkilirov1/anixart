package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tx */
/* loaded from: classes3.dex */
public final class C5823tx {

    /* renamed from: a */
    @Nullable
    private static volatile C5767sx f55251a;

    /* renamed from: b */
    @NotNull
    private static final Object f55252b = new Object();

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C5767sx m28765a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        if (f55251a == null) {
            synchronized (f55252b) {
                if (f55251a == null) {
                    f55251a = new C5767sx(r80.m27863a(context));
                }
            }
        }
        C5767sx c5767sx = f55251a;
        if (c5767sx != null) {
            return c5767sx;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

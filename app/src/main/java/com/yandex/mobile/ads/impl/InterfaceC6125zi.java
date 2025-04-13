package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zi */
/* loaded from: classes3.dex */
public interface InterfaceC6125zi {

    /* renamed from: a */
    @NotNull
    public static final a f57198a = a.f57199a;

    /* renamed from: com.yandex.mobile.ads.impl.zi$a */
    public static final class a {

        /* renamed from: b */
        @Nullable
        private static volatile C4871bj f57200b;

        /* renamed from: a */
        public static final /* synthetic */ a f57199a = new a();

        /* renamed from: c */
        @NotNull
        private static final Object f57201c = new Object();

        private a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static InterfaceC6125zi m30191a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            if (f57200b == null) {
                synchronized (f57201c) {
                    if (f57200b == null) {
                        f57200b = C4812aj.m22528a(context);
                    }
                }
            }
            C4871bj c4871bj = f57200b;
            if (c4871bj != null) {
                return c4871bj;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}

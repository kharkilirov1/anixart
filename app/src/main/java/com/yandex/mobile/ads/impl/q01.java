package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface q01 {

    /* renamed from: a */
    @NotNull
    public static final C5613a f53884a = C5613a.f53885a;

    /* renamed from: com.yandex.mobile.ads.impl.q01$a */
    public static final class C5613a {

        /* renamed from: b */
        @Nullable
        private static volatile r01 f53886b;

        /* renamed from: a */
        public static final /* synthetic */ C5613a f53885a = new C5613a();

        /* renamed from: c */
        @NotNull
        private static final Object f53887c = new Object();

        private C5613a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static q01 m27593a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            if (f53886b == null) {
                synchronized (f53887c) {
                    if (f53886b == null) {
                        f53886b = new r01(r80.m27863a(context));
                    }
                }
            }
            r01 r01Var = f53886b;
            if (r01Var != null) {
                return r01Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Nullable
    /* renamed from: a */
    String mo27591a();

    /* renamed from: a */
    void mo27592a(@Nullable String str);
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class se1 {

    /* renamed from: c */
    @NotNull
    public static final C5744a f54656c = new C5744a(0);

    /* renamed from: d */
    @Nullable
    private static volatile se1 f54657d;

    /* renamed from: a */
    private final Context f54658a;

    /* renamed from: b */
    private final kw0 f54659b;

    /* renamed from: com.yandex.mobile.ads.impl.se1$a */
    public static final class C5744a {
        private C5744a() {
        }

        public /* synthetic */ C5744a(int i2) {
            this();
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final se1 m28240a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            se1 se1Var = se1.f54657d;
            if (se1Var == null) {
                synchronized (this) {
                    se1Var = se1.f54657d;
                    if (se1Var == null) {
                        se1Var = new se1(context, 0);
                        se1.f54657d = se1Var;
                    }
                }
            }
            return se1Var;
        }
    }

    private se1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f54658a = applicationContext;
        this.f54659b = xj1.m29762a(applicationContext, 4);
    }

    public /* synthetic */ se1(Context context, int i2) {
        this(context);
    }

    /* renamed from: a */
    public final void m28239a(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        this.f54659b.m26292a(vh1.m29226a(this.f54658a, url));
    }
}

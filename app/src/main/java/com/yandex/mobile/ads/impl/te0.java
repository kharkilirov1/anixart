package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class te0 {

    /* renamed from: e */
    @NotNull
    public static final C5798a f55096e = new C5798a(0);

    /* renamed from: f */
    @Nullable
    private static volatile te0 f55097f;

    /* renamed from: a */
    @NotNull
    private final Object f55098a = new Object();

    /* renamed from: b */
    private volatile boolean f55099b = true;

    /* renamed from: c */
    @NotNull
    private final C5831u0 f55100c = new C5831u0();

    /* renamed from: d */
    @NotNull
    private final rp0 f55101d = new rp0();

    /* renamed from: com.yandex.mobile.ads.impl.te0$a */
    public static final class C5798a {
        private C5798a() {
        }

        public /* synthetic */ C5798a(int i2) {
            this();
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final te0 m28644a() {
            te0 te0Var = te0.f55097f;
            if (te0Var == null) {
                synchronized (this) {
                    te0Var = te0.f55097f;
                    if (te0Var == null) {
                        te0Var = new te0();
                        te0.f55097f = te0Var;
                    }
                }
            }
            return te0Var;
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: b */
    public static final te0 m28642b() {
        return f55096e.m28644a();
    }

    /* renamed from: a */
    public final void m28643a(@NotNull Context context) throws d60 {
        Intrinsics.m32179h(context, "context");
        if (this.f55099b) {
            synchronized (this.f55098a) {
                if (this.f55099b) {
                    if (C5474n6.m26806a(context)) {
                        this.f55100c.m28811a(context);
                        Objects.requireNonNull(this.f55101d);
                        rp0.m27965a(context);
                    }
                    this.f55099b = false;
                }
            }
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d1 */
/* loaded from: classes3.dex */
public final class C4949d1 {

    /* renamed from: f */
    @NotNull
    private static final Object f49515f = new Object();

    /* renamed from: g */
    @Nullable
    private static volatile C4949d1 f49516g;

    /* renamed from: h */
    public static final /* synthetic */ int f49517h = 0;

    /* renamed from: a */
    @NotNull
    private final C5515ny f49518a;

    /* renamed from: b */
    @NotNull
    private final C5100g1 f49519b;

    /* renamed from: c */
    @NotNull
    private final C5053f1 f49520c;

    /* renamed from: d */
    private boolean f49521d;

    /* renamed from: e */
    @NotNull
    private final b f49522e;

    /* renamed from: com.yandex.mobile.ads.impl.d1$a */
    public static final class a {
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static C4949d1 m23756a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            if (C4949d1.f49516g == null) {
                synchronized (C4949d1.f49515f) {
                    if (C4949d1.f49516g == null) {
                        C4949d1.f49516g = new C4949d1(context);
                    }
                }
            }
            C4949d1 c4949d1 = C4949d1.f49516g;
            Intrinsics.m32176e(c4949d1);
            return c4949d1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.d1$b */
    public final class b implements InterfaceC4999e1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4999e1
        /* renamed from: a */
        public final void mo23757a() {
            Object obj = C4949d1.f49515f;
            C4949d1 c4949d1 = C4949d1.this;
            synchronized (obj) {
                c4949d1.f49521d = false;
            }
            C4949d1.this.f49520c.m24289a();
        }
    }

    public C4949d1(@NotNull Context context, @NotNull C5515ny hostAccessAdBlockerDetectionController, @NotNull C5100g1 adBlockerDetectorRequestPolicy, @NotNull C5053f1 adBlockerDetectorListenerRegistry) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(hostAccessAdBlockerDetectionController, "hostAccessAdBlockerDetectionController");
        Intrinsics.m32179h(adBlockerDetectorRequestPolicy, "adBlockerDetectorRequestPolicy");
        Intrinsics.m32179h(adBlockerDetectorListenerRegistry, "adBlockerDetectorListenerRegistry");
        this.f49518a = hostAccessAdBlockerDetectionController;
        this.f49519b = adBlockerDetectorRequestPolicy;
        this.f49520c = adBlockerDetectorListenerRegistry;
        this.f49522e = new b();
    }

    /* renamed from: a */
    public final void m23754a(@NotNull InterfaceC4999e1 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (f49515f) {
            this.f49520c.m24291b(listener);
        }
    }

    /* renamed from: b */
    public final void m23755b(@NotNull InterfaceC4999e1 listener) {
        Intrinsics.m32179h(listener, "listener");
        if (this.f49519b.m24762a()) {
            boolean z = false;
            synchronized (f49515f) {
                if (!this.f49521d) {
                    this.f49521d = true;
                    z = true;
                }
                this.f49520c.m24290a(listener);
            }
            if (z) {
                this.f49518a.m26962a(this.f49522e);
                return;
            }
            return;
        }
        listener.mo23757a();
    }

    public /* synthetic */ C4949d1(Context context) {
        this(context, new C5515ny(context), new C5100g1(context), new C5053f1());
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qk0 {

    /* renamed from: a */
    @NotNull
    private final xn0 f54070a;

    /* renamed from: b */
    @NotNull
    private final pk0 f54071b;

    /* renamed from: com.yandex.mobile.ads.impl.qk0$a */
    public static final class C5644a implements vn0 {

        /* renamed from: a */
        @NotNull
        private final InterfaceC5645b f54072a;

        public C5644a(@NotNull InterfaceC5645b listener) {
            Intrinsics.m32179h(listener, "listener");
            this.f54072a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.vn0
        /* renamed from: a */
        public final void mo22903a() {
            this.f54072a.mo22855a();
        }
    }

    @AnyThread
    /* renamed from: com.yandex.mobile.ads.impl.qk0$b */
    public interface InterfaceC5645b {
        /* renamed from: a */
        void mo22855a();
    }

    public qk0(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f54070a = new xn0(context);
        this.f54071b = new pk0();
    }

    /* renamed from: a */
    public final void m27748a(@NotNull kh0 nativeAdBlock, @NotNull InterfaceC5645b listener) {
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        Intrinsics.m32179h(listener, "listener");
        if (!this.f54071b.m27336a(nativeAdBlock)) {
            ((fk0) listener).mo22855a();
        } else {
            this.f54070a.m29777a(new C5644a(listener));
        }
    }

    /* renamed from: a */
    public final void m27747a() {
        this.f54070a.m29776a();
    }
}

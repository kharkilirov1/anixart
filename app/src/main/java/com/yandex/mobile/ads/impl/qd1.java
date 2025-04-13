package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qd1 {

    /* renamed from: a */
    @NotNull
    private final gf1 f54023a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC5632a f54024b;

    /* renamed from: c */
    @NotNull
    private final Handler f54025c;

    /* renamed from: d */
    private boolean f54026d;

    /* renamed from: e */
    private boolean f54027e;

    /* renamed from: com.yandex.mobile.ads.impl.qd1$a */
    public interface InterfaceC5632a {
        /* renamed from: a */
        void mo26849a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.qd1$b */
    public final class RunnableC5633b implements Runnable {
        public RunnableC5633b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qd1.this.f54026d || !qd1.this.f54023a.mo24877a()) {
                qd1.this.f54025c.postDelayed(this, 200L);
                return;
            }
            qd1.this.f54024b.mo26849a();
            qd1.this.f54026d = true;
            qd1.this.m27700b();
        }
    }

    public qd1(@NotNull gf1 renderValidator, @NotNull InterfaceC5632a renderingStartListener) {
        Intrinsics.m32179h(renderValidator, "renderValidator");
        Intrinsics.m32179h(renderingStartListener, "renderingStartListener");
        this.f54023a = renderValidator;
        this.f54024b = renderingStartListener;
        this.f54025c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void m27699a() {
        if (this.f54027e || this.f54026d) {
            return;
        }
        this.f54027e = true;
        this.f54025c.post(new RunnableC5633b());
    }

    /* renamed from: b */
    public final void m27700b() {
        this.f54025c.removeCallbacksAndMessages(null);
        this.f54027e = false;
    }
}

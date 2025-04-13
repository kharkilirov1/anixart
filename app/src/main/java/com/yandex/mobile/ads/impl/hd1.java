package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hd1 {

    /* renamed from: a */
    @NotNull
    private final sd1 f50910a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC5177a f50911b;

    /* renamed from: c */
    @NotNull
    private final Handler f50912c;

    /* renamed from: d */
    private boolean f50913d;

    /* renamed from: e */
    private boolean f50914e;

    /* renamed from: com.yandex.mobile.ads.impl.hd1$a */
    public interface InterfaceC5177a {
        /* renamed from: b */
        void mo25131b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.hd1$b */
    public final class RunnableC5178b implements Runnable {
        public RunnableC5178b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (hd1.this.f50913d || !hd1.this.f50910a.m28208a(rd1.f54286c)) {
                hd1.this.f50912c.postDelayed(this, 200L);
                return;
            }
            hd1.this.f50911b.mo25131b();
            hd1.this.f50913d = true;
            hd1.this.m25130b();
        }
    }

    public hd1(@NotNull sd1 statusController, @NotNull InterfaceC5177a preparedListener) {
        Intrinsics.m32179h(statusController, "statusController");
        Intrinsics.m32179h(preparedListener, "preparedListener");
        this.f50910a = statusController;
        this.f50911b = preparedListener;
        this.f50912c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void m25129a() {
        if (this.f50914e || this.f50913d) {
            return;
        }
        this.f50914e = true;
        this.f50912c.post(new RunnableC5178b());
    }

    /* renamed from: b */
    public final void m25130b() {
        this.f50912c.removeCallbacksAndMessages(null);
        this.f50914e = false;
    }
}

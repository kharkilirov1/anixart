package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class wu0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5992b f56274a;

    /* renamed from: b */
    @NonNull
    private final Handler f56275b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    @NonNull
    private final C5425m4 f56276c;

    /* renamed from: d */
    private boolean f56277d;

    /* renamed from: com.yandex.mobile.ads.impl.wu0$a */
    public final class RunnableC5991a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final C5425m4 f56278b;

        public RunnableC5991a(C5425m4 c5425m4) {
            this.f56278b = c5425m4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (wu0.this.f56277d) {
                return;
            }
            if (this.f56278b.m26566a()) {
                wu0.this.f56277d = true;
                ((zu0) wu0.this.f56274a).m30301a();
            } else {
                wu0 wu0Var = wu0.this;
                wu0Var.f56275b.postDelayed(wu0Var.new RunnableC5991a(this.f56278b), 300L);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wu0$b */
    public interface InterfaceC5992b {
    }

    public wu0(@NonNull C5425m4 c5425m4, @NonNull InterfaceC5992b interfaceC5992b) {
        this.f56274a = interfaceC5992b;
        this.f56276c = c5425m4;
    }

    /* renamed from: a */
    public final void m29571a() {
        this.f56275b.post(new RunnableC5991a(this.f56276c));
    }

    /* renamed from: b */
    public final void m29572b() {
        this.f56275b.removeCallbacksAndMessages(null);
    }
}

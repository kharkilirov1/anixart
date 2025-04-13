package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class md1 {

    /* renamed from: a */
    @NonNull
    private final cd1 f52647a;

    /* renamed from: b */
    @NonNull
    private final jd1 f52648b;

    /* renamed from: c */
    @NonNull
    private final Handler f52649c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f52650d;

    /* renamed from: com.yandex.mobile.ads.impl.md1$a */
    public class RunnableC5436a implements Runnable {
        private RunnableC5436a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = md1.this.f52647a.getAdPosition();
            md1.this.f52648b.mo22386a(md1.this.f52647a.mo23232d(), adPosition);
            if (md1.this.f52650d) {
                md1.this.f52649c.postDelayed(this, 200L);
            }
        }

        public /* synthetic */ RunnableC5436a(md1 md1Var, int i2) {
            this();
        }
    }

    public md1(@NonNull cd1 cd1Var, @NonNull jd1 jd1Var) {
        this.f52647a = cd1Var;
        this.f52648b = jd1Var;
    }

    /* renamed from: a */
    public final void m26627a() {
        if (this.f52650d) {
            return;
        }
        this.f52650d = true;
        this.f52648b.mo25871a();
        this.f52649c.post(new RunnableC5436a(this, 0));
    }

    /* renamed from: b */
    public final void m26628b() {
        if (this.f52650d) {
            this.f52648b.mo25874b();
            this.f52649c.removeCallbacksAndMessages(null);
            this.f52650d = false;
        }
    }
}

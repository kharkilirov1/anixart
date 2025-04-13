package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6153e;

/* loaded from: classes3.dex */
public final class ef1 {

    /* renamed from: a */
    @NonNull
    private final Handler f49952a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final C6153e f49953b;

    /* renamed from: c */
    @Nullable
    private rs0 f49954c;

    /* renamed from: d */
    private boolean f49955d;

    /* renamed from: com.yandex.mobile.ads.impl.ef1$a */
    public class RunnableC5023a implements Runnable {
        private RunnableC5023a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long m30395c = ef1.this.f49953b.m30395c();
            if (ef1.this.f49954c != null) {
                ((gr0) ef1.this.f49954c).m24961a(m30395c);
            }
            if (ef1.this.f49955d) {
                ef1.this.f49952a.postDelayed(this, 200L);
            }
        }

        public /* synthetic */ RunnableC5023a(ef1 ef1Var, int i2) {
            this();
        }
    }

    public ef1(@NonNull C6153e c6153e) {
        this.f49953b = c6153e;
    }

    /* renamed from: a */
    public final void m24142a(@Nullable rs0 rs0Var) {
        this.f49954c = rs0Var;
    }

    /* renamed from: b */
    public final void m24143b() {
        if (this.f49955d) {
            this.f49952a.removeCallbacksAndMessages(null);
            this.f49955d = false;
        }
    }

    /* renamed from: a */
    public final void m24141a() {
        if (this.f49955d) {
            return;
        }
        this.f49955d = true;
        this.f49952a.post(new RunnableC5023a(this, 0));
    }
}

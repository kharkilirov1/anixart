package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class lp0 {

    /* renamed from: a */
    @NonNull
    private final Handler f52482a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private int f52483b = 1;

    /* renamed from: c */
    @Nullable
    private mp0 f52484c;

    /* renamed from: d */
    @Nullable
    private n61 f52485d;

    /* renamed from: e */
    private long f52486e;

    /* renamed from: f */
    private long f52487f;

    /* renamed from: g */
    private final boolean f52488g;

    /* renamed from: com.yandex.mobile.ads.impl.lp0$a */
    public class RunnableC5408a implements Runnable {
        private RunnableC5408a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lp0.m26509a(lp0.this);
            lp0.this.m26511c();
        }

        public /* synthetic */ RunnableC5408a(lp0 lp0Var, int i2) {
            this();
        }
    }

    public lp0(boolean z) {
        this.f52488g = z;
    }

    /* renamed from: a */
    public static void m26509a(lp0 lp0Var) {
        Objects.requireNonNull(lp0Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - lp0Var.f52487f;
        lp0Var.f52487f = elapsedRealtime;
        long j3 = lp0Var.f52486e - j2;
        lp0Var.f52486e = j3;
        n61 n61Var = lp0Var.f52485d;
        if (n61Var != null) {
            n61Var.mo26253a(Math.max(0L, j3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m26511c() {
        this.f52483b = 2;
        this.f52487f = SystemClock.elapsedRealtime();
        long min = Math.min(200L, this.f52486e);
        if (min > 0) {
            this.f52482a.postDelayed(new RunnableC5408a(this, 0), min);
            return;
        }
        mp0 mp0Var = this.f52484c;
        if (mp0Var != null) {
            mp0Var.mo24218a();
        }
        m26513a();
    }

    /* renamed from: d */
    public final void m26517d() {
        if (C5782t5.m28464a(3, this.f52483b)) {
            m26511c();
        }
    }

    /* renamed from: b */
    public final void m26516b() {
        if (C5782t5.m28464a(2, this.f52483b)) {
            this.f52483b = 3;
            this.f52482a.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f52487f;
            this.f52487f = elapsedRealtime;
            long j3 = this.f52486e - j2;
            this.f52486e = j3;
            n61 n61Var = this.f52485d;
            if (n61Var != null) {
                n61Var.mo26253a(Math.max(0L, j3));
            }
        }
    }

    /* renamed from: a */
    public final void m26514a(long j2, @Nullable mp0 mp0Var) {
        m26513a();
        this.f52484c = mp0Var;
        this.f52486e = j2;
        if (this.f52488g) {
            this.f52482a.post(new gp1(this, 9));
        } else {
            m26511c();
        }
    }

    /* renamed from: a */
    public final void m26513a() {
        if (C5782t5.m28464a(1, this.f52483b)) {
            return;
        }
        this.f52483b = 1;
        this.f52484c = null;
        this.f52482a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m26515a(@Nullable n61 n61Var) {
        this.f52485d = n61Var;
    }
}

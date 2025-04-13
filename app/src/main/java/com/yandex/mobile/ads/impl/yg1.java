package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class yg1<T> implements id1, kd1 {

    /* renamed from: a */
    @NonNull
    private final hc1<T> f56843a;

    /* renamed from: b */
    @NonNull
    private final cg1 f56844b;

    /* renamed from: c */
    @NonNull
    private final sd1 f56845c;

    /* renamed from: d */
    @NonNull
    private final tf1 f56846d;

    /* renamed from: e */
    @NonNull
    private final sc1<T> f56847e;

    /* renamed from: f */
    @Nullable
    private Long f56848f;

    /* renamed from: g */
    private boolean f56849g;

    public yg1(@NonNull hc1<T> hc1Var, @NonNull ag1 ag1Var, @NonNull sd1 sd1Var, @NonNull tf1 tf1Var, @NonNull sc1<T> sc1Var) {
        this.f56843a = hc1Var;
        this.f56844b = new cg1(ag1Var);
        this.f56845c = sd1Var;
        this.f56846d = tf1Var;
        this.f56847e = sc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.kd1
    /* renamed from: a */
    public final void mo25871a() {
        this.f56848f = null;
    }

    @Override // com.yandex.mobile.ads.impl.kd1
    /* renamed from: b */
    public final void mo25874b() {
        this.f56848f = null;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        boolean m23259a = this.f56844b.m23259a();
        if (this.f56849g) {
            return;
        }
        if (!m23259a || this.f56845c.m28207a() != rd1.f54287d) {
            this.f56848f = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l2 = this.f56848f;
        if (l2 == null) {
            this.f56848f = Long.valueOf(elapsedRealtime);
            this.f56847e.mo24938k(this.f56843a);
        } else if (elapsedRealtime - l2.longValue() >= 2000) {
            this.f56849g = true;
            this.f56847e.mo24937j(this.f56843a);
            this.f56846d.mo25521n();
        }
    }
}

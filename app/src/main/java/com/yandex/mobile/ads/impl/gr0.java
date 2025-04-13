package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class gr0 implements rs0 {

    /* renamed from: a */
    @NonNull
    private final ef1 f50713a;

    /* renamed from: b */
    @NonNull
    private final iu0 f50714b;

    /* renamed from: c */
    @NonNull
    private final hu0 f50715c;

    /* renamed from: d */
    @NonNull
    private final ir0 f50716d;

    /* renamed from: e */
    private boolean f50717e;

    public gr0(@NonNull ef1 ef1Var, @NonNull iu0 iu0Var, @NonNull hu0 hu0Var, @NonNull ir0 ir0Var) {
        this.f50713a = ef1Var;
        this.f50714b = iu0Var;
        this.f50715c = hu0Var;
        this.f50716d = ir0Var;
    }

    /* renamed from: a */
    public final void m24960a() {
        if (this.f50717e) {
            return;
        }
        this.f50717e = true;
        this.f50713a.m24142a(this);
        this.f50713a.m24141a();
    }

    /* renamed from: b */
    public final void m24962b() {
        if (this.f50717e) {
            this.f50713a.m24142a((rs0) null);
            this.f50713a.m24143b();
            this.f50717e = false;
        }
    }

    /* renamed from: a */
    public final void m24961a(long j2) {
        m50 m25373a = this.f50715c.m25373a(j2);
        if (m25373a != null) {
            ((ge0) this.f50716d).m24859a(m25373a);
            return;
        }
        m50 m25736a = this.f50714b.m25736a(j2);
        if (m25736a != null) {
            ((ge0) this.f50716d).m24863b(m25736a);
        }
    }
}

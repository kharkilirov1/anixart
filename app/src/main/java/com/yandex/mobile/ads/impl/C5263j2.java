package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.j2 */
/* loaded from: classes3.dex */
public final class C5263j2 {

    /* renamed from: a */
    private final tl1 f51480a;

    private C5263j2(tl1 tl1Var) {
        this.f51480a = tl1Var;
    }

    /* renamed from: a */
    public static C5263j2 m25761a(tl1 tl1Var) {
        if (tl1Var.m28682i().m28894c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (tl1Var.m28683j()) {
            throw new IllegalStateException("AdSession is finished");
        }
        C5263j2 c5263j2 = new C5263j2(tl1Var);
        tl1Var.m28682i().m28887a(c5263j2);
        return c5263j2;
    }

    /* renamed from: a */
    public final void m25762a() {
        if (!this.f51480a.m28683j()) {
            if (this.f51480a.m28684k()) {
                if (!this.f51480a.m28679f()) {
                    try {
                        this.f51480a.mo27168b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f51480a.m28679f()) {
                    this.f51480a.m28677d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: a */
    public final void m25763a(@NonNull oa1 oa1Var) {
        xm1.m29768a(this.f51480a);
        if (this.f51480a.m28684k()) {
            this.f51480a.m28675a(oa1Var.m27061a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}

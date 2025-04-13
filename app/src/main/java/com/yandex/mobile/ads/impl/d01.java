package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g81;

/* loaded from: classes3.dex */
public final class d01 implements g81 {

    /* renamed from: a */
    private final c01 f49509a;

    /* renamed from: b */
    private final ap0 f49510b = new ap0(32);

    /* renamed from: c */
    private int f49511c;

    /* renamed from: d */
    private int f49512d;

    /* renamed from: e */
    private boolean f49513e;

    /* renamed from: f */
    private boolean f49514f;

    public d01(c01 c01Var) {
        this.f49509a = c01Var;
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23748a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        this.f49509a.mo22999a(p61Var, interfaceC5509nt, c5112d);
        this.f49514f = true;
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23746a() {
        this.f49514f = true;
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23747a(int i2, ap0 ap0Var) {
        boolean z = (i2 & 1) != 0;
        int m22607t = z ? ap0Var.m22607t() + ap0Var.m22588d() : -1;
        if (this.f49514f) {
            if (!z) {
                return;
            }
            this.f49514f = false;
            ap0Var.m22591e(m22607t);
            this.f49512d = 0;
        }
        while (ap0Var.m22579a() > 0) {
            int i3 = this.f49512d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int m22607t2 = ap0Var.m22607t();
                    ap0Var.m22591e(ap0Var.m22588d() - 1);
                    if (m22607t2 == 255) {
                        this.f49514f = true;
                        return;
                    }
                }
                int min = Math.min(ap0Var.m22579a(), 3 - this.f49512d);
                ap0Var.m22583a(this.f49510b.m22587c(), this.f49512d, min);
                int i4 = this.f49512d + min;
                this.f49512d = i4;
                if (i4 == 3) {
                    this.f49510b.m22591e(0);
                    this.f49510b.m22589d(3);
                    this.f49510b.m22593f(1);
                    int m22607t3 = this.f49510b.m22607t();
                    int m22607t4 = this.f49510b.m22607t();
                    this.f49513e = (m22607t3 & 128) != 0;
                    this.f49511c = (((m22607t3 & 15) << 8) | m22607t4) + 3;
                    int m22584b = this.f49510b.m22584b();
                    int i5 = this.f49511c;
                    if (m22584b < i5) {
                        this.f49510b.m22581a(Math.min(4098, Math.max(i5, this.f49510b.m22584b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ap0Var.m22579a(), this.f49511c - this.f49512d);
                ap0Var.m22583a(this.f49510b.m22587c(), this.f49512d, min2);
                int i6 = this.f49512d + min2;
                this.f49512d = i6;
                int i7 = this.f49511c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f49513e) {
                        if (s91.m28089a(this.f49511c, this.f49510b.m22587c()) != 0) {
                            this.f49514f = true;
                            return;
                        }
                        this.f49510b.m22589d(this.f49511c - 4);
                    } else {
                        this.f49510b.m22589d(i7);
                    }
                    this.f49510b.m22591e(0);
                    this.f49509a.mo22998a(this.f49510b);
                    this.f49512d = 0;
                }
            }
        }
    }
}

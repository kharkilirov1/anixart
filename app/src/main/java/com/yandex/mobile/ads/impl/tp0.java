package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.g81;

/* loaded from: classes3.dex */
public final class tp0 implements g81 {

    /* renamed from: a */
    private final InterfaceC4936cr f55171a;

    /* renamed from: b */
    private final zo0 f55172b = new zo0(new byte[10]);

    /* renamed from: c */
    private int f55173c = 0;

    /* renamed from: d */
    private int f55174d;

    /* renamed from: e */
    private p61 f55175e;

    /* renamed from: f */
    private boolean f55176f;

    /* renamed from: g */
    private boolean f55177g;

    /* renamed from: h */
    private boolean f55178h;

    /* renamed from: i */
    private int f55179i;

    /* renamed from: j */
    private int f55180j;

    /* renamed from: k */
    private boolean f55181k;

    /* renamed from: l */
    private long f55182l;

    public tp0(InterfaceC4936cr interfaceC4936cr) {
        this.f55171a = interfaceC4936cr;
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23748a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        this.f55175e = p61Var;
        this.f55171a.mo22655a(interfaceC5509nt, c5112d);
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23746a() {
        this.f55173c = 0;
        this.f55174d = 0;
        this.f55178h = false;
        this.f55171a.mo22652a();
    }

    @Override // com.yandex.mobile.ads.impl.g81
    /* renamed from: a */
    public final void mo23747a(int i2, ap0 ap0Var) throws ep0 {
        boolean z;
        C5220ia.m25474b(this.f55175e);
        int i3 = 2;
        int i4 = 3;
        int i5 = -1;
        int i6 = 0;
        if ((i2 & 1) != 0) {
            int i7 = this.f55173c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    d90.m23842d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i7 == 3) {
                    if (this.f55180j != -1) {
                        StringBuilder m26356a = l60.m26356a("Unexpected start indicator: expected ");
                        m26356a.append(this.f55180j);
                        m26356a.append(" more bytes");
                        d90.m23842d("PesReader", m26356a.toString());
                    }
                    this.f55171a.mo22656b();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f55173c = 1;
            this.f55174d = 0;
        }
        int i8 = i2;
        while (ap0Var.m22579a() > 0) {
            int i9 = this.f55173c;
            if (i9 == 0) {
                ap0Var.m22593f(ap0Var.m22579a());
            } else if (i9 != 1) {
                if (i9 != i3) {
                    if (i9 == i4) {
                        int m22579a = ap0Var.m22579a();
                        int i10 = this.f55180j;
                        int i11 = i10 == i5 ? 0 : m22579a - i10;
                        if (i11 > 0) {
                            m22579a -= i11;
                            ap0Var.m22589d(ap0Var.m22588d() + m22579a);
                        }
                        this.f55171a.mo22654a(ap0Var);
                        int i12 = this.f55180j;
                        if (i12 != i5) {
                            int i13 = i12 - m22579a;
                            this.f55180j = i13;
                            if (i13 == 0) {
                                this.f55171a.mo22656b();
                                this.f55173c = 1;
                                this.f55174d = i6;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m28696a(Math.min(10, this.f55179i), ap0Var, this.f55172b.f57274a) && m28696a(this.f55179i, ap0Var, (byte[]) null)) {
                    this.f55172b.m30255c(i6);
                    this.f55182l = -9223372036854775807L;
                    if (this.f55176f) {
                        this.f55172b.m30257d(4);
                        this.f55172b.m30257d(1);
                        this.f55172b.m30257d(1);
                        long m30252b = (this.f55172b.m30252b(15) << 15) | (this.f55172b.m30252b(i4) << 30) | this.f55172b.m30252b(15);
                        this.f55172b.m30257d(1);
                        if (!this.f55178h && this.f55177g) {
                            this.f55172b.m30257d(4);
                            this.f55172b.m30257d(1);
                            this.f55172b.m30257d(1);
                            this.f55172b.m30257d(1);
                            this.f55175e.m27173b((this.f55172b.m30252b(15) << 15) | (this.f55172b.m30252b(i4) << 30) | this.f55172b.m30252b(15));
                            this.f55178h = true;
                        }
                        this.f55182l = this.f55175e.m27173b(m30252b);
                    }
                    i8 |= this.f55181k ? 4 : 0;
                    this.f55171a.mo22653a(i8, this.f55182l);
                    this.f55173c = 3;
                    this.f55174d = 0;
                }
            } else if (m28696a(9, ap0Var, this.f55172b.f57274a)) {
                this.f55172b.m30255c(0);
                int m30252b2 = this.f55172b.m30252b(24);
                if (m30252b2 != 1) {
                    c80.m23073a("Unexpected start code prefix: ", m30252b2, "PesReader");
                    this.f55180j = -1;
                    z = false;
                } else {
                    this.f55172b.m30257d(8);
                    int m30252b3 = this.f55172b.m30252b(16);
                    this.f55172b.m30257d(5);
                    this.f55181k = this.f55172b.m30260f();
                    this.f55172b.m30257d(2);
                    this.f55176f = this.f55172b.m30260f();
                    this.f55177g = this.f55172b.m30260f();
                    this.f55172b.m30257d(6);
                    int m30252b4 = this.f55172b.m30252b(8);
                    this.f55179i = m30252b4;
                    if (m30252b3 == 0) {
                        this.f55180j = -1;
                    } else {
                        int i14 = ((m30252b3 + 6) - 9) - m30252b4;
                        this.f55180j = i14;
                        if (i14 < 0) {
                            StringBuilder m26356a2 = l60.m26356a("Found negative packet payload size: ");
                            m26356a2.append(this.f55180j);
                            d90.m23842d("PesReader", m26356a2.toString());
                            this.f55180j = -1;
                            z = true;
                        }
                    }
                    z = true;
                }
                this.f55173c = z ? 2 : 0;
                this.f55174d = 0;
            }
            i3 = 2;
            i4 = 3;
            i5 = -1;
            i6 = 0;
        }
    }

    /* renamed from: a */
    private boolean m28696a(int i2, ap0 ap0Var, @Nullable byte[] bArr) {
        int min = Math.min(ap0Var.m22579a(), i2 - this.f55174d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ap0Var.m22593f(min);
        } else {
            ap0Var.m22583a(bArr, this.f55174d, min);
        }
        int i3 = this.f55174d + min;
        this.f55174d = i3;
        return i3 == i2;
    }
}

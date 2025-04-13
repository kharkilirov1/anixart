package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;

/* loaded from: classes3.dex */
public final class f10 implements InterfaceC4936cr {

    /* renamed from: b */
    private y61 f50088b;

    /* renamed from: c */
    private boolean f50089c;

    /* renamed from: e */
    private int f50091e;

    /* renamed from: f */
    private int f50092f;

    /* renamed from: a */
    private final ap0 f50087a = new ap0(10);

    /* renamed from: d */
    private long f50090d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f50089c = false;
        this.f50090d = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
        int i2;
        C5220ia.m25474b(this.f50088b);
        if (this.f50089c && (i2 = this.f50091e) != 0 && this.f50092f == i2) {
            long j2 = this.f50090d;
            if (j2 != -9223372036854775807L) {
                this.f50088b.mo28346a(j2, 1, i2, 0, null);
            }
            this.f50089c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 5);
        this.f50088b = mo23022a;
        mo23022a.mo28347a(new C5606pv.a().m27555c(c5112d.m24822b()).m27561f("application/id3").m27550a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f50089c = true;
        if (j2 != -9223372036854775807L) {
            this.f50090d = j2;
        }
        this.f50091e = 0;
        this.f50092f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22654a(ap0 ap0Var) {
        C5220ia.m25474b(this.f50088b);
        if (this.f50089c) {
            int m22579a = ap0Var.m22579a();
            int i2 = this.f50092f;
            if (i2 < 10) {
                int min = Math.min(m22579a, 10 - i2);
                System.arraycopy(ap0Var.m22587c(), ap0Var.m22588d(), this.f50087a.m22587c(), this.f50092f, min);
                if (this.f50092f + min == 10) {
                    this.f50087a.m22591e(0);
                    if (73 == this.f50087a.m22607t() && 68 == this.f50087a.m22607t() && 51 == this.f50087a.m22607t()) {
                        this.f50087a.m22593f(3);
                        this.f50091e = this.f50087a.m22606s() + 10;
                    } else {
                        d90.m23842d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f50089c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(m22579a, this.f50091e - this.f50092f);
            this.f50088b.mo28345a(min2, ap0Var);
            this.f50092f += min2;
        }
    }
}

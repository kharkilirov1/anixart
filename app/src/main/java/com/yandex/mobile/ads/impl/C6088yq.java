package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.yq */
/* loaded from: classes3.dex */
public final class C6088yq implements InterfaceC4936cr {

    /* renamed from: a */
    private final List<g81.C5109a> f56911a;

    /* renamed from: b */
    private final y61[] f56912b;

    /* renamed from: c */
    private boolean f56913c;

    /* renamed from: d */
    private int f56914d;

    /* renamed from: e */
    private int f56915e;

    /* renamed from: f */
    private long f56916f = -9223372036854775807L;

    public C6088yq(List<g81.C5109a> list) {
        this.f56911a = list;
        this.f56912b = new y61[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f56913c = false;
        this.f56916f = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
        if (this.f56913c) {
            if (this.f56916f != -9223372036854775807L) {
                for (y61 y61Var : this.f56912b) {
                    y61Var.mo28346a(this.f56916f, 1, this.f56915e, 0, null);
                }
            }
            this.f56913c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        for (int i2 = 0; i2 < this.f56912b.length; i2++) {
            g81.C5109a c5109a = this.f56911a.get(i2);
            c5112d.m24821a();
            y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 3);
            mo23022a.mo28347a(new C5606pv.a().m27555c(c5112d.m24822b()).m27561f("application/dvbsubs").m27548a(Collections.singletonList(c5109a.f50527b)).m27559e(c5109a.f50526a).m27550a());
            this.f56912b[i2] = mo23022a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f56913c = true;
        if (j2 != -9223372036854775807L) {
            this.f56916f = j2;
        }
        this.f56915e = 0;
        this.f56914d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22654a(ap0 ap0Var) {
        boolean z;
        boolean z2;
        if (this.f56913c) {
            if (this.f56914d == 2) {
                if (ap0Var.m22579a() == 0) {
                    z2 = false;
                } else {
                    if (ap0Var.m22607t() != 32) {
                        this.f56913c = false;
                    }
                    this.f56914d--;
                    z2 = this.f56913c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f56914d == 1) {
                if (ap0Var.m22579a() == 0) {
                    z = false;
                } else {
                    if (ap0Var.m22607t() != 0) {
                        this.f56913c = false;
                    }
                    this.f56914d--;
                    z = this.f56913c;
                }
                if (!z) {
                    return;
                }
            }
            int m22588d = ap0Var.m22588d();
            int m22579a = ap0Var.m22579a();
            for (y61 y61Var : this.f56912b) {
                ap0Var.m22591e(m22588d);
                y61Var.mo28345a(m22579a, ap0Var);
            }
            this.f56915e += m22579a;
        }
    }
}

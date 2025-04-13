package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.g81;

/* loaded from: classes3.dex */
public final class ef0 implements InterfaceC4936cr {

    /* renamed from: a */
    private final ap0 f49940a;

    /* renamed from: b */
    private final ff0.C5076a f49941b;

    /* renamed from: c */
    @Nullable
    private final String f49942c;

    /* renamed from: d */
    private y61 f49943d;

    /* renamed from: e */
    private String f49944e;

    /* renamed from: f */
    private int f49945f = 0;

    /* renamed from: g */
    private int f49946g;

    /* renamed from: h */
    private boolean f49947h;

    /* renamed from: i */
    private boolean f49948i;

    /* renamed from: j */
    private long f49949j;

    /* renamed from: k */
    private int f49950k;

    /* renamed from: l */
    private long f49951l;

    public ef0(@Nullable String str) {
        ap0 ap0Var = new ap0(4);
        this.f49940a = ap0Var;
        ap0Var.m22587c()[0] = -1;
        this.f49941b = new ff0.C5076a();
        this.f49951l = -9223372036854775807L;
        this.f49942c = str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f49945f = 0;
        this.f49946g = 0;
        this.f49948i = false;
        this.f49951l = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f49944e = c5112d.m24822b();
        this.f49943d = interfaceC5509nt.mo23022a(c5112d.m24823c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f49951l = j2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22654a(ap0 ap0Var) {
        C5220ia.m25474b(this.f49943d);
        while (ap0Var.m22579a() > 0) {
            int i2 = this.f49945f;
            if (i2 == 0) {
                byte[] m22587c = ap0Var.m22587c();
                int m22588d = ap0Var.m22588d();
                int m22590e = ap0Var.m22590e();
                while (true) {
                    if (m22588d < m22590e) {
                        byte b = m22587c[m22588d];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f49948i && (b & 224) == 224;
                        this.f49948i = z;
                        if (z2) {
                            ap0Var.m22591e(m22588d + 1);
                            this.f49948i = false;
                            this.f49940a.m22587c()[1] = m22587c[m22588d];
                            this.f49946g = 2;
                            this.f49945f = 1;
                            break;
                        }
                        m22588d++;
                    } else {
                        ap0Var.m22591e(m22590e);
                        break;
                    }
                }
            } else if (i2 == 1) {
                int min = Math.min(ap0Var.m22579a(), 4 - this.f49946g);
                ap0Var.m22583a(this.f49940a.m22587c(), this.f49946g, min);
                int i3 = this.f49946g + min;
                this.f49946g = i3;
                if (i3 >= 4) {
                    this.f49940a.m22591e(0);
                    if (!this.f49941b.m24582a(this.f49940a.m22595h())) {
                        this.f49946g = 0;
                        this.f49945f = 1;
                    } else {
                        this.f49950k = this.f49941b.f50247c;
                        if (!this.f49947h) {
                            this.f49949j = (r0.f50251g * 1000000) / r0.f50248d;
                            this.f49943d.mo28347a(new C5606pv.a().m27555c(this.f49944e).m27561f(this.f49941b.f50246b).m27564i(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT).m27554c(this.f49941b.f50249e).m27569n(this.f49941b.f50248d).m27559e(this.f49942c).m27550a());
                            this.f49947h = true;
                        }
                        this.f49940a.m22591e(0);
                        this.f49943d.mo28345a(4, this.f49940a);
                        this.f49945f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(ap0Var.m22579a(), this.f49950k - this.f49946g);
                this.f49943d.mo28345a(min2, ap0Var);
                int i4 = this.f49946g + min2;
                this.f49946g = i4;
                int i5 = this.f49950k;
                if (i4 >= i5) {
                    long j2 = this.f49951l;
                    if (j2 != -9223372036854775807L) {
                        this.f49943d.mo28346a(j2, 1, i5, 0, null);
                        this.f49951l += this.f49949j;
                    }
                    this.f49946g = 0;
                    this.f49945f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}

package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.fe */
/* loaded from: classes3.dex */
public abstract class AbstractC5074fe implements cv0, dv0 {

    /* renamed from: b */
    private final int f50214b;

    /* renamed from: d */
    @Nullable
    private ev0 f50216d;

    /* renamed from: e */
    private int f50217e;

    /* renamed from: f */
    private uq0 f50218f;

    /* renamed from: g */
    private int f50219g;

    /* renamed from: h */
    @Nullable
    private uy0 f50220h;

    /* renamed from: i */
    @Nullable
    private C5606pv[] f50221i;

    /* renamed from: j */
    private long f50222j;

    /* renamed from: l */
    private boolean f50224l;

    /* renamed from: m */
    private boolean f50225m;

    /* renamed from: c */
    private final C5658qv f50215c = new C5658qv();

    /* renamed from: k */
    private long f50223k = Long.MIN_VALUE;

    public AbstractC5074fe(int i2) {
        this.f50214b = i2;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public /* synthetic */ void mo23519a(float f2, float f3) {
        zn1.m30234a(this, f2, f3);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo23520a(int i2, uq0 uq0Var) {
        this.f50217e = i2;
        this.f50218f = uq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.vq0.InterfaceC5936b
    /* renamed from: a */
    public void mo24074a(int i2, @Nullable Object obj) throws C5043es {
    }

    /* renamed from: a */
    public abstract void mo22245a(long j2, boolean z) throws C5043es;

    /* renamed from: a */
    public void mo24080a(boolean z, boolean z2) throws C5043es {
    }

    /* renamed from: a */
    public abstract void mo22246a(C5606pv[] c5606pvArr, long j2, long j3) throws C5043es;

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: b */
    public final void mo23524b() {
        C5220ia.m25476b(this.f50219g == 1);
        C5658qv c5658qv = this.f50215c;
        c5658qv.f54139a = null;
        c5658qv.f54140b = null;
        this.f50219g = 0;
        this.f50220h = null;
        this.f50221i = null;
        this.f50224l = false;
        mo22249u();
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: c */
    public final int mo23525c() {
        return this.f50219g;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: e */
    public final boolean mo23526e() {
        return this.f50223k == Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.dv0
    /* renamed from: f */
    public int mo23944f() throws C5043es {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    @Nullable
    /* renamed from: g */
    public final uy0 mo23527g() {
        return this.f50220h;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: h */
    public final void mo23528h() {
        this.f50224l = true;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: i */
    public final void mo23529i() throws IOException {
        uy0 uy0Var = this.f50220h;
        Objects.requireNonNull(uy0Var);
        uy0Var.mo23273a();
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: j */
    public final long mo23530j() {
        return this.f50223k;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: k */
    public final boolean mo23531k() {
        return this.f50224l;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    @Nullable
    /* renamed from: l */
    public ra0 mo23532l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: m */
    public final int mo23533m() {
        return this.f50214b;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: n */
    public final AbstractC5074fe mo23534n() {
        return this;
    }

    /* renamed from: p */
    public final ev0 m24563p() {
        ev0 ev0Var = this.f50216d;
        Objects.requireNonNull(ev0Var);
        return ev0Var;
    }

    /* renamed from: q */
    public final C5658qv m24564q() {
        C5658qv c5658qv = this.f50215c;
        c5658qv.f54139a = null;
        c5658qv.f54140b = null;
        return c5658qv;
    }

    /* renamed from: r */
    public final uq0 m24565r() {
        uq0 uq0Var = this.f50218f;
        Objects.requireNonNull(uq0Var);
        return uq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    public final void reset() {
        C5220ia.m25476b(this.f50219g == 0);
        C5658qv c5658qv = this.f50215c;
        c5658qv.f54139a = null;
        c5658qv.f54140b = null;
        mo24087v();
    }

    /* renamed from: s */
    public final C5606pv[] m24566s() {
        C5606pv[] c5606pvArr = this.f50221i;
        Objects.requireNonNull(c5606pvArr);
        return c5606pvArr;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    public final void start() throws C5043es {
        C5220ia.m25476b(this.f50219g == 1);
        this.f50219g = 2;
        mo24088w();
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    public final void stop() {
        C5220ia.m25476b(this.f50219g == 2);
        this.f50219g = 1;
        mo24089x();
    }

    /* renamed from: t */
    public final boolean m24567t() {
        if (mo23526e()) {
            return this.f50224l;
        }
        uy0 uy0Var = this.f50220h;
        Objects.requireNonNull(uy0Var);
        return uy0Var.mo23275d();
    }

    /* renamed from: u */
    public abstract void mo22249u();

    /* renamed from: v */
    public void mo24087v() {
    }

    /* renamed from: w */
    public void mo24088w() throws C5043es {
    }

    /* renamed from: x */
    public void mo24089x() {
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo23522a(ev0 ev0Var, C5606pv[] c5606pvArr, uy0 uy0Var, long j2, boolean z, boolean z2, long j3, long j4) throws C5043es {
        C5220ia.m25476b(this.f50219g == 0);
        this.f50216d = ev0Var;
        this.f50219g = 1;
        mo24080a(z, z2);
        mo23523a(c5606pvArr, uy0Var, j3, j4);
        this.f50224l = false;
        this.f50223k = j2;
        mo22245a(j2, z);
    }

    /* renamed from: b */
    public final int m24562b(long j2) {
        uy0 uy0Var = this.f50220h;
        Objects.requireNonNull(uy0Var);
        return uy0Var.mo23271a(j2 - this.f50222j);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo23523a(C5606pv[] c5606pvArr, uy0 uy0Var, long j2, long j3) throws C5043es {
        C5220ia.m25476b(!this.f50224l);
        this.f50220h = uy0Var;
        if (this.f50223k == Long.MIN_VALUE) {
            this.f50223k = j2;
        }
        this.f50221i = c5606pvArr;
        this.f50222j = j3;
        mo22246a(c5606pvArr, j2, j3);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo23521a(long j2) throws C5043es {
        this.f50224l = false;
        this.f50223k = j2;
        mo22245a(j2, false);
    }

    /* renamed from: a */
    public final C5043es m24561a(Exception exc, @Nullable C5606pv c5606pv, int i2) {
        return m24560a(i2, c5606pv, exc, false);
    }

    /* renamed from: a */
    public final C5043es m24560a(int i2, @Nullable C5606pv c5606pv, Exception exc, boolean z) {
        int i3;
        if (c5606pv != null && !this.f50225m) {
            this.f50225m = true;
            try {
                int mo22243a = mo22243a(c5606pv) & 7;
                this.f50225m = false;
                i3 = mo22243a;
            } catch (C5043es unused) {
                this.f50225m = false;
            } catch (Throwable th) {
                this.f50225m = false;
                throw th;
            }
            return C5043es.m24246a(exc, getName(), this.f50217e, c5606pv, i3, z, i2);
        }
        i3 = 4;
        return C5043es.m24246a(exc, getName(), this.f50217e, c5606pv, i3, z, i2);
    }

    /* renamed from: a */
    public final int m24559a(C5658qv c5658qv, C5752sm c5752sm, int i2) {
        uy0 uy0Var = this.f50220h;
        Objects.requireNonNull(uy0Var);
        int mo23272a = uy0Var.mo23272a(c5658qv, c5752sm, i2);
        if (mo23272a == -4) {
            if (c5752sm.m26638f()) {
                this.f50223k = Long.MIN_VALUE;
                return this.f50224l ? -4 : -3;
            }
            long j2 = c5752sm.f54759e + this.f50222j;
            c5752sm.f54759e = j2;
            this.f50223k = Math.max(this.f50223k, j2);
        } else if (mo23272a == -5) {
            C5606pv c5606pv = c5658qv.f54140b;
            Objects.requireNonNull(c5606pv);
            if (c5606pv.f53824p != Long.MAX_VALUE) {
                c5658qv.f54140b = c5606pv.m27508a().m27543a(c5606pv.f53824p + this.f50222j).m27550a();
            }
        }
        return mo23272a;
    }
}

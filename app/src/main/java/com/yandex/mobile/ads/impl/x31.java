package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class x31 implements ra0 {

    /* renamed from: b */
    private final InterfaceC4972di f56355b;

    /* renamed from: c */
    private boolean f56356c;

    /* renamed from: d */
    private long f56357d;

    /* renamed from: e */
    private long f56358e;

    /* renamed from: f */
    private nq0 f56359f = nq0.f53071d;

    public x31(f51 f51Var) {
        this.f56355b = f51Var;
    }

    /* renamed from: a */
    public final void m29662a() {
        if (this.f56356c) {
            return;
        }
        this.f56358e = this.f56355b.mo23887c();
        this.f56356c = true;
    }

    /* renamed from: b */
    public final void m29664b() {
        if (this.f56356c) {
            m29663a(mo27885o());
            this.f56356c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    public final nq0 getPlaybackParameters() {
        return this.f56359f;
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: o */
    public final long mo27885o() {
        long j2 = this.f56357d;
        if (!this.f56356c) {
            return j2;
        }
        long mo23887c = this.f56355b.mo23887c() - this.f56358e;
        nq0 nq0Var = this.f56359f;
        return j2 + (nq0Var.f53072a == 1.0f ? s91.m28096a(mo23887c) : nq0Var.m26940a(mo23887c));
    }

    /* renamed from: a */
    public final void m29663a(long j2) {
        this.f56357d = j2;
        if (this.f56356c) {
            this.f56358e = this.f56355b.mo23887c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: a */
    public final void mo27884a(nq0 nq0Var) {
        if (this.f56356c) {
            m29663a(mo27885o());
        }
        this.f56359f = nq0Var;
    }
}

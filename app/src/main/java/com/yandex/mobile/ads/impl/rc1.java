package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class rc1<T> implements fd1 {

    /* renamed from: a */
    @NonNull
    private final hc1<T> f54267a;

    /* renamed from: b */
    @NonNull
    private final cd1<T> f54268b;

    /* renamed from: c */
    @NonNull
    private final nd1 f54269c;

    /* renamed from: d */
    @NonNull
    private final md1 f54270d;

    /* renamed from: e */
    @NonNull
    private final sc1<T> f54271e;

    /* renamed from: f */
    @NonNull
    private final cg1 f54272f;

    /* renamed from: g */
    @NonNull
    private final sd1 f54273g;

    /* renamed from: h */
    @NonNull
    private final C5724s3 f54274h;

    /* renamed from: i */
    @NonNull
    private final tf1 f54275i;

    /* renamed from: j */
    @Nullable
    private bd1 f54276j;

    /* renamed from: k */
    private boolean f54277k;

    /* renamed from: l */
    private boolean f54278l;

    public rc1(@NonNull hc1<T> hc1Var, @NonNull cd1<T> cd1Var, @NonNull ag1 ag1Var, @NonNull md1 md1Var, @NonNull nd1 nd1Var, @NonNull sd1 sd1Var, @NonNull C5724s3 c5724s3, @NonNull tf1 tf1Var, @NonNull sc1<T> sc1Var) {
        this.f54267a = hc1Var;
        this.f54268b = cd1Var;
        this.f54270d = md1Var;
        this.f54269c = nd1Var;
        this.f54271e = sc1Var;
        this.f54273g = sd1Var;
        this.f54274h = c5724s3;
        this.f54275i = tf1Var;
        this.f54272f = hg0.m25193a(ag1Var);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: a */
    public final void mo24549a() {
        if (this.f54278l) {
            this.f54273g.m28210b(rd1.f54287d);
            this.f54275i.mo25517j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: b */
    public final void mo24551b() {
        if (this.f54278l) {
            this.f54273g.m28210b(rd1.f54291h);
            this.f54275i.mo25513f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: c */
    public final void mo24552c() {
        this.f54278l = true;
        this.f54273g.m28210b(rd1.f54287d);
        if (this.f54272f.m23259a()) {
            this.f54277k = true;
            this.f54275i.mo25504a(this.f54268b.mo23232d());
        }
        this.f54270d.m26627a();
        this.f54276j = new bd1(this.f54268b, this.f54275i);
        this.f54271e.mo24931d(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: d */
    public final void mo24553d() {
        this.f54278l = false;
        this.f54277k = false;
        this.f54273g.m28210b(rd1.f54289f);
        this.f54275i.mo25509b();
        this.f54270d.m26628b();
        this.f54269c.m26853c();
        this.f54271e.mo24936i(this.f54267a);
        this.f54268b.mo23229a((rc1) null);
        this.f54271e.mo24934g(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: e */
    public final void mo24554e() {
        this.f54275i.mo25514g();
        this.f54278l = false;
        this.f54277k = false;
        this.f54273g.m28210b(rd1.f54288e);
        this.f54270d.m26628b();
        this.f54269c.m26854d();
        this.f54271e.mo24933f(this.f54267a);
        this.f54268b.mo23229a((rc1) null);
        this.f54271e.mo24934g(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: f */
    public final void mo24555f() {
        this.f54273g.m28210b(rd1.f54287d);
        if (this.f54277k) {
            this.f54275i.mo25510c();
        } else if (this.f54272f.m23259a()) {
            this.f54277k = true;
            this.f54275i.mo25504a(this.f54268b.mo23232d());
        }
        this.f54270d.m26627a();
        this.f54271e.mo24935h(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: g */
    public final void mo24556g() {
        this.f54275i.mo25512e();
        this.f54278l = false;
        this.f54277k = false;
        this.f54273g.m28210b(rd1.f54288e);
        this.f54270d.m26628b();
        this.f54269c.m26854d();
        this.f54271e.mo24926a(this.f54267a);
        this.f54268b.mo23229a((rc1) null);
        this.f54271e.mo24934g(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: h */
    public final void mo24557h() {
        this.f54273g.m28210b(rd1.f54286c);
        this.f54274h.m28050a(EnumC5668r3.f54180m);
        this.f54271e.mo24932e(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: i */
    public final void mo24558i() {
        this.f54273g.m28210b(rd1.f54290g);
        if (this.f54277k) {
            this.f54275i.mo25511d();
        }
        this.f54271e.mo24929b(this.f54267a);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    public final void onVolumeChanged(float f2) {
        this.f54275i.mo25503a(f2);
        bd1 bd1Var = this.f54276j;
        if (bd1Var != null) {
            bd1Var.m22803a(f2);
        }
        this.f54271e.mo24927a(this.f54267a, f2);
    }

    @Override // com.yandex.mobile.ads.impl.fd1
    /* renamed from: a */
    public final void mo24550a(@NonNull ed1 ed1Var) {
        rd1 rd1Var;
        this.f54278l = false;
        this.f54277k = false;
        if (this.f54273g.m28208a(rd1.f54286c)) {
            rd1Var = rd1.f54292i;
        } else {
            rd1Var = rd1.f54293j;
        }
        this.f54273g.m28210b(rd1Var);
        this.f54270d.m26628b();
        this.f54269c.m26850a(ed1Var);
        this.f54275i.mo25506a(ed1Var);
        this.f54271e.mo24928a(this.f54267a, ed1Var);
        this.f54268b.mo23229a((rc1) null);
        this.f54271e.mo24934g(this.f54267a);
    }
}

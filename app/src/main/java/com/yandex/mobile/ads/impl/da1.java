package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;

/* loaded from: classes3.dex */
public final class da1<T> {

    /* renamed from: a */
    @NonNull
    private final cd1<T> f49616a;

    /* renamed from: b */
    @NonNull
    private final hc1<T> f49617b;

    /* renamed from: c */
    @NonNull
    private final C5724s3 f49618c;

    /* renamed from: d */
    @NonNull
    private final nd1 f49619d;

    /* renamed from: e */
    @NonNull
    private final md1 f49620e;

    /* renamed from: f */
    @NonNull
    private final rc1<T> f49621f;

    /* renamed from: g */
    @NonNull
    private final sd1 f49622g;

    /* renamed from: h */
    @NonNull
    private final tf1 f49623h;

    /* renamed from: i */
    @NonNull
    private final ag1 f49624i;

    public da1(@NonNull Context context, @NonNull cd1<T> cd1Var, @NonNull ag1 ag1Var, @NonNull hc1<T> hc1Var, @NonNull gf1 gf1Var, @NonNull sd1 sd1Var, @NonNull tf1 tf1Var, @NonNull jd1 jd1Var, @NonNull sc1<T> sc1Var) {
        this.f49616a = cd1Var;
        this.f49617b = hc1Var;
        this.f49622g = sd1Var;
        this.f49623h = tf1Var;
        this.f49624i = ag1Var;
        new ld1(context, hc1Var, ag1Var, sd1Var, tf1Var, sc1Var).m26433a(jd1Var);
        C5724s3 c5724s3 = new C5724s3();
        this.f49618c = c5724s3;
        md1 md1Var = new md1(cd1Var, jd1Var);
        this.f49620e = md1Var;
        nd1 nd1Var = new nd1(context, hc1Var, c5724s3, sd1Var, ag1Var, gf1Var, tf1Var);
        this.f49619d = nd1Var;
        this.f49621f = new rc1<>(hc1Var, cd1Var, ag1Var, md1Var, nd1Var, sd1Var, c5724s3, tf1Var, sc1Var);
    }

    /* renamed from: a */
    public final void m23855a(@NonNull i30 i30Var) {
        this.f49619d.m26852b(i30Var);
    }

    /* renamed from: b */
    public final void m23857b() {
        this.f49620e.m26628b();
        this.f49616a.mo23227a();
    }

    /* renamed from: c */
    public final void m23858c() {
        this.f49616a.mo23233e();
    }

    /* renamed from: d */
    public final void m23859d() {
        this.f49616a.mo23229a(this.f49621f);
        this.f49616a.mo23228a(this.f49617b);
        this.f49618c.m28055b(EnumC5668r3.f54180m);
        View view = this.f49624i.getView();
        if (view != null) {
            this.f49623h.mo25505a(view, this.f49624i.mo22500a());
        }
        this.f49619d.m26856f();
        this.f49622g.m28210b(rd1.f54285b);
    }

    /* renamed from: e */
    public final void m23860e() {
        this.f49616a.mo23231c();
    }

    /* renamed from: f */
    public final void m23861f() {
        this.f49616a.mo23230b();
    }

    /* renamed from: a */
    public final void m23856a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f49619d.m26851a(interfaceC5763a);
    }

    /* renamed from: a */
    public final void m23854a() {
        this.f49620e.m26628b();
        this.f49616a.mo23229a((rc1) null);
        this.f49622g.m28209b();
        this.f49619d.m26855e();
        this.f49618c.m28049a();
    }
}

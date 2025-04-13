package com.yandex.mobile.ads.impl;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.bc0;
import java.util.List;

/* loaded from: classes3.dex */
final class lq0 {

    /* renamed from: s */
    private static final bc0.C4858b f52492s = new bc0.C4858b(new Object());

    /* renamed from: a */
    public final k61 f52493a;

    /* renamed from: b */
    public final bc0.C4858b f52494b;

    /* renamed from: c */
    public final long f52495c;

    /* renamed from: d */
    public final long f52496d;

    /* renamed from: e */
    public final int f52497e;

    /* renamed from: f */
    @Nullable
    public final C5043es f52498f;

    /* renamed from: g */
    public final boolean f52499g;

    /* renamed from: h */
    public final x61 f52500h;

    /* renamed from: i */
    public final e71 f52501i;

    /* renamed from: j */
    public final List<Metadata> f52502j;

    /* renamed from: k */
    public final bc0.C4858b f52503k;

    /* renamed from: l */
    public final boolean f52504l;

    /* renamed from: m */
    public final int f52505m;

    /* renamed from: n */
    public final nq0 f52506n;

    /* renamed from: o */
    public final boolean f52507o;

    /* renamed from: p */
    public volatile long f52508p;

    /* renamed from: q */
    public volatile long f52509q;

    /* renamed from: r */
    public volatile long f52510r;

    public lq0(k61 k61Var, bc0.C4858b c4858b, long j2, long j3, int i2, @Nullable C5043es c5043es, boolean z, x61 x61Var, e71 e71Var, List<Metadata> list, bc0.C4858b c4858b2, boolean z2, int i3, nq0 nq0Var, long j4, long j5, long j6, boolean z3) {
        this.f52493a = k61Var;
        this.f52494b = c4858b;
        this.f52495c = j2;
        this.f52496d = j3;
        this.f52497e = i2;
        this.f52498f = c5043es;
        this.f52499g = z;
        this.f52500h = x61Var;
        this.f52501i = e71Var;
        this.f52502j = list;
        this.f52503k = c4858b2;
        this.f52504l = z2;
        this.f52505m = i3;
        this.f52506n = nq0Var;
        this.f52508p = j4;
        this.f52509q = j5;
        this.f52510r = j6;
        this.f52507o = z3;
    }

    /* renamed from: a */
    public static lq0 m26519a(e71 e71Var) {
        k61 k61Var = k61.f51847a;
        bc0.C4858b c4858b = f52492s;
        return new lq0(k61Var, c4858b, -9223372036854775807L, 0L, 1, null, false, x61.f56383d, e71Var, AbstractC4698p.m22055i(), c4858b, false, 0, nq0.f53071d, 0L, 0L, 0L, false);
    }

    /* renamed from: a */
    public static bc0.C4858b m26518a() {
        return f52492s;
    }

    @CheckResult
    /* renamed from: a */
    public final lq0 m26522a(bc0.C4858b c4858b, long j2, long j3, long j4, long j5, x61 x61Var, e71 e71Var, List<Metadata> list) {
        return new lq0(this.f52493a, c4858b, j3, j4, this.f52497e, this.f52498f, this.f52499g, x61Var, e71Var, list, this.f52503k, this.f52504l, this.f52505m, this.f52506n, this.f52508p, j5, j2, this.f52507o);
    }

    @CheckResult
    /* renamed from: a */
    public final lq0 m26524a(k61 k61Var) {
        return new lq0(k61Var, this.f52494b, this.f52495c, this.f52496d, this.f52497e, this.f52498f, this.f52499g, this.f52500h, this.f52501i, this.f52502j, this.f52503k, this.f52504l, this.f52505m, this.f52506n, this.f52508p, this.f52509q, this.f52510r, this.f52507o);
    }

    @CheckResult
    /* renamed from: a */
    public final lq0 m26520a(int i2) {
        return new lq0(this.f52493a, this.f52494b, this.f52495c, this.f52496d, i2, this.f52498f, this.f52499g, this.f52500h, this.f52501i, this.f52502j, this.f52503k, this.f52504l, this.f52505m, this.f52506n, this.f52508p, this.f52509q, this.f52510r, this.f52507o);
    }

    @CheckResult
    /* renamed from: a */
    public final lq0 m26523a(@Nullable C5043es c5043es) {
        return new lq0(this.f52493a, this.f52494b, this.f52495c, this.f52496d, this.f52497e, c5043es, this.f52499g, this.f52500h, this.f52501i, this.f52502j, this.f52503k, this.f52504l, this.f52505m, this.f52506n, this.f52508p, this.f52509q, this.f52510r, this.f52507o);
    }

    @CheckResult
    /* renamed from: a */
    public final lq0 m26521a(bc0.C4858b c4858b) {
        return new lq0(this.f52493a, this.f52494b, this.f52495c, this.f52496d, this.f52497e, this.f52498f, this.f52499g, this.f52500h, this.f52501i, this.f52502j, c4858b, this.f52504l, this.f52505m, this.f52506n, this.f52508p, this.f52509q, this.f52510r, this.f52507o);
    }
}

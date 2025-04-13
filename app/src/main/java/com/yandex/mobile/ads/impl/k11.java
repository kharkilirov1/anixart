package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.pb0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k11 extends k61 {

    /* renamed from: o */
    private static final Object f51809o = new Object();

    /* renamed from: b */
    private final long f51810b;

    /* renamed from: c */
    private final long f51811c;

    /* renamed from: d */
    private final long f51812d;

    /* renamed from: e */
    private final long f51813e;

    /* renamed from: f */
    private final long f51814f;

    /* renamed from: g */
    private final long f51815g;

    /* renamed from: h */
    private final long f51816h;

    /* renamed from: i */
    private final boolean f51817i;

    /* renamed from: j */
    private final boolean f51818j;

    /* renamed from: k */
    private final boolean f51819k;

    /* renamed from: l */
    @Nullable
    private final Object f51820l;

    /* renamed from: m */
    @Nullable
    private final pb0 f51821m;

    /* renamed from: n */
    @Nullable
    private final pb0.C5579e f51822n;

    static {
        new pb0.C5575a().m27215b("SinglePeriodTimeline").m27211a(Uri.EMPTY).m27214a();
    }

    public k11(long j2, long j3, boolean z, boolean z2, pb0 pb0Var) {
        this(j2, j3, z, pb0Var, z2 ? pb0Var.f53430c : null);
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo25934a() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r5) goto L13;
     */
    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.k61.C5323d mo23974a(int r25, com.yandex.mobile.ads.impl.k61.C5323d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.yandex.mobile.ads.impl.C5220ia.m25471a(r2, r1)
            long r1 = r0.f51816h
            boolean r14 = r0.f51818j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2d
            boolean r5 = r0.f51819k
            if (r5 != 0) goto L2d
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            long r5 = r0.f51814f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2d
        L2a:
            r16 = r3
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.yandex.mobile.ads.impl.k61.C5323d.f51860r
            com.yandex.mobile.ads.impl.pb0 r5 = r0.f51821m
            java.lang.Object r6 = r0.f51820l
            long r7 = r0.f51810b
            long r9 = r0.f51811c
            long r11 = r0.f51812d
            boolean r13 = r0.f51817i
            com.yandex.mobile.ads.impl.pb0$e r15 = r0.f51822n
            long r1 = r0.f51814f
            r18 = r1
            long r1 = r0.f51815g
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.yandex.mobile.ads.impl.k61$d r1 = r3.m26064a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k11.mo23974a(int, com.yandex.mobile.ads.impl.k61$d, long):com.yandex.mobile.ads.impl.k61$d");
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: b */
    public final int mo25935b() {
        return 1;
    }

    public k11(long j2, long j3, boolean z, pb0 pb0Var, @Nullable pb0.C5579e c5579e) {
        this.f51810b = -9223372036854775807L;
        this.f51811c = -9223372036854775807L;
        this.f51812d = -9223372036854775807L;
        this.f51813e = j2;
        this.f51814f = j3;
        this.f51815g = 0L;
        this.f51816h = 0L;
        this.f51817i = z;
        this.f51818j = false;
        this.f51819k = false;
        this.f51820l = null;
        this.f51821m = (pb0) C5220ia.m25469a(pb0Var);
        this.f51822n = c5579e;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final k61.C5321b mo23972a(int i2, k61.C5321b c5321b, boolean z) {
        C5220ia.m25471a(i2, 1);
        Object obj = z ? f51809o : null;
        long j2 = this.f51813e;
        long j3 = -this.f51815g;
        Objects.requireNonNull(c5321b);
        return c5321b.m26051a(null, obj, 0, j2, j3, C6054y3.f56644g, false);
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo23970a(Object obj) {
        return f51809o.equals(obj) ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final Object mo23975a(int i2) {
        C5220ia.m25471a(i2, 1);
        return f51809o;
    }
}

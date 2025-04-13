package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vb0;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ci */
/* loaded from: classes3.dex */
public final class C4926ci implements vb0, vb0.InterfaceC5910a {

    /* renamed from: b */
    public final vb0 f49270b;

    /* renamed from: c */
    @Nullable
    private vb0.InterfaceC5910a f49271c;

    /* renamed from: d */
    private a[] f49272d = new a[0];

    /* renamed from: e */
    private long f49273e;

    /* renamed from: f */
    public long f49274f;

    /* renamed from: g */
    public long f49275g;

    /* renamed from: com.yandex.mobile.ads.impl.ci$a */
    public final class a implements uy0 {

        /* renamed from: a */
        public final uy0 f49276a;

        /* renamed from: b */
        private boolean f49277b;

        public a(uy0 uy0Var) {
            this.f49276a = uy0Var;
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final void mo23273a() throws IOException {
            this.f49276a.mo23273a();
        }

        /* renamed from: b */
        public final void m23274b() {
            this.f49277b = false;
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: d */
        public final boolean mo23275d() {
            return !C4926ci.this.m23270a() && this.f49276a.mo23275d();
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final int mo23272a(C5658qv c5658qv, C5752sm c5752sm, int i2) {
            if (C4926ci.this.m23270a()) {
                return -3;
            }
            if (this.f49277b) {
                c5752sm.m26635d(4);
                return -4;
            }
            int mo23272a = this.f49276a.mo23272a(c5658qv, c5752sm, i2);
            if (mo23272a == -5) {
                C5606pv c5606pv = c5658qv.f54140b;
                Objects.requireNonNull(c5606pv);
                int i3 = c5606pv.f53804B;
                if (i3 != 0 || c5606pv.f53805C != 0) {
                    C4926ci c4926ci = C4926ci.this;
                    if (c4926ci.f49274f != 0) {
                        i3 = 0;
                    }
                    c5658qv.f54140b = c5606pv.m27508a().m27558e(i3).m27560f(c4926ci.f49275g == Long.MIN_VALUE ? c5606pv.f53805C : 0).m27550a();
                }
                return -5;
            }
            C4926ci c4926ci2 = C4926ci.this;
            long j2 = c4926ci2.f49275g;
            if (j2 == Long.MIN_VALUE || ((mo23272a != -4 || c5752sm.f54759e < j2) && !(mo23272a == -3 && c4926ci2.getBufferedPositionUs() == Long.MIN_VALUE && !c5752sm.f54758d))) {
                return mo23272a;
            }
            c5752sm.mo22727b();
            c5752sm.m26635d(4);
            this.f49277b = true;
            return -4;
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final int mo23271a(long j2) {
            if (C4926ci.this.m23270a()) {
                return -3;
            }
            return this.f49276a.mo23271a(j2);
        }
    }

    public C4926ci(vb0 vb0Var, boolean z, long j2, long j3) {
        this.f49270b = vb0Var;
        this.f49273e = z ? j2 : -9223372036854775807L;
        this.f49274f = j2;
        this.f49275g = j3;
    }

    @Override // com.yandex.mobile.ads.impl.n01.InterfaceC5468a
    /* renamed from: a */
    public final void mo23268a(vb0 vb0Var) {
        vb0.InterfaceC5910a interfaceC5910a = this.f49271c;
        Objects.requireNonNull(interfaceC5910a);
        interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean continueLoading(long j2) {
        return this.f49270b.continueLoading(j2);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void discardBuffer(long j2, boolean z) {
        this.f49270b.discardBuffer(j2, z);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f49270b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j2 = this.f49275g;
            if (j2 == Long.MIN_VALUE || bufferedPositionUs < j2) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f49270b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j2 = this.f49275g;
            if (j2 == Long.MIN_VALUE || nextLoadPositionUs < j2) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final x61 getTrackGroups() {
        return this.f49270b.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean isLoading() {
        return this.f49270b.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void maybeThrowPrepareError() throws IOException {
        this.f49270b.maybeThrowPrepareError();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long readDiscontinuity() {
        if (m23270a()) {
            long j2 = this.f49273e;
            this.f49273e = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j2;
        }
        long readDiscontinuity2 = this.f49270b.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C5220ia.m25476b(readDiscontinuity2 >= this.f49274f);
        long j3 = this.f49275g;
        if (j3 != Long.MIN_VALUE && readDiscontinuity2 > j3) {
            z = false;
        }
        C5220ia.m25476b(z);
        return readDiscontinuity2;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void reevaluateBuffer(long j2) {
        this.f49270b.reevaluateBuffer(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // com.yandex.mobile.ads.impl.vb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f49273e = r0
            com.yandex.mobile.ads.impl.ci$a[] r0 = r6.f49272d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m23274b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.yandex.mobile.ads.impl.vb0 r0 = r6.f49270b
            long r0 = r0.seekToUs(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f49274f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f49275g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.yandex.mobile.ads.impl.C5220ia.m25476b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4926ci.seekToUs(long):long");
    }

    /* renamed from: a */
    public final void m23267a(long j2) {
        this.f49274f = 0L;
        this.f49275g = j2;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final void mo23269a(vb0.InterfaceC5910a interfaceC5910a, long j2) {
        this.f49271c = interfaceC5910a;
        this.f49270b.mo23269a(this, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo23266a(com.yandex.mobile.ads.impl.InterfaceC5939vs[] r16, boolean[] r17, com.yandex.mobile.ads.impl.uy0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.yandex.mobile.ads.impl.ci$a[] r1 = new com.yandex.mobile.ads.impl.C4926ci.a[r1]
            r0.f49272d = r1
            int r1 = r9.length
            com.yandex.mobile.ads.impl.uy0[] r10 = new com.yandex.mobile.ads.impl.uy0[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            com.yandex.mobile.ads.impl.ci$a[] r2 = r0.f49272d
            r3 = r9[r1]
            com.yandex.mobile.ads.impl.ci$a r3 = (com.yandex.mobile.ads.impl.C4926ci.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            com.yandex.mobile.ads.impl.uy0 r12 = r3.f49276a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            com.yandex.mobile.ads.impl.vb0 r1 = r0.f49270b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo23266a(r2, r3, r4, r5, r6)
            boolean r3 = r15.m23270a()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f49274f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = 0
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            com.yandex.mobile.ads.impl.pv r6 = r6.mo24850d()
            java.lang.String r7 = r6.f53820l
            java.lang.String r6 = r6.f53817i
            boolean r6 = com.yandex.mobile.ads.impl.he0.m25140a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = 1
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = 0
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f49273e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f49274f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f49275g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = 0
        L85:
            com.yandex.mobile.ads.impl.C5220ia.m25476b(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            com.yandex.mobile.ads.impl.ci$a[] r3 = r0.f49272d
            r3[r11] = r12
            goto La5
        L94:
            com.yandex.mobile.ads.impl.ci$a[] r4 = r0.f49272d
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            com.yandex.mobile.ads.impl.uy0 r5 = r5.f49276a
            if (r5 == r3) goto La5
        L9e:
            com.yandex.mobile.ads.impl.ci$a r5 = new com.yandex.mobile.ads.impl.ci$a
            r5.<init>(r3)
            r4[r11] = r5
        La5:
            com.yandex.mobile.ads.impl.ci$a[] r3 = r0.f49272d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4926ci.mo23266a(com.yandex.mobile.ads.impl.vs[], boolean[], com.yandex.mobile.ads.impl.uy0[], boolean[], long):long");
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final long mo23265a(long j2, f01 f01Var) {
        long j3 = this.f49274f;
        if (j2 == j3) {
            return j3;
        }
        int i2 = s91.f54530a;
        long max = Math.max(0L, Math.min(f01Var.f50083a, j2 - j3));
        long j4 = f01Var.f50084b;
        long j5 = this.f49275g;
        long max2 = Math.max(0L, Math.min(j4, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j2));
        if (max != f01Var.f50083a || max2 != f01Var.f50084b) {
            f01Var = new f01(max, max2);
        }
        return this.f49270b.mo23265a(j2, f01Var);
    }

    @Override // com.yandex.mobile.ads.impl.vb0.InterfaceC5910a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void mo29210a(vb0 vb0Var) {
        vb0.InterfaceC5910a interfaceC5910a = this.f49271c;
        Objects.requireNonNull(interfaceC5910a);
        interfaceC5910a.mo29210a((vb0) this);
    }

    /* renamed from: a */
    public final boolean m23270a() {
        return this.f49273e != -9223372036854775807L;
    }
}

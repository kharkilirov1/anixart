package com.yandex.mobile.ads.impl;

import androidx.annotation.IntRange;

/* renamed from: com.yandex.mobile.ads.impl.le */
/* loaded from: classes3.dex */
final class C5394le extends C5752sm {

    /* renamed from: i */
    private long f52370i;

    /* renamed from: j */
    private int f52371j;

    /* renamed from: k */
    private int f52372k;

    public C5394le() {
        super(2);
        this.f52372k = 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m26434a(com.yandex.mobile.ads.impl.C5752sm r5) {
        /*
            r4 = this;
            boolean r0 = r5.m28325i()
            r1 = 1
            r0 = r0 ^ r1
            com.yandex.mobile.ads.impl.C5220ia.m25473a(r0)
            boolean r0 = r5.m26636d()
            r0 = r0 ^ r1
            com.yandex.mobile.ads.impl.C5220ia.m25473a(r0)
            boolean r0 = r5.m26638f()
            r0 = r0 ^ r1
            com.yandex.mobile.ads.impl.C5220ia.m25473a(r0)
            boolean r0 = r4.m26438m()
            r2 = 0
            if (r0 != 0) goto L21
            goto L4b
        L21:
            int r0 = r4.f52371j
            int r3 = r4.f52372k
            if (r0 < r3) goto L28
            goto L49
        L28:
            boolean r0 = r5.m26637e()
            boolean r3 = r4.m26637e()
            if (r0 == r3) goto L33
            goto L49
        L33:
            java.nio.ByteBuffer r0 = r5.f54757c
            if (r0 == 0) goto L4b
            java.nio.ByteBuffer r3 = r4.f54757c
            if (r3 == 0) goto L4b
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L4b
        L49:
            r0 = 0
            goto L4c
        L4b:
            r0 = 1
        L4c:
            if (r0 != 0) goto L4f
            return r2
        L4f:
            int r0 = r4.f52371j
            int r2 = r0 + 1
            r4.f52371j = r2
            if (r0 != 0) goto L64
            long r2 = r5.f54759e
            r4.f54759e = r2
            boolean r0 = r5.m26639g()
            if (r0 == 0) goto L64
            r4.m26635d(r1)
        L64:
            boolean r0 = r5.m26637e()
            if (r0 == 0) goto L6f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.m26635d(r0)
        L6f:
            java.nio.ByteBuffer r0 = r5.f54757c
            if (r0 == 0) goto L7f
            int r2 = r0.remaining()
            r4.m28323e(r2)
            java.nio.ByteBuffer r2 = r4.f54757c
            r2.put(r0)
        L7f:
            long r2 = r5.f54759e
            r4.f52370i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5394le.m26434a(com.yandex.mobile.ads.impl.sm):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.C5752sm, com.yandex.mobile.ads.impl.AbstractC5438mf
    /* renamed from: b */
    public final void mo22727b() {
        super.mo22727b();
        this.f52371j = 0;
    }

    /* renamed from: f */
    public final void m26435f(@IntRange int i2) {
        C5220ia.m25473a(i2 > 0);
        this.f52372k = i2;
    }

    /* renamed from: k */
    public final long m26436k() {
        return this.f52370i;
    }

    /* renamed from: l */
    public final int m26437l() {
        return this.f52371j;
    }

    /* renamed from: m */
    public final boolean m26438m() {
        return this.f52371j > 0;
    }
}

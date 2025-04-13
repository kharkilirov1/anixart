package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class q21 {

    /* renamed from: a */
    private final ap0 f53913a = new ap0(8);

    /* renamed from: b */
    private int f53914b;

    /* renamed from: a */
    private long m27606a(C5598pn c5598pn) throws IOException {
        int i2 = 0;
        c5598pn.mo26764b(this.f53913a.m22587c(), 0, 1, false);
        int i3 = this.f53913a.m22587c()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        c5598pn.mo26764b(this.f53913a.m22587c(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.f53913a.m22587c()[i2] & 255) + (i6 << 8);
        }
        this.f53914b = i5 + 1 + this.f53914b;
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m27607b(com.yandex.mobile.ads.impl.C5598pn r15) throws java.io.IOException {
        /*
            r14 = this;
            long r0 = r15.mo22717a()
            r2 = 1024(0x400, double:5.06E-321)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            goto L12
        L11:
            r2 = r0
        L12:
            int r3 = (int) r2
            com.yandex.mobile.ads.impl.ap0 r2 = r14.f53913a
            byte[] r2 = r2.m22587c()
            r4 = 0
            r5 = 4
            r15.mo26764b(r2, r4, r5, r4)
            com.yandex.mobile.ads.impl.ap0 r2 = r14.f53913a
            long r7 = r2.m22609v()
            r14.f53914b = r5
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r2 = 1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L52
            int r5 = r14.f53914b
            int r5 = r5 + r2
            r14.f53914b = r5
            if (r5 != r3) goto L36
            return r4
        L36:
            com.yandex.mobile.ads.impl.ap0 r5 = r14.f53913a
            byte[] r5 = r5.m22587c()
            r15.mo26764b(r5, r4, r2, r4)
            r2 = 8
            long r7 = r7 << r2
            r9 = -256(0xffffffffffffff00, double:NaN)
            long r7 = r7 & r9
            com.yandex.mobile.ads.impl.ap0 r2 = r14.f53913a
            byte[] r2 = r2.m22587c()
            r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r9 = (long) r2
            long r7 = r7 | r9
            goto L26
        L52:
            long r7 = r14.m27606a(r15)
            int r3 = r14.f53914b
            long r9 = (long) r3
            r11 = -9223372036854775808
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 == 0) goto L9c
            if (r6 == 0) goto L68
            long r5 = r9 + r7
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L68
            goto L9c
        L68:
            int r0 = r14.f53914b
            long r0 = (long) r0
            long r5 = r9 + r7
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L99
            long r0 = r14.m27606a(r15)
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 != 0) goto L7a
            return r4
        L7a:
            long r0 = r14.m27606a(r15)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 < 0) goto L98
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L8c
            goto L98
        L8c:
            if (r3 == 0) goto L68
            int r1 = (int) r0
            r15.m27349a(r4, r1)
            int r0 = r14.f53914b
            int r0 = r0 + r1
            r14.f53914b = r0
            goto L68
        L98:
            return r4
        L99:
            if (r3 != 0) goto L9c
            r4 = 1
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q21.m27607b(com.yandex.mobile.ads.impl.pn):boolean");
    }
}

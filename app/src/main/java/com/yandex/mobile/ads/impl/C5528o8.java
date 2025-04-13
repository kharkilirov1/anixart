package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.o8 */
/* loaded from: classes3.dex */
public final class C5528o8 implements InterfaceC5412lt {

    /* renamed from: p */
    private static final int[] f53182p;

    /* renamed from: q */
    private static final int[] f53183q;

    /* renamed from: r */
    private static final byte[] f53184r;

    /* renamed from: s */
    private static final byte[] f53185s;

    /* renamed from: t */
    private static final int f53186t;

    /* renamed from: c */
    private boolean f53189c;

    /* renamed from: d */
    private long f53190d;

    /* renamed from: e */
    private int f53191e;

    /* renamed from: f */
    private int f53192f;

    /* renamed from: g */
    private boolean f53193g;

    /* renamed from: h */
    private long f53194h;

    /* renamed from: j */
    private int f53196j;

    /* renamed from: k */
    private long f53197k;

    /* renamed from: l */
    private InterfaceC5509nt f53198l;

    /* renamed from: m */
    private y61 f53199m;

    /* renamed from: n */
    private e01 f53200n;

    /* renamed from: o */
    private boolean f53201o;

    /* renamed from: b */
    private final int f53188b = 0;

    /* renamed from: a */
    private final byte[] f53187a = new byte[1];

    /* renamed from: i */
    private int f53195i = -1;

    static {
        jp1 jp1Var = jp1.f51701l;
        f53182p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f53183q = iArr;
        f53184r = s91.m28124b("#!AMR\n");
        f53185s = s91.m28124b("#!AMR-WB\n");
        f53186t = iArr[8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static InterfaceC5412lt[] m27016a() {
        return new InterfaceC5412lt[]{new C5528o8()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        byte[] bArr = f53184r;
        c5598pn.mo26765c();
        byte[] bArr2 = new byte[bArr.length];
        c5598pn.mo26764b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f53189c = false;
            c5598pn.mo26760a(bArr.length);
        } else {
            byte[] bArr3 = f53185s;
            c5598pn.mo26765c();
            byte[] bArr4 = new byte[bArr3.length];
            c5598pn.mo26764b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f53189c = true;
            c5598pn.mo26760a(bArr3.length);
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f53198l = interfaceC5509nt;
        this.f53199m = interfaceC5509nt.mo23022a(0, 1);
        interfaceC5509nt.mo23023a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f53190d = 0L;
        this.f53191e = 0;
        this.f53192f = 0;
        if (j2 != 0) {
            e01 e01Var = this.f53200n;
            if (e01Var instanceof C5401lk) {
                this.f53197k = ((C5401lk) e01Var).m26478c(j2);
                return;
            }
        }
        this.f53197k = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if ((!r0 && (r6 < 12 || r6 > 14)) != false) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27015a(com.yandex.mobile.ads.impl.C5598pn r6) throws java.io.IOException {
        /*
            r5 = this;
            r6.mo26765c()
            byte[] r0 = r5.f53187a
            r1 = 0
            r2 = 1
            r6.mo26764b(r0, r1, r2, r1)
            byte[] r6 = r5.f53187a
            r6 = r6[r1]
            r0 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r0 > 0) goto L70
            int r6 = r6 >> 3
            r0 = 15
            r6 = r6 & r0
            if (r6 < 0) goto L3d
            if (r6 > r0) goto L3d
            boolean r0 = r5.f53189c
            if (r0 == 0) goto L2a
            r4 = 10
            if (r6 < r4) goto L28
            r4 = 13
            if (r6 <= r4) goto L2a
        L28:
            r4 = 1
            goto L2b
        L2a:
            r4 = 0
        L2b:
            if (r4 != 0) goto L3c
            if (r0 != 0) goto L39
            r0 = 12
            if (r6 < r0) goto L37
            r0 = 14
            if (r6 <= r0) goto L39
        L37:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3d
        L3c:
            r1 = 1
        L3d:
            if (r1 != 0) goto L62
            java.lang.String r0 = "Illegal AMR "
            java.lang.StringBuilder r0 = com.yandex.mobile.ads.impl.l60.m26356a(r0)
            boolean r1 = r5.f53189c
            if (r1 == 0) goto L4c
            java.lang.String r1 = "WB"
            goto L4e
        L4c:
            java.lang.String r1 = "NB"
        L4e:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.yandex.mobile.ads.impl.ep0 r6 = com.yandex.mobile.ads.impl.ep0.m24225a(r6, r3)
            throw r6
        L62:
            boolean r0 = r5.f53189c
            if (r0 == 0) goto L6b
            int[] r0 = com.yandex.mobile.ads.impl.C5528o8.f53183q
            r6 = r0[r6]
            goto L6f
        L6b:
            int[] r0 = com.yandex.mobile.ads.impl.C5528o8.f53182p
            r6 = r0[r6]
        L6f:
            return r6
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.yandex.mobile.ads.impl.ep0 r6 = com.yandex.mobile.ads.impl.ep0.m24225a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5528o8.m27015a(com.yandex.mobile.ads.impl.pn):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r20, com.yandex.mobile.ads.impl.qr0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5528o8.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }
}

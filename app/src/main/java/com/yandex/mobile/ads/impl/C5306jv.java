package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.jv */
/* loaded from: classes3.dex */
public final class C5306jv implements InterfaceC5412lt {

    /* renamed from: f */
    private InterfaceC5509nt f51757f;

    /* renamed from: h */
    private boolean f51759h;

    /* renamed from: i */
    private long f51760i;

    /* renamed from: j */
    private int f51761j;

    /* renamed from: k */
    private int f51762k;

    /* renamed from: l */
    private int f51763l;

    /* renamed from: m */
    private long f51764m;

    /* renamed from: n */
    private boolean f51765n;

    /* renamed from: o */
    private C5909vb f51766o;

    /* renamed from: p */
    private pf1 f51767p;

    /* renamed from: a */
    private final ap0 f51752a = new ap0(4);

    /* renamed from: b */
    private final ap0 f51753b = new ap0(9);

    /* renamed from: c */
    private final ap0 f51754c = new ap0(11);

    /* renamed from: d */
    private final ap0 f51755d = new ap0();

    /* renamed from: e */
    private final bz0 f51756e = new bz0();

    /* renamed from: g */
    private int f51758g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m25986a() {
        return new InterfaceC5412lt[]{new C5306jv()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r0.m29208a(r5, r12) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r12 = true;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r0.m27323a(r5, r12) != false) goto L30;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m25987b(com.yandex.mobile.ads.impl.C5598pn r12) throws java.io.IOException {
        /*
            r11 = this;
            boolean r0 = r11.f51759h
            r1 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L11
            long r5 = r11.f51760i
            long r7 = r11.f51764m
            long r5 = r5 + r7
            goto L1f
        L11:
            com.yandex.mobile.ads.impl.bz0 r0 = r11.f51756e
            long r5 = r0.m22949a()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L1d
            r5 = r1
            goto L1f
        L1d:
            long r5 = r11.f51764m
        L1f:
            int r0 = r11.f51762k
            r7 = 8
            r8 = 0
            r9 = 1
            if (r0 != r7) goto L4b
            com.yandex.mobile.ads.impl.vb r7 = r11.f51766o
            if (r7 == 0) goto L4b
            boolean r0 = r11.f51765n
            if (r0 != 0) goto L3b
            com.yandex.mobile.ads.impl.nt r0 = r11.f51757f
            com.yandex.mobile.ads.impl.e01$b r7 = new com.yandex.mobile.ads.impl.e01$b
            r7.<init>(r3, r1)
            r0.mo23024a(r7)
            r11.f51765n = r9
        L3b:
            com.yandex.mobile.ads.impl.vb r0 = r11.f51766o
            com.yandex.mobile.ads.impl.ap0 r12 = r11.m25985a(r12)
            r0.m29209a(r12)
            boolean r12 = r0.m29208a(r5, r12)
            if (r12 == 0) goto L78
            goto L75
        L4b:
            r7 = 9
            if (r0 != r7) goto L7a
            com.yandex.mobile.ads.impl.pf1 r7 = r11.f51767p
            if (r7 == 0) goto L7a
            boolean r0 = r11.f51765n
            if (r0 != 0) goto L63
            com.yandex.mobile.ads.impl.nt r0 = r11.f51757f
            com.yandex.mobile.ads.impl.e01$b r7 = new com.yandex.mobile.ads.impl.e01$b
            r7.<init>(r3, r1)
            r0.mo23024a(r7)
            r11.f51765n = r9
        L63:
            com.yandex.mobile.ads.impl.pf1 r0 = r11.f51767p
            com.yandex.mobile.ads.impl.ap0 r12 = r11.m25985a(r12)
            boolean r7 = r0.m27324a(r12)
            if (r7 == 0) goto L78
            boolean r12 = r0.m27323a(r5, r12)
            if (r12 == 0) goto L78
        L75:
            r12 = 1
            r8 = 1
            goto Lb8
        L78:
            r12 = 1
            goto Lb8
        L7a:
            r7 = 18
            if (r0 != r7) goto Lb2
            boolean r0 = r11.f51765n
            if (r0 != 0) goto Lb2
            com.yandex.mobile.ads.impl.bz0 r0 = r11.f51756e
            com.yandex.mobile.ads.impl.ap0 r12 = r11.m25985a(r12)
            java.util.Objects.requireNonNull(r0)
            boolean r8 = r0.m22950a(r5, r12)
            com.yandex.mobile.ads.impl.bz0 r12 = r11.f51756e
            long r5 = r12.m22949a()
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 == 0) goto L78
            com.yandex.mobile.ads.impl.nt r12 = r11.f51757f
            com.yandex.mobile.ads.impl.t20 r0 = new com.yandex.mobile.ads.impl.t20
            com.yandex.mobile.ads.impl.bz0 r7 = r11.f51756e
            long[] r7 = r7.m22951b()
            com.yandex.mobile.ads.impl.bz0 r10 = r11.f51756e
            long[] r10 = r10.m22952c()
            r0.<init>(r5, r7, r10)
            r12.mo23024a(r0)
            r11.f51765n = r9
            goto L78
        Lb2:
            int r0 = r11.f51763l
            r12.mo26760a(r0)
            r12 = 0
        Lb8:
            boolean r0 = r11.f51759h
            if (r0 != 0) goto Lcf
            if (r8 == 0) goto Lcf
            r11.f51759h = r9
            com.yandex.mobile.ads.impl.bz0 r0 = r11.f51756e
            long r5 = r0.m22949a()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto Lcd
            long r0 = r11.f51764m
            long r1 = -r0
        Lcd:
            r11.f51760i = r1
        Lcf:
            r0 = 4
            r11.f51761j = r0
            r0 = 2
            r11.f51758g = r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5306jv.m25987b(com.yandex.mobile.ads.impl.pn):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        c5598pn.mo26764b(this.f51752a.m22587c(), 0, 3, false);
        this.f51752a.m22591e(0);
        if (this.f51752a.m22610w() != 4607062) {
            return false;
        }
        c5598pn.mo26764b(this.f51752a.m22587c(), 0, 2, false);
        this.f51752a.m22591e(0);
        if ((this.f51752a.m22613z() & 250) != 0) {
            return false;
        }
        c5598pn.mo26764b(this.f51752a.m22587c(), 0, 4, false);
        this.f51752a.m22591e(0);
        int m22595h = this.f51752a.m22595h();
        c5598pn.mo26765c();
        c5598pn.m27349a(false, m22595h);
        c5598pn.mo26764b(this.f51752a.m22587c(), 0, 4, false);
        this.f51752a.m22591e(0);
        return this.f51752a.m22595h() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f51757f = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        if (j2 == 0) {
            this.f51758g = 1;
            this.f51759h = false;
        } else {
            this.f51758g = 3;
        }
        this.f51761j = 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        C5220ia.m25474b(this.f51757f);
        while (true) {
            int i2 = this.f51758g;
            boolean z = true;
            if (i2 == 1) {
                if (((C5598pn) interfaceC5458mt).mo26762a(this.f51753b.m22587c(), 0, 9, true)) {
                    this.f51753b.m22591e(0);
                    this.f51753b.m22593f(4);
                    int m22607t = this.f51753b.m22607t();
                    boolean z2 = (m22607t & 4) != 0;
                    boolean z3 = (m22607t & 1) != 0;
                    if (z2 && this.f51766o == null) {
                        this.f51766o = new C5909vb(this.f51757f.mo23022a(8, 1));
                    }
                    if (z3 && this.f51767p == null) {
                        this.f51767p = new pf1(this.f51757f.mo23022a(9, 2));
                    }
                    this.f51757f.mo23023a();
                    this.f51761j = (this.f51753b.m22595h() - 9) + 4;
                    this.f51758g = 2;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            } else if (i2 == 2) {
                ((C5598pn) interfaceC5458mt).mo26760a(this.f51761j);
                this.f51761j = 0;
                this.f51758g = 3;
            } else if (i2 == 3) {
                if (((C5598pn) interfaceC5458mt).mo26762a(this.f51754c.m22587c(), 0, 11, true)) {
                    this.f51754c.m22591e(0);
                    this.f51762k = this.f51754c.m22607t();
                    this.f51763l = this.f51754c.m22610w();
                    this.f51764m = this.f51754c.m22610w();
                    this.f51764m = ((this.f51754c.m22607t() << 24) | this.f51764m) * 1000;
                    this.f51754c.m22593f(3);
                    this.f51758g = 4;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            } else if (i2 == 4) {
                if (m25987b((C5598pn) interfaceC5458mt)) {
                    return 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    private ap0 m25985a(C5598pn c5598pn) throws IOException {
        if (this.f51763l > this.f51755d.m22584b()) {
            ap0 ap0Var = this.f51755d;
            ap0Var.m22582a(0, new byte[Math.max(ap0Var.m22584b() * 2, this.f51763l)]);
        } else {
            this.f51755d.m22591e(0);
        }
        this.f51755d.m22589d(this.f51763l);
        c5598pn.mo26762a(this.f51755d.m22587c(), 0, this.f51763l, false);
        return this.f51755d;
    }
}

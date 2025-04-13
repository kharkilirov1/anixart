package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g81;

/* renamed from: com.yandex.mobile.ads.impl.ay */
/* loaded from: classes3.dex */
public final class C4829ay implements InterfaceC4936cr {

    /* renamed from: a */
    private final j01 f48672a;

    /* renamed from: b */
    private String f48673b;

    /* renamed from: c */
    private y61 f48674c;

    /* renamed from: d */
    private a f48675d;

    /* renamed from: e */
    private boolean f48676e;

    /* renamed from: l */
    private long f48683l;

    /* renamed from: f */
    private final boolean[] f48677f = new boolean[3];

    /* renamed from: g */
    private final bh0 f48678g = new bh0(32);

    /* renamed from: h */
    private final bh0 f48679h = new bh0(33);

    /* renamed from: i */
    private final bh0 f48680i = new bh0(34);

    /* renamed from: j */
    private final bh0 f48681j = new bh0(39);

    /* renamed from: k */
    private final bh0 f48682k = new bh0(40);

    /* renamed from: m */
    private long f48684m = -9223372036854775807L;

    /* renamed from: n */
    private final ap0 f48685n = new ap0();

    public C4829ay(j01 j01Var) {
        this.f48672a = j01Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f48683l = 0L;
        this.f48684m = -9223372036854775807L;
        ch0.m23263a(this.f48677f);
        this.f48678g.m22831b();
        this.f48679h.m22831b();
        this.f48680i.m22831b();
        this.f48681j.m22831b();
        this.f48682k.m22831b();
        a aVar = this.f48675d;
        if (aVar != null) {
            aVar.m22657a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.ay$a */
    public static final class a {

        /* renamed from: a */
        private final y61 f48686a;

        /* renamed from: b */
        private long f48687b;

        /* renamed from: c */
        private boolean f48688c;

        /* renamed from: d */
        private int f48689d;

        /* renamed from: e */
        private long f48690e;

        /* renamed from: f */
        private boolean f48691f;

        /* renamed from: g */
        private boolean f48692g;

        /* renamed from: h */
        private boolean f48693h;

        /* renamed from: i */
        private boolean f48694i;

        /* renamed from: j */
        private boolean f48695j;

        /* renamed from: k */
        private long f48696k;

        /* renamed from: l */
        private long f48697l;

        /* renamed from: m */
        private boolean f48698m;

        public a(y61 y61Var) {
            this.f48686a = y61Var;
        }

        /* renamed from: a */
        public final void m22657a() {
            this.f48691f = false;
            this.f48692g = false;
            this.f48693h = false;
            this.f48694i = false;
            this.f48695j = false;
        }

        /* renamed from: a */
        public final void m22658a(int i2, int i3, long j2, long j3, boolean z) {
            this.f48692g = false;
            this.f48693h = false;
            this.f48690e = j3;
            this.f48689d = 0;
            this.f48687b = j2;
            if (!(i3 < 32 || i3 == 40)) {
                if (this.f48694i && !this.f48695j) {
                    if (z) {
                        long j4 = this.f48697l;
                        if (j4 != -9223372036854775807L) {
                            this.f48686a.mo28346a(j4, this.f48698m ? 1 : 0, (int) (j2 - this.f48696k), i2, null);
                        }
                    }
                    this.f48694i = false;
                }
                if ((32 <= i3 && i3 <= 35) || i3 == 39) {
                    this.f48693h = !this.f48695j;
                    this.f48695j = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.f48688c = z2;
            this.f48691f = z2 || i3 <= 9;
        }

        /* renamed from: a */
        public final void m22660a(byte[] bArr, int i2, int i3) {
            if (this.f48691f) {
                int i4 = this.f48689d;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.f48692g = (bArr[i5] & 128) != 0;
                    this.f48691f = false;
                } else {
                    this.f48689d = (i3 - i2) + i4;
                }
            }
        }

        /* renamed from: a */
        public final void m22659a(int i2, long j2, boolean z) {
            if (this.f48695j && this.f48692g) {
                this.f48698m = this.f48688c;
                this.f48695j = false;
                return;
            }
            if (this.f48693h || this.f48692g) {
                if (z && this.f48694i) {
                    long j3 = this.f48687b;
                    int i3 = i2 + ((int) (j2 - j3));
                    long j4 = this.f48697l;
                    if (j4 != -9223372036854775807L) {
                        boolean z2 = this.f48698m;
                        this.f48686a.mo28346a(j4, z2 ? 1 : 0, (int) (j3 - this.f48696k), i3, null);
                    }
                }
                this.f48696k = this.f48687b;
                this.f48697l = this.f48690e;
                this.f48698m = this.f48688c;
                this.f48694i = true;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f48673b = c5112d.m24822b();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 2);
        this.f48674c = mo23022a;
        this.f48675d = new a(mo23022a);
        this.f48672a.m25756a(interfaceC5509nt, c5112d);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f48684m = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a1  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22654a(com.yandex.mobile.ads.impl.ap0 r33) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4829ay.mo22654a(com.yandex.mobile.ads.impl.ap0):void");
    }
}

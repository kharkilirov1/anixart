package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.g81;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.yx */
/* loaded from: classes3.dex */
public final class C6095yx implements InterfaceC4936cr {

    /* renamed from: l */
    private static final float[] f56933l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    @Nullable
    private final r91 f56934a;

    /* renamed from: f */
    private b f56939f;

    /* renamed from: g */
    private long f56940g;

    /* renamed from: h */
    private String f56941h;

    /* renamed from: i */
    private y61 f56942i;

    /* renamed from: j */
    private boolean f56943j;

    /* renamed from: c */
    private final boolean[] f56936c = new boolean[4];

    /* renamed from: d */
    private final a f56937d = new a();

    /* renamed from: k */
    private long f56944k = -9223372036854775807L;

    /* renamed from: e */
    @Nullable
    private final bh0 f56938e = new bh0(178);

    /* renamed from: b */
    @Nullable
    private final ap0 f56935b = new ap0();

    public C6095yx(@Nullable r91 r91Var) {
        this.f56934a = r91Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        ch0.m23263a(this.f56936c);
        this.f56937d.m29978a();
        b bVar = this.f56939f;
        if (bVar != null) {
            bVar.m29981a();
        }
        bh0 bh0Var = this.f56938e;
        if (bh0Var != null) {
            bh0Var.m22831b();
        }
        this.f56940g = 0L;
        this.f56944k = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.yx$a */
    public static final class a {

        /* renamed from: f */
        private static final byte[] f56945f = {0, 0, 1};

        /* renamed from: a */
        private boolean f56946a;

        /* renamed from: b */
        private int f56947b;

        /* renamed from: c */
        public int f56948c;

        /* renamed from: d */
        public int f56949d;

        /* renamed from: e */
        public byte[] f56950e = new byte[128];

        /* renamed from: a */
        public final void m29978a() {
            this.f56946a = false;
            this.f56948c = 0;
            this.f56947b = 0;
        }

        /* renamed from: a */
        public final boolean m29980a(int i2, int i3) {
            int i4 = this.f56947b;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == 179 || i2 == 181) {
                                this.f56948c -= i3;
                                this.f56946a = false;
                                return true;
                            }
                        } else if ((i2 & 240) != 32) {
                            d90.m23842d("H263Reader", "Unexpected start code value");
                            m29978a();
                        } else {
                            this.f56949d = this.f56948c;
                            this.f56947b = 4;
                        }
                    } else if (i2 > 31) {
                        d90.m23842d("H263Reader", "Unexpected start code value");
                        m29978a();
                    } else {
                        this.f56947b = 3;
                    }
                } else if (i2 != 181) {
                    d90.m23842d("H263Reader", "Unexpected start code value");
                    m29978a();
                } else {
                    this.f56947b = 2;
                }
            } else if (i2 == 176) {
                this.f56947b = 1;
                this.f56946a = true;
            }
            m29979a(f56945f, 0, 3);
            return false;
        }

        /* renamed from: a */
        public final void m29979a(byte[] bArr, int i2, int i3) {
            if (this.f56946a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f56950e;
                int length = bArr2.length;
                int i5 = this.f56948c + i4;
                if (length < i5) {
                    this.f56950e = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.f56950e, this.f56948c, i4);
                this.f56948c += i4;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yx$b */
    public static final class b {

        /* renamed from: a */
        private final y61 f56951a;

        /* renamed from: b */
        private boolean f56952b;

        /* renamed from: c */
        private boolean f56953c;

        /* renamed from: d */
        private boolean f56954d;

        /* renamed from: e */
        private int f56955e;

        /* renamed from: f */
        private int f56956f;

        /* renamed from: g */
        private long f56957g;

        /* renamed from: h */
        private long f56958h;

        public b(y61 y61Var) {
            this.f56951a = y61Var;
        }

        /* renamed from: a */
        public final void m29981a() {
            this.f56952b = false;
            this.f56953c = false;
            this.f56954d = false;
            this.f56955e = -1;
        }

        /* renamed from: a */
        public final void m29982a(int i2, long j2) {
            this.f56955e = i2;
            this.f56954d = false;
            this.f56952b = i2 == 182 || i2 == 179;
            this.f56953c = i2 == 182;
            this.f56956f = 0;
            this.f56958h = j2;
        }

        /* renamed from: a */
        public final void m29984a(byte[] bArr, int i2, int i3) {
            if (this.f56953c) {
                int i4 = this.f56956f;
                int i5 = (i2 + 1) - i4;
                if (i5 < i3) {
                    this.f56954d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f56953c = false;
                } else {
                    this.f56956f = (i3 - i2) + i4;
                }
            }
        }

        /* renamed from: a */
        public final void m29983a(int i2, long j2, boolean z) {
            if (this.f56955e == 182 && z && this.f56952b) {
                long j3 = this.f56958h;
                if (j3 != -9223372036854775807L) {
                    this.f56951a.mo28346a(j3, this.f56954d ? 1 : 0, (int) (j2 - this.f56957g), i2, null);
                }
            }
            if (this.f56955e != 179) {
                this.f56957g = j2;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f56941h = c5112d.m24822b();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 2);
        this.f56942i = mo23022a;
        this.f56939f = new b(mo23022a);
        r91 r91Var = this.f56934a;
        if (r91Var != null) {
            r91Var.m27883a(interfaceC5509nt, c5112d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f56944k = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22654a(com.yandex.mobile.ads.impl.ap0 r19) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6095yx.mo22654a(com.yandex.mobile.ads.impl.ap0):void");
    }
}

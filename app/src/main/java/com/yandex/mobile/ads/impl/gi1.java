package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C5606pv;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class gi1 implements InterfaceC5412lt {

    /* renamed from: a */
    private InterfaceC5509nt f50595a;

    /* renamed from: b */
    private y61 f50596b;

    /* renamed from: e */
    private InterfaceC5128b f50599e;

    /* renamed from: c */
    private int f50597c = 0;

    /* renamed from: d */
    private long f50598d = -1;

    /* renamed from: f */
    private int f50600f = -1;

    /* renamed from: g */
    private long f50601g = -1;

    /* renamed from: com.yandex.mobile.ads.impl.gi1$b */
    public interface InterfaceC5128b {
        /* renamed from: a */
        void mo24901a(int i2, long j2) throws ep0;

        /* renamed from: a */
        void mo24902a(long j2);

        /* renamed from: a */
        boolean mo24903a(C5598pn c5598pn, long j2) throws IOException;
    }

    static {
        dn1 dn1Var = dn1.f49714y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m24898a() {
        return new InterfaceC5412lt[]{new gi1()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        return ii1.m25544a((C5598pn) interfaceC5458mt);
    }

    /* renamed from: com.yandex.mobile.ads.impl.gi1$c */
    public static final class C5129c implements InterfaceC5128b {

        /* renamed from: a */
        private final InterfaceC5509nt f50616a;

        /* renamed from: b */
        private final y61 f50617b;

        /* renamed from: c */
        private final hi1 f50618c;

        /* renamed from: d */
        private final C5606pv f50619d;

        /* renamed from: e */
        private final int f50620e;

        /* renamed from: f */
        private long f50621f;

        /* renamed from: g */
        private int f50622g;

        /* renamed from: h */
        private long f50623h;

        public C5129c(InterfaceC5509nt interfaceC5509nt, y61 y61Var, hi1 hi1Var, String str, int i2) throws ep0 {
            this.f50616a = interfaceC5509nt;
            this.f50617b = y61Var;
            this.f50618c = hi1Var;
            int i3 = (hi1Var.f50934b * hi1Var.f50937e) / 8;
            if (hi1Var.f50936d != i3) {
                StringBuilder m25v = C0000a.m25v("Expected block size: ", i3, "; got: ");
                m25v.append(hi1Var.f50936d);
                throw ep0.m24225a(m25v.toString(), (Exception) null);
            }
            int i4 = hi1Var.f50935c * i3;
            int i5 = i4 * 8;
            int max = Math.max(i3, i4 / 10);
            this.f50620e = max;
            this.f50619d = new C5606pv.a().m27561f(str).m27552b(i5).m27566k(i5).m27564i(max).m27554c(hi1Var.f50934b).m27569n(hi1Var.f50935c).m27565j(i2).m27550a();
        }

        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        public final void mo24902a(long j2) {
            this.f50621f = j2;
            this.f50622g = 0;
            this.f50623h = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        public final void mo24901a(int i2, long j2) {
            this.f50616a.mo23024a(new ji1(this.f50618c, 1, i2, j2));
            this.f50617b.mo28347a(this.f50619d);
        }

        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        public final boolean mo24903a(C5598pn c5598pn, long j2) throws IOException {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.f50622g) < (i3 = this.f50620e)) {
                int mo28348b = this.f50617b.mo28348b(c5598pn, (int) Math.min(i3 - i2, j3), true);
                if (mo28348b == -1) {
                    j3 = 0;
                } else {
                    this.f50622g += mo28348b;
                    j3 -= mo28348b;
                }
            }
            int i4 = this.f50618c.f50936d;
            int i5 = this.f50622g / i4;
            if (i5 > 0) {
                long m28097a = this.f50621f + s91.m28097a(this.f50623h, 1000000L, r1.f50935c);
                int i6 = i5 * i4;
                int i7 = this.f50622g - i6;
                this.f50617b.mo28346a(m28097a, 1, i6, i7, null);
                this.f50623h += i5;
                this.f50622g = i7;
            }
            return j3 <= 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f50595a = interfaceC5509nt;
        this.f50596b = interfaceC5509nt.mo23022a(0, 1);
        interfaceC5509nt.mo23023a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.gi1$a */
    public static final class C5127a implements InterfaceC5128b {

        /* renamed from: m */
        private static final int[] f50602m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f50603n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final InterfaceC5509nt f50604a;

        /* renamed from: b */
        private final y61 f50605b;

        /* renamed from: c */
        private final hi1 f50606c;

        /* renamed from: d */
        private final int f50607d;

        /* renamed from: e */
        private final byte[] f50608e;

        /* renamed from: f */
        private final ap0 f50609f;

        /* renamed from: g */
        private final int f50610g;

        /* renamed from: h */
        private final C5606pv f50611h;

        /* renamed from: i */
        private int f50612i;

        /* renamed from: j */
        private long f50613j;

        /* renamed from: k */
        private int f50614k;

        /* renamed from: l */
        private long f50615l;

        public C5127a(InterfaceC5509nt interfaceC5509nt, y61 y61Var, hi1 hi1Var) throws ep0 {
            this.f50604a = interfaceC5509nt;
            this.f50605b = y61Var;
            this.f50606c = hi1Var;
            int max = Math.max(1, hi1Var.f50935c / 10);
            this.f50610g = max;
            ap0 ap0Var = new ap0(hi1Var.f50938f);
            ap0Var.m22602o();
            int m22602o = ap0Var.m22602o();
            this.f50607d = m22602o;
            int i2 = hi1Var.f50934b;
            int i3 = (((hi1Var.f50936d - (i2 * 4)) * 8) / (hi1Var.f50937e * i2)) + 1;
            if (m22602o == i3) {
                int m28087a = s91.m28087a(max, m22602o);
                this.f50608e = new byte[hi1Var.f50936d * m28087a];
                this.f50609f = new ap0(m28087a * m24900a(m22602o, i2));
                int i4 = ((hi1Var.f50935c * hi1Var.f50936d) * 8) / m22602o;
                this.f50611h = new C5606pv.a().m27561f("audio/raw").m27552b(i4).m27566k(i4).m27564i(m24900a(max, i2)).m27554c(hi1Var.f50934b).m27569n(hi1Var.f50935c).m27565j(2).m27550a();
                return;
            }
            throw ep0.m24225a("Expected frames per block: " + i3 + "; got: " + m22602o, (Exception) null);
        }

        /* renamed from: a */
        private static int m24900a(int i2, int i3) {
            return i2 * 2 * i3;
        }

        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        public final void mo24902a(long j2) {
            this.f50612i = 0;
            this.f50613j = j2;
            this.f50614k = 0;
            this.f50615l = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        public final void mo24901a(int i2, long j2) {
            this.f50604a.mo23024a(new ji1(this.f50606c, this.f50607d, i2, j2));
            this.f50605b.mo28347a(this.f50611h);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0042 -> B:4:0x0044). Please report as a decompilation issue!!! */
        @Override // com.yandex.mobile.ads.impl.gi1.InterfaceC5128b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean mo24903a(com.yandex.mobile.ads.impl.C5598pn r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gi1.C5127a.mo24903a(com.yandex.mobile.ads.impl.pn, long):boolean");
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f50597c = j2 == 0 ? 0 : 4;
        InterfaceC5128b interfaceC5128b = this.f50599e;
        if (interfaceC5128b != null) {
            interfaceC5128b.mo24902a(j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r1 != 65534) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r17, com.yandex.mobile.ads.impl.qr0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gi1.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }
}

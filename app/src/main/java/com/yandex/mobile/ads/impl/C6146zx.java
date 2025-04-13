package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ch0;
import com.yandex.mobile.ads.impl.g81;

/* renamed from: com.yandex.mobile.ads.impl.zx */
/* loaded from: classes3.dex */
public final class C6146zx implements InterfaceC4936cr {

    /* renamed from: a */
    private final j01 f57351a;

    /* renamed from: b */
    private final boolean f57352b;

    /* renamed from: c */
    private final boolean f57353c;

    /* renamed from: g */
    private long f57357g;

    /* renamed from: i */
    private String f57359i;

    /* renamed from: j */
    private y61 f57360j;

    /* renamed from: k */
    private a f57361k;

    /* renamed from: l */
    private boolean f57362l;

    /* renamed from: n */
    private boolean f57364n;

    /* renamed from: h */
    private final boolean[] f57358h = new boolean[3];

    /* renamed from: d */
    private final bh0 f57354d = new bh0(7);

    /* renamed from: e */
    private final bh0 f57355e = new bh0(8);

    /* renamed from: f */
    private final bh0 f57356f = new bh0(6);

    /* renamed from: m */
    private long f57363m = -9223372036854775807L;

    /* renamed from: o */
    private final ap0 f57365o = new ap0();

    /* renamed from: com.yandex.mobile.ads.impl.zx$a */
    public static final class a {

        /* renamed from: a */
        private final y61 f57366a;

        /* renamed from: b */
        private final boolean f57367b;

        /* renamed from: c */
        private final boolean f57368c;

        /* renamed from: d */
        private final SparseArray<ch0.C4925c> f57369d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<ch0.C4924b> f57370e = new SparseArray<>();

        /* renamed from: f */
        private final bp0 f57371f;

        /* renamed from: g */
        private byte[] f57372g;

        /* renamed from: h */
        private int f57373h;

        /* renamed from: i */
        private int f57374i;

        /* renamed from: j */
        private long f57375j;

        /* renamed from: k */
        private boolean f57376k;

        /* renamed from: l */
        private long f57377l;

        /* renamed from: m */
        private C7022a f57378m;

        /* renamed from: n */
        private C7022a f57379n;

        /* renamed from: o */
        private boolean f57380o;

        /* renamed from: p */
        private long f57381p;

        /* renamed from: q */
        private long f57382q;

        /* renamed from: r */
        private boolean f57383r;

        /* renamed from: com.yandex.mobile.ads.impl.zx$a$a, reason: collision with other inner class name */
        public static final class C7022a {

            /* renamed from: a */
            private boolean f57384a;

            /* renamed from: b */
            private boolean f57385b;

            /* renamed from: c */
            @Nullable
            private ch0.C4925c f57386c;

            /* renamed from: d */
            private int f57387d;

            /* renamed from: e */
            private int f57388e;

            /* renamed from: f */
            private int f57389f;

            /* renamed from: g */
            private int f57390g;

            /* renamed from: h */
            private boolean f57391h;

            /* renamed from: i */
            private boolean f57392i;

            /* renamed from: j */
            private boolean f57393j;

            /* renamed from: k */
            private boolean f57394k;

            /* renamed from: l */
            private int f57395l;

            /* renamed from: m */
            private int f57396m;

            /* renamed from: n */
            private int f57397n;

            /* renamed from: o */
            private int f57398o;

            /* renamed from: p */
            private int f57399p;

            private C7022a() {
            }

            /* renamed from: a */
            public final void m30341a() {
                this.f57385b = false;
                this.f57384a = false;
            }

            /* renamed from: b */
            public final boolean m30344b() {
                int i2;
                return this.f57385b && ((i2 = this.f57388e) == 7 || i2 == 2);
            }

            public /* synthetic */ C7022a(int i2) {
                this();
            }

            /* renamed from: a */
            public final void m30342a(int i2) {
                this.f57388e = i2;
                this.f57385b = true;
            }

            /* renamed from: a */
            public final void m30343a(ch0.C4925c c4925c, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.f57386c = c4925c;
                this.f57387d = i2;
                this.f57388e = i3;
                this.f57389f = i4;
                this.f57390g = i5;
                this.f57391h = z;
                this.f57392i = z2;
                this.f57393j = z3;
                this.f57394k = z4;
                this.f57395l = i6;
                this.f57396m = i7;
                this.f57397n = i8;
                this.f57398o = i9;
                this.f57399p = i10;
                this.f57384a = true;
                this.f57385b = true;
            }

            /* renamed from: a */
            public static boolean m30340a(C7022a c7022a, C7022a c7022a2) {
                boolean z;
                if (c7022a.f57384a) {
                    if (!c7022a2.f57384a) {
                        return true;
                    }
                    ch0.C4925c c4925c = (ch0.C4925c) C5220ia.m25474b(c7022a.f57386c);
                    ch0.C4925c c4925c2 = (ch0.C4925c) C5220ia.m25474b(c7022a2.f57386c);
                    if (c7022a.f57389f != c7022a2.f57389f || c7022a.f57390g != c7022a2.f57390g || c7022a.f57391h != c7022a2.f57391h) {
                        return true;
                    }
                    if (c7022a.f57392i && c7022a2.f57392i && c7022a.f57393j != c7022a2.f57393j) {
                        return true;
                    }
                    int i2 = c7022a.f57387d;
                    int i3 = c7022a2.f57387d;
                    if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                        return true;
                    }
                    int i4 = c4925c.f49267k;
                    if (i4 == 0 && c4925c2.f49267k == 0 && (c7022a.f57396m != c7022a2.f57396m || c7022a.f57397n != c7022a2.f57397n)) {
                        return true;
                    }
                    if ((i4 == 1 && c4925c2.f49267k == 1 && (c7022a.f57398o != c7022a2.f57398o || c7022a.f57399p != c7022a2.f57399p)) || (z = c7022a.f57394k) != c7022a2.f57394k) {
                        return true;
                    }
                    if (z && c7022a.f57395l != c7022a2.f57395l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public a(y61 y61Var, boolean z, boolean z2) {
            this.f57366a = y61Var;
            this.f57367b = z;
            this.f57368c = z2;
            int i2 = 0;
            this.f57378m = new C7022a(i2);
            this.f57379n = new C7022a(i2);
            byte[] bArr = new byte[128];
            this.f57372g = bArr;
            this.f57371f = new bp0(bArr, 0, 0);
            m30339b();
        }

        /* renamed from: a */
        public final boolean m30337a() {
            return this.f57368c;
        }

        /* renamed from: b */
        public final void m30339b() {
            this.f57376k = false;
            this.f57380o = false;
            this.f57379n.m30341a();
        }

        /* renamed from: a */
        public final void m30335a(ch0.C4925c c4925c) {
            this.f57369d.append(c4925c.f49260d, c4925c);
        }

        /* renamed from: a */
        public final void m30334a(ch0.C4924b c4924b) {
            this.f57370e.append(c4924b.f49254a, c4924b);
        }

        /* renamed from: a */
        public final void m30333a(int i2, long j2, long j3) {
            this.f57374i = i2;
            this.f57377l = j3;
            this.f57375j = j2;
            if (!this.f57367b || i2 != 1) {
                if (!this.f57368c) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            C7022a c7022a = this.f57378m;
            this.f57378m = this.f57379n;
            this.f57379n = c7022a;
            c7022a.m30341a();
            this.f57373h = 0;
            this.f57376k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m30336a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6146zx.a.m30336a(byte[], int, int):void");
        }

        /* renamed from: a */
        public final boolean m30338a(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f57374i == 9 || (this.f57368c && C7022a.m30340a(this.f57379n, this.f57378m))) {
                if (z && this.f57380o) {
                    long j3 = this.f57375j;
                    int i3 = i2 + ((int) (j2 - j3));
                    long j4 = this.f57382q;
                    if (j4 != -9223372036854775807L) {
                        this.f57366a.mo28346a(j4, this.f57383r ? 1 : 0, (int) (j3 - this.f57381p), i3, null);
                    }
                }
                this.f57381p = this.f57375j;
                this.f57382q = this.f57377l;
                this.f57383r = false;
                this.f57380o = true;
            }
            boolean m30344b = this.f57367b ? this.f57379n.m30344b() : z2;
            boolean z4 = this.f57383r;
            int i4 = this.f57374i;
            if (i4 == 5 || (m30344b && i4 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f57383r = z5;
            return z5;
        }
    }

    public C6146zx(j01 j01Var, boolean z, boolean z2) {
        this.f57351a = j01Var;
        this.f57352b = z;
        this.f57353c = z2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f57357g = 0L;
        this.f57364n = false;
        this.f57363m = -9223372036854775807L;
        ch0.m23263a(this.f57358h);
        this.f57354d.m22831b();
        this.f57355e.m22831b();
        this.f57356f.m22831b();
        a aVar = this.f57361k;
        if (aVar != null) {
            aVar.m30339b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f57359i = c5112d.m24822b();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 2);
        this.f57360j = mo23022a;
        this.f57361k = new a(mo23022a, this.f57352b, this.f57353c);
        this.f57351a.m25756a(interfaceC5509nt, c5112d);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f57363m = j2;
        }
        this.f57364n = ((i2 & 2) != 0) | this.f57364n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fe  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22654a(com.yandex.mobile.ads.impl.ap0 r20) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6146zx.mo22654a(com.yandex.mobile.ads.impl.ap0):void");
    }
}

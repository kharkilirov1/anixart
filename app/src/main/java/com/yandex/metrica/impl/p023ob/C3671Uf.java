package com.yandex.metrica.impl.p023ob;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Uf */
/* loaded from: classes2.dex */
public final class C3671Uf extends AbstractC3909e {

    /* renamed from: b */
    public b[] f44149b;

    /* renamed from: c */
    public a[] f44150c;

    public C3671Uf() {
        m19240b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        b[] bVarArr = this.f44149b;
        int i2 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                b[] bVarArr2 = this.f44149b;
                if (i3 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i3];
                if (bVar != null) {
                    c3831b.m19615b(1, bVar);
                }
                i3++;
            }
        }
        a[] aVarArr = this.f44150c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        while (true) {
            a[] aVarArr2 = this.f44150c;
            if (i2 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i2];
            if (aVar != null) {
                c3831b.m19615b(2, aVar);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3671Uf m19240b() {
        this.f44149b = b.m19243c();
        this.f44150c = a.m19241c();
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2;
        b[] bVarArr = this.f44149b;
        int i3 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f44149b;
                if (i4 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i4];
                if (bVar != null) {
                    i2 += C3831b.m19598a(1, bVar);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        a[] aVarArr = this.f44150c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f44150c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    i2 += C3831b.m19598a(2, aVar);
                }
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: i */
        private static volatile a[] f44151i;

        /* renamed from: b */
        public long f44152b;

        /* renamed from: c */
        public long f44153c;

        /* renamed from: d */
        public C3646Tf[] f44154d;

        /* renamed from: e */
        public C3721Wf[] f44155e;

        /* renamed from: f */
        public long f44156f;

        /* renamed from: g */
        public int f44157g;

        /* renamed from: h */
        public int f44158h;

        public a() {
            m19242b();
        }

        /* renamed from: c */
        public static a[] m19241c() {
            if (f44151i == null) {
                synchronized (C3857c.f44857a) {
                    if (f44151i == null) {
                        f44151i = new a[0];
                    }
                }
            }
            return f44151i;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19626e(1, this.f44152b);
            c3831b.m19626e(2, this.f44153c);
            C3646Tf[] c3646TfArr = this.f44154d;
            int i2 = 0;
            if (c3646TfArr != null && c3646TfArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C3646Tf[] c3646TfArr2 = this.f44154d;
                    if (i3 >= c3646TfArr2.length) {
                        break;
                    }
                    C3646Tf c3646Tf = c3646TfArr2[i3];
                    if (c3646Tf != null) {
                        c3831b.m19615b(3, c3646Tf);
                    }
                    i3++;
                }
            }
            C3721Wf[] c3721WfArr = this.f44155e;
            if (c3721WfArr != null && c3721WfArr.length > 0) {
                while (true) {
                    C3721Wf[] c3721WfArr2 = this.f44155e;
                    if (i2 >= c3721WfArr2.length) {
                        break;
                    }
                    C3721Wf c3721Wf = c3721WfArr2[i2];
                    if (c3721Wf != null) {
                        c3831b.m19615b(4, c3721Wf);
                    }
                    i2++;
                }
            }
            long j2 = this.f44156f;
            if (j2 != 0) {
                c3831b.m19626e(5, j2);
            }
            int i4 = this.f44157g;
            if (i4 != 0) {
                c3831b.m19622d(6, i4);
            }
            int i5 = this.f44158h;
            if (i5 != 0) {
                c3831b.m19622d(7, i5);
            }
        }

        /* renamed from: b */
        public a m19242b() {
            this.f44152b = 0L;
            this.f44153c = 0L;
            this.f44154d = C3646Tf.m19164c();
            this.f44155e = C3721Wf.m19358c();
            this.f44156f = 0L;
            this.f44157g = 0;
            this.f44158h = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19608b = C3831b.m19608b(2, this.f44153c) + C3831b.m19608b(1, this.f44152b) + 0;
            C3646Tf[] c3646TfArr = this.f44154d;
            if (c3646TfArr != null && c3646TfArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C3646Tf[] c3646TfArr2 = this.f44154d;
                    if (i3 >= c3646TfArr2.length) {
                        break;
                    }
                    C3646Tf c3646Tf = c3646TfArr2[i3];
                    if (c3646Tf != null) {
                        m19608b += C3831b.m19598a(3, c3646Tf);
                    }
                    i3++;
                }
            }
            C3721Wf[] c3721WfArr = this.f44155e;
            if (c3721WfArr != null && c3721WfArr.length > 0) {
                while (true) {
                    C3721Wf[] c3721WfArr2 = this.f44155e;
                    if (i2 >= c3721WfArr2.length) {
                        break;
                    }
                    C3721Wf c3721Wf = c3721WfArr2[i2];
                    if (c3721Wf != null) {
                        m19608b += C3831b.m19598a(4, c3721Wf);
                    }
                    i2++;
                }
            }
            long j2 = this.f44156f;
            if (j2 != 0) {
                m19608b += C3831b.m19608b(5, j2);
            }
            int i4 = this.f44157g;
            if (i4 != 0) {
                m19608b += C3831b.m19596a(6, i4);
            }
            int i5 = this.f44158h;
            return i5 != 0 ? m19608b + C3831b.m19596a(7, i5) : m19608b;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 8) {
                    this.f44152b = c3805a.m19559i();
                } else if (m19562l == 16) {
                    this.f44153c = c3805a.m19559i();
                } else if (m19562l == 26) {
                    int m19920a = C3961g.m19920a(c3805a, 26);
                    C3646Tf[] c3646TfArr = this.f44154d;
                    int length = c3646TfArr == null ? 0 : c3646TfArr.length;
                    int i2 = m19920a + length;
                    C3646Tf[] c3646TfArr2 = new C3646Tf[i2];
                    if (length != 0) {
                        System.arraycopy(c3646TfArr, 0, c3646TfArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        c3646TfArr2[length] = new C3646Tf();
                        c3805a.m19545a(c3646TfArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    c3646TfArr2[length] = new C3646Tf();
                    c3805a.m19545a(c3646TfArr2[length]);
                    this.f44154d = c3646TfArr2;
                } else if (m19562l == 34) {
                    int m19920a2 = C3961g.m19920a(c3805a, 34);
                    C3721Wf[] c3721WfArr = this.f44155e;
                    int length2 = c3721WfArr == null ? 0 : c3721WfArr.length;
                    int i3 = m19920a2 + length2;
                    C3721Wf[] c3721WfArr2 = new C3721Wf[i3];
                    if (length2 != 0) {
                        System.arraycopy(c3721WfArr, 0, c3721WfArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        c3721WfArr2[length2] = new C3721Wf();
                        c3805a.m19545a(c3721WfArr2[length2]);
                        c3805a.m19562l();
                        length2++;
                    }
                    c3721WfArr2[length2] = new C3721Wf();
                    c3805a.m19545a(c3721WfArr2[length2]);
                    this.f44155e = c3721WfArr2;
                } else if (m19562l == 40) {
                    this.f44156f = c3805a.m19559i();
                } else if (m19562l == 48) {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3 || m19558h == 4) {
                        this.f44157g = m19558h;
                    }
                } else if (m19562l != 56) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19558h2 = c3805a.m19558h();
                    if (m19558h2 == 0 || m19558h2 == 1 || m19558h2 == 2 || m19558h2 == 3) {
                        this.f44158h = m19558h2;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
        while (true) {
            int m19562l = c3805a.m19562l();
            if (m19562l == 0) {
                break;
            }
            if (m19562l == 10) {
                int m19920a = C3961g.m19920a(c3805a, 10);
                b[] bVarArr = this.f44149b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i2 = m19920a + length;
                b[] bVarArr2 = new b[i2];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    bVarArr2[length] = new b();
                    c3805a.m19545a(bVarArr2[length]);
                    c3805a.m19562l();
                    length++;
                }
                bVarArr2[length] = new b();
                c3805a.m19545a(bVarArr2[length]);
                this.f44149b = bVarArr2;
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a2 = C3961g.m19920a(c3805a, 18);
                a[] aVarArr = this.f44150c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i3 = m19920a2 + length2;
                a[] aVarArr2 = new a[i3];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    aVarArr2[length2] = new a();
                    c3805a.m19545a(aVarArr2[length2]);
                    c3805a.m19562l();
                    length2++;
                }
                aVarArr2[length2] = new a();
                c3805a.m19545a(aVarArr2[length2]);
                this.f44150c = aVarArr2;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: o */
        private static volatile b[] f44159o;

        /* renamed from: b */
        public long f44160b;

        /* renamed from: c */
        public long f44161c;

        /* renamed from: d */
        public long f44162d;

        /* renamed from: e */
        public double f44163e;

        /* renamed from: f */
        public double f44164f;

        /* renamed from: g */
        public int f44165g;

        /* renamed from: h */
        public int f44166h;

        /* renamed from: i */
        public int f44167i;

        /* renamed from: j */
        public int f44168j;

        /* renamed from: k */
        public int f44169k;

        /* renamed from: l */
        public int f44170l;

        /* renamed from: m */
        public long f44171m;

        /* renamed from: n */
        public int f44172n;

        public b() {
            m19244b();
        }

        /* renamed from: c */
        public static b[] m19243c() {
            if (f44159o == null) {
                synchronized (C3857c.f44857a) {
                    if (f44159o == null) {
                        f44159o = new b[0];
                    }
                }
            }
            return f44159o;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19626e(1, this.f44160b);
            c3831b.m19626e(2, this.f44161c);
            long j2 = this.f44162d;
            if (j2 != 0) {
                c3831b.m19626e(3, j2);
            }
            c3831b.m19614b(4, this.f44163e);
            c3831b.m19614b(5, this.f44164f);
            int i2 = this.f44165g;
            if (i2 != 0) {
                c3831b.m19627f(6, i2);
            }
            int i3 = this.f44166h;
            if (i3 != 0) {
                c3831b.m19627f(7, i3);
            }
            int i4 = this.f44167i;
            if (i4 != 0) {
                c3831b.m19627f(8, i4);
            }
            int i5 = this.f44168j;
            if (i5 != 0) {
                c3831b.m19622d(9, i5);
            }
            int i6 = this.f44169k;
            if (i6 != 0) {
                c3831b.m19622d(10, i6);
            }
            int i7 = this.f44170l;
            if (i7 != 0) {
                c3831b.m19622d(11, i7);
            }
            long j3 = this.f44171m;
            if (j3 != 0) {
                c3831b.m19626e(12, j3);
            }
            int i8 = this.f44172n;
            if (i8 != 0) {
                c3831b.m19622d(13, i8);
            }
        }

        /* renamed from: b */
        public b m19244b() {
            this.f44160b = 0L;
            this.f44161c = 0L;
            this.f44162d = 0L;
            this.f44163e = 0.0d;
            this.f44164f = 0.0d;
            this.f44165g = 0;
            this.f44166h = 0;
            this.f44167i = 0;
            this.f44168j = 0;
            this.f44169k = 0;
            this.f44170l = 0;
            this.f44171m = 0L;
            this.f44172n = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19608b = C3831b.m19608b(2, this.f44161c) + C3831b.m19608b(1, this.f44160b) + 0;
            long j2 = this.f44162d;
            if (j2 != 0) {
                m19608b += C3831b.m19608b(3, j2);
            }
            int m19595a = C3831b.m19595a(5, this.f44164f) + C3831b.m19595a(4, this.f44163e) + m19608b;
            int i2 = this.f44165g;
            if (i2 != 0) {
                m19595a += C3831b.m19610c(6, i2);
            }
            int i3 = this.f44166h;
            if (i3 != 0) {
                m19595a += C3831b.m19610c(7, i3);
            }
            int i4 = this.f44167i;
            if (i4 != 0) {
                m19595a += C3831b.m19610c(8, i4);
            }
            int i5 = this.f44168j;
            if (i5 != 0) {
                m19595a += C3831b.m19596a(9, i5);
            }
            int i6 = this.f44169k;
            if (i6 != 0) {
                m19595a += C3831b.m19596a(10, i6);
            }
            int i7 = this.f44170l;
            if (i7 != 0) {
                m19595a += C3831b.m19596a(11, i7);
            }
            long j3 = this.f44171m;
            if (j3 != 0) {
                m19595a += C3831b.m19608b(12, j3);
            }
            int i8 = this.f44172n;
            return i8 != 0 ? m19595a + C3831b.m19596a(13, i8) : m19595a;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                switch (m19562l) {
                    case 0:
                        break;
                    case 8:
                        this.f44160b = c3805a.m19559i();
                        break;
                    case 16:
                        this.f44161c = c3805a.m19559i();
                        break;
                    case 24:
                        this.f44162d = c3805a.m19559i();
                        break;
                    case 33:
                        this.f44163e = Double.longBitsToDouble(c3805a.m19556g());
                        break;
                    case 41:
                        this.f44164f = Double.longBitsToDouble(c3805a.m19556g());
                        break;
                    case 48:
                        this.f44165g = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                        this.f44166h = c3805a.m19558h();
                        break;
                    case 64:
                        this.f44167i = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        this.f44168j = c3805a.m19558h();
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        int m19558h = c3805a.m19558h();
                        if (m19558h != 0 && m19558h != 1 && m19558h != 2 && m19558h != 3) {
                            break;
                        } else {
                            this.f44169k = m19558h;
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        int m19558h2 = c3805a.m19558h();
                        if (m19558h2 != 0 && m19558h2 != 1 && m19558h2 != 2 && m19558h2 != 3) {
                            break;
                        } else {
                            this.f44170l = m19558h2;
                            break;
                        }
                    case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        this.f44171m = c3805a.m19559i();
                        break;
                    case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                        int m19558h3 = c3805a.m19558h();
                        if (m19558h3 != 0 && m19558h3 != 1 && m19558h3 != 2 && m19558h3 != 3 && m19558h3 != 4) {
                            break;
                        } else {
                            this.f44172n = m19558h3;
                            break;
                        }
                        break;
                    default:
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }
}

package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.hg */
/* loaded from: classes2.dex */
public final class C4004hg extends AbstractC3909e {

    /* renamed from: b */
    public a[] f45269b;

    /* renamed from: c */
    public String[] f45270c;

    /* renamed from: com.yandex.metrica.impl.ob.hg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: h */
        private static volatile a[] f45271h;

        /* renamed from: b */
        public String f45272b;

        /* renamed from: c */
        public String f45273c;

        /* renamed from: d */
        public String f45274d;

        /* renamed from: e */
        public C7001a[] f45275e;

        /* renamed from: f */
        public long f45276f;

        /* renamed from: g */
        public int[] f45277g;

        public a() {
            m20015b();
        }

        /* renamed from: c */
        public static a[] m20014c() {
            if (f45271h == null) {
                synchronized (C3857c.f44857a) {
                    if (f45271h == null) {
                        f45271h = new a[0];
                    }
                }
            }
            return f45271h;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f45272b);
            c3831b.m19616b(2, this.f45273c);
            c3831b.m19616b(3, this.f45274d);
            C7001a[] c7001aArr = this.f45275e;
            int i2 = 0;
            if (c7001aArr != null && c7001aArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C7001a[] c7001aArr2 = this.f45275e;
                    if (i3 >= c7001aArr2.length) {
                        break;
                    }
                    C7001a c7001a = c7001aArr2[i3];
                    if (c7001a != null) {
                        c3831b.m19615b(4, c7001a);
                    }
                    i3++;
                }
            }
            c3831b.m19626e(5, this.f45276f);
            int[] iArr = this.f45277g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f45277g;
                if (i2 >= iArr2.length) {
                    return;
                }
                c3831b.m19622d(6, iArr2[i2]);
                i2++;
            }
        }

        /* renamed from: b */
        public a m20015b() {
            this.f45272b = "";
            this.f45273c = "";
            this.f45274d = "";
            this.f45275e = C7001a.m20016c();
            this.f45276f = 0L;
            this.f45277g = C3961g.f45149a;
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.hg$a$a, reason: collision with other inner class name */
        public static final class C7001a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile C7001a[] f45278d;

            /* renamed from: b */
            public String f45279b;

            /* renamed from: c */
            public String f45280c;

            public C7001a() {
                m20017b();
            }

            /* renamed from: c */
            public static C7001a[] m20016c() {
                if (f45278d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f45278d == null) {
                            f45278d = new C7001a[0];
                        }
                    }
                }
                return f45278d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19616b(1, this.f45279b);
                c3831b.m19616b(2, this.f45280c);
            }

            /* renamed from: b */
            public C7001a m20017b() {
                this.f45279b = "";
                this.f45280c = "";
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                return C3831b.m19599a(2, this.f45280c) + C3831b.m19599a(1, this.f45279b) + 0;
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
                        this.f45279b = c3805a.m19561k();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f45280c = c3805a.m19561k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19599a = C3831b.m19599a(3, this.f45274d) + C3831b.m19599a(2, this.f45273c) + C3831b.m19599a(1, this.f45272b) + 0;
            C7001a[] c7001aArr = this.f45275e;
            if (c7001aArr != null && c7001aArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C7001a[] c7001aArr2 = this.f45275e;
                    if (i3 >= c7001aArr2.length) {
                        break;
                    }
                    C7001a c7001a = c7001aArr2[i3];
                    if (c7001a != null) {
                        m19599a += C3831b.m19598a(4, c7001a);
                    }
                    i3++;
                }
            }
            int m19608b = C3831b.m19608b(5, this.f45276f) + m19599a;
            int[] iArr = this.f45277g;
            if (iArr == null || iArr.length <= 0) {
                return m19608b;
            }
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f45277g;
                if (i2 < iArr2.length) {
                    i4 += C3831b.m19594a(iArr2[i2]);
                    i2++;
                } else {
                    return m19608b + i4 + (iArr2.length * 1);
                }
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
                    this.f45272b = c3805a.m19561k();
                } else if (m19562l == 18) {
                    this.f45273c = c3805a.m19561k();
                } else if (m19562l == 26) {
                    this.f45274d = c3805a.m19561k();
                } else if (m19562l == 34) {
                    int m19920a = C3961g.m19920a(c3805a, 34);
                    C7001a[] c7001aArr = this.f45275e;
                    int length = c7001aArr == null ? 0 : c7001aArr.length;
                    int i2 = m19920a + length;
                    C7001a[] c7001aArr2 = new C7001a[i2];
                    if (length != 0) {
                        System.arraycopy(c7001aArr, 0, c7001aArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        c7001aArr2[length] = new C7001a();
                        c3805a.m19545a(c7001aArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    c7001aArr2[length] = new C7001a();
                    c3805a.m19545a(c7001aArr2[length]);
                    this.f45275e = c7001aArr2;
                } else if (m19562l == 40) {
                    this.f45276f = c3805a.m19559i();
                } else if (m19562l == 48) {
                    int m19920a2 = C3961g.m19920a(c3805a, 48);
                    int[] iArr = new int[m19920a2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < m19920a2; i4++) {
                        if (i4 != 0) {
                            c3805a.m19562l();
                        }
                        int m19558h = c3805a.m19558h();
                        if (m19558h == 1 || m19558h == 2) {
                            iArr[i3] = m19558h;
                            i3++;
                        }
                    }
                    if (i3 != 0) {
                        int[] iArr2 = this.f45277g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i3 == m19920a2) {
                            this.f45277g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i3);
                            this.f45277g = iArr3;
                        }
                    }
                } else if (m19562l != 50) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19548c = c3805a.m19548c(c3805a.m19558h());
                    int m19546b = c3805a.m19546b();
                    int i5 = 0;
                    while (c3805a.m19543a() > 0) {
                        int m19558h2 = c3805a.m19558h();
                        if (m19558h2 == 1 || m19558h2 == 2) {
                            i5++;
                        }
                    }
                    if (i5 != 0) {
                        c3805a.m19553e(m19546b);
                        int[] iArr4 = this.f45277g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i5 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c3805a.m19543a() > 0) {
                            int m19558h3 = c3805a.m19558h();
                            if (m19558h3 == 1 || m19558h3 == 2) {
                                iArr5[length3] = m19558h3;
                                length3++;
                            }
                        }
                        this.f45277g = iArr5;
                    }
                    c3805a.m19547b(m19548c);
                }
            }
            return this;
        }
    }

    public C4004hg() {
        m20013b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a[] aVarArr = this.f45269b;
        int i2 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f45269b;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    c3831b.m19615b(1, aVar);
                }
                i3++;
            }
        }
        String[] strArr = this.f45270c;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f45270c;
            if (i2 >= strArr2.length) {
                return;
            }
            String str = strArr2[i2];
            if (str != null) {
                c3831b.m19616b(2, str);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C4004hg m20013b() {
        this.f45269b = a.m20014c();
        this.f45270c = C3961g.f45150b;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2;
        a[] aVarArr = this.f45269b;
        int i3 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f45269b;
                if (i4 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i4];
                if (aVar != null) {
                    i2 += C3831b.m19598a(1, aVar);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        String[] strArr = this.f45270c;
        if (strArr == null || strArr.length <= 0) {
            return i2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f45270c;
            if (i3 >= strArr2.length) {
                return i2 + i5 + (i6 * 1);
            }
            String str = strArr2[i3];
            if (str != null) {
                i6++;
                i5 = C3831b.m19604a(str) + i5;
            }
            i3++;
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
                a[] aVarArr = this.f45269b;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i2 = m19920a + length;
                a[] aVarArr2 = new a[i2];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    aVarArr2[length] = new a();
                    c3805a.m19545a(aVarArr2[length]);
                    c3805a.m19562l();
                    length++;
                }
                aVarArr2[length] = new a();
                c3805a.m19545a(aVarArr2[length]);
                this.f45269b = aVarArr2;
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a2 = C3961g.m19920a(c3805a, 18);
                String[] strArr = this.f45270c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i3 = m19920a2 + length2;
                String[] strArr2 = new String[i3];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    strArr2[length2] = c3805a.m19561k();
                    c3805a.m19562l();
                    length2++;
                }
                strArr2[length2] = c3805a.m19561k();
                this.f45270c = strArr2;
            }
        }
        return this;
    }
}

package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.dg */
/* loaded from: classes2.dex */
public final class C3900dg extends AbstractC3909e {

    /* renamed from: b */
    public a f44942b;

    /* renamed from: c */
    public a[] f44943c;

    public C3900dg() {
        m19728b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a aVar = this.f44942b;
        if (aVar != null) {
            c3831b.m19615b(1, aVar);
        }
        a[] aVarArr = this.f44943c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.f44943c;
            if (i2 >= aVarArr2.length) {
                return;
            }
            a aVar2 = aVarArr2[i2];
            if (aVar2 != null) {
                c3831b.m19615b(2, aVar2);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3900dg m19728b() {
        this.f44942b = null;
        this.f44943c = a.m19729c();
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public a[] f44947b;

        public b() {
            m19731b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            a[] aVarArr = this.f44947b;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f44947b;
                if (i2 >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c3831b.m19615b(1, aVar);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public b m19731b() {
            this.f44947b = a.m19732c();
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.dg$b$a */
        public static final class a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile a[] f44948d;

            /* renamed from: b */
            public String f44949b;

            /* renamed from: c */
            public String f44950c;

            public a() {
                m19733b();
            }

            /* renamed from: c */
            public static a[] m19732c() {
                if (f44948d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f44948d == null) {
                            f44948d = new a[0];
                        }
                    }
                }
                return f44948d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                if (!this.f44949b.equals("")) {
                    c3831b.m19616b(1, this.f44949b);
                }
                if (this.f44950c.equals("")) {
                    return;
                }
                c3831b.m19616b(2, this.f44950c);
            }

            /* renamed from: b */
            public a m19733b() {
                this.f44949b = "";
                this.f44950c = "";
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int m19599a = this.f44949b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f44949b);
                return !this.f44950c.equals("") ? m19599a + C3831b.m19599a(2, this.f44950c) : m19599a;
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
                        this.f44949b = c3805a.m19561k();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f44950c = c3805a.m19561k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            a[] aVarArr = this.f44947b;
            int i2 = 0;
            if (aVarArr == null || aVarArr.length <= 0) {
                return 0;
            }
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f44947b;
                if (i2 >= aVarArr2.length) {
                    return i3;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    i3 += C3831b.m19598a(1, aVar);
                }
                i2++;
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
                if (m19562l != 10) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 10);
                    a[] aVarArr = this.f44947b;
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
                    this.f44947b = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: d */
        private static volatile a[] f44944d;

        /* renamed from: b */
        public b f44945b;

        /* renamed from: c */
        public int f44946c;

        public a() {
            m19730b();
        }

        /* renamed from: c */
        public static a[] m19729c() {
            if (f44944d == null) {
                synchronized (C3857c.f44857a) {
                    if (f44944d == null) {
                        f44944d = new a[0];
                    }
                }
            }
            return f44944d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            b bVar = this.f44945b;
            if (bVar != null) {
                c3831b.m19615b(1, bVar);
            }
            int i2 = this.f44946c;
            if (i2 != 0) {
                c3831b.m19622d(2, i2);
            }
        }

        /* renamed from: b */
        public a m19730b() {
            this.f44945b = null;
            this.f44946c = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            b bVar = this.f44945b;
            int m19598a = bVar != null ? 0 + C3831b.m19598a(1, bVar) : 0;
            int i2 = this.f44946c;
            return i2 != 0 ? m19598a + C3831b.m19596a(2, i2) : m19598a;
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
                    if (this.f44945b == null) {
                        this.f44945b = new b();
                    }
                    c3805a.m19545a(this.f44945b);
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f44946c = m19558h;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a aVar = this.f44942b;
        int i2 = 0;
        int m19598a = aVar != null ? C3831b.m19598a(1, aVar) + 0 : 0;
        a[] aVarArr = this.f44943c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f44943c;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i2];
                if (aVar2 != null) {
                    m19598a += C3831b.m19598a(2, aVar2);
                }
                i2++;
            }
        }
        return m19598a;
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
                if (this.f44942b == null) {
                    this.f44942b = new a();
                }
                c3805a.m19545a(this.f44942b);
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a = C3961g.m19920a(c3805a, 18);
                a[] aVarArr = this.f44943c;
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
                this.f44943c = aVarArr2;
            }
        }
        return this;
    }
}

package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.gg */
/* loaded from: classes2.dex */
public final class C3978gg extends AbstractC3909e {

    /* renamed from: b */
    public a f45208b;

    /* renamed from: c */
    public b[] f45209c;

    public C3978gg() {
        m19964b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a aVar = this.f45208b;
        if (aVar != null) {
            c3831b.m19615b(1, aVar);
        }
        b[] bVarArr = this.f45209c;
        if (bVarArr == null || bVarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            b[] bVarArr2 = this.f45209c;
            if (i2 >= bVarArr2.length) {
                return;
            }
            b bVar = bVarArr2[i2];
            if (bVar != null) {
                c3831b.m19615b(2, bVar);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3978gg m19964b() {
        this.f45208b = null;
        this.f45209c = b.m19966c();
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: e */
        private static volatile b[] f45215e;

        /* renamed from: b */
        public String f45216b;

        /* renamed from: c */
        public String f45217c;

        /* renamed from: d */
        public int f45218d;

        public b() {
            m19967b();
        }

        /* renamed from: c */
        public static b[] m19966c() {
            if (f45215e == null) {
                synchronized (C3857c.f44857a) {
                    if (f45215e == null) {
                        f45215e = new b[0];
                    }
                }
            }
            return f45215e;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!this.f45216b.equals("")) {
                c3831b.m19616b(1, this.f45216b);
            }
            if (!this.f45217c.equals("")) {
                c3831b.m19616b(2, this.f45217c);
            }
            c3831b.m19622d(3, this.f45218d);
        }

        /* renamed from: b */
        public b m19967b() {
            this.f45216b = "";
            this.f45217c = "";
            this.f45218d = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19599a = this.f45216b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f45216b);
            if (!this.f45217c.equals("")) {
                m19599a += C3831b.m19599a(2, this.f45217c);
            }
            return C3831b.m19596a(3, this.f45218d) + m19599a;
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
                    this.f45216b = c3805a.m19561k();
                } else if (m19562l == 18) {
                    this.f45217c = c3805a.m19561k();
                } else if (m19562l != 24) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f45218d = m19558h;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a aVar = this.f45208b;
        int i2 = 0;
        int m19598a = aVar != null ? C3831b.m19598a(1, aVar) + 0 : 0;
        b[] bVarArr = this.f45209c;
        if (bVarArr != null && bVarArr.length > 0) {
            while (true) {
                b[] bVarArr2 = this.f45209c;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    m19598a += C3831b.m19598a(2, bVar);
                }
                i2++;
            }
        }
        return m19598a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.gg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public String f45210b;

        /* renamed from: c */
        public String f45211c;

        /* renamed from: d */
        public boolean f45212d;

        /* renamed from: e */
        public boolean f45213e;

        /* renamed from: f */
        public int f45214f;

        public a() {
            m19965b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!this.f45210b.equals("")) {
                c3831b.m19616b(1, this.f45210b);
            }
            if (!this.f45211c.equals("")) {
                c3831b.m19616b(2, this.f45211c);
            }
            boolean z = this.f45212d;
            if (z) {
                c3831b.m19617b(3, z);
            }
            boolean z2 = this.f45213e;
            if (z2) {
                c3831b.m19617b(4, z2);
            }
            c3831b.m19622d(5, this.f45214f);
        }

        /* renamed from: b */
        public a m19965b() {
            this.f45210b = "";
            this.f45211c = "";
            this.f45212d = false;
            this.f45213e = false;
            this.f45214f = 0;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19599a = this.f45210b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f45210b);
            if (!this.f45211c.equals("")) {
                m19599a += C3831b.m19599a(2, this.f45211c);
            }
            boolean z = this.f45212d;
            if (z) {
                m19599a += C3831b.m19600a(3, z);
            }
            boolean z2 = this.f45213e;
            if (z2) {
                m19599a += C3831b.m19600a(4, z2);
            }
            return C3831b.m19596a(5, this.f45214f) + m19599a;
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
                    this.f45210b = c3805a.m19561k();
                } else if (m19562l == 18) {
                    this.f45211c = c3805a.m19561k();
                } else if (m19562l == 24) {
                    this.f45212d = c3805a.m19549c();
                } else if (m19562l == 32) {
                    this.f45213e = c3805a.m19549c();
                } else if (m19562l != 40) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f45214f = m19558h;
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
                if (this.f45208b == null) {
                    this.f45208b = new a();
                }
                c3805a.m19545a(this.f45208b);
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a = C3961g.m19920a(c3805a, 18);
                b[] bVarArr = this.f45209c;
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
                this.f45209c = bVarArr2;
            }
        }
        return this;
    }
}

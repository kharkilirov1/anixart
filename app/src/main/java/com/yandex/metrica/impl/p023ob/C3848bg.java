package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.bg */
/* loaded from: classes2.dex */
public final class C3848bg extends AbstractC3909e {

    /* renamed from: b */
    public b[] f44830b;

    /* renamed from: c */
    public a f44831c;

    /* renamed from: d */
    public String[] f44832d;

    public C3848bg() {
        m19657b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        b[] bVarArr = this.f44830b;
        int i2 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                b[] bVarArr2 = this.f44830b;
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
        a aVar = this.f44831c;
        if (aVar != null) {
            c3831b.m19615b(2, aVar);
        }
        String[] strArr = this.f44832d;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f44832d;
            if (i2 >= strArr2.length) {
                return;
            }
            String str = strArr2[i2];
            if (str != null) {
                c3831b.m19616b(3, str);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3848bg m19657b() {
        this.f44830b = b.m19659c();
        this.f44831c = null;
        this.f44832d = C3961g.f45150b;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public int f44833b;

        /* renamed from: c */
        public int f44834c;

        public a() {
            m19658b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19622d(2, this.f44833b);
            c3831b.m19622d(3, this.f44834c);
        }

        /* renamed from: b */
        public a m19658b() {
            this.f44833b = 0;
            this.f44834c = -1;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19596a(3, this.f44834c) + C3831b.m19596a(2, this.f44833b) + 0;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public AbstractC3909e mo18311a(C3805a c3805a) throws IOException {
            while (true) {
                int m19562l = c3805a.m19562l();
                if (m19562l == 0) {
                    break;
                }
                if (m19562l == 16) {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3 || m19558h == 4 || m19558h == 5) {
                        this.f44833b = m19558h;
                    }
                } else if (m19562l != 24) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19558h2 = c3805a.m19558h();
                    if (m19558h2 == -1 || m19558h2 == 0 || m19558h2 == 1) {
                        this.f44834c = m19558h2;
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bg$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: d */
        private static volatile b[] f44835d;

        /* renamed from: b */
        public String f44836b;

        /* renamed from: c */
        public boolean f44837c;

        public b() {
            m19660b();
        }

        /* renamed from: c */
        public static b[] m19659c() {
            if (f44835d == null) {
                synchronized (C3857c.f44857a) {
                    if (f44835d == null) {
                        f44835d = new b[0];
                    }
                }
            }
            return f44835d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f44836b);
            c3831b.m19617b(2, this.f44837c);
        }

        /* renamed from: b */
        public b m19660b() {
            this.f44836b = "";
            this.f44837c = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19600a(2, this.f44837c) + C3831b.m19599a(1, this.f44836b) + 0;
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
                    this.f44836b = c3805a.m19561k();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44837c = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2;
        b[] bVarArr = this.f44830b;
        int i3 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f44830b;
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
        a aVar = this.f44831c;
        if (aVar != null) {
            i2 += C3831b.m19598a(2, aVar);
        }
        String[] strArr = this.f44832d;
        if (strArr == null || strArr.length <= 0) {
            return i2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f44832d;
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
                b[] bVarArr = this.f44830b;
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
                this.f44830b = bVarArr2;
            } else if (m19562l == 18) {
                if (this.f44831c == null) {
                    this.f44831c = new a();
                }
                c3805a.m19545a(this.f44831c);
            } else if (m19562l != 26) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a2 = C3961g.m19920a(c3805a, 26);
                String[] strArr = this.f44832d;
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
                this.f44832d = strArr2;
            }
        }
        return this;
    }
}

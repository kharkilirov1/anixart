package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.cg */
/* loaded from: classes2.dex */
public final class C3874cg extends AbstractC3909e {

    /* renamed from: b */
    public a[] f44874b;

    /* renamed from: c */
    public boolean f44875c;

    public C3874cg() {
        m19677b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a[] aVarArr = this.f44874b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f44874b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    c3831b.m19615b(1, aVar);
                }
                i2++;
            }
        }
        c3831b.m19617b(2, this.f44875c);
    }

    /* renamed from: b */
    public C3874cg m19677b() {
        this.f44874b = a.m19678c();
        this.f44875c = false;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.cg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: g */
        private static volatile a[] f44876g;

        /* renamed from: b */
        public int f44877b;

        /* renamed from: c */
        public String f44878c;

        /* renamed from: d */
        public String f44879d;

        /* renamed from: e */
        public long f44880e;

        /* renamed from: f */
        public long f44881f;

        public a() {
            m19679b();
        }

        /* renamed from: c */
        public static a[] m19678c() {
            if (f44876g == null) {
                synchronized (C3857c.f44857a) {
                    if (f44876g == null) {
                        f44876g = new a[0];
                    }
                }
            }
            return f44876g;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19622d(1, this.f44877b);
            c3831b.m19616b(2, this.f44878c);
            c3831b.m19616b(3, this.f44879d);
            c3831b.m19626e(4, this.f44880e);
            c3831b.m19626e(5, this.f44881f);
        }

        /* renamed from: b */
        public a m19679b() {
            this.f44877b = 1;
            this.f44878c = "";
            this.f44879d = "";
            this.f44880e = 0L;
            this.f44881f = 0L;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            return C3831b.m19608b(5, this.f44881f) + C3831b.m19608b(4, this.f44880e) + C3831b.m19599a(3, this.f44879d) + C3831b.m19599a(2, this.f44878c) + C3831b.m19596a(1, this.f44877b) + 0;
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
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f44877b = m19558h;
                    }
                } else if (m19562l == 18) {
                    this.f44878c = c3805a.m19561k();
                } else if (m19562l == 26) {
                    this.f44879d = c3805a.m19561k();
                } else if (m19562l == 32) {
                    this.f44880e = c3805a.m19559i();
                } else if (m19562l != 40) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44881f = c3805a.m19559i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a[] aVarArr = this.f44874b;
        int i2 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f44874b;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    i3 += C3831b.m19598a(1, aVar);
                }
                i2++;
            }
            i2 = i3;
        }
        return C3831b.m19600a(2, this.f44875c) + i2;
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
                a[] aVarArr = this.f44874b;
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
                this.f44874b = aVarArr2;
            } else if (m19562l != 16) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f44875c = c3805a.m19549c();
            }
        }
        return this;
    }
}

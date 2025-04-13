package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ag */
/* loaded from: classes2.dex */
public final class C3822ag extends AbstractC3909e {

    /* renamed from: b */
    public a[] f44744b;

    public C3822ag() {
        m19577b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a[] aVarArr = this.f44744b;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.f44744b;
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
    public C3822ag m19577b() {
        this.f44744b = a.m19578c();
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$b */
    public static final class b extends AbstractC3909e {

        /* renamed from: b */
        public boolean f44750b;

        /* renamed from: c */
        public boolean f44751c;

        public b() {
            m19580b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            boolean z = this.f44750b;
            if (z) {
                c3831b.m19617b(1, z);
            }
            boolean z2 = this.f44751c;
            if (z2) {
                c3831b.m19617b(2, z2);
            }
        }

        /* renamed from: b */
        public b m19580b() {
            this.f44750b = false;
            this.f44751c = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            boolean z = this.f44750b;
            int m19600a = z ? 0 + C3831b.m19600a(1, z) : 0;
            boolean z2 = this.f44751c;
            return z2 ? m19600a + C3831b.m19600a(2, z2) : m19600a;
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
                    this.f44750b = c3805a.m19549c();
                } else if (m19562l != 16) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44751c = c3805a.m19549c();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a[] aVarArr = this.f44744b;
        int i2 = 0;
        if (aVarArr == null || aVarArr.length <= 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.f44744b;
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

    /* renamed from: com.yandex.metrica.impl.ob.ag$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: f */
        private static volatile a[] f44745f;

        /* renamed from: b */
        public byte[] f44746b;

        /* renamed from: c */
        public int f44747c;

        /* renamed from: d */
        public b f44748d;

        /* renamed from: e */
        public c f44749e;

        public a() {
            m19579b();
        }

        /* renamed from: c */
        public static a[] m19578c() {
            if (f44745f == null) {
                synchronized (C3857c.f44857a) {
                    if (f44745f == null) {
                        f44745f = new a[0];
                    }
                }
            }
            return f44745f;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19618b(1, this.f44746b);
            c3831b.m19622d(2, this.f44747c);
            b bVar = this.f44748d;
            if (bVar != null) {
                c3831b.m19615b(3, bVar);
            }
            c cVar = this.f44749e;
            if (cVar != null) {
                c3831b.m19615b(4, cVar);
            }
        }

        /* renamed from: b */
        public a m19579b() {
            this.f44746b = C3961g.f45152d;
            this.f44747c = 0;
            this.f44748d = null;
            this.f44749e = null;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19596a = C3831b.m19596a(2, this.f44747c) + C3831b.m19601a(1, this.f44746b) + 0;
            b bVar = this.f44748d;
            if (bVar != null) {
                m19596a += C3831b.m19598a(3, bVar);
            }
            c cVar = this.f44749e;
            return cVar != null ? m19596a + C3831b.m19598a(4, cVar) : m19596a;
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
                    this.f44746b = c3805a.m19550d();
                } else if (m19562l == 16) {
                    int m19558h = c3805a.m19558h();
                    if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                        this.f44747c = m19558h;
                    }
                } else if (m19562l == 26) {
                    if (this.f44748d == null) {
                        this.f44748d = new b();
                    }
                    c3805a.m19545a(this.f44748d);
                } else if (m19562l != 34) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    if (this.f44749e == null) {
                        this.f44749e = new c();
                    }
                    c3805a.m19545a(this.f44749e);
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
            if (m19562l != 10) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a = C3961g.m19920a(c3805a, 10);
                a[] aVarArr = this.f44744b;
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
                this.f44744b = aVarArr2;
            }
        }
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ag$c */
    public static final class c extends AbstractC3909e {

        /* renamed from: b */
        public byte[] f44752b;

        /* renamed from: c */
        public double f44753c;

        /* renamed from: d */
        public double f44754d;

        /* renamed from: e */
        public boolean f44755e;

        public c() {
            m19581b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            if (!Arrays.equals(this.f44752b, C3961g.f45152d)) {
                c3831b.m19618b(1, this.f44752b);
            }
            if (Double.doubleToLongBits(this.f44753c) != Double.doubleToLongBits(0.0d)) {
                c3831b.m19614b(2, this.f44753c);
            }
            if (Double.doubleToLongBits(this.f44754d) != Double.doubleToLongBits(0.0d)) {
                c3831b.m19614b(3, this.f44754d);
            }
            boolean z = this.f44755e;
            if (z) {
                c3831b.m19617b(4, z);
            }
        }

        /* renamed from: b */
        public c m19581b() {
            this.f44752b = C3961g.f45152d;
            this.f44753c = 0.0d;
            this.f44754d = 0.0d;
            this.f44755e = false;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int m19601a = Arrays.equals(this.f44752b, C3961g.f45152d) ? 0 : 0 + C3831b.m19601a(1, this.f44752b);
            if (Double.doubleToLongBits(this.f44753c) != Double.doubleToLongBits(0.0d)) {
                m19601a += C3831b.m19595a(2, this.f44753c);
            }
            if (Double.doubleToLongBits(this.f44754d) != Double.doubleToLongBits(0.0d)) {
                m19601a += C3831b.m19595a(3, this.f44754d);
            }
            boolean z = this.f44755e;
            return z ? m19601a + C3831b.m19600a(4, z) : m19601a;
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
                    this.f44752b = c3805a.m19550d();
                } else if (m19562l == 17) {
                    this.f44753c = Double.longBitsToDouble(c3805a.m19556g());
                } else if (m19562l == 25) {
                    this.f44754d = Double.longBitsToDouble(c3805a.m19556g());
                } else if (m19562l != 32) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    this.f44755e = c3805a.m19549c();
                }
            }
            return this;
        }
    }
}

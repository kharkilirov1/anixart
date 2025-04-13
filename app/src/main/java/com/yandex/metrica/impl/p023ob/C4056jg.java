package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jg */
/* loaded from: classes2.dex */
public final class C4056jg extends AbstractC3909e {

    /* renamed from: b */
    public a[] f45417b;

    /* renamed from: c */
    public String f45418c;

    /* renamed from: d */
    public long f45419d;

    /* renamed from: e */
    public boolean f45420e;

    /* renamed from: f */
    public boolean f45421f;

    public C4056jg() {
        m20093b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a[] aVarArr = this.f45417b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f45417b;
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
        c3831b.m19616b(2, this.f45418c);
        c3831b.m19620c(3, this.f45419d);
        c3831b.m19617b(4, this.f45420e);
        c3831b.m19617b(5, this.f45421f);
    }

    /* renamed from: b */
    public C4056jg m20093b() {
        this.f45417b = a.m20094c();
        this.f45418c = "";
        this.f45419d = 0L;
        this.f45420e = false;
        this.f45421f = false;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jg$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: d */
        private static volatile a[] f45422d;

        /* renamed from: b */
        public String f45423b;

        /* renamed from: c */
        public String[] f45424c;

        public a() {
            m20095b();
        }

        /* renamed from: c */
        public static a[] m20094c() {
            if (f45422d == null) {
                synchronized (C3857c.f44857a) {
                    if (f45422d == null) {
                        f45422d = new a[0];
                    }
                }
            }
            return f45422d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            c3831b.m19616b(1, this.f45423b);
            String[] strArr = this.f45424c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f45424c;
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
        public a m20095b() {
            this.f45423b = "";
            this.f45424c = C3961g.f45150b;
            this.f44976a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            int i2 = 0;
            int m19599a = C3831b.m19599a(1, this.f45423b) + 0;
            String[] strArr = this.f45424c;
            if (strArr == null || strArr.length <= 0) {
                return m19599a;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f45424c;
                if (i2 >= strArr2.length) {
                    return m19599a + i3 + (i4 * 1);
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 = C3831b.m19604a(str) + i3;
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
                if (m19562l == 10) {
                    this.f45423b = c3805a.m19561k();
                } else if (m19562l != 18) {
                    if (!c3805a.m19555f(m19562l)) {
                        break;
                    }
                } else {
                    int m19920a = C3961g.m19920a(c3805a, 18);
                    String[] strArr = this.f45424c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = m19920a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = c3805a.m19561k();
                        c3805a.m19562l();
                        length++;
                    }
                    strArr2[length] = c3805a.m19561k();
                    this.f45424c = strArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a[] aVarArr = this.f45417b;
        int i2 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f45417b;
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
        return C3831b.m19600a(5, this.f45421f) + C3831b.m19600a(4, this.f45420e) + C3831b.m19597a(3, this.f45419d) + C3831b.m19599a(2, this.f45418c) + i2;
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
                a[] aVarArr = this.f45417b;
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
                this.f45417b = aVarArr2;
            } else if (m19562l == 18) {
                this.f45418c = c3805a.m19561k();
            } else if (m19562l == 24) {
                this.f45419d = c3805a.m19559i();
            } else if (m19562l == 32) {
                this.f45420e = c3805a.m19549c();
            } else if (m19562l != 40) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f45421f = c3805a.m19549c();
            }
        }
        return this;
    }
}

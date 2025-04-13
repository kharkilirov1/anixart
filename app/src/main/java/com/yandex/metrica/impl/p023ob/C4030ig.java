package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ig */
/* loaded from: classes2.dex */
public final class C4030ig extends AbstractC3909e {

    /* renamed from: b */
    public a f45342b;

    /* renamed from: c */
    public boolean f45343c;

    public C4030ig() {
        m20056b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        a aVar = this.f45342b;
        if (aVar != null) {
            c3831b.m19615b(1, aVar);
        }
        boolean z = this.f45343c;
        if (z) {
            c3831b.m19617b(2, z);
        }
    }

    /* renamed from: b */
    public C4030ig m20056b() {
        this.f45342b = null;
        this.f45343c = false;
        this.f44976a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ig$a */
    public static final class a extends AbstractC3909e {

        /* renamed from: b */
        public C7002a[] f45344b;

        public a() {
            m20057b();
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public void mo18312a(C3831b c3831b) throws IOException {
            C7002a[] c7002aArr = this.f45344b;
            if (c7002aArr == null || c7002aArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                C7002a[] c7002aArr2 = this.f45344b;
                if (i2 >= c7002aArr2.length) {
                    return;
                }
                C7002a c7002a = c7002aArr2[i2];
                if (c7002a != null) {
                    c3831b.m19615b(1, c7002a);
                }
                i2++;
            }
        }

        /* renamed from: b */
        public a m20057b() {
            this.f45344b = C7002a.m20058c();
            this.f44976a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.ig$a$a, reason: collision with other inner class name */
        public static final class C7002a extends AbstractC3909e {

            /* renamed from: d */
            private static volatile C7002a[] f45345d;

            /* renamed from: b */
            public String f45346b;

            /* renamed from: c */
            public String f45347c;

            public C7002a() {
                m20059b();
            }

            /* renamed from: c */
            public static C7002a[] m20058c() {
                if (f45345d == null) {
                    synchronized (C3857c.f44857a) {
                        if (f45345d == null) {
                            f45345d = new C7002a[0];
                        }
                    }
                }
                return f45345d;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public void mo18312a(C3831b c3831b) throws IOException {
                c3831b.m19616b(1, this.f45346b);
                if (this.f45347c.equals("")) {
                    return;
                }
                c3831b.m19616b(2, this.f45347c);
            }

            /* renamed from: b */
            public C7002a m20059b() {
                this.f45346b = "";
                this.f45347c = "";
                this.f44976a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
            /* renamed from: a */
            public int mo18310a() {
                int m19599a = C3831b.m19599a(1, this.f45346b) + 0;
                return !this.f45347c.equals("") ? m19599a + C3831b.m19599a(2, this.f45347c) : m19599a;
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
                        this.f45346b = c3805a.m19561k();
                    } else if (m19562l != 18) {
                        if (!c3805a.m19555f(m19562l)) {
                            break;
                        }
                    } else {
                        this.f45347c = c3805a.m19561k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
        /* renamed from: a */
        public int mo18310a() {
            C7002a[] c7002aArr = this.f45344b;
            int i2 = 0;
            if (c7002aArr == null || c7002aArr.length <= 0) {
                return 0;
            }
            int i3 = 0;
            while (true) {
                C7002a[] c7002aArr2 = this.f45344b;
                if (i2 >= c7002aArr2.length) {
                    return i3;
                }
                C7002a c7002a = c7002aArr2[i2];
                if (c7002a != null) {
                    i3 += C3831b.m19598a(1, c7002a);
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
                    C7002a[] c7002aArr = this.f45344b;
                    int length = c7002aArr == null ? 0 : c7002aArr.length;
                    int i2 = m19920a + length;
                    C7002a[] c7002aArr2 = new C7002a[i2];
                    if (length != 0) {
                        System.arraycopy(c7002aArr, 0, c7002aArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        c7002aArr2[length] = new C7002a();
                        c3805a.m19545a(c7002aArr2[length]);
                        c3805a.m19562l();
                        length++;
                    }
                    c7002aArr2[length] = new C7002a();
                    c3805a.m19545a(c7002aArr2[length]);
                    this.f45344b = c7002aArr2;
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        a aVar = this.f45342b;
        int m19598a = aVar != null ? 0 + C3831b.m19598a(1, aVar) : 0;
        boolean z = this.f45343c;
        return z ? m19598a + C3831b.m19600a(2, z) : m19598a;
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
                if (this.f45342b == null) {
                    this.f45342b = new a();
                }
                c3805a.m19545a(this.f45342b);
            } else if (m19562l != 16) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f45343c = c3805a.m19549c();
            }
        }
        return this;
    }
}

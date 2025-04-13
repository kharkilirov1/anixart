package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Qf */
/* loaded from: classes2.dex */
public final class C3572Qf extends AbstractC3909e {

    /* renamed from: g */
    private static volatile C3572Qf[] f43706g;

    /* renamed from: b */
    public String f43707b;

    /* renamed from: c */
    public String f43708c;

    /* renamed from: d */
    public C3522Of[] f43709d;

    /* renamed from: e */
    public C3572Qf f43710e;

    /* renamed from: f */
    public C3572Qf[] f43711f;

    public C3572Qf() {
        m18817b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        c3831b.m19616b(1, this.f43707b);
        if (!this.f43708c.equals("")) {
            c3831b.m19616b(2, this.f43708c);
        }
        C3522Of[] c3522OfArr = this.f43709d;
        int i2 = 0;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43709d;
                if (i3 >= c3522OfArr2.length) {
                    break;
                }
                C3522Of c3522Of = c3522OfArr2[i3];
                if (c3522Of != null) {
                    c3831b.m19615b(3, c3522Of);
                }
                i3++;
            }
        }
        C3572Qf c3572Qf = this.f43710e;
        if (c3572Qf != null) {
            c3831b.m19615b(4, c3572Qf);
        }
        C3572Qf[] c3572QfArr = this.f43711f;
        if (c3572QfArr == null || c3572QfArr.length <= 0) {
            return;
        }
        while (true) {
            C3572Qf[] c3572QfArr2 = this.f43711f;
            if (i2 >= c3572QfArr2.length) {
                return;
            }
            C3572Qf c3572Qf2 = c3572QfArr2[i2];
            if (c3572Qf2 != null) {
                c3831b.m19615b(5, c3572Qf2);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C3572Qf m18817b() {
        this.f43707b = "";
        this.f43708c = "";
        this.f43709d = C3522Of.m18669c();
        this.f43710e = null;
        if (f43706g == null) {
            synchronized (C3857c.f44857a) {
                if (f43706g == null) {
                    f43706g = new C3572Qf[0];
                }
            }
        }
        this.f43711f = f43706g;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = 0;
        int m19599a = C3831b.m19599a(1, this.f43707b) + 0;
        if (!this.f43708c.equals("")) {
            m19599a += C3831b.m19599a(2, this.f43708c);
        }
        C3522Of[] c3522OfArr = this.f43709d;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43709d;
                if (i3 >= c3522OfArr2.length) {
                    break;
                }
                C3522Of c3522Of = c3522OfArr2[i3];
                if (c3522Of != null) {
                    m19599a += C3831b.m19598a(3, c3522Of);
                }
                i3++;
            }
        }
        C3572Qf c3572Qf = this.f43710e;
        if (c3572Qf != null) {
            m19599a += C3831b.m19598a(4, c3572Qf);
        }
        C3572Qf[] c3572QfArr = this.f43711f;
        if (c3572QfArr != null && c3572QfArr.length > 0) {
            while (true) {
                C3572Qf[] c3572QfArr2 = this.f43711f;
                if (i2 >= c3572QfArr2.length) {
                    break;
                }
                C3572Qf c3572Qf2 = c3572QfArr2[i2];
                if (c3572Qf2 != null) {
                    m19599a += C3831b.m19598a(5, c3572Qf2);
                }
                i2++;
            }
        }
        return m19599a;
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
                this.f43707b = c3805a.m19561k();
            } else if (m19562l == 18) {
                this.f43708c = c3805a.m19561k();
            } else if (m19562l == 26) {
                int m19920a = C3961g.m19920a(c3805a, 26);
                C3522Of[] c3522OfArr = this.f43709d;
                int length = c3522OfArr == null ? 0 : c3522OfArr.length;
                int i2 = m19920a + length;
                C3522Of[] c3522OfArr2 = new C3522Of[i2];
                if (length != 0) {
                    System.arraycopy(c3522OfArr, 0, c3522OfArr2, 0, length);
                }
                while (length < i2 - 1) {
                    c3522OfArr2[length] = new C3522Of();
                    c3805a.m19545a(c3522OfArr2[length]);
                    c3805a.m19562l();
                    length++;
                }
                c3522OfArr2[length] = new C3522Of();
                c3805a.m19545a(c3522OfArr2[length]);
                this.f43709d = c3522OfArr2;
            } else if (m19562l == 34) {
                if (this.f43710e == null) {
                    this.f43710e = new C3572Qf();
                }
                c3805a.m19545a(this.f43710e);
            } else if (m19562l != 42) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a2 = C3961g.m19920a(c3805a, 42);
                C3572Qf[] c3572QfArr = this.f43711f;
                int length2 = c3572QfArr == null ? 0 : c3572QfArr.length;
                int i3 = m19920a2 + length2;
                C3572Qf[] c3572QfArr2 = new C3572Qf[i3];
                if (length2 != 0) {
                    System.arraycopy(c3572QfArr, 0, c3572QfArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    c3572QfArr2[length2] = new C3572Qf();
                    c3805a.m19545a(c3572QfArr2[length2]);
                    c3805a.m19562l();
                    length2++;
                }
                c3572QfArr2[length2] = new C3572Qf();
                c3805a.m19545a(c3572QfArr2[length2]);
                this.f43711f = c3572QfArr2;
            }
        }
        return this;
    }
}

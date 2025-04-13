package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Pf */
/* loaded from: classes2.dex */
public final class C3547Pf extends AbstractC3909e {

    /* renamed from: h */
    private static volatile C3547Pf[] f43647h;

    /* renamed from: b */
    public String f43648b;

    /* renamed from: c */
    public int f43649c;

    /* renamed from: d */
    public long f43650d;

    /* renamed from: e */
    public String f43651e;

    /* renamed from: f */
    public int f43652f;

    /* renamed from: g */
    public C3522Of[] f43653g;

    public C3547Pf() {
        m18756b();
    }

    /* renamed from: c */
    public static C3547Pf[] m18755c() {
        if (f43647h == null) {
            synchronized (C3857c.f44857a) {
                if (f43647h == null) {
                    f43647h = new C3547Pf[0];
                }
            }
        }
        return f43647h;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        c3831b.m19616b(1, this.f43648b);
        c3831b.m19625e(2, this.f43649c);
        c3831b.m19623d(3, this.f43650d);
        if (!this.f43651e.equals("")) {
            c3831b.m19616b(4, this.f43651e);
        }
        int i2 = this.f43652f;
        if (i2 != 0) {
            c3831b.m19627f(5, i2);
        }
        C3522Of[] c3522OfArr = this.f43653g;
        if (c3522OfArr == null || c3522OfArr.length <= 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            C3522Of[] c3522OfArr2 = this.f43653g;
            if (i3 >= c3522OfArr2.length) {
                return;
            }
            C3522Of c3522Of = c3522OfArr2[i3];
            if (c3522Of != null) {
                c3831b.m19615b(6, c3522Of);
            }
            i3++;
        }
    }

    /* renamed from: b */
    public C3547Pf m18756b() {
        this.f43648b = "";
        this.f43649c = 0;
        this.f43650d = 0L;
        this.f43651e = "";
        this.f43652f = 0;
        this.f43653g = C3522Of.m18669c();
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = 0;
        int m19607b = C3831b.m19607b(2, this.f43649c) + C3831b.m19599a(1, this.f43648b) + 0;
        long j2 = this.f43650d;
        int m19602a = C3831b.m19602a((j2 >> 63) ^ (j2 << 1)) + C3831b.m19609c(3) + m19607b;
        if (!this.f43651e.equals("")) {
            m19602a += C3831b.m19599a(4, this.f43651e);
        }
        int i3 = this.f43652f;
        if (i3 != 0) {
            m19602a += C3831b.m19610c(5, i3);
        }
        C3522Of[] c3522OfArr = this.f43653g;
        if (c3522OfArr != null && c3522OfArr.length > 0) {
            while (true) {
                C3522Of[] c3522OfArr2 = this.f43653g;
                if (i2 >= c3522OfArr2.length) {
                    break;
                }
                C3522Of c3522Of = c3522OfArr2[i2];
                if (c3522Of != null) {
                    m19602a += C3831b.m19598a(6, c3522Of);
                }
                i2++;
            }
        }
        return m19602a;
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
                this.f43648b = c3805a.m19561k();
            } else if (m19562l == 16) {
                this.f43649c = c3805a.m19560j();
            } else if (m19562l == 24) {
                long m19559i = c3805a.m19559i();
                this.f43650d = (-(m19559i & 1)) ^ (m19559i >>> 1);
            } else if (m19562l == 34) {
                this.f43651e = c3805a.m19561k();
            } else if (m19562l == 40) {
                this.f43652f = c3805a.m19558h();
            } else if (m19562l != 50) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19920a = C3961g.m19920a(c3805a, 50);
                C3522Of[] c3522OfArr = this.f43653g;
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
                this.f43653g = c3522OfArr2;
            }
        }
        return this;
    }
}

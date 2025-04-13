package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Yf */
/* loaded from: classes2.dex */
public final class C3771Yf extends AbstractC3909e {

    /* renamed from: b */
    public String f44584b;

    /* renamed from: c */
    public long f44585c;

    /* renamed from: d */
    public long f44586d;

    /* renamed from: e */
    public int f44587e;

    public C3771Yf() {
        m19477b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        if (!this.f44584b.equals("")) {
            c3831b.m19616b(1, this.f44584b);
        }
        long j2 = this.f44585c;
        if (j2 != 0) {
            c3831b.m19626e(2, j2);
        }
        long j3 = this.f44586d;
        if (j3 != 0) {
            c3831b.m19626e(3, j3);
        }
        int i2 = this.f44587e;
        if (i2 != 0) {
            c3831b.m19622d(4, i2);
        }
    }

    /* renamed from: b */
    public C3771Yf m19477b() {
        this.f44584b = "";
        this.f44585c = 0L;
        this.f44586d = 0L;
        this.f44587e = 0;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int m19599a = this.f44584b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f44584b);
        long j2 = this.f44585c;
        if (j2 != 0) {
            m19599a += C3831b.m19608b(2, j2);
        }
        long j3 = this.f44586d;
        if (j3 != 0) {
            m19599a += C3831b.m19608b(3, j3);
        }
        int i2 = this.f44587e;
        return i2 != 0 ? m19599a + C3831b.m19596a(4, i2) : m19599a;
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
                this.f44584b = c3805a.m19561k();
            } else if (m19562l == 16) {
                this.f44585c = c3805a.m19559i();
            } else if (m19562l == 24) {
                this.f44586d = c3805a.m19559i();
            } else if (m19562l != 32) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19558h = c3805a.m19558h();
                if (m19558h == 0 || m19558h == 1 || m19558h == 2) {
                    this.f44587e = m19558h;
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public static C3771Yf m19476a(byte[] bArr) throws C3883d {
        return (C3771Yf) AbstractC3909e.m19776a(new C3771Yf(), bArr);
    }
}

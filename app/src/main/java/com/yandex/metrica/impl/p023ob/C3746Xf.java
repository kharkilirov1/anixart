package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Xf */
/* loaded from: classes2.dex */
public final class C3746Xf extends AbstractC3909e {

    /* renamed from: b */
    public byte[] f44505b;

    /* renamed from: c */
    public long f44506c;

    /* renamed from: d */
    public long f44507d;

    /* renamed from: e */
    public int f44508e;

    public C3746Xf() {
        m19391b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        c3831b.m19618b(1, this.f44505b);
        long j2 = this.f44506c;
        if (j2 != 0) {
            c3831b.m19626e(2, j2);
        }
        long j3 = this.f44507d;
        if (j3 != 0) {
            c3831b.m19626e(3, j3);
        }
        int i2 = this.f44508e;
        if (i2 != 0) {
            c3831b.m19622d(4, i2);
        }
    }

    /* renamed from: b */
    public C3746Xf m19391b() {
        this.f44505b = C3961g.f45152d;
        this.f44506c = 0L;
        this.f44507d = 0L;
        this.f44508e = 0;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int m19601a = C3831b.m19601a(1, this.f44505b) + 0;
        long j2 = this.f44506c;
        if (j2 != 0) {
            m19601a += C3831b.m19608b(2, j2);
        }
        long j3 = this.f44507d;
        if (j3 != 0) {
            m19601a += C3831b.m19608b(3, j3);
        }
        int i2 = this.f44508e;
        return i2 != 0 ? m19601a + C3831b.m19596a(4, i2) : m19601a;
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
                this.f44505b = c3805a.m19550d();
            } else if (m19562l == 16) {
                this.f44506c = c3805a.m19559i();
            } else if (m19562l == 24) {
                this.f44507d = c3805a.m19559i();
            } else if (m19562l != 32) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19558h = c3805a.m19558h();
                if (m19558h == 0 || m19558h == 1 || m19558h == 2) {
                    this.f44508e = m19558h;
                }
            }
        }
        return this;
    }
}

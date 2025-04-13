package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Jf */
/* loaded from: classes2.dex */
public final class C3397Jf extends AbstractC3909e {

    /* renamed from: b */
    public C3372If f43245b;

    /* renamed from: c */
    public String f43246c;

    /* renamed from: d */
    public int f43247d;

    public C3397Jf() {
        m18411b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        C3372If c3372If = this.f43245b;
        if (c3372If != null) {
            c3831b.m19615b(1, c3372If);
        }
        if (!this.f43246c.equals("")) {
            c3831b.m19616b(2, this.f43246c);
        }
        int i2 = this.f43247d;
        if (i2 != -1) {
            c3831b.m19622d(3, i2);
        }
    }

    /* renamed from: b */
    public C3397Jf m18411b() {
        this.f43245b = null;
        this.f43246c = "";
        this.f43247d = -1;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        C3372If c3372If = this.f43245b;
        int m19598a = c3372If != null ? 0 + C3831b.m19598a(1, c3372If) : 0;
        if (!this.f43246c.equals("")) {
            m19598a += C3831b.m19599a(2, this.f43246c);
        }
        int i2 = this.f43247d;
        return i2 != -1 ? m19598a + C3831b.m19596a(3, i2) : m19598a;
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
                if (this.f43245b == null) {
                    this.f43245b = new C3372If();
                }
                c3805a.m19545a(this.f43245b);
            } else if (m19562l == 18) {
                this.f43246c = c3805a.m19561k();
            } else if (m19562l != 24) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                int m19558h = c3805a.m19558h();
                if (m19558h == -1 || m19558h == 0 || m19558h == 1) {
                    this.f43247d = m19558h;
                }
            }
        }
        return this;
    }
}

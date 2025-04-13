package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Nf */
/* loaded from: classes2.dex */
public final class C3497Nf extends AbstractC3909e {

    /* renamed from: b */
    public int f43471b;

    /* renamed from: c */
    public String f43472c;

    public C3497Nf() {
        m18615b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        int i2 = this.f43471b;
        if (i2 != 0) {
            c3831b.m19622d(1, i2);
        }
        if (this.f43472c.equals("")) {
            return;
        }
        c3831b.m19616b(2, this.f43472c);
    }

    /* renamed from: b */
    public C3497Nf m18615b() {
        this.f43471b = 0;
        this.f43472c = "";
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int i2 = this.f43471b;
        int m19596a = i2 != 0 ? 0 + C3831b.m19596a(1, i2) : 0;
        return !this.f43472c.equals("") ? m19596a + C3831b.m19599a(2, this.f43472c) : m19596a;
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
                if (m19558h == 0 || m19558h == 1 || m19558h == 2 || m19558h == 3) {
                    this.f43471b = m19558h;
                }
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f43472c = c3805a.m19561k();
            }
        }
        return this;
    }
}

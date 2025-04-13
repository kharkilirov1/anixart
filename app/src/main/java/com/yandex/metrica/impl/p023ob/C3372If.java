package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.If */
/* loaded from: classes2.dex */
public final class C3372If extends AbstractC3909e {

    /* renamed from: b */
    public C3547Pf f43123b;

    /* renamed from: c */
    public C3547Pf[] f43124c;

    /* renamed from: d */
    public String f43125d;

    public C3372If() {
        m18313b();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        C3547Pf c3547Pf = this.f43123b;
        if (c3547Pf != null) {
            c3831b.m19615b(1, c3547Pf);
        }
        C3547Pf[] c3547PfArr = this.f43124c;
        if (c3547PfArr != null && c3547PfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3547Pf[] c3547PfArr2 = this.f43124c;
                if (i2 >= c3547PfArr2.length) {
                    break;
                }
                C3547Pf c3547Pf2 = c3547PfArr2[i2];
                if (c3547Pf2 != null) {
                    c3831b.m19615b(2, c3547Pf2);
                }
                i2++;
            }
        }
        if (this.f43125d.equals("")) {
            return;
        }
        c3831b.m19616b(3, this.f43125d);
    }

    /* renamed from: b */
    public C3372If m18313b() {
        this.f43123b = null;
        this.f43124c = C3547Pf.m18755c();
        this.f43125d = "";
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        C3547Pf c3547Pf = this.f43123b;
        int i2 = 0;
        int m19598a = c3547Pf != null ? C3831b.m19598a(1, c3547Pf) + 0 : 0;
        C3547Pf[] c3547PfArr = this.f43124c;
        if (c3547PfArr != null && c3547PfArr.length > 0) {
            while (true) {
                C3547Pf[] c3547PfArr2 = this.f43124c;
                if (i2 >= c3547PfArr2.length) {
                    break;
                }
                C3547Pf c3547Pf2 = c3547PfArr2[i2];
                if (c3547Pf2 != null) {
                    m19598a += C3831b.m19598a(2, c3547Pf2);
                }
                i2++;
            }
        }
        return !this.f43125d.equals("") ? m19598a + C3831b.m19599a(3, this.f43125d) : m19598a;
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
                if (this.f43123b == null) {
                    this.f43123b = new C3547Pf();
                }
                c3805a.m19545a(this.f43123b);
            } else if (m19562l == 18) {
                int m19920a = C3961g.m19920a(c3805a, 18);
                C3547Pf[] c3547PfArr = this.f43124c;
                int length = c3547PfArr == null ? 0 : c3547PfArr.length;
                int i2 = m19920a + length;
                C3547Pf[] c3547PfArr2 = new C3547Pf[i2];
                if (length != 0) {
                    System.arraycopy(c3547PfArr, 0, c3547PfArr2, 0, length);
                }
                while (length < i2 - 1) {
                    c3547PfArr2[length] = new C3547Pf();
                    c3805a.m19545a(c3547PfArr2[length]);
                    c3805a.m19562l();
                    length++;
                }
                c3547PfArr2[length] = new C3547Pf();
                c3805a.m19545a(c3547PfArr2[length]);
                this.f43124c = c3547PfArr2;
            } else if (m19562l != 26) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f43125d = c3805a.m19561k();
            }
        }
        return this;
    }
}

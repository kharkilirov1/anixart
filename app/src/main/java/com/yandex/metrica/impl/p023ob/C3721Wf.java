package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Wf */
/* loaded from: classes2.dex */
public final class C3721Wf extends AbstractC3909e {

    /* renamed from: g */
    private static volatile C3721Wf[] f44385g;

    /* renamed from: b */
    public String f44386b;

    /* renamed from: c */
    public int f44387c;

    /* renamed from: d */
    public String f44388d;

    /* renamed from: e */
    public boolean f44389e;

    /* renamed from: f */
    public long f44390f;

    public C3721Wf() {
        m19359b();
    }

    /* renamed from: c */
    public static C3721Wf[] m19358c() {
        if (f44385g == null) {
            synchronized (C3857c.f44857a) {
                if (f44385g == null) {
                    f44385g = new C3721Wf[0];
                }
            }
        }
        return f44385g;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        c3831b.m19616b(1, this.f44386b);
        int i2 = this.f44387c;
        if (i2 != 0) {
            c3831b.m19625e(2, i2);
        }
        if (!this.f44388d.equals("")) {
            c3831b.m19616b(3, this.f44388d);
        }
        boolean z = this.f44389e;
        if (z) {
            c3831b.m19617b(4, z);
        }
        long j2 = this.f44390f;
        if (j2 != 0) {
            c3831b.m19626e(5, j2);
        }
    }

    /* renamed from: b */
    public C3721Wf m19359b() {
        this.f44386b = "";
        this.f44387c = 0;
        this.f44388d = "";
        this.f44389e = false;
        this.f44390f = 0L;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int m19599a = C3831b.m19599a(1, this.f44386b) + 0;
        int i2 = this.f44387c;
        if (i2 != 0) {
            m19599a += C3831b.m19607b(2, i2);
        }
        if (!this.f44388d.equals("")) {
            m19599a += C3831b.m19599a(3, this.f44388d);
        }
        boolean z = this.f44389e;
        if (z) {
            m19599a += C3831b.m19600a(4, z);
        }
        long j2 = this.f44390f;
        return j2 != 0 ? m19599a + C3831b.m19608b(5, j2) : m19599a;
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
                this.f44386b = c3805a.m19561k();
            } else if (m19562l == 16) {
                this.f44387c = c3805a.m19560j();
            } else if (m19562l == 26) {
                this.f44388d = c3805a.m19561k();
            } else if (m19562l == 32) {
                this.f44389e = c3805a.m19549c();
            } else if (m19562l != 40) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f44390f = c3805a.m19559i();
            }
        }
        return this;
    }
}

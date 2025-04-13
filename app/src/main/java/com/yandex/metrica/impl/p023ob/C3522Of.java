package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Of */
/* loaded from: classes2.dex */
public final class C3522Of extends AbstractC3909e {

    /* renamed from: h */
    private static volatile C3522Of[] f43557h;

    /* renamed from: b */
    public String f43558b;

    /* renamed from: c */
    public String f43559c;

    /* renamed from: d */
    public int f43560d;

    /* renamed from: e */
    public String f43561e;

    /* renamed from: f */
    public boolean f43562f;

    /* renamed from: g */
    public int f43563g;

    public C3522Of() {
        m18670b();
    }

    /* renamed from: c */
    public static C3522Of[] m18669c() {
        if (f43557h == null) {
            synchronized (C3857c.f44857a) {
                if (f43557h == null) {
                    f43557h = new C3522Of[0];
                }
            }
        }
        return f43557h;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        if (!this.f43558b.equals("")) {
            c3831b.m19616b(1, this.f43558b);
        }
        if (!this.f43559c.equals("")) {
            c3831b.m19616b(2, this.f43559c);
        }
        int i2 = this.f43560d;
        if (i2 != -1) {
            c3831b.m19625e(3, i2);
        }
        if (!this.f43561e.equals("")) {
            c3831b.m19616b(4, this.f43561e);
        }
        boolean z = this.f43562f;
        if (z) {
            c3831b.m19617b(5, z);
        }
        int i3 = this.f43563g;
        if (i3 != -1) {
            c3831b.m19625e(6, i3);
        }
    }

    /* renamed from: b */
    public C3522Of m18670b() {
        this.f43558b = "";
        this.f43559c = "";
        this.f43560d = -1;
        this.f43561e = "";
        this.f43562f = false;
        this.f43563g = -1;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        int m19599a = this.f43558b.equals("") ? 0 : 0 + C3831b.m19599a(1, this.f43558b);
        if (!this.f43559c.equals("")) {
            m19599a += C3831b.m19599a(2, this.f43559c);
        }
        int i2 = this.f43560d;
        if (i2 != -1) {
            m19599a += C3831b.m19607b(3, i2);
        }
        if (!this.f43561e.equals("")) {
            m19599a += C3831b.m19599a(4, this.f43561e);
        }
        boolean z = this.f43562f;
        if (z) {
            m19599a += C3831b.m19600a(5, z);
        }
        int i3 = this.f43563g;
        return i3 != -1 ? m19599a + C3831b.m19607b(6, i3) : m19599a;
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
                this.f43558b = c3805a.m19561k();
            } else if (m19562l == 18) {
                this.f43559c = c3805a.m19561k();
            } else if (m19562l == 24) {
                this.f43560d = c3805a.m19560j();
            } else if (m19562l == 34) {
                this.f43561e = c3805a.m19561k();
            } else if (m19562l == 40) {
                this.f43562f = c3805a.m19549c();
            } else if (m19562l != 48) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f43563g = c3805a.m19560j();
            }
        }
        return this;
    }
}

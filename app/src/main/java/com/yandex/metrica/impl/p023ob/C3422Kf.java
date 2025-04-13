package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Kf */
/* loaded from: classes2.dex */
public final class C3422Kf extends AbstractC3909e {

    /* renamed from: d */
    private static volatile C3422Kf[] f43279d;

    /* renamed from: b */
    public byte[] f43280b;

    /* renamed from: c */
    public byte[] f43281c;

    public C3422Kf() {
        m18447b();
    }

    /* renamed from: c */
    public static C3422Kf[] m18446c() {
        if (f43279d == null) {
            synchronized (C3857c.f44857a) {
                if (f43279d == null) {
                    f43279d = new C3422Kf[0];
                }
            }
        }
        return f43279d;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
        byte[] bArr = this.f43280b;
        byte[] bArr2 = C3961g.f45152d;
        if (!Arrays.equals(bArr, bArr2)) {
            c3831b.m19618b(1, this.f43280b);
        }
        if (Arrays.equals(this.f43281c, bArr2)) {
            return;
        }
        c3831b.m19618b(2, this.f43281c);
    }

    /* renamed from: b */
    public C3422Kf m18447b() {
        byte[] bArr = C3961g.f45152d;
        this.f43280b = bArr;
        this.f43281c = bArr;
        this.f44976a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3909e
    /* renamed from: a */
    public int mo18310a() {
        byte[] bArr = this.f43280b;
        byte[] bArr2 = C3961g.f45152d;
        int m19601a = Arrays.equals(bArr, bArr2) ? 0 : 0 + C3831b.m19601a(1, this.f43280b);
        return !Arrays.equals(this.f43281c, bArr2) ? m19601a + C3831b.m19601a(2, this.f43281c) : m19601a;
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
                this.f43280b = c3805a.m19550d();
            } else if (m19562l != 18) {
                if (!c3805a.m19555f(m19562l)) {
                    break;
                }
            } else {
                this.f43281c = c3805a.m19550d();
            }
        }
        return this;
    }
}

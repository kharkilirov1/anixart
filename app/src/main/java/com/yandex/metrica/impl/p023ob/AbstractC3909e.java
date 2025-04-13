package com.yandex.metrica.impl.p023ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3909e {

    /* renamed from: a */
    public volatile int f44976a = -1;

    /* renamed from: a */
    public static final byte[] m19777a(AbstractC3909e abstractC3909e) {
        int mo18310a = abstractC3909e.mo18310a();
        abstractC3909e.f44976a = mo18310a;
        byte[] bArr = new byte[mo18310a];
        try {
            C3831b m19605a = C3831b.m19605a(bArr, 0, mo18310a);
            abstractC3909e.mo18312a(m19605a);
            m19605a.m19611a();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public int mo18310a() {
        return 0;
    }

    /* renamed from: a */
    public abstract AbstractC3909e mo18311a(C3805a c3805a) throws IOException;

    /* renamed from: a */
    public void mo18312a(C3831b c3831b) throws IOException {
    }

    public String toString() {
        return C3935f.m19832a(this);
    }

    /* renamed from: a */
    public static final <T extends AbstractC3909e> T m19776a(T t, byte[] bArr) throws C3883d {
        try {
            C3805a m19541a = C3805a.m19541a(bArr, 0, bArr.length);
            t.mo18311a(m19541a);
            m19541a.m19544a(0);
            return t;
        } catch (C3883d e2) {
            throw e2;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }
}

package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.b */
/* loaded from: classes2.dex */
public final class C3831b {

    /* renamed from: a */
    private final byte[] f44768a;

    /* renamed from: b */
    private final int f44769b;

    /* renamed from: c */
    private int f44770c;

    /* renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class a extends IOException {
        public a(int i2, int i3) {
            super(C0000a.m10g("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i2, " limit ", i3, ")."));
        }
    }

    private C3831b(byte[] bArr, int i2, int i3) {
        this.f44768a = bArr;
        this.f44770c = i2;
        this.f44769b = i2 + i3;
    }

    /* renamed from: a */
    public static int m19602a(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    public static int m19603a(AbstractC3909e abstractC3909e) {
        int mo18310a = abstractC3909e.mo18310a();
        abstractC3909e.f44976a = mo18310a;
        return m19606b(mo18310a) + mo18310a;
    }

    /* renamed from: b */
    public static int m19606b(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m19608b(int i2, long j2) {
        return m19602a(j2) + m19609c(i2);
    }

    /* renamed from: c */
    public static int m19610c(int i2, int i3) {
        return m19606b(i3) + m19609c(i2);
    }

    /* renamed from: d */
    public void m19621d(int i2) throws IOException {
        byte b = (byte) i2;
        int i3 = this.f44770c;
        if (i3 == this.f44769b) {
            throw new a(this.f44770c, this.f44769b);
        }
        byte[] bArr = this.f44768a;
        this.f44770c = i3 + 1;
        bArr[i3] = b;
    }

    /* renamed from: e */
    public void m19625e(int i2, int i3) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19624e((i3 << 1) ^ (i3 >> 31));
    }

    /* renamed from: f */
    public void m19627f(int i2, int i3) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19624e(i3);
    }

    /* renamed from: b */
    public static int m19607b(int i2, int i3) {
        return m19606b((i3 >> 31) ^ (i3 << 1)) + m19609c(i2);
    }

    /* renamed from: c */
    public void m19620c(int i2, long j2) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19619b(j2);
    }

    /* renamed from: e */
    public void m19626e(int i2, long j2) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19619b(j2);
    }

    /* renamed from: a */
    public static C3831b m19605a(byte[] bArr, int i2, int i3) {
        return new C3831b(bArr, i2, i3);
    }

    /* renamed from: d */
    public void m19622d(int i2, int i3) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        if (i3 >= 0) {
            m19624e(i3);
        } else {
            m19619b(i3);
        }
    }

    /* renamed from: a */
    public static int m19595a(int i2, double d) {
        return m19609c(i2) + 8;
    }

    /* renamed from: c */
    public static int m19609c(int i2) {
        return m19606b(C3961g.m19919a(i2, 0));
    }

    /* renamed from: b */
    public void m19617b(int i2, boolean z) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19621d(z ? 1 : 0);
    }

    /* renamed from: e */
    public void m19624e(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            m19621d((i2 & 127) | 128);
            i2 >>>= 7;
        }
        m19621d(i2);
    }

    /* renamed from: a */
    public static int m19597a(int i2, long j2) {
        return m19602a(j2) + m19609c(i2);
    }

    /* renamed from: b */
    public void m19618b(int i2, byte[] bArr) throws IOException {
        m19624e(C3961g.m19919a(i2, 2));
        m19624e(bArr.length);
        m19613a(bArr);
    }

    /* renamed from: d */
    public void m19623d(int i2, long j2) throws IOException {
        m19624e(C3961g.m19919a(i2, 0));
        m19619b((j2 >> 63) ^ (j2 << 1));
    }

    /* renamed from: a */
    public static int m19596a(int i2, int i3) {
        return m19594a(i3) + m19609c(i2);
    }

    /* renamed from: a */
    public static int m19600a(int i2, boolean z) {
        return m19609c(i2) + 1;
    }

    /* renamed from: a */
    public static int m19599a(int i2, String str) {
        return m19604a(str) + m19609c(i2);
    }

    /* renamed from: b */
    public void m19614b(int i2, double d) throws IOException {
        m19624e(C3961g.m19919a(i2, 1));
        long doubleToLongBits = Double.doubleToLongBits(d);
        m19621d(((int) doubleToLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d(((int) (doubleToLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: a */
    public static int m19598a(int i2, AbstractC3909e abstractC3909e) {
        int m19609c = m19609c(i2);
        int mo18310a = abstractC3909e.mo18310a();
        abstractC3909e.f44976a = mo18310a;
        return m19606b(mo18310a) + mo18310a + m19609c;
    }

    /* renamed from: a */
    public static int m19601a(int i2, byte[] bArr) {
        return m19606b(bArr.length) + bArr.length + m19609c(i2);
    }

    /* renamed from: a */
    public static int m19594a(int i2) {
        if (i2 >= 0) {
            return m19606b(i2);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m19604a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m19606b(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public void m19615b(int i2, AbstractC3909e abstractC3909e) throws IOException {
        m19624e(C3961g.m19919a(i2, 2));
        if (abstractC3909e.f44976a < 0) {
            abstractC3909e.f44976a = abstractC3909e.mo18310a();
        }
        m19624e(abstractC3909e.f44976a);
        abstractC3909e.mo18312a(this);
    }

    /* renamed from: a */
    public void m19611a() {
        if (this.f44769b - this.f44770c != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public void m19613a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i2 = this.f44769b;
        int i3 = this.f44770c;
        if (i2 - i3 >= length) {
            System.arraycopy(bArr, 0, this.f44768a, i3, length);
            this.f44770c += length;
            return;
        }
        throw new a(this.f44770c, this.f44769b);
    }

    /* renamed from: b */
    public void m19616b(int i2, String str) throws IOException {
        m19624e(C3961g.m19919a(i2, 2));
        byte[] bytes = str.getBytes("UTF-8");
        m19624e(bytes.length);
        m19613a(bytes);
    }

    /* renamed from: a */
    public void m19612a(int i2, float f2) throws IOException {
        m19624e(C3961g.m19919a(i2, 5));
        int floatToIntBits = Float.floatToIntBits(f2);
        m19621d(floatToIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d((floatToIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d((floatToIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        m19621d((floatToIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public void m19619b(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            m19621d((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        m19621d((int) j2);
    }
}

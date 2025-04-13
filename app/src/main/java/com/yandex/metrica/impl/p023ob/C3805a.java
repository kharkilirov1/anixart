package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.a */
/* loaded from: classes2.dex */
public final class C3805a {

    /* renamed from: a */
    private final byte[] f44708a;

    /* renamed from: b */
    private int f44709b;

    /* renamed from: c */
    private int f44710c;

    /* renamed from: d */
    private int f44711d;

    /* renamed from: e */
    private int f44712e;

    /* renamed from: f */
    private int f44713f;

    /* renamed from: g */
    private int f44714g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f44715h;

    private C3805a(byte[] bArr, int i2, int i3) {
        this.f44708a = bArr;
        this.f44709b = i2;
        this.f44710c = i3 + i2;
        this.f44712e = i2;
    }

    /* renamed from: a */
    public static C3805a m19541a(byte[] bArr, int i2, int i3) {
        return new C3805a(bArr, i2, i3);
    }

    /* renamed from: m */
    private void m19542m() {
        int i2 = this.f44710c + this.f44711d;
        this.f44710c = i2;
        int i3 = this.f44714g;
        if (i2 <= i3) {
            this.f44711d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f44711d = i4;
        this.f44710c = i2 - i4;
    }

    /* renamed from: b */
    public void m19547b(int i2) {
        this.f44714g = i2;
        m19542m();
    }

    /* renamed from: c */
    public boolean m19549c() throws IOException {
        return m19558h() != 0;
    }

    /* renamed from: d */
    public byte[] m19550d() throws IOException {
        int m19558h = m19558h();
        int i2 = this.f44710c;
        int i3 = this.f44712e;
        if (m19558h > i2 - i3 || m19558h <= 0) {
            return m19551d(m19558h);
        }
        byte[] bArr = new byte[m19558h];
        System.arraycopy(this.f44708a, i3, bArr, 0, m19558h);
        this.f44712e += m19558h;
        return bArr;
    }

    /* renamed from: e */
    public void m19553e(int i2) {
        int i3 = this.f44712e;
        int i4 = this.f44709b;
        if (i2 > i3 - i4) {
            StringBuilder m25v = C0000a.m25v("Position ", i2, " is beyond current ");
            m25v.append(this.f44712e - this.f44709b);
            throw new IllegalArgumentException(m25v.toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C0000a.m7d("Bad position ", i2));
        }
        this.f44712e = i4 + i2;
    }

    /* renamed from: f */
    public boolean m19555f(int i2) throws IOException {
        int m19562l;
        int i3 = i2 & 7;
        if (i3 == 0) {
            m19558h();
            return true;
        }
        if (i3 == 1) {
            m19556g();
            return true;
        }
        if (i3 == 2) {
            m19557g(m19558h());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new C3883d("Protocol message tag had invalid wire type.");
            }
            m19554f();
            return true;
        }
        do {
            m19562l = m19562l();
            if (m19562l == 0) {
                break;
            }
        } while (m19555f(m19562l));
        m19544a(C3961g.m19919a(i2 >>> 3, 4));
        return true;
    }

    /* renamed from: g */
    public long m19556g() throws IOException {
        return ((m19552e() & 255) << 8) | (m19552e() & 255) | ((m19552e() & 255) << 16) | ((m19552e() & 255) << 24) | ((m19552e() & 255) << 32) | ((m19552e() & 255) << 40) | ((m19552e() & 255) << 48) | ((m19552e() & 255) << 56);
    }

    /* renamed from: h */
    public int m19558h() throws IOException {
        int i2;
        byte m19552e = m19552e();
        if (m19552e >= 0) {
            return m19552e;
        }
        int i3 = m19552e & Byte.MAX_VALUE;
        byte m19552e2 = m19552e();
        if (m19552e2 >= 0) {
            i2 = m19552e2 << 7;
        } else {
            i3 |= (m19552e2 & Byte.MAX_VALUE) << 7;
            byte m19552e3 = m19552e();
            if (m19552e3 >= 0) {
                i2 = m19552e3 << 14;
            } else {
                i3 |= (m19552e3 & Byte.MAX_VALUE) << 14;
                byte m19552e4 = m19552e();
                if (m19552e4 < 0) {
                    int i4 = i3 | ((m19552e4 & Byte.MAX_VALUE) << 21);
                    byte m19552e5 = m19552e();
                    int i5 = i4 | (m19552e5 << 28);
                    if (m19552e5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (m19552e() >= 0) {
                            return i5;
                        }
                    }
                    throw new C3883d("CodedInputStream encountered a malformed varint.");
                }
                i2 = m19552e4 << 21;
            }
        }
        return i3 | i2;
    }

    /* renamed from: i */
    public long m19559i() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((m19552e() & 128) == 0) {
                return j2;
            }
        }
        throw new C3883d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: j */
    public int m19560j() throws IOException {
        int m19558h = m19558h();
        return (-(m19558h & 1)) ^ (m19558h >>> 1);
    }

    /* renamed from: k */
    public String m19561k() throws IOException {
        int m19558h = m19558h();
        int i2 = this.f44710c;
        int i3 = this.f44712e;
        if (m19558h > i2 - i3 || m19558h <= 0) {
            return new String(m19551d(m19558h), "UTF-8");
        }
        String str = new String(this.f44708a, i3, m19558h, "UTF-8");
        this.f44712e += m19558h;
        return str;
    }

    /* renamed from: l */
    public int m19562l() throws IOException {
        if (this.f44712e == this.f44710c) {
            this.f44713f = 0;
            return 0;
        }
        int m19558h = m19558h();
        this.f44713f = m19558h;
        if (m19558h != 0) {
            return m19558h;
        }
        throw new C3883d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public void m19544a(int i2) throws C3883d {
        if (this.f44713f != i2) {
            throw new C3883d("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: c */
    public int m19548c(int i2) throws C3883d {
        if (i2 < 0) {
            throw C3883d.m19688a();
        }
        int i3 = i2 + this.f44712e;
        int i4 = this.f44714g;
        if (i3 > i4) {
            throw C3883d.m19689b();
        }
        this.f44714g = i3;
        m19542m();
        return i4;
    }

    /* renamed from: b */
    public int m19546b() {
        return this.f44712e - this.f44709b;
    }

    /* renamed from: a */
    public void m19545a(AbstractC3909e abstractC3909e) throws IOException {
        int m19558h = m19558h();
        if (this.f44715h < 64) {
            int m19548c = m19548c(m19558h);
            this.f44715h++;
            abstractC3909e.mo18311a(this);
            m19544a(0);
            this.f44715h--;
            this.f44714g = m19548c;
            m19542m();
            return;
        }
        throw new C3883d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: e */
    public byte m19552e() throws IOException {
        int i2 = this.f44712e;
        if (i2 != this.f44710c) {
            byte[] bArr = this.f44708a;
            this.f44712e = i2 + 1;
            return bArr[i2];
        }
        throw C3883d.m19689b();
    }

    /* renamed from: d */
    public byte[] m19551d(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f44712e;
            int i4 = i3 + i2;
            int i5 = this.f44714g;
            if (i4 <= i5) {
                if (i2 <= this.f44710c - i3) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f44708a, i3, bArr, 0, i2);
                    this.f44712e += i2;
                    return bArr;
                }
                throw C3883d.m19689b();
            }
            m19557g(i5 - i3);
            throw C3883d.m19689b();
        }
        throw C3883d.m19688a();
    }

    /* renamed from: g */
    public void m19557g(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f44712e;
            int i4 = i3 + i2;
            int i5 = this.f44714g;
            if (i4 <= i5) {
                if (i2 <= this.f44710c - i3) {
                    this.f44712e = i4;
                    return;
                }
                throw C3883d.m19689b();
            }
            m19557g(i5 - i3);
            throw C3883d.m19689b();
        }
        throw C3883d.m19688a();
    }

    /* renamed from: f */
    public int m19554f() throws IOException {
        return (m19552e() & 255) | ((m19552e() & 255) << 8) | ((m19552e() & 255) << 16) | ((m19552e() & 255) << 24);
    }

    /* renamed from: a */
    public int m19543a() {
        int i2 = this.f44714g;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f44712e;
    }
}

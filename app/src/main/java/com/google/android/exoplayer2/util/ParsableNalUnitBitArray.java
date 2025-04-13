package com.google.android.exoplayer2.util;

/* loaded from: classes.dex */
public final class ParsableNalUnitBitArray {

    /* renamed from: a */
    public byte[] f14701a;

    /* renamed from: b */
    public int f14702b;

    /* renamed from: c */
    public int f14703c;

    /* renamed from: d */
    public int f14704d = 0;

    public ParsableNalUnitBitArray(byte[] bArr, int i2, int i3) {
        this.f14701a = bArr;
        this.f14703c = i2;
        this.f14702b = i3;
        m7663a();
    }

    /* renamed from: a */
    public final void m7663a() {
        int i2;
        int i3 = this.f14703c;
        Assertions.m7516d(i3 >= 0 && (i3 < (i2 = this.f14702b) || (i3 == i2 && this.f14704d == 0)));
    }

    /* renamed from: b */
    public boolean m7664b(int i2) {
        int i3 = this.f14703c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f14704d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f14702b) {
                break;
            }
            if (m7670h(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f14702b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m7665c() {
        int i2 = this.f14703c;
        int i3 = this.f14704d;
        int i4 = 0;
        while (this.f14703c < this.f14702b && !m7666d()) {
            i4++;
        }
        boolean z = this.f14703c == this.f14702b;
        this.f14703c = i2;
        this.f14704d = i3;
        return !z && m7664b((i4 * 2) + 1);
    }

    /* renamed from: d */
    public boolean m7666d() {
        boolean z = (this.f14701a[this.f14703c] & (128 >> this.f14704d)) != 0;
        m7671i();
        return z;
    }

    /* renamed from: e */
    public int m7667e(int i2) {
        int i3;
        this.f14704d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f14704d;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f14704d = i5;
            byte[] bArr = this.f14701a;
            int i6 = this.f14703c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m7670h(i6 + 1)) {
                r3 = 1;
            }
            this.f14703c = i6 + r3;
        }
        byte[] bArr2 = this.f14701a;
        int i7 = this.f14703c;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f14704d = 0;
            this.f14703c = i7 + (m7670h(i7 + 1) ? 2 : 1);
        }
        m7663a();
        return i8;
    }

    /* renamed from: f */
    public final int m7668f() {
        int i2 = 0;
        while (!m7666d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? m7667e(i2) : 0);
    }

    /* renamed from: g */
    public int m7669g() {
        int m7668f = m7668f();
        return ((m7668f + 1) / 2) * (m7668f % 2 == 0 ? -1 : 1);
    }

    /* renamed from: h */
    public final boolean m7670h(int i2) {
        if (2 <= i2 && i2 < this.f14702b) {
            byte[] bArr = this.f14701a;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m7671i() {
        int i2 = this.f14704d + 1;
        this.f14704d = i2;
        if (i2 == 8) {
            this.f14704d = 0;
            int i3 = this.f14703c;
            this.f14703c = i3 + (m7670h(i3 + 1) ? 2 : 1);
        }
        m7663a();
    }

    /* renamed from: j */
    public void m7672j(int i2) {
        int i3 = this.f14703c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f14703c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f14704d;
        this.f14704d = i6;
        if (i6 > 7) {
            this.f14703c = i5 + 1;
            this.f14704d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f14703c) {
                m7663a();
                return;
            } else if (m7670h(i3)) {
                this.f14703c++;
                i3 += 2;
            }
        }
    }
}

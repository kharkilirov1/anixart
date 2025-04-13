package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bp0 {

    /* renamed from: a */
    private byte[] f48955a;

    /* renamed from: b */
    private int f48956b;

    /* renamed from: c */
    private int f48957c;

    /* renamed from: d */
    private int f48958d;

    public bp0(byte[] bArr, int i2, int i3) {
        m22912a(bArr, i2, i3);
    }

    /* renamed from: a */
    public final void m22912a(byte[] bArr, int i2, int i3) {
        this.f48955a = bArr;
        this.f48957c = i2;
        this.f48956b = i3;
        boolean z = false;
        this.f48958d = 0;
        if (i2 >= 0 && (i2 < i3 || i2 == i3)) {
            z = true;
        }
        C5220ia.m25476b(z);
    }

    /* renamed from: b */
    public final boolean m22916b() {
        boolean z = (this.f48955a[this.f48957c] & (128 >> this.f48958d)) != 0;
        m22920e();
        return z;
    }

    /* renamed from: c */
    public final int m22917c() {
        int i2 = 0;
        while (!m22916b()) {
            i2++;
        }
        int m22915b = ((1 << i2) - 1) + (i2 > 0 ? m22915b(i2) : 0);
        return ((m22915b + 1) / 2) * (m22915b % 2 == 0 ? -1 : 1);
    }

    /* renamed from: d */
    public final void m22919d(int i2) {
        int i3;
        int i4;
        int i5 = this.f48957c;
        int i6 = i2 / 8;
        int i7 = i5 + i6;
        this.f48957c = i7;
        int i8 = (i2 - (i6 * 8)) + this.f48958d;
        this.f48958d = i8;
        boolean z = true;
        if (i8 > 7) {
            this.f48957c = i7 + 1;
            this.f48958d = i8 - 8;
        }
        while (true) {
            i5++;
            i3 = this.f48957c;
            if (i5 > i3) {
                break;
            } else if (m22911c(i5)) {
                this.f48957c++;
                i5 += 2;
            }
        }
        if (i3 < 0 || (i3 >= (i4 = this.f48956b) && (i3 != i4 || this.f48958d != 0))) {
            z = false;
        }
        C5220ia.m25476b(z);
    }

    /* renamed from: e */
    public final void m22920e() {
        int i2;
        boolean z = true;
        int i3 = this.f48958d + 1;
        this.f48958d = i3;
        if (i3 == 8) {
            this.f48958d = 0;
            int i4 = this.f48957c;
            this.f48957c = i4 + (m22911c(i4 + 1) ? 2 : 1);
        }
        int i5 = this.f48957c;
        if (i5 < 0 || (i5 >= (i2 = this.f48956b) && (i5 != i2 || this.f48958d != 0))) {
            z = false;
        }
        C5220ia.m25476b(z);
    }

    /* renamed from: b */
    public final int m22915b(int i2) {
        int i3;
        int i4;
        this.f48958d += i2;
        boolean z = false;
        int i5 = 0;
        while (true) {
            i3 = this.f48958d;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.f48958d = i6;
            byte[] bArr = this.f48955a;
            int i7 = this.f48957c;
            i5 |= (bArr[i7] & 255) << i6;
            if (!m22911c(i7 + 1)) {
                r3 = 1;
            }
            this.f48957c = i7 + r3;
        }
        byte[] bArr2 = this.f48955a;
        int i8 = this.f48957c;
        int i9 = ((-1) >>> (32 - i2)) & (i5 | ((bArr2[i8] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f48958d = 0;
            this.f48957c = i8 + (m22911c(i8 + 1) ? 2 : 1);
        }
        int i10 = this.f48957c;
        if (i10 >= 0 && (i10 < (i4 = this.f48956b) || (i10 == i4 && this.f48958d == 0))) {
            z = true;
        }
        C5220ia.m25476b(z);
        return i9;
    }

    /* renamed from: c */
    private boolean m22911c(int i2) {
        if (2 <= i2 && i2 < this.f48956b) {
            byte[] bArr = this.f48955a;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m22914a(int i2) {
        int i3 = this.f48957c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f48958d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f48956b) {
                break;
            }
            if (m22911c(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f48956b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    /* renamed from: d */
    public final int m22918d() {
        int i2 = 0;
        while (!m22916b()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? m22915b(i2) : 0);
    }

    /* renamed from: a */
    public final boolean m22913a() {
        int i2 = this.f48957c;
        int i3 = this.f48958d;
        int i4 = 0;
        while (this.f48957c < this.f48956b && !m22916b()) {
            i4++;
        }
        boolean z = this.f48957c == this.f48956b;
        this.f48957c = i2;
        this.f48958d = i3;
        return !z && m22914a((i4 * 2) + 1);
    }
}

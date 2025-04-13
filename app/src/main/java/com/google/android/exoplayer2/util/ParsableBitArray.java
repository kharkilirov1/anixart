package com.google.android.exoplayer2.util;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ParsableBitArray {

    /* renamed from: a */
    public byte[] f14694a;

    /* renamed from: b */
    public int f14695b;

    /* renamed from: c */
    public int f14696c;

    /* renamed from: d */
    public int f14697d;

    public ParsableBitArray() {
        this.f14694a = Util.f14741f;
    }

    /* renamed from: a */
    public final void m7616a() {
        int i2;
        int i3 = this.f14695b;
        Assertions.m7516d(i3 >= 0 && (i3 < (i2 = this.f14697d) || (i3 == i2 && this.f14696c == 0)));
    }

    /* renamed from: b */
    public int m7617b() {
        return ((this.f14697d - this.f14695b) * 8) - this.f14696c;
    }

    /* renamed from: c */
    public void m7618c() {
        if (this.f14696c == 0) {
            return;
        }
        this.f14696c = 0;
        this.f14695b++;
        m7616a();
    }

    /* renamed from: d */
    public int m7619d() {
        Assertions.m7516d(this.f14696c == 0);
        return this.f14695b;
    }

    /* renamed from: e */
    public int m7620e() {
        return (this.f14695b * 8) + this.f14696c;
    }

    /* renamed from: f */
    public boolean m7621f() {
        boolean z = (this.f14694a[this.f14695b] & (128 >> this.f14696c)) != 0;
        m7627l();
        return z;
    }

    /* renamed from: g */
    public int m7622g(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f14696c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f14696c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f14696c = i5;
            byte[] bArr = this.f14694a;
            int i6 = this.f14695b;
            this.f14695b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f14694a;
        int i7 = this.f14695b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f14696c = 0;
            this.f14695b = i7 + 1;
        }
        m7616a();
        return i8;
    }

    /* renamed from: h */
    public void m7623h(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f14694a;
            int i5 = this.f14695b;
            int i6 = i5 + 1;
            this.f14695b = i6;
            byte b = bArr2[i5];
            int i7 = this.f14696c;
            bArr[i2] = (byte) (b << i7);
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | bArr[i2]);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        bArr[i4] = (byte) (bArr[i4] & (KotlinVersion.MAX_COMPONENT_VALUE >> i8));
        int i9 = this.f14696c;
        if (i9 + i8 > 8) {
            int i10 = bArr[i4];
            byte[] bArr3 = this.f14694a;
            int i11 = this.f14695b;
            this.f14695b = i11 + 1;
            bArr[i4] = (byte) (i10 | ((bArr3[i11] & 255) << i9));
            this.f14696c = i9 - 8;
        }
        int i12 = this.f14696c + i8;
        this.f14696c = i12;
        byte[] bArr4 = this.f14694a;
        int i13 = this.f14695b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i8))) | bArr[i4]);
        if (i12 == 8) {
            this.f14696c = 0;
            this.f14695b = i13 + 1;
        }
        m7616a();
    }

    /* renamed from: i */
    public void m7624i(byte[] bArr, int i2, int i3) {
        Assertions.m7516d(this.f14696c == 0);
        System.arraycopy(this.f14694a, this.f14695b, bArr, i2, i3);
        this.f14695b += i3;
        m7616a();
    }

    /* renamed from: j */
    public void m7625j(byte[] bArr, int i2) {
        this.f14694a = bArr;
        this.f14695b = 0;
        this.f14696c = 0;
        this.f14697d = i2;
    }

    /* renamed from: k */
    public void m7626k(int i2) {
        int i3 = i2 / 8;
        this.f14695b = i3;
        this.f14696c = i2 - (i3 * 8);
        m7616a();
    }

    /* renamed from: l */
    public void m7627l() {
        int i2 = this.f14696c + 1;
        this.f14696c = i2;
        if (i2 == 8) {
            this.f14696c = 0;
            this.f14695b++;
        }
        m7616a();
    }

    /* renamed from: m */
    public void m7628m(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f14695b + i3;
        this.f14695b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f14696c;
        this.f14696c = i5;
        if (i5 > 7) {
            this.f14695b = i4 + 1;
            this.f14696c = i5 - 8;
        }
        m7616a();
    }

    /* renamed from: n */
    public void m7629n(int i2) {
        Assertions.m7516d(this.f14696c == 0);
        this.f14695b += i2;
        m7616a();
    }

    public ParsableBitArray(byte[] bArr) {
        int length = bArr.length;
        this.f14694a = bArr;
        this.f14697d = length;
    }

    public ParsableBitArray(byte[] bArr, int i2) {
        this.f14694a = bArr;
        this.f14697d = i2;
    }
}

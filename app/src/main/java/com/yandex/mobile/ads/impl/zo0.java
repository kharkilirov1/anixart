package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class zo0 {

    /* renamed from: a */
    public byte[] f57274a;

    /* renamed from: b */
    private int f57275b;

    /* renamed from: c */
    private int f57276c;

    /* renamed from: d */
    private int f57277d;

    public zo0() {
        this.f57274a = s91.f54535f;
    }

    /* renamed from: a */
    public final void m30249a(int i2, byte[] bArr) {
        this.f57274a = bArr;
        this.f57275b = 0;
        this.f57276c = 0;
        this.f57277d = i2;
    }

    /* renamed from: b */
    public final int m30251b() {
        return ((this.f57277d - this.f57275b) * 8) - this.f57276c;
    }

    /* renamed from: c */
    public final void m30255c(int i2) {
        int i3 = i2 / 8;
        this.f57275b = i3;
        this.f57276c = i2 - (i3 * 8);
        m30246a();
    }

    /* renamed from: d */
    public final int m30256d() {
        C5220ia.m25476b(this.f57276c == 0);
        return this.f57275b;
    }

    /* renamed from: e */
    public final int m30258e() {
        return (this.f57275b * 8) + this.f57276c;
    }

    /* renamed from: f */
    public final boolean m30260f() {
        boolean z = (this.f57274a[this.f57275b] & (128 >> this.f57276c)) != 0;
        m30262h();
        return z;
    }

    /* renamed from: g */
    public final long m30261g() {
        int m30252b = m30252b(4);
        int m30252b2 = m30252b(32);
        int i2 = s91.f54530a;
        return ((m30252b & 4294967295L) << 32) | (m30252b2 & 4294967295L);
    }

    /* renamed from: h */
    public final void m30262h() {
        int i2 = this.f57276c + 1;
        this.f57276c = i2;
        if (i2 == 8) {
            this.f57276c = 0;
            this.f57275b++;
        }
        m30246a();
    }

    /* renamed from: b */
    public final int m30252b(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f57276c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f57276c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f57276c = i5;
            byte[] bArr = this.f57274a;
            int i6 = this.f57275b;
            this.f57275b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f57274a;
        int i7 = this.f57275b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f57276c = 0;
            this.f57275b = i7 + 1;
        }
        m30246a();
        return i8;
    }

    /* renamed from: e */
    public final void m30259e(int i2) {
        C5220ia.m25476b(this.f57276c == 0);
        this.f57275b += i2;
        m30246a();
    }

    public zo0(byte[] bArr) {
        this(bArr.length, bArr);
    }

    /* renamed from: d */
    public final void m30257d(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f57275b + i3;
        this.f57275b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f57276c;
        this.f57276c = i5;
        if (i5 > 7) {
            this.f57275b = i4 + 1;
            this.f57276c = i5 - 8;
        }
        m30246a();
    }

    public zo0(int i2, byte[] bArr) {
        this.f57274a = bArr;
        this.f57277d = i2;
    }

    /* renamed from: c */
    public final void m30254c() {
        if (this.f57276c == 0) {
            return;
        }
        this.f57276c = 0;
        this.f57275b++;
        m30246a();
    }

    /* renamed from: a */
    public final void m30250a(byte[] bArr, int i2) {
        int i3 = (i2 >> 3) + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f57274a;
            int i5 = this.f57275b;
            int i6 = i5 + 1;
            this.f57275b = i6;
            byte b = bArr2[i5];
            int i7 = this.f57276c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (KotlinVersion.MAX_COMPONENT_VALUE >> i8));
        bArr[i3] = b3;
        int i9 = this.f57276c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f57274a;
            int i10 = this.f57275b;
            this.f57275b = i10 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            this.f57276c = i9 - 8;
        }
        int i11 = this.f57276c + i8;
        this.f57276c = i11;
        byte[] bArr4 = this.f57274a;
        int i12 = this.f57275b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | bArr[i3]);
        if (i11 == 8) {
            this.f57276c = 0;
            this.f57275b = i12 + 1;
        }
        m30246a();
    }

    /* renamed from: b */
    public final void m30253b(byte[] bArr, int i2) {
        C5220ia.m25476b(this.f57276c == 0);
        System.arraycopy(this.f57274a, this.f57275b, bArr, 0, i2);
        this.f57275b += i2;
        m30246a();
    }

    /* renamed from: a */
    public final String m30247a(int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        m30253b(bArr, i2);
        return new String(bArr, charset);
    }

    /* renamed from: a */
    public final void m30248a(int i2) {
        int i3 = i2 & 16383;
        int min = Math.min(8 - this.f57276c, 14);
        int i4 = this.f57276c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f57274a;
        int i6 = this.f57275b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f57274a[i8] = (byte) (i3 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f57274a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        m30257d(14);
        m30246a();
    }

    /* renamed from: a */
    private void m30246a() {
        int i2;
        int i3 = this.f57275b;
        C5220ia.m25476b(i3 >= 0 && (i3 < (i2 = this.f57277d) || (i3 == i2 && this.f57276c == 0)));
    }
}

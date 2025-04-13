package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ap0 {

    /* renamed from: a */
    private byte[] f48632a;

    /* renamed from: b */
    private int f48633b;

    /* renamed from: c */
    private int f48634c;

    public ap0() {
        this.f48632a = s91.f54535f;
    }

    /* renamed from: A */
    public final long m22578A() {
        int i2;
        int i3;
        long j2 = this.f48632a[this.f48633b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= r6 - 1;
                i3 = 7 - i4;
            } else if (i4 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException(C0000a.m11h("Invalid UTF-8 sequence first byte: ", j2));
        }
        for (i2 = 1; i2 < i3; i2++) {
            if ((this.f48632a[this.f48633b + i2] & 192) != 128) {
                throw new NumberFormatException(C0000a.m11h("Invalid UTF-8 sequence continuation byte: ", j2));
            }
            j2 = (j2 << 6) | (r3 & 63);
        }
        this.f48633b += i3;
        return j2;
    }

    /* renamed from: a */
    public final void m22582a(int i2, byte[] bArr) {
        this.f48632a = bArr;
        this.f48634c = i2;
        this.f48633b = 0;
    }

    /* renamed from: b */
    public final int m22584b() {
        return this.f48632a.length;
    }

    /* renamed from: c */
    public final byte[] m22587c() {
        return this.f48632a;
    }

    /* renamed from: d */
    public final void m22589d(int i2) {
        C5220ia.m25473a(i2 >= 0 && i2 <= this.f48632a.length);
        this.f48634c = i2;
    }

    /* renamed from: e */
    public final int m22590e() {
        return this.f48634c;
    }

    /* renamed from: f */
    public final void m22593f(int i2) {
        m22591e(this.f48633b + i2);
    }

    /* renamed from: g */
    public final int m22594g() {
        return this.f48632a[this.f48633b] & 255;
    }

    /* renamed from: h */
    public final int m22595h() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i2] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f48633b = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    /* renamed from: i */
    public final int m22596i() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        this.f48633b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    @Nullable
    /* renamed from: j */
    public final String m22597j() {
        if (m22579a() == 0) {
            return null;
        }
        int i2 = this.f48633b;
        while (i2 < this.f48634c) {
            byte b = this.f48632a[i2];
            int i3 = s91.f54530a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f48633b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f48632a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f48633b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f48632a;
        int i5 = this.f48633b;
        String m28104a = s91.m28104a(bArr2, i5, i2 - i5);
        this.f48633b = i2;
        int i6 = this.f48634c;
        if (i2 == i6) {
            return m28104a;
        }
        byte[] bArr3 = this.f48632a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f48633b = i7;
            if (i7 == i6) {
                return m28104a;
            }
        }
        int i8 = this.f48633b;
        if (bArr3[i8] == 10) {
            this.f48633b = i8 + 1;
        }
        return m28104a;
    }

    /* renamed from: k */
    public final int m22598k() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f48633b = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* renamed from: l */
    public final long m22599l() {
        byte[] bArr = this.f48632a;
        long j2 = bArr[r1] & 255;
        int i2 = this.f48633b + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j4 = j3 | ((bArr[i2] & 255) << 24);
        long j5 = j4 | ((bArr[r3] & 255) << 32);
        long j6 = j5 | ((bArr[r4] & 255) << 40);
        long j7 = j6 | ((bArr[r3] & 255) << 48);
        this.f48633b = i2 + 1 + 1 + 1 + 1 + 1;
        return j7 | ((bArr[r4] & 255) << 56);
    }

    /* renamed from: m */
    public final short m22600m() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        this.f48633b = i3 + 1;
        return (short) (((bArr[i3] & 255) << 8) | i4);
    }

    /* renamed from: n */
    public final long m22601n() {
        byte[] bArr = this.f48632a;
        long j2 = bArr[r1] & 255;
        int i2 = this.f48633b + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f48633b = i2 + 1;
        return j3 | ((bArr[i2] & 255) << 24);
    }

    /* renamed from: o */
    public final int m22602o() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        this.f48633b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    /* renamed from: p */
    public final long m22603p() {
        byte[] bArr = this.f48632a;
        long j2 = (bArr[r1] & 255) << 56;
        int i2 = this.f48633b + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j4 = j3 | ((bArr[i2] & 255) << 32);
        long j5 = j4 | ((bArr[r3] & 255) << 24);
        long j6 = j5 | ((bArr[r4] & 255) << 16);
        long j7 = j6 | ((bArr[r3] & 255) << 8);
        this.f48633b = i2 + 1 + 1 + 1 + 1 + 1;
        return j7 | (bArr[r4] & 255);
    }

    @Nullable
    /* renamed from: q */
    public final String m22604q() {
        if (m22579a() == 0) {
            return null;
        }
        int i2 = this.f48633b;
        while (i2 < this.f48634c && this.f48632a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f48632a;
        int i3 = this.f48633b;
        String m28104a = s91.m28104a(bArr, i3, i2 - i3);
        this.f48633b = i2;
        if (i2 < this.f48634c) {
            this.f48633b = i2 + 1;
        }
        return m28104a;
    }

    /* renamed from: r */
    public final short m22605r() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) << 8;
        this.f48633b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i4);
    }

    /* renamed from: s */
    public final int m22606s() {
        return (m22607t() << 21) | (m22607t() << 14) | (m22607t() << 7) | m22607t();
    }

    /* renamed from: t */
    public final int m22607t() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        this.f48633b = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: u */
    public final int m22608u() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = (bArr[i3] & 255) | ((bArr[i2] & 255) << 8);
        this.f48633b = i3 + 1 + 2;
        return i4;
    }

    /* renamed from: v */
    public final long m22609v() {
        byte[] bArr = this.f48632a;
        long j2 = (bArr[r1] & 255) << 24;
        int i2 = this.f48633b + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f48633b = i2 + 1;
        return j3 | (bArr[i2] & 255);
    }

    /* renamed from: w */
    public final int m22610w() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.f48633b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    /* renamed from: x */
    public final int m22611x() {
        int m22595h = m22595h();
        if (m22595h >= 0) {
            return m22595h;
        }
        throw new IllegalStateException(k60.m26036a("Top bit not zero: ", m22595h));
    }

    /* renamed from: y */
    public final long m22612y() {
        long m22603p = m22603p();
        if (m22603p >= 0) {
            return m22603p;
        }
        throw new IllegalStateException(C0000a.m11h("Top bit not zero: ", m22603p));
    }

    /* renamed from: z */
    public final int m22613z() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) << 8;
        this.f48633b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: b */
    public final String m22585b(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f48633b;
        int i4 = (i3 + i2) - 1;
        String m28104a = s91.m28104a(this.f48632a, i3, (i4 >= this.f48634c || this.f48632a[i4] != 0) ? i2 : i2 - 1);
        this.f48633b += i2;
        return m28104a;
    }

    /* renamed from: c */
    public final void m22586c(int i2) {
        byte[] bArr = this.f48632a;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        m22582a(i2, bArr);
    }

    /* renamed from: e */
    public final void m22591e(int i2) {
        C5220ia.m25473a(i2 >= 0 && i2 <= this.f48634c);
        this.f48633b = i2;
    }

    /* renamed from: f */
    public final char m22592f() {
        byte[] bArr = this.f48632a;
        int i2 = this.f48633b;
        return (char) ((bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8));
    }

    public ap0(int i2) {
        this.f48632a = new byte[i2];
        this.f48634c = i2;
    }

    /* renamed from: d */
    public final int m22588d() {
        return this.f48633b;
    }

    /* renamed from: a */
    public final int m22579a() {
        return this.f48634c - this.f48633b;
    }

    /* renamed from: a */
    public final void m22581a(int i2) {
        byte[] bArr = this.f48632a;
        if (i2 > bArr.length) {
            this.f48632a = Arrays.copyOf(bArr, i2);
        }
    }

    public ap0(byte[] bArr) {
        this.f48632a = bArr;
        this.f48634c = bArr.length;
    }

    /* renamed from: a */
    public final void m22583a(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f48632a, this.f48633b, bArr, i2, i3);
        this.f48633b += i3;
    }

    public ap0(int i2, byte[] bArr) {
        this.f48632a = bArr;
        this.f48634c = i2;
    }

    /* renamed from: a */
    public final String m22580a(int i2, Charset charset) {
        String str = new String(this.f48632a, this.f48633b, i2, charset);
        this.f48633b += i2;
        return str;
    }
}

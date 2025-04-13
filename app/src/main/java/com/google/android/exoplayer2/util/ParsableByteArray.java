package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ParsableByteArray {

    /* renamed from: a */
    public byte[] f14698a;

    /* renamed from: b */
    public int f14699b;

    /* renamed from: c */
    public int f14700c;

    public ParsableByteArray() {
        this.f14698a = Util.f14741f;
    }

    /* renamed from: A */
    public long m7630A() {
        int i2;
        int i3;
        long j2 = this.f14698a[this.f14699b];
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
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        for (i2 = 1; i2 < i3; i2++) {
            if ((this.f14698a[this.f14699b + i2] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | (r3 & 63);
        }
        this.f14699b += i3;
        return j2;
    }

    /* renamed from: B */
    public void m7631B(int i2) {
        byte[] bArr = this.f14698a;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        m7633D(bArr, i2);
    }

    /* renamed from: C */
    public void m7632C(byte[] bArr) {
        int length = bArr.length;
        this.f14698a = bArr;
        this.f14700c = length;
        this.f14699b = 0;
    }

    /* renamed from: D */
    public void m7633D(byte[] bArr, int i2) {
        this.f14698a = bArr;
        this.f14700c = i2;
        this.f14699b = 0;
    }

    /* renamed from: E */
    public void m7634E(int i2) {
        Assertions.m7513a(i2 >= 0 && i2 <= this.f14698a.length);
        this.f14700c = i2;
    }

    /* renamed from: F */
    public void m7635F(int i2) {
        Assertions.m7513a(i2 >= 0 && i2 <= this.f14700c);
        this.f14699b = i2;
    }

    /* renamed from: G */
    public void m7636G(int i2) {
        m7635F(this.f14699b + i2);
    }

    /* renamed from: a */
    public int m7637a() {
        return this.f14700c - this.f14699b;
    }

    /* renamed from: b */
    public void m7638b(int i2) {
        byte[] bArr = this.f14698a;
        if (i2 > bArr.length) {
            this.f14698a = Arrays.copyOf(bArr, i2);
        }
    }

    /* renamed from: c */
    public int m7639c() {
        return this.f14698a[this.f14699b] & 255;
    }

    /* renamed from: d */
    public void m7640d(ParsableBitArray parsableBitArray, int i2) {
        m7641e(parsableBitArray.f14694a, 0, i2);
        parsableBitArray.m7626k(0);
    }

    /* renamed from: e */
    public void m7641e(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f14698a, this.f14699b, bArr, i2, i3);
        this.f14699b += i3;
    }

    /* renamed from: f */
    public int m7642f() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = (bArr[i2] & 255) << 24;
        int i5 = i3 + 1;
        this.f14699b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        int i7 = i5 + 1;
        this.f14699b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        this.f14699b = i7 + 1;
        return (bArr[i7] & 255) | i8;
    }

    @Nullable
    /* renamed from: g */
    public String m7643g() {
        if (m7637a() == 0) {
            return null;
        }
        int i2 = this.f14699b;
        while (i2 < this.f14700c && !Util.m7714M(this.f14698a[i2])) {
            i2++;
        }
        int i3 = this.f14699b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f14698a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f14699b = i3 + 3;
            }
        }
        byte[] bArr2 = this.f14698a;
        int i4 = this.f14699b;
        String m7749r = Util.m7749r(bArr2, i4, i2 - i4);
        this.f14699b = i2;
        int i5 = this.f14700c;
        if (i2 == i5) {
            return m7749r;
        }
        byte[] bArr3 = this.f14698a;
        if (bArr3[i2] == 13) {
            int i6 = i2 + 1;
            this.f14699b = i6;
            if (i6 == i5) {
                return m7749r;
            }
        }
        int i7 = this.f14699b;
        if (bArr3[i7] == 10) {
            this.f14699b = i7 + 1;
        }
        return m7749r;
    }

    /* renamed from: h */
    public int m7644h() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i3 + 1;
        this.f14699b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        int i7 = i5 + 1;
        this.f14699b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 16);
        this.f14699b = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i8;
    }

    /* renamed from: i */
    public long m7645i() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b + 1;
        this.f14699b = i2;
        long j2 = bArr[r1] & 255;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = i3 + 1;
        this.f14699b = i4;
        long j3 = j2 | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
        int i5 = i4 + 1;
        this.f14699b = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.f14699b = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 32);
        int i7 = i6 + 1;
        this.f14699b = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 40);
        int i8 = i7 + 1;
        this.f14699b = i8;
        long j7 = j6 | ((bArr[i7] & 255) << 48);
        this.f14699b = i8 + 1;
        return j7 | ((bArr[i8] & 255) << 56);
    }

    /* renamed from: j */
    public short m7646j() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = bArr[i2] & 255;
        this.f14699b = i3 + 1;
        return (short) (((bArr[i3] & 255) << 8) | i4);
    }

    /* renamed from: k */
    public long m7647k() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b + 1;
        this.f14699b = i2;
        long j2 = bArr[r1] & 255;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = i3 + 1;
        this.f14699b = i4;
        long j3 = j2 | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
        this.f14699b = i4 + 1;
        return j3 | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: l */
    public int m7648l() {
        int m7644h = m7644h();
        if (m7644h >= 0) {
            return m7644h;
        }
        throw new IllegalStateException(C0576a.m4111j(29, "Top bit not zero: ", m7644h));
    }

    /* renamed from: m */
    public int m7649m() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = bArr[i2] & 255;
        this.f14699b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    /* renamed from: n */
    public long m7650n() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b + 1;
        this.f14699b = i2;
        long j2 = (bArr[r1] & 255) << 56;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = i3 + 1;
        this.f14699b = i4;
        long j3 = j2 | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40);
        int i5 = i4 + 1;
        this.f14699b = i5;
        long j4 = j3 | ((bArr[i4] & 255) << 32);
        int i6 = i5 + 1;
        this.f14699b = i6;
        long j5 = j4 | ((bArr[i5] & 255) << 24);
        int i7 = i6 + 1;
        this.f14699b = i7;
        long j6 = j5 | ((bArr[i6] & 255) << 16);
        int i8 = i7 + 1;
        this.f14699b = i8;
        long j7 = j6 | ((bArr[i7] & 255) << 8);
        this.f14699b = i8 + 1;
        return j7 | (bArr[i8] & 255);
    }

    @Nullable
    /* renamed from: o */
    public String m7651o() {
        if (m7637a() == 0) {
            return null;
        }
        int i2 = this.f14699b;
        while (i2 < this.f14700c && this.f14698a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f14698a;
        int i3 = this.f14699b;
        String m7749r = Util.m7749r(bArr, i3, i2 - i3);
        this.f14699b = i2;
        if (i2 < this.f14700c) {
            this.f14699b = i2 + 1;
        }
        return m7749r;
    }

    /* renamed from: p */
    public String m7652p(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f14699b;
        int i4 = (i3 + i2) - 1;
        String m7749r = Util.m7749r(this.f14698a, i3, (i4 >= this.f14700c || this.f14698a[i4] != 0) ? i2 : i2 - 1);
        this.f14699b += i2;
        return m7749r;
    }

    /* renamed from: q */
    public short m7653q() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f14699b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i4);
    }

    /* renamed from: r */
    public String m7654r(int i2) {
        return m7655s(i2, Charsets.f20504c);
    }

    /* renamed from: s */
    public String m7655s(int i2, Charset charset) {
        String str = new String(this.f14698a, this.f14699b, i2, charset);
        this.f14699b += i2;
        return str;
    }

    /* renamed from: t */
    public int m7656t() {
        return (m7657u() << 21) | (m7657u() << 14) | (m7657u() << 7) | m7657u();
    }

    /* renamed from: u */
    public int m7657u() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        this.f14699b = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: v */
    public long m7658v() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b + 1;
        this.f14699b = i2;
        long j2 = (bArr[r1] & 255) << 24;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = i3 + 1;
        this.f14699b = i4;
        long j3 = j2 | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.f14699b = i4 + 1;
        return j3 | (bArr[i4] & 255);
    }

    /* renamed from: w */
    public int m7659w() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = (bArr[i2] & 255) << 16;
        int i5 = i3 + 1;
        this.f14699b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f14699b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: x */
    public int m7660x() {
        int m7642f = m7642f();
        if (m7642f >= 0) {
            return m7642f;
        }
        throw new IllegalStateException(C0576a.m4111j(29, "Top bit not zero: ", m7642f));
    }

    /* renamed from: y */
    public long m7661y() {
        long m7650n = m7650n();
        if (m7650n >= 0) {
            return m7650n;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(m7650n);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: z */
    public int m7662z() {
        byte[] bArr = this.f14698a;
        int i2 = this.f14699b;
        int i3 = i2 + 1;
        this.f14699b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f14699b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public ParsableByteArray(int i2) {
        this.f14698a = new byte[i2];
        this.f14700c = i2;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f14698a = bArr;
        this.f14700c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i2) {
        this.f14698a = bArr;
        this.f14700c = i2;
    }
}

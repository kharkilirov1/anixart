package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class HevcConfig {

    /* renamed from: a */
    public final List<byte[]> f14813a;

    /* renamed from: b */
    public final int f14814b;

    /* renamed from: c */
    public final float f14815c;

    /* renamed from: d */
    @Nullable
    public final String f14816d;

    public HevcConfig(List<byte[]> list, int i2, int i3, int i4, float f2, @Nullable String str) {
        this.f14813a = list;
        this.f14814b = i2;
        this.f14815c = f2;
        this.f14816d = str;
    }

    /* renamed from: a */
    public static HevcConfig m7786a(ParsableByteArray parsableByteArray) throws ParserException {
        int i2;
        int i3;
        try {
            parsableByteArray.m7636G(21);
            int m7657u = parsableByteArray.m7657u() & 3;
            int m7657u2 = parsableByteArray.m7657u();
            int i4 = parsableByteArray.f14699b;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < m7657u2; i7++) {
                parsableByteArray.m7636G(1);
                int m7662z = parsableByteArray.m7662z();
                for (int i8 = 0; i8 < m7662z; i8++) {
                    int m7662z2 = parsableByteArray.m7662z();
                    i6 += m7662z2 + 4;
                    parsableByteArray.m7636G(m7662z2);
                }
            }
            parsableByteArray.m7635F(i4);
            byte[] bArr = new byte[i6];
            String str = null;
            int i9 = 0;
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            float f2 = 1.0f;
            while (i9 < m7657u2) {
                int m7657u3 = parsableByteArray.m7657u() & 127;
                int m7662z3 = parsableByteArray.m7662z();
                int i13 = 0;
                while (i13 < m7662z3) {
                    int m7662z4 = parsableByteArray.m7662z();
                    byte[] bArr2 = NalUnitUtil.f14658a;
                    int i14 = m7657u2;
                    System.arraycopy(bArr2, i5, bArr, i10, bArr2.length);
                    int length = i10 + bArr2.length;
                    System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, length, m7662z4);
                    if (m7657u3 == 33 && i13 == 0) {
                        NalUnitUtil.H265SpsData m7611c = NalUnitUtil.m7611c(bArr, length, length + m7662z4);
                        int i15 = m7611c.f14668g;
                        i12 = m7611c.f14669h;
                        f2 = m7611c.f14670i;
                        i2 = m7657u3;
                        i3 = m7662z3;
                        i11 = i15;
                        str = CodecSpecificDataUtil.m7532b(m7611c.f14662a, m7611c.f14663b, m7611c.f14664c, m7611c.f14665d, m7611c.f14666e, m7611c.f14667f);
                    } else {
                        i2 = m7657u3;
                        i3 = m7662z3;
                    }
                    i10 = length + m7662z4;
                    parsableByteArray.m7636G(m7662z4);
                    i13++;
                    m7657u2 = i14;
                    m7657u3 = i2;
                    m7662z3 = i3;
                    i5 = 0;
                }
                i9++;
                i5 = 0;
            }
            return new HevcConfig(i6 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), m7657u + 1, i11, i12, f2, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.m5907a("Error parsing HEVC config", e2);
        }
    }
}

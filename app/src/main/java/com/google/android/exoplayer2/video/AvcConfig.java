package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AvcConfig {

    /* renamed from: a */
    public final List<byte[]> f14754a;

    /* renamed from: b */
    public final int f14755b;

    /* renamed from: c */
    public final int f14756c;

    /* renamed from: d */
    public final int f14757d;

    /* renamed from: e */
    public final float f14758e;

    /* renamed from: f */
    @Nullable
    public final String f14759f;

    public AvcConfig(List<byte[]> list, int i2, int i3, int i4, float f2, @Nullable String str) {
        this.f14754a = list;
        this.f14755b = i2;
        this.f14756c = i3;
        this.f14757d = i4;
        this.f14758e = f2;
        this.f14759f = str;
    }

    /* renamed from: a */
    public static byte[] m7762a(ParsableByteArray parsableByteArray) {
        int m7662z = parsableByteArray.m7662z();
        int i2 = parsableByteArray.f14699b;
        parsableByteArray.m7636G(m7662z);
        byte[] bArr = parsableByteArray.f14698a;
        byte[] bArr2 = CodecSpecificDataUtil.f14616a;
        byte[] bArr3 = new byte[bArr2.length + m7662z];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, m7662z);
        return bArr3;
    }

    /* renamed from: b */
    public static AvcConfig m7763b(ParsableByteArray parsableByteArray) throws ParserException {
        String str;
        int i2;
        int i3;
        float f2;
        try {
            parsableByteArray.m7636G(4);
            int m7657u = (parsableByteArray.m7657u() & 3) + 1;
            if (m7657u == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m7657u2 = parsableByteArray.m7657u() & 31;
            for (int i4 = 0; i4 < m7657u2; i4++) {
                arrayList.add(m7762a(parsableByteArray));
            }
            int m7657u3 = parsableByteArray.m7657u();
            for (int i5 = 0; i5 < m7657u3; i5++) {
                arrayList.add(m7762a(parsableByteArray));
            }
            if (m7657u2 > 0) {
                NalUnitUtil.SpsData m7613e = NalUnitUtil.m7613e((byte[]) arrayList.get(0), m7657u, ((byte[]) arrayList.get(0)).length);
                int i6 = m7613e.f14678e;
                int i7 = m7613e.f14679f;
                float f3 = m7613e.f14680g;
                str = CodecSpecificDataUtil.m7531a(m7613e.f14674a, m7613e.f14675b, m7613e.f14676c);
                i2 = i6;
                i3 = i7;
                f2 = f3;
            } else {
                str = null;
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
            }
            return new AvcConfig(arrayList, m7657u, i2, i3, f2, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.m5907a("Error parsing AVC config", e2);
        }
    }
}

package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class TsUtil {
    /* renamed from: a */
    public static long m6592a(ParsableByteArray parsableByteArray, int i2, int i3) {
        parsableByteArray.m7635F(i2);
        if (parsableByteArray.m7637a() < 5) {
            return -9223372036854775807L;
        }
        int m7642f = parsableByteArray.m7642f();
        if ((8388608 & m7642f) != 0 || ((2096896 & m7642f) >> 8) != i3) {
            return -9223372036854775807L;
        }
        if (((m7642f & 32) != 0) && parsableByteArray.m7657u() >= 7 && parsableByteArray.m7637a() >= 7) {
            if ((parsableByteArray.m7657u() & 16) == 16) {
                System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, new byte[6], 0, 6);
                parsableByteArray.f14699b += 6;
                return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}

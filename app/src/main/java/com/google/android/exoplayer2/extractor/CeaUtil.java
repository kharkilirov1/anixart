package com.google.android.exoplayer2.extractor;

import android.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class CeaUtil {
    /* renamed from: a */
    public static void m6372a(long j2, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        while (true) {
            if (parsableByteArray.m7637a() <= 1) {
                return;
            }
            int m6374c = m6374c(parsableByteArray);
            int m6374c2 = m6374c(parsableByteArray);
            int i2 = parsableByteArray.f14699b + m6374c2;
            if (m6374c2 == -1 || m6374c2 > parsableByteArray.m7637a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = parsableByteArray.f14700c;
            } else if (m6374c == 4 && m6374c2 >= 8) {
                int m7657u = parsableByteArray.m7657u();
                int m7662z = parsableByteArray.m7662z();
                int m7642f = m7662z == 49 ? parsableByteArray.m7642f() : 0;
                int m7657u2 = parsableByteArray.m7657u();
                if (m7662z == 47) {
                    parsableByteArray.m7636G(1);
                }
                boolean z = m7657u == 181 && (m7662z == 49 || m7662z == 47) && m7657u2 == 3;
                if (m7662z == 49) {
                    z &= m7642f == 1195456820;
                }
                if (z) {
                    m6373b(j2, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.m7635F(i2);
        }
    }

    /* renamed from: b */
    public static void m6373b(long j2, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int m7657u = parsableByteArray.m7657u();
        if ((m7657u & 64) != 0) {
            parsableByteArray.m7636G(1);
            int i2 = (m7657u & 31) * 3;
            int i3 = parsableByteArray.f14699b;
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.m7635F(i3);
                trackOutput.mo6397c(parsableByteArray, i2);
                if (j2 != -9223372036854775807L) {
                    trackOutput.mo6398d(j2, 1, i2, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m6374c(ParsableByteArray parsableByteArray) {
        int i2 = 0;
        while (parsableByteArray.m7637a() != 0) {
            int m7657u = parsableByteArray.m7657u();
            i2 += m7657u;
            if (m7657u != 255) {
                return i2;
            }
        }
        return -1;
    }
}

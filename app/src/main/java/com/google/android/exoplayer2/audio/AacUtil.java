package com.google.android.exoplayer2.audio;

import android.util.Log;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AacUtil {

    /* renamed from: a */
    public static final int[] f10268a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, CharsToNameCanonicalizer.MAX_ENTRIES_FOR_REUSE, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f10269b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class Config {

        /* renamed from: a */
        public final int f10270a;

        /* renamed from: b */
        public final int f10271b;

        /* renamed from: c */
        public final String f10272c;

        public Config(int i2, int i3, String str, C09651 c09651) {
            this.f10270a = i2;
            this.f10271b = i3;
            this.f10272c = str;
        }
    }

    /* renamed from: a */
    public static int m6101a(ParsableBitArray parsableBitArray) throws ParserException {
        int m7622g = parsableBitArray.m7622g(4);
        if (m7622g == 15) {
            return parsableBitArray.m7622g(24);
        }
        if (m7622g < 13) {
            return f10268a[m7622g];
        }
        throw ParserException.m5907a(null, null);
    }

    /* renamed from: b */
    public static Config m6102b(ParsableBitArray parsableBitArray, boolean z) throws ParserException {
        int m7622g = parsableBitArray.m7622g(5);
        if (m7622g == 31) {
            m7622g = parsableBitArray.m7622g(6) + 32;
        }
        int m6101a = m6101a(parsableBitArray);
        int m7622g2 = parsableBitArray.m7622g(4);
        String m4111j = C0576a.m4111j(19, "mp4a.40.", m7622g);
        if (m7622g == 5 || m7622g == 29) {
            m6101a = m6101a(parsableBitArray);
            int m7622g3 = parsableBitArray.m7622g(5);
            if (m7622g3 == 31) {
                m7622g3 = parsableBitArray.m7622g(6) + 32;
            }
            m7622g = m7622g3;
            if (m7622g == 22) {
                m7622g2 = parsableBitArray.m7622g(4);
            }
        }
        if (z) {
            if (m7622g != 1 && m7622g != 2 && m7622g != 3 && m7622g != 4 && m7622g != 6 && m7622g != 7 && m7622g != 17) {
                switch (m7622g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(m7622g);
                        throw ParserException.m5909c(sb.toString());
                }
            }
            if (parsableBitArray.m7621f()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (parsableBitArray.m7621f()) {
                parsableBitArray.m7628m(14);
            }
            boolean m7621f = parsableBitArray.m7621f();
            if (m7622g2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (m7622g == 6 || m7622g == 20) {
                parsableBitArray.m7628m(3);
            }
            if (m7621f) {
                if (m7622g == 22) {
                    parsableBitArray.m7628m(16);
                }
                if (m7622g == 17 || m7622g == 19 || m7622g == 20 || m7622g == 23) {
                    parsableBitArray.m7628m(3);
                }
                parsableBitArray.m7628m(1);
            }
            switch (m7622g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m7622g4 = parsableBitArray.m7622g(2);
                    if (m7622g4 == 2 || m7622g4 == 3) {
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(m7622g4);
                        throw ParserException.m5909c(sb2.toString());
                    }
            }
        }
        int i2 = f10269b[m7622g2];
        if (i2 != -1) {
            return new Config(m6101a, i2, m4111j, null);
        }
        throw ParserException.m5907a(null, null);
    }

    /* renamed from: c */
    public static Config m6103c(byte[] bArr) throws ParserException {
        return m6102b(new ParsableBitArray(bArr), false);
    }
}

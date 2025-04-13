package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class VorbisUtil {

    public static final class CodeBook {
    }

    public static final class CommentHeader {

        /* renamed from: a */
        public final String[] f10894a;

        public CommentHeader(String str, String[] strArr, int i2) {
            this.f10894a = strArr;
        }
    }

    public static final class Mode {

        /* renamed from: a */
        public final boolean f10895a;

        public Mode(boolean z, int i2, int i3, int i4) {
            this.f10895a = z;
        }
    }

    public static final class VorbisIdHeader {

        /* renamed from: a */
        public final int f10896a;

        /* renamed from: b */
        public final int f10897b;

        /* renamed from: c */
        public final int f10898c;

        /* renamed from: d */
        public final int f10899d;

        /* renamed from: e */
        public final int f10900e;

        /* renamed from: f */
        public final int f10901f;

        /* renamed from: g */
        public final byte[] f10902g;

        public VorbisIdHeader(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, byte[] bArr) {
            this.f10896a = i3;
            this.f10897b = i4;
            this.f10898c = i5;
            this.f10899d = i6;
            this.f10900e = i8;
            this.f10901f = i9;
            this.f10902g = bArr;
        }
    }

    /* renamed from: a */
    public static int m6431a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    /* renamed from: b */
    public static CommentHeader m6432b(ParsableByteArray parsableByteArray, boolean z, boolean z2) throws ParserException {
        if (z) {
            m6433c(3, parsableByteArray, false);
        }
        String m7654r = parsableByteArray.m7654r((int) parsableByteArray.m7647k());
        int length = m7654r.length() + 11;
        long m7647k = parsableByteArray.m7647k();
        String[] strArr = new String[(int) m7647k];
        int i2 = length + 4;
        for (int i3 = 0; i3 < m7647k; i3++) {
            strArr[i3] = parsableByteArray.m7654r((int) parsableByteArray.m7647k());
            i2 = i2 + 4 + strArr[i3].length();
        }
        if (z2 && (parsableByteArray.m7657u() & 1) == 0) {
            throw ParserException.m5907a("framing bit expected to be set", null);
        }
        return new CommentHeader(m7654r, strArr, i2 + 1);
    }

    /* renamed from: c */
    public static boolean m6433c(int i2, ParsableByteArray parsableByteArray, boolean z) throws ParserException {
        if (parsableByteArray.m7637a() < 7) {
            if (z) {
                return false;
            }
            throw C1008a.m6436c(29, "too short header: ", parsableByteArray.m7637a(), null);
        }
        if (parsableByteArray.m7657u() != i2) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw ParserException.m5907a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        }
        if (parsableByteArray.m7657u() == 118 && parsableByteArray.m7657u() == 111 && parsableByteArray.m7657u() == 114 && parsableByteArray.m7657u() == 98 && parsableByteArray.m7657u() == 105 && parsableByteArray.m7657u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.m5907a("expected characters 'vorbis'", null);
    }
}

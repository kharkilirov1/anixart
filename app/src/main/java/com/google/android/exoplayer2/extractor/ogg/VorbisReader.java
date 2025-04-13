package com.google.android.exoplayer2.extractor.ogg;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.VorbisBitArray;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class VorbisReader extends StreamReader {

    /* renamed from: n */
    @Nullable
    public VorbisSetup f11376n;

    /* renamed from: o */
    public int f11377o;

    /* renamed from: p */
    public boolean f11378p;

    /* renamed from: q */
    @Nullable
    public VorbisUtil.VorbisIdHeader f11379q;

    /* renamed from: r */
    @Nullable
    public VorbisUtil.CommentHeader f11380r;

    public static final class VorbisSetup {

        /* renamed from: a */
        public final VorbisUtil.VorbisIdHeader f11381a;

        /* renamed from: b */
        public final byte[] f11382b;

        /* renamed from: c */
        public final VorbisUtil.Mode[] f11383c;

        /* renamed from: d */
        public final int f11384d;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i2) {
            this.f11381a = vorbisIdHeader;
            this.f11382b = bArr;
            this.f11383c = modeArr;
            this.f11384d = i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: b */
    public void mo6547b(long j2) {
        this.f11367g = j2;
        this.f11378p = j2 != 0;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.f11379q;
        this.f11377o = vorbisIdHeader != null ? vorbisIdHeader.f10900e : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: c */
    public long mo6537c(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f14698a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b = bArr[0];
        VorbisSetup vorbisSetup = this.f11376n;
        Assertions.m7518f(vorbisSetup);
        int i2 = !vorbisSetup.f11383c[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - vorbisSetup.f11384d))].f10895a ? vorbisSetup.f11381a.f10900e : vorbisSetup.f11381a.f10901f;
        long j2 = this.f11378p ? (this.f11377o + i2) / 4 : 0;
        byte[] bArr2 = parsableByteArray.f14698a;
        int length = bArr2.length;
        int i3 = parsableByteArray.f14700c + 4;
        if (length < i3) {
            parsableByteArray.m7632C(Arrays.copyOf(bArr2, i3));
        } else {
            parsableByteArray.m7634E(i3);
        }
        byte[] bArr3 = parsableByteArray.f14698a;
        int i4 = parsableByteArray.f14700c;
        bArr3[i4 - 4] = (byte) (j2 & 255);
        bArr3[i4 - 3] = (byte) ((j2 >>> 8) & 255);
        bArr3[i4 - 2] = (byte) ((j2 >>> 16) & 255);
        bArr3[i4 - 1] = (byte) ((j2 >>> 24) & 255);
        this.f11378p = true;
        this.f11377o = i2;
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo6538d(ParsableByteArray parsableByteArray, long j2, StreamReader.SetupData setupData) throws IOException {
        VorbisSetup vorbisSetup;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f11376n != null) {
            Objects.requireNonNull(setupData.f11374a);
            return false;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.f11379q;
        if (vorbisIdHeader == null) {
            VorbisUtil.m6433c(1, parsableByteArray, false);
            int m7648l = parsableByteArray.m7648l();
            int m7657u = parsableByteArray.m7657u();
            int m7648l2 = parsableByteArray.m7648l();
            int m7644h = parsableByteArray.m7644h();
            int i7 = m7644h <= 0 ? -1 : m7644h;
            int m7644h2 = parsableByteArray.m7644h();
            int i8 = m7644h2 <= 0 ? -1 : m7644h2;
            int m7644h3 = parsableByteArray.m7644h();
            int i9 = m7644h3 <= 0 ? -1 : m7644h3;
            int m7657u2 = parsableByteArray.m7657u();
            this.f11379q = new VorbisUtil.VorbisIdHeader(m7648l, m7657u, m7648l2, i7, i8, i9, (int) Math.pow(2.0d, m7657u2 & 15), (int) Math.pow(2.0d, (m7657u2 & 240) >> 4), (parsableByteArray.m7657u() & 1) > 0, Arrays.copyOf(parsableByteArray.f14698a, parsableByteArray.f14700c));
        } else {
            VorbisUtil.CommentHeader commentHeader = this.f11380r;
            if (commentHeader == null) {
                this.f11380r = VorbisUtil.m6432b(parsableByteArray, true, true);
            } else {
                int i10 = parsableByteArray.f14700c;
                byte[] bArr = new byte[i10];
                System.arraycopy(parsableByteArray.f14698a, 0, bArr, 0, i10);
                int i11 = vorbisIdHeader.f10896a;
                int i12 = 5;
                VorbisUtil.m6433c(5, parsableByteArray, false);
                int m7657u3 = parsableByteArray.m7657u() + 1;
                VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.f14698a);
                vorbisBitArray.m6430c(parsableByteArray.f14699b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 16;
                    if (i13 >= m7657u3) {
                        VorbisUtil.CommentHeader commentHeader2 = commentHeader;
                        byte[] bArr2 = bArr;
                        int i15 = 6;
                        int m6429b = vorbisBitArray.m6429b(6) + 1;
                        for (int i16 = 0; i16 < m6429b; i16++) {
                            if (vorbisBitArray.m6429b(16) != 0) {
                                throw ParserException.m5907a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int m6429b2 = vorbisBitArray.m6429b(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < m6429b2) {
                                int m6429b3 = vorbisBitArray.m6429b(i14);
                                if (m6429b3 == 0) {
                                    i4 = m6429b2;
                                    int i20 = 8;
                                    vorbisBitArray.m6430c(8);
                                    vorbisBitArray.m6430c(16);
                                    vorbisBitArray.m6430c(16);
                                    vorbisBitArray.m6430c(6);
                                    vorbisBitArray.m6430c(8);
                                    int m6429b4 = vorbisBitArray.m6429b(4) + 1;
                                    int i21 = 0;
                                    while (i21 < m6429b4) {
                                        vorbisBitArray.m6430c(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (m6429b3 != i17) {
                                        throw C1008a.m6436c(52, "floor type greater than 1 not decodable: ", m6429b3, null);
                                    }
                                    int m6429b5 = vorbisBitArray.m6429b(5);
                                    int[] iArr = new int[m6429b5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < m6429b5; i23++) {
                                        iArr[i23] = vorbisBitArray.m6429b(4);
                                        if (iArr[i23] > i22) {
                                            i22 = iArr[i23];
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = vorbisBitArray.m6429b(i19) + 1;
                                        int m6429b6 = vorbisBitArray.m6429b(2);
                                        int i26 = 8;
                                        if (m6429b6 > 0) {
                                            vorbisBitArray.m6430c(8);
                                        }
                                        int i27 = m6429b2;
                                        int i28 = 0;
                                        for (int i29 = 1; i28 < (i29 << m6429b6); i29 = 1) {
                                            vorbisBitArray.m6430c(i26);
                                            i28++;
                                            i26 = 8;
                                        }
                                        i25++;
                                        i19 = 3;
                                        m6429b2 = i27;
                                    }
                                    i4 = m6429b2;
                                    vorbisBitArray.m6430c(2);
                                    int m6429b7 = vorbisBitArray.m6429b(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < m6429b5; i32++) {
                                        i30 += iArr2[iArr[i32]];
                                        while (i31 < i30) {
                                            vorbisBitArray.m6430c(m6429b7);
                                            i31++;
                                        }
                                    }
                                }
                                i18++;
                                i15 = 6;
                                i17 = 1;
                                i14 = 16;
                                m6429b2 = i4;
                            } else {
                                int i33 = 1;
                                int m6429b8 = vorbisBitArray.m6429b(i15) + 1;
                                int i34 = 0;
                                while (i34 < m6429b8) {
                                    if (vorbisBitArray.m6429b(16) > 2) {
                                        throw ParserException.m5907a("residueType greater than 2 is not decodable", null);
                                    }
                                    vorbisBitArray.m6430c(24);
                                    vorbisBitArray.m6430c(24);
                                    vorbisBitArray.m6430c(24);
                                    int m6429b9 = vorbisBitArray.m6429b(i15) + i33;
                                    int i35 = 8;
                                    vorbisBitArray.m6430c(8);
                                    int[] iArr3 = new int[m6429b9];
                                    for (int i36 = 0; i36 < m6429b9; i36++) {
                                        iArr3[i36] = ((vorbisBitArray.m6428a() ? vorbisBitArray.m6429b(5) : 0) * 8) + vorbisBitArray.m6429b(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < m6429b9) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr3[i37] & (1 << i38)) != 0) {
                                                vorbisBitArray.m6430c(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i15 = 6;
                                    i33 = 1;
                                }
                                int m6429b10 = vorbisBitArray.m6429b(i15) + 1;
                                for (int i39 = 0; i39 < m6429b10; i39++) {
                                    int m6429b11 = vorbisBitArray.m6429b(16);
                                    if (m6429b11 != 0) {
                                        StringBuilder sb = new StringBuilder(52);
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(m6429b11);
                                        Log.e("VorbisUtil", sb.toString());
                                    } else {
                                        if (vorbisBitArray.m6428a()) {
                                            i2 = 1;
                                            i3 = vorbisBitArray.m6429b(4) + 1;
                                        } else {
                                            i2 = 1;
                                            i3 = 1;
                                        }
                                        if (vorbisBitArray.m6428a()) {
                                            int m6429b12 = vorbisBitArray.m6429b(8) + i2;
                                            for (int i40 = 0; i40 < m6429b12; i40++) {
                                                int i41 = i11 - 1;
                                                vorbisBitArray.m6430c(VorbisUtil.m6431a(i41));
                                                vorbisBitArray.m6430c(VorbisUtil.m6431a(i41));
                                            }
                                        }
                                        if (vorbisBitArray.m6429b(2) != 0) {
                                            throw ParserException.m5907a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i3 > 1) {
                                            for (int i42 = 0; i42 < i11; i42++) {
                                                vorbisBitArray.m6430c(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i3; i43++) {
                                            vorbisBitArray.m6430c(8);
                                            vorbisBitArray.m6430c(8);
                                            vorbisBitArray.m6430c(8);
                                        }
                                    }
                                }
                                int m6429b13 = vorbisBitArray.m6429b(6) + 1;
                                VorbisUtil.Mode[] modeArr = new VorbisUtil.Mode[m6429b13];
                                for (int i44 = 0; i44 < m6429b13; i44++) {
                                    modeArr[i44] = new VorbisUtil.Mode(vorbisBitArray.m6428a(), vorbisBitArray.m6429b(16), vorbisBitArray.m6429b(16), vorbisBitArray.m6429b(8));
                                }
                                if (!vorbisBitArray.m6428a()) {
                                    throw ParserException.m5907a("framing bit after modes not set as expected", null);
                                }
                                vorbisSetup = new VorbisSetup(vorbisIdHeader, commentHeader2, bArr2, modeArr, VorbisUtil.m6431a(m6429b13 - 1));
                            }
                        }
                    } else {
                        if (vorbisBitArray.m6429b(24) != 5653314) {
                            throw C1008a.m6436c(66, "expected code book to start with [0x56, 0x43, 0x42] at ", (vorbisBitArray.f10892c * 8) + vorbisBitArray.f10893d, null);
                        }
                        int m6429b14 = vorbisBitArray.m6429b(16);
                        int m6429b15 = vorbisBitArray.m6429b(24);
                        long[] jArr = new long[m6429b15];
                        if (vorbisBitArray.m6428a()) {
                            i5 = m7657u3;
                            int m6429b16 = vorbisBitArray.m6429b(5) + 1;
                            int i45 = 0;
                            while (i45 < m6429b15) {
                                int m6429b17 = vorbisBitArray.m6429b(VorbisUtil.m6431a(m6429b15 - i45));
                                int i46 = 0;
                                while (i46 < m6429b17 && i45 < m6429b15) {
                                    jArr[i45] = m6429b16;
                                    i45++;
                                    i46++;
                                    commentHeader = commentHeader;
                                    bArr = bArr;
                                }
                                m6429b16++;
                                commentHeader = commentHeader;
                                bArr = bArr;
                            }
                        } else {
                            boolean m6428a = vorbisBitArray.m6428a();
                            int i47 = 0;
                            while (i47 < m6429b15) {
                                if (!m6428a) {
                                    i6 = m7657u3;
                                    jArr[i47] = vorbisBitArray.m6429b(5) + 1;
                                } else if (vorbisBitArray.m6428a()) {
                                    i6 = m7657u3;
                                    jArr[i47] = vorbisBitArray.m6429b(i12) + 1;
                                } else {
                                    i6 = m7657u3;
                                    jArr[i47] = 0;
                                }
                                i47++;
                                i12 = 5;
                                m7657u3 = i6;
                            }
                            i5 = m7657u3;
                        }
                        VorbisUtil.CommentHeader commentHeader3 = commentHeader;
                        byte[] bArr3 = bArr;
                        int m6429b18 = vorbisBitArray.m6429b(4);
                        if (m6429b18 > 2) {
                            throw C1008a.m6436c(53, "lookup type greater than 2 not decodable: ", m6429b18, null);
                        }
                        if (m6429b18 == 1 || m6429b18 == 2) {
                            vorbisBitArray.m6430c(32);
                            vorbisBitArray.m6430c(32);
                            int m6429b19 = vorbisBitArray.m6429b(4) + 1;
                            vorbisBitArray.m6430c(1);
                            vorbisBitArray.m6430c((int) (m6429b19 * (m6429b18 == 1 ? m6429b14 != 0 ? (long) Math.floor(Math.pow(m6429b15, 1.0d / m6429b14)) : 0L : m6429b15 * m6429b14)));
                        }
                        i13++;
                        i12 = 5;
                        m7657u3 = i5;
                        commentHeader = commentHeader3;
                        bArr = bArr3;
                    }
                }
            }
        }
        vorbisSetup = null;
        this.f11376n = vorbisSetup;
        if (vorbisSetup == null) {
            return true;
        }
        VorbisUtil.VorbisIdHeader vorbisIdHeader2 = vorbisSetup.f11381a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vorbisIdHeader2.f10902g);
        arrayList.add(vorbisSetup.f11382b);
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/vorbis";
        builder.f9682f = vorbisIdHeader2.f10899d;
        builder.f9683g = vorbisIdHeader2.f10898c;
        builder.f9700x = vorbisIdHeader2.f10896a;
        builder.f9701y = vorbisIdHeader2.f10897b;
        builder.f9689m = arrayList;
        setupData.f11374a = builder.m5833a();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: e */
    public void mo6539e(boolean z) {
        super.mo6539e(z);
        if (z) {
            this.f11376n = null;
            this.f11379q = null;
            this.f11380r = null;
        }
        this.f11377o = 0;
        this.f11378p = false;
    }
}

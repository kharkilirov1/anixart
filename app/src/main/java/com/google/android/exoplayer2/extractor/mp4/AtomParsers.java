package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class AtomParsers {

    /* renamed from: a */
    public static final byte[] f11161a = Util.m7708G("OpusHead");

    public static final class ChunkIterator {

        /* renamed from: a */
        public final int f11162a;

        /* renamed from: b */
        public int f11163b;

        /* renamed from: c */
        public int f11164c;

        /* renamed from: d */
        public long f11165d;

        /* renamed from: e */
        public final boolean f11166e;

        /* renamed from: f */
        public final ParsableByteArray f11167f;

        /* renamed from: g */
        public final ParsableByteArray f11168g;

        /* renamed from: h */
        public int f11169h;

        /* renamed from: i */
        public int f11170i;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.f11168g = parsableByteArray;
            this.f11167f = parsableByteArray2;
            this.f11166e = z;
            parsableByteArray2.m7635F(12);
            this.f11162a = parsableByteArray2.m7660x();
            parsableByteArray.m7635F(12);
            this.f11170i = parsableByteArray.m7660x();
            ExtractorUtil.m6405a(parsableByteArray.m7642f() == 1, "first_chunk must be 1");
            this.f11163b = -1;
        }

        /* renamed from: a */
        public boolean m6500a() {
            int i2 = this.f11163b + 1;
            this.f11163b = i2;
            if (i2 == this.f11162a) {
                return false;
            }
            this.f11165d = this.f11166e ? this.f11167f.m7661y() : this.f11167f.m7658v();
            if (this.f11163b == this.f11169h) {
                this.f11164c = this.f11168g.m7660x();
                this.f11168g.m7636G(4);
                int i3 = this.f11170i - 1;
                this.f11170i = i3;
                this.f11169h = i3 > 0 ? this.f11168g.m7660x() - 1 : -1;
            }
            return true;
        }
    }

    public interface SampleSizeBox {
        /* renamed from: a */
        int mo6501a();

        /* renamed from: b */
        int mo6502b();

        /* renamed from: c */
        int mo6503c();
    }

    public static final class StsdData {

        /* renamed from: a */
        public final TrackEncryptionBox[] f11171a;

        /* renamed from: b */
        @Nullable
        public Format f11172b;

        /* renamed from: c */
        public int f11173c;

        /* renamed from: d */
        public int f11174d = 0;

        public StsdData(int i2) {
            this.f11171a = new TrackEncryptionBox[i2];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {

        /* renamed from: a */
        public final int f11175a;

        /* renamed from: b */
        public final int f11176b;

        /* renamed from: c */
        public final ParsableByteArray f11177c;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.f11160b;
            this.f11177c = parsableByteArray;
            parsableByteArray.m7635F(12);
            int m7660x = parsableByteArray.m7660x();
            if ("audio/raw".equals(format.f9659m)) {
                int m7703B = Util.m7703B(format.f9642B, format.f9672z);
                if (m7660x == 0 || m7660x % m7703B != 0) {
                    Log.w("AtomParsers", C0576a.m4112k(88, "Audio sample size mismatch. stsd sample size: ", m7703B, ", stsz sample size: ", m7660x));
                    m7660x = m7703B;
                }
            }
            this.f11175a = m7660x == 0 ? -1 : m7660x;
            this.f11176b = parsableByteArray.m7660x();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: a */
        public int mo6501a() {
            return this.f11175a;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: b */
        public int mo6502b() {
            return this.f11176b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: c */
        public int mo6503c() {
            int i2 = this.f11175a;
            return i2 == -1 ? this.f11177c.m7660x() : i2;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {

        /* renamed from: a */
        public final ParsableByteArray f11178a;

        /* renamed from: b */
        public final int f11179b;

        /* renamed from: c */
        public final int f11180c;

        /* renamed from: d */
        public int f11181d;

        /* renamed from: e */
        public int f11182e;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.f11160b;
            this.f11178a = parsableByteArray;
            parsableByteArray.m7635F(12);
            this.f11180c = parsableByteArray.m7660x() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f11179b = parsableByteArray.m7660x();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: a */
        public int mo6501a() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: b */
        public int mo6502b() {
            return this.f11179b;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        /* renamed from: c */
        public int mo6503c() {
            int i2 = this.f11180c;
            if (i2 == 8) {
                return this.f11178a.m7657u();
            }
            if (i2 == 16) {
                return this.f11178a.m7662z();
            }
            int i3 = this.f11181d;
            this.f11181d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f11182e & 15;
            }
            int m7657u = this.f11178a.m7657u();
            this.f11182e = m7657u;
            return (m7657u & 240) >> 4;
        }
    }

    public static final class TkhdData {

        /* renamed from: a */
        public final int f11183a;

        /* renamed from: b */
        public final long f11184b;

        /* renamed from: c */
        public final int f11185c;

        public TkhdData(int i2, long j2, int i3) {
            this.f11183a = i2;
            this.f11184b = j2;
            this.f11185c = i3;
        }
    }

    /* renamed from: a */
    public static Pair<String, byte[]> m6495a(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.m7635F(i2 + 8 + 4);
        parsableByteArray.m7636G(1);
        m6496b(parsableByteArray);
        parsableByteArray.m7636G(2);
        int m7657u = parsableByteArray.m7657u();
        if ((m7657u & 128) != 0) {
            parsableByteArray.m7636G(2);
        }
        if ((m7657u & 64) != 0) {
            parsableByteArray.m7636G(parsableByteArray.m7662z());
        }
        if ((m7657u & 32) != 0) {
            parsableByteArray.m7636G(2);
        }
        parsableByteArray.m7636G(1);
        m6496b(parsableByteArray);
        String m7598f = MimeTypes.m7598f(parsableByteArray.m7657u());
        if ("audio/mpeg".equals(m7598f) || "audio/vnd.dts".equals(m7598f) || "audio/vnd.dts.hd".equals(m7598f)) {
            return Pair.create(m7598f, null);
        }
        parsableByteArray.m7636G(12);
        parsableByteArray.m7636G(1);
        int m6496b = m6496b(parsableByteArray);
        byte[] bArr = new byte[m6496b];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, m6496b);
        parsableByteArray.f14699b += m6496b;
        return Pair.create(m7598f, bArr);
    }

    /* renamed from: b */
    public static int m6496b(ParsableByteArray parsableByteArray) {
        int m7657u = parsableByteArray.m7657u();
        int i2 = m7657u & 127;
        while ((m7657u & 128) == 128) {
            m7657u = parsableByteArray.m7657u();
            i2 = (i2 << 7) | (m7657u & 127);
        }
        return i2;
    }

    @Nullable
    /* renamed from: c */
    public static Pair<Integer, TrackEncryptionBox> m6497c(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        Integer num;
        TrackEncryptionBox trackEncryptionBox;
        Pair<Integer, TrackEncryptionBox> create;
        int i4;
        int i5;
        byte[] bArr;
        int i6 = parsableByteArray.f14699b;
        while (i6 - i2 < i3) {
            parsableByteArray.m7635F(i6);
            int m7642f = parsableByteArray.m7642f();
            int i7 = 1;
            ExtractorUtil.m6405a(m7642f > 0, "childAtomSize must be positive");
            if (parsableByteArray.m7642f() == 1936289382) {
                int i8 = i6 + 8;
                int i9 = -1;
                int i10 = 0;
                String str = null;
                Integer num2 = null;
                while (i8 - i6 < m7642f) {
                    parsableByteArray.m7635F(i8);
                    int m7642f2 = parsableByteArray.m7642f();
                    int m7642f3 = parsableByteArray.m7642f();
                    if (m7642f3 == 1718775137) {
                        num2 = Integer.valueOf(parsableByteArray.m7642f());
                    } else if (m7642f3 == 1935894637) {
                        parsableByteArray.m7636G(4);
                        str = parsableByteArray.m7654r(4);
                    } else if (m7642f3 == 1935894633) {
                        i9 = i8;
                        i10 = m7642f2;
                    }
                    i8 += m7642f2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    ExtractorUtil.m6405a(num2 != null, "frma atom is mandatory");
                    ExtractorUtil.m6405a(i9 != -1, "schi atom is mandatory");
                    int i11 = i9 + 8;
                    while (true) {
                        if (i11 - i9 >= i10) {
                            num = num2;
                            trackEncryptionBox = null;
                            break;
                        }
                        parsableByteArray.m7635F(i11);
                        int m7642f4 = parsableByteArray.m7642f();
                        if (parsableByteArray.m7642f() == 1952804451) {
                            int m7642f5 = (parsableByteArray.m7642f() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            parsableByteArray.m7636G(i7);
                            if (m7642f5 == 0) {
                                parsableByteArray.m7636G(i7);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int m7657u = parsableByteArray.m7657u();
                                int i12 = (m7657u & 240) >> 4;
                                i4 = m7657u & 15;
                                i5 = i12;
                            }
                            boolean z = parsableByteArray.m7657u() == i7;
                            int m7657u2 = parsableByteArray.m7657u();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr2, 0, 16);
                            parsableByteArray.f14699b += 16;
                            if (z && m7657u2 == 0) {
                                int m7657u3 = parsableByteArray.m7657u();
                                byte[] bArr3 = new byte[m7657u3];
                                System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr3, 0, m7657u3);
                                parsableByteArray.f14699b += m7657u3;
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            trackEncryptionBox = new TrackEncryptionBox(z, str, m7657u2, bArr2, i5, i4, bArr);
                        } else {
                            i11 += m7642f4;
                            i7 = 1;
                        }
                    }
                    ExtractorUtil.m6405a(trackEncryptionBox != null, "tenc atom is mandatory");
                    int i13 = Util.f14736a;
                    create = Pair.create(num, trackEncryptionBox);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i6 += m7642f;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:366:0x0a3f, code lost:
    
        if (r21 == null) goto L509;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x061e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData m6498d(com.google.android.exoplayer2.util.ParsableByteArray r42, int r43, int r44, java.lang.String r45, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r46, boolean r47) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 2669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.m6498d(com.google.android.exoplayer2.util.ParsableByteArray, int, int, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData, boolean):com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05f0  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.google.android.exoplayer2.extractor.mp4.TrackSampleTable> m6499e(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r37, com.google.android.exoplayer2.extractor.GaplessInfoHolder r38, long r39, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r41, boolean r42, boolean r43, com.google.common.base.Function<com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Track> r44) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 2160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.m6499e(com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, com.google.common.base.Function):java.util.List");
    }
}

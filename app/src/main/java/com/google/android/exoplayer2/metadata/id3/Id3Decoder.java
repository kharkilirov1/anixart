package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {

    /* renamed from: b */
    public static final FramePredicate f12056b = C0954j.f10225r;

    /* renamed from: a */
    @Nullable
    public final FramePredicate f12057a;

    public interface FramePredicate {
        /* renamed from: d */
        boolean mo6099d(int i2, int i3, int i4, int i5, int i6);
    }

    public static final class Id3Header {

        /* renamed from: a */
        public final int f12058a;

        /* renamed from: b */
        public final boolean f12059b;

        /* renamed from: c */
        public final int f12060c;

        public Id3Header(int i2, boolean z, int i3) {
            this.f12058a = i2;
            this.f12059b = z;
            this.f12060c = i3;
        }
    }

    public Id3Decoder() {
        this.f12057a = null;
    }

    /* renamed from: c */
    public static byte[] m6709c(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? Util.f14741f : Arrays.copyOfRange(bArr, i2, i3);
    }

    /* renamed from: e */
    public static ApicFrame m6710e(ParsableByteArray parsableByteArray, int i2, int i3) throws UnsupportedEncodingException {
        int m6728w;
        String concat;
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i4);
        parsableByteArray.f14699b += i4;
        if (i3 == 2) {
            String valueOf = String.valueOf(Ascii.m11123c(new String(bArr, 0, 3, "ISO-8859-1")));
            String concat2 = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(concat2)) {
                concat2 = "image/jpeg";
            }
            concat = concat2;
            m6728w = 2;
        } else {
            m6728w = m6728w(bArr, 0);
            String m11123c = Ascii.m11123c(new String(bArr, 0, m6728w, "ISO-8859-1"));
            concat = m11123c.indexOf(47) == -1 ? m11123c.length() != 0 ? "image/".concat(m11123c) : new String("image/") : m11123c;
        }
        int i5 = bArr[m6728w + 1] & 255;
        int i6 = m6728w + 2;
        int m6727v = m6727v(bArr, i6, m7657u);
        return new ApicFrame(concat, new String(bArr, i6, m6727v - i6, m6725t), i5, m6709c(bArr, m6724s(m7657u) + m6727v, i4));
    }

    /* renamed from: f */
    public static BinaryFrame m6711f(ParsableByteArray parsableByteArray, int i2, String str) {
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i2);
        parsableByteArray.f14699b += i2;
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: g */
    public static ChapterFrame m6712g(ParsableByteArray parsableByteArray, int i2, int i3, boolean z, int i4, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
        int i5 = parsableByteArray.f14699b;
        int m6728w = m6728w(parsableByteArray.f14698a, i5);
        String str = new String(parsableByteArray.f14698a, i5, m6728w - i5, "ISO-8859-1");
        parsableByteArray.m7635F(m6728w + 1);
        int m7642f = parsableByteArray.m7642f();
        int m7642f2 = parsableByteArray.m7642f();
        long m7658v = parsableByteArray.m7658v();
        long j2 = m7658v == 4294967295L ? -1L : m7658v;
        long m7658v2 = parsableByteArray.m7658v();
        long j3 = m7658v2 == 4294967295L ? -1L : m7658v2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (parsableByteArray.f14699b < i6) {
            Id3Frame m6715j = m6715j(i3, parsableByteArray, z, i4, framePredicate);
            if (m6715j != null) {
                arrayList.add(m6715j);
            }
        }
        return new ChapterFrame(str, m7642f, m7642f2, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: h */
    public static ChapterTocFrame m6713h(ParsableByteArray parsableByteArray, int i2, int i3, boolean z, int i4, @Nullable FramePredicate framePredicate) throws UnsupportedEncodingException {
        int i5 = parsableByteArray.f14699b;
        int m6728w = m6728w(parsableByteArray.f14698a, i5);
        String str = new String(parsableByteArray.f14698a, i5, m6728w - i5, "ISO-8859-1");
        parsableByteArray.m7635F(m6728w + 1);
        int m7657u = parsableByteArray.m7657u();
        boolean z2 = (m7657u & 2) != 0;
        boolean z3 = (m7657u & 1) != 0;
        int m7657u2 = parsableByteArray.m7657u();
        String[] strArr = new String[m7657u2];
        for (int i6 = 0; i6 < m7657u2; i6++) {
            int i7 = parsableByteArray.f14699b;
            int m6728w2 = m6728w(parsableByteArray.f14698a, i7);
            strArr[i6] = new String(parsableByteArray.f14698a, i7, m6728w2 - i7, "ISO-8859-1");
            parsableByteArray.m7635F(m6728w2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (parsableByteArray.f14699b < i8) {
            Id3Frame m6715j = m6715j(i3, parsableByteArray, z, i4, framePredicate);
            if (m6715j != null) {
                arrayList.add(m6715j);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    /* renamed from: i */
    public static CommentFrame m6714i(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        byte[] bArr = new byte[3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, 3);
        parsableByteArray.f14699b += 3;
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr2, 0, i3);
        parsableByteArray.f14699b += i3;
        int m6727v = m6727v(bArr2, 0, m7657u);
        String str2 = new String(bArr2, 0, m6727v, m6725t);
        int m6724s = m6724s(m7657u) + m6727v;
        return new CommentFrame(str, str2, m6719n(bArr2, m6724s, m6727v(bArr2, m6724s, m7657u), m6725t));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0188, code lost:
    
        if (r13 == 67) goto L132;
     */
    @androidx.annotation.Nullable
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame m6715j(int r19, com.google.android.exoplayer2.util.ParsableByteArray r20, boolean r21, int r22, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.m6715j(int, com.google.android.exoplayer2.util.ParsableByteArray, boolean, int, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: k */
    public static GeobFrame m6716k(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i3);
        parsableByteArray.f14699b += i3;
        int m6728w = m6728w(bArr, 0);
        String str = new String(bArr, 0, m6728w, "ISO-8859-1");
        int i4 = m6728w + 1;
        int m6727v = m6727v(bArr, i4, m7657u);
        String m6719n = m6719n(bArr, i4, m6727v, m6725t);
        int m6724s = m6724s(m7657u) + m6727v;
        int m6727v2 = m6727v(bArr, m6724s, m7657u);
        return new GeobFrame(str, m6719n, m6719n(bArr, m6724s, m6727v2, m6725t), m6709c(bArr, m6724s(m7657u) + m6727v2, i3));
    }

    /* renamed from: l */
    public static MlltFrame m6717l(ParsableByteArray parsableByteArray, int i2) {
        int m7662z = parsableByteArray.m7662z();
        int m7659w = parsableByteArray.m7659w();
        int m7659w2 = parsableByteArray.m7659w();
        int m7657u = parsableByteArray.m7657u();
        int m7657u2 = parsableByteArray.m7657u();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.m7625j(parsableByteArray.f14698a, parsableByteArray.f14700c);
        parsableBitArray.m7626k(parsableByteArray.f14699b * 8);
        int i3 = ((i2 - 10) * 8) / (m7657u + m7657u2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m7622g = parsableBitArray.m7622g(m7657u);
            int m7622g2 = parsableBitArray.m7622g(m7657u2);
            iArr[i4] = m7622g;
            iArr2[i4] = m7622g2;
        }
        return new MlltFrame(m7662z, m7659w, m7659w2, iArr, iArr2);
    }

    /* renamed from: m */
    public static PrivFrame m6718m(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i2);
        parsableByteArray.f14699b += i2;
        int m6728w = m6728w(bArr, 0);
        return new PrivFrame(new String(bArr, 0, m6728w, "ISO-8859-1"), m6709c(bArr, m6728w + 1, i2));
    }

    /* renamed from: n */
    public static String m6719n(byte[] bArr, int i2, int i3, String str) throws UnsupportedEncodingException {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    @Nullable
    /* renamed from: o */
    public static TextInformationFrame m6720o(ParsableByteArray parsableByteArray, int i2, String str) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i3);
        parsableByteArray.f14699b += i3;
        return new TextInformationFrame(str, null, new String(bArr, 0, m6727v(bArr, 0, m7657u), m6725t));
    }

    @Nullable
    /* renamed from: p */
    public static TextInformationFrame m6721p(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i3);
        parsableByteArray.f14699b += i3;
        int m6727v = m6727v(bArr, 0, m7657u);
        String str = new String(bArr, 0, m6727v, m6725t);
        int m6724s = m6724s(m7657u) + m6727v;
        return new TextInformationFrame("TXXX", str, m6719n(bArr, m6724s, m6727v(bArr, m6724s, m7657u), m6725t));
    }

    /* renamed from: q */
    public static UrlLinkFrame m6722q(ParsableByteArray parsableByteArray, int i2, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i2);
        parsableByteArray.f14699b += i2;
        return new UrlLinkFrame(str, null, new String(bArr, 0, m6728w(bArr, 0), "ISO-8859-1"));
    }

    @Nullable
    /* renamed from: r */
    public static UrlLinkFrame m6723r(ParsableByteArray parsableByteArray, int i2) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        int m7657u = parsableByteArray.m7657u();
        String m6725t = m6725t(m7657u);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i3);
        parsableByteArray.f14699b += i3;
        int m6727v = m6727v(bArr, 0, m7657u);
        String str = new String(bArr, 0, m6727v, m6725t);
        int m6724s = m6724s(m7657u) + m6727v;
        return new UrlLinkFrame("WXXX", str, m6719n(bArr, m6724s, m6728w(bArr, m6724s), "ISO-8859-1"));
    }

    /* renamed from: s */
    public static int m6724s(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    /* renamed from: t */
    public static String m6725t(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: u */
    public static String m6726u(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    /* renamed from: v */
    public static int m6727v(byte[] bArr, int i2, int i3) {
        int m6728w = m6728w(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return m6728w;
        }
        while (m6728w < bArr.length - 1) {
            if ((m6728w - i2) % 2 == 0 && bArr[m6728w + 1] == 0) {
                return m6728w;
            }
            m6728w = m6728w(bArr, m6728w + 1);
        }
        return bArr.length;
    }

    /* renamed from: w */
    public static int m6728w(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    /* renamed from: x */
    public static int m6729x(ParsableByteArray parsableByteArray, int i2) {
        byte[] bArr = parsableByteArray.f14698a;
        int i3 = parsableByteArray.f14699b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0082, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m6730y(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f14699b
        L6:
            int r3 = r18.m7637a()     // Catch: java.lang.Throwable -> Lab
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.m7642f()     // Catch: java.lang.Throwable -> Lab
            long r8 = r18.m7658v()     // Catch: java.lang.Throwable -> Lab
            int r10 = r18.m7662z()     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L20:
            int r7 = r18.m7659w()     // Catch: java.lang.Throwable -> Lab
            int r8 = r18.m7659w()     // Catch: java.lang.Throwable -> Lab
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.m7635F(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L49
            r1.m7635F(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L94
            r1.m7635F(r2)
            return r6
        L94:
            int r3 = r18.m7637a()     // Catch: java.lang.Throwable -> Lab
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La1
            r1.m7635F(r2)
            return r6
        La1:
            int r3 = (int) r8
            r1.m7636G(r3)     // Catch: java.lang.Throwable -> Lab
            goto L6
        La7:
            r1.m7635F(r2)
            return r4
        Lab:
            r0 = move-exception
            r1.m7635F(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.m6730y(com.google.android.exoplayer2.util.ParsableByteArray, int, int, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    /* renamed from: b */
    public Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return m6731d(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
    @androidx.annotation.Nullable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.metadata.Metadata m6731d(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.m6731d(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.f12057a = framePredicate;
    }
}

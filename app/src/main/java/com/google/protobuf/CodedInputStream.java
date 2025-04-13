package com.google.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class CodedInputStream {

    /* renamed from: a */
    public int f23993a;

    /* renamed from: b */
    public int f23994b = 100;

    /* renamed from: c */
    public int f23995c = Integer.MAX_VALUE;

    /* renamed from: d */
    public CodedInputStreamReader f23996d;

    public static final class ArrayDecoder extends CodedInputStream {

        /* renamed from: e */
        public final byte[] f23997e;

        /* renamed from: f */
        public final boolean f23998f;

        /* renamed from: g */
        public int f23999g;

        /* renamed from: h */
        public int f24000h;

        /* renamed from: i */
        public int f24001i;

        /* renamed from: j */
        public int f24002j;

        /* renamed from: k */
        public int f24003k;

        /* renamed from: l */
        public int f24004l;

        public ArrayDecoder(byte[] bArr, int i2, int i3, boolean z, C23511 c23511) {
            super(null);
            this.f24004l = Integer.MAX_VALUE;
            this.f23997e = bArr;
            this.f23999g = i3 + i2;
            this.f24001i = i2;
            this.f24002j = i2;
            this.f23998f = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: A */
        public int mo13176A() throws IOException {
            return m13203G();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: B */
        public long mo13177B() throws IOException {
            return m13204H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: C */
        public boolean mo13178C(int i2) throws IOException {
            int mo13199z;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f23999g - this.f24001i < 10) {
                    while (i4 < 10) {
                        if (m13200D() < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.m13460e();
                }
                while (i4 < 10) {
                    byte[] bArr = this.f23997e;
                    int i5 = this.f24001i;
                    this.f24001i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.m13460e();
                return true;
            }
            if (i3 == 1) {
                m13207K(8);
                return true;
            }
            if (i3 == 2) {
                m13207K(m13203G());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                m13207K(4);
                return true;
            }
            do {
                mo13199z = mo13199z();
                if (mo13199z == 0) {
                    break;
                }
            } while (mo13178C(mo13199z));
            mo13179a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        /* renamed from: D */
        public byte m13200D() throws IOException {
            int i2 = this.f24001i;
            if (i2 == this.f23999g) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23997e;
            this.f24001i = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: E */
        public int m13201E() throws IOException {
            int i2 = this.f24001i;
            if (this.f23999g - i2 < 4) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23997e;
            this.f24001i = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: F */
        public long m13202F() throws IOException {
            int i2 = this.f24001i;
            if (this.f23999g - i2 < 8) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23997e;
            this.f24001i = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m13203G() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f24001i
                int r1 = r5.f23999g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f23997e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f24001i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m13205I()
                int r1 = (int) r0
                return r1
            L70:
                r5.f24001i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.m13203G():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m13204H() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.m13204H():long");
        }

        /* renamed from: I */
        public long m13205I() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((m13200D() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m13460e();
        }

        /* renamed from: J */
        public final void m13206J() {
            int i2 = this.f23999g + this.f24000h;
            this.f23999g = i2;
            int i3 = i2 - this.f24002j;
            int i4 = this.f24004l;
            if (i3 <= i4) {
                this.f24000h = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f24000h = i5;
            this.f23999g = i2 - i5;
        }

        /* renamed from: K */
        public void m13207K(int i2) throws IOException {
            if (i2 >= 0) {
                int i3 = this.f23999g;
                int i4 = this.f24001i;
                if (i2 <= i3 - i4) {
                    this.f24001i = i4 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.m13463h();
            }
            throw InvalidProtocolBufferException.m13461f();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: a */
        public void mo13179a(int i2) throws InvalidProtocolBufferException {
            if (this.f24003k != i2) {
                throw InvalidProtocolBufferException.m13456a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: d */
        public int mo13180d() {
            return this.f24001i - this.f24002j;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: e */
        public boolean mo13181e() throws IOException {
            return this.f24001i == this.f23999g;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: i */
        public void mo13182i(int i2) {
            this.f24004l = i2;
            m13206J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: j */
        public int mo13183j(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int mo13180d = i2 + mo13180d();
            if (mo13180d < 0) {
                throw InvalidProtocolBufferException.m13462g();
            }
            int i3 = this.f24004l;
            if (mo13180d > i3) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24004l = mo13180d;
            m13206J();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: k */
        public boolean mo13184k() throws IOException {
            return m13204H() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: l */
        public ByteString mo13185l() throws IOException {
            byte[] bArr;
            int m13203G = m13203G();
            if (m13203G > 0) {
                int i2 = this.f23999g;
                int i3 = this.f24001i;
                if (m13203G <= i2 - i3) {
                    boolean z = this.f23998f;
                    ByteString m13151g = ByteString.m13151g(this.f23997e, i3, m13203G);
                    this.f24001i += m13203G;
                    return m13151g;
                }
            }
            if (m13203G == 0) {
                return ByteString.f23981c;
            }
            if (m13203G > 0) {
                int i4 = this.f23999g;
                int i5 = this.f24001i;
                if (m13203G <= i4 - i5) {
                    int i6 = m13203G + i5;
                    this.f24001i = i6;
                    bArr = Arrays.copyOfRange(this.f23997e, i5, i6);
                    ByteString byteString = ByteString.f23981c;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (m13203G > 0) {
                throw InvalidProtocolBufferException.m13463h();
            }
            if (m13203G != 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            bArr = Internal.f24212c;
            ByteString byteString2 = ByteString.f23981c;
            return new ByteString.LiteralByteString(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: m */
        public double mo13186m() throws IOException {
            return Double.longBitsToDouble(m13202F());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: n */
        public int mo13187n() throws IOException {
            return m13203G();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: o */
        public int mo13188o() throws IOException {
            return m13201E();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: p */
        public long mo13189p() throws IOException {
            return m13202F();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: q */
        public float mo13190q() throws IOException {
            return Float.intBitsToFloat(m13201E());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: r */
        public int mo13191r() throws IOException {
            return m13203G();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: s */
        public long mo13192s() throws IOException {
            return m13204H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: t */
        public int mo13193t() throws IOException {
            return m13201E();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: u */
        public long mo13194u() throws IOException {
            return m13202F();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: v */
        public int mo13195v() throws IOException {
            return CodedInputStream.m13171b(m13203G());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: w */
        public long mo13196w() throws IOException {
            return CodedInputStream.m13172c(m13204H());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: x */
        public String mo13197x() throws IOException {
            int m13203G = m13203G();
            if (m13203G > 0) {
                int i2 = this.f23999g;
                int i3 = this.f24001i;
                if (m13203G <= i2 - i3) {
                    String str = new String(this.f23997e, i3, m13203G, Internal.f24211b);
                    this.f24001i += m13203G;
                    return str;
                }
            }
            if (m13203G == 0) {
                return "";
            }
            if (m13203G < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            throw InvalidProtocolBufferException.m13463h();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: y */
        public String mo13198y() throws IOException {
            int m13203G = m13203G();
            if (m13203G > 0) {
                int i2 = this.f23999g;
                int i3 = this.f24001i;
                if (m13203G <= i2 - i3) {
                    String m13728d = Utf8.m13728d(this.f23997e, i3, m13203G);
                    this.f24001i += m13203G;
                    return m13728d;
                }
            }
            if (m13203G == 0) {
                return "";
            }
            if (m13203G <= 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            throw InvalidProtocolBufferException.m13463h();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: z */
        public int mo13199z() throws IOException {
            if (mo13181e()) {
                this.f24003k = 0;
                return 0;
            }
            int m13203G = m13203G();
            this.f24003k = m13203G;
            if ((m13203G >>> 3) != 0) {
                return m13203G;
            }
            throw InvalidProtocolBufferException.m13457b();
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* renamed from: e */
        public final Iterator<ByteBuffer> f24005e;

        /* renamed from: f */
        public ByteBuffer f24006f;

        /* renamed from: g */
        public final boolean f24007g;

        /* renamed from: h */
        public int f24008h;

        /* renamed from: i */
        public int f24009i;

        /* renamed from: j */
        public int f24010j;

        /* renamed from: k */
        public int f24011k;

        /* renamed from: l */
        public int f24012l;

        /* renamed from: m */
        public long f24013m;

        /* renamed from: n */
        public long f24014n;

        /* renamed from: o */
        public long f24015o;

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: A */
        public int mo13176A() throws IOException {
            return m13214J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: B */
        public long mo13177B() throws IOException {
            return m13215K();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: C */
        public boolean mo13178C(int i2) throws IOException {
            int mo13199z;
            int i3 = i2 & 7;
            if (i3 == 0) {
                for (int i4 = 0; i4 < 10; i4++) {
                    if (m13210F() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.m13460e();
            }
            if (i3 == 1) {
                m13219O(8);
                return true;
            }
            if (i3 == 2) {
                m13219O(m13214J());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                m13219O(4);
                return true;
            }
            do {
                mo13199z = mo13199z();
                if (mo13199z == 0) {
                    break;
                }
            } while (mo13178C(mo13199z));
            mo13179a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        /* renamed from: D */
        public final long m13208D() {
            return this.f24015o - this.f24013m;
        }

        /* renamed from: E */
        public final void m13209E() throws InvalidProtocolBufferException {
            if (!this.f24005e.hasNext()) {
                throw InvalidProtocolBufferException.m13463h();
            }
            m13220P();
        }

        /* renamed from: F */
        public byte m13210F() throws IOException {
            if (m13208D() == 0) {
                m13209E();
            }
            long j2 = this.f24013m;
            this.f24013m = 1 + j2;
            return UnsafeUtil.m13683j(j2);
        }

        /* renamed from: G */
        public final void m13211G(byte[] bArr, int i2, int i3) throws IOException {
            if (i3 < 0 || i3 > m13218N()) {
                if (i3 > 0) {
                    throw InvalidProtocolBufferException.m13463h();
                }
                if (i3 != 0) {
                    throw InvalidProtocolBufferException.m13461f();
                }
                return;
            }
            int i4 = i3;
            while (i4 > 0) {
                if (m13208D() == 0) {
                    m13209E();
                }
                int min = Math.min(i4, (int) m13208D());
                long j2 = min;
                UnsafeUtil.m13680g(this.f24013m, bArr, (i3 - i4) + i2, j2);
                i4 -= min;
                this.f24013m += j2;
            }
        }

        /* renamed from: H */
        public int m13212H() throws IOException {
            if (m13208D() < 4) {
                return (m13210F() & 255) | ((m13210F() & 255) << 8) | ((m13210F() & 255) << 16) | ((m13210F() & 255) << 24);
            }
            long j2 = this.f24013m;
            this.f24013m = 4 + j2;
            return ((UnsafeUtil.m13683j(j2 + 3) & 255) << 24) | (UnsafeUtil.m13683j(j2) & 255) | ((UnsafeUtil.m13683j(1 + j2) & 255) << 8) | ((UnsafeUtil.m13683j(2 + j2) & 255) << 16);
        }

        /* renamed from: I */
        public long m13213I() throws IOException {
            if (m13208D() < 8) {
                return (m13210F() & 255) | ((m13210F() & 255) << 8) | ((m13210F() & 255) << 16) | ((m13210F() & 255) << 24) | ((m13210F() & 255) << 32) | ((m13210F() & 255) << 40) | ((m13210F() & 255) << 48) | ((m13210F() & 255) << 56);
            }
            this.f24013m = 8 + this.f24013m;
            return ((UnsafeUtil.m13683j(r0 + 7) & 255) << 56) | (UnsafeUtil.m13683j(r0) & 255) | ((UnsafeUtil.m13683j(1 + r0) & 255) << 8) | ((UnsafeUtil.m13683j(2 + r0) & 255) << 16) | ((UnsafeUtil.m13683j(3 + r0) & 255) << 24) | ((UnsafeUtil.m13683j(4 + r0) & 255) << 32) | ((UnsafeUtil.m13683j(5 + r0) & 255) << 40) | ((UnsafeUtil.m13683j(6 + r0) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13683j(r4) < 0) goto L34;
         */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m13214J() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f24013m
                long r2 = r10.f24015o
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.m13683j(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f24013m
                long r4 = r4 + r2
                r10.f24013m = r4
                return r0
            L1a:
                long r6 = r10.f24015o
                long r8 = r10.f24013m
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.m13216L()
                int r1 = (int) r0
                return r1
            L90:
                r10.f24013m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.m13214J():int");
        }

        /* renamed from: K */
        public long m13215K() throws IOException {
            long m13683j;
            long j2;
            long j3;
            int i2;
            long j4 = this.f24013m;
            if (this.f24015o != j4) {
                long j5 = j4 + 1;
                byte m13683j2 = UnsafeUtil.m13683j(j4);
                if (m13683j2 >= 0) {
                    this.f24013m++;
                    return m13683j2;
                }
                if (this.f24015o - this.f24013m >= 10) {
                    long j6 = j5 + 1;
                    int m13683j3 = m13683j2 ^ (UnsafeUtil.m13683j(j5) << 7);
                    if (m13683j3 >= 0) {
                        long j7 = j6 + 1;
                        int m13683j4 = m13683j3 ^ (UnsafeUtil.m13683j(j6) << 14);
                        if (m13683j4 >= 0) {
                            m13683j = m13683j4 ^ 16256;
                        } else {
                            j6 = j7 + 1;
                            int m13683j5 = m13683j4 ^ (UnsafeUtil.m13683j(j7) << 21);
                            if (m13683j5 < 0) {
                                i2 = m13683j5 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long m13683j6 = m13683j5 ^ (UnsafeUtil.m13683j(j6) << 28);
                                if (m13683j6 < 0) {
                                    long j8 = j7 + 1;
                                    long m13683j7 = m13683j6 ^ (UnsafeUtil.m13683j(j7) << 35);
                                    if (m13683j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        m13683j6 = m13683j7 ^ (UnsafeUtil.m13683j(j8) << 42);
                                        if (m13683j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            m13683j7 = m13683j6 ^ (UnsafeUtil.m13683j(j7) << 49);
                                            if (m13683j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                m13683j = (m13683j7 ^ (UnsafeUtil.m13683j(j8) << 56)) ^ 71499008037633920L;
                                                if (m13683j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (UnsafeUtil.m13683j(j7) >= 0) {
                                                        j6 = j9;
                                                        this.f24013m = j6;
                                                        return m13683j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m13683j = m13683j7 ^ j2;
                                    j6 = j8;
                                    this.f24013m = j6;
                                    return m13683j;
                                }
                                j3 = 266354560;
                                m13683j = m13683j6 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f24013m = j6;
                        return m13683j;
                    }
                    i2 = m13683j3 ^ (-128);
                    m13683j = i2;
                    this.f24013m = j6;
                    return m13683j;
                }
            }
            return m13216L();
        }

        /* renamed from: L */
        public long m13216L() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((m13210F() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m13460e();
        }

        /* renamed from: M */
        public final void m13217M() {
            int i2 = this.f24008h + this.f24009i;
            this.f24008h = i2;
            int i3 = i2 + 0;
            int i4 = this.f24010j;
            if (i3 <= i4) {
                this.f24009i = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f24009i = i5;
            this.f24008h = i2 - i5;
        }

        /* renamed from: N */
        public final int m13218N() {
            return (int) (((this.f24008h - this.f24012l) - this.f24013m) + this.f24014n);
        }

        /* renamed from: O */
        public void m13219O(int i2) throws IOException {
            if (i2 < 0 || i2 > ((this.f24008h - this.f24012l) - this.f24013m) + this.f24014n) {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.m13463h();
                }
                throw InvalidProtocolBufferException.m13461f();
            }
            while (i2 > 0) {
                if (m13208D() == 0) {
                    m13209E();
                }
                int min = Math.min(i2, (int) m13208D());
                i2 -= min;
                this.f24013m += min;
            }
        }

        /* renamed from: P */
        public final void m13220P() {
            ByteBuffer next = this.f24005e.next();
            this.f24006f = next;
            this.f24012l += (int) (this.f24013m - this.f24014n);
            long position = next.position();
            this.f24013m = position;
            this.f24014n = position;
            this.f24015o = this.f24006f.limit();
            long m13675b = UnsafeUtil.m13675b(this.f24006f);
            this.f24013m += m13675b;
            this.f24014n += m13675b;
            this.f24015o += m13675b;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: a */
        public void mo13179a(int i2) throws InvalidProtocolBufferException {
            if (this.f24011k != i2) {
                throw InvalidProtocolBufferException.m13456a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: d */
        public int mo13180d() {
            return (int) (((this.f24012l + 0) + this.f24013m) - this.f24014n);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: e */
        public boolean mo13181e() throws IOException {
            return (((long) this.f24012l) + this.f24013m) - this.f24014n == ((long) this.f24008h);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: i */
        public void mo13182i(int i2) {
            this.f24010j = i2;
            m13217M();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: j */
        public int mo13183j(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int mo13180d = i2 + mo13180d();
            int i3 = this.f24010j;
            if (mo13180d > i3) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24010j = mo13180d;
            m13217M();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: k */
        public boolean mo13184k() throws IOException {
            return m13215K() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: l */
        public ByteString mo13185l() throws IOException {
            int m13214J = m13214J();
            if (m13214J > 0) {
                long j2 = m13214J;
                long j3 = this.f24015o;
                long j4 = this.f24013m;
                if (j2 <= j3 - j4) {
                    boolean z = this.f24007g;
                    byte[] bArr = new byte[m13214J];
                    UnsafeUtil.m13680g(j4, bArr, 0L, j2);
                    this.f24013m += j2;
                    ByteString byteString = ByteString.f23981c;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (m13214J <= 0 || m13214J > m13218N()) {
                if (m13214J == 0) {
                    return ByteString.f23981c;
                }
                if (m13214J < 0) {
                    throw InvalidProtocolBufferException.m13461f();
                }
                throw InvalidProtocolBufferException.m13463h();
            }
            boolean z2 = this.f24007g;
            byte[] bArr2 = new byte[m13214J];
            m13211G(bArr2, 0, m13214J);
            ByteString byteString2 = ByteString.f23981c;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: m */
        public double mo13186m() throws IOException {
            return Double.longBitsToDouble(m13213I());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: n */
        public int mo13187n() throws IOException {
            return m13214J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: o */
        public int mo13188o() throws IOException {
            return m13212H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: p */
        public long mo13189p() throws IOException {
            return m13213I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: q */
        public float mo13190q() throws IOException {
            return Float.intBitsToFloat(m13212H());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: r */
        public int mo13191r() throws IOException {
            return m13214J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: s */
        public long mo13192s() throws IOException {
            return m13215K();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: t */
        public int mo13193t() throws IOException {
            return m13212H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: u */
        public long mo13194u() throws IOException {
            return m13213I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: v */
        public int mo13195v() throws IOException {
            return CodedInputStream.m13171b(m13214J());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: w */
        public long mo13196w() throws IOException {
            return CodedInputStream.m13172c(m13215K());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: x */
        public String mo13197x() throws IOException {
            int m13214J = m13214J();
            if (m13214J > 0) {
                long j2 = m13214J;
                long j3 = this.f24015o;
                long j4 = this.f24013m;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[m13214J];
                    UnsafeUtil.m13680g(j4, bArr, 0L, j2);
                    String str = new String(bArr, Internal.f24211b);
                    this.f24013m += j2;
                    return str;
                }
            }
            if (m13214J > 0 && m13214J <= m13218N()) {
                byte[] bArr2 = new byte[m13214J];
                m13211G(bArr2, 0, m13214J);
                return new String(bArr2, Internal.f24211b);
            }
            if (m13214J == 0) {
                return "";
            }
            if (m13214J < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            throw InvalidProtocolBufferException.m13463h();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: y */
        public String mo13198y() throws IOException {
            int m13214J = m13214J();
            if (m13214J > 0) {
                long j2 = m13214J;
                long j3 = this.f24015o;
                long j4 = this.f24013m;
                if (j2 <= j3 - j4) {
                    String m13727c = Utf8.m13727c(this.f24006f, (int) (j4 - this.f24014n), m13214J);
                    this.f24013m += j2;
                    return m13727c;
                }
            }
            if (m13214J >= 0 && m13214J <= m13218N()) {
                byte[] bArr = new byte[m13214J];
                m13211G(bArr, 0, m13214J);
                return Utf8.m13728d(bArr, 0, m13214J);
            }
            if (m13214J == 0) {
                return "";
            }
            if (m13214J <= 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            throw InvalidProtocolBufferException.m13463h();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: z */
        public int mo13199z() throws IOException {
            if (mo13181e()) {
                this.f24011k = 0;
                return 0;
            }
            int m13214J = m13214J();
            this.f24011k = m13214J;
            if ((m13214J >>> 3) != 0) {
                return m13214J;
            }
            throw InvalidProtocolBufferException.m13457b();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {

        /* renamed from: e */
        public final InputStream f24016e;

        /* renamed from: f */
        public final byte[] f24017f;

        /* renamed from: g */
        public int f24018g;

        /* renamed from: h */
        public int f24019h;

        /* renamed from: i */
        public int f24020i;

        /* renamed from: j */
        public int f24021j;

        /* renamed from: k */
        public int f24022k;

        /* renamed from: l */
        public int f24023l;

        public interface RefillCallback {
        }

        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream, int i2, C23511 c23511) {
            super(null);
            this.f24023l = Integer.MAX_VALUE;
            Charset charset = Internal.f24210a;
            this.f24016e = inputStream;
            this.f24017f = new byte[i2];
            this.f24018g = 0;
            this.f24020i = 0;
            this.f24022k = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: A */
        public int mo13176A() throws IOException {
            return m13227J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: B */
        public long mo13177B() throws IOException {
            return m13228K();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: C */
        public boolean mo13178C(int i2) throws IOException {
            int mo13199z;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f24018g - this.f24020i < 10) {
                    while (i4 < 10) {
                        if (m13221D() < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.m13460e();
                }
                while (i4 < 10) {
                    byte[] bArr = this.f24017f;
                    int i5 = this.f24020i;
                    this.f24020i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.m13460e();
                return true;
            }
            if (i3 == 1) {
                m13232O(8);
                return true;
            }
            if (i3 == 2) {
                m13232O(m13227J());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                m13232O(4);
                return true;
            }
            do {
                mo13199z = mo13199z();
                if (mo13199z == 0) {
                    break;
                }
            } while (mo13178C(mo13199z));
            mo13179a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        /* renamed from: D */
        public byte m13221D() throws IOException {
            if (this.f24020i == this.f24018g) {
                m13231N(1);
            }
            byte[] bArr = this.f24017f;
            int i2 = this.f24020i;
            this.f24020i = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: E */
        public final byte[] m13222E(int i2, boolean z) throws IOException {
            byte[] m13223F = m13223F(i2);
            if (m13223F != null) {
                return z ? (byte[]) m13223F.clone() : m13223F;
            }
            int i3 = this.f24020i;
            int i4 = this.f24018g;
            int i5 = i4 - i3;
            this.f24022k += i4;
            this.f24020i = 0;
            this.f24018g = 0;
            List<byte[]> m13224G = m13224G(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f24017f, i3, bArr, 0, i5);
            Iterator it = ((ArrayList) m13224G).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: F */
        public final byte[] m13223F(int i2) throws IOException {
            if (i2 == 0) {
                return Internal.f24212c;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int i3 = this.f24022k;
            int i4 = this.f24020i;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f23995c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i6 = this.f24023l;
            if (i5 > i6) {
                m13232O((i6 - i3) - i4);
                throw InvalidProtocolBufferException.m13463h();
            }
            int i7 = this.f24018g - i4;
            int i8 = i2 - i7;
            if (i8 >= 4096) {
                try {
                    if (i8 > this.f24016e.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.f24222c = true;
                    throw e2;
                }
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f24017f, this.f24020i, bArr, 0, i7);
            this.f24022k += this.f24018g;
            this.f24020i = 0;
            this.f24018g = 0;
            while (i7 < i2) {
                try {
                    int read = this.f24016e.read(bArr, i7, i2 - i7);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.m13463h();
                    }
                    this.f24022k += read;
                    i7 += read;
                } catch (InvalidProtocolBufferException e3) {
                    e3.f24222c = true;
                    throw e3;
                }
            }
            return bArr;
        }

        /* renamed from: G */
        public final List<byte[]> m13224G(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.f24016e.read(bArr, i3, min - i3);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.m13463h();
                    }
                    this.f24022k += read;
                    i3 += read;
                }
                i2 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: H */
        public int m13225H() throws IOException {
            int i2 = this.f24020i;
            if (this.f24018g - i2 < 4) {
                m13231N(4);
                i2 = this.f24020i;
            }
            byte[] bArr = this.f24017f;
            this.f24020i = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: I */
        public long m13226I() throws IOException {
            int i2 = this.f24020i;
            if (this.f24018g - i2 < 8) {
                m13231N(8);
                i2 = this.f24020i;
            }
            byte[] bArr = this.f24017f;
            this.f24020i = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m13227J() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f24020i
                int r1 = r5.f24018g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f24017f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f24020i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m13229L()
                int r1 = (int) r0
                return r1
            L70:
                r5.f24020i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.m13227J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m13228K() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.m13228K():long");
        }

        /* renamed from: L */
        public long m13229L() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((m13221D() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m13460e();
        }

        /* renamed from: M */
        public final void m13230M() {
            int i2 = this.f24018g + this.f24019h;
            this.f24018g = i2;
            int i3 = this.f24022k + i2;
            int i4 = this.f24023l;
            if (i3 <= i4) {
                this.f24019h = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f24019h = i5;
            this.f24018g = i2 - i5;
        }

        /* renamed from: N */
        public final void m13231N(int i2) throws IOException {
            if (m13233P(i2)) {
                return;
            }
            if (i2 <= (this.f23995c - this.f24022k) - this.f24020i) {
                throw InvalidProtocolBufferException.m13463h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        /* renamed from: O */
        public void m13232O(int i2) throws IOException {
            int i3 = this.f24018g;
            int i4 = this.f24020i;
            if (i2 <= i3 - i4 && i2 >= 0) {
                this.f24020i = i4 + i2;
                return;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int i5 = this.f24022k;
            int i6 = i5 + i4;
            int i7 = i6 + i2;
            int i8 = this.f24023l;
            if (i7 > i8) {
                m13232O((i8 - i5) - i4);
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24022k = i6;
            int i9 = i3 - i4;
            this.f24018g = 0;
            this.f24020i = 0;
            while (i9 < i2) {
                try {
                    long j2 = i2 - i9;
                    try {
                        long skip = this.f24016e.skip(j2);
                        if (skip < 0 || skip > j2) {
                            throw new IllegalStateException(this.f24016e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i9 += (int) skip;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f24222c = true;
                        throw e2;
                    }
                } finally {
                    this.f24022k += i9;
                    m13230M();
                }
            }
            if (i9 >= i2) {
                return;
            }
            int i10 = this.f24018g;
            int i11 = i10 - this.f24020i;
            this.f24020i = i10;
            m13231N(1);
            while (true) {
                int i12 = i2 - i11;
                int i13 = this.f24018g;
                if (i12 <= i13) {
                    this.f24020i = i12;
                    return;
                } else {
                    i11 += i13;
                    this.f24020i = i13;
                    m13231N(1);
                }
            }
        }

        /* renamed from: P */
        public final boolean m13233P(int i2) throws IOException {
            int i3 = this.f24020i;
            int i4 = i3 + i2;
            int i5 = this.f24018g;
            if (i4 <= i5) {
                throw new IllegalStateException(C0000a.m8e("refillBuffer() called when ", i2, " bytes were already available in buffer"));
            }
            int i6 = this.f23995c;
            int i7 = this.f24022k;
            if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.f24023l) {
                return false;
            }
            if (i3 > 0) {
                if (i5 > i3) {
                    byte[] bArr = this.f24017f;
                    System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                }
                this.f24022k += i3;
                this.f24018g -= i3;
                this.f24020i = 0;
            }
            InputStream inputStream = this.f24016e;
            byte[] bArr2 = this.f24017f;
            int i8 = this.f24018g;
            try {
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f23995c - this.f24022k) - i8));
                if (read == 0 || read < -1 || read > this.f24017f.length) {
                    throw new IllegalStateException(this.f24016e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read <= 0) {
                    return false;
                }
                this.f24018g += read;
                m13230M();
                if (this.f24018g >= i2) {
                    return true;
                }
                return m13233P(i2);
            } catch (InvalidProtocolBufferException e2) {
                e2.f24222c = true;
                throw e2;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: a */
        public void mo13179a(int i2) throws InvalidProtocolBufferException {
            if (this.f24021j != i2) {
                throw InvalidProtocolBufferException.m13456a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: d */
        public int mo13180d() {
            return this.f24022k + this.f24020i;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: e */
        public boolean mo13181e() throws IOException {
            return this.f24020i == this.f24018g && !m13233P(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: i */
        public void mo13182i(int i2) {
            this.f24023l = i2;
            m13230M();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: j */
        public int mo13183j(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int i3 = this.f24022k + this.f24020i + i2;
            int i4 = this.f24023l;
            if (i3 > i4) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24023l = i3;
            m13230M();
            return i4;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: k */
        public boolean mo13184k() throws IOException {
            return m13228K() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: l */
        public ByteString mo13185l() throws IOException {
            int m13227J = m13227J();
            int i2 = this.f24018g;
            int i3 = this.f24020i;
            if (m13227J <= i2 - i3 && m13227J > 0) {
                ByteString m13151g = ByteString.m13151g(this.f24017f, i3, m13227J);
                this.f24020i += m13227J;
                return m13151g;
            }
            if (m13227J == 0) {
                return ByteString.f23981c;
            }
            byte[] m13223F = m13223F(m13227J);
            if (m13223F != null) {
                ByteString byteString = ByteString.f23981c;
                return ByteString.m13151g(m13223F, 0, m13223F.length);
            }
            int i4 = this.f24020i;
            int i5 = this.f24018g;
            int i6 = i5 - i4;
            this.f24022k += i5;
            this.f24020i = 0;
            this.f24018g = 0;
            List<byte[]> m13224G = m13224G(m13227J - i6);
            byte[] bArr = new byte[m13227J];
            System.arraycopy(this.f24017f, i4, bArr, 0, i6);
            Iterator it = ((ArrayList) m13224G).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            ByteString byteString2 = ByteString.f23981c;
            return new ByteString.LiteralByteString(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: m */
        public double mo13186m() throws IOException {
            return Double.longBitsToDouble(m13226I());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: n */
        public int mo13187n() throws IOException {
            return m13227J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: o */
        public int mo13188o() throws IOException {
            return m13225H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: p */
        public long mo13189p() throws IOException {
            return m13226I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: q */
        public float mo13190q() throws IOException {
            return Float.intBitsToFloat(m13225H());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: r */
        public int mo13191r() throws IOException {
            return m13227J();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: s */
        public long mo13192s() throws IOException {
            return m13228K();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: t */
        public int mo13193t() throws IOException {
            return m13225H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: u */
        public long mo13194u() throws IOException {
            return m13226I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: v */
        public int mo13195v() throws IOException {
            return CodedInputStream.m13171b(m13227J());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: w */
        public long mo13196w() throws IOException {
            return CodedInputStream.m13172c(m13228K());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: x */
        public String mo13197x() throws IOException {
            int m13227J = m13227J();
            if (m13227J > 0) {
                int i2 = this.f24018g;
                int i3 = this.f24020i;
                if (m13227J <= i2 - i3) {
                    String str = new String(this.f24017f, i3, m13227J, Internal.f24211b);
                    this.f24020i += m13227J;
                    return str;
                }
            }
            if (m13227J == 0) {
                return "";
            }
            if (m13227J > this.f24018g) {
                return new String(m13222E(m13227J, false), Internal.f24211b);
            }
            m13231N(m13227J);
            String str2 = new String(this.f24017f, this.f24020i, m13227J, Internal.f24211b);
            this.f24020i += m13227J;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: y */
        public String mo13198y() throws IOException {
            byte[] m13222E;
            int m13227J = m13227J();
            int i2 = this.f24020i;
            int i3 = this.f24018g;
            if (m13227J <= i3 - i2 && m13227J > 0) {
                m13222E = this.f24017f;
                this.f24020i = i2 + m13227J;
            } else {
                if (m13227J == 0) {
                    return "";
                }
                if (m13227J <= i3) {
                    m13231N(m13227J);
                    m13222E = this.f24017f;
                    this.f24020i = m13227J + 0;
                } else {
                    m13222E = m13222E(m13227J, false);
                }
                i2 = 0;
            }
            return Utf8.m13728d(m13222E, i2, m13227J);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: z */
        public int mo13199z() throws IOException {
            if (mo13181e()) {
                this.f24021j = 0;
                return 0;
            }
            int m13227J = m13227J();
            this.f24021j = m13227J;
            if ((m13227J >>> 3) != 0) {
                return m13227J;
            }
            throw InvalidProtocolBufferException.m13457b();
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* renamed from: e */
        public final ByteBuffer f24024e;

        /* renamed from: f */
        public final boolean f24025f;

        /* renamed from: g */
        public final long f24026g;

        /* renamed from: h */
        public long f24027h;

        /* renamed from: i */
        public long f24028i;

        /* renamed from: j */
        public long f24029j;

        /* renamed from: k */
        public int f24030k;

        /* renamed from: l */
        public int f24031l;

        /* renamed from: m */
        public int f24032m;

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: A */
        public int mo13176A() throws IOException {
            return m13238H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: B */
        public long mo13177B() throws IOException {
            return m13239I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: C */
        public boolean mo13178C(int i2) throws IOException {
            int mo13199z;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (m13242L() < 10) {
                    while (i4 < 10) {
                        if (m13235E() < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.m13460e();
                }
                while (i4 < 10) {
                    long j2 = this.f24028i;
                    this.f24028i = 1 + j2;
                    if (UnsafeUtil.m13683j(j2) < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.m13460e();
                return true;
            }
            if (i3 == 1) {
                m13243M(8);
                return true;
            }
            if (i3 == 2) {
                m13243M(m13238H());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                m13243M(4);
                return true;
            }
            do {
                mo13199z = mo13199z();
                if (mo13199z == 0) {
                    break;
                }
            } while (mo13178C(mo13199z));
            mo13179a(((i2 >>> 3) << 3) | 4);
            return true;
        }

        /* renamed from: D */
        public final int m13234D(long j2) {
            return (int) (j2 - this.f24026g);
        }

        /* renamed from: E */
        public byte m13235E() throws IOException {
            long j2 = this.f24028i;
            if (j2 == this.f24027h) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24028i = 1 + j2;
            return UnsafeUtil.m13683j(j2);
        }

        /* renamed from: F */
        public int m13236F() throws IOException {
            long j2 = this.f24028i;
            if (this.f24027h - j2 < 4) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24028i = 4 + j2;
            return ((UnsafeUtil.m13683j(j2 + 3) & 255) << 24) | (UnsafeUtil.m13683j(j2) & 255) | ((UnsafeUtil.m13683j(1 + j2) & 255) << 8) | ((UnsafeUtil.m13683j(2 + j2) & 255) << 16);
        }

        /* renamed from: G */
        public long m13237G() throws IOException {
            long j2 = this.f24028i;
            if (this.f24027h - j2 < 8) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24028i = 8 + j2;
            return ((UnsafeUtil.m13683j(j2 + 7) & 255) << 56) | (UnsafeUtil.m13683j(j2) & 255) | ((UnsafeUtil.m13683j(1 + j2) & 255) << 8) | ((UnsafeUtil.m13683j(2 + j2) & 255) << 16) | ((UnsafeUtil.m13683j(3 + j2) & 255) << 24) | ((UnsafeUtil.m13683j(4 + j2) & 255) << 32) | ((UnsafeUtil.m13683j(5 + j2) & 255) << 40) | ((UnsafeUtil.m13683j(6 + j2) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13683j(r4) < 0) goto L34;
         */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m13238H() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f24028i
                long r2 = r10.f24027h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.UnsafeUtil.m13683j(r0)
                if (r0 < 0) goto L17
                r10.f24028i = r4
                return r0
            L17:
                long r6 = r10.f24027h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.m13683j(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.m13240J()
                int r1 = (int) r0
                return r1
            L8b:
                r10.f24028i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.m13238H():int");
        }

        /* renamed from: I */
        public long m13239I() throws IOException {
            long m13683j;
            long j2;
            long j3;
            int i2;
            long j4 = this.f24028i;
            if (this.f24027h != j4) {
                long j5 = j4 + 1;
                byte m13683j2 = UnsafeUtil.m13683j(j4);
                if (m13683j2 >= 0) {
                    this.f24028i = j5;
                    return m13683j2;
                }
                if (this.f24027h - j5 >= 9) {
                    long j6 = j5 + 1;
                    int m13683j3 = m13683j2 ^ (UnsafeUtil.m13683j(j5) << 7);
                    if (m13683j3 >= 0) {
                        long j7 = j6 + 1;
                        int m13683j4 = m13683j3 ^ (UnsafeUtil.m13683j(j6) << 14);
                        if (m13683j4 >= 0) {
                            m13683j = m13683j4 ^ 16256;
                        } else {
                            j6 = j7 + 1;
                            int m13683j5 = m13683j4 ^ (UnsafeUtil.m13683j(j7) << 21);
                            if (m13683j5 < 0) {
                                i2 = m13683j5 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long m13683j6 = m13683j5 ^ (UnsafeUtil.m13683j(j6) << 28);
                                if (m13683j6 < 0) {
                                    long j8 = j7 + 1;
                                    long m13683j7 = m13683j6 ^ (UnsafeUtil.m13683j(j7) << 35);
                                    if (m13683j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        m13683j6 = m13683j7 ^ (UnsafeUtil.m13683j(j8) << 42);
                                        if (m13683j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            m13683j7 = m13683j6 ^ (UnsafeUtil.m13683j(j7) << 49);
                                            if (m13683j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                m13683j = (m13683j7 ^ (UnsafeUtil.m13683j(j8) << 56)) ^ 71499008037633920L;
                                                if (m13683j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (UnsafeUtil.m13683j(j7) >= 0) {
                                                        j6 = j9;
                                                        this.f24028i = j6;
                                                        return m13683j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m13683j = m13683j7 ^ j2;
                                    j6 = j8;
                                    this.f24028i = j6;
                                    return m13683j;
                                }
                                j3 = 266354560;
                                m13683j = m13683j6 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f24028i = j6;
                        return m13683j;
                    }
                    i2 = m13683j3 ^ (-128);
                    m13683j = i2;
                    this.f24028i = j6;
                    return m13683j;
                }
            }
            return m13240J();
        }

        /* renamed from: J */
        public long m13240J() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((m13235E() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m13460e();
        }

        /* renamed from: K */
        public final void m13241K() {
            long j2 = this.f24027h + this.f24030k;
            this.f24027h = j2;
            int i2 = (int) (j2 - this.f24029j);
            int i3 = this.f24032m;
            if (i2 <= i3) {
                this.f24030k = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f24030k = i4;
            this.f24027h = j2 - i4;
        }

        /* renamed from: L */
        public final int m13242L() {
            return (int) (this.f24027h - this.f24028i);
        }

        /* renamed from: M */
        public void m13243M(int i2) throws IOException {
            if (i2 >= 0 && i2 <= m13242L()) {
                this.f24028i += i2;
            } else {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.m13463h();
                }
                throw InvalidProtocolBufferException.m13461f();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: a */
        public void mo13179a(int i2) throws InvalidProtocolBufferException {
            if (this.f24031l != i2) {
                throw InvalidProtocolBufferException.m13456a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: d */
        public int mo13180d() {
            return (int) (this.f24028i - this.f24029j);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: e */
        public boolean mo13181e() throws IOException {
            return this.f24028i == this.f24027h;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: i */
        public void mo13182i(int i2) {
            this.f24032m = i2;
            m13241K();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: j */
        public int mo13183j(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            int mo13180d = i2 + mo13180d();
            int i3 = this.f24032m;
            if (mo13180d > i3) {
                throw InvalidProtocolBufferException.m13463h();
            }
            this.f24032m = mo13180d;
            m13241K();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: k */
        public boolean mo13184k() throws IOException {
            return m13239I() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: l */
        public ByteString mo13185l() throws IOException {
            int m13238H = m13238H();
            if (m13238H <= 0 || m13238H > m13242L()) {
                if (m13238H == 0) {
                    return ByteString.f23981c;
                }
                if (m13238H < 0) {
                    throw InvalidProtocolBufferException.m13461f();
                }
                throw InvalidProtocolBufferException.m13463h();
            }
            boolean z = this.f24025f;
            byte[] bArr = new byte[m13238H];
            long j2 = m13238H;
            UnsafeUtil.m13680g(this.f24028i, bArr, 0L, j2);
            this.f24028i += j2;
            ByteString byteString = ByteString.f23981c;
            return new ByteString.LiteralByteString(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: m */
        public double mo13186m() throws IOException {
            return Double.longBitsToDouble(m13237G());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: n */
        public int mo13187n() throws IOException {
            return m13238H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: o */
        public int mo13188o() throws IOException {
            return m13236F();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: p */
        public long mo13189p() throws IOException {
            return m13237G();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: q */
        public float mo13190q() throws IOException {
            return Float.intBitsToFloat(m13236F());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: r */
        public int mo13191r() throws IOException {
            return m13238H();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: s */
        public long mo13192s() throws IOException {
            return m13239I();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: t */
        public int mo13193t() throws IOException {
            return m13236F();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: u */
        public long mo13194u() throws IOException {
            return m13237G();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: v */
        public int mo13195v() throws IOException {
            return CodedInputStream.m13171b(m13238H());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: w */
        public long mo13196w() throws IOException {
            return CodedInputStream.m13172c(m13239I());
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: x */
        public String mo13197x() throws IOException {
            int m13238H = m13238H();
            if (m13238H <= 0 || m13238H > m13242L()) {
                if (m13238H == 0) {
                    return "";
                }
                if (m13238H < 0) {
                    throw InvalidProtocolBufferException.m13461f();
                }
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = new byte[m13238H];
            long j2 = m13238H;
            UnsafeUtil.m13680g(this.f24028i, bArr, 0L, j2);
            String str = new String(bArr, Internal.f24211b);
            this.f24028i += j2;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: y */
        public String mo13198y() throws IOException {
            int m13238H = m13238H();
            if (m13238H > 0 && m13238H <= m13242L()) {
                String m13727c = Utf8.m13727c(this.f24024e, m13234D(this.f24028i), m13238H);
                this.f24028i += m13238H;
                return m13727c;
            }
            if (m13238H == 0) {
                return "";
            }
            if (m13238H <= 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            throw InvalidProtocolBufferException.m13463h();
        }

        @Override // com.google.protobuf.CodedInputStream
        /* renamed from: z */
        public int mo13199z() throws IOException {
            if (mo13181e()) {
                this.f24031l = 0;
                return 0;
            }
            int m13238H = m13238H();
            this.f24031l = m13238H;
            if ((m13238H >>> 3) != 0) {
                return m13238H;
            }
            throw InvalidProtocolBufferException.m13457b();
        }
    }

    public CodedInputStream() {
    }

    /* renamed from: b */
    public static int m13171b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* renamed from: c */
    public static long m13172c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* renamed from: f */
    public static CodedInputStream m13173f(InputStream inputStream) {
        if (inputStream != null) {
            return new StreamDecoder(inputStream, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        }
        byte[] bArr = Internal.f24212c;
        return m13174g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static CodedInputStream m13174g(byte[] bArr, int i2, int i3) {
        return m13175h(bArr, i2, i3, false);
    }

    /* renamed from: h */
    public static CodedInputStream m13175h(byte[] bArr, int i2, int i3, boolean z) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z, null);
        try {
            arrayDecoder.mo13183j(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: A */
    public abstract int mo13176A() throws IOException;

    /* renamed from: B */
    public abstract long mo13177B() throws IOException;

    /* renamed from: C */
    public abstract boolean mo13178C(int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo13179a(int i2) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo13180d();

    /* renamed from: e */
    public abstract boolean mo13181e() throws IOException;

    /* renamed from: i */
    public abstract void mo13182i(int i2);

    /* renamed from: j */
    public abstract int mo13183j(int i2) throws InvalidProtocolBufferException;

    /* renamed from: k */
    public abstract boolean mo13184k() throws IOException;

    /* renamed from: l */
    public abstract ByteString mo13185l() throws IOException;

    /* renamed from: m */
    public abstract double mo13186m() throws IOException;

    /* renamed from: n */
    public abstract int mo13187n() throws IOException;

    /* renamed from: o */
    public abstract int mo13188o() throws IOException;

    /* renamed from: p */
    public abstract long mo13189p() throws IOException;

    /* renamed from: q */
    public abstract float mo13190q() throws IOException;

    /* renamed from: r */
    public abstract int mo13191r() throws IOException;

    /* renamed from: s */
    public abstract long mo13192s() throws IOException;

    /* renamed from: t */
    public abstract int mo13193t() throws IOException;

    /* renamed from: u */
    public abstract long mo13194u() throws IOException;

    /* renamed from: v */
    public abstract int mo13195v() throws IOException;

    /* renamed from: w */
    public abstract long mo13196w() throws IOException;

    /* renamed from: x */
    public abstract String mo13197x() throws IOException;

    /* renamed from: y */
    public abstract String mo13198y() throws IOException;

    /* renamed from: z */
    public abstract int mo13199z() throws IOException;

    public CodedInputStream(C23511 c23511) {
    }
}

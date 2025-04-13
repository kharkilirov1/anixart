package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class Utf8 {

    /* renamed from: a */
    public static final Processor f24397a;

    public static class DecodeUtil {
        /* renamed from: a */
        public static void m13735a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!m13741g(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m13741g(b3) && !m13741g(b4)) {
                    int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i2] = (char) ((i3 >>> 10) + 55232);
                    cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.m13458c();
        }

        /* renamed from: b */
        public static boolean m13736b(byte b) {
            return b >= 0;
        }

        /* renamed from: c */
        public static boolean m13737c(byte b) {
            return b < -32;
        }

        /* renamed from: d */
        public static void m13738d(byte b, byte b2, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b < -62 || m13741g(b2)) {
                throw InvalidProtocolBufferException.m13458c();
            }
            cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* renamed from: e */
        public static boolean m13739e(byte b) {
            return b < -16;
        }

        /* renamed from: f */
        public static void m13740f(byte b, byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (m13741g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m13741g(b3)))) {
                throw InvalidProtocolBufferException.m13458c();
            }
            cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: g */
        public static boolean m13741g(byte b) {
            return b > -65;
        }
    }

    public static abstract class Processor {
        /* renamed from: a */
        public abstract String mo13742a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        /* renamed from: b */
        public final String m13743b(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = byteBuffer.get(i2);
                if (!DecodeUtil.m13736b(b)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b2 = byteBuffer.get(i2);
                if (DecodeUtil.m13736b(b2)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b2;
                    while (i7 < i4) {
                        byte b3 = byteBuffer.get(i7);
                        if (!DecodeUtil.m13736b(b3)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b3;
                        i8++;
                    }
                    i2 = i7;
                    i6 = i8;
                } else if (DecodeUtil.m13737c(b2)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    DecodeUtil.m13738d(b2, byteBuffer.get(i7), cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                } else if (DecodeUtil.m13739e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i9 = i7 + 1;
                    DecodeUtil.m13740f(b2, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                    i2 = i9 + 1;
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i10 = i7 + 1;
                    byte b4 = byteBuffer.get(i7);
                    int i11 = i10 + 1;
                    DecodeUtil.m13735a(b2, b4, byteBuffer.get(i10), byteBuffer.get(i11), cArr, i6);
                    i2 = i11 + 1;
                    i6 = i6 + 1 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }

        /* renamed from: c */
        public abstract String mo13744c(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        /* renamed from: d */
        public abstract int mo13745d(CharSequence charSequence, byte[] bArr, int i2, int i3);

        /* renamed from: e */
        public final int m13746e(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo13749h(i2, byteBuffer, i3, i4) : m13748g(i2, byteBuffer, i3, i4);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return mo13747f(i2, byteBuffer.array(), i3 + arrayOffset, arrayOffset + i4);
        }

        /* renamed from: f */
        public abstract int mo13747f(int i2, byte[] bArr, int i3, int i4);

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (r21.get(r0) > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
        
            if (r21.get(r0) > (-65)) goto L50;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m13748g(int r20, java.nio.ByteBuffer r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.m13748g(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: h */
        public abstract int mo13749h(int i2, ByteBuffer byteBuffer, int i3, int i4);
    }

    public static final class SafeProcessor extends Processor {
        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: a */
        public String mo13742a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = bArr[i2];
                if (!DecodeUtil.m13736b(b)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b2 = bArr[i2];
                if (DecodeUtil.m13736b(b2)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b2;
                    while (i7 < i4) {
                        byte b3 = bArr[i7];
                        if (!DecodeUtil.m13736b(b3)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) b3;
                        i8++;
                    }
                    i2 = i7;
                    i6 = i8;
                } else if (DecodeUtil.m13737c(b2)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    DecodeUtil.m13738d(b2, bArr[i7], cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                } else if (DecodeUtil.m13739e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i9 = i7 + 1;
                    DecodeUtil.m13740f(b2, bArr[i7], bArr[i9], cArr, i6);
                    i2 = i9 + 1;
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i10 = i7 + 1;
                    byte b4 = bArr[i7];
                    int i11 = i10 + 1;
                    DecodeUtil.m13735a(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                    i2 = i11 + 1;
                    i6 = i6 + 1 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: c */
        public String mo13744c(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            return m13743b(byteBuffer, i2, i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo13745d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.mo13745d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo13747f(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.mo13747f(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: h */
        public int mo13749h(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            return m13748g(i2, byteBuffer, i3, i4);
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
            super(C0000a.m9f("Unpaired surrogate at index ", i2, " of ", i3));
        }
    }

    public static final class UnsafeProcessor extends Processor {
        /* renamed from: i */
        public static int m13750i(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            while (true) {
                int i4 = i3 + 8;
                if (i4 > i2 || (UnsafeUtil.m13690q(bArr, UnsafeUtil.f24393h + j2) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j2 += 8;
                i3 = i4;
            }
            while (i3 < i2) {
                long j3 = 1 + j2;
                if (UnsafeUtil.m13684k(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            return i2;
        }

        /* renamed from: j */
        public static int m13751j(long j2, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.m13731g(i2);
            }
            if (i3 == 1) {
                return Utf8.m13732h(i2, UnsafeUtil.m13683j(j2));
            }
            if (i3 == 2) {
                return Utf8.m13733i(i2, UnsafeUtil.m13683j(j2), UnsafeUtil.m13683j(j2 + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: k */
        public static int m13752k(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return Utf8.m13731g(i2);
            }
            if (i3 == 1) {
                return Utf8.m13732h(i2, UnsafeUtil.m13684k(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.m13733i(i2, UnsafeUtil.m13684k(bArr, j2), UnsafeUtil.m13684k(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: a */
        public String mo13742a(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int m13750i = m13750i(bArr, i2, i3) + i2;
            int i4 = i2 + i3;
            while (m13750i < i4 && UnsafeUtil.m13684k(bArr, m13750i) >= 0) {
                m13750i++;
            }
            if (m13750i == i4) {
                return new String(bArr, i2, i3, Internal.f24210a);
            }
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < m13750i) {
                cArr[i5] = (char) UnsafeUtil.m13684k(bArr, i2);
                i2++;
                i5++;
            }
            int i6 = i5;
            while (m13750i < i4) {
                int i7 = m13750i + 1;
                byte m13684k = UnsafeUtil.m13684k(bArr, m13750i);
                if (DecodeUtil.m13736b(m13684k)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) m13684k;
                    while (i7 < i4) {
                        byte m13684k2 = UnsafeUtil.m13684k(bArr, i7);
                        if (!DecodeUtil.m13736b(m13684k2)) {
                            break;
                        }
                        i7++;
                        cArr[i8] = (char) m13684k2;
                        i8++;
                    }
                    i6 = i8;
                    m13750i = i7;
                } else if (DecodeUtil.m13737c(m13684k)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    m13750i = i7 + 1;
                    DecodeUtil.m13738d(m13684k, UnsafeUtil.m13684k(bArr, i7), cArr, i6);
                    i6++;
                } else if (DecodeUtil.m13739e(m13684k)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i9 = i7 + 1;
                    DecodeUtil.m13740f(m13684k, UnsafeUtil.m13684k(bArr, i7), UnsafeUtil.m13684k(bArr, i9), cArr, i6);
                    m13750i = i9 + 1;
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.m13458c();
                    }
                    int i10 = i7 + 1;
                    byte m13684k3 = UnsafeUtil.m13684k(bArr, i7);
                    int i11 = i10 + 1;
                    byte m13684k4 = UnsafeUtil.m13684k(bArr, i10);
                    m13750i = i11 + 1;
                    DecodeUtil.m13735a(m13684k, m13684k3, m13684k4, UnsafeUtil.m13684k(bArr, i11), cArr, i6);
                    i6 = i6 + 1 + 1;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: c */
        public String mo13744c(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long m13675b = UnsafeUtil.m13675b(byteBuffer) + i2;
            long j2 = i3 + m13675b;
            char[] cArr = new char[i3];
            int i4 = 0;
            while (m13675b < j2) {
                byte m13683j = UnsafeUtil.m13683j(m13675b);
                if (!DecodeUtil.m13736b(m13683j)) {
                    break;
                }
                m13675b++;
                cArr[i4] = (char) m13683j;
                i4++;
            }
            while (true) {
                int i5 = i4;
                while (m13675b < j2) {
                    long j3 = m13675b + 1;
                    byte m13683j2 = UnsafeUtil.m13683j(m13675b);
                    if (DecodeUtil.m13736b(m13683j2)) {
                        cArr[i5] = (char) m13683j2;
                        i5++;
                        m13675b = j3;
                        while (m13675b < j2) {
                            byte m13683j3 = UnsafeUtil.m13683j(m13675b);
                            if (!DecodeUtil.m13736b(m13683j3)) {
                                break;
                            }
                            m13675b++;
                            cArr[i5] = (char) m13683j3;
                            i5++;
                        }
                    } else if (DecodeUtil.m13737c(m13683j2)) {
                        if (j3 >= j2) {
                            throw InvalidProtocolBufferException.m13458c();
                        }
                        m13675b = j3 + 1;
                        DecodeUtil.m13738d(m13683j2, UnsafeUtil.m13683j(j3), cArr, i5);
                        i5++;
                    } else if (DecodeUtil.m13739e(m13683j2)) {
                        if (j3 >= j2 - 1) {
                            throw InvalidProtocolBufferException.m13458c();
                        }
                        long j4 = j3 + 1;
                        DecodeUtil.m13740f(m13683j2, UnsafeUtil.m13683j(j3), UnsafeUtil.m13683j(j4), cArr, i5);
                        i5++;
                        m13675b = j4 + 1;
                    } else {
                        if (j3 >= j2 - 2) {
                            throw InvalidProtocolBufferException.m13458c();
                        }
                        long j5 = j3 + 1;
                        byte m13683j4 = UnsafeUtil.m13683j(j3);
                        long j6 = j5 + 1;
                        byte m13683j5 = UnsafeUtil.m13683j(j5);
                        m13675b = j6 + 1;
                        DecodeUtil.m13735a(m13683j2, m13683j4, m13683j5, UnsafeUtil.m13683j(j6), cArr, i5);
                        i4 = i5 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i5);
            }
        }

        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: d */
        public int mo13745d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            char c2;
            long j2;
            long j3;
            int i4;
            char charAt;
            long j4 = i2;
            long j5 = i3 + j4;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                StringBuilder m24u = C0000a.m24u("Failed writing ");
                m24u.append(charSequence.charAt(length - 1));
                m24u.append(" at index ");
                m24u.append(i2 + i3);
                throw new ArrayIndexOutOfBoundsException(m24u.toString());
            }
            int i5 = 0;
            while (true) {
                c2 = 128;
                j2 = 1;
                if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                UnsafeUtil.m13695v(bArr, j4, (byte) charAt);
                i5++;
                j4 = 1 + j4;
            }
            if (i5 == length) {
                return (int) j4;
            }
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 >= c2 || j4 >= j5) {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j2;
                        UnsafeUtil.m13695v(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        UnsafeUtil.m13695v(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j4 = j6 + j2;
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                            if (j4 > j5 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                                    throw new UnpairedSurrogateException(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                            }
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char charAt3 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j7 = j4 + 1;
                                    UnsafeUtil.m13695v(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = 1 + j7;
                                    UnsafeUtil.m13695v(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = 1 + j8;
                                    UnsafeUtil.m13695v(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j2 = 1;
                                    UnsafeUtil.m13695v(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                    j4 = j9 + 1;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new UnpairedSurrogateException(i5 - 1, length);
                        }
                        long j10 = j4 + j2;
                        UnsafeUtil.m13695v(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j2 + j10;
                        UnsafeUtil.m13695v(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 = j11 + 1;
                        UnsafeUtil.m13695v(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = 1;
                    }
                    i5++;
                    c2 = 128;
                } else {
                    j3 = j4 + j2;
                    UnsafeUtil.m13695v(bArr, j4, (byte) charAt2);
                }
                j4 = j3;
                i5++;
                c2 = 128;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13684k(r24, r8) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13684k(r24, r8) > (-65)) goto L32;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo13747f(int r23, byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 353
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.mo13747f(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13683j(r6) > (-65)) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13683j(r6) > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
        
            if (com.google.protobuf.UnsafeUtil.m13683j(r6) > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo13749h(int r24, java.nio.ByteBuffer r25, int r26, int r27) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.mo13749h(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f24397a = (!(UnsafeUtil.f24392g && UnsafeUtil.f24391f) || Android.m12992a()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    /* renamed from: a */
    public static int m13725a(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return m13731g(b);
        }
        if (i4 == 1) {
            return m13732h(b, bArr[i2]);
        }
        if (i4 == 2) {
            return m13733i(b, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static int m13726b(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        if (i4 == 0) {
            return m13731g(i2);
        }
        if (i4 == 1) {
            return m13732h(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return m13733i(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static String m13727c(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        Processor processor = f24397a;
        Objects.requireNonNull(processor);
        if (byteBuffer.hasArray()) {
            return processor.mo13742a(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }
        return byteBuffer.isDirect() ? processor.mo13744c(byteBuffer, i2, i3) : processor.m13743b(byteBuffer, i2, i3);
    }

    /* renamed from: d */
    public static String m13728d(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return f24397a.mo13742a(bArr, i2, i3);
    }

    /* renamed from: e */
    public static int m13729e(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f24397a.mo13745d(charSequence, bArr, i2, i3);
    }

    /* renamed from: f */
    public static int m13730f(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new UnpairedSurrogateException(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder m24u = C0000a.m24u("UTF-8 length does not fit in int: ");
        m24u.append(i4 + 4294967296L);
        throw new IllegalArgumentException(m24u.toString());
    }

    /* renamed from: g */
    public static int m13731g(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* renamed from: h */
    public static int m13732h(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* renamed from: i */
    public static int m13733i(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* renamed from: j */
    public static boolean m13734j(byte[] bArr, int i2, int i3) {
        return f24397a.mo13747f(0, bArr, i2, i3) == 0;
    }
}

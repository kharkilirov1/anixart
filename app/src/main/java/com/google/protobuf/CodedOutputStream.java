package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {

    /* renamed from: b */
    public static final Logger f24038b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c */
    public static final boolean f24039c = UnsafeUtil.f24392g;

    /* renamed from: a */
    public CodedOutputStreamWriter f24040a;

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f24041d;

        /* renamed from: e */
        public final int f24042e;

        /* renamed from: f */
        public int f24043f;

        /* renamed from: g */
        public int f24044g;

        public AbstractBufferedEncoder(int i2) {
            super(null);
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int max = Math.max(i2, 20);
            this.f24041d = new byte[max];
            this.f24042e = max;
        }

        /* renamed from: O0 */
        public final void m13308O0(byte b) {
            byte[] bArr = this.f24041d;
            int i2 = this.f24043f;
            this.f24043f = i2 + 1;
            bArr[i2] = b;
            this.f24044g++;
        }

        /* renamed from: P0 */
        public final void m13309P0(int i2) {
            byte[] bArr = this.f24041d;
            int i3 = this.f24043f;
            int i4 = i3 + 1;
            this.f24043f = i4;
            bArr[i3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.f24043f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            this.f24043f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24043f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24044g += 4;
        }

        /* renamed from: Q0 */
        public final void m13310Q0(long j2) {
            byte[] bArr = this.f24041d;
            int i2 = this.f24043f;
            int i3 = i2 + 1;
            this.f24043f = i3;
            bArr[i2] = (byte) (j2 & 255);
            int i4 = i3 + 1;
            this.f24043f = i4;
            bArr[i3] = (byte) ((j2 >> 8) & 255);
            int i5 = i4 + 1;
            this.f24043f = i5;
            bArr[i4] = (byte) ((j2 >> 16) & 255);
            int i6 = i5 + 1;
            this.f24043f = i6;
            bArr[i5] = (byte) (255 & (j2 >> 24));
            int i7 = i6 + 1;
            this.f24043f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i7 + 1;
            this.f24043f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i9 = i8 + 1;
            this.f24043f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24043f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f24044g += 8;
        }

        /* renamed from: R0 */
        public final void m13311R0(int i2) {
            if (!CodedOutputStream.f24039c) {
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.f24041d;
                    int i3 = this.f24043f;
                    this.f24043f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    this.f24044g++;
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f24041d;
                int i4 = this.f24043f;
                this.f24043f = i4 + 1;
                bArr2[i4] = (byte) i2;
                this.f24044g++;
                return;
            }
            long j2 = this.f24043f;
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.f24041d;
                int i5 = this.f24043f;
                this.f24043f = i5 + 1;
                UnsafeUtil.m13695v(bArr3, i5, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f24041d;
            int i6 = this.f24043f;
            this.f24043f = i6 + 1;
            UnsafeUtil.m13695v(bArr4, i6, (byte) i2);
            this.f24044g += (int) (this.f24043f - j2);
        }

        /* renamed from: S0 */
        public final void m13312S0(long j2) {
            if (!CodedOutputStream.f24039c) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f24041d;
                    int i2 = this.f24043f;
                    this.f24043f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    this.f24044g++;
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f24041d;
                int i3 = this.f24043f;
                this.f24043f = i3 + 1;
                bArr2[i3] = (byte) j2;
                this.f24044g++;
                return;
            }
            long j3 = this.f24043f;
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.f24041d;
                int i4 = this.f24043f;
                this.f24043f = i4 + 1;
                UnsafeUtil.m13695v(bArr3, i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f24041d;
            int i5 = this.f24043f;
            this.f24043f = i5 + 1;
            UnsafeUtil.m13695v(bArr4, i5, (byte) j2);
            this.f24044g += (int) (this.f24043f - j3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public final int mo13306y0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f24045d;

        /* renamed from: e */
        public final int f24046e;

        /* renamed from: f */
        public final int f24047f;

        /* renamed from: g */
        public int f24048g;

        public ArrayEncoder(byte[] bArr, int i2, int i3) {
            super(null);
            Objects.requireNonNull(bArr, "buffer");
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f24045d = bArr;
            this.f24046e = i2;
            this.f24048g = i2;
            this.f24047f = i4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public final void mo13282A0(byte[] bArr, int i2, int i3) throws IOException {
            mo13294M0(i3);
            m13313O0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public final void mo13283B0(ByteString byteString) throws IOException {
            mo13294M0(byteString.size());
            byteString.mo13156F(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public final void mo13284C0(int i2) throws IOException {
            try {
                byte[] bArr = this.f24045d;
                int i3 = this.f24048g;
                int i4 = i3 + 1;
                this.f24048g = i4;
                bArr[i3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                int i5 = i4 + 1;
                this.f24048g = i5;
                bArr[i4] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i6 = i5 + 1;
                this.f24048g = i6;
                bArr[i5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f24048g = i6 + 1;
                bArr[i6] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public final void mo13285D0(long j2) throws IOException {
            try {
                byte[] bArr = this.f24045d;
                int i2 = this.f24048g;
                int i3 = i2 + 1;
                this.f24048g = i3;
                bArr[i2] = (byte) (((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i4 = i3 + 1;
                this.f24048g = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i5 = i4 + 1;
                this.f24048g = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i6 = i5 + 1;
                this.f24048g = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i7 = i6 + 1;
                this.f24048g = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i8 = i7 + 1;
                this.f24048g = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i9 = i8 + 1;
                this.f24048g = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f24048g = i9 + 1;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public final void mo13286E0(int i2) throws IOException {
            if (i2 >= 0) {
                mo13294M0(i2);
            } else {
                mo13295N0(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public final void mo13287F0(int i2, MessageLite messageLite) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public final void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(((AbstractMessageLite) messageLite).m12979k(schema));
            schema.mo13537b(messageLite, this.f24040a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public final void mo13289H0(MessageLite messageLite) throws IOException {
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: I0 */
        public final void mo13290I0(int i2, MessageLite messageLite) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13294M0(26);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public final void mo13291J0(int i2, ByteString byteString) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13303w(3, byteString);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public final void mo13292K0(String str) throws IOException {
            int i2 = this.f24048g;
            try {
                int m13276r0 = CodedOutputStream.m13276r0(str.length() * 3);
                int m13276r02 = CodedOutputStream.m13276r0(str.length());
                if (m13276r02 == m13276r0) {
                    int i3 = i2 + m13276r02;
                    this.f24048g = i3;
                    int m13729e = Utf8.m13729e(str, this.f24045d, i3, mo13306y0());
                    this.f24048g = i2;
                    mo13294M0((m13729e - i2) - m13276r02);
                    this.f24048g = m13729e;
                } else {
                    mo13294M0(Utf8.m13730f(str));
                    this.f24048g = Utf8.m13729e(str, this.f24045d, this.f24048g, mo13306y0());
                }
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f24048g = i2;
                m13304w0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public final void mo13293L0(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public final void mo13294M0(int i2) throws IOException {
            if (!CodedOutputStream.f24039c || Android.m12992a() || mo13306y0() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f24045d;
                        int i3 = this.f24048g;
                        this.f24048g = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f24045d;
                int i4 = this.f24048g;
                this.f24048g = i4 + 1;
                bArr2[i4] = (byte) i2;
                return;
            }
            if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f24045d;
                int i5 = this.f24048g;
                this.f24048g = i5 + 1;
                UnsafeUtil.m13695v(bArr3, i5, (byte) i2);
                return;
            }
            byte[] bArr4 = this.f24045d;
            int i6 = this.f24048g;
            this.f24048g = i6 + 1;
            UnsafeUtil.m13695v(bArr4, i6, (byte) (i2 | 128));
            int i7 = i2 >>> 7;
            if ((i7 & (-128)) == 0) {
                byte[] bArr5 = this.f24045d;
                int i8 = this.f24048g;
                this.f24048g = i8 + 1;
                UnsafeUtil.m13695v(bArr5, i8, (byte) i7);
                return;
            }
            byte[] bArr6 = this.f24045d;
            int i9 = this.f24048g;
            this.f24048g = i9 + 1;
            UnsafeUtil.m13695v(bArr6, i9, (byte) (i7 | 128));
            int i10 = i7 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr7 = this.f24045d;
                int i11 = this.f24048g;
                this.f24048g = i11 + 1;
                UnsafeUtil.m13695v(bArr7, i11, (byte) i10);
                return;
            }
            byte[] bArr8 = this.f24045d;
            int i12 = this.f24048g;
            this.f24048g = i12 + 1;
            UnsafeUtil.m13695v(bArr8, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr9 = this.f24045d;
                int i14 = this.f24048g;
                this.f24048g = i14 + 1;
                UnsafeUtil.m13695v(bArr9, i14, (byte) i13);
                return;
            }
            byte[] bArr10 = this.f24045d;
            int i15 = this.f24048g;
            this.f24048g = i15 + 1;
            UnsafeUtil.m13695v(bArr10, i15, (byte) (i13 | 128));
            byte[] bArr11 = this.f24045d;
            int i16 = this.f24048g;
            this.f24048g = i16 + 1;
            UnsafeUtil.m13695v(bArr11, i16, (byte) (i13 >>> 7));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public final void mo13295N0(long j2) throws IOException {
            if (CodedOutputStream.f24039c && mo13306y0() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f24045d;
                    int i2 = this.f24048g;
                    this.f24048g = i2 + 1;
                    UnsafeUtil.m13695v(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f24045d;
                int i3 = this.f24048g;
                this.f24048g = i3 + 1;
                UnsafeUtil.m13695v(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f24045d;
                    int i4 = this.f24048g;
                    this.f24048g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), 1), e2);
                }
            }
            byte[] bArr4 = this.f24045d;
            int i5 = this.f24048g;
            this.f24048g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        /* renamed from: O0 */
        public final void m13313O0(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.f24045d, this.f24048g, i3);
                this.f24048g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public final void mo13123Q(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f24045d, this.f24048g, remaining);
                this.f24048g += remaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), Integer.valueOf(remaining)), e2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public final void mo13124R(byte[] bArr, int i2, int i3) throws IOException {
            m13313O0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d */
        public final void mo13297d(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13294M0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f */
        public final void mo13298f(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 5);
            mo13284C0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k */
        public final void mo13299k(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 1);
            mo13285D0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n */
        public final void mo13300n(int i2, String str) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13292K0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public final void mo13301o(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13295N0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s */
        public final void mo13302s(int i2, boolean z) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13307z0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w */
        public final void mo13303w(int i2, ByteString byteString) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13283B0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x */
        public final void mo13305x(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            if (i3 >= 0) {
                mo13294M0(i3);
            } else {
                mo13295N0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public final int mo13306y0() {
            return this.f24047f - this.f24048g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: z0 */
        public final void mo13307z0(byte b) throws IOException {
            try {
                byte[] bArr = this.f24045d;
                int i2 = this.f24048g;
                this.f24048g = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24048g), Integer.valueOf(this.f24047f), 1), e2);
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public void mo13282A0(byte[] bArr, int i2, int i3) throws IOException {
            m13316V0(5);
            m13311R0(i3);
            m13315U0();
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public void mo13283B0(ByteString byteString) throws IOException {
            mo13294M0(byteString.size());
            byteString.mo13156F(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public void mo13284C0(int i2) throws IOException {
            m13316V0(4);
            m13309P0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public void mo13285D0(long j2) throws IOException {
            m13316V0(8);
            m13310Q0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public void mo13286E0(int i2) throws IOException {
            if (i2 < 0) {
                mo13295N0(i2);
            } else {
                m13316V0(5);
                m13311R0(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo13287F0(int i2, MessageLite messageLite) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(((AbstractMessageLite) messageLite).m12979k(schema));
            schema.mo13537b(messageLite, this.f24040a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public void mo13289H0(MessageLite messageLite) throws IOException {
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: I0 */
        public void mo13290I0(int i2, MessageLite messageLite) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13294M0(26);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public void mo13291J0(int i2, ByteString byteString) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13303w(3, byteString);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo13292K0(String str) throws IOException {
            int length = str.length() * 3;
            int m13276r0 = CodedOutputStream.m13276r0(length);
            int i2 = m13276r0 + length;
            int i3 = this.f24042e;
            if (i2 > i3) {
                mo13294M0(Utf8.m13729e(str, new byte[length], 0, length));
                m13315U0();
                throw null;
            }
            int i4 = this.f24043f;
            if (i2 > i3 - i4) {
                throw null;
            }
            try {
                int m13276r02 = CodedOutputStream.m13276r0(str.length());
                if (m13276r02 == m13276r0) {
                    int i5 = i4 + m13276r02;
                    this.f24043f = i5;
                    int m13729e = Utf8.m13729e(str, this.f24041d, i5, this.f24042e - i5);
                    this.f24043f = i4;
                    int i6 = (m13729e - i4) - m13276r02;
                    m13311R0(i6);
                    this.f24043f = m13729e;
                    this.f24044g += i6;
                } else {
                    int m13730f = Utf8.m13730f(str);
                    m13311R0(m13730f);
                    this.f24043f = Utf8.m13729e(str, this.f24041d, this.f24043f, m13730f);
                    this.f24044g += m13730f;
                }
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f24044g -= this.f24043f - i4;
                this.f24043f = i4;
                m13304w0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo13293L0(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public void mo13294M0(int i2) throws IOException {
            m13316V0(5);
            m13311R0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public void mo13295N0(long j2) throws IOException {
            m13316V0(10);
            m13312S0(j2);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) throws IOException {
            m13315U0();
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) throws IOException {
            m13315U0();
            throw null;
        }

        /* renamed from: T0 */
        public final void m13314T0() throws IOException {
            throw null;
        }

        /* renamed from: U0 */
        public void m13315U0() throws IOException {
            if (this.f24043f > 0) {
                m13314T0();
            }
        }

        /* renamed from: V0 */
        public final void m13316V0(int i2) throws IOException {
            if (this.f24042e - this.f24043f < i2) {
                throw null;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d */
        public void mo13297d(int i2, int i3) throws IOException {
            m13316V0(20);
            m13311R0((i2 << 3) | 0);
            m13311R0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f */
        public void mo13298f(int i2, int i3) throws IOException {
            m13316V0(14);
            m13311R0((i2 << 3) | 5);
            m13309P0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k */
        public void mo13299k(int i2, long j2) throws IOException {
            m13316V0(18);
            m13311R0((i2 << 3) | 1);
            m13310Q0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n */
        public void mo13300n(int i2, String str) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13292K0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo13301o(int i2, long j2) throws IOException {
            m13316V0(20);
            m13311R0((i2 << 3) | 0);
            m13312S0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s */
        public void mo13302s(int i2, boolean z) throws IOException {
            m13316V0(11);
            m13311R0((i2 << 3) | 0);
            m13308O0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w */
        public void mo13303w(int i2, ByteString byteString) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13283B0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x */
        public void mo13305x(int i2, int i3) throws IOException {
            m13316V0(20);
            m13311R0((i2 << 3) | 0);
            if (i3 >= 0) {
                m13311R0(i3);
            } else {
                m13312S0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: z0 */
        public void mo13307z0(byte b) throws IOException {
            if (this.f24043f == this.f24042e) {
                throw null;
            }
            m13308O0(b);
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super(C0000a.m14k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(C0000a.m14k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* renamed from: h */
        public final OutputStream f24049h;

        public OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            Objects.requireNonNull(outputStream, "out");
            this.f24049h = outputStream;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public void mo13282A0(byte[] bArr, int i2, int i3) throws IOException {
            m13318U0(5);
            m13311R0(i3);
            m13319V0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public void mo13283B0(ByteString byteString) throws IOException {
            mo13294M0(byteString.size());
            byteString.mo13156F(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public void mo13284C0(int i2) throws IOException {
            m13318U0(4);
            m13309P0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public void mo13285D0(long j2) throws IOException {
            m13318U0(8);
            m13310Q0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public void mo13286E0(int i2) throws IOException {
            if (i2 < 0) {
                mo13295N0(i2);
            } else {
                m13318U0(5);
                m13311R0(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo13287F0(int i2, MessageLite messageLite) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(((AbstractMessageLite) messageLite).m12979k(schema));
            schema.mo13537b(messageLite, this.f24040a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public void mo13289H0(MessageLite messageLite) throws IOException {
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: I0 */
        public void mo13290I0(int i2, MessageLite messageLite) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13294M0(26);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public void mo13291J0(int i2, ByteString byteString) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13303w(3, byteString);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo13292K0(String str) throws IOException {
            int m13730f;
            try {
                int length = str.length() * 3;
                int m13276r0 = CodedOutputStream.m13276r0(length);
                int i2 = m13276r0 + length;
                int i3 = this.f24042e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int m13729e = Utf8.m13729e(str, bArr, 0, length);
                    mo13294M0(m13729e);
                    m13319V0(bArr, 0, m13729e);
                    return;
                }
                if (i2 > i3 - this.f24043f) {
                    m13317T0();
                }
                int m13276r02 = CodedOutputStream.m13276r0(str.length());
                int i4 = this.f24043f;
                try {
                    if (m13276r02 == m13276r0) {
                        int i5 = i4 + m13276r02;
                        this.f24043f = i5;
                        int m13729e2 = Utf8.m13729e(str, this.f24041d, i5, this.f24042e - i5);
                        this.f24043f = i4;
                        m13730f = (m13729e2 - i4) - m13276r02;
                        m13311R0(m13730f);
                        this.f24043f = m13729e2;
                    } else {
                        m13730f = Utf8.m13730f(str);
                        m13311R0(m13730f);
                        this.f24043f = Utf8.m13729e(str, this.f24041d, this.f24043f, m13730f);
                    }
                    this.f24044g += m13730f;
                } catch (Utf8.UnpairedSurrogateException e2) {
                    this.f24044g -= this.f24043f - i4;
                    this.f24043f = i4;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (Utf8.UnpairedSurrogateException e4) {
                m13304w0(str, e4);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo13293L0(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public void mo13294M0(int i2) throws IOException {
            m13318U0(5);
            m13311R0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public void mo13295N0(long j2) throws IOException {
            m13318U0(10);
            m13312S0(j2);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i2 = this.f24042e;
            int i3 = this.f24043f;
            int i4 = i2 - i3;
            if (i4 >= remaining) {
                byteBuffer.get(this.f24041d, i3, remaining);
                this.f24043f += remaining;
                this.f24044g += remaining;
                return;
            }
            byteBuffer.get(this.f24041d, i3, i4);
            int i5 = remaining - i4;
            this.f24043f = this.f24042e;
            this.f24044g += i4;
            m13317T0();
            while (true) {
                int i6 = this.f24042e;
                if (i5 <= i6) {
                    byteBuffer.get(this.f24041d, 0, i5);
                    this.f24043f = i5;
                    this.f24044g += i5;
                    return;
                } else {
                    byteBuffer.get(this.f24041d, 0, i6);
                    this.f24049h.write(this.f24041d, 0, this.f24042e);
                    int i7 = this.f24042e;
                    i5 -= i7;
                    this.f24044g += i7;
                }
            }
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) throws IOException {
            m13319V0(bArr, i2, i3);
        }

        /* renamed from: T0 */
        public final void m13317T0() throws IOException {
            this.f24049h.write(this.f24041d, 0, this.f24043f);
            this.f24043f = 0;
        }

        /* renamed from: U0 */
        public final void m13318U0(int i2) throws IOException {
            if (this.f24042e - this.f24043f < i2) {
                m13317T0();
            }
        }

        /* renamed from: V0 */
        public void m13319V0(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.f24042e;
            int i5 = this.f24043f;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.f24041d, i5, i3);
                this.f24043f += i3;
                this.f24044g += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.f24041d, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f24043f = this.f24042e;
            this.f24044g += i6;
            m13317T0();
            if (i8 <= this.f24042e) {
                System.arraycopy(bArr, i7, this.f24041d, 0, i8);
                this.f24043f = i8;
            } else {
                this.f24049h.write(bArr, i7, i8);
            }
            this.f24044g += i8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d */
        public void mo13297d(int i2, int i3) throws IOException {
            m13318U0(20);
            m13311R0((i2 << 3) | 0);
            m13311R0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f */
        public void mo13298f(int i2, int i3) throws IOException {
            m13318U0(14);
            m13311R0((i2 << 3) | 5);
            m13309P0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k */
        public void mo13299k(int i2, long j2) throws IOException {
            m13318U0(18);
            m13311R0((i2 << 3) | 1);
            m13310Q0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n */
        public void mo13300n(int i2, String str) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13292K0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo13301o(int i2, long j2) throws IOException {
            m13318U0(20);
            m13311R0((i2 << 3) | 0);
            m13312S0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s */
        public void mo13302s(int i2, boolean z) throws IOException {
            m13318U0(11);
            m13311R0((i2 << 3) | 0);
            m13308O0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w */
        public void mo13303w(int i2, ByteString byteString) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13283B0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x */
        public void mo13305x(int i2, int i3) throws IOException {
            m13318U0(20);
            m13311R0((i2 << 3) | 0);
            if (i3 >= 0) {
                m13311R0(i3);
            } else {
                m13312S0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: z0 */
        public void mo13307z0(byte b) throws IOException {
            if (this.f24043f == this.f24042e) {
                m13317T0();
            }
            m13308O0(b);
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public void mo13282A0(byte[] bArr, int i2, int i3) throws IOException {
            mo13294M0(i3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public void mo13283B0(ByteString byteString) throws IOException {
            mo13294M0(byteString.size());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public void mo13284C0(int i2) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public void mo13285D0(long j2) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public void mo13286E0(int i2) throws IOException {
            if (i2 >= 0) {
                mo13294M0(i2);
                throw null;
            }
            mo13295N0(i2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo13287F0(int i2, MessageLite messageLite) throws IOException {
            mo13294M0((i2 << 3) | 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException {
            mo13294M0((i2 << 3) | 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public void mo13289H0(MessageLite messageLite) throws IOException {
            mo13294M0(messageLite.mo13430c());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: I0 */
        public void mo13290I0(int i2, MessageLite messageLite) throws IOException {
            mo13293L0(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public void mo13291J0(int i2, ByteString byteString) throws IOException {
            mo13293L0(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo13292K0(String str) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo13293L0(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | i3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public void mo13294M0(int i2) throws IOException {
            if ((i2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public void mo13295N0(long j2) throws IOException {
            if ((j2 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d */
        public void mo13297d(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f */
        public void mo13298f(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k */
        public void mo13299k(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n */
        public void mo13300n(int i2, String str) throws IOException {
            mo13294M0((i2 << 3) | 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo13301o(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s */
        public void mo13302s(int i2, boolean z) throws IOException {
            mo13294M0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w */
        public void mo13303w(int i2, ByteString byteString) throws IOException {
            mo13294M0((i2 << 3) | 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x */
        public void mo13305x(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public int mo13306y0() {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: z0 */
        public void mo13307z0(byte b) throws IOException {
            throw null;
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: d */
        public long f24050d;

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public void mo13282A0(byte[] bArr, int i2, int i3) throws IOException {
            mo13294M0(i3);
            m13320O0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public void mo13283B0(ByteString byteString) throws IOException {
            mo13294M0(byteString.size());
            byteString.mo13156F(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public void mo13284C0(int i2) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public void mo13285D0(long j2) throws IOException {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: E0 */
        public void mo13286E0(int i2) throws IOException {
            if (i2 >= 0) {
                mo13294M0(i2);
            } else {
                mo13295N0(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: F0 */
        public void mo13287F0(int i2, MessageLite messageLite) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: G0 */
        public void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13294M0(((AbstractMessageLite) messageLite).m12979k(schema));
            schema.mo13537b(messageLite, this.f24040a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: H0 */
        public void mo13289H0(MessageLite messageLite) throws IOException {
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: I0 */
        public void mo13290I0(int i2, MessageLite messageLite) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13294M0(26);
            mo13294M0(messageLite.mo13430c());
            messageLite.mo13433g(this);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: J0 */
        public void mo13291J0(int i2, ByteString byteString) throws IOException {
            mo13293L0(1, 3);
            mo13297d(2, i2);
            mo13303w(3, byteString);
            mo13293L0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: K0 */
        public void mo13292K0(String str) throws IOException {
            long j2 = this.f24050d;
            try {
                if (CodedOutputStream.m13276r0(str.length()) == CodedOutputStream.m13276r0(str.length() * 3)) {
                    throw null;
                }
                mo13294M0(Utf8.m13730f(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.f24050d = j2;
                throw null;
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: L0 */
        public void mo13293L0(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public void mo13294M0(int i2) throws IOException {
            if (this.f24050d <= 0) {
                while ((i2 & (-128)) != 0) {
                    long j2 = this.f24050d;
                    this.f24050d = j2 + 1;
                    UnsafeUtil.f24390e.mo13710p(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.f24050d;
                this.f24050d = 1 + j3;
                UnsafeUtil.f24390e.mo13710p(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.f24050d;
                if (j4 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24050d), 0L, 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.f24050d = 1 + j4;
                    UnsafeUtil.f24390e.mo13710p(j4, (byte) i2);
                    return;
                } else {
                    this.f24050d = j4 + 1;
                    UnsafeUtil.f24390e.mo13710p(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public void mo13295N0(long j2) throws IOException {
            if (this.f24050d <= 0) {
                while ((j2 & (-128)) != 0) {
                    long j3 = this.f24050d;
                    this.f24050d = j3 + 1;
                    UnsafeUtil.f24390e.mo13710p(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.f24050d;
                this.f24050d = 1 + j4;
                UnsafeUtil.f24390e.mo13710p(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.f24050d;
                if (j5 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24050d), 0L, 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.f24050d = 1 + j5;
                    UnsafeUtil.f24390e.mo13710p(j5, (byte) j2);
                    return;
                } else {
                    this.f24050d = j5 + 1;
                    UnsafeUtil.f24390e.mo13710p(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        /* renamed from: O0 */
        public void m13320O0(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = 0 - j2;
                long j4 = this.f24050d;
                if (j3 >= j4) {
                    UnsafeUtil.f24390e.mo13702d(bArr, i2, j4, j2);
                    this.f24050d += j2;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24050d), 0L, Integer.valueOf(i3)));
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) throws IOException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) throws IOException {
            m13320O0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: d */
        public void mo13297d(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13294M0(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f */
        public void mo13298f(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: k */
        public void mo13299k(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n */
        public void mo13300n(int i2, String str) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13292K0(str);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o */
        public void mo13301o(int i2, long j2) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13295N0(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: s */
        public void mo13302s(int i2, boolean z) throws IOException {
            mo13294M0((i2 << 3) | 0);
            mo13307z0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w */
        public void mo13303w(int i2, ByteString byteString) throws IOException {
            mo13294M0((i2 << 3) | 2);
            mo13283B0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x */
        public void mo13305x(int i2, int i3) throws IOException {
            mo13294M0((i2 << 3) | 0);
            if (i3 >= 0) {
                mo13294M0(i3);
            } else {
                mo13295N0(i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: y0 */
        public int mo13306y0() {
            return (int) (0 - this.f24050d);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: z0 */
        public void mo13307z0(byte b) throws IOException {
            long j2 = this.f24050d;
            if (j2 >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f24050d), 0L, 1));
            }
            this.f24050d = 1 + j2;
            UnsafeUtil.f24390e.mo13710p(j2, b);
        }
    }

    public CodedOutputStream() {
    }

    /* renamed from: T */
    public static int m13252T(int i2, boolean z) {
        return m13274p0(i2) + 1;
    }

    /* renamed from: U */
    public static int m13253U(int i2, ByteString byteString) {
        return m13274p0(i2) + m13265g0(byteString.size());
    }

    /* renamed from: V */
    public static int m13254V(ByteString byteString) {
        return m13265g0(byteString.size());
    }

    /* renamed from: W */
    public static int m13255W(int i2, double d) {
        return m13274p0(i2) + 8;
    }

    /* renamed from: X */
    public static int m13256X(int i2, int i3) {
        return m13274p0(i2) + m13262d0(i3);
    }

    /* renamed from: Y */
    public static int m13257Y(int i2, int i3) {
        return m13274p0(i2) + 4;
    }

    /* renamed from: Z */
    public static int m13258Z(int i2, long j2) {
        return m13274p0(i2) + 8;
    }

    /* renamed from: a0 */
    public static int m13259a0(int i2, float f2) {
        return m13274p0(i2) + 4;
    }

    @Deprecated
    /* renamed from: b0 */
    public static int m13260b0(int i2, MessageLite messageLite, Schema schema) {
        return (m13274p0(i2) * 2) + ((AbstractMessageLite) messageLite).m12979k(schema);
    }

    /* renamed from: c0 */
    public static int m13261c0(int i2, int i3) {
        return m13262d0(i3) + m13274p0(i2);
    }

    /* renamed from: d0 */
    public static int m13262d0(int i2) {
        if (i2 >= 0) {
            return m13276r0(i2);
        }
        return 10;
    }

    /* renamed from: e0 */
    public static int m13263e0(int i2, long j2) {
        return m13274p0(i2) + m13278t0(j2);
    }

    /* renamed from: f0 */
    public static int m13264f0(LazyFieldLite lazyFieldLite) {
        return m13265g0(lazyFieldLite.f24248b != null ? lazyFieldLite.f24248b.size() : lazyFieldLite.f24247a != null ? lazyFieldLite.f24247a.mo13430c() : 0);
    }

    /* renamed from: g0 */
    public static int m13265g0(int i2) {
        return m13276r0(i2) + i2;
    }

    /* renamed from: h0 */
    public static int m13266h0(int i2, int i3) {
        return m13274p0(i2) + 4;
    }

    /* renamed from: i0 */
    public static int m13267i0(int i2, long j2) {
        return m13274p0(i2) + 8;
    }

    /* renamed from: j0 */
    public static int m13268j0(int i2, int i3) {
        return m13269k0(i3) + m13274p0(i2);
    }

    /* renamed from: k0 */
    public static int m13269k0(int i2) {
        return m13276r0(m13279u0(i2));
    }

    /* renamed from: l0 */
    public static int m13270l0(int i2, long j2) {
        return m13271m0(j2) + m13274p0(i2);
    }

    /* renamed from: m0 */
    public static int m13271m0(long j2) {
        return m13278t0(m13280v0(j2));
    }

    /* renamed from: n0 */
    public static int m13272n0(int i2, String str) {
        return m13273o0(str) + m13274p0(i2);
    }

    /* renamed from: o0 */
    public static int m13273o0(String str) {
        int length;
        try {
            length = Utf8.m13730f(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f24211b).length;
        }
        return m13265g0(length);
    }

    /* renamed from: p0 */
    public static int m13274p0(int i2) {
        return m13276r0((i2 << 3) | 0);
    }

    /* renamed from: q0 */
    public static int m13275q0(int i2, int i3) {
        return m13276r0(i3) + m13274p0(i2);
    }

    /* renamed from: r0 */
    public static int m13276r0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: s0 */
    public static int m13277s0(int i2, long j2) {
        return m13278t0(j2) + m13274p0(i2);
    }

    /* renamed from: t0 */
    public static int m13278t0(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    /* renamed from: u0 */
    public static int m13279u0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    /* renamed from: v0 */
    public static long m13280v0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* renamed from: x0 */
    public static CodedOutputStream m13281x0(byte[] bArr, int i2, int i3) {
        return new ArrayEncoder(bArr, i2, i3);
    }

    /* renamed from: A0 */
    public abstract void mo13282A0(byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: B0 */
    public abstract void mo13283B0(ByteString byteString) throws IOException;

    /* renamed from: C0 */
    public abstract void mo13284C0(int i2) throws IOException;

    /* renamed from: D0 */
    public abstract void mo13285D0(long j2) throws IOException;

    /* renamed from: E0 */
    public abstract void mo13286E0(int i2) throws IOException;

    /* renamed from: F0 */
    public abstract void mo13287F0(int i2, MessageLite messageLite) throws IOException;

    /* renamed from: G0 */
    public abstract void mo13288G0(int i2, MessageLite messageLite, Schema schema) throws IOException;

    /* renamed from: H0 */
    public abstract void mo13289H0(MessageLite messageLite) throws IOException;

    /* renamed from: I0 */
    public abstract void mo13290I0(int i2, MessageLite messageLite) throws IOException;

    /* renamed from: J0 */
    public abstract void mo13291J0(int i2, ByteString byteString) throws IOException;

    /* renamed from: K0 */
    public abstract void mo13292K0(String str) throws IOException;

    /* renamed from: L0 */
    public abstract void mo13293L0(int i2, int i3) throws IOException;

    /* renamed from: M0 */
    public abstract void mo13294M0(int i2) throws IOException;

    /* renamed from: N0 */
    public abstract void mo13295N0(long j2) throws IOException;

    /* renamed from: S */
    public final void m13296S() {
        if (mo13306y0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d */
    public abstract void mo13297d(int i2, int i3) throws IOException;

    /* renamed from: f */
    public abstract void mo13298f(int i2, int i3) throws IOException;

    /* renamed from: k */
    public abstract void mo13299k(int i2, long j2) throws IOException;

    /* renamed from: n */
    public abstract void mo13300n(int i2, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo13301o(int i2, long j2) throws IOException;

    /* renamed from: s */
    public abstract void mo13302s(int i2, boolean z) throws IOException;

    /* renamed from: w */
    public abstract void mo13303w(int i2, ByteString byteString) throws IOException;

    /* renamed from: w0 */
    public final void m13304w0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f24038b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f24211b);
        try {
            mo13294M0(bytes.length);
            mo13124R(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new OutOfSpaceException(e3);
        }
    }

    /* renamed from: x */
    public abstract void mo13305x(int i2, int i3) throws IOException;

    /* renamed from: y0 */
    public abstract int mo13306y0();

    /* renamed from: z0 */
    public abstract void mo13307z0(byte b) throws IOException;

    public CodedOutputStream(C23531 c23531) {
    }
}

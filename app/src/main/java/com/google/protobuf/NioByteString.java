package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
final class NioByteString extends ByteString.LeafByteString {

    /* renamed from: e */
    public final ByteBuffer f24301e;

    /* renamed from: com.google.protobuf.NioByteString$1 */
    class C23891 extends InputStream {
        @Override // java.io.InputStream
        public int available() throws IOException {
            throw null;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw null;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            throw null;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            throw null;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            throw null;
        }
    }

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = Internal.f24210a;
        this.f24301e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: A */
    public int mo13152A(int i2, int i3, int i4) {
        return Utf8.f24397a.m13746e(i2, this.f24301e, i3, i4 + i3);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: C */
    public ByteString mo13153C(int i2, int i3) {
        try {
            return new NioByteString(m13565I(i2, i3));
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: E */
    public String mo13155E(Charset charset) {
        byte[] m13154D;
        int i2;
        int length;
        if (this.f24301e.hasArray()) {
            m13154D = this.f24301e.array();
            i2 = this.f24301e.position() + this.f24301e.arrayOffset();
            length = this.f24301e.remaining();
        } else {
            m13154D = m13154D();
            i2 = 0;
            length = m13154D.length;
        }
        return new String(m13154D, i2, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: F */
    public void mo13156F(ByteOutput byteOutput) throws IOException {
        byteOutput.mo13123Q(this.f24301e.slice());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    /* renamed from: H */
    public boolean mo13169H(ByteString byteString, int i2, int i3) {
        return mo13153C(0, i3).equals(byteString.mo13153C(i2, i3 + i2));
    }

    /* renamed from: I */
    public final ByteBuffer m13565I(int i2, int i3) {
        if (i2 < this.f24301e.position() || i3 > this.f24301e.limit() || i2 > i3) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        ByteBuffer slice = this.f24301e.slice();
        slice.position(i2 - this.f24301e.position());
        slice.limit(i3 - this.f24301e.position());
        return slice;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: b */
    public ByteBuffer mo13158b() {
        return this.f24301e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: d */
    public byte mo13159d(int i2) {
        try {
            return this.f24301e.get(i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? this.f24301e.equals(((NioByteString) obj).f24301e) : obj instanceof RopeByteString ? obj.equals(this) : this.f24301e.equals(byteString.mo13158b());
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: s */
    public void mo13161s(byte[] bArr, int i2, int i3, int i4) {
        ByteBuffer slice = this.f24301e.slice();
        slice.position(i2);
        slice.get(bArr, i3, i4);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f24301e.remaining();
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: u */
    public byte mo13163u(int i2) {
        return mo13159d(i2);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: x */
    public boolean mo13164x() {
        ByteBuffer byteBuffer = this.f24301e;
        return Utf8.f24397a.m13746e(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: z */
    public int mo13166z(int i2, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + this.f24301e.get(i5);
        }
        return i2;
    }
}

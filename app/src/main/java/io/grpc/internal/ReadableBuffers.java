package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.Detachable;
import io.grpc.HasByteBuffer;
import io.grpc.KnownLength;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes3.dex */
public final class ReadableBuffers {

    /* renamed from: a */
    public static final ReadableBuffer f58955a = new ByteArrayWrapper(new byte[0], 0, 0);

    /* renamed from: io.grpc.internal.ReadableBuffers$1 */
    class C64461 extends ForwardingReadableBuffer {
        @Override // io.grpc.internal.ForwardingReadableBuffer, io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static class ByteArrayWrapper extends AbstractReadableBuffer {

        /* renamed from: b */
        public int f58957b;

        /* renamed from: c */
        public final int f58958c;

        /* renamed from: d */
        public final byte[] f58959d;

        /* renamed from: e */
        public int f58960e = -1;

        public ByteArrayWrapper(byte[] bArr, int i2, int i3) {
            Preconditions.m11179c(i2 >= 0, "offset must be >= 0");
            Preconditions.m11179c(i3 >= 0, "length must be >= 0");
            int i4 = i3 + i2;
            Preconditions.m11179c(i4 <= bArr.length, "offset + length exceeds array boundary");
            this.f58959d = bArr;
            this.f58957b = i2;
            this.f58958c = i4;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        /* renamed from: E0 */
        public void mo31018E0() {
            this.f58960e = this.f58957b;
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: O */
        public ReadableBuffer mo31063O(int i2) {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = this.f58957b;
            this.f58957b = i3 + i2;
            return new ByteArrayWrapper(this.f58959d, i3, i2);
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: V0 */
        public void mo31064V0(OutputStream outputStream, int i2) throws IOException {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            outputStream.write(this.f58959d, this.f58957b, i2);
            this.f58957b += i2;
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: d1 */
        public void mo31067d1(ByteBuffer byteBuffer) {
            Preconditions.m11187k(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            m31019a(remaining);
            byteBuffer.put(this.f58959d, this.f58957b, remaining);
            this.f58957b += remaining;
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: r */
        public int mo31070r() {
            return this.f58958c - this.f58957b;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public int readUnsignedByte() {
            m31019a(1);
            byte[] bArr = this.f58959d;
            int i2 = this.f58957b;
            this.f58957b = i2 + 1;
            return bArr[i2] & 255;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public void reset() {
            int i2 = this.f58960e;
            if (i2 == -1) {
                throw new InvalidMarkException();
            }
            this.f58957b = i2;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public void skipBytes(int i2) {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            this.f58957b += i2;
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: u0 */
        public void mo31071u0(byte[] bArr, int i2, int i3) {
            System.arraycopy(this.f58959d, this.f58957b, bArr, i2, i3);
            this.f58957b += i3;
        }
    }

    public static class ByteReadableBufferWrapper extends AbstractReadableBuffer {

        /* renamed from: b */
        public final ByteBuffer f58961b;

        public ByteReadableBufferWrapper(ByteBuffer byteBuffer) {
            this.f58961b = byteBuffer;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        /* renamed from: E0 */
        public void mo31018E0() {
            this.f58961b.mark();
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: O */
        public ReadableBuffer mo31063O(int i2) {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            ByteBuffer duplicate = this.f58961b.duplicate();
            duplicate.limit(this.f58961b.position() + i2);
            ByteBuffer byteBuffer = this.f58961b;
            byteBuffer.position(byteBuffer.position() + i2);
            return new ByteReadableBufferWrapper(duplicate);
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: V0 */
        public void mo31064V0(OutputStream outputStream, int i2) throws IOException {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            if (!this.f58961b.hasArray()) {
                byte[] bArr = new byte[i2];
                this.f58961b.get(bArr);
                outputStream.write(bArr);
            } else {
                outputStream.write(this.f58961b.array(), this.f58961b.position() + this.f58961b.arrayOffset(), i2);
                ByteBuffer byteBuffer = this.f58961b;
                byteBuffer.position(byteBuffer.position() + i2);
            }
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: d1 */
        public void mo31067d1(ByteBuffer byteBuffer) {
            Preconditions.m11187k(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            m31019a(remaining);
            int limit = this.f58961b.limit();
            ByteBuffer byteBuffer2 = this.f58961b;
            byteBuffer2.limit(byteBuffer2.position() + remaining);
            byteBuffer.put(this.f58961b);
            this.f58961b.limit(limit);
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: r */
        public int mo31070r() {
            return this.f58961b.remaining();
        }

        @Override // io.grpc.internal.ReadableBuffer
        public int readUnsignedByte() {
            m31019a(1);
            return this.f58961b.get() & 255;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public void reset() {
            this.f58961b.reset();
        }

        @Override // io.grpc.internal.ReadableBuffer
        public void skipBytes(int i2) {
            if (mo31070r() < i2) {
                throw new IndexOutOfBoundsException();
            }
            ByteBuffer byteBuffer = this.f58961b;
            byteBuffer.position(byteBuffer.position() + i2);
        }

        @Override // io.grpc.internal.ReadableBuffer
        /* renamed from: u0 */
        public void mo31071u0(byte[] bArr, int i2, int i3) {
            if (mo31070r() < i3) {
                throw new IndexOutOfBoundsException();
            }
            this.f58961b.get(bArr, i2, i3);
        }
    }

    public static final class BufferInputStream extends InputStream implements KnownLength, HasByteBuffer, Detachable {

        /* renamed from: b */
        public ReadableBuffer f58956b;

        public BufferInputStream(ReadableBuffer readableBuffer) {
            Preconditions.m11187k(readableBuffer, "buffer");
            this.f58956b = readableBuffer;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f58956b.mo31070r();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58956b.close();
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f58956b.mo31018E0();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f58956b.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f58956b.mo31070r() == 0) {
                return -1;
            }
            return this.f58956b.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.f58956b.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            int min = (int) Math.min(this.f58956b.mo31070r(), j2);
            this.f58956b.skipBytes(min);
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (this.f58956b.mo31070r() == 0) {
                return -1;
            }
            int min = Math.min(this.f58956b.mo31070r(), i3);
            this.f58956b.mo31071u0(bArr, i2, min);
            return min;
        }
    }
}

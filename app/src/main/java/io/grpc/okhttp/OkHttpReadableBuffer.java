package io.grpc.okhttp;

import io.grpc.internal.AbstractReadableBuffer;
import io.grpc.internal.ReadableBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.Util;
import p000a.C0000a;

/* loaded from: classes3.dex */
class OkHttpReadableBuffer extends AbstractReadableBuffer {

    /* renamed from: b */
    public final Buffer f59314b;

    public OkHttpReadableBuffer(Buffer buffer) {
        this.f59314b = buffer;
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: O */
    public ReadableBuffer mo31063O(int i2) {
        Buffer buffer = new Buffer();
        buffer.write(this.f59314b, i2);
        return new OkHttpReadableBuffer(buffer);
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: V0 */
    public void mo31064V0(OutputStream out, int i2) throws IOException {
        Buffer buffer = this.f59314b;
        long j2 = i2;
        Objects.requireNonNull(buffer);
        Intrinsics.m32179h(out, "out");
        Util.m34510b(buffer.f68742c, 0L, j2);
        Segment segment = buffer.f68741b;
        while (j2 > 0) {
            Intrinsics.m32176e(segment);
            int min = (int) Math.min(j2, segment.f68795c - segment.f68794b);
            out.write(segment.f68793a, segment.f68794b, min);
            int i3 = segment.f68794b + min;
            segment.f68794b = i3;
            long j3 = min;
            buffer.f68742c -= j3;
            j2 -= j3;
            if (i3 == segment.f68795c) {
                Segment m34613a = segment.m34613a();
                buffer.f68741b = m34613a;
                SegmentPool.m34617b(segment);
                segment = m34613a;
            }
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Buffer buffer = this.f59314b;
        buffer.skip(buffer.f68742c);
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: d1 */
    public void mo31067d1(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: r */
    public int mo31070r() {
        return (int) this.f59314b.f68742c;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public int readUnsignedByte() {
        try {
            return this.f59314b.readByte() & 255;
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void skipBytes(int i2) {
        try {
            this.f59314b.skip(i2);
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: u0 */
    public void mo31071u0(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            int read = this.f59314b.read(bArr, i2, i3);
            if (read == -1) {
                throw new IndexOutOfBoundsException(C0000a.m8e("EOF trying to read ", i3, " bytes"));
            }
            i3 -= read;
            i2 += read;
        }
    }
}

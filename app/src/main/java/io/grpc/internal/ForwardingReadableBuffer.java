package io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class ForwardingReadableBuffer implements ReadableBuffer {

    /* renamed from: b */
    public final ReadableBuffer f58652b;

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: E0 */
    public void mo31018E0() {
        this.f58652b.mo31018E0();
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: O */
    public ReadableBuffer mo31063O(int i2) {
        return this.f58652b.mo31063O(i2);
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: V0 */
    public void mo31064V0(OutputStream outputStream, int i2) throws IOException {
        this.f58652b.mo31064V0(outputStream, i2);
    }

    @Override // io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f58652b.close();
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: d1 */
    public void mo31067d1(ByteBuffer byteBuffer) {
        this.f58652b.mo31067d1(byteBuffer);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public boolean markSupported() {
        return this.f58652b.markSupported();
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: r */
    public int mo31070r() {
        return this.f58652b.mo31070r();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public int readUnsignedByte() {
        return this.f58652b.readUnsignedByte();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void reset() {
        this.f58652b.reset();
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void skipBytes(int i2) {
        this.f58652b.skipBytes(i2);
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", this.f58652b);
        return m11166b.toString();
    }

    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: u0 */
    public void mo31071u0(byte[] bArr, int i2, int i3) {
        this.f58652b.mo31071u0(bArr, i2, i3);
    }
}

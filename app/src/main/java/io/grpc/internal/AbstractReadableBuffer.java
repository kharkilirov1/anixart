package io.grpc.internal;

import io.grpc.internal.ReadableBuffers;

/* loaded from: classes3.dex */
public abstract class AbstractReadableBuffer implements ReadableBuffer {
    @Override // io.grpc.internal.ReadableBuffer
    /* renamed from: E0 */
    public void mo31018E0() {
    }

    /* renamed from: a */
    public final void m31019a(int i2) {
        if (mo31070r() < i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.ReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.ReadableBuffer
    public boolean markSupported() {
        return this instanceof ReadableBuffers.ByteArrayWrapper;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public void reset() {
        throw new UnsupportedOperationException();
    }
}

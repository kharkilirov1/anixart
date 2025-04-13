package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ReadableBuffer extends Closeable {
    /* renamed from: E0 */
    void mo31018E0();

    /* renamed from: O */
    ReadableBuffer mo31063O(int i2);

    /* renamed from: V0 */
    void mo31064V0(OutputStream outputStream, int i2) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: d1 */
    void mo31067d1(ByteBuffer byteBuffer);

    boolean markSupported();

    /* renamed from: r */
    int mo31070r();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i2);

    /* renamed from: u0 */
    void mo31071u0(byte[] bArr, int i2, int i3);
}

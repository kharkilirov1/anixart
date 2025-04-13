package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class AllocatedBuffer {
    /* renamed from: a */
    public static AllocatedBuffer m12990a(final ByteBuffer byteBuffer) {
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.1
        };
    }

    /* renamed from: b */
    public static AllocatedBuffer m12991b(final byte[] bArr, final int i2, final int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        return new AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.2
        };
    }
}

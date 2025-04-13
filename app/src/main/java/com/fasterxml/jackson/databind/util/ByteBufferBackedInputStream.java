package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    public final ByteBuffer f8886_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f8886_b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f8886_b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f8886_b.hasRemaining()) {
            return this.f8886_b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f8886_b.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i3, this.f8886_b.remaining());
        this.f8886_b.get(bArr, i2, min);
        return min;
    }
}

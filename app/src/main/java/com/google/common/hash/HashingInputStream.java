package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FilterInputStream;
import java.io.IOException;

@Beta
/* loaded from: classes.dex */
public final class HashingInputStream extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            return read;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (read == -1) {
            return read;
        }
        throw null;
    }
}

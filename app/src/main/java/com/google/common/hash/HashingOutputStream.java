package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.FilterOutputStream;
import java.io.IOException;

@Beta
/* loaded from: classes.dex */
public final class HashingOutputStream extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        throw null;
    }
}

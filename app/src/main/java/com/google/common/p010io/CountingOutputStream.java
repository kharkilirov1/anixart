package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import java.io.FilterOutputStream;
import java.io.IOException;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class CountingOutputStream extends FilterOutputStream {

    /* renamed from: b */
    public long f21858b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
        this.f21858b += i3;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        this.f21858b++;
    }
}

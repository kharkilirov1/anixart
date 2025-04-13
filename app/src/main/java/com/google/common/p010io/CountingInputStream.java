package com.google.common.p010io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.FilterInputStream;
import java.io.IOException;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class CountingInputStream extends FilterInputStream {

    /* renamed from: b */
    public long f21856b;

    /* renamed from: c */
    public long f21857c;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.f21857c = this.f21856b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f21856b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f21857c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f21856b = this.f21857c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j2);
        this.f21856b += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (read != -1) {
            this.f21856b += read;
        }
        return read;
    }
}

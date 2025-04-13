package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
final class MultiInputStream extends InputStream {

    /* renamed from: b */
    public Iterator<? extends ByteSource> f21867b;

    /* renamed from: c */
    @NullableDecl
    public InputStream f21868c;

    /* renamed from: a */
    public final void m12055a() throws IOException {
        close();
        if (this.f21867b.hasNext()) {
            this.f21868c = this.f21867b.next().mo12038a();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f21868c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f21868c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f21868c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f21868c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m12055a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        InputStream inputStream = this.f21868c;
        if (inputStream == null || j2 <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j2);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f21868c.skip(j2 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(@NullableDecl byte[] bArr, int i2, int i3) throws IOException {
        while (true) {
            InputStream inputStream = this.f21868c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                return read;
            }
            m12055a();
        }
    }
}

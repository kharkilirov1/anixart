package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbj extends InputStream {

    /* renamed from: b */
    public final InputStream f19747b;

    /* renamed from: c */
    public long f19748c;

    public zzbj(InputStream inputStream, long j2) {
        this.f19747b = inputStream;
        this.f19748c = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f19747b.close();
        this.f19748c = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j2 = this.f19748c;
        if (j2 <= 0) {
            return -1;
        }
        this.f19748c = j2 - 1;
        return this.f19747b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f19748c;
        if (j2 <= 0) {
            return -1;
        }
        int read = this.f19747b.read(bArr, i2, (int) Math.min(i3, j2));
        if (read != -1) {
            this.f19748c -= read;
        }
        return read;
    }
}

package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class DataSourceInputStream extends InputStream {

    /* renamed from: b */
    public final DataSource f14356b;

    /* renamed from: c */
    public final DataSpec f14357c;

    /* renamed from: g */
    public long f14361g;

    /* renamed from: e */
    public boolean f14359e = false;

    /* renamed from: f */
    public boolean f14360f = false;

    /* renamed from: d */
    public final byte[] f14358d = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.f14356b = dataSource;
        this.f14357c = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f14360f) {
            return;
        }
        this.f14356b.close();
        this.f14360f = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f14358d) == -1) {
            return -1;
        }
        return this.f14358d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        Assertions.m7516d(!this.f14360f);
        if (!this.f14359e) {
            this.f14356b.mo6350a(this.f14357c);
            this.f14359e = true;
        }
        int read = this.f14356b.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        this.f14361g += read;
        return read;
    }
}

package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class MarkEnforcingInputStream extends FilterInputStream {

    /* renamed from: b */
    public int f8847b;

    public MarkEnforcingInputStream(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f8847b = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m5341a(long j2) {
        int i2 = this.f8847b;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2 = this.f8847b;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    /* renamed from: b */
    public final void m5342b(long j2) {
        int i2 = this.f8847b;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f8847b = (int) (i2 - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f8847b = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m5341a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m5342b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f8847b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long m5341a = m5341a(j2);
        if (m5341a == -1) {
            return 0L;
        }
        long skip = super.skip(m5341a);
        m5342b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int m5341a = (int) m5341a(i3);
        if (m5341a == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, m5341a);
        m5342b(read);
        return read;
    }
}

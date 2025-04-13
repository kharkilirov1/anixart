package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ContentLengthInputStream extends FilterInputStream {

    /* renamed from: b */
    public final long f8834b;

    /* renamed from: c */
    public int f8835c;

    public ContentLengthInputStream(@NonNull InputStream inputStream, long j2) {
        super(inputStream);
        this.f8834b = j2;
    }

    /* renamed from: a */
    public final int m5333a(int i2) throws IOException {
        if (i2 >= 0) {
            this.f8835c += i2;
        } else if (this.f8834b - this.f8835c > 0) {
            StringBuilder m24u = C0000a.m24u("Failed to read all expected data, expected: ");
            m24u.append(this.f8834b);
            m24u.append(", but read: ");
            m24u.append(this.f8835c);
            throw new IOException(m24u.toString());
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f8834b - this.f8835c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m5333a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int read;
        read = super.read(bArr, i2, i3);
        m5333a(read);
        return read;
    }
}

package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class ExceptionCatchingInputStream extends InputStream {

    /* renamed from: d */
    public static final Queue<ExceptionCatchingInputStream> f8836d;

    /* renamed from: b */
    public InputStream f8837b;

    /* renamed from: c */
    public IOException f8838c;

    static {
        char[] cArr = Util.f8851a;
        f8836d = new ArrayDeque(0);
    }

    /* renamed from: a */
    public void m5334a() {
        this.f8838c = null;
        this.f8837b = null;
        Queue<ExceptionCatchingInputStream> queue = f8836d;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(this);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f8837b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8837b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f8837b.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f8837b.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f8837b.read(bArr);
        } catch (IOException e2) {
            this.f8838c = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f8837b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f8837b.skip(j2);
        } catch (IOException e2) {
            this.f8838c = e2;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f8837b.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f8838c = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f8837b.read();
        } catch (IOException e2) {
            this.f8838c = e2;
            return -1;
        }
    }
}

package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import org.jsoup.helper.Validate;

/* loaded from: classes3.dex */
public final class ConstrainableInputStream extends BufferedInputStream {

    /* renamed from: b */
    public final boolean f68931b;

    /* renamed from: c */
    public final int f68932c;

    /* renamed from: d */
    public long f68933d;

    /* renamed from: e */
    public long f68934e;

    /* renamed from: f */
    public int f68935f;

    /* renamed from: g */
    public boolean f68936g;

    public ConstrainableInputStream(InputStream inputStream, int i2, int i3) {
        super(inputStream, i2);
        this.f68934e = 0L;
        Validate.m34690c(i3 >= 0);
        this.f68932c = i3;
        this.f68935f = i3;
        this.f68931b = i3 != 0;
        this.f68933d = System.nanoTime();
    }

    /* renamed from: a */
    public static ConstrainableInputStream m34696a(InputStream inputStream, int i2, int i3) {
        return inputStream instanceof ConstrainableInputStream ? (ConstrainableInputStream) inputStream : new ConstrainableInputStream(inputStream, i2, i3);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        if (this.f68936g || (this.f68931b && this.f68935f <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f68936g = true;
            return -1;
        }
        if (this.f68934e != 0 && System.nanoTime() - this.f68933d > this.f68934e) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (this.f68931b && i3 > (i4 = this.f68935f)) {
            i3 = i4;
        }
        try {
            int read = super.read(bArr, i2, i3);
            this.f68935f -= read;
            return read;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f68935f = this.f68932c - ((BufferedInputStream) this).markpos;
    }
}

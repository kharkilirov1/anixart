package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ExifOrientationStream extends FilterInputStream {

    /* renamed from: d */
    public static final byte[] f8073d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e */
    public static final int f8074e = 31;

    /* renamed from: b */
    public final byte f8075b;

    /* renamed from: c */
    public int f8076c;

    public ExifOrientationStream(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(C0000a.m7d("Cannot add invalid orientation: ", i2));
        }
        this.f8075b = (byte) i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        int i3 = this.f8076c;
        int read = (i3 < 2 || i3 > (i2 = f8074e)) ? super.read() : i3 == i2 ? this.f8075b : f8073d[i3 - 2] & 255;
        if (read != -1) {
            this.f8076c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f8076c = (int) (this.f8076c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f8076c;
        int i6 = f8074e;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f8075b;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f8073d, this.f8076c - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f8076c += i4;
        }
        return i4;
    }
}

package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: b */
    public volatile byte[] f8561b;

    /* renamed from: c */
    public int f8562c;

    /* renamed from: d */
    public int f8563d;

    /* renamed from: e */
    public int f8564e;

    /* renamed from: f */
    public int f8565f;

    /* renamed from: g */
    public final ArrayPool f8566g;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) {
        super(inputStream);
        this.f8564e = -1;
        this.f8566g = arrayPool;
        this.f8561b = (byte[]) arrayPool.mo5065d(TextBuffer.MAX_SEGMENT_LEN, byte[].class);
    }

    /* renamed from: c */
    public static IOException m5184c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m5185a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f8564e;
        if (i2 != -1) {
            int i3 = this.f8565f - i2;
            int i4 = this.f8563d;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f8562c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f8566g.mo5065d(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f8561b = bArr2;
                    this.f8566g.put(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f8565f - this.f8564e;
                this.f8565f = i5;
                this.f8564e = 0;
                this.f8562c = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f8565f;
                if (read > 0) {
                    i6 += read;
                }
                this.f8562c = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f8564e = -1;
            this.f8565f = 0;
            this.f8562c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f8561b == null || inputStream == null) {
            m5184c();
            throw null;
        }
        return (this.f8562c - this.f8565f) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m5186b() {
        if (this.f8561b != null) {
            this.f8566g.put(this.f8561b);
            this.f8561b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8561b != null) {
            this.f8566g.put(this.f8561b);
            this.f8561b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f8563d = Math.max(this.f8563d, i2);
        this.f8564e = this.f8565f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f8561b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m5184c();
            throw null;
        }
        if (this.f8565f >= this.f8562c && m5185a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f8561b && (bArr = this.f8561b) == null) {
            m5184c();
            throw null;
        }
        int i2 = this.f8562c;
        int i3 = this.f8565f;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f8565f = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f8561b == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f8564e;
        if (-1 == i2) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f8565f + " markLimit: " + this.f8563d);
        }
        this.f8565f = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f8561b;
        if (bArr == null) {
            m5184c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m5184c();
            throw null;
        }
        int i2 = this.f8562c;
        int i3 = this.f8565f;
        if (i2 - i3 >= j2) {
            this.f8565f = (int) (i3 + j2);
            return j2;
        }
        long j3 = i2 - i3;
        this.f8565f = i2;
        if (this.f8564e == -1 || j2 > this.f8563d) {
            return j3 + inputStream.skip(j2 - j3);
        }
        if (m5185a(inputStream, bArr) == -1) {
            return j3;
        }
        int i4 = this.f8562c;
        int i5 = this.f8565f;
        if (i4 - i5 >= j2 - j3) {
            this.f8565f = (int) ((i5 + j2) - j3);
            return j2;
        }
        long j4 = (j3 + i4) - i5;
        this.f8565f = i4;
        return j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte[] bArr2 = this.f8561b;
        if (bArr2 == null) {
            m5184c();
            throw null;
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f8565f;
            int i7 = this.f8562c;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f8565f += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f8564e == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (m5185a(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.f8561b && (bArr2 = this.f8561b) == null) {
                        m5184c();
                        throw null;
                    }
                    int i9 = this.f8562c;
                    int i10 = this.f8565f;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f8565f += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            m5184c();
            throw null;
        }
    }
}

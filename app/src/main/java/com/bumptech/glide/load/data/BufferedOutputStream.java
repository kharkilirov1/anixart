package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class BufferedOutputStream extends OutputStream {

    /* renamed from: b */
    @NonNull
    public final OutputStream f8066b;

    /* renamed from: c */
    public byte[] f8067c;

    /* renamed from: d */
    public ArrayPool f8068d;

    /* renamed from: e */
    public int f8069e;

    public BufferedOutputStream(@NonNull OutputStream outputStream, @NonNull ArrayPool arrayPool) {
        this.f8066b = outputStream;
        this.f8068d = arrayPool;
        this.f8067c = (byte[]) arrayPool.mo5065d(TextBuffer.MAX_SEGMENT_LEN, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f8066b.close();
            byte[] bArr = this.f8067c;
            if (bArr != null) {
                this.f8068d.put(bArr);
                this.f8067c = null;
            }
        } catch (Throwable th) {
            this.f8066b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i2 = this.f8069e;
        if (i2 > 0) {
            this.f8066b.write(this.f8067c, 0, i2);
            this.f8069e = 0;
        }
        this.f8066b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f8067c;
        int i3 = this.f8069e;
        int i4 = i3 + 1;
        this.f8069e = i4;
        bArr[i3] = (byte) i2;
        if (i4 != bArr.length || i4 <= 0) {
            return;
        }
        this.f8066b.write(bArr, 0, i4);
        this.f8069e = 0;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f8069e;
            if (i7 == 0 && i5 >= this.f8067c.length) {
                this.f8066b.write(bArr, i6, i5);
                return;
            }
            int min = Math.min(i5, this.f8067c.length - i7);
            System.arraycopy(bArr, i6, this.f8067c, this.f8069e, min);
            int i8 = this.f8069e + min;
            this.f8069e = i8;
            i4 += min;
            byte[] bArr2 = this.f8067c;
            if (i8 == bArr2.length && i8 > 0) {
                this.f8066b.write(bArr2, 0, i8);
                this.f8069e = 0;
            }
        } while (i4 < i3);
    }
}

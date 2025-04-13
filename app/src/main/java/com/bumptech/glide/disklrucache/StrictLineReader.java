package com.bumptech.glide.disklrucache;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class StrictLineReader implements Closeable {

    /* renamed from: b */
    public final InputStream f7988b;

    /* renamed from: c */
    public final Charset f7989c;

    /* renamed from: d */
    public byte[] f7990d;

    /* renamed from: e */
    public int f7991e;

    /* renamed from: f */
    public int f7992f;

    public StrictLineReader(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(Util.f7994a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f7988b = inputStream;
        this.f7989c = charset;
        this.f7990d = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
    }

    /* renamed from: a */
    public final void m4924a() throws IOException {
        InputStream inputStream = this.f7988b;
        byte[] bArr = this.f7990d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f7991e = 0;
        this.f7992f = read;
    }

    /* renamed from: b */
    public String m4925b() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.f7988b) {
            if (this.f7990d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f7991e >= this.f7992f) {
                m4924a();
            }
            for (int i4 = this.f7991e; i4 != this.f7992f; i4++) {
                byte[] bArr2 = this.f7990d;
                if (bArr2[i4] == 10) {
                    int i5 = this.f7991e;
                    if (i4 != i5) {
                        i3 = i4 - 1;
                        if (bArr2[i3] == 13) {
                            String str = new String(bArr2, i5, i3 - i5, this.f7989c.name());
                            this.f7991e = i4 + 1;
                            return str;
                        }
                    }
                    i3 = i4;
                    String str2 = new String(bArr2, i5, i3 - i5, this.f7989c.name());
                    this.f7991e = i4 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f7992f - this.f7991e) + 80) { // from class: com.bumptech.glide.disklrucache.StrictLineReader.1
                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    int i6 = ((ByteArrayOutputStream) this).count;
                    if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                        i6--;
                    }
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, i6, StrictLineReader.this.f7989c.name());
                    } catch (UnsupportedEncodingException e2) {
                        throw new AssertionError(e2);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.f7990d;
                int i6 = this.f7991e;
                byteArrayOutputStream.write(bArr3, i6, this.f7992f - i6);
                this.f7992f = -1;
                m4924a();
                i2 = this.f7991e;
                while (i2 != this.f7992f) {
                    bArr = this.f7990d;
                    if (bArr[i2] == 10) {
                        break loop1;
                    }
                    i2++;
                }
            }
            int i7 = this.f7991e;
            if (i2 != i7) {
                byteArrayOutputStream.write(bArr, i7, i2 - i7);
            }
            this.f7991e = i2 + 1;
            return byteArrayOutputStream.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f7988b) {
            if (this.f7990d != null) {
                this.f7990d = null;
                this.f7988b.close();
            }
        }
    }
}

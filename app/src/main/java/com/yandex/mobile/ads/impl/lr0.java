package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class lr0 extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C5799tf f52516a;

    public lr0(C5799tf c5799tf, int i2) {
        this.f52516a = c5799tf;
        ((ByteArrayOutputStream) this).buf = c5799tf.m28647a(Math.max(i2, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52516a.m28646a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f52516a.m28646a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count + 1;
        if (i3 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] m28647a = this.f52516a.m28647a(i3 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m28647a, 0, ((ByteArrayOutputStream) this).count);
            this.f52516a.m28646a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = m28647a;
        }
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        int i4 = ((ByteArrayOutputStream) this).count + i3;
        if (i4 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] m28647a = this.f52516a.m28647a(i4 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m28647a, 0, ((ByteArrayOutputStream) this).count);
            this.f52516a.m28646a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = m28647a;
        }
        super.write(bArr, i2, i3);
    }
}

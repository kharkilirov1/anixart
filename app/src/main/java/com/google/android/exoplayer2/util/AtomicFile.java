package com.google.android.exoplayer2.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class AtomicFile {

    public static final class AtomicFileOutputStream extends OutputStream {

        /* renamed from: b */
        public final FileOutputStream f14611b;

        /* renamed from: c */
        public boolean f14612c;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f14612c) {
                return;
            }
            this.f14612c = true;
            this.f14611b.flush();
            try {
                this.f14611b.getFD().sync();
            } catch (IOException e2) {
                Log.m7588e("AtomicFile", "Failed to sync file descriptor:", e2);
            }
            this.f14611b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f14611b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f14611b.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f14611b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f14611b.write(bArr, i2, i3);
        }
    }
}

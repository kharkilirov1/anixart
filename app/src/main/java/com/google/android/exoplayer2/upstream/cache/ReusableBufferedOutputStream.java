package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class ReusableBufferedOutputStream extends BufferedOutputStream {

    /* renamed from: b */
    public boolean f14603b;

    public ReusableBufferedOutputStream(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }

    /* renamed from: a */
    public void m7511a(OutputStream outputStream) {
        Assertions.m7516d(this.f14603b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f14603b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14603b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i2 = Util.f14736a;
        throw th;
    }
}

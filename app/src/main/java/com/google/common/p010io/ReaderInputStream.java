package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;

@GwtIncompatible
/* loaded from: classes2.dex */
final class ReaderInputStream extends InputStream {

    /* renamed from: b */
    public final Reader f21871b;

    /* renamed from: c */
    public final CharsetEncoder f21872c;

    /* renamed from: d */
    public final byte[] f21873d;

    /* renamed from: e */
    public CharBuffer f21874e;

    /* renamed from: f */
    public ByteBuffer f21875f;

    /* renamed from: g */
    public boolean f21876g;

    /* renamed from: h */
    public boolean f21877h;

    /* renamed from: i */
    public boolean f21878i;

    /* renamed from: a */
    public final void m12057a(boolean z) {
        this.f21875f.flip();
        if (z && this.f21875f.remaining() == 0) {
            this.f21875f = ByteBuffer.allocate(this.f21875f.capacity() * 2);
        } else {
            this.f21877h = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21871b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f21873d) == 1) {
            return this.f21873d[0] & 255;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r2 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r11, int r12, int r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p010io.ReaderInputStream.read(byte[], int, int):int");
    }
}

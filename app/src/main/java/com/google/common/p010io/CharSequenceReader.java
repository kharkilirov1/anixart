package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@GwtIncompatible
/* loaded from: classes2.dex */
final class CharSequenceReader extends Reader {

    /* renamed from: b */
    public CharSequence f21844b;

    /* renamed from: c */
    public int f21845c;

    /* renamed from: d */
    public int f21846d;

    public CharSequenceReader(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.f21844b = charSequence;
    }

    /* renamed from: a */
    public final void m12047a() throws IOException {
        if (this.f21844b == null) {
            throw new IOException("reader closed");
        }
    }

    /* renamed from: b */
    public final boolean m12048b() {
        return m12049c() > 0;
    }

    /* renamed from: c */
    public final int m12049c() {
        return this.f21844b.length() - this.f21845c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f21844b = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i2) throws IOException {
        Preconditions.m11181e(i2 >= 0, "readAheadLimit (%s) may not be negative", i2);
        m12047a();
        this.f21846d = this.f21845c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char c2;
        m12047a();
        if (m12048b()) {
            CharSequence charSequence = this.f21844b;
            int i2 = this.f21845c;
            this.f21845c = i2 + 1;
            c2 = charSequence.charAt(i2);
        } else {
            c2 = 65535;
        }
        return c2;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        m12047a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        m12047a();
        this.f21845c = this.f21846d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j2) throws IOException {
        int min;
        Preconditions.m11183g(j2 >= 0, "n (%s) may not be negative", j2);
        m12047a();
        min = (int) Math.min(m12049c(), j2);
        this.f21845c += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i2, int i3) throws IOException {
        Preconditions.m11190n(i2, i2 + i3, cArr.length);
        m12047a();
        if (!m12048b()) {
            return -1;
        }
        int min = Math.min(i3, m12049c());
        for (int i4 = 0; i4 < min; i4++) {
            CharSequence charSequence = this.f21844b;
            int i5 = this.f21845c;
            this.f21845c = i5 + 1;
            cArr[i2 + i4] = charSequence.charAt(i5);
        }
        return min;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        Objects.requireNonNull(charBuffer);
        m12047a();
        if (!m12048b()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), m12049c());
        for (int i2 = 0; i2 < min; i2++) {
            CharSequence charSequence = this.f21844b;
            int i3 = this.f21845c;
            this.f21845c = i3 + 1;
            charBuffer.put(charSequence.charAt(i3));
        }
        return min;
    }
}

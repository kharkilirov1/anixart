package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.Writer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
class AppendableWriter extends Writer {

    /* renamed from: b */
    public boolean f21807b;

    /* renamed from: a */
    public final void m12027a() throws IOException {
        if (this.f21807b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21807b = true;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        m12027a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) throws IOException {
        m12027a();
        new String(cArr, i2, i3);
        throw null;
    }

    @Override // java.io.Writer
    public void write(int i2) throws IOException {
        m12027a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        m12027a();
        throw null;
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str) throws IOException {
        m12027a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence) throws IOException {
        m12027a();
        throw null;
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str, int i2, int i3) throws IOException {
        m12027a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
        m12027a();
        throw null;
    }
}

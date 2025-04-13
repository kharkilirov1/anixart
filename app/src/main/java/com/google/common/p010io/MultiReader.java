package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
class MultiReader extends Reader {

    /* renamed from: b */
    public final Iterator<? extends CharSource> f21869b;

    /* renamed from: c */
    @NullableDecl
    public Reader f21870c;

    /* renamed from: a */
    public final void m12056a() throws IOException {
        close();
        if (this.f21869b.hasNext()) {
            this.f21870c = this.f21869b.next().mo12043a();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f21870c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f21870c = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(@NullableDecl char[] cArr, int i2, int i3) throws IOException {
        Reader reader = this.f21870c;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i2, i3);
        if (read != -1) {
            return read;
        }
        m12056a();
        return read(cArr, i2, i3);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f21870c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j2) throws IOException {
        Preconditions.m11179c(j2 >= 0, "n is negative");
        if (j2 > 0) {
            while (true) {
                Reader reader = this.f21870c;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j2);
                if (skip > 0) {
                    return skip;
                }
                m12056a();
            }
        }
        return 0L;
    }
}

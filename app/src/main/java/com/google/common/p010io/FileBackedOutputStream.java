package com.google.common.p010io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class FileBackedOutputStream extends OutputStream {

    /* renamed from: b */
    @GuardedBy
    public OutputStream f21859b;

    /* renamed from: c */
    @GuardedBy
    public MemoryOutput f21860c;

    /* renamed from: d */
    @NullableDecl
    @GuardedBy
    public File f21861d;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1 */
    class C18941 extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            FileBackedOutputStream.m12051a(null);
            throw null;
        }

        public void finalize() {
            try {
                throw null;
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2 */
    class C18952 extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            FileBackedOutputStream.m12051a(null);
            throw null;
        }
    }

    public static class MemoryOutput extends ByteArrayOutputStream {
        /* renamed from: a */
        public byte[] m12053a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    /* renamed from: a */
    public static InputStream m12051a(FileBackedOutputStream fileBackedOutputStream) throws IOException {
        throw null;
    }

    @GuardedBy
    /* renamed from: b */
    public final void m12052b(int i2) throws IOException {
        if (this.f21861d != null || this.f21860c.getCount() + i2 <= 0) {
            return;
        }
        File createTempFile = File.createTempFile("FileBackedOutputStream", null, null);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        fileOutputStream.write(this.f21860c.m12053a(), 0, this.f21860c.getCount());
        fileOutputStream.flush();
        this.f21859b = fileOutputStream;
        this.f21861d = createTempFile;
        this.f21860c = null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f21859b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f21859b.flush();
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i2) throws IOException {
        m12052b(1);
        this.f21859b.write(i2);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i2, int i3) throws IOException {
        m12052b(i3);
        this.f21859b.write(bArr, i2, i3);
    }
}

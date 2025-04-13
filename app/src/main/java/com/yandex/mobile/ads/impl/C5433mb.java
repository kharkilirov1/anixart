package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.mb */
/* loaded from: classes3.dex */
public final class C5433mb {

    /* renamed from: a */
    private final File f52620a;

    /* renamed from: b */
    private final File f52621b;

    /* renamed from: com.yandex.mobile.ads.impl.mb$a */
    public static final class a extends OutputStream {

        /* renamed from: a */
        private final FileOutputStream f52622a;

        /* renamed from: b */
        private boolean f52623b = false;

        public a(File file) throws FileNotFoundException {
            this.f52622a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f52623b) {
                return;
            }
            this.f52623b = true;
            this.f52622a.flush();
            try {
                this.f52622a.getFD().sync();
            } catch (IOException e2) {
                d90.m23840b("AtomicFile", "Failed to sync file descriptor:", e2);
            }
            this.f52622a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f52622a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i2) throws IOException {
            this.f52622a.write(i2);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f52622a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f52622a.write(bArr, i2, i3);
        }
    }

    public C5433mb(File file) {
        this.f52620a = file;
        this.f52621b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public final void m26601a() {
        this.f52620a.delete();
        this.f52621b.delete();
    }

    /* renamed from: b */
    public final boolean m26603b() {
        return this.f52620a.exists() || this.f52621b.exists();
    }

    /* renamed from: c */
    public final FileInputStream m26604c() throws FileNotFoundException {
        if (this.f52621b.exists()) {
            this.f52620a.delete();
            this.f52621b.renameTo(this.f52620a);
        }
        return new FileInputStream(this.f52620a);
    }

    /* renamed from: d */
    public final OutputStream m26605d() throws IOException {
        if (this.f52620a.exists()) {
            if (this.f52621b.exists()) {
                this.f52620a.delete();
            } else if (!this.f52620a.renameTo(this.f52621b)) {
                StringBuilder m26356a = l60.m26356a("Couldn't rename file ");
                m26356a.append(this.f52620a);
                m26356a.append(" to backup file ");
                m26356a.append(this.f52621b);
                d90.m23842d("AtomicFile", m26356a.toString());
            }
        }
        try {
            return new a(this.f52620a);
        } catch (FileNotFoundException e2) {
            File parentFile = this.f52620a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder m26356a2 = l60.m26356a("Couldn't create ");
                m26356a2.append(this.f52620a);
                throw new IOException(m26356a2.toString(), e2);
            }
            try {
                return new a(this.f52620a);
            } catch (FileNotFoundException e3) {
                StringBuilder m26356a3 = l60.m26356a("Couldn't create ");
                m26356a3.append(this.f52620a);
                throw new IOException(m26356a3.toString(), e3);
            }
        }
    }

    /* renamed from: a */
    public final void m26602a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f52621b.delete();
    }
}

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable {

    /* renamed from: d */
    public static final Pattern f24940d = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: e */
    public static final Sink f24941e = new Sink() { // from class: com.squareup.okhttp.internal.DiskLruCache.4
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getF68778c() {
            return Timeout.NONE;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            buffer.skip(j2);
        }
    };

    /* renamed from: b */
    public int f24942b;

    /* renamed from: c */
    public boolean f24943c;

    /* renamed from: com.squareup.okhttp.internal.DiskLruCache$1 */
    public class RunnableC24741 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.squareup.okhttp.internal.DiskLruCache$2 */
    class C24752 extends FaultHidingSink {

        /* renamed from: c */
        public final /* synthetic */ DiskLruCache f24944c;

        @Override // com.squareup.okhttp.internal.FaultHidingSink
        /* renamed from: a */
        public void mo13930a(IOException iOException) {
            Objects.requireNonNull(this.f24944c);
        }
    }

    /* renamed from: com.squareup.okhttp.internal.DiskLruCache$3 */
    class C24763 implements Iterator<Snapshot> {

        /* renamed from: b */
        public Snapshot f24945b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f24945b = null;
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f24945b == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                throw null;
            } catch (Throwable th) {
                this.f24945b = null;
                throw th;
            }
        }
    }

    public final class Editor {

        /* renamed from: a */
        public final Entry f24946a;

        /* renamed from: b */
        public boolean f24947b;

        /* renamed from: c */
        public final /* synthetic */ DiskLruCache f24948c;

        /* renamed from: com.squareup.okhttp.internal.DiskLruCache$Editor$1 */
        class C24781 extends FaultHidingSink {

            /* renamed from: c */
            public final /* synthetic */ Editor f24949c;

            @Override // com.squareup.okhttp.internal.FaultHidingSink
            /* renamed from: a */
            public void mo13930a(IOException iOException) {
                synchronized (this.f24949c.f24948c) {
                    this.f24949c.f24947b = true;
                }
            }
        }

        /* renamed from: a */
        public void m13931a() throws IOException {
            synchronized (this.f24948c) {
                DiskLruCache.m13928a(this.f24948c, this, false);
            }
        }

        /* renamed from: b */
        public void m13932b() throws IOException {
            synchronized (this.f24948c) {
                if (this.f24947b) {
                    DiskLruCache.m13928a(this.f24948c, this, false);
                    this.f24948c.m13929b(this.f24946a);
                    throw null;
                }
                DiskLruCache.m13928a(this.f24948c, this, true);
            }
        }
    }

    public final class Entry {

        /* renamed from: a */
        public boolean f24950a;

        /* renamed from: b */
        public Editor f24951b;
    }

    public final class Snapshot implements Closeable {

        /* renamed from: b */
        public final Source[] f24952b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.f24952b) {
                Util.m13935c(source);
            }
        }
    }

    /* renamed from: a */
    public static void m13928a(DiskLruCache diskLruCache, Editor editor, boolean z) throws IOException {
        synchronized (diskLruCache) {
            Entry entry = editor.f24946a;
            if (entry.f24951b != editor) {
                throw new IllegalStateException();
            }
            diskLruCache.f24942b++;
            entry.f24951b = null;
            if (!z && !entry.f24950a) {
                throw null;
            }
            entry.f24950a = true;
            throw null;
        }
    }

    /* renamed from: b */
    public final boolean m13929b(Entry entry) throws IOException {
        Editor editor = entry.f24951b;
        if (editor != null) {
            editor.f24947b = true;
        }
        this.f24942b++;
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f24943c = true;
    }
}

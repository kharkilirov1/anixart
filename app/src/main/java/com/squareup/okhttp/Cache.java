package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okio.BufferedSource;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Sink;

/* loaded from: classes2.dex */
public final class Cache {

    /* renamed from: a */
    public int f24780a;

    /* renamed from: b */
    public int f24781b;

    /* renamed from: com.squareup.okhttp.Cache$1 */
    public class C24551 implements InternalCache {
    }

    /* renamed from: com.squareup.okhttp.Cache$2 */
    class C24562 implements Iterator<String> {

        /* renamed from: b */
        public boolean f24782b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            this.f24782b = false;
            throw null;
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f24782b = true;
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f24782b) {
                throw new IllegalStateException("remove() before next()");
            }
            throw null;
        }
    }

    public final class CacheRequestImpl implements CacheRequest {

        /* renamed from: a */
        public final DiskLruCache.Editor f24783a;

        /* renamed from: b */
        public Sink f24784b;

        /* renamed from: c */
        public boolean f24785c;

        /* renamed from: d */
        public final /* synthetic */ Cache f24786d;

        /* renamed from: com.squareup.okhttp.Cache$CacheRequestImpl$1 */
        class C24571 extends ForwardingSink {

            /* renamed from: b */
            public final /* synthetic */ DiskLruCache.Editor f24787b;

            /* renamed from: c */
            public final /* synthetic */ CacheRequestImpl f24788c;

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (this.f24788c.f24786d) {
                    CacheRequestImpl cacheRequestImpl = this.f24788c;
                    if (cacheRequestImpl.f24785c) {
                        return;
                    }
                    cacheRequestImpl.f24785c = true;
                    cacheRequestImpl.f24786d.f24780a++;
                    super.close();
                    this.f24787b.m13932b();
                }
            }
        }

        @Override // com.squareup.okhttp.internal.http.CacheRequest
        public void abort() {
            synchronized (this.f24786d) {
                if (this.f24785c) {
                    return;
                }
                this.f24785c = true;
                this.f24786d.f24781b++;
                Util.m13935c(this.f24784b);
                try {
                    this.f24783a.m13931a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static class CacheResponseBody extends ResponseBody {

        /* renamed from: b */
        public final BufferedSource f24789b;

        /* renamed from: com.squareup.okhttp.Cache$CacheResponseBody$1 */
        class C24581 extends ForwardingSource {

            /* renamed from: b */
            public final /* synthetic */ DiskLruCache.Snapshot f24790b;

            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f24790b.close();
                super.close();
            }
        }

        @Override // com.squareup.okhttp.ResponseBody
        /* renamed from: a */
        public BufferedSource mo13882a() {
            return this.f24789b;
        }
    }

    public static final class Entry {
    }
}

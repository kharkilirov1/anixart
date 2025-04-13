package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.File;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SimpleCache implements Cache {

    /* renamed from: com.google.android.exoplayer2.upstream.cache.SimpleCache$1 */
    class C11681 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    static {
        new HashSet();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: a */
    public synchronized File mo7484a(String str, long j2, long j3) throws Cache.CacheException {
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: b */
    public synchronized ContentMetadata mo7485b(String str) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: c */
    public synchronized void mo7486c(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: d */
    public synchronized long mo7487d(String str, long j2, long j3) {
        long j4 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        if (j2 < (j4 >= 0 ? j4 : Long.MAX_VALUE)) {
            synchronized (this) {
                throw null;
            }
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    /* renamed from: e */
    public synchronized CacheSpan mo7488e(String str, long j2, long j3) throws Cache.CacheException {
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: f */
    public synchronized long mo7489f(String str, long j2, long j3) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: g */
    public synchronized CacheSpan mo7490g(String str, long j2, long j3) throws InterruptedException, Cache.CacheException {
        synchronized (this) {
        }
        throw null;
        synchronized (this) {
            synchronized (this) {
                throw null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: h */
    public synchronized void mo7491h(File file, long j2) throws Cache.CacheException {
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
            } else {
                SimpleCacheSpan.m7512a(file, j2, -9223372036854775807L, null);
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: i */
    public synchronized long mo7492i() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /* renamed from: j */
    public synchronized void mo7493j(CacheSpan cacheSpan) {
        String str = cacheSpan.f14579b;
        throw null;
    }
}

package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(Throwable th) {
            super(th);
        }
    }

    public interface Listener {
    }

    @WorkerThread
    /* renamed from: a */
    File mo7484a(String str, long j2, long j3) throws CacheException;

    /* renamed from: b */
    ContentMetadata mo7485b(String str);

    @WorkerThread
    /* renamed from: c */
    void mo7486c(String str, ContentMetadataMutations contentMetadataMutations) throws CacheException;

    /* renamed from: d */
    long mo7487d(String str, long j2, long j3);

    @Nullable
    @WorkerThread
    /* renamed from: e */
    CacheSpan mo7488e(String str, long j2, long j3) throws CacheException;

    /* renamed from: f */
    long mo7489f(String str, long j2, long j3);

    @WorkerThread
    /* renamed from: g */
    CacheSpan mo7490g(String str, long j2, long j3) throws InterruptedException, CacheException;

    @WorkerThread
    /* renamed from: h */
    void mo7491h(File file, long j2) throws CacheException;

    /* renamed from: i */
    long mo7492i();

    /* renamed from: j */
    void mo7493j(CacheSpan cacheSpan);
}

package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class CacheWriter {

    /* renamed from: a */
    public final CacheDataSource f14584a;

    /* renamed from: b */
    public final Cache f14585b;

    /* renamed from: c */
    public final DataSpec f14586c;

    /* renamed from: d */
    public final String f14587d;

    /* renamed from: e */
    public final byte[] f14588e;

    /* renamed from: f */
    @Nullable
    public final ProgressListener f14589f;

    /* renamed from: g */
    public long f14590g;

    /* renamed from: h */
    public long f14591h;

    /* renamed from: i */
    public long f14592i;

    /* renamed from: j */
    public volatile boolean f14593j;

    public interface ProgressListener {
        /* renamed from: a */
        void mo6756a(long j2, long j3, long j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef A[Catch: IOException -> 0x0118, TryCatch #2 {IOException -> 0x0118, blocks: (B:54:0x00e7, B:68:0x00ef, B:71:0x00fd, B:73:0x0107, B:74:0x0114, B:80:0x011c), top: B:53:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c A[Catch: IOException -> 0x0118, TRY_LEAVE, TryCatch #2 {IOException -> 0x0118, blocks: (B:54:0x00e7, B:68:0x00ef, B:71:0x00fd, B:73:0x0107, B:74:0x0114, B:80:0x011c), top: B:53:0x00e7 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7503a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheWriter.m7503a():void");
    }

    /* renamed from: b */
    public final long m7504b() {
        long j2 = this.f14591h;
        if (j2 == -1) {
            return -1L;
        }
        return j2 - this.f14586c.f14367f;
    }

    /* renamed from: c */
    public final void m7505c(long j2) {
        if (this.f14591h == j2) {
            return;
        }
        this.f14591h = j2;
        ProgressListener progressListener = this.f14589f;
        if (progressListener != null) {
            progressListener.mo6756a(m7504b(), this.f14592i, 0L);
        }
    }

    /* renamed from: d */
    public final void m7506d() throws InterruptedIOException {
        if (this.f14593j) {
            throw new InterruptedIOException();
        }
    }
}

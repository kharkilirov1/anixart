package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class DiskLruCacheWrapper implements DiskCache {

    /* renamed from: b */
    public final File f8381b;

    /* renamed from: c */
    public final long f8382c;

    /* renamed from: e */
    public DiskLruCache f8384e;

    /* renamed from: d */
    public final DiskCacheWriteLocker f8383d = new DiskCacheWriteLocker();

    /* renamed from: a */
    public final SafeKeyGenerator f8380a = new SafeKeyGenerator();

    @Deprecated
    public DiskLruCacheWrapper(File file, long j2) {
        this.f8381b = file;
        this.f8382c = j2;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    /* renamed from: a */
    public void mo5104a(Key key, DiskCache.Writer writer) {
        DiskCacheWriteLocker.WriteLock writeLock;
        boolean z;
        String m5120a = this.f8380a.m5120a(key);
        DiskCacheWriteLocker diskCacheWriteLocker = this.f8383d;
        synchronized (diskCacheWriteLocker) {
            writeLock = diskCacheWriteLocker.f8373a.get(m5120a);
            if (writeLock == null) {
                DiskCacheWriteLocker.WriteLockPool writeLockPool = diskCacheWriteLocker.f8374b;
                synchronized (writeLockPool.f8377a) {
                    writeLock = writeLockPool.f8377a.poll();
                }
                if (writeLock == null) {
                    writeLock = new DiskCacheWriteLocker.WriteLock();
                }
                diskCacheWriteLocker.f8373a.put(m5120a, writeLock);
            }
            writeLock.f8376b++;
        }
        writeLock.f8375a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m5120a + " for for Key: " + key);
            }
            try {
                DiskLruCache m5109c = m5109c();
                if (m5109c.m4913g(m5120a) == null) {
                    DiskLruCache.Editor m4912e = m5109c.m4912e(m5120a);
                    if (m4912e == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + m5120a);
                    }
                    try {
                        if (writer.mo4991a(m4912e.m4921b(0))) {
                            DiskLruCache.m4907a(DiskLruCache.this, m4912e, true);
                            m4912e.f7977c = true;
                        }
                        if (!z) {
                            try {
                                m4912e.m4920a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!m4912e.f7977c) {
                            try {
                                m4912e.m4920a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f8383d.m5107a(m5120a);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    /* renamed from: b */
    public File mo5105b(Key key) {
        String m5120a = this.f8380a.m5120a(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m5120a + " for for Key: " + key);
        }
        try {
            DiskLruCache.Value m4913g = m5109c().m4913g(m5120a);
            if (m4913g != null) {
                return m4913g.f7987a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    /* renamed from: c */
    public final synchronized DiskLruCache m5109c() throws IOException {
        if (this.f8384e == null) {
            this.f8384e = DiskLruCache.m4909i(this.f8381b, 1, 1, this.f8382c);
        }
        return this.f8384e;
    }
}

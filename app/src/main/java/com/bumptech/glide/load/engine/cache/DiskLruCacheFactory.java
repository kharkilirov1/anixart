package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* renamed from: a */
    public final long f8378a;

    /* renamed from: b */
    public final CacheDirectoryGetter f8379b;

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$1 */
    class C07981 implements CacheDirectoryGetter {
        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        /* renamed from: a */
        public File mo5108a() {
            return new File((String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$2 */
    class C07992 implements CacheDirectoryGetter {
        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        /* renamed from: a */
        public File mo5108a() {
            return new File((String) null, (String) null);
        }
    }

    public interface CacheDirectoryGetter {
        /* renamed from: a */
        File mo5108a();
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j2) {
        this.f8378a = j2;
        this.f8379b = cacheDirectoryGetter;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    /* renamed from: A */
    public DiskCache mo5106A() {
        File mo5108a = this.f8379b.mo5108a();
        if (mo5108a == null) {
            return null;
        }
        if (mo5108a.mkdirs() || (mo5108a.exists() && mo5108a.isDirectory())) {
            return new DiskLruCacheWrapper(mo5108a, this.f8378a);
        }
        return null;
    }
}

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes.dex */
public class DiskCacheAdapter implements DiskCache {

    public static final class Factory implements DiskCache.Factory {
        @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
        /* renamed from: A */
        public DiskCache mo5106A() {
            return new DiskCacheAdapter();
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    /* renamed from: a */
    public void mo5104a(Key key, DiskCache.Writer writer) {
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    /* renamed from: b */
    public File mo5105b(Key key) {
        return null;
    }
}

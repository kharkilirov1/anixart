package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.cache.MemoryCache;

/* loaded from: classes.dex */
public class MemoryCacheAdapter implements MemoryCache {

    /* renamed from: a */
    public MemoryCache.ResourceRemovedListener f8388a;

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    /* renamed from: a */
    public void mo5110a(int i2) {
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    /* renamed from: b */
    public void mo5115b() {
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    /* renamed from: c */
    public Resource<?> mo5116c(@NonNull Key key, @Nullable Resource<?> resource) {
        this.f8388a.mo5026a(resource);
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    /* renamed from: d */
    public Resource<?> mo5111d(@NonNull Key key) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    /* renamed from: e */
    public void mo5112e(@NonNull MemoryCache.ResourceRemovedListener resourceRemovedListener) {
        this.f8388a = resourceRemovedListener;
    }
}

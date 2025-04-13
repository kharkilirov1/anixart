package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.LruCache;

/* loaded from: classes.dex */
public class LruResourceCache extends LruCache<Key, Resource<?>> implements MemoryCache {

    /* renamed from: d */
    public MemoryCache.ResourceRemovedListener f8387d;

    public LruResourceCache(long j2) {
        super(j2);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @SuppressLint
    /* renamed from: a */
    public void mo5110a(int i2) {
        long j2;
        if (i2 >= 40) {
            m5340j(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (this) {
                j2 = this.f8845b;
            }
            m5340j(j2 / 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @Nullable
    /* renamed from: d */
    public Resource mo5111d(@NonNull Key key) {
        Object remove;
        synchronized (this) {
            remove = this.f8844a.remove(key);
            if (remove != null) {
                this.f8846c -= mo5113g(remove);
            }
        }
        return (Resource) remove;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    /* renamed from: e */
    public void mo5112e(@NonNull MemoryCache.ResourceRemovedListener resourceRemovedListener) {
        this.f8387d = resourceRemovedListener;
    }

    @Override // com.bumptech.glide.util.LruCache
    /* renamed from: g */
    public int mo5113g(@Nullable Resource<?> resource) {
        Resource<?> resource2 = resource;
        if (resource2 == null) {
            return 1;
        }
        return resource2.mo5045d();
    }

    @Override // com.bumptech.glide.util.LruCache
    /* renamed from: h */
    public void mo5114h(@NonNull Key key, @Nullable Resource<?> resource) {
        Resource<?> resource2 = resource;
        MemoryCache.ResourceRemovedListener resourceRemovedListener = this.f8387d;
        if (resourceRemovedListener == null || resource2 == null) {
            return;
        }
        resourceRemovedListener.mo5026a(resource2);
    }
}

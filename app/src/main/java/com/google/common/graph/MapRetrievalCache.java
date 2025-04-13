package com.google.common.graph;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    /* renamed from: b */
    @NullableDecl
    public volatile transient CacheEntry<K, V> f21729b;

    /* renamed from: c */
    @NullableDecl
    public volatile transient CacheEntry<K, V> f21730c;

    public static final class CacheEntry<K, V> {

        /* renamed from: a */
        public final K f21731a;

        /* renamed from: b */
        public final V f21732b;
    }

    @Override // com.google.common.graph.MapIteratorCache
    /* renamed from: a */
    public V mo12013a(@NullableDecl Object obj) {
        V v = (V) super.mo12013a(obj);
        if (v != null) {
            return v;
        }
        CacheEntry<K, V> cacheEntry = this.f21729b;
        if (cacheEntry != null && cacheEntry.f21731a == obj) {
            return cacheEntry.f21732b;
        }
        CacheEntry<K, V> cacheEntry2 = this.f21730c;
        if (cacheEntry2 == null || cacheEntry2.f21731a != obj) {
            return null;
        }
        this.f21730c = this.f21729b;
        this.f21729b = cacheEntry2;
        return cacheEntry2.f21732b;
    }
}

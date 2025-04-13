package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Cache mo7455G() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingLoadingCache
        /* renamed from: I */
        public final LoadingCache<K, V> mo11329H() {
            return null;
        }
    }

    @Override // com.google.common.cache.ForwardingCache
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract LoadingCache<K, V> mo7455G();

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K k2) {
        return mo11329H().apply(k2);
    }
}

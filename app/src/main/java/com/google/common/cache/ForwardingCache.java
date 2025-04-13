package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* renamed from: H */
        public final Cache<K, V> mo7455G() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Cache<K, V> mo7455G();
}

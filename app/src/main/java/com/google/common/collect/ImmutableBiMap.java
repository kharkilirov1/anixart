package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        /* renamed from: a */
        public ImmutableMap mo11613a() {
            return this.f21044b == 0 ? RegularImmutableBiMap.f21417j : new RegularImmutableBiMap(this.f21043a, this.f21044b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: c */
        public ImmutableMap.Builder mo11614c(Object obj, Object obj2) {
            super.mo11614c(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: d */
        public ImmutableMap.Builder mo11615d(Map.Entry entry) {
            super.mo11615d(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        /* renamed from: e */
        public ImmutableMap.Builder mo11616e(Iterable iterable) {
            super.mo11616e(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: f */
        public ImmutableMap.Builder mo11617f(Map map) {
            super.mo11617f(map);
            return this;
        }
    }

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: f */
    public ImmutableCollection mo11609f() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: o */
    public abstract ImmutableBiMap<V, K> mo11611o();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<V> values() {
        return mo11611o().keySet();
    }
}

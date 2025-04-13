package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* renamed from: e */
    public final ImmutableMap<K, V> f21048e;

    @GwtIncompatible
    public static class KeySetSerializedForm<K> implements Serializable {
    }

    public ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.f21048e = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return this.f21048e.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public K get(int i2) {
        return this.f21048e.entrySet().mo11543b().get(i2).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<K> iterator() {
        return this.f21048e.mo11625j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21048e.size();
    }
}

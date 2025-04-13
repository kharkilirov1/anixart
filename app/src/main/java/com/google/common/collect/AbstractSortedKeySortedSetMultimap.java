package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> mo11334E() {
        return (SortedMap) super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        return m11354q();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: n */
    public /* bridge */ /* synthetic */ Collection mo11336n() {
        return mo11336n();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
    /* renamed from: w */
    public /* bridge */ /* synthetic */ Set mo11336n() {
        return mo11336n();
    }
}

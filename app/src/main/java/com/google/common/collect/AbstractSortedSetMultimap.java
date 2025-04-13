package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: E */
    public Map<K, Collection<V>> mo11334E() {
        return super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Collection mo11335a(@NullableDecl Object obj) {
        return (SortedSet) super.mo11335a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(@NullableDecl Object obj) {
        return get((AbstractSortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: t */
    public Collection mo11338t(Collection collection) {
        return collection instanceof NavigableSet ? Sets.m11893k((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: u */
    public Collection<V> mo11339u(K k2, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(k2, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.WrappedSortedSet(k2, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet<V> mo11336n();

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> mo11337r() {
        SortedSet<V> mo11336n = mo11336n();
        return mo11336n instanceof NavigableSet ? Sets.m11893k((NavigableSet) mo11336n) : Collections.unmodifiableSortedSet(mo11336n);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Set mo11335a(@NullableDecl Object obj) {
        return (SortedSet) super.mo11335a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return get((AbstractSortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public SortedSet<V> mo11335a(@NullableDecl Object obj) {
        return (SortedSet) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public SortedSet<V> get(@NullableDecl K k2) {
        return (SortedSet) super.get((AbstractSortedSetMultimap<K, V>) k2);
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* renamed from: A */
    public SortedMap mo11334E() {
        return (NavigableMap) super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* renamed from: B */
    public SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: E */
    public Map mo11334E() {
        return (NavigableMap) super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        return m11353p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @GwtIncompatible
    public Collection get(@NullableDecl Object obj) {
        return (NavigableSet) super.get((TreeMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: o */
    public Collection<V> mo11352o(@NullableDecl K k2) {
        Objects.requireNonNull(k2);
        return mo11336n();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap
    /* renamed from: y */
    public SortedSet<V> mo11336n() {
        return new TreeSet((Comparator) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @GwtIncompatible
    public Set get(@NullableDecl Object obj) {
        return (NavigableSet) super.get((TreeMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @GwtIncompatible
    public SortedSet get(@NullableDecl Object obj) {
        return (NavigableSet) super.get((TreeMultimap<K, V>) obj);
    }
}

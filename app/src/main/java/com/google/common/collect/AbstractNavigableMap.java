package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    public final class DescendingMap extends Maps.DescendingMap<K, V> {
        public DescendingMap(C16211 c16211) {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: J */
        public Iterator<Map.Entry<K, V>> mo11393J() {
            return AbstractNavigableMap.this.mo11392b();
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: K */
        public NavigableMap<K, V> mo11394K() {
            return AbstractNavigableMap.this;
        }
    }

    /* renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo11392b();

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return tailMap(k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return (K) Maps.m11790g(ceilingEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new DescendingMap(null);
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.m11714i(mo11420a(), null);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> floorEntry(K k2) {
        return headMap(k2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return (K) Maps.m11790g(floorEntry(k2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
        return headMap(k2, false);
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> higherEntry(K k2) {
        return tailMap(k2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return (K) Maps.m11790g(higherEntry(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.m11714i(mo11392b(), null);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lowerEntry(K k2) {
        return headMap(k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return (K) Maps.m11790g(lowerEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.m11716k(mo11420a());
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.m11716k(mo11392b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
        return subMap(k2, true, k3, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
        return tailMap(k2, true);
    }
}

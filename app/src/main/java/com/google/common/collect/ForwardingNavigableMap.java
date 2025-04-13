package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    @Beta
    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: J */
        public Iterator<Map.Entry<K, V>> mo11393J() {
            new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1

                /* renamed from: b */
                public Map.Entry<K, V> f20984b = null;

                {
                    throw null;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return false;
                }

                @Override // java.util.Iterator
                public Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f20984b = null;
                    Objects.requireNonNull(StandardDescendingMap.this);
                    throw null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.m11192p(this.f20984b != null, "no calls to next() since the last call to remove()");
                    Objects.requireNonNull(StandardDescendingMap.this);
                    this.f20984b.getKey();
                    throw null;
                }
            };
            throw null;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: K */
        public NavigableMap<K, V> mo11394K() {
            return null;
        }
    }

    @Beta
    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> mo11329H();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return mo7455G().ceilingEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return mo7455G().ceilingKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return mo7455G().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return mo7455G().descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return mo7455G().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k2) {
        return mo7455G().floorEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return mo7455G().floorKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(K k2, boolean z) {
        return mo7455G().headMap(k2, z);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
        return mo7455G().higherEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return mo7455G().higherKey(k2);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return mo7455G().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k2) {
        return mo7455G().lowerEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return mo7455G().lowerKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return mo7455G().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return mo7455G().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return mo7455G().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        return mo7455G().subMap(k2, z, k3, z2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(K k2, boolean z) {
        return mo7455G().tailMap(k2, z);
    }
}

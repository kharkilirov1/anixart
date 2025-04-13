package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    @Beta
    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap<K, V> mo7455G();

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return mo11329H().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return mo11329H().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
        return mo11329H().headMap(k2);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return mo11329H().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
        return mo11329H().subMap(k2, k3);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
        return mo11329H().tailMap(k2);
    }
}

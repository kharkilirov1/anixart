package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;

@GwtCompatible
/* loaded from: classes.dex */
abstract class ArrayListMultimapGwtSerializationDependencies<K, V> extends AbstractListMultimap<K, V> {
    public ArrayListMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@GwtCompatible
/* loaded from: classes.dex */
public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {

    /* renamed from: h */
    @VisibleForTesting
    public transient int f20857h;

    public ArrayListMultimap() {
        super(new CompactHashMap(12));
        CollectPreconditions.m11427b(3, "expectedValuesPerKey");
        this.f20857h = 3;
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: n */
    public Collection mo11336n() {
        return new ArrayList(this.f20857h);
    }

    @Override // com.google.common.collect.AbstractListMultimap
    /* renamed from: w */
    public List<V> mo11336n() {
        return new ArrayList(this.f20857h);
    }
}

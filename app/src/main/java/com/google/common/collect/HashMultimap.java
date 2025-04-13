package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Set;

@GwtCompatible
/* loaded from: classes.dex */
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {

    /* renamed from: h */
    @VisibleForTesting
    public transient int f21025h;

    public HashMultimap() {
        super(new CompactHashMap(12));
        this.f21025h = 2;
        this.f21025h = 2;
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: n */
    public Collection mo11336n() {
        return new CompactHashSet(this.f21025h);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: w */
    public Set<V> mo11336n() {
        return new CompactHashSet(this.f21025h);
    }
}

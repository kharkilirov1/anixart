package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: classes.dex */
final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection mo11335a(Object obj) {
        return (Set) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection mo11347d() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap
    public Collection get(Object obj) {
        return (Set) super.get((FilteredEntrySetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.FilteredMultimap
    /* renamed from: s */
    public /* bridge */ /* synthetic */ Multimap mo11550s() {
        return null;
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Set<V> mo11335a(Object obj) {
        return (Set) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo11345b() {
        return (Set) super.mo11345b();
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap
    public Set<V> get(K k2) {
        return (Set) super.get((FilteredEntrySetMultimap<K, V>) k2);
    }
}

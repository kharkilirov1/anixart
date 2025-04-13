package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class FilteredKeySetMultimap<K, V> extends FilteredKeyMultimap<K, V> implements FilteredSetMultimap<K, V> {

    public class EntrySet extends FilteredKeyMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public EntrySet(FilteredKeySetMultimap filteredKeySetMultimap) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return Sets.m11884b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m11887e(this);
        }
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection mo11335a(Object obj) {
        return (Set) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection mo11347d() {
        return new EntrySet(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public Collection get(Object obj) {
        return (Set) super.get((FilteredKeySetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    /* renamed from: s */
    public /* bridge */ /* synthetic */ Multimap mo11550s() {
        return null;
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Set<V> mo11335a(Object obj) {
        return (Set) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo11345b() {
        return (Set) super.mo11345b();
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public Set<V> get(K k2) {
        return (Set) super.get((FilteredKeySetMultimap<K, V>) k2);
    }
}

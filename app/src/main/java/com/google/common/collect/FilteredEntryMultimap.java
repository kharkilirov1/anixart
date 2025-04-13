package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public AsMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo11357a() {
            return new Maps.EntrySet<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: e */
                public Map<K, Collection<V>> mo11359e() {
                    return AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                    new AbstractIterator<Map.Entry<K, Collection<V>>>(this) { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl.1
                        {
                            Objects.requireNonNull(FilteredEntryMultimap.this);
                            throw null;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        /* renamed from: a */
                        public Object mo11332a() {
                            throw null;
                        }
                    };
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11201f(collection);
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11203h(Predicates.m11201f(collection));
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.m11719n(iterator());
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set<K> mo11360b() {
            return new Maps.KeySet<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1KeySetImpl
                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@NullableDecl Object obj) {
                    Objects.requireNonNull(FilteredEntryMultimap.this);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11199d(Predicates.m11201f(collection), Maps.EntryFunction.KEY);
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.KEY);
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public Collection<Collection<V>> mo11551c() {
            return new Maps.Values<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean remove(@NullableDecl Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    Objects.requireNonNull(FilteredEntryMultimap.this);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11199d(Predicates.m11201f(collection), Maps.EntryFunction.VALUE);
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    FilteredEntryMultimap filteredEntryMultimap = FilteredEntryMultimap.this;
                    Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.VALUE);
                    Objects.requireNonNull(filteredEntryMultimap);
                    throw null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            Objects.requireNonNull(FilteredEntryMultimap.this);
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(@NullableDecl Object obj) {
            Objects.requireNonNull(FilteredEntryMultimap.this);
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(@NullableDecl Object obj) {
            Objects.requireNonNull(FilteredEntryMultimap.this);
            throw null;
        }
    }

    public class Keys extends Multimaps.Keys<K, V> {
        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
            return new Multisets.EntrySet<K>() { // from class: com.google.common.collect.FilteredEntryMultimap.Keys.1

                /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1$1, reason: invalid class name */
                class AnonymousClass1 implements Predicate<Map.Entry<Object, Collection<Object>>> {

                    /* renamed from: b */
                    public final /* synthetic */ Predicate f20974b;

                    @Override // com.google.common.base.Predicate
                    public boolean apply(Map.Entry<Object, Collection<Object>> entry) {
                        Map.Entry<Object, Collection<Object>> entry2 = entry;
                        return this.f20974b.apply(new Multisets.ImmutableEntry(entry2.getKey(), entry2.getValue().size()));
                    }
                }

                @Override // com.google.common.collect.Multisets.EntrySet
                /* renamed from: e */
                public Multiset<K> mo11391e() {
                    return Keys.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Multiset.Entry<K>> iterator() {
                    Objects.requireNonNull(Keys.this);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    Predicates.m11201f(collection);
                    Objects.requireNonNull(Keys.this);
                    throw null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    Predicates.m11203h(Predicates.m11201f(collection));
                    Objects.requireNonNull(Keys.this);
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    Objects.requireNonNull(Keys.this);
                    throw null;
                }
            };
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        /* renamed from: o */
        public int mo11381o(@NullableDecl Object obj, int i2) {
            CollectPreconditions.m11427b(i2, "occurrences");
            if (i2 == 0) {
                throw null;
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public final class ValuePredicate implements Predicate<V> {

        /* renamed from: b */
        public final /* synthetic */ FilteredEntryMultimap f20975b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl V v) {
            Objects.requireNonNull(this.f20975b);
            throw null;
        }
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection<V> mo11335a(@NullableDecl Object obj) {
        return (Collection) MoreObjects.m11165a(mo11334E().remove(obj), Collections.emptyList());
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        return new AsMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        mo11345b().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return mo11334E().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection<Map.Entry<K, V>> mo11347d() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        return mo11334E().keySet();
    }

    @Override // com.google.common.collect.FilteredMultimap
    /* renamed from: f */
    public Predicate<? super Map.Entry<K, V>> mo11549f() {
        return null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    public Collection<V> mo11349g() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k2) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator<Map.Entry<K, V>> mo11350h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.FilteredMultimap
    /* renamed from: s */
    public Multimap<K, V> mo11550s() {
        return null;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return mo11345b().size();
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Multimaps {

    public static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* renamed from: e */
        @Weak
        public final Multimap<K, V> f21344e;

        public class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            /* renamed from: e */
            public Map<K, Collection<V>> mo11359e() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.m11786c(AsMap.this.f21344e.keySet(), new Function<K, Collection<V>>() { // from class: com.google.common.collect.Multimaps.AsMap.EntrySet.1
                    @Override // com.google.common.base.Function
                    public Object apply(Object obj) {
                        return AsMap.this.f21344e.get(obj);
                    }
                });
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AsMap asMap = AsMap.this;
                asMap.f21344e.keySet().remove(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public AsMap(Multimap<K, V> multimap) {
            this.f21344e = multimap;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo11357a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f21344e.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f21344e.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (this.f21344e.containsKey(obj)) {
                return this.f21344e.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f21344e.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo11362g() {
            return this.f21344e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (this.f21344e.containsKey(obj)) {
                return this.f21344e.mo11335a(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21344e.keySet().size();
        }
    }

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {

        /* renamed from: h */
        public transient Supplier<? extends List<V>> f21347h;

        public CustomListMultimap(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            Objects.requireNonNull(supplier);
            this.f21347h = supplier;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V>> mo11346c() {
            return m11353p();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            return m11354q();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: n */
        public Collection mo11336n() {
            return this.f21347h.get();
        }

        @Override // com.google.common.collect.AbstractListMultimap
        /* renamed from: w */
        public List<V> mo11336n() {
            return this.f21347h.get();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V>> mo11346c() {
            return m11353p();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            return m11354q();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: n */
        public Collection<V> mo11336n() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: t */
        public <E> Collection<E> mo11338t(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.m11893k((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: u */
        public Collection<V> mo11339u(K k2, Collection<V> collection) {
            return collection instanceof List ? m11355v(k2, (List) collection, null) : collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(k2, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(k2, (SortedSet) collection, null) : collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(k2, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(k2, collection, null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V>> mo11346c() {
            return m11353p();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            return m11354q();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: n */
        public Collection mo11336n() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: t */
        public <E> Collection<E> mo11338t(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.m11893k((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: u */
        public Collection<V> mo11339u(K k2, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(k2, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(k2, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(k2, (Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap
        /* renamed from: w */
        public Set<V> mo11336n() {
            throw null;
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V>> mo11346c() {
            return m11353p();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            return m11354q();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: n */
        public Collection mo11336n() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
        /* renamed from: w */
        public Set mo11336n() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap
        /* renamed from: y */
        public SortedSet<V> mo11336n() {
            throw null;
        }
    }

    public static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: b */
        public abstract Multimap<K, V> mo11386b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo11386b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo11386b().mo11385F(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo11386b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo11386b().size();
        }
    }

    public static class Keys<K, V> extends AbstractMultiset<K> {

        /* renamed from: com.google.common.collect.Multimaps$Keys$1 */
        public class C17351 extends TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>> {
            @Override // com.google.common.collect.TransformedIterator
            /* renamed from: a */
            public Object mo11415a(Object obj) {
                final Map.Entry entry = (Map.Entry) obj;
                return new Multisets.AbstractEntry<Object>() { // from class: com.google.common.collect.Multimaps.Keys.1.1
                    @Override // com.google.common.collect.Multiset.Entry
                    /* renamed from: b */
                    public Object mo11547b() {
                        return entry.getKey();
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return ((Collection) entry.getValue()).size();
                    }
                };
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: e */
        public int mo11378e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<K> mo11379f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<K>> mo11380g() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<K> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        /* renamed from: l */
        public Set<K> mo11389l() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        /* renamed from: o */
        public int mo11381o(@NullableDecl Object obj, int i2) {
            CollectPreconditions.m11427b(i2, "occurrences");
            if (i2 == 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(@NullableDecl Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            throw null;
        }
    }

    public static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {

        /* renamed from: com.google.common.collect.Multimaps$MapMultimap$1 */
        public class C17361 extends Sets.ImprovedAbstractSet<V> {

            /* renamed from: b */
            public final /* synthetic */ Object f21349b;

            public C17361(Object obj) {
                this.f21349b = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new Iterator<V>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1

                    /* renamed from: b */
                    public int f21351b;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        if (this.f21351b != 0) {
                            return false;
                        }
                        Objects.requireNonNull(MapMultimap.this);
                        Object obj = C17361.this.f21349b;
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public V next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        this.f21351b++;
                        Objects.requireNonNull(MapMultimap.this);
                        Object obj = C17361.this.f21349b;
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        Preconditions.m11192p(this.f21351b == 1, "no calls to next() since the last call to remove()");
                        this.f21351b = -1;
                        Objects.requireNonNull(MapMultimap.this);
                        Object obj = C17361.this.f21349b;
                        throw null;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Objects.requireNonNull(MapMultimap.this);
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        /* renamed from: F */
        public boolean mo11385F(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Collection mo11335a(Object obj) {
            mo11335a(obj);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        /* renamed from: b */
        public Collection mo11345b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V>> mo11346c() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: d */
        public Collection<Map.Entry<K, V>> mo11347d() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: g */
        public Collection<V> mo11349g() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public Collection get(Object obj) {
            return new C17361(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: h */
        public Iterator<Map.Entry<K, V>> mo11350h() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(K k2, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        /* renamed from: a */
        public Set<V> mo11335a(Object obj) {
            new HashSet(2);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        /* renamed from: b */
        public Set<Map.Entry<K, V>> mo11345b() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public Set<V> get(K k2) {
            return new C17361(k2);
        }
    }

    public static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        public TransformedEntriesListMultimap(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((TransformedEntriesListMultimap<K, V1, V2>) obj);
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<V2> mo11818j(K k2, Collection<V1> collection) {
            Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21354g;
            Objects.requireNonNull(entryTransformer);
            return Lists.m11739f((List) collection, new Maps.C170510(entryTransformer, k2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public List<V2> mo11335a(Object obj) {
            return mo11818j(obj, this.f21353f.mo11335a(obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap
        public List<V2> get(K k2) {
            return mo11818j(k2, this.f21353f.get(k2));
        }
    }

    public static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {

        /* renamed from: f */
        public final Multimap<K, V1> f21353f;

        /* renamed from: g */
        public final Maps.EntryTransformer<? super K, ? super V1, V2> f21354g;

        public TransformedEntriesMultimap(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            Objects.requireNonNull(multimap);
            this.f21353f = multimap;
            Objects.requireNonNull(entryTransformer);
            this.f21354g = entryTransformer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimap
        /* renamed from: a */
        public Collection<V2> mo11335a(Object obj) {
            return mo11818j(obj, this.f21353f.mo11335a(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: c */
        public Map<K, Collection<V2>> mo11346c() {
            return new Maps.TransformedEntriesMap(this.f21353f.mo11334E(), new Maps.EntryTransformer<K, Collection<V1>, Collection<V2>>() { // from class: com.google.common.collect.Multimaps.TransformedEntriesMultimap.1
                @Override // com.google.common.collect.Maps.EntryTransformer
                /* renamed from: a */
                public Object mo11798a(Object obj, Object obj2) {
                    return TransformedEntriesMultimap.this.mo11818j(obj, (Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.f21353f.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.f21353f.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: d */
        public Collection<Map.Entry<K, V2>> mo11347d() {
            return new AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: e */
        public Set<K> mo11348e() {
            return this.f21353f.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: g */
        public Collection<V2> mo11349g() {
            Collection<Map.Entry<K, V1>> mo11345b = this.f21353f.mo11345b();
            final Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21354g;
            Objects.requireNonNull(entryTransformer);
            return new Collections2.TransformedCollection(mo11345b, new Function<Map.Entry<Object, Object>, Object>() { // from class: com.google.common.collect.Maps.11
                public C170611() {
                }

                @Override // com.google.common.base.Function
                public Object apply(Map.Entry<Object, Object> entry) {
                    Map.Entry<Object, Object> entry2 = entry;
                    return EntryTransformer.this.mo11798a(entry2.getKey(), entry2.getValue());
                }
            });
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V2> get(K k2) {
            return mo11818j(k2, this.f21353f.get(k2));
        }

        @Override // com.google.common.collect.AbstractMultimap
        /* renamed from: h */
        public Iterator<Map.Entry<K, V2>> mo11350h() {
            Iterator<Map.Entry<K, V1>> it = this.f21353f.mo11345b().iterator();
            Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21354g;
            Objects.requireNonNull(entryTransformer);
            return new Iterators.C16876(it, new Maps.C170813(entryTransformer));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.f21353f.isEmpty();
        }

        /* renamed from: j */
        public Collection<V2> mo11818j(K k2, Collection<V1> collection) {
            Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21354g;
            Objects.requireNonNull(entryTransformer);
            Maps.C170510 c170510 = new Maps.C170510(entryTransformer, k2);
            return collection instanceof List ? Lists.m11739f((List) collection, c170510) : new Collections2.TransformedCollection(collection, c170510);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(K k2, V2 v2) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.f21353f.size();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Multimap mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Collection mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public List<V> mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public List<V> get(K k2) {
            throw null;
        }
    }

    public static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {

        /* renamed from: com.google.common.collect.Multimaps$UnmodifiableMultimap$1 */
        public class C17381 implements Function<Collection<V>, Collection<V>> {
            @Override // com.google.common.base.Function
            public Object apply(Object obj) {
                return Multimaps.m11816a((Collection) obj);
            }
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: E */
        public Map<K, Collection<V>> mo11334E() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* renamed from: H */
        public Multimap<K, V> mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Collection<V> mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: b */
        public Collection<Map.Entry<K, V>> mo11345b() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> get(K k2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<K> keySet() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(K k2, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> values() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public SetMultimap<K, V> mo7455G() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((UnmodifiableSetMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Set<V> mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: b */
        public Set<Map.Entry<K, V>> mo11345b() {
            return new Maps.UnmodifiableEntrySet(Collections.unmodifiableSet(mo7455G().mo11345b()));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<V> get(K k2) {
            return Collections.unmodifiableSet(mo7455G().get((SetMultimap<K, V>) k2));
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Multimap mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap
        /* renamed from: I */
        public /* bridge */ /* synthetic */ SetMultimap mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Collection mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Set mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public SortedSet<V> mo11335a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public SortedSet<V> get(K k2) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Collection m11816a(Collection collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    /* renamed from: b */
    public static <K, V1, V2> ListMultimap<K, V2> m11817b(ListMultimap<K, V1> listMultimap, Function<? super V1, V2> function) {
        return new TransformedEntriesListMultimap(listMultimap, new Maps.C17169(function));
    }
}

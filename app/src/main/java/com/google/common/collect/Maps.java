package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Maps {

    /* renamed from: com.google.common.collect.Maps$1 */
    class C17041 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        public C17041(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.TransformedIterator
        /* renamed from: a */
        public Object mo11415a(Map.Entry<Object, Object> entry) {
            return entry.getKey();
        }
    }

    /* renamed from: com.google.common.collect.Maps$10 */
    class C170510 implements Function<Object, Object> {

        /* renamed from: b */
        public final /* synthetic */ EntryTransformer f21274b;

        /* renamed from: c */
        public final /* synthetic */ Object f21275c;

        public C170510(EntryTransformer entryTransformer, Object obj) {
            this.f21274b = entryTransformer;
            this.f21275c = obj;
        }

        @Override // com.google.common.base.Function
        public Object apply(@NullableDecl Object obj) {
            return this.f21274b.mo11798a(this.f21275c, obj);
        }
    }

    /* renamed from: com.google.common.collect.Maps$12 */
    class C170712 extends AbstractMapEntry<Object, Object> {

        /* renamed from: b */
        public final /* synthetic */ Map.Entry f21277b;

        /* renamed from: c */
        public final /* synthetic */ EntryTransformer f21278c;

        public C170712(Map.Entry entry, EntryTransformer entryTransformer) {
            this.f21277b = entry;
            this.f21278c = entryTransformer;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Object getKey() {
            return this.f21277b.getKey();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Object getValue() {
            return this.f21278c.mo11798a(this.f21277b.getKey(), this.f21277b.getValue());
        }
    }

    /* renamed from: com.google.common.collect.Maps$13 */
    class C170813 implements Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {

        /* renamed from: b */
        public final /* synthetic */ EntryTransformer f21279b;

        public C170813(EntryTransformer entryTransformer) {
            this.f21279b = entryTransformer;
        }

        @Override // com.google.common.base.Function
        public Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
            Map.Entry<Object, Object> entry2 = entry;
            EntryTransformer entryTransformer = this.f21279b;
            Objects.requireNonNull(entryTransformer);
            Objects.requireNonNull(entry2);
            return new C170712(entry2, entryTransformer);
        }
    }

    /* renamed from: com.google.common.collect.Maps$2 */
    class C17092 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        public C17092(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.TransformedIterator
        /* renamed from: a */
        public Object mo11415a(Map.Entry<Object, Object> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$3 */
    public class C17103<K, V> extends TransformedIterator<K, Map.Entry<K, V>> {

        /* renamed from: c */
        public final /* synthetic */ Function f21280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17103(Iterator it, Function function) {
            super(it);
            this.f21280c = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        /* renamed from: a */
        public Object mo11415a(Object obj) {
            return new ImmutableEntry(obj, this.f21280c.apply(obj));
        }
    }

    /* renamed from: com.google.common.collect.Maps$5 */
    class C17125 extends ForwardingSortedSet<Object> {

        /* renamed from: b */
        public final /* synthetic */ SortedSet f21282b;

        public C17125(SortedSet sortedSet) {
            this.f21282b = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21282b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return this.f21282b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set mo7455G() {
            return this.f21282b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* renamed from: M */
        public SortedSet<Object> mo7455G() {
            return this.f21282b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return new C17125(mo7455G().headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return new C17125(mo7455G().subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return new C17125(mo7455G().tailSet(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$7 */
    public class C17147<K, V> extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        public final /* synthetic */ Map.Entry f21284b;

        public C17147(Map.Entry entry) {
            this.f21284b = entry;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return (K) this.f21284b.getKey();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return (V) this.f21284b.getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$9 */
    class C17169 implements EntryTransformer<Object, Object, Object> {

        /* renamed from: a */
        public final /* synthetic */ Function f21286a;

        public C17169(Function function) {
            this.f21286a = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        /* renamed from: a */
        public Object mo11798a(Object obj, Object obj2) {
            return this.f21286a.apply(obj2);
        }
    }

    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: e */
        public final Map<K, V> f21287e;

        /* renamed from: f */
        public final Predicate<? super Map.Entry<K, V>> f21288f;

        public AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            this.f21287e = map;
            this.f21288f = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public Collection<V> mo11551c() {
            return new FilteredMapValues(this, this.f21287e, this.f21288f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (this.f21287e.containsKey(obj)) {
                if (this.f21288f.apply(new ImmutableEntry(obj, this.f21287e.get(obj)))) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean m11799d(@NullableDecl Object obj, @NullableDecl V v) {
            return this.f21288f.apply(new ImmutableEntry(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v = this.f21287e.get(obj);
            if (v == null || !this.f21288f.apply(new ImmutableEntry(obj, v))) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
            Preconditions.m11178b(this.f21288f.apply(new ImmutableEntry(k2, v)));
            return this.f21287e.put(k2, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.m11178b(m11799d(entry.getKey(), entry.getValue()));
            }
            this.f21287e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f21287e.remove(obj);
            }
            return null;
        }
    }

    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {

        /* renamed from: e */
        public final Set<K> f21289e;

        /* renamed from: f */
        public final Function<? super K, V> f21290f;

        public AsMapView(Set<K> set, Function<? super K, V> function) {
            Objects.requireNonNull(set);
            this.f21289e = set;
            Objects.requireNonNull(function);
            this.f21290f = function;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo11357a() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: e */
                public Map<K, V> mo11359e() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return Maps.m11786c(AsMapView.this.mo11800d(), AsMapView.this.f21290f);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set<K> mo11360b() {
            final Set<K> mo11800d = mo11800d();
            return new ForwardingSet<Object>() { // from class: com.google.common.collect.Maps.4
                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                /* renamed from: G */
                public Object mo7455G() {
                    return mo11800d;
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
                /* renamed from: H */
                public Collection mo11329H() {
                    return mo11800d;
                }

                @Override // com.google.common.collect.ForwardingSet
                /* renamed from: K */
                public Set<Object> mo7455G() {
                    return mo11800d;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
                public boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
                public boolean addAll(Collection<Object> collection) {
                    throw new UnsupportedOperationException();
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public Collection<V> mo11551c() {
            return new Collections2.TransformedCollection(this.f21289e, this.f21290f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            mo11800d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return mo11800d().contains(obj);
        }

        /* renamed from: d */
        public Set<K> mo11800d() {
            return this.f21289e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (Collections2.m11434e(mo11800d(), obj)) {
                return this.f21290f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            if (mo11800d().remove(obj)) {
                return this.f21290f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return mo11800d().size();
        }
    }

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public B mo11126b(A a2) {
            throw null;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof BiMapConverter)) {
                return false;
            }
            Objects.requireNonNull((BiMapConverter) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Maps.asConverter(null)";
        }
    }

    @GwtIncompatible
    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* renamed from: b */
        @NullableDecl
        public transient Comparator<? super K> f21292b;

        /* renamed from: c */
        @NullableDecl
        public transient Set<Map.Entry<K, V>> f21293c;

        /* renamed from: d */
        @NullableDecl
        public transient NavigableSet<K> f21294d;

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return mo11394K();
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: H */
        public final Map<K, V> mo7455G() {
            return mo11394K();
        }

        /* renamed from: J */
        public abstract Iterator<Map.Entry<K, V>> mo11393J();

        /* renamed from: K */
        public abstract NavigableMap<K, V> mo11394K();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            return mo11394K().floorEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return mo11394K().floorKey(k2);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f21292b;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = mo11394K().comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.f21382d;
            }
            Ordering mo11416h = Ordering.m11854a(comparator2).mo11416h();
            this.f21292b = mo11416h;
            return mo11416h;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo11394K().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return mo11394K();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f21293c;
            if (set != null) {
                return set;
            }
            EntrySet<Object, Object> entrySet = new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                /* renamed from: e */
                public Map<Object, Object> mo11359e() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Object, Object>> iterator() {
                    return DescendingMap.this.mo11393J();
                }
            };
            this.f21293c = entrySet;
            return entrySet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return mo11394K().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo11394K().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            return mo11394K().ceilingEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return mo11394K().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            return mo11394K().tailMap(k2, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            return mo11394K().lowerEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return mo11394K().lowerKey(k2);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return mo11394K().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo11394K().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            return mo11394K().higherEntry(k2);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return mo11394K().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f21294d;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f21294d = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return mo11394K().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return mo11394K().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            return mo11394K().subMap(k3, z2, k2, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            return mo11394K().headMap(k2, z).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return Maps.m11794k(this);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Collection<V> values() {
            return new Values(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
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

    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        EntryFunction(C17041 c17041) {
        }
    }

    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo11359e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object m11793j = Maps.m11793j(mo11359e(), key);
            if (com.google.common.base.Objects.m11173a(m11793j, entry.getValue())) {
                return m11793j != null || mo11359e().containsKey(key);
            }
            return false;
        }

        /* renamed from: e */
        public abstract Map<K, V> mo11359e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo11359e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo11359e().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return Sets.m11891i(this, collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.m11892j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet m11889g = Sets.m11889g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        m11889g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo11359e().keySet().retainAll(m11889g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo11359e().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        /* renamed from: a */
        V2 mo11798a(@NullableDecl K k2, @NullableDecl V1 v1);
    }

    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1 */
        class C17191 implements Predicate<Map.Entry<Object, Object>> {
            @Override // com.google.common.base.Predicate
            public boolean apply(Map.Entry<Object, Object> entry) {
                Map.Entry<Object, Object> entry2 = entry;
                entry2.getValue();
                entry2.getKey();
                throw null;
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            throw null;
        }
    }

    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: g */
        public final Set<Map.Entry<K, V>> f21299g;

        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public EntrySet(C17041 c17041) {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* renamed from: G */
            public Object mo7455G() {
                return FilteredEntryMap.this.f21299g;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* renamed from: H */
            public Collection mo11329H() {
                return FilteredEntryMap.this.f21299g;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* renamed from: K */
            public Set<Map.Entry<K, V>> mo7455G() {
                return FilteredEntryMap.this.f21299g;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(FilteredEntryMap.this.f21299g.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    @Override // com.google.common.collect.TransformedIterator
                    /* renamed from: a */
                    public Object mo11415a(Object obj) {
                        final Map.Entry entry = (Map.Entry) obj;
                        return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            /* renamed from: G */
                            public Object mo7455G() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry
                            /* renamed from: H */
                            public Map.Entry<Object, Object> mo7455G() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public Object setValue(Object obj2) {
                                Preconditions.m11178b(FilteredEntryMap.this.m11799d(getKey(), obj2));
                                return mo7455G().setValue(obj2);
                            }
                        };
                    }
                };
            }
        }

        public class KeySet extends KeySet<K, V> {
            public KeySet() {
                super(FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.f21287e.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m11801f(filteredEntryMap.f21287e, filteredEntryMap.f21288f, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.m11802g(filteredEntryMap.f21287e, filteredEntryMap.f21288f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.m11736c(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.m11736c(iterator()).toArray(tArr);
            }
        }

        public FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.f21299g = Sets.m11886d(map.entrySet(), this.f21288f);
        }

        /* renamed from: f */
        public static <K, V> boolean m11801f(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: g */
        public static <K, V> boolean m11802g(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo11357a() {
            return new EntrySet(null);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set<K> mo11360b() {
            return new KeySet();
        }
    }

    @GwtIncompatible
    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: b */
        public final NavigableMap<K, V> f21305b;

        /* renamed from: c */
        public final Predicate<? super Map.Entry<K, V>> f21306c;

        /* renamed from: d */
        public final Map<K, V> f21307d;

        public FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
            Objects.requireNonNull(navigableMap);
            this.f21305b = navigableMap;
            this.f21306c = predicate;
            this.f21307d = new FilteredEntryMap(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo11420a() {
            return Iterators.m11710e(this.f21305b.entrySet().iterator(), this.f21306c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> mo11392b() {
            return Iterators.m11710e(this.f21305b.descendingMap().entrySet().iterator(), this.f21306c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f21307d.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f21305b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f21307d.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.m11789f(this.f21305b.descendingMap(), this.f21306c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f21307d.entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            return this.f21307d.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            return Maps.m11789f(this.f21305b.headMap(k2, z), this.f21306c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.m11697b(this.f21305b.entrySet(), this.f21306c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new NavigableKeySet<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.m11801f(filteredEntryNavigableMap.f21305b, filteredEntryNavigableMap.f21306c, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.m11802g(filteredEntryNavigableMap.f21305b, filteredEntryNavigableMap.f21306c, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.m11702g(this.f21305b.entrySet(), this.f21306c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.m11702g(this.f21305b.descendingMap().entrySet(), this.f21306c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
            return this.f21307d.put(k2, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f21307d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            return this.f21307d.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21307d.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            return Maps.m11789f(this.f21305b.subMap(k2, z, k3, z2), this.f21306c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            return Maps.m11789f(this.f21305b.tailMap(k2, z), this.f21306c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new FilteredMapValues(this, this.f21305b, this.f21306c);
        }
    }

    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return ((SortedMap) FilteredEntrySortedMap.this.f21287e).comparator();
            }

            @Override // java.util.SortedSet
            public K first() {
                return (K) FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k2) {
                return (SortedSet) FilteredEntrySortedMap.this.headMap(k2).keySet();
            }

            @Override // java.util.SortedSet
            public K last() {
                return (K) FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k2, K k3) {
                return (SortedSet) FilteredEntrySortedMap.this.subMap(k2, k3).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k2) {
                return (SortedSet) FilteredEntrySortedMap.this.tailMap(k2).keySet();
            }
        }

        public FilteredEntrySortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set mo11360b() {
            return new SortedKeySet();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return ((SortedMap) this.f21287e).comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return (K) ((SortedSet) super.mo11362g()).iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return new FilteredEntrySortedMap(((SortedMap) this.f21287e).headMap(k2), this.f21288f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set mo11362g() {
            return (SortedSet) super.mo11362g();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            SortedMap<K, V> sortedMap = (SortedMap) this.f21287e;
            while (true) {
                K lastKey = sortedMap.lastKey();
                if (m11799d(lastKey, this.f21287e.get(lastKey))) {
                    return lastKey;
                }
                sortedMap = ((SortedMap) this.f21287e).headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return new FilteredEntrySortedMap(((SortedMap) this.f21287e).subMap(k2, k3), this.f21288f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return new FilteredEntrySortedMap(((SortedMap) this.f21287e).tailMap(k2), this.f21288f);
        }
    }

    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {

        /* renamed from: g */
        public final Predicate<? super K> f21310g;

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo11357a() {
            return Sets.m11886d(this.f21287e.entrySet(), this.f21288f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set<K> mo11360b() {
            return Sets.m11886d(this.f21287e.keySet(), this.f21310g);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f21287e.containsKey(obj) && this.f21310g.apply(obj);
        }
    }

    public static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* renamed from: c */
        public final Map<K, V> f21311c;

        /* renamed from: d */
        public final Predicate<? super Map.Entry<K, V>> f21312d;

        public FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map);
            this.f21311c = map2;
            this.f21312d = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f21311c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f21312d.apply(next) && com.google.common.base.Objects.m11173a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f21311c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f21312d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f21311c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f21312d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.m11736c(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.m11736c(iterator()).toArray(tArr);
        }
    }

    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$IteratorBasedAbstractMap$1 */
        public class C17221 extends EntrySet<K, V> {
            public C17221() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            /* renamed from: e */
            public Map<K, V> mo11359e() {
                return IteratorBasedAbstractMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return IteratorBasedAbstractMap.this.mo11420a();
            }
        }

        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo11420a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.m11707b(mo11420a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new C17221();
        }
    }

    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {

        /* renamed from: b */
        @Weak
        public final Map<K, V> f21314b;

        public KeySet(Map<K, V> map) {
            Objects.requireNonNull(map);
            this.f21314b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo11803e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo11803e().containsKey(obj);
        }

        /* renamed from: e */
        public Map<K, V> mo11803e() {
            return this.f21314b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo11803e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C17041(mo11803e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo11803e().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo11803e().size();
        }
    }

    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        @Override // com.google.common.collect.MapDifference
        /* renamed from: a */
        public Map<K, V> mo11740a() {
            return null;
        }

        @Override // com.google.common.collect.MapDifference
        /* renamed from: b */
        public Map<K, MapDifference.ValueDifference<V>> mo11741b() {
            return null;
        }

        @Override // com.google.common.collect.MapDifference
        /* renamed from: c */
        public Map<K, V> mo11742c() {
            return null;
        }

        @Override // com.google.common.collect.MapDifference
        /* renamed from: d */
        public Map<K, V> mo11743d() {
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            return mo11740a().equals(mapDifference.mo11740a()) && mo11742c().equals(mapDifference.mo11742c()) && mo11743d().equals(mapDifference.mo11743d()) && mo11741b().equals(mapDifference.mo11741b());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{mo11740a(), mo11742c(), mo11743d(), mo11741b()});
        }

        public String toString() {
            throw null;
        }
    }

    @GwtIncompatible
    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: b */
        public final NavigableSet<K> f21315b;

        /* renamed from: c */
        public final Function<? super K, V> f21316c;

        public NavigableAsMapView(NavigableSet<K> navigableSet, Function<? super K, V> function) {
            Objects.requireNonNull(navigableSet);
            this.f21315b = navigableSet;
            Objects.requireNonNull(function);
            this.f21316c = function;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo11420a() {
            return Maps.m11786c(this.f21315b, this.f21316c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        public Iterator<Map.Entry<K, V>> mo11392b() {
            return new IteratorBasedAbstractMap.C17221().iterator();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f21315b.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f21315b.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return new NavigableAsMapView(this.f21315b.descendingSet(), this.f21316c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            if (Collections2.m11434e(this.f21315b, obj)) {
                return this.f21316c.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            return new NavigableAsMapView(this.f21315b.headSet(k2, z), this.f21316c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new C17136(this.f21315b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21315b.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            return new NavigableAsMapView(this.f21315b.subSet(k2, z, k3, z2), this.f21316c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            return new NavigableAsMapView(this.f21315b.tailSet(k2, z), this.f21316c);
        }
    }

    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        public SortedAsMapView(SortedSet<K> sortedSet, Function<? super K, V> function) {
            super(sortedSet, function);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return ((SortedSet) this.f21289e).comparator();
        }

        @Override // com.google.common.collect.Maps.AsMapView
        /* renamed from: d */
        public Set mo11800d() {
            return (SortedSet) this.f21289e;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return (K) ((SortedSet) this.f21289e).first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return new SortedAsMapView(((SortedSet) this.f21289e).headSet(k2), this.f21290f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo11362g() {
            return new C17125((SortedSet) this.f21289e);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return (K) ((SortedSet) this.f21289e).last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return new SortedAsMapView(((SortedSet) this.f21289e).subSet(k2, k3), this.f21290f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return new SortedAsMapView(((SortedSet) this.f21289e).tailSet(k2), this.f21290f);
        }
    }

    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        public SortedKeySet(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo11803e().comparator();
        }

        @Override // com.google.common.collect.Maps.KeySet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> mo11803e() {
            return (SortedMap) this.f21314b;
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo11803e().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new SortedKeySet(mo11803e().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo11803e().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new SortedKeySet(mo11803e().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new SortedKeySet(mo11803e().tailMap(k2));
        }
    }

    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo11740a() {
            return null;
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Map mo11741b() {
            return null;
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Map mo11742c() {
            return null;
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Map mo11743d() {
            return null;
        }
    }

    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* renamed from: b */
        public final Map<K, V1> f21317b;

        /* renamed from: c */
        public final EntryTransformer<? super K, ? super V1, V2> f21318c;

        public TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            Objects.requireNonNull(map);
            this.f21317b = map;
            Objects.requireNonNull(entryTransformer);
            this.f21318c = entryTransformer;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo11420a() {
            Iterator<Map.Entry<K, V1>> it = this.f21317b.entrySet().iterator();
            EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21318c;
            Objects.requireNonNull(entryTransformer);
            return new Iterators.C16876(it, new C170813(entryTransformer));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f21317b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f21317b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f21317b.get(obj);
            if (v1 != null || this.f21317b.containsKey(obj)) {
                return this.f21318c.mo11798a(obj, v1);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f21317b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f21317b.containsKey(obj)) {
                return this.f21318c.mo11798a(obj, this.f21317b.remove(obj));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21317b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new Values(this);
        }
    }

    @GwtIncompatible
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        public TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> mo11805b() {
            return (NavigableMap) ((SortedMap) this.f21317b);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k2) {
            return m11807d(mo11805b().ceilingEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return mo11805b().ceilingKey(k2);
        }

        @NullableDecl
        /* renamed from: d */
        public final Map.Entry<K, V2> m11807d(@NullableDecl Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            EntryTransformer<? super K, ? super V1, V2> entryTransformer = this.f21318c;
            Objects.requireNonNull(entryTransformer);
            return new C170712(entry, entryTransformer);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return mo11805b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return new TransformedEntriesNavigableMap(mo11805b().descendingMap(), this.f21318c);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return m11807d(mo11805b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k2) {
            return m11807d(mo11805b().floorEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return mo11805b().floorKey(k2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k2) {
            return m11807d(mo11805b().higherEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return mo11805b().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return m11807d(mo11805b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k2) {
            return m11807d(mo11805b().lowerEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return mo11805b().lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo11805b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return m11807d(mo11805b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return m11807d(mo11805b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k2, boolean z, K k3, boolean z2) {
            return new TransformedEntriesNavigableMap(mo11805b().subMap(k2, z, k3, z2), this.f21318c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k2, boolean z) {
            return new TransformedEntriesNavigableMap(mo11805b().headMap(k2, z), this.f21318c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k2, boolean z) {
            return new TransformedEntriesNavigableMap(mo11805b().tailMap(k2, z), this.f21318c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        /* renamed from: b */
        public SortedMap<K, V1> mo11805b() {
            return (SortedMap) this.f21317b;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo11805b().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo11805b().firstKey();
        }

        public SortedMap<K, V2> headMap(K k2) {
            return new TransformedEntriesSortedMap(mo11805b().headMap(k2), this.f21318c);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo11805b().lastKey();
        }

        public SortedMap<K, V2> subMap(K k2, K k3) {
            return new TransformedEntriesSortedMap(mo11805b().subMap(k2, k3), this.f21318c);
        }

        public SortedMap<K, V2> tailMap(K k2) {
            return new TransformedEntriesSortedMap(mo11805b().tailMap(k2), this.f21318c);
        }
    }

    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

        /* renamed from: b */
        public final Map<K, V> f21319b;

        /* renamed from: c */
        public final BiMap<? extends K, ? extends V> f21320c;

        /* renamed from: d */
        @NullableDecl
        public transient Set<V> f21321d;

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21319b;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: H */
        public Map<K, V> mo7455G() {
            return this.f21319b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<V> values() {
            Set<V> set = this.f21321d;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.f21320c.values());
            this.f21321d = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Collection<Map.Entry<K, V>> f21322b;

        public UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
            this.f21322b = collection;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21322b;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection<Map.Entry<K, V>> mo11329H() {
            return this.f21322b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            final Iterator<Map.Entry<K, V>> it = this.f21322b.iterator();
            return new UnmodifiableIterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.Maps.8
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    return Maps.m11796m((Map.Entry) it.next());
                }
            };
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ObjectArrays.m11830d(this, tArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m11559I();
        }
    }

    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        public UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
            super(set);
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

    @GwtIncompatible
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: b */
        public final NavigableMap<K, ? extends V> f21323b;

        /* renamed from: c */
        @NullableDecl
        public transient UnmodifiableNavigableMap<K, V> f21324c;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.f21323b = navigableMap;
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap
        /* renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedMap<K, V> mo7455G() {
            return Collections.unmodifiableSortedMap(this.f21323b);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            return Maps.m11784a(this.f21323b.ceilingEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return this.f21323b.ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.m11893k(this.f21323b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.f21324c;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.f21323b.descendingMap(), this);
            this.f21324c = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.m11784a(this.f21323b.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            return Maps.m11784a(this.f21323b.floorEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return this.f21323b.floorKey(k2);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            return Maps.m11784a(this.f21323b.higherEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return this.f21323b.higherKey(k2);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.m11784a(this.f21323b.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            return Maps.m11784a(this.f21323b.lowerEntry(k2));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return this.f21323b.lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.m11893k(this.f21323b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            return Maps.m11797n(this.f21323b.headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            return Maps.m11797n(this.f21323b.subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            return Maps.m11797n(this.f21323b.tailMap(k2, z));
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.f21323b = navigableMap;
            this.f21324c = unmodifiableNavigableMap;
        }
    }

    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        @Override // com.google.common.collect.MapDifference.ValueDifference
        /* renamed from: a */
        public V mo11744a() {
            return null;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        /* renamed from: b */
        public V mo11745b() {
            return null;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            return com.google.common.base.Objects.m11173a(null, valueDifference.mo11745b()) && com.google.common.base.Objects.m11173a(null, valueDifference.mo11744a());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public String toString() {
            return "(null, null)";
        }
    }

    public static class Values<K, V> extends AbstractCollection<V> {

        /* renamed from: b */
        @Weak
        public final Map<K, V> f21325b;

        public Values(Map<K, V> map) {
            Objects.requireNonNull(map);
            this.f21325b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f21325b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.f21325b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f21325b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C17092(this.f21325b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f21325b.entrySet()) {
                    if (com.google.common.base.Objects.m11173a(obj, entry.getValue())) {
                        this.f21325b.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f21325b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f21325b.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f21325b.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f21325b.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f21325b.size();
        }
    }

    @GwtCompatible
    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: b */
        @NullableDecl
        public transient Set<Map.Entry<K, V>> f21326b;

        /* renamed from: c */
        @NullableDecl
        public transient Set<K> f21327c;

        /* renamed from: d */
        @NullableDecl
        public transient Collection<V> f21328d;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo11357a();

        /* renamed from: b */
        public Set<K> mo11360b() {
            return new KeySet(this);
        }

        /* renamed from: c */
        public Collection<V> mo11551c() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f21326b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> mo11357a = mo11357a();
            this.f21326b = mo11357a;
            return mo11357a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo11362g() {
            Set<K> set = this.f21327c;
            if (set != null) {
                return set;
            }
            Set<K> mo11360b = mo11360b();
            this.f21327c = mo11360b;
            return mo11360b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f21328d;
            if (collection != null) {
                return collection;
            }
            Collection<V> mo11551c = mo11551c();
            this.f21328d = mo11551c;
            return mo11551c;
        }
    }

    /* renamed from: a */
    public static Map.Entry m11784a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new C17147(entry);
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m11785b(Set<K> set, Function<? super K, V> function) {
        return new AsMapView(set, function);
    }

    /* renamed from: c */
    public static <K, V> Iterator<Map.Entry<K, V>> m11786c(Set<K> set, Function<? super K, V> function) {
        return new C17103(set.iterator(), function);
    }

    /* renamed from: d */
    public static int m11787d(int i2) {
        if (i2 < 3) {
            CollectPreconditions.m11427b(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public static boolean m11788e(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @GwtIncompatible
    /* renamed from: f */
    public static <K, V> NavigableMap<K, V> m11789f(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Objects.requireNonNull(predicate);
        if (!(navigableMap instanceof FilteredEntryNavigableMap)) {
            Objects.requireNonNull(navigableMap);
            return new FilteredEntryNavigableMap(navigableMap, predicate);
        }
        FilteredEntryNavigableMap filteredEntryNavigableMap = (FilteredEntryNavigableMap) navigableMap;
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.f21305b, Predicates.m11198c(filteredEntryNavigableMap.f21306c, predicate));
    }

    @NullableDecl
    /* renamed from: g */
    public static <K> K m11790g(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: h */
    public static <K> Predicate<Map.Entry<K, ?>> m11791h(Predicate<? super K> predicate) {
        Predicates.m11199d(null, EntryFunction.KEY);
        throw null;
    }

    /* renamed from: i */
    public static boolean m11792i(Map<?, ?> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static <V> V m11793j(Map<?, V> map, @NullableDecl Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m11794k(Map<?, ?> map) {
        StringBuilder m11433d = Collections2.m11433d(map.size());
        m11433d.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                m11433d.append(", ");
            }
            z = false;
            m11433d.append(entry.getKey());
            m11433d.append('=');
            m11433d.append(entry.getValue());
        }
        m11433d.append('}');
        return m11433d.toString();
    }

    /* renamed from: l */
    public static <K, V1, V2> Map<K, V2> m11795l(Map<K, V1> map, Function<? super V1, V2> function) {
        Objects.requireNonNull(function);
        return new TransformedEntriesMap(map, new C17169(function));
    }

    /* renamed from: m */
    public static <K, V> Map.Entry<K, V> m11796m(Map.Entry<? extends K, ? extends V> entry) {
        Objects.requireNonNull(entry);
        return new C17147(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    /* renamed from: n */
    public static <K, V> NavigableMap<K, V> m11797n(NavigableMap<K, ? extends V> navigableMap) {
        Objects.requireNonNull(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    /* renamed from: com.google.common.collect.Maps$6 */
    class C17136 extends ForwardingNavigableSet<Object> {

        /* renamed from: b */
        public final /* synthetic */ NavigableSet f21283b;

        public C17136(NavigableSet navigableSet) {
            this.f21283b = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21283b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return this.f21283b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set mo7455G() {
            return this.f21283b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* renamed from: M */
        public SortedSet mo7455G() {
            return this.f21283b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* renamed from: O */
        public NavigableSet<Object> mo11329H() {
            return this.f21283b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return new C17136(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return new C17125(mo7455G().headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return new C17125(mo7455G().subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return new C17125(mo7455G().tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z) {
            return new C17136(mo11329H().headSet(obj, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new C17136(mo11329H().subSet(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z) {
            return new C17136(mo11329H().tailSet(obj, z));
        }
    }

    @GwtIncompatible
    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return (K) ((NavigableMap) this.f21314b).ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return ((NavigableMap) this.f21314b).descendingKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        /* renamed from: e */
        public Map mo11803e() {
            return (NavigableMap) this.f21314b;
        }

        @Override // com.google.common.collect.Maps.SortedKeySet
        /* renamed from: f */
        public SortedMap mo11803e() {
            return (NavigableMap) this.f21314b;
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return (K) ((NavigableMap) this.f21314b).floorKey(k2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return ((NavigableMap) this.f21314b).headMap(k2, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return (K) ((NavigableMap) this.f21314b).higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return (K) ((NavigableMap) this.f21314b).lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.m11790g(((NavigableMap) this.f21314b).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.m11790g(((NavigableMap) this.f21314b).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return ((NavigableMap) this.f21314b).subMap(k2, z, k3, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return ((NavigableMap) this.f21314b).tailMap(k2, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }
    }
}

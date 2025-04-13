package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {

    /* renamed from: f */
    public transient Map<K, Collection<V>> f20795f;

    /* renamed from: g */
    public transient int f20796g;

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* renamed from: e */
        public final transient Map<K, Collection<V>> f20797e;

        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.m11434e(AsMap.this.f20797e.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.EntrySet
            /* renamed from: e */
            public Map<K, Collection<V>> mo11359e() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = abstractMapBasedMultimap.f20795f;
                Objects.requireNonNull(map);
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                abstractMapBasedMultimap.f20796g -= size;
                return true;
            }
        }

        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, Collection<V>>> f20800b;

            /* renamed from: c */
            @NullableDecl
            public Collection<V> f20801c;

            public AsMapIterator() {
                this.f20800b = AsMap.this.f20797e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20800b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, Collection<V>> next = this.f20800b.next();
                this.f20801c = next.getValue();
                return AsMap.this.m11358d(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.m11192p(this.f20801c != null, "no calls to next() since the last call to remove()");
                this.f20800b.remove();
                AbstractMapBasedMultimap.m11344m(AbstractMapBasedMultimap.this, this.f20801c.size());
                this.f20801c.clear();
                this.f20801c = null;
            }
        }

        public AsMap(Map<K, Collection<V>> map) {
            this.f20797e = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo11357a() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<K, Collection<V>> map = this.f20797e;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (map == abstractMapBasedMultimap.f20795f) {
                abstractMapBasedMultimap.clear();
            } else {
                Iterators.m11707b(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m11792i(this.f20797e, obj);
        }

        /* renamed from: d */
        public Map.Entry<K, Collection<V>> m11358d(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.mo11339u(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f20797e.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Collection<V> collection = (Collection) Maps.m11793j(this.f20797e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.mo11339u(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f20797e.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo11362g() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            Collection<V> remove = this.f20797e.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo11336n = AbstractMapBasedMultimap.this.mo11336n();
            mo11336n.addAll(remove);
            AbstractMapBasedMultimap.m11344m(AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return mo11336n;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f20797e.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f20797e.toString();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        public final Iterator<Map.Entry<K, Collection<V>>> f20803b;

        /* renamed from: c */
        @NullableDecl
        public K f20804c = null;

        /* renamed from: d */
        @NullableDecl
        public Collection<V> f20805d = null;

        /* renamed from: e */
        public Iterator<V> f20806e = Iterators.EmptyModifiableIterator.INSTANCE;

        public Itr() {
            this.f20803b = AbstractMapBasedMultimap.this.f20795f.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo11356a(K k2, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20803b.hasNext() || this.f20806e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f20806e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f20803b.next();
                this.f20804c = next.getKey();
                Collection<V> value = next.getValue();
                this.f20805d = value;
                this.f20806e = value.iterator();
            }
            return mo11356a(this.f20804c, this.f20806e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f20806e.remove();
            if (this.f20805d.isEmpty()) {
                this.f20803b.remove();
            }
            AbstractMapBasedMultimap.m11342k(AbstractMapBasedMultimap.this);
        }
    }

    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public KeySet(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.m11707b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f21314b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f21314b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f21314b.keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, V>> it = this.f21314b.entrySet().iterator();
            return new Iterator<K>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1

                /* renamed from: b */
                @NullableDecl
                public Map.Entry<K, Collection<V>> f20809b;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f20809b = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.m11192p(this.f20809b != null, "no calls to next() since the last call to remove()");
                    Collection<V> value = this.f20809b.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.m11344m(AbstractMapBasedMultimap.this, value.size());
                    value.clear();
                    this.f20809b = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i2;
            Collection collection = (Collection) this.f21314b.remove(obj);
            if (collection != null) {
                i2 = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.m11344m(AbstractMapBasedMultimap.this, i2);
            } else {
                i2 = 0;
            }
            return i2 > 0;
        }
    }

    public class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public NavigableAsMap(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set mo11360b() {
            return new NavigableKeySet(mo11363h());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo11363h().ceilingEntry(k2);
            if (ceilingEntry == null) {
                return null;
            }
            return m11358d(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return mo11363h().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new NavigableAsMap(mo11363h().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: f */
        public SortedSet mo11360b() {
            return new NavigableKeySet(mo11363h());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo11363h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m11358d(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> floorEntry = mo11363h().floorEntry(k2);
            if (floorEntry == null) {
                return null;
            }
            return m11358d(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return mo11363h().floorKey(k2);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> higherEntry = mo11363h().higherEntry(k2);
            if (higherEntry == null) {
                return null;
            }
            return m11358d(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return mo11363h().higherKey(k2);
        }

        /* renamed from: i */
        public Map.Entry<K, Collection<V>> m11364i(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo11336n = AbstractMapBasedMultimap.this.mo11336n();
            mo11336n.addAll(next.getValue());
            it.remove();
            return new ImmutableEntry(next.getKey(), AbstractMapBasedMultimap.this.mo11338t(mo11336n));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo11363h() {
            return (NavigableMap) ((SortedMap) this.f20797e);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo11362g() {
            SortedSet<K> sortedSet = this.f20814g;
            if (sortedSet == null) {
                sortedSet = mo11360b();
                this.f20814g = sortedSet;
            }
            return (NavigableSet) sortedSet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo11363h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m11358d(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> lowerEntry = mo11363h().lowerEntry(k2);
            if (lowerEntry == null) {
                return null;
            }
            return m11358d(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return mo11363h().lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo11362g();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m11364i(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m11364i(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new NavigableAsMap(mo11363h().headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new NavigableAsMap(mo11363h().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new NavigableAsMap(mo11363h().tailMap(k2, z));
        }
    }

    public class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return mo11366f().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new NavigableKeySet(mo11366f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return mo11366f().floorKey(k2);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo11366f() {
            return (NavigableMap) ((SortedMap) this.f21314b);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return mo11366f().higherKey(k2);
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return mo11366f().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.m11716k(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.m11716k(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return new NavigableKeySet(mo11366f().headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new NavigableKeySet(mo11366f().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return new NavigableKeySet(mo11366f().tailMap(k2, z));
        }
    }

    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        public RandomAccessWrappedList(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k2, list, wrappedCollection);
        }
    }

    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {

        /* renamed from: g */
        @NullableDecl
        public SortedSet<K> f20814g;

        public SortedAsMap(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo11363h().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> mo11360b() {
            return new SortedKeySet(mo11363h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo11363h().firstKey();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> mo11362g() {
            SortedSet<K> sortedSet = this.f20814g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> mo11360b = mo11360b();
            this.f20814g = mo11360b;
            return mo11360b;
        }

        /* renamed from: h */
        public SortedMap<K, Collection<V>> mo11363h() {
            return (SortedMap) this.f20797e;
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new SortedAsMap(mo11363h().headMap(k2));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo11363h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new SortedAsMap(mo11363h().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new SortedAsMap(mo11363h().tailMap(k2));
        }
    }

    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public SortedKeySet(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo11366f().comparator();
        }

        /* renamed from: f */
        public SortedMap<K, Collection<V>> mo11366f() {
            return (SortedMap) this.f21314b;
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo11366f().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new SortedKeySet(mo11366f().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo11366f().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new SortedKeySet(mo11366f().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new SortedKeySet(mo11366f().tailMap(k2));
        }
    }

    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public WrappedNavigableSet(@NullableDecl K k2, NavigableSet<V> navigableSet, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k2, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
            return mo11373f().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new WrappedCollection.WrappedIterator(mo11373f().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m11375r(mo11373f().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
            return mo11373f().floor(v);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> mo11373f() {
            return (NavigableSet) ((SortedSet) this.f20818c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
            return m11375r(mo11373f().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
            return mo11373f().higher(v);
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
            return mo11373f().lower(v);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.m11716k(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.m11716k(descendingIterator());
        }

        /* renamed from: r */
        public final NavigableSet<V> m11375r(NavigableSet<V> navigableSet) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k2 = this.f20817b;
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedNavigableSet(k2, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return m11375r(mo11373f().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
            return m11375r(mo11373f().tailSet(v, z));
        }
    }

    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public WrappedSet(@NullableDecl K k2, Set<V> set) {
            super(k2, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m11891i = Sets.m11891i((Set) this.f20818c, collection);
            if (m11891i) {
                AbstractMapBasedMultimap.m11343l(AbstractMapBasedMultimap.this, this.f20818c.size() - size);
                m11370e();
            }
            return m11891i;
        }
    }

    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public WrappedSortedSet(@NullableDecl K k2, SortedSet<V> sortedSet, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k2, sortedSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo11373f().comparator();
        }

        /* renamed from: f */
        public SortedSet<V> mo11373f() {
            return (SortedSet) this.f20818c;
        }

        @Override // java.util.SortedSet
        public V first() {
            m11369d();
            return mo11373f().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
            m11369d();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k2 = this.f20817b;
            SortedSet<V> headSet = mo11373f().headSet(v);
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k2, headSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public V last() {
            m11369d();
            return mo11373f().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
            m11369d();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k2 = this.f20817b;
            SortedSet<V> subSet = mo11373f().subSet(v, v2);
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k2, subSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
            m11369d();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k2 = this.f20817b;
            SortedSet<V> tailSet = mo11373f().tailSet(v);
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(k2, tailSet, wrappedCollection);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        Preconditions.m11178b(map.isEmpty());
        this.f20795f = map;
    }

    /* renamed from: j */
    public static /* synthetic */ int m11341j(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f20796g;
        abstractMapBasedMultimap.f20796g = i2 + 1;
        return i2;
    }

    /* renamed from: k */
    public static /* synthetic */ int m11342k(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.f20796g;
        abstractMapBasedMultimap.f20796g = i2 - 1;
        return i2;
    }

    /* renamed from: l */
    public static /* synthetic */ int m11343l(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.f20796g + i2;
        abstractMapBasedMultimap.f20796g = i3;
        return i3;
    }

    /* renamed from: m */
    public static /* synthetic */ int m11344m(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.f20796g - i2;
        abstractMapBasedMultimap.f20796g = i3;
        return i3;
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection<V> mo11335a(@NullableDecl Object obj) {
        Collection<V> remove = this.f20795f.remove(obj);
        if (remove == null) {
            return mo11337r();
        }
        Collection mo11336n = mo11336n();
        mo11336n.addAll(remove);
        this.f20796g -= remove.size();
        remove.clear();
        return (Collection<V>) mo11338t(mo11336n);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo11345b() {
        return super.mo11345b();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        return new AsMap(this.f20795f);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<Collection<V>> it = this.f20795f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f20795f.clear();
        this.f20796g = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f20795f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection<Map.Entry<K, V>> mo11347d() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet(this) : new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        return new KeySet(this.f20795f);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    public Collection<V> mo11349g() {
        return new AbstractMultimap.Values();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(@NullableDecl K k2) {
        Collection<V> collection = this.f20795f.get(k2);
        if (collection == null) {
            collection = mo11352o(k2);
        }
        return mo11339u(k2, collection);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator<Map.Entry<K, V>> mo11350h() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* renamed from: a */
            public Object mo11356a(Object obj, Object obj2) {
                return new ImmutableEntry(obj, obj2);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: i */
    public Iterator<V> mo11351i() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* renamed from: a */
            public V mo11356a(K k2, V v) {
                return v;
            }
        };
    }

    /* renamed from: n */
    public abstract Collection<V> mo11336n();

    /* renamed from: o */
    public Collection<V> mo11352o(@NullableDecl K k2) {
        return mo11336n();
    }

    /* renamed from: p */
    public final Map<K, Collection<V>> m11353p() {
        Map<K, Collection<V>> map = this.f20795f;
        return map instanceof NavigableMap ? new NavigableAsMap((NavigableMap) this.f20795f) : map instanceof SortedMap ? new SortedAsMap((SortedMap) this.f20795f) : new AsMap(this.f20795f);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        Collection<V> collection = this.f20795f.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f20796g++;
            return true;
        }
        Collection<V> mo11352o = mo11352o(k2);
        if (!mo11352o.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f20796g++;
        this.f20795f.put(k2, mo11352o);
        return true;
    }

    /* renamed from: q */
    public final Set<K> m11354q() {
        Map<K, Collection<V>> map = this.f20795f;
        return map instanceof NavigableMap ? new NavigableKeySet((NavigableMap) this.f20795f) : map instanceof SortedMap ? new SortedKeySet((SortedMap) this.f20795f) : new KeySet(this.f20795f);
    }

    /* renamed from: r */
    public Collection<V> mo11337r() {
        return (Collection<V>) mo11338t(mo11336n());
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f20796g;
    }

    /* renamed from: t */
    public <E> Collection<E> mo11338t(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: u */
    public Collection<V> mo11339u(@NullableDecl K k2, Collection<V> collection) {
        return new WrappedCollection(k2, collection, null);
    }

    /* renamed from: v */
    public final List<V> m11355v(@NullableDecl K k2, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(this, k2, list, wrappedCollection) : new WrappedList(k2, list, wrappedCollection);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            public WrappedListIterator() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = WrappedList.this.isEmpty();
                m11372b().add(v);
                AbstractMapBasedMultimap.m11341j(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.m11368b();
                }
            }

            /* renamed from: b */
            public final ListIterator<V> m11372b() {
                m11371a();
                return (ListIterator) this.f20822b;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m11372b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m11372b().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m11372b().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m11372b().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                m11372b().set(v);
            }

            public WrappedListIterator(int i2) {
                super(((List) WrappedList.this.f20818c).listIterator(i2));
            }
        }

        public WrappedList(@NullableDecl K k2, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k2, list, wrappedCollection);
        }

        @Override // java.util.List
        public void add(int i2, V v) {
            m11369d();
            boolean isEmpty = this.f20818c.isEmpty();
            ((List) this.f20818c).add(i2, v);
            AbstractMapBasedMultimap.m11341j(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                m11368b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f20818c).addAll(i2, collection);
            if (addAll) {
                AbstractMapBasedMultimap.m11343l(AbstractMapBasedMultimap.this, this.f20818c.size() - size);
                if (size == 0) {
                    m11368b();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i2) {
            m11369d();
            return (V) ((List) this.f20818c).get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m11369d();
            return ((List) this.f20818c).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m11369d();
            return ((List) this.f20818c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m11369d();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        public V remove(int i2) {
            m11369d();
            V v = (V) ((List) this.f20818c).remove(i2);
            AbstractMapBasedMultimap.m11342k(AbstractMapBasedMultimap.this);
            m11370e();
            return v;
        }

        @Override // java.util.List
        public V set(int i2, V v) {
            m11369d();
            return (V) ((List) this.f20818c).set(i2, v);
        }

        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
            m11369d();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k2 = this.f20817b;
            List<V> subList = ((List) this.f20818c).subList(i2, i3);
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return abstractMapBasedMultimap.m11355v(k2, subList, wrappedCollection);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
            m11369d();
            return new WrappedListIterator(i2);
        }
    }

    public class WrappedCollection extends AbstractCollection<V> {

        /* renamed from: b */
        @NullableDecl
        public final K f20817b;

        /* renamed from: c */
        public Collection<V> f20818c;

        /* renamed from: d */
        @NullableDecl
        public final AbstractMapBasedMultimap<K, V>.WrappedCollection f20819d;

        /* renamed from: e */
        @NullableDecl
        public final Collection<V> f20820e;

        public WrappedCollection(@NullableDecl K k2, Collection<V> collection, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            this.f20817b = k2;
            this.f20818c = collection;
            this.f20819d = wrappedCollection;
            this.f20820e = wrappedCollection == null ? null : wrappedCollection.f20818c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            m11369d();
            boolean isEmpty = this.f20818c.isEmpty();
            boolean add = this.f20818c.add(v);
            if (add) {
                AbstractMapBasedMultimap.m11341j(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    m11368b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f20818c.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.m11343l(AbstractMapBasedMultimap.this, this.f20818c.size() - size);
                if (size == 0) {
                    m11368b();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public void m11368b() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection != null) {
                wrappedCollection.m11368b();
            } else {
                AbstractMapBasedMultimap.this.f20795f.put(this.f20817b, this.f20818c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f20818c.clear();
            AbstractMapBasedMultimap.m11344m(AbstractMapBasedMultimap.this, size);
            m11370e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m11369d();
            return this.f20818c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m11369d();
            return this.f20818c.containsAll(collection);
        }

        /* renamed from: d */
        public void m11369d() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection != null) {
                wrappedCollection.m11369d();
                if (this.f20819d.f20818c != this.f20820e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f20818c.isEmpty() || (collection = AbstractMapBasedMultimap.this.f20795f.get(this.f20817b)) == null) {
                    return;
                }
                this.f20818c = collection;
            }
        }

        /* renamed from: e */
        public void m11370e() {
            AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.f20819d;
            if (wrappedCollection != null) {
                wrappedCollection.m11370e();
            } else if (this.f20818c.isEmpty()) {
                AbstractMapBasedMultimap.this.f20795f.remove(this.f20817b);
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m11369d();
            return this.f20818c.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            m11369d();
            return this.f20818c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m11369d();
            return new WrappedIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m11369d();
            boolean remove = this.f20818c.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.m11342k(AbstractMapBasedMultimap.this);
                m11370e();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f20818c.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.m11343l(AbstractMapBasedMultimap.this, this.f20818c.size() - size);
                m11370e();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean retainAll = this.f20818c.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.m11343l(AbstractMapBasedMultimap.this, this.f20818c.size() - size);
                m11370e();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m11369d();
            return this.f20818c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m11369d();
            return this.f20818c.toString();
        }

        public class WrappedIterator implements Iterator<V> {

            /* renamed from: b */
            public final Iterator<V> f20822b;

            /* renamed from: c */
            public final Collection<V> f20823c;

            public WrappedIterator() {
                Collection<V> collection = WrappedCollection.this.f20818c;
                this.f20823c = collection;
                this.f20822b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            /* renamed from: a */
            public void m11371a() {
                WrappedCollection.this.m11369d();
                if (WrappedCollection.this.f20818c != this.f20823c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m11371a();
                return this.f20822b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m11371a();
                return this.f20822b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f20822b.remove();
                AbstractMapBasedMultimap.m11342k(AbstractMapBasedMultimap.this);
                WrappedCollection.this.m11370e();
            }

            public WrappedIterator(Iterator<V> it) {
                this.f20823c = WrappedCollection.this.f20818c;
                this.f20822b = it;
            }
        }
    }
}

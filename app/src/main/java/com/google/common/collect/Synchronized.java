package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class Synchronized {

    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {

        /* renamed from: g */
        @NullableDecl
        public transient Set<Map.Entry<K, Collection<V>>> f21544g;

        /* renamed from: h */
        @NullableDecl
        public transient Collection<Collection<V>> f21545h;

        public SynchronizedAsMap(Map<K, Collection<V>> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f21565c) {
                if (this.f21544g == null) {
                    this.f21544g = new SynchronizedAsMapEntries(((Map) this.f21564b).entrySet(), this.f21565c);
                }
                set = this.f21544g;
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Object get(Object obj) {
            Collection m11913b;
            synchronized (this.f21565c) {
                Collection collection = (Collection) super.get(obj);
                m11913b = collection == null ? null : Synchronized.m11913b(collection, this.f21565c);
            }
            return m11913b;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f21565c) {
                if (this.f21545h == null) {
                    this.f21545h = new SynchronizedAsMapValues(((Map) this.f21564b).values(), this.f21565c);
                }
                collection = this.f21545h;
            }
            return collection;
        }
    }

    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        public SynchronizedAsMapValues(Collection<Collection<V>> collection, @NullableDecl Object obj) {
            super(collection, obj, null);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new TransformedIterator<Collection<V>, Collection<V>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public Object mo11415a(Object obj) {
                    return Synchronized.m11913b((Collection) obj, SynchronizedAsMapValues.this.f21565c);
                }
            };
        }
    }

    @VisibleForTesting
    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V> {

        /* renamed from: g */
        @NullableDecl
        public transient Set<V> f21550g;

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public BiMap<K, V> mo11925r() {
            return (BiMap) ((Map) this.f21564b);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f21565c) {
                if (this.f21550g == null) {
                    this.f21550g = new SynchronizedSet(mo11916g().values(), this.f21565c);
                }
                set = this.f21550g;
            }
            return set;
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        @Override // java.util.Deque
        public void addFirst(E e2) {
            synchronized (this.f21565c) {
                mo11918g().addFirst(e2);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e2) {
            synchronized (this.f21565c) {
                mo11918g().addLast(e2);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.f21565c) {
                descendingIterator = mo11918g().descendingIterator();
            }
            return descendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.f21565c) {
                first = mo11918g().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.f21565c) {
                last = mo11918g().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e2) {
            boolean offerFirst;
            synchronized (this.f21565c) {
                offerFirst = mo11918g().offerFirst(e2);
            }
            return offerFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e2) {
            boolean offerLast;
            synchronized (this.f21565c) {
                offerLast = mo11918g().offerLast(e2);
            }
            return offerLast;
        }

        @Override // java.util.Deque
        public E peekFirst() {
            E peekFirst;
            synchronized (this.f21565c) {
                peekFirst = mo11918g().peekFirst();
            }
            return peekFirst;
        }

        @Override // java.util.Deque
        public E peekLast() {
            E peekLast;
            synchronized (this.f21565c) {
                peekLast = mo11918g().peekLast();
            }
            return peekLast;
        }

        @Override // java.util.Deque
        public E pollFirst() {
            E pollFirst;
            synchronized (this.f21565c) {
                pollFirst = mo11918g().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.Deque
        public E pollLast() {
            E pollLast;
            synchronized (this.f21565c) {
                pollLast = mo11918g().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E pop;
            synchronized (this.f21565c) {
                pop = mo11918g().pop();
            }
            return pop;
        }

        @Override // java.util.Deque
        public void push(E e2) {
            synchronized (this.f21565c) {
                mo11918g().push(e2);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E removeFirst;
            synchronized (this.f21565c) {
                removeFirst = mo11918g().removeFirst();
            }
            return removeFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.f21565c) {
                removeFirstOccurrence = mo11918g().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E removeLast;
            synchronized (this.f21565c) {
                removeLast = mo11918g().removeLast();
            }
            return removeLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.f21565c) {
                removeLastOccurrence = mo11918g().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> mo11927r() {
            return (Deque) super.mo11927r();
        }
    }

    @GwtIncompatible
    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        public SynchronizedEntry(Map.Entry<K, V> entry, @NullableDecl Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean equals;
            synchronized (this.f21565c) {
                equals = ((Map.Entry) this.f21564b).equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K k2;
            synchronized (this.f21565c) {
                k2 = (K) ((Map.Entry) this.f21564b).getKey();
            }
            return k2;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V v;
            synchronized (this.f21565c) {
                v = (V) ((Map.Entry) this.f21564b).getValue();
            }
            return v;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = ((Map.Entry) this.f21564b).hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2;
            synchronized (this.f21565c) {
                v2 = (V) ((Map.Entry) this.f21564b).setValue(v);
            }
            return v2;
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        public SynchronizedList(List<E> list, @NullableDecl Object obj) {
            super(list, obj, null);
        }

        @Override // java.util.List
        public void add(int i2, E e2) {
            synchronized (this.f21565c) {
                mo11919r().add(i2, e2);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f21565c) {
                addAll = mo11919r().addAll(i2, collection);
            }
            return addAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = mo11919r().equals(obj);
            }
            return equals;
        }

        @Override // java.util.List
        public E get(int i2) {
            E e2;
            synchronized (this.f21565c) {
                e2 = mo11919r().get(i2);
            }
            return e2;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = mo11919r().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.f21565c) {
                indexOf = mo11919r().indexOf(obj);
            }
            return indexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.f21565c) {
                lastIndexOf = mo11919r().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return mo11919r().listIterator();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<E> mo11927r() {
            return (List) ((Collection) this.f21564b);
        }

        @Override // java.util.List
        public E remove(int i2) {
            E remove;
            synchronized (this.f21565c) {
                remove = mo11919r().remove(i2);
            }
            return remove;
        }

        @Override // java.util.List
        public E set(int i2, E e2) {
            E e3;
            synchronized (this.f21565c) {
                e3 = mo11919r().set(i2, e2);
            }
            return e3;
        }

        @Override // java.util.List
        public List<E> subList(int i2, int i3) {
            List<E> synchronizedRandomAccessList;
            synchronized (this.f21565c) {
                List<E> subList = mo11919r().subList(i2, i3);
                Object obj = this.f21565c;
                synchronizedRandomAccessList = subList instanceof RandomAccess ? new SynchronizedRandomAccessList<>(subList, obj) : new SynchronizedList<>(subList, obj);
            }
            return synchronizedRandomAccessList;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i2) {
            return mo11919r().listIterator(i2);
        }
    }

    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((SynchronizedListMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public ListMultimap<K, V> mo11922g() {
            return (ListMultimap) ((Multimap) this.f21564b);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public List<V> mo11335a(Object obj) {
            List<V> mo11335a;
            synchronized (this.f21565c) {
                mo11335a = mo11922g().mo11335a(obj);
            }
            return mo11335a;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public List<V> get(K k2) {
            List<V> synchronizedRandomAccessList;
            synchronized (this.f21565c) {
                List<V> list = mo11922g().get((ListMultimap<K, V>) k2);
                Object obj = this.f21565c;
                synchronizedRandomAccessList = list instanceof RandomAccess ? new SynchronizedRandomAccessList<>(list, obj) : new SynchronizedList<>(list, obj);
            }
            return synchronizedRandomAccessList;
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {

        /* renamed from: d */
        @NullableDecl
        public transient Set<K> f21551d;

        /* renamed from: e */
        @NullableDecl
        public transient Collection<V> f21552e;

        /* renamed from: f */
        @NullableDecl
        public transient Set<Map.Entry<K, V>> f21553f;

        public SynchronizedMap(Map<K, V> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f21565c) {
                mo11925r().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f21565c) {
                containsKey = mo11925r().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.f21565c) {
                containsValue = mo11925r().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f21565c) {
                if (this.f21553f == null) {
                    this.f21553f = new SynchronizedSet(mo11925r().entrySet(), this.f21565c);
                }
                set = this.f21553f;
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = mo11925r().equals(obj);
            }
            return equals;
        }

        /* renamed from: g */
        Map<K, V> mo11925r() {
            return (Map) this.f21564b;
        }

        public V get(Object obj) {
            V v;
            synchronized (this.f21565c) {
                v = mo11925r().get(obj);
            }
            return v;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = mo11925r().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21565c) {
                isEmpty = mo11925r().isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f21565c) {
                if (this.f21551d == null) {
                    this.f21551d = new SynchronizedSet(mo11925r().keySet(), this.f21565c);
                }
                set = this.f21551d;
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k2, V v) {
            V put;
            synchronized (this.f21565c) {
                put = mo11925r().put(k2, v);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f21565c) {
                mo11925r().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V remove;
            synchronized (this.f21565c) {
                remove = mo11925r().remove(obj);
            }
            return remove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f21565c) {
                size = mo11925r().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f21565c) {
                if (this.f21552e == null) {
                    this.f21552e = Synchronized.m11914c(mo11925r().values(), this.f21565c);
                }
                collection = this.f21552e;
            }
            return collection;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {

        /* renamed from: d */
        @NullableDecl
        public transient Set<K> f21554d;

        /* renamed from: e */
        @NullableDecl
        public transient Collection<V> f21555e;

        /* renamed from: f */
        @NullableDecl
        public transient Collection<Map.Entry<K, V>> f21556f;

        /* renamed from: g */
        @NullableDecl
        public transient Map<K, Collection<V>> f21557g;

        @Override // com.google.common.collect.Multimap
        /* renamed from: E */
        public Map<K, Collection<V>> mo11334E() {
            Map<K, Collection<V>> map;
            synchronized (this.f21565c) {
                if (this.f21557g == null) {
                    this.f21557g = new SynchronizedAsMap(mo11922g().mo11334E(), this.f21565c);
                }
                map = this.f21557g;
            }
            return map;
        }

        @Override // com.google.common.collect.Multimap
        /* renamed from: F */
        public boolean mo11385F(Object obj, Object obj2) {
            boolean mo11385F;
            synchronized (this.f21565c) {
                mo11385F = mo11922g().mo11385F(obj, obj2);
            }
            return mo11385F;
        }

        /* renamed from: a */
        public Collection<V> mo11335a(Object obj) {
            Collection<V> mo11335a;
            synchronized (this.f21565c) {
                mo11335a = mo11922g().mo11335a(obj);
            }
            return mo11335a;
        }

        @Override // com.google.common.collect.Multimap
        /* renamed from: b */
        public Collection<Map.Entry<K, V>> mo11345b() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f21565c) {
                if (this.f21556f == null) {
                    this.f21556f = Synchronized.m11913b(mo11922g().mo11345b(), this.f21565c);
                }
                collection = this.f21556f;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            synchronized (this.f21565c) {
                mo11922g().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f21565c) {
                containsKey = mo11922g().containsKey(obj);
            }
            return containsKey;
        }

        @Override // com.google.common.collect.Multimap
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = mo11922g().equals(obj);
            }
            return equals;
        }

        /* renamed from: g */
        public Multimap<K, V> mo11922g() {
            return (Multimap) this.f21564b;
        }

        public Collection<V> get(K k2) {
            Collection<V> m11913b;
            synchronized (this.f21565c) {
                m11913b = Synchronized.m11913b(mo11922g().get(k2), this.f21565c);
            }
            return m11913b;
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = mo11922g().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21565c) {
                isEmpty = mo11922g().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f21565c) {
                if (this.f21554d == null) {
                    this.f21554d = Synchronized.m11912a(mo11922g().keySet(), this.f21565c);
                }
                set = this.f21554d;
            }
            return set;
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(K k2, V v) {
            boolean put;
            synchronized (this.f21565c) {
                put = mo11922g().put(k2, v);
            }
            return put;
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.f21565c) {
                remove = mo11922g().remove(obj, obj2);
            }
            return remove;
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            int size;
            synchronized (this.f21565c) {
                size = mo11922g().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f21565c) {
                if (this.f21555e == null) {
                    this.f21555e = Synchronized.m11914c(mo11922g().values(), this.f21565c);
                }
                collection = this.f21555e;
            }
            return collection;
        }
    }

    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {

        /* renamed from: d */
        @NullableDecl
        public transient Set<E> f21558d;

        /* renamed from: e */
        @NullableDecl
        public transient Set<Multiset.Entry<E>> f21559e;

        @Override // com.google.common.collect.Multiset
        /* renamed from: X */
        public int mo11376X(E e2, int i2) {
            int mo11376X;
            synchronized (this.f21565c) {
                mo11376X = mo11919r().mo11376X(e2, i2);
            }
            return mo11376X;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: d0 */
        public boolean mo11377d0(E e2, int i2, int i3) {
            boolean mo11377d0;
            synchronized (this.f21565c) {
                mo11377d0 = mo11919r().mo11377d0(e2, i2, i3);
            }
            return mo11377d0;
        }

        @Override // com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set;
            synchronized (this.f21565c) {
                if (this.f21559e == null) {
                    this.f21559e = Synchronized.m11912a(mo11919r().entrySet(), this.f21565c);
                }
                set = this.f21559e;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = mo11919r().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = mo11919r().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: l */
        public Set<E> mo11389l() {
            Set<E> set;
            synchronized (this.f21565c) {
                if (this.f21558d == null) {
                    this.f21558d = Synchronized.m11912a(mo11919r().mo11389l(), this.f21565c);
                }
                set = this.f21558d;
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: o */
        public int mo11381o(Object obj, int i2) {
            int mo11381o;
            synchronized (this.f21565c) {
                mo11381o = mo11919r().mo11381o(obj, i2);
            }
            return mo11381o;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: p */
        public int mo11382p(E e2, int i2) {
            int mo11382p;
            synchronized (this.f21565c) {
                mo11382p = mo11919r().mo11382p(e2, i2);
            }
            return mo11382p;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Multiset<E> mo11927r() {
            return (Multiset) ((Collection) this.f21564b);
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(Object obj) {
            int mo11383s0;
            synchronized (this.f21565c) {
                mo11383s0 = mo11919r().mo11383s0(obj);
            }
            return mo11383s0;
        }
    }

    public static class SynchronizedObject implements Serializable {

        /* renamed from: b */
        public final Object f21564b;

        /* renamed from: c */
        public final Object f21565c;

        public SynchronizedObject(Object obj, @NullableDecl Object obj2) {
            Objects.requireNonNull(obj);
            this.f21564b = obj;
            this.f21565c = obj2 == null ? this : obj2;
        }

        public String toString() {
            String obj;
            synchronized (this.f21565c) {
                obj = this.f21564b.toString();
            }
            return obj;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        @Override // java.util.Queue
        public E element() {
            E element;
            synchronized (this.f21565c) {
                element = mo11927r().element();
            }
            return element;
        }

        @Override // java.util.Queue
        public boolean offer(E e2) {
            boolean offer;
            synchronized (this.f21565c) {
                offer = mo11927r().offer(e2);
            }
            return offer;
        }

        @Override // java.util.Queue
        public E peek() {
            E peek;
            synchronized (this.f21565c) {
                peek = mo11927r().peek();
            }
            return peek;
        }

        @Override // java.util.Queue
        public E poll() {
            E poll;
            synchronized (this.f21565c) {
                poll = mo11927r().poll();
            }
            return poll;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Queue<E> mo11927r() {
            return (Queue) ((Collection) this.f21564b);
        }

        @Override // java.util.Queue
        public E remove() {
            E remove;
            synchronized (this.f21565c) {
                remove = mo11927r().remove();
            }
            return remove;
        }
    }

    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        public SynchronizedRandomAccessList(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        public SynchronizedSet(Set<E> set, @NullableDecl Object obj) {
            super(set, obj, null);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = mo11927r().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = mo11927r().hashCode();
            }
            return hashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Set<E> mo11927r() {
            return (Set) ((Collection) this.f21564b);
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {

        /* renamed from: h */
        @NullableDecl
        public transient Set<Map.Entry<K, V>> f21566h;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((SynchronizedSetMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public SetMultimap<K, V> mo11922g() {
            return (SetMultimap) ((Multimap) this.f21564b);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public Set<V> mo11335a(Object obj) {
            Set<V> mo11335a;
            synchronized (this.f21565c) {
                mo11335a = mo11922g().mo11335a(obj);
            }
            return mo11335a;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        /* renamed from: b */
        public Set<Map.Entry<K, V>> mo11345b() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f21565c) {
                if (this.f21566h == null) {
                    this.f21566h = new SynchronizedSet(mo11922g().mo11345b(), this.f21565c);
                }
                set = this.f21566h;
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<V> get(K k2) {
            SynchronizedSet synchronizedSet;
            synchronized (this.f21565c) {
                synchronizedSet = new SynchronizedSet(mo11922g().get((SetMultimap<K, V>) k2), this.f21565c);
            }
            return synchronizedSet;
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        public SynchronizedSortedMap(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f21565c) {
                comparator = mo11925r().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K firstKey;
            synchronized (this.f21565c) {
                firstKey = mo11925r().firstKey();
            }
            return firstKey;
        }

        public SortedMap<K, V> headMap(K k2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f21565c) {
                synchronizedSortedMap = new SynchronizedSortedMap(mo11925r().headMap(k2), this.f21565c);
            }
            return synchronizedSortedMap;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K lastKey;
            synchronized (this.f21565c) {
                lastKey = mo11925r().lastKey();
            }
            return lastKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* renamed from: r */
        public SortedMap<K, V> mo11925r() {
            return (SortedMap) ((Map) this.f21564b);
        }

        public SortedMap<K, V> subMap(K k2, K k3) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f21565c) {
                synchronizedSortedMap = new SynchronizedSortedMap(mo11925r().subMap(k2, k3), this.f21565c);
            }
            return synchronizedSortedMap;
        }

        public SortedMap<K, V> tailMap(K k2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f21565c) {
                synchronizedSortedMap = new SynchronizedSortedMap(mo11925r().tailMap(k2), this.f21565c);
            }
            return synchronizedSortedMap;
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        public SynchronizedSortedSet(SortedSet<E> sortedSet, @NullableDecl Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f21565c) {
                comparator = mo11927r().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E first;
            synchronized (this.f21565c) {
                first = mo11927r().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f21565c) {
                synchronizedSortedSet = new SynchronizedSortedSet(mo11927r().headSet(e2), this.f21565c);
            }
            return synchronizedSortedSet;
        }

        @Override // java.util.SortedSet
        public E last() {
            E last;
            synchronized (this.f21565c) {
                last = mo11927r().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E e2, E e3) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f21565c) {
                synchronizedSortedSet = new SynchronizedSortedSet(mo11927r().subSet(e2, e3), this.f21565c);
            }
            return synchronizedSortedSet;
        }

        public SortedSet<E> tailSet(E e2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f21565c) {
                synchronizedSortedSet = new SynchronizedSortedSet(mo11927r().tailSet(e2), this.f21565c);
            }
            return synchronizedSortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> mo11927r() {
            return (SortedSet) super.mo11927r();
        }
    }

    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((SynchronizedSortedSetMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public SortedSetMultimap<K, V> mo11922g() {
            return (SortedSetMultimap) super.mo11922g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((SynchronizedSortedSetMultimap<K, V>) obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        /* renamed from: a */
        public SortedSet<V> mo11335a(Object obj) {
            SortedSet<V> mo11335a;
            synchronized (this.f21565c) {
                mo11335a = mo11922g().mo11335a(obj);
            }
            return mo11335a;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public SortedSet<V> get(K k2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f21565c) {
                synchronizedSortedSet = new SynchronizedSortedSet(mo11922g().get((SortedSetMultimap<K, V>) k2), this.f21565c);
            }
            return synchronizedSortedSet;
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2 */
        class C17822 implements Function<Map<Object, Object>, Map<Object, Object>> {

            /* renamed from: b */
            public final /* synthetic */ SynchronizedTable f21568b;

            @Override // com.google.common.base.Function
            public Map<Object, Object> apply(Map<Object, Object> map) {
                return new SynchronizedMap(map, this.f21568b.f21565c);
            }
        }

        @Override // com.google.common.collect.Table
        /* renamed from: d */
        public Set<Table.Cell<R, C, V>> mo11409d() {
            SynchronizedSet synchronizedSet;
            synchronized (this.f21565c) {
                synchronizedSet = new SynchronizedSet(((Table) this.f21564b).mo11409d(), this.f21565c);
            }
            return synchronizedSet;
        }

        @Override // com.google.common.collect.Table
        public boolean equals(@NullableDecl Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f21565c) {
                equals = ((Table) this.f21564b).equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
            int hashCode;
            synchronized (this.f21565c) {
                hashCode = ((Table) this.f21564b).hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            int size;
            synchronized (this.f21565c) {
                size = ((Table) this.f21564b).size();
            }
            return size;
        }

        @Override // com.google.common.collect.Table
        /* renamed from: t */
        public Map<R, Map<C, V>> mo11417t() {
            SynchronizedMap synchronizedMap;
            synchronized (this.f21565c) {
                synchronizedMap = new SynchronizedMap(new Maps.TransformedEntriesMap(((Table) this.f21564b).mo11417t(), new Maps.C17169(new Function<Map<C, V>, Map<C, V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function
                    public Object apply(Object obj) {
                        return new SynchronizedMap((Map) obj, SynchronizedTable.this.f21565c);
                    }
                })), this.f21565c);
            }
            return synchronizedMap;
        }
    }

    /* renamed from: a */
    public static Set m11912a(Set set, Object obj) {
        return set instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) set, obj) : new SynchronizedSet(set, obj);
    }

    /* renamed from: b */
    public static Collection m11913b(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return new SynchronizedSortedSet((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return new SynchronizedSet((Set) collection, obj);
        }
        if (!(collection instanceof List)) {
            return new SynchronizedCollection(collection, obj, null);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    /* renamed from: c */
    public static Collection m11914c(Collection collection, Object obj) {
        return new SynchronizedCollection(collection, obj, null);
    }

    /* renamed from: d */
    public static Map.Entry m11915d(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    @VisibleForTesting
    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        public SynchronizedCollection(Collection collection, Object obj, C17781 c17781) {
            super(collection, obj);
        }

        @Override // java.util.Collection
        public boolean add(E e2) {
            boolean add;
            synchronized (this.f21565c) {
                add = mo11927r().add(e2);
            }
            return add;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f21565c) {
                addAll = mo11927r().addAll(collection);
            }
            return addAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f21565c) {
                mo11927r().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.f21565c) {
                contains = mo11927r().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.f21565c) {
                containsAll = mo11927r().containsAll(collection);
            }
            return containsAll;
        }

        /* renamed from: g */
        Collection<E> mo11927r() {
            return (Collection) this.f21564b;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f21565c) {
                isEmpty = mo11927r().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return mo11927r().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.f21565c) {
                remove = mo11927r().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.f21565c) {
                removeAll = mo11927r().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.f21565c) {
                retainAll = mo11927r().retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f21565c) {
                size = mo11927r().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f21565c) {
                array = mo11927r().toArray();
            }
            return array;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f21565c) {
                tArr2 = (T[]) mo11927r().toArray(tArr);
            }
            return tArr2;
        }
    }

    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        public SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.f21565c) {
                contains = !(obj instanceof Map.Entry) ? false : mo11927r().contains(Maps.m11796m((Map.Entry) obj));
            }
            return contains;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean m11431b;
            synchronized (this.f21565c) {
                m11431b = Collections2.m11431b(mo11927r(), collection);
            }
            return m11431b;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean m11884b;
            if (obj == this) {
                return true;
            }
            synchronized (this.f21565c) {
                m11884b = Sets.m11884b(mo11927r(), obj);
            }
            return m11884b;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public Object mo11415a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Object, Collection<Object>>() { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* renamed from: G */
                        public Object mo7455G() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* renamed from: H */
                        public Map.Entry<Object, Collection<Object>> mo7455G() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public Object getValue() {
                            return Synchronized.m11913b((Collection) entry.getValue(), SynchronizedAsMapEntries.this.f21565c);
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.f21565c) {
                remove = !(obj instanceof Map.Entry) ? false : mo11927r().remove(Maps.m11796m((Map.Entry) obj));
            }
            return remove;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean m11717l;
            synchronized (this.f21565c) {
                m11717l = Iterators.m11717l(mo11927r().iterator(), collection);
            }
            return m11717l;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean m11718m;
            synchronized (this.f21565c) {
                m11718m = Iterators.m11718m(mo11927r().iterator(), collection);
            }
            return m11718m;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArr;
            synchronized (this.f21565c) {
                Set<Map.Entry<K, Collection<V>>> mo11927r = mo11927r();
                objArr = new Object[mo11927r.size()];
                ObjectArrays.m11828b(mo11927r, objArr);
            }
            return objArr;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f21565c) {
                tArr2 = (T[]) ObjectArrays.m11830d(mo11927r(), tArr);
            }
            return tArr2;
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {

        /* renamed from: g */
        @NullableDecl
        public transient NavigableSet<K> f21560g;

        /* renamed from: h */
        @NullableDecl
        public transient NavigableMap<K, V> f21561h;

        /* renamed from: i */
        @NullableDecl
        public transient NavigableSet<K> f21562i;

        public SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().ceilingEntry(k2), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            K ceilingKey;
            synchronized (this.f21565c) {
                ceilingKey = mo11916g().ceilingKey(k2);
            }
            return ceilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f21565c) {
                NavigableSet<K> navigableSet = this.f21560g;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(mo11916g().descendingKeySet(), this.f21565c);
                this.f21560g = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f21565c) {
                NavigableMap<K, V> navigableMap = this.f21561h;
                if (navigableMap != null) {
                    return navigableMap;
                }
                SynchronizedNavigableMap synchronizedNavigableMap = new SynchronizedNavigableMap(mo11916g().descendingMap(), this.f21565c);
                this.f21561h = synchronizedNavigableMap;
                return synchronizedNavigableMap;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().firstEntry(), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().floorEntry(k2), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            K floorKey;
            synchronized (this.f21565c) {
                floorKey = mo11916g().floorKey(k2);
            }
            return floorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f21565c) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(mo11916g().headMap(k2, z), this.f21565c);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().higherEntry(k2), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            K higherKey;
            synchronized (this.f21565c) {
                higherKey = mo11916g().higherKey(k2);
            }
            return higherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().lastEntry(), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().lowerEntry(k2), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            K lowerKey;
            synchronized (this.f21565c) {
                lowerKey = mo11916g().lowerKey(k2);
            }
            return lowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f21565c) {
                NavigableSet<K> navigableSet = this.f21562i;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(mo11916g().navigableKeySet(), this.f21565c);
                this.f21562i = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().pollFirstEntry(), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> m11915d;
            synchronized (this.f21565c) {
                m11915d = Synchronized.m11915d(mo11916g().pollLastEntry(), this.f21565c);
            }
            return m11915d;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f21565c) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(mo11916g().subMap(k2, z, k3, z2), this.f21565c);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f21565c) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(mo11916g().tailMap(k2, z), this.f21565c);
            }
            return synchronizedNavigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> mo11925r() {
            return (NavigableMap) super.mo11925r();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k2) {
            return tailMap(k2, true);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {

        /* renamed from: d */
        @NullableDecl
        public transient NavigableSet<E> f21563d;

        public SynchronizedNavigableSet(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            E ceiling;
            synchronized (this.f21565c) {
                ceiling = mo11919r().ceiling(e2);
            }
            return ceiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return mo11919r().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f21565c) {
                NavigableSet<E> navigableSet = this.f21563d;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(mo11919r().descendingSet(), this.f21565c);
                this.f21563d = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            E floor;
            synchronized (this.f21565c) {
                floor = mo11919r().floor(e2);
            }
            return floor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f21565c) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(mo11919r().headSet(e2, z), this.f21565c);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            E higher;
            synchronized (this.f21565c) {
                higher = mo11919r().higher(e2);
            }
            return higher;
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            E lower;
            synchronized (this.f21565c) {
                lower = mo11919r().lower(e2);
            }
            return lower;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E pollFirst;
            synchronized (this.f21565c) {
                pollFirst = mo11919r().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E pollLast;
            synchronized (this.f21565c) {
                pollLast = mo11919r().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f21565c) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(mo11919r().subSet(e2, z, e3, z2), this.f21565c);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f21565c) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(mo11919r().tailSet(e2, z), this.f21565c);
            }
            return synchronizedNavigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> mo11927r() {
            return (NavigableSet) super.mo11927r();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
            return headSet(e2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
            return subSet(e2, true, e3, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
            return tailSet(e2, true);
        }
    }
}

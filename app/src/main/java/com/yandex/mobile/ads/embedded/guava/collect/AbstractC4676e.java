package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.C4705u;
import com.yandex.mobile.ads.embedded.guava.collect.C4708x;
import com.yandex.mobile.ads.impl.tr0;
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
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e */
/* loaded from: classes2.dex */
abstract class AbstractC4676e<K, V> extends AbstractC4680g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: d */
    private transient Map<K, Collection<V>> f47822d;

    /* renamed from: e */
    private transient int f47823e;

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$a */
    public class a extends C4708x.d<K, Collection<V>> {

        /* renamed from: c */
        public final transient Map<K, Collection<V>> f47824c;

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$a$a, reason: collision with other inner class name */
        public class C7012a extends C4708x.a<K, Collection<V>> {
            public C7012a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.C4708x.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = a.this.f47824c.entrySet();
                Objects.requireNonNull(entrySet);
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC4676e.m21990a(AbstractC4676e.this, entry.getKey());
                return true;
            }
        }

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$a$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f47827a;

            /* renamed from: b */
            @CheckForNull
            public Collection<V> f47828b;

            public b() {
                this.f47827a = a.this.f47824c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f47827a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f47827a.next();
                this.f47828b = next.getValue();
                return a.this.m22000a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                tr0.m28731a("no calls to next() since the last call to remove()", this.f47828b != null);
                this.f47827a.remove();
                AbstractC4676e.m21992b(AbstractC4676e.this, this.f47828b.size());
                this.f47828b.clear();
                this.f47828b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f47824c = map;
        }

        /* renamed from: a */
        public final Map.Entry<K, Collection<V>> m22000a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            AbstractC4676e abstractC4676e = AbstractC4676e.this;
            Collection<V> value = entry.getValue();
            AbstractC4672c abstractC4672c = (AbstractC4672c) abstractC4676e;
            Objects.requireNonNull(abstractC4672c);
            List list = (List) value;
            return new C4696o(key, list instanceof RandomAccess ? new f(abstractC4672c, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            if (this.f47824c == AbstractC4676e.this.f47822d) {
                AbstractC4676e.this.m21996d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@CheckForNull Object obj) {
            Map<K, Collection<V>> map = this.f47824c;
            Objects.requireNonNull(map);
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f47824c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object get(@CheckForNull Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f47824c;
            Objects.requireNonNull(map);
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractC4672c abstractC4672c = (AbstractC4672c) AbstractC4676e.this;
            Objects.requireNonNull(abstractC4672c);
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(abstractC4672c, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f47824c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC4676e.this.m22019b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public final Object remove(@CheckForNull Object obj) {
            Collection<V> remove = this.f47824c.remove(obj);
            if (remove == null) {
                return null;
            }
            List<V> list = ((C4671b0) AbstractC4676e.this).f47820f.get();
            list.addAll(remove);
            AbstractC4676e.m21992b(AbstractC4676e.this, remove.size());
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f47824c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f47824c.toString();
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$b */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f47830a;

        /* renamed from: b */
        @CheckForNull
        public K f47831b = null;

        /* renamed from: c */
        @CheckForNull
        public Collection<V> f47832c = null;

        /* renamed from: d */
        public Iterator<V> f47833d = C4705u.a.f47919a;

        public b() {
            this.f47830a = AbstractC4676e.this.f47822d.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo21984a(K k2, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47830a.hasNext() || this.f47833d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f47833d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f47830a.next();
                this.f47831b = next.getKey();
                Collection<V> value = next.getValue();
                this.f47832c = value;
                this.f47833d = value.iterator();
            }
            return mo21984a(this.f47831b, this.f47833d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f47833d.remove();
            Collection<V> collection = this.f47832c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f47830a.remove();
            }
            AbstractC4676e.m21993c(AbstractC4676e.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$c */
    public class c extends C4708x.b<K, Collection<V>> {

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$c$a */
        public class a implements Iterator<K> {

            /* renamed from: a */
            @CheckForNull
            public Map.Entry<K, Collection<V>> f47836a;

            /* renamed from: b */
            public final /* synthetic */ Iterator f47837b;

            public a(Iterator it) {
                this.f47837b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f47837b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f47837b.next();
                this.f47836a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                tr0.m28731a("no calls to next() since the last call to remove()", this.f47836a != null);
                Collection<V> value = this.f47836a.getValue();
                this.f47837b.remove();
                AbstractC4676e.m21992b(AbstractC4676e.this, value.size());
                value.clear();
                this.f47836a = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f47921a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return this == obj || this.f47921a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f47921a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f47921a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            int i2;
            Collection collection = (Collection) this.f47921a.remove(obj);
            if (collection != null) {
                i2 = collection.size();
                collection.clear();
                AbstractC4676e.m21992b(AbstractC4676e.this, i2);
            } else {
                i2 = 0;
            }
            return i2 > 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$d */
    public class d extends AbstractC4676e<K, V>.g implements NavigableMap<K, Collection<V>> {
        public d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g
        /* renamed from: a */
        public final SortedSet mo22001a() {
            return new e(mo22003c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g
        /* renamed from: b */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo22003c().ceilingEntry(k2);
            if (ceilingEntry == null) {
                return null;
            }
            return m22000a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K ceilingKey(K k2) {
            return mo22003c().ceilingKey(k2);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> mo22003c() {
            return (NavigableMap) ((SortedMap) this.f47824c);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(mo22003c().descendingMap());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo22003c().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m22000a(firstEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> floorEntry = mo22003c().floorEntry(k2);
            if (floorEntry == null) {
                return null;
            }
            return m22000a(floorEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K floorKey(K k2) {
            return mo22003c().floorKey(k2);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> higherEntry = mo22003c().higherEntry(k2);
            if (higherEntry == null) {
                return null;
            }
            return m22000a(higherEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K higherKey(K k2) {
            return mo22003c().higherKey(k2);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo22003c().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m22000a(lastEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> lowerEntry = mo22003c().lowerEntry(k2);
            if (lowerEntry == null) {
                return null;
            }
            return m22000a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final K lowerKey(K k2) {
            return mo22003c().lowerKey(k2);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((C4671b0) AbstractC4676e.this).f47820f.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            Objects.requireNonNull((AbstractC4672c) AbstractC4676e.this);
            return new C4696o(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((C4708x.d) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((C4671b0) AbstractC4676e.this).f47820f.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            Objects.requireNonNull((AbstractC4672c) AbstractC4676e.this);
            return new C4696o(key, Collections.unmodifiableList(list));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new d(mo22003c().headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new d(mo22003c().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new d(mo22003c().tailMap(k2, z));
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$e */
    public class e extends AbstractC4676e<K, V>.h implements NavigableSet<K> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> mo22005b() {
            return (NavigableMap) ((SortedMap) this.f47921a);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K ceiling(K k2) {
            return mo22005b().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(mo22005b().descendingMap());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K floor(K k2) {
            return mo22005b().floorKey(k2);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K higher(K k2) {
            return mo22005b().higherKey(k2);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K lower(K k2) {
            return mo22005b().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k2 = (K) aVar.next();
            aVar.remove();
            return k2;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public final K pollLast() {
            Iterator<K> descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k2, boolean z) {
            return new e(mo22005b().headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new e(mo22005b().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k2, boolean z) {
            return new e(mo22005b().tailMap(k2, z));
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$f */
    public class f extends AbstractC4676e<K, V>.j implements RandomAccess {
        public f(AbstractC4676e abstractC4676e, K k2, @CheckForNull List<V> list, AbstractC4676e<K, V>.i iVar) {
            super(k2, list, iVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$g */
    public class g extends AbstractC4676e<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: e */
        @CheckForNull
        public SortedSet<K> f47841e;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: a */
        public SortedSet<K> mo22001a() {
            return new h(mo22003c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.a, java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f47841e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> mo22001a = mo22001a();
            this.f47841e = mo22001a;
            return mo22001a;
        }

        /* renamed from: c */
        public SortedMap<K, Collection<V>> mo22003c() {
            return (SortedMap) this.f47824c;
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return mo22003c().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return mo22003c().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new g(mo22003c().headMap(k2));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return mo22003c().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new g(mo22003c().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new g(mo22003c().tailMap(k2));
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$h */
    public class h extends AbstractC4676e<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedMap<K, Collection<V>> mo22005b() {
            return (SortedMap) this.f47921a;
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super K> comparator() {
            return mo22005b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return mo22005b().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new h(mo22005b().headMap(k2));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return mo22005b().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new h(mo22005b().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new h(mo22005b().tailMap(k2));
        }
    }

    public AbstractC4676e(Map<K, Collection<V>> map) {
        tr0.m28732a(map.isEmpty());
        this.f47822d = map;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21991b(AbstractC4676e abstractC4676e) {
        abstractC4676e.f47823e++;
    }

    /* renamed from: c */
    public static /* synthetic */ void m21993c(AbstractC4676e abstractC4676e) {
        abstractC4676e.f47823e--;
    }

    /* renamed from: d */
    public final void m21996d() {
        Iterator<Collection<V>> it = this.f47822d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f47822d.clear();
        this.f47823e = 0;
    }

    /* renamed from: e */
    public final Map<K, Collection<V>> m21997e() {
        Map<K, Collection<V>> map = this.f47822d;
        return map instanceof NavigableMap ? new d((NavigableMap) this.f47822d) : map instanceof SortedMap ? new g((SortedMap) this.f47822d) : new a(this.f47822d);
    }

    /* renamed from: f */
    public final Set<K> m21998f() {
        Map<K, Collection<V>> map = this.f47822d;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f47822d) : map instanceof SortedMap ? new h((SortedMap) this.f47822d) : new c(this.f47822d);
    }

    /* renamed from: g */
    public final int m21999g() {
        return this.f47823e;
    }

    @Override // com.yandex.mobile.ads.impl.vg0
    public boolean put(K k2, V v) {
        Collection<V> collection = this.f47822d.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f47823e++;
            return true;
        }
        List<V> list = ((C4671b0) this).f47820f.get();
        if (!list.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f47823e++;
        this.f47822d.put(k2, list);
        return true;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4680g, com.yandex.mobile.ads.impl.vg0
    public final Collection<V> values() {
        return super.values();
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$i */
    public class i extends AbstractCollection<V> {

        /* renamed from: a */
        public final K f47844a;

        /* renamed from: b */
        public Collection<V> f47845b;

        /* renamed from: c */
        @CheckForNull
        public final AbstractC4676e<K, V>.i f47846c;

        /* renamed from: d */
        @CheckForNull
        public final Collection<V> f47847d;

        public i(K k2, Collection<V> collection, @CheckForNull AbstractC4676e<K, V>.i iVar) {
            this.f47844a = k2;
            this.f47845b = collection;
            this.f47846c = iVar;
            this.f47847d = iVar == null ? null : iVar.m22008c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            m22009d();
            boolean isEmpty = this.f47845b.isEmpty();
            boolean add = this.f47845b.add(v);
            if (add) {
                AbstractC4676e.m21991b(AbstractC4676e.this);
                if (isEmpty) {
                    m22007b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f47845b.addAll(collection);
            if (addAll) {
                AbstractC4676e.m21989a(AbstractC4676e.this, this.f47845b.size() - size);
                if (size == 0) {
                    m22007b();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        final void m22007b() {
            AbstractC4676e<K, V>.i iVar = this.f47846c;
            if (iVar != null) {
                iVar.m22007b();
            } else {
                AbstractC4676e.this.f47822d.put(this.f47844a, this.f47845b);
            }
        }

        /* renamed from: c */
        public final Collection<V> m22008c() {
            return this.f47845b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f47845b.clear();
            AbstractC4676e.m21992b(AbstractC4676e.this, size);
            m22010e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            m22009d();
            return this.f47845b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            m22009d();
            return this.f47845b.containsAll(collection);
        }

        /* renamed from: d */
        final void m22009d() {
            Collection<V> collection;
            AbstractC4676e<K, V>.i iVar = this.f47846c;
            if (iVar != null) {
                iVar.m22009d();
                if (this.f47846c.f47845b != this.f47847d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f47845b.isEmpty() || (collection = (Collection) AbstractC4676e.this.f47822d.get(this.f47844a)) == null) {
                    return;
                }
                this.f47845b = collection;
            }
        }

        /* renamed from: e */
        final void m22010e() {
            AbstractC4676e<K, V>.i iVar = this.f47846c;
            if (iVar != null) {
                iVar.m22010e();
            } else if (this.f47845b.isEmpty()) {
                AbstractC4676e.this.f47822d.remove(this.f47844a);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            m22009d();
            return this.f47845b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            m22009d();
            return this.f47845b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            m22009d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            m22009d();
            boolean remove = this.f47845b.remove(obj);
            if (remove) {
                AbstractC4676e.m21993c(AbstractC4676e.this);
                m22010e();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f47845b.removeAll(collection);
            if (removeAll) {
                AbstractC4676e.m21989a(AbstractC4676e.this, this.f47845b.size() - size);
                m22010e();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean retainAll = this.f47845b.retainAll(collection);
            if (retainAll) {
                AbstractC4676e.m21989a(AbstractC4676e.this, this.f47845b.size() - size);
                m22010e();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            m22009d();
            return this.f47845b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m22009d();
            return this.f47845b.toString();
        }

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$i$a */
        public class a implements Iterator<V> {

            /* renamed from: a */
            public final Iterator<V> f47849a;

            /* renamed from: b */
            public final Collection<V> f47850b;

            public a() {
                Collection<V> collection = i.this.f47845b;
                this.f47850b = collection;
                this.f47849a = AbstractC4676e.m21987a(collection);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                i.this.m22009d();
                if (i.this.f47845b == this.f47850b) {
                    return this.f47849a.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                i.this.m22009d();
                if (i.this.f47845b == this.f47850b) {
                    return this.f47849a.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f47849a.remove();
                AbstractC4676e.m21993c(AbstractC4676e.this);
                i.this.m22010e();
            }

            public a(ListIterator listIterator) {
                this.f47850b = i.this.f47845b;
                this.f47849a = listIterator;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$j */
    public class j extends AbstractC4676e<K, V>.i implements List<V> {

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$j$a */
        public class a extends AbstractC4676e<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            /* renamed from: a */
            private ListIterator<V> m22012a() {
                i.this.m22009d();
                if (i.this.f47845b == this.f47850b) {
                    return (ListIterator) this.f47849a;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = j.this.isEmpty();
                m22012a().add(v);
                AbstractC4676e.m21991b(AbstractC4676e.this);
                if (isEmpty) {
                    j.this.m22007b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return m22012a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return m22012a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return m22012a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return m22012a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                m22012a().set(v);
            }

            public a(int i2) {
                super(j.this.m22011f().listIterator(i2));
            }
        }

        public j(K k2, List<V> list, @CheckForNull AbstractC4676e<K, V>.i iVar) {
            super(k2, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i2, V v) {
            m22009d();
            boolean isEmpty = this.f47845b.isEmpty();
            ((List) this.f47845b).add(i2, v);
            AbstractC4676e.m21991b(AbstractC4676e.this);
            if (isEmpty) {
                m22007b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f47845b).addAll(i2, collection);
            if (addAll) {
                AbstractC4676e.m21989a(AbstractC4676e.this, this.f47845b.size() - size);
                if (size == 0) {
                    m22007b();
                }
            }
            return addAll;
        }

        /* renamed from: f */
        final List<V> m22011f() {
            return (List) this.f47845b;
        }

        @Override // java.util.List
        public final V get(int i2) {
            m22009d();
            return (V) ((List) this.f47845b).get(i2);
        }

        @Override // java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            m22009d();
            return ((List) this.f47845b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            m22009d();
            return ((List) this.f47845b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            m22009d();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i2) {
            m22009d();
            V v = (V) ((List) this.f47845b).remove(i2);
            AbstractC4676e.m21993c(AbstractC4676e.this);
            m22010e();
            return v;
        }

        @Override // java.util.List
        public final V set(int i2, V v) {
            m22009d();
            return (V) ((List) this.f47845b).set(i2, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i2, int i3) {
            m22009d();
            AbstractC4676e abstractC4676e = AbstractC4676e.this;
            K k2 = this.f47844a;
            List subList = ((List) this.f47845b).subList(i2, i3);
            AbstractC4676e<K, V>.i iVar = this.f47846c;
            if (iVar == null) {
                iVar = this;
            }
            Objects.requireNonNull(abstractC4676e);
            return subList instanceof RandomAccess ? new f(abstractC4676e, k2, subList, iVar) : new j(k2, subList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i2) {
            m22009d();
            return new a(i2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m21989a(AbstractC4676e abstractC4676e, int i2) {
        abstractC4676e.f47823e += i2;
    }

    /* renamed from: b */
    public static /* synthetic */ void m21992b(AbstractC4676e abstractC4676e, int i2) {
        abstractC4676e.f47823e -= i2;
    }

    /* renamed from: c */
    final Map<K, Collection<V>> m21995c() {
        return this.f47822d;
    }

    /* renamed from: a */
    final void m21994a(Map<K, Collection<V>> map) {
        this.f47822d = map;
        this.f47823e = 0;
        for (Collection<V> collection : map.values()) {
            tr0.m28732a(!collection.isEmpty());
            this.f47823e = collection.size() + this.f47823e;
        }
    }

    /* renamed from: a */
    public static Iterator m21987a(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: a */
    public static void m21990a(AbstractC4676e abstractC4676e, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = abstractC4676e.f47822d;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            abstractC4676e.f47823e -= size;
        }
    }
}

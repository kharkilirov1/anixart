package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* renamed from: b */
    public final NavigableMap<Cut<K>, RangeMapEntry<K, V>> f21611b = new TreeMap();

    /* renamed from: com.google.common.collect.TreeRangeMap$1 */
    public class C17961 implements RangeMap {
        @Override // com.google.common.collect.RangeMap
        /* renamed from: a */
        public Map<Range, Object> mo11665a() {
            return Collections.emptyMap();
        }
    }

    public final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {

        /* renamed from: b */
        public final Iterable<Map.Entry<Range<K>, V>> f21612b;

        public AsMapOfRanges(Iterable<RangeMapEntry<K, V>> iterable) {
            this.f21612b = iterable;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<Range<K>, V>> mo11420a() {
            return this.f21612b.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            RangeMapEntry rangeMapEntry = (RangeMapEntry) TreeRangeMap.this.f21611b.get(range.f21404b);
            if (rangeMapEntry == null || !rangeMapEntry.f21614b.equals(range)) {
                return null;
            }
            return rangeMapEntry.f21615c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return TreeRangeMap.this.f21611b.size();
        }
    }

    public static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {

        /* renamed from: b */
        public final Range<K> f21614b;

        /* renamed from: c */
        public final V f21615c;

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Object getKey() {
            return this.f21614b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.f21615c;
        }
    }

    public class SubRangeMap implements RangeMap<K, V> {

        /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1 */
        class C17971 extends TreeRangeMap<Comparable, Object>.SubRangeMap.SubRangeMapAsMap {

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1$1, reason: invalid class name */
            public class AnonymousClass1 extends AbstractIterator<Map.Entry<Range<Comparable>, Object>> {

                /* renamed from: d */
                public final /* synthetic */ Iterator f21616d;

                /* renamed from: e */
                public final /* synthetic */ C17971 f21617e;

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Map.Entry<Range<Comparable>, Object> mo11332a() {
                    if (!this.f21616d.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Cut<K> cut = ((RangeMapEntry) this.f21616d.next()).f21614b.f21405c;
                    Objects.requireNonNull(this.f21617e);
                    Objects.requireNonNull(null);
                    throw null;
                }
            }

            @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
            /* renamed from: b */
            public Iterator<Map.Entry<Range<Comparable>, Object>> mo11961b() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        public class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$3 */
            public class C18003 extends AbstractIterator<Map.Entry<Range<K>, V>> {

                /* renamed from: d */
                public final /* synthetic */ Iterator f21621d;

                /* renamed from: e */
                public final /* synthetic */ SubRangeMapAsMap f21622e;

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    if (!this.f21621d.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Cut<K> cut = ((RangeMapEntry) this.f21621d.next()).f21614b.f21404b;
                    Objects.requireNonNull(SubRangeMap.this);
                    throw null;
                }
            }

            public SubRangeMapAsMap() {
            }

            /* renamed from: a */
            public static boolean m11962a(SubRangeMapAsMap subRangeMapAsMap, Predicate predicate) {
                Objects.requireNonNull(subRangeMapAsMap);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<Range<K>, V> entry : subRangeMapAsMap.entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    return !arrayList.isEmpty();
                }
                Objects.requireNonNull(SubRangeMap.this);
                throw null;
            }

            /* renamed from: b */
            public Iterator<Map.Entry<Range<K>, V>> mo11961b() {
                Objects.requireNonNull(SubRangeMap.this);
                throw null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                Objects.requireNonNull(SubRangeMap.this);
                throw null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new Maps.EntrySet<Range<K>, V>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.2
                    @Override // com.google.common.collect.Maps.EntrySet
                    /* renamed from: e */
                    public Map<Range<K>, V> mo11359e() {
                        return SubRangeMapAsMap.this;
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<Map.Entry<Range<K>, V>> iterator() {
                        return SubRangeMapAsMap.this.mo11961b();
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.m11962a(SubRangeMapAsMap.this, Predicates.m11203h(Predicates.m11201f(collection)));
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return Iterators.m11719n(iterator());
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
                try {
                    if (!(obj instanceof Range)) {
                        return null;
                    }
                    Objects.requireNonNull(SubRangeMap.this);
                    throw null;
                } catch (ClassCastException unused) {
                    return null;
                }
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new Maps.KeySet<Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.1
                    @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(@NullableDecl Object obj) {
                        return SubRangeMapAsMap.this.remove(obj) != null;
                    }

                    @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.m11962a(SubRangeMapAsMap.this, Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.KEY));
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
                if (get(obj) == null) {
                    return null;
                }
                Objects.requireNonNull(SubRangeMap.this);
                throw null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new Maps.Values<Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.4
                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean removeAll(Collection<?> collection) {
                        return SubRangeMapAsMap.m11962a(SubRangeMapAsMap.this, Predicates.m11199d(Predicates.m11201f(collection), Maps.EntryFunction.VALUE));
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.m11962a(SubRangeMapAsMap.this, Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.VALUE));
                    }
                };
            }
        }

        @Override // com.google.common.collect.RangeMap
        /* renamed from: a */
        public Map<Range<K>, V> mo11665a() {
            return new SubRangeMapAsMap();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof RangeMap) {
                return new SubRangeMapAsMap().equals(((RangeMap) obj).mo11665a());
            }
            return false;
        }

        public int hashCode() {
            return new SubRangeMapAsMap().hashCode();
        }

        public String toString() {
            return new SubRangeMapAsMap().toString();
        }
    }

    @Override // com.google.common.collect.RangeMap
    /* renamed from: a */
    public Map<Range<K>, V> mo11665a() {
        return new AsMapOfRanges(this.f21611b.values());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof RangeMap)) {
            return false;
        }
        return ((AbstractMap) mo11665a()).equals(((RangeMap) obj).mo11665a());
    }

    public int hashCode() {
        return ((AbstractMap) mo11665a()).hashCode();
    }

    public String toString() {
        return this.f21611b.values().toString();
    }
}

package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
/* loaded from: classes.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* renamed from: h */
    public static final ImmutableSortedMap<Comparable, Object> f21092h;

    /* renamed from: e */
    public final transient RegularImmutableSortedSet<K> f21093e;

    /* renamed from: f */
    public final transient ImmutableList<V> f21094f;

    /* renamed from: g */
    public transient ImmutableSortedMap<K, V> f21095g;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1 */
    class C16661 implements Comparator<Map.Entry<Object, Object>> {
        @Override // java.util.Comparator
        public int compare(Map.Entry<Object, Object> entry, Map.Entry<Object, Object> entry2) {
            entry.getKey();
            entry2.getKey();
            throw null;
        }
    }

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* renamed from: c */
        public transient Object[] f21098c;

        /* renamed from: d */
        public transient Object[] f21099d;

        @Override // com.google.common.collect.ImmutableMap.Builder
        /* renamed from: a */
        public ImmutableMap mo11613a() {
            int i2 = this.f21044b;
            if (i2 == 0) {
                return ImmutableSortedMap.m11683o(null);
            }
            if (i2 == 1) {
                Object obj = this.f21098c[0];
                Object obj2 = this.f21099d[0];
                ImmutableList.m11628E(obj);
                Objects.requireNonNull(null);
                throw null;
            }
            Object[] copyOf = Arrays.copyOf(this.f21098c, i2);
            Arrays.sort(copyOf, null);
            int i3 = this.f21044b;
            Object[] objArr = new Object[i3];
            for (int i4 = 0; i4 < this.f21044b; i4++) {
                if (i4 > 0) {
                    Object obj3 = copyOf[i4 - 1];
                    Object obj4 = copyOf[i4];
                    throw null;
                }
                objArr[Arrays.binarySearch(copyOf, this.f21098c[i4], null)] = this.f21099d[i4];
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.m11631t(copyOf), null), ImmutableList.m11632u(objArr, i3));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: c */
        public ImmutableMap.Builder mo11614c(Object obj, Object obj2) {
            int i2 = this.f21044b + 1;
            Object[] objArr = this.f21098c;
            if (i2 > objArr.length) {
                int m11624a = ImmutableCollection.Builder.m11624a(objArr.length, i2);
                this.f21098c = Arrays.copyOf(this.f21098c, m11624a);
                this.f21099d = Arrays.copyOf(this.f21099d, m11624a);
            }
            CollectPreconditions.m11426a(obj, obj2);
            Object[] objArr2 = this.f21098c;
            int i3 = this.f21044b;
            objArr2[i3] = obj;
            this.f21099d[i3] = obj2;
            this.f21044b = i3 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: d */
        public ImmutableMap.Builder mo11615d(Map.Entry entry) {
            super.mo11615d(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        /* renamed from: e */
        public ImmutableMap.Builder mo11616e(Iterable iterable) {
            super.mo11616e(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        /* renamed from: f */
        public ImmutableMap.Builder mo11617f(Map map) {
            super.mo11617f(map);
            return this;
        }
    }

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
    }

    static {
        RegularImmutableSortedSet m11692J = ImmutableSortedSet.m11692J(NaturalOrdering.f21382d);
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        f21092h = new ImmutableSortedMap<>(m11692J, RegularImmutableList.f21423f);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this.f21093e = regularImmutableSortedSet;
        this.f21094f = immutableList;
        this.f21095g = null;
    }

    /* renamed from: o */
    public static <K, V> ImmutableSortedMap<K, V> m11683o(Comparator<? super K> comparator) {
        return NaturalOrdering.f21382d.equals(comparator) ? (ImmutableSortedMap<K, V>) f21092h : new ImmutableSortedMap<>(ImmutableSortedSet.m11692J(comparator), RegularImmutableList.f21423f);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: c */
    public ImmutableSet<Map.Entry<K, V>> mo11652c() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
                @Override // com.google.common.collect.ImmutableMapEntrySet
                /* renamed from: F */
                public ImmutableMap<K, V> mo11657F() {
                    return ImmutableSortedMap.this;
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* renamed from: s */
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return mo11543b().listIterator();
                }

                @Override // com.google.common.collect.ImmutableSet
                /* renamed from: z */
                public ImmutableList<Map.Entry<K, V>> mo11658z() {
                    return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                        @Override // java.util.List
                        public Object get(int i2) {
                            return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f21093e.f21458g.get(i2), ImmutableSortedMap.this.f21094f.get(i2));
                        }

                        @Override // com.google.common.collect.ImmutableCollection
                        /* renamed from: r */
                        public boolean mo11425r() {
                            return true;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                            return ImmutableSortedMap.this.size();
                        }
                    };
                }
            };
        }
        int i2 = ImmutableSet.f21087d;
        return RegularImmutableSet.f21445j;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return m11687s(k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return (K) Maps.m11790g(m11687s(k2, true).firstEntry());
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return this.f21093e.f21105e;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: d */
    public ImmutableSet<K> mo11523d() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return this.f21093e.descendingSet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f21095g;
        return immutableSortedMap == null ? isEmpty() ? m11683o(Ordering.m11854a(this.f21093e.f21105e).mo11416h()) : new ImmutableSortedMap((RegularImmutableSortedSet) this.f21093e.descendingSet(), this.f21094f.mo11638G(), this) : immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: f */
    public ImmutableCollection<V> mo11609f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().mo11543b().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return this.f21093e.first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k2) {
        return headMap(k2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return (K) Maps.m11790g(headMap(k2, true).lastEntry());
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: g */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r4 >= 0) goto L9;
     */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
        /*
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r3.f21093e
            java.util.Objects.requireNonNull(r0)
            r1 = -1
            if (r4 != 0) goto L9
            goto L14
        L9:
            com.google.common.collect.ImmutableList<E> r2 = r0.f21458g     // Catch: java.lang.ClassCastException -> L14
            java.util.Comparator<? super E> r0 = r0.f21105e     // Catch: java.lang.ClassCastException -> L14
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L14
            if (r4 < 0) goto L14
            goto L15
        L14:
            r4 = -1
        L15:
            if (r4 != r1) goto L19
            r4 = 0
            goto L1f
        L19:
            com.google.common.collect.ImmutableList<V> r0 = r3.f21094f
            java.lang.Object r4 = r0.get(r4)
        L1f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
        return m11687s(k2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return (K) Maps.m11790g(m11687s(k2, false).firstEntry());
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: i */
    public boolean mo11520i() {
        return this.f21093e.mo11425r() || this.f21094f.mo11425r();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: k */
    public ImmutableSet keySet() {
        return this.f21093e;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Set keySet() {
        return this.f21093e;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().mo11543b().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return this.f21093e.last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k2) {
        return headMap(k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return (K) Maps.m11790g(headMap(k2, false).lastEntry());
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: n */
    public ImmutableCollection<V> values() {
        return this.f21094f;
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        return this.f21093e;
    }

    /* renamed from: p */
    public final ImmutableSortedMap<K, V> m11684p(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 == i3 ? m11683o(this.f21093e.f21105e) : new ImmutableSortedMap<>(this.f21093e.m11879W(i2, i3), this.f21094f.subList(i2, i3));
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> headMap(K k2, boolean z) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.f21093e;
        Objects.requireNonNull(k2);
        int binarySearch = Collections.binarySearch(regularImmutableSortedSet.f21458g, k2, regularImmutableSortedSet.f21105e);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else if (z) {
            binarySearch++;
        }
        return m11684p(0, binarySearch);
    }

    @Override // java.util.NavigableMap
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        Objects.requireNonNull(k2);
        Objects.requireNonNull(k3);
        Preconditions.m11185i(this.f21093e.f21105e.compare(k2, k3) <= 0, "expected fromKey <= toKey but %s > %s", k2, k3);
        ImmutableSortedMap<K, V> headMap = headMap(k3, z2);
        return headMap.m11684p(headMap.f21093e.m11881a0(k2, z), headMap.size());
    }

    /* renamed from: s */
    public ImmutableSortedMap<K, V> m11687s(K k2, boolean z) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.f21093e;
        Objects.requireNonNull(k2);
        return m11684p(regularImmutableSortedSet.m11881a0(k2, z), size());
    }

    @Override // java.util.Map
    public int size() {
        return this.f21094f.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return m11687s(obj, true);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Collection values() {
        return this.f21094f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap tailMap(Object obj, boolean z) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.f21093e;
        Objects.requireNonNull(obj);
        return m11684p(regularImmutableSortedSet.m11881a0(obj, z), size());
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f21093e = regularImmutableSortedSet;
        this.f21094f = immutableList;
        this.f21095g = immutableSortedMap;
    }
}

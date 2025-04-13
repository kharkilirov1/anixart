package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b */
    @RetainedWith
    @LazyInit
    public transient ImmutableSet<Map.Entry<K, V>> f21039b;

    /* renamed from: c */
    @RetainedWith
    @LazyInit
    public transient ImmutableSet<K> f21040c;

    /* renamed from: d */
    @RetainedWith
    @LazyInit
    public transient ImmutableCollection<V> f21041d;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a */
        public Object[] f21043a;

        /* renamed from: b */
        public int f21044b;

        public Builder() {
            this(4);
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo11613a() {
            return RegularImmutableMap.m11874o(this.f21044b, this.f21043a);
        }

        /* renamed from: b */
        public final void m11656b(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f21043a;
            if (i3 > objArr.length) {
                this.f21043a = Arrays.copyOf(objArr, ImmutableCollection.Builder.m11624a(objArr.length, i3));
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder<K, V> mo11614c(K k2, V v) {
            m11656b(this.f21044b + 1);
            CollectPreconditions.m11426a(k2, v);
            Object[] objArr = this.f21043a;
            int i2 = this.f21044b;
            objArr[i2 * 2] = k2;
            objArr[(i2 * 2) + 1] = v;
            this.f21044b = i2 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder<K, V> mo11615d(Map.Entry<? extends K, ? extends V> entry) {
            return mo11614c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: e */
        public Builder<K, V> mo11616e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m11656b(((Collection) iterable).size() + this.f21044b);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo11615d(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder<K, V> mo11617f(Map<? extends K, ? extends V> map) {
            return mo11616e(map.entrySet());
        }

        public Builder(int i2) {
            this.f21043a = new Object[i2 * 2];
            this.f21044b = 0;
        }
    }

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: c */
        public ImmutableSet<Map.Entry<K, V>> mo11652c() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                /* renamed from: F */
                public ImmutableMap<K, V> mo11657F() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* renamed from: s */
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.mo11524o();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: d */
        public ImmutableSet<K> mo11523d() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: f */
        public ImmutableCollection<V> mo11609f() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        /* renamed from: o */
        public abstract UnmodifiableIterator<Map.Entry<K, V>> mo11524o();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1 */
        public class C16551 extends UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> {

            /* renamed from: b */
            public final /* synthetic */ Iterator f21046b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21046b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                final Map.Entry entry = (Map.Entry) this.f21046b.next();
                return new AbstractMapEntry<Object, ImmutableSet<Object>>() { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                    public Object getKey() {
                        return entry.getKey();
                    }

                    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                    public Object getValue() {
                        Object value = entry.getValue();
                        int i2 = ImmutableSet.f21087d;
                        return new SingletonImmutableSet(value);
                    }
                };
            }
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        /* renamed from: d */
        public ImmutableSet<K> mo11523d() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public Object get(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: h */
        public boolean mo11654h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        public boolean mo11520i() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        /* renamed from: o */
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> mo11524o() {
            throw null;
        }

        @Override // java.util.Map
        public int size() {
            throw null;
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
    }

    /* renamed from: a */
    public static <K, V> Builder<K, V> m11648a() {
        return new Builder<>(4);
    }

    /* renamed from: b */
    public static <K, V> ImmutableMap<K, V> m11649b(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.mo11520i()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        Builder builder = new Builder(entrySet instanceof Collection ? entrySet.size() : 4);
        builder.mo11616e(entrySet);
        return builder.mo11613a();
    }

    /* renamed from: l */
    public static <K, V> ImmutableMap<K, V> m11650l() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f21426h;
    }

    /* renamed from: m */
    public static <K, V> ImmutableMap<K, V> m11651m(K k2, V v) {
        CollectPreconditions.m11426a(null, v);
        throw null;
    }

    /* renamed from: c */
    public abstract ImmutableSet<Map.Entry<K, V>> mo11652c();

    @Override // java.util.Map
    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract ImmutableSet<K> mo11523d();

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return Maps.m11788e(this, obj);
    }

    /* renamed from: f */
    public abstract ImmutableCollection<V> mo11609f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f21039b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> mo11652c = mo11652c();
        this.f21039b = mo11652c;
        return mo11652c;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public boolean mo11654h() {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.m11887e(entrySet());
    }

    /* renamed from: i */
    public abstract boolean mo11520i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public UnmodifiableIterator<K> mo11625j() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>() { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return UnmodifiableIterator.this.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) UnmodifiableIterator.this.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f21040c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> mo11523d = mo11523d();
        this.f21040c = mo11523d;
        return mo11523d;
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f21041d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> mo11609f = mo11609f();
        this.f21041d = mo11609f;
        return mo11609f;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m11794k(this);
    }
}

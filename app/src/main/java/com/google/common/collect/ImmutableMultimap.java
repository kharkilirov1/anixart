package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {

    /* renamed from: f */
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f21052f;

    /* renamed from: g */
    public final transient int f21053g;

    /* renamed from: com.google.common.collect.ImmutableMultimap$1 */
    public class C16581 extends UnmodifiableIterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f21054b;

        /* renamed from: c */
        public K f21055c = null;

        /* renamed from: d */
        public Iterator<V> f21056d = Iterators.ArrayItr.f21133f;

        public C16581(ImmutableMultimap immutableMultimap) {
            this.f21054b = immutableMultimap.f21052f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21056d.hasNext() || this.f21054b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21056d.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f21054b.next();
                this.f21055c = next.getKey();
                this.f21056d = next.getValue().iterator();
            }
            return new ImmutableEntry(this.f21055c, this.f21056d.next());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$2 */
    class C16592 extends UnmodifiableIterator<Object> {

        /* renamed from: b */
        public Iterator<? extends ImmutableCollection<Object>> f21057b;

        /* renamed from: c */
        public Iterator<Object> f21058c = Iterators.ArrayItr.f21133f;

        public C16592(ImmutableMultimap immutableMultimap) {
            this.f21057b = immutableMultimap.f21052f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21058c.hasNext() || this.f21057b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21058c.hasNext()) {
                this.f21058c = this.f21057b.next().iterator();
            }
            return this.f21058c.next();
        }
    }

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a */
        public Map<K, Collection<V>> f21059a = new CompactHashMap();
    }

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {

        /* renamed from: c */
        @Weak
        public final ImmutableMultimap<K, V> f21060c;

        public EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.f21060c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f21060c.mo11385F(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return this.f21060c.f21052f.mo11520i();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: s */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            ImmutableMultimap<K, V> immutableMultimap = this.f21060c;
            Objects.requireNonNull(immutableMultimap);
            return new C16581(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f21060c.f21053g;
        }
    }

    @GwtIncompatible
    public static class FieldSettersHolder {
        static {
            Serialization.m11882a(ImmutableMultimap.class, "map");
            Serialization.m11882a(ImmutableMultimap.class, "size");
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        /* renamed from: l */
        public Set mo11389l() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
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

        @Override // com.google.common.collect.ImmutableMultiset
        /* renamed from: u */
        public ImmutableSet<K> mo11389l() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMultiset
        /* renamed from: y */
        public Multiset.Entry<K> mo11531y(int i2) {
            throw null;
        }
    }

    @GwtIncompatible
    public static final class KeysSerializedForm implements Serializable {
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {

        /* renamed from: c */
        @Weak
        public final transient ImmutableMultimap<K, V> f21061c;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f21061c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f21061c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        /* renamed from: d */
        public int mo11618d(Object[] objArr, int i2) {
            UnmodifiableIterator<? extends ImmutableCollection<V>> it = this.f21061c.f21052f.values().iterator();
            while (it.hasNext()) {
                i2 = it.next().mo11618d(objArr, i2);
            }
            return i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: s */
        public UnmodifiableIterator<V> iterator() {
            ImmutableMultimap<K, V> immutableMultimap = this.f21061c;
            Objects.requireNonNull(immutableMultimap);
            return new C16592(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f21061c.f21053g;
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i2) {
        this.f21052f = immutableMap;
        this.f21053g = i2;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: E */
    public Map mo11334E() {
        return this.f21052f;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f21052f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection mo11347d() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    public Collection mo11349g() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator mo11350h() {
        return new C16581(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: i */
    public Iterator mo11351i() {
        return new C16592(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<Map.Entry<K, V>> mo11345b() {
        return (ImmutableCollection) super.mo11345b();
    }

    /* renamed from: k */
    public UnmodifiableIterator<Map.Entry<K, V>> m11660k() {
        return new C16581(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set keySet() {
        return this.f21052f.keySet();
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection<V> get(K k2);

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @Deprecated
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f21053g;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection values() {
        return (ImmutableCollection) super.values();
    }
}

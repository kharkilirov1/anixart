package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
/* loaded from: classes.dex */
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    /* renamed from: b */
    @NullableDecl
    @LazyInit
    public transient Collection<Map.Entry<K, V>> f20838b;

    /* renamed from: c */
    @NullableDecl
    @LazyInit
    public transient Set<K> f20839c;

    /* renamed from: d */
    @NullableDecl
    @LazyInit
    public transient Collection<V> f20840d;

    /* renamed from: e */
    @NullableDecl
    @LazyInit
    public transient Map<K, Collection<V>> f20841e;

    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        /* renamed from: b */
        public Multimap<K, V> mo11386b() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.mo11350h();
        }
    }

    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public EntrySet(AbstractMultimap abstractMultimap) {
            super();
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

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractMultimap.this.mo11351i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: E */
    public Map<K, Collection<V>> mo11334E() {
        Map<K, Collection<V>> map = this.f20841e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mo11346c = mo11346c();
        this.f20841e = mo11346c;
        return mo11346c;
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: F */
    public boolean mo11385F(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = mo11334E().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo11345b() {
        Collection<Map.Entry<K, V>> collection = this.f20838b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> mo11347d = mo11347d();
        this.f20838b = mo11347d;
        return mo11347d;
    }

    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo11346c();

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = mo11334E().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public abstract Collection<Map.Entry<K, V>> mo11347d();

    /* renamed from: e */
    public abstract Set<K> mo11348e();

    @Override // com.google.common.collect.Multimap
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return mo11334E().equals(((Multimap) obj).mo11334E());
        }
        return false;
    }

    /* renamed from: g */
    public abstract Collection<V> mo11349g();

    /* renamed from: h */
    public abstract Iterator<Map.Entry<K, V>> mo11350h();

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return mo11334E().hashCode();
    }

    /* renamed from: i */
    public Iterator<V> mo11351i() {
        return new Maps.C17092(mo11345b().iterator());
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        Set<K> set = this.f20839c;
        if (set != null) {
            return set;
        }
        Set<K> mo11348e = mo11348e();
        this.f20839c = mo11348e;
        return mo11348e;
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        return get(k2).add(v);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = mo11334E().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo11334E().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        Collection<V> collection = this.f20840d;
        if (collection != null) {
            return collection;
        }
        Collection<V> mo11349g = mo11349g();
        this.f20840d = mo11349g;
        return mo11349g;
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: b */
    @NullableDecl
    public transient Set<K> f20776b;

    /* renamed from: com.google.common.collect.AbstractBiMap$1 */
    class C16141 implements Iterator<Map.Entry<Object, Object>> {

        /* renamed from: b */
        @NullableDecl
        public Map.Entry<Object, Object> f20777b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f20778c;

        /* renamed from: d */
        public final /* synthetic */ AbstractBiMap f20779d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20778c.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> entry = (Map.Entry) this.f20778c.next();
            this.f20777b = entry;
            return new BiMapEntry(entry);
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f20777b != null, "no calls to next() since the last call to remove()");
            this.f20777b.getValue();
            this.f20778c.remove();
            Objects.requireNonNull(this.f20779d);
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* renamed from: b */
        public final Map.Entry<K, V> f20780b;

        public BiMapEntry(Map.Entry<K, V> entry) {
            this.f20780b = entry;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f20780b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry
        /* renamed from: H */
        public Map.Entry<K, V> mo7455G() {
            return this.f20780b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            AbstractBiMap.this.mo11327K(v);
            Preconditions.m11192p(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.Objects.m11173a(v, getValue())) {
                return v;
            }
            Preconditions.m11184h(!AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            this.f20780b.setValue(v);
            Preconditions.m11192p(com.google.common.base.Objects.m11173a(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            getKey();
            Objects.requireNonNull(abstractBiMap);
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        public EntrySet(C16141 c16141) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Collection mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set<Map.Entry<K, V>> mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Maps.m11796m((Map.Entry) obj);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return Collections2.m11431b(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            Objects.requireNonNull(AbstractBiMap.this);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return m11570L(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return Iterators.m11718m(iterator(), collection);
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

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.AbstractBiMap
        /* renamed from: J */
        public K mo11326J(K k2) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractBiMap
        /* renamed from: K */
        public V mo11327K(V v) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public class KeySet extends ForwardingSet<K> {
        public KeySet(C16141 c16141) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            mo11329H();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Collection mo11329H() {
            mo11329H();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set<K> mo11329H() {
            Objects.requireNonNull(AbstractBiMap.this);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new Maps.C17041(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Objects.requireNonNull(AbstractBiMap.this);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return m11570L(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return Iterators.m11718m(iterator(), collection);
        }
    }

    public class ValueSet extends ForwardingSet<V> {
        public ValueSet(C16141 c16141) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Collection mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set<V> mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Maps.C17092(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ObjectArrays.m11830d(this, tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return m11560J();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m11559I();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Object mo7455G() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: H */
    public Map<K, V> mo7456H() {
        return null;
    }

    @CanIgnoreReturnValue
    /* renamed from: J */
    public K mo11326J(@NullableDecl K k2) {
        return k2;
    }

    @CanIgnoreReturnValue
    /* renamed from: K */
    public V mo11327K(@NullableDecl V v) {
        return v;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        new EntrySet(null);
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20776b;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet(null);
        this.f20776b = keySet;
        return keySet;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        mo11326J(k2);
        mo11327K(v);
        if (containsKey(k2) && com.google.common.base.Objects.m11173a(v, get(k2))) {
            return v;
        }
        Preconditions.m11184h(!containsValue(v), "value already present: %s", v);
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (containsKey(obj)) {
            throw null;
        }
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<V> values() {
        new ValueSet(null);
        throw null;
    }
}

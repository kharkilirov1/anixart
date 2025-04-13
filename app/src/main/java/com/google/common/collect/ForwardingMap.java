package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    @Beta
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        @Override // com.google.common.collect.Maps.EntrySet
        /* renamed from: e */
        public Map<K, V> mo11359e() {
            return null;
        }
    }

    @Beta
    public class StandardKeySet extends Maps.KeySet<K, V> {
    }

    @Beta
    public class StandardValues extends Maps.Values<K, V> {
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H */
    public abstract Map<K, V> mo7456H();

    /* renamed from: I */
    public boolean m11565I(@NullableDecl Object obj) {
        return Iterators.m11709d(new Maps.C17092(entrySet().iterator()), obj);
    }

    public void clear() {
        mo7456H().clear();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return mo7456H().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return mo7456H().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo7456H().entrySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || mo7456H().equals(obj);
    }

    public V get(@NullableDecl Object obj) {
        return mo7456H().get(obj);
    }

    public int hashCode() {
        return mo7456H().hashCode();
    }

    public boolean isEmpty() {
        return mo7456H().isEmpty();
    }

    public Set<K> keySet() {
        return mo7456H().keySet();
    }

    @CanIgnoreReturnValue
    public V put(K k2, V v) {
        return mo7456H().put(k2, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo7456H().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return mo7456H().remove(obj);
    }

    public int size() {
        return mo7456H().size();
    }

    public Collection<V> values() {
        return mo7456H().values();
    }
}

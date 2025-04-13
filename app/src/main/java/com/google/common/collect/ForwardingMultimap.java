package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    /* renamed from: E */
    public Map<K, Collection<V>> mo11334E() {
        return mo7455G().mo11334E();
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: F */
    public boolean mo11385F(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return mo7455G().mo11385F(obj, obj2);
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Multimap<K, V> mo7455G();

    @CanIgnoreReturnValue
    /* renamed from: a */
    public Collection<V> mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo11345b() {
        return mo7455G().mo11345b();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        mo7455G().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return mo7455G().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || mo7455G().equals(obj);
    }

    public Collection<V> get(@NullableDecl K k2) {
        return mo7455G().get(k2);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return mo7455G().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return mo7455G().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        return mo7455G().keySet();
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(K k2, V v) {
        return mo7455G().put(k2, v);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return mo7455G().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return mo7455G().size();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        return mo7455G().values();
    }
}

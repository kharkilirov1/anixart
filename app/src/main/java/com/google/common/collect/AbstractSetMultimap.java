package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    public AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: E */
    public Map<K, Collection<V>> mo11334E() {
        return super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(@NullableDecl Object obj) {
        return get((AbstractSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        return super.put(k2, v);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: t */
    public <E> Collection<E> mo11338t(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: u */
    public Collection<V> mo11339u(K k2, Collection<V> collection) {
        return new AbstractMapBasedMultimap.WrappedSet(k2, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> mo11336n();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Set<V> mo11337r() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Set<V> mo11335a(@NullableDecl Object obj) {
        return (Set) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo11345b() {
        return (Set) super.mo11345b();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public Set<V> get(@NullableDecl K k2) {
        return (Set) super.get((AbstractSetMultimap<K, V>) k2);
    }
}

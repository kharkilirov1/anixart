package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: E */
    public Map<K, Collection<V>> mo11334E() {
        return super.mo11334E();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Collection mo11335a(@NullableDecl Object obj) {
        return (List) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public Collection get(@NullableDecl Object obj) {
        return (List) super.get((AbstractListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        return super.put(k2, v);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: r */
    public Collection mo11337r() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: t */
    public <E> Collection<E> mo11338t(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: u */
    public Collection<V> mo11339u(K k2, Collection<V> collection) {
        return m11355v(k2, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract List<V> mo11336n();

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public List<V> mo11335a(@NullableDecl Object obj) {
        return (List) super.mo11335a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public List<V> get(@NullableDecl K k2) {
        return (List) super.get((AbstractListMultimap<K, V>) k2);
    }
}

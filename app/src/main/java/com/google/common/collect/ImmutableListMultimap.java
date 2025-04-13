package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i2) {
        super(immutableMap, i2);
    }

    /* renamed from: o */
    public static <K, V> ImmutableListMultimap<K, V> m11643o() {
        return EmptyImmutableListMultimap.f20959h;
    }

    /* renamed from: p */
    public static <K, V> ImmutableListMultimap<K, V> m11644p(K k2, V v) {
        Builder builder = new Builder();
        CollectPreconditions.m11426a(k2, v);
        Collection<V> collection = builder.f21059a.get(k2);
        if (collection == null) {
            Map<K, Collection<V>> map = builder.f21059a;
            ArrayList arrayList = new ArrayList();
            map.put(k2, arrayList);
            collection = arrayList;
        }
        collection.add(v);
        Set<Map.Entry<K, Collection<V>>> entrySet = builder.f21059a.entrySet();
        if (entrySet.isEmpty()) {
            return EmptyImmutableListMultimap.f20959h;
        }
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(entrySet.size());
        int i2 = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            ImmutableList m11634y = ImmutableList.m11634y(entry.getValue());
            if (!m11634y.isEmpty()) {
                builder2.mo11614c(key, m11634y);
                i2 += m11634y.size();
            }
        }
        return new ImmutableListMultimap<>(builder2.mo11613a(), i2);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: a */
    public Collection mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: m */
    public ImmutableCollection mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableList<V> get(@NullableDecl K k2) {
        ImmutableList<V> immutableList = (ImmutableList) this.f21052f.get(k2);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        return (ImmutableList<V>) RegularImmutableList.f21423f;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: a */
    public List mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }
}

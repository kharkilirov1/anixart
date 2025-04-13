package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingSetMultimap
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract SortedSetMultimap<K, V> mo7455G();

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public Collection get(@NullableDecl Object obj) {
        return mo7455G().get((SortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public Set mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public Set get(@NullableDecl Object obj) {
        return mo7455G().get((SortedSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    /* renamed from: a */
    public SortedSet<V> mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public SortedSet<V> get(@NullableDecl K k2) {
        return mo7455G().get((SortedSetMultimap<K, V>) k2);
    }
}

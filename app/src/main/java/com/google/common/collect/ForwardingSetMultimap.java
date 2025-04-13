package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public abstract SetMultimap<K, V> mo7455G();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(@NullableDecl Object obj) {
        return get((ForwardingSetMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Set<V> mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo11345b() {
        return mo7455G().mo11345b();
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public Set<V> get(@NullableDecl K k2) {
        return mo7455G().get((SetMultimap<K, V>) k2);
    }
}

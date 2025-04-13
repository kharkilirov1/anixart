package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingMultimap
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public abstract ListMultimap<K, V> mo7455G();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public Collection mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public Collection get(@NullableDecl Object obj) {
        return mo7455G().get((ListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public List<V> mo11335a(@NullableDecl Object obj) {
        return mo7455G().mo11335a(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public List<V> get(@NullableDecl K k2) {
        return mo7455G().get((ListMultimap<K, V>) k2);
    }
}

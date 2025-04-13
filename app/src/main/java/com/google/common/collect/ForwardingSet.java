package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Set<E> mo7455G();

    /* renamed from: L */
    public boolean m11570L(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return Sets.m11891i(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        return obj == this || mo11329H().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mo11329H().hashCode();
    }
}

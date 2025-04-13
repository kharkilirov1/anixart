package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;

@GwtCompatible
/* loaded from: classes.dex */
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @GwtIncompatible
    public static class SerializedForm implements Serializable {
    }

    /* renamed from: J */
    public abstract ImmutableCollection<E> mo11608J();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return mo11608J().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return mo11608J().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return mo11608J().mo11425r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return mo11608J().size();
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

@GwtCompatible
/* loaded from: classes.dex */
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        return mo11543b().mo11618d(objArr, i2);
    }

    public abstract E get(int i2);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return mo11543b().listIterator();
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: z */
    public ImmutableList<E> mo11658z() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public E get(int i2) {
                return (E) IndexedImmutableSet.this.get(i2);
            }

            @Override // com.google.common.collect.ImmutableCollection
            /* renamed from: r */
            public boolean mo11425r() {
                return IndexedImmutableSet.this.mo11425r();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }
}

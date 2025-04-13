package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ListIterator;

@GwtCompatible
/* loaded from: classes.dex */
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    @Override // com.google.common.collect.ImmutableList
    /* renamed from: C */
    public UnmodifiableListIterator<E> listIterator(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableAsList
    /* renamed from: J */
    public ImmutableCollection<E> mo11608J() {
        return null;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public Object[] mo11619e() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: f */
    public int mo11620f() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: g */
    public int mo11621g() {
        throw null;
    }

    @Override // java.util.List
    public E get(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public ListIterator listIterator(int i2) {
        throw null;
    }
}

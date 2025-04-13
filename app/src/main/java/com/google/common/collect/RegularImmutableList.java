package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@GwtCompatible
/* loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: f */
    public static final ImmutableList<Object> f21423f = new RegularImmutableList(new Object[0], 0);

    /* renamed from: d */
    @VisibleForTesting
    public final transient Object[] f21424d;

    /* renamed from: e */
    public final transient int f21425e;

    public RegularImmutableList(Object[] objArr, int i2) {
        this.f21424d = objArr;
        this.f21425e = i2;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        System.arraycopy(this.f21424d, 0, objArr, i2, this.f21425e);
        return i2 + this.f21425e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public Object[] mo11619e() {
        return this.f21424d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: f */
    public int mo11620f() {
        return this.f21425e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: g */
    public int mo11621g() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i2) {
        Preconditions.m11186j(i2, this.f21425e);
        return (E) this.f21424d[i2];
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21425e;
    }
}

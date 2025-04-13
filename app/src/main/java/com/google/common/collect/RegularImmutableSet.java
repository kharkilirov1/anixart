package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: j */
    public static final RegularImmutableSet<Object> f21445j = new RegularImmutableSet<>(new Object[0], 0, null, 0, 0);

    /* renamed from: e */
    @VisibleForTesting
    public final transient Object[] f21446e;

    /* renamed from: f */
    @VisibleForTesting
    public final transient Object[] f21447f;

    /* renamed from: g */
    public final transient int f21448g;

    /* renamed from: h */
    public final transient int f21449h;

    /* renamed from: i */
    public final transient int f21450i;

    public RegularImmutableSet(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f21446e = objArr;
        this.f21447f = objArr2;
        this.f21448g = i3;
        this.f21449h = i2;
        this.f21450i = i4;
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: A */
    public boolean mo11626A() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f21447f;
        if (obj == null || objArr == null) {
            return false;
        }
        int m11607c = Hashing.m11607c(obj);
        while (true) {
            int i2 = m11607c & this.f21448g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m11607c = i2 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        System.arraycopy(this.f21446e, 0, objArr, i2, this.f21450i);
        return i2 + this.f21450i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public Object[] mo11619e() {
        return this.f21446e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: f */
    public int mo11620f() {
        return this.f21450i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: g */
    public int mo11621g() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f21449h;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return mo11543b().listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21450i;
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: z */
    public ImmutableList<E> mo11658z() {
        return ImmutableList.m11632u(this.f21446e, this.f21450i);
    }
}

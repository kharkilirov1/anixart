package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* renamed from: g */
    @NullableDecl
    public transient int[] f20923g;

    /* renamed from: h */
    @NullableDecl
    public transient int[] f20924h;

    /* renamed from: i */
    public transient int f20925i;

    /* renamed from: j */
    public transient int f20926j;

    public CompactLinkedHashSet() {
    }

    /* renamed from: C */
    public final void m11478C(int i2, int i3) {
        if (i2 == -2) {
            this.f20925i = i3;
        } else {
            this.f20924h[i2] = i3 + 1;
        }
        if (i3 == -2) {
            this.f20926j = i2;
        } else {
            this.f20923g[i3] = i2 + 1;
        }
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: a */
    public int mo11456a(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: b */
    public int mo11457b() {
        int mo11457b = super.mo11457b();
        this.f20923g = new int[mo11457b];
        this.f20924h = new int[mo11457b];
        return mo11457b;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m11467y()) {
            return;
        }
        this.f20925i = -2;
        this.f20926j = -2;
        int[] iArr = this.f20923g;
        if (iArr != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f20924h, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    @CanIgnoreReturnValue
    /* renamed from: d */
    public Set<E> mo11458d() {
        Set<E> mo11458d = super.mo11458d();
        this.f20923g = null;
        this.f20924h = null;
        return mo11458d;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: f */
    public int mo11460f() {
        return this.f20925i;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: g */
    public int mo11461g(int i2) {
        return this.f20924h[i2] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: t */
    public void mo11464t(int i2) {
        super.mo11464t(i2);
        this.f20925i = -2;
        this.f20926j = -2;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        ObjectArrays.m11828b(this, objArr);
        return objArr;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: u */
    public void mo11465u(int i2, @NullableDecl E e2, int i3, int i4) {
        this.f20911c[i2] = CompactHashing.m11470b(i3, 0, i4);
        this.f20912d[i2] = e2;
        m11478C(this.f20926j, i2);
        m11478C(i2, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: x */
    public void mo11466x(int i2, int i3) {
        int size = size() - 1;
        super.mo11466x(i2, i3);
        m11478C(this.f20923g[i2] - 1, this.f20924h[i2] - 1);
        if (i2 < size) {
            m11478C(this.f20923g[size] - 1, i2);
            m11478C(i2, mo11461g(size));
        }
        this.f20923g[size] = 0;
        this.f20924h[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    /* renamed from: z */
    public void mo11468z(int i2) {
        this.f20911c = Arrays.copyOf(this.f20911c, i2);
        this.f20912d = Arrays.copyOf(this.f20912d, i2);
        this.f20923g = Arrays.copyOf(this.f20923g, i2);
        this.f20924h = Arrays.copyOf(this.f20924h, i2);
    }

    public CompactLinkedHashSet(int i2) {
        super(i2);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.m11830d(this, tArr);
    }
}

package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: e */
    public final transient E f21492e;

    /* renamed from: f */
    @LazyInit
    public transient int f21493f;

    public SingletonImmutableSet(E e2) {
        Objects.requireNonNull(e2);
        this.f21492e = e2;
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: A */
    public boolean mo11626A() {
        return this.f21493f != 0;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f21492e.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        objArr[i2] = this.f21492e;
        return i2 + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.f21493f;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f21492e.hashCode();
        this.f21493f = hashCode;
        return hashCode;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        final E e2 = this.f21492e;
        return (UnmodifiableIterator<E>) new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.Iterators.9

            /* renamed from: b */
            public boolean f21131b;

            /* renamed from: c */
            public final /* synthetic */ Object f21132c;

            public C16909(final Object e22) {
                r1 = e22;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f21131b;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.f21131b) {
                    throw new NoSuchElementException();
                }
                this.f21131b = true;
                return r1;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f21492e.toString();
        StringBuilder sb = new StringBuilder(C0576a.m4106e(obj, 2));
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: z */
    public ImmutableList<E> mo11658z() {
        return ImmutableList.m11628E(this.f21492e);
    }

    public SingletonImmutableSet(E e2, int i2) {
        this.f21492e = e2;
        this.f21493f = i2;
    }
}

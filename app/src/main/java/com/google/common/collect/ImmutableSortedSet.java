package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, SortedIterable<E> {

    /* renamed from: e */
    public final transient Comparator<? super E> f21105e;

    /* renamed from: f */
    @GwtIncompatible
    @LazyInit
    public transient ImmutableSortedSet<E> f21106f;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSet.Builder
        @CanIgnoreReturnValue
        /* renamed from: d */
        public ImmutableSet.Builder mo11678d(Object obj) {
            super.mo11678d(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        @CanIgnoreReturnValue
        /* renamed from: e */
        public ImmutableSet.Builder mo11679e(Iterator it) {
            Objects.requireNonNull(it);
            while (it.hasNext()) {
                mo11678d(it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        /* renamed from: f */
        public ImmutableSet mo11680f() {
            ImmutableSortedSet m11691F = ImmutableSortedSet.m11691F(null, this.f21029b, this.f21028a);
            this.f21029b = m11691F.size();
            this.f21030c = true;
            return m11691F;
        }
    }

    public static class SerializedForm<E> implements Serializable {
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.f21105e = comparator;
    }

    /* renamed from: F */
    public static <E> ImmutableSortedSet<E> m11691F(Comparator<? super E> comparator, int i2, E... eArr) {
        if (i2 == 0) {
            return m11692J(null);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ObjectArrays.m11827a(eArr[i3], i3);
        }
        Arrays.sort(eArr, 0, i2, null);
        if (1 < i2) {
            E e2 = eArr[1];
            E e3 = eArr[1 - 1];
            throw null;
        }
        Arrays.fill(eArr, 1, i2, (Object) null);
        if (1 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, 1);
        }
        return new RegularImmutableSortedSet(ImmutableList.m11632u(eArr, 1), null);
    }

    /* renamed from: J */
    public static <E> RegularImmutableSortedSet<E> m11692J(Comparator<? super E> comparator) {
        return NaturalOrdering.f21382d.equals(comparator) ? (RegularImmutableSortedSet<E>) RegularImmutableSortedSet.f21457h : new RegularImmutableSortedSet<>(RegularImmutableList.f21423f, comparator);
    }

    @GwtIncompatible
    /* renamed from: G */
    public abstract ImmutableSortedSet<E> mo11489G();

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: H */
    public abstract UnmodifiableIterator<E> descendingIterator();

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f21106f;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> mo11489G = mo11489G();
        this.f21106f = mo11489G;
        mo11489G.f21106f = this;
        return mo11489G;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e2) {
        return headSet(e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> headSet(E e2, boolean z) {
        Objects.requireNonNull(e2);
        return mo11492M(e2, z);
    }

    /* renamed from: M */
    public abstract ImmutableSortedSet<E> mo11492M(E e2, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e2, E e3) {
        return subSet(e2, true, e3, false);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        Objects.requireNonNull(e2);
        Objects.requireNonNull(e3);
        Preconditions.m11178b(this.f21105e.compare(e2, e3) <= 0);
        return mo11495S(e2, z, e3, z2);
    }

    /* renamed from: S */
    public abstract ImmutableSortedSet<E> mo11495S(E e2, boolean z, E e3, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e2) {
        return tailSet(e2, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> tailSet(E e2, boolean z) {
        Objects.requireNonNull(e2);
        return mo11498V(e2, z);
    }

    /* renamed from: V */
    public abstract ImmutableSortedSet<E> mo11498V(E e2, boolean z);

    public E ceiling(E e2) {
        return (E) Iterables.m11699d(tailSet(e2, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.f21105e;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e2) {
        return (E) Iterators.m11714i(headSet(e2, true).descendingIterator(), null);
    }

    @GwtIncompatible
    public E higher(E e2) {
        return (E) Iterables.m11699d(tailSet(e2, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    @GwtIncompatible
    public E lower(E e2) {
        return (E) Iterators.m11714i(headSet(e2, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}

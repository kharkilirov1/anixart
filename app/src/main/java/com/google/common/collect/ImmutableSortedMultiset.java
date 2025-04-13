package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements SortedMultiset<E> {

    /* renamed from: e */
    @LazyInit
    public transient ImmutableSortedMultiset<E> f21100e;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* renamed from: c */
        @VisibleForTesting
        public E[] f21101c;

        /* renamed from: d */
        public int[] f21102d;

        /* renamed from: e */
        public int f21103e;

        /* renamed from: f */
        public boolean f21104f;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        /* renamed from: b */
        public ImmutableMultiset.Builder mo11663b(Object obj) {
            m11689d(obj, 1);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        /* renamed from: c */
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder mo11664c(Object obj, int i2) {
            m11689d(obj, i2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder<E> m11689d(E e2, int i2) {
            Objects.requireNonNull(e2);
            CollectPreconditions.m11427b(i2, "occurrences");
            if (i2 == 0) {
                return this;
            }
            int i3 = this.f21103e;
            E[] eArr = this.f21101c;
            if (i3 == eArr.length) {
                m11690e(true);
            } else if (this.f21104f) {
                this.f21101c = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f21104f = false;
            E[] eArr2 = this.f21101c;
            int i4 = this.f21103e;
            eArr2[i4] = e2;
            this.f21102d[i4] = i2;
            this.f21103e = i4 + 1;
            return this;
        }

        /* renamed from: e */
        public final void m11690e(boolean z) {
            int i2 = this.f21103e;
            if (i2 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f21101c, i2);
            Arrays.sort(objArr, null);
            if (1 < objArr.length) {
                Object obj = objArr[1 - 1];
                Object obj2 = objArr[1];
                throw null;
            }
            Arrays.fill(objArr, 1, this.f21103e, (Object) null);
            if (z) {
                int i3 = 1 * 4;
                int i4 = this.f21103e;
                if (i3 > i4 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, IntMath.m12061d(i4, (i4 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i5 = 0; i5 < this.f21103e; i5++) {
                int binarySearch = Arrays.binarySearch(objArr, 0, 1, this.f21101c[i5], null);
                int[] iArr2 = this.f21102d;
                if (iArr2[i5] >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + iArr2[i5];
                } else {
                    iArr[binarySearch] = ~iArr2[i5];
                }
            }
            this.f21101c = (E[]) objArr;
            this.f21102d = iArr;
            this.f21103e = 1;
        }
    }

    public static final class SerializedForm<E> implements Serializable {
    }

    /* renamed from: C */
    public static <E> ImmutableSortedMultiset<E> m11688C(Comparator<? super E> comparator) {
        return NaturalOrdering.f21382d.equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.f21452k : new RegularImmutableSortedMultiset(comparator);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: A */
    public abstract ImmutableSortedSet<E> mo11389l();

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: D */
    public abstract ImmutableSortedMultiset<E> mo11529n0(E e2, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: E */
    public abstract ImmutableSortedMultiset<E> mo11527D0(E e2, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return mo11389l().comparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: f1 */
    public SortedMultiset mo11400f1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.m11185i(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return mo11527D0(obj, boundType).mo11529n0(obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> mo11399R() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.f21100e;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? m11688C(Ordering.m11854a(comparator()).mo11416h()) : new DescendingImmutableSortedMultiset<>(this);
            this.f21100e = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }
}

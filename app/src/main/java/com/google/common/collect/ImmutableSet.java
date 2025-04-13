package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* renamed from: d */
    public static final /* synthetic */ int f21087d = 0;

    /* renamed from: c */
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient ImmutableList<E> f21088c;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder<E> mo11678d(E e2) {
            Objects.requireNonNull(e2);
            super.m11622b(e2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder<E> mo11679e(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo11678d(it.next());
            }
            return this;
        }

        /* renamed from: f */
        public ImmutableSet<E> mo11680f() {
            int i2 = this.f21029b;
            if (i2 == 0) {
                int i3 = ImmutableSet.f21087d;
                return RegularImmutableSet.f21445j;
            }
            if (i2 == 1) {
                Object obj = this.f21028a[0];
                int i4 = ImmutableSet.f21087d;
                return new SingletonImmutableSet(obj);
            }
            ImmutableSet<E> m11675u = ImmutableSet.m11675u(i2, this.f21028a);
            this.f21029b = m11675u.size();
            this.f21030c = true;
            return m11675u;
        }
    }

    public static class SerializedForm implements Serializable {
    }

    /* renamed from: C */
    public static <E> ImmutableSet<E> m11671C() {
        return RegularImmutableSet.f21445j;
    }

    /* renamed from: D */
    public static <E> ImmutableSet<E> m11672D(E e2) {
        return new SingletonImmutableSet(e2);
    }

    /* renamed from: E */
    public static <E> ImmutableSet<E> m11673E(E e2, E e3, E e4) {
        return m11675u(3, e2, e3, e4);
    }

    @VisibleForTesting
    /* renamed from: t */
    public static int m11674t(int i2) {
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            Preconditions.m11179c(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: u */
    public static <E> ImmutableSet<E> m11675u(int i2, Object... objArr) {
        if (i2 == 0) {
            return RegularImmutableSet.f21445j;
        }
        if (i2 == 1) {
            return new SingletonImmutableSet(objArr[0]);
        }
        int m11674t = m11674t(i2);
        Object[] objArr2 = new Object[m11674t];
        int i3 = m11674t - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            ObjectArrays.m11827a(obj, i6);
            int hashCode = obj.hashCode();
            int m11606b = Hashing.m11606b(hashCode);
            while (true) {
                int i7 = m11606b & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArr[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += hashCode;
                    i5++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                m11606b++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new SingletonImmutableSet(objArr[0], i4);
        }
        if (m11674t(i5) < m11674t / 2) {
            return m11675u(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new RegularImmutableSet(objArr, i4, objArr2, i3, i5);
    }

    /* renamed from: x */
    public static <E> ImmutableSet<E> m11676x(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.mo11425r()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m11675u(array.length, array);
    }

    /* renamed from: y */
    public static <E> ImmutableSet<E> m11677y(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? m11675u(eArr.length, (Object[]) eArr.clone()) : new SingletonImmutableSet(eArr[0]) : RegularImmutableSet.f21445j;
    }

    /* renamed from: A */
    public boolean mo11626A() {
        return this instanceof EmptyContiguousSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public ImmutableList<E> mo11543b() {
        ImmutableList<E> immutableList = this.f21088c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> mo11658z = mo11658z();
        this.f21088c = mo11658z;
        return mo11658z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && mo11626A() && ((ImmutableSet) obj).mo11626A() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.m11884b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m11887e(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: z */
    public ImmutableList<E> mo11658z() {
        return ImmutableList.m11631t(toArray());
    }
}

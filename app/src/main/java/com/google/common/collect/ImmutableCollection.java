package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    public static final Object[] f21027b = new Object[0];

    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* renamed from: a */
        public Object[] f21028a;

        /* renamed from: b */
        public int f21029b;

        /* renamed from: c */
        public boolean f21030c;

        public ArrayBasedBuilder(int i2) {
            CollectPreconditions.m11427b(i2, "initialCapacity");
            this.f21028a = new Object[i2];
            this.f21029b = 0;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public ArrayBasedBuilder<E> m11622b(E e2) {
            Objects.requireNonNull(e2);
            m11623c(this.f21029b + 1);
            Object[] objArr = this.f21028a;
            int i2 = this.f21029b;
            this.f21029b = i2 + 1;
            objArr[i2] = e2;
            return this;
        }

        /* renamed from: c */
        public final void m11623c(int i2) {
            Object[] objArr = this.f21028a;
            if (objArr.length < i2) {
                this.f21028a = Arrays.copyOf(objArr, Builder.m11624a(objArr.length, i2));
                this.f21030c = false;
            } else if (this.f21030c) {
                this.f21028a = (Object[]) objArr.clone();
                this.f21030c = false;
            }
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        /* renamed from: a */
        public static int m11624a(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i4 = i2 + (i2 >> 1) + 1;
            if (i4 < i3) {
                i4 = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (i4 < 0) {
                return Integer.MAX_VALUE;
            }
            return i4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public ImmutableList<E> mo11543b() {
        if (!isEmpty()) {
            return ImmutableList.m11631t(toArray());
        }
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        return (ImmutableList<E>) RegularImmutableList.f21423f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    @NullableDecl
    /* renamed from: e */
    public Object[] mo11619e() {
        return null;
    }

    /* renamed from: f */
    public int mo11620f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public int mo11621g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public abstract boolean mo11425r();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f21027b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo11619e = mo11619e();
            if (mo11619e != null) {
                return (T[]) Arrays.copyOfRange(mo11619e, mo11621g(), mo11620f(), tArr.getClass());
            }
            tArr = (T[]) ObjectArrays.m11829c(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo11618d(tArr, 0);
        return tArr;
    }
}

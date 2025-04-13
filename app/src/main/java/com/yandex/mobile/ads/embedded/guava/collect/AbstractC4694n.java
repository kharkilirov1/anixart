package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

@DoNotMock
/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.n */
/* loaded from: classes2.dex */
public abstract class AbstractC4694n<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f47891a = new Object[0];

    @DoNotMock
    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.n$b */
    public static abstract class b<E> {
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public int mo22014a(int i2, Object[] objArr) {
        AbstractC4699p0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
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
    public AbstractC4698p<E> mo22031b() {
        if (isEmpty()) {
            int i2 = AbstractC4698p.f47900c;
            return (AbstractC4698p<E>) C4679f0.f47854f;
        }
        Object[] array = toArray(f47891a);
        int i3 = AbstractC4698p.f47900c;
        return AbstractC4698p.m22052b(array.length, array);
    }

    @CheckForNull
    /* renamed from: c */
    public Object[] mo22015c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    /* renamed from: d */
    int mo22016d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    int mo22017e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    abstract boolean mo22018f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC4699p0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f47891a);
    }

    Object writeReplace() {
        return new AbstractC4698p.c(toArray(f47891a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo22015c = mo22015c();
            if (mo22015c != null) {
                return (T[]) C4677e0.m22013a(mo22015c, mo22017e(), mo22016d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo22014a(0, tArr);
        return tArr;
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.n$a */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a */
        public Object[] f47892a;

        /* renamed from: b */
        public int f47893b;

        /* renamed from: c */
        public boolean f47894c;

        public a() {
            C4682h.m22032a(4, "initialCapacity");
            this.f47892a = new Object[4];
            this.f47893b = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: a */
        public final b m22045a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f47893b;
                Object[] objArr = this.f47892a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size < 0) {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                    int i2 = length + (length >> 1) + 1;
                    if (i2 < size) {
                        i2 = Integer.highestOneBit(size - 1) << 1;
                    }
                    if (i2 < 0) {
                        i2 = Integer.MAX_VALUE;
                    }
                    this.f47892a = Arrays.copyOf(objArr, i2);
                    this.f47894c = false;
                } else if (this.f47894c) {
                    this.f47892a = (Object[]) objArr.clone();
                    this.f47894c = false;
                }
                if (list instanceof AbstractC4694n) {
                    this.f47893b = ((AbstractC4694n) list).mo22014a(this.f47893b, this.f47892a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC4698p.a) this).m22046a(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final void m22046a(Object obj) {
            Objects.requireNonNull(obj);
            int i2 = this.f47893b + 1;
            Object[] objArr = this.f47892a;
            if (objArr.length < i2) {
                int length = objArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i2 - 1) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    this.f47892a = Arrays.copyOf(objArr, i3);
                    this.f47894c = false;
                } else {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
            } else if (this.f47894c) {
                this.f47892a = (Object[]) objArr.clone();
                this.f47894c = false;
            }
            Object[] objArr2 = this.f47892a;
            int i4 = this.f47893b;
            this.f47893b = i4 + 1;
            objArr2[i4] = obj;
        }
    }
}

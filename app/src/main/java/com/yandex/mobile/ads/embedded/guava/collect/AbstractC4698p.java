package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n;
import com.yandex.mobile.ads.impl.k60;
import com.yandex.mobile.ads.impl.tr0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.p */
/* loaded from: classes2.dex */
public abstract class AbstractC4698p<E> extends AbstractC4694n<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final AbstractC4701q0<Object> f47899b = new b(0, C4679f0.f47854f);

    /* renamed from: c */
    public static final /* synthetic */ int f47900c = 0;

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.p$a */
    public static final class a<E> extends AbstractC4694n.a<E> {
        public a() {
            this(0);
        }

        /* renamed from: a */
        public final AbstractC4698p<E> m22058a() {
            this.f47894c = true;
            return AbstractC4698p.m22052b(this.f47893b, this.f47892a);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final void m22060b(Object obj) {
            m22046a(obj);
        }

        public a(int i2) {
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final a m22059b(List list) {
            m22045a(list);
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.p$b */
    public static class b<E> extends AbstractC4668a<E> {

        /* renamed from: c */
        private final AbstractC4698p<E> f47901c;

        public b(int i2, AbstractC4698p abstractC4698p) {
            super(abstractC4698p.size(), i2);
            this.f47901c = abstractC4698p;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4668a
        /* renamed from: a */
        public final E mo21978a(int i2) {
            return this.f47901c.get(i2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.p$c */
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        public final Object[] f47902a;

        public c(Object[] objArr) {
            this.f47902a = objArr;
        }

        public Object readResolve() {
            return AbstractC4698p.m22053b(this.f47902a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.p$d */
    public class d extends AbstractC4698p<E> {

        /* renamed from: d */
        public final transient int f47903d;

        /* renamed from: e */
        public final transient int f47904e;

        public d(int i2, int i3) {
            this.f47903d = i2;
            this.f47904e = i3;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC4698p<E> subList(int i2, int i3) {
            tr0.m28730a(i2, i3, this.f47904e);
            AbstractC4698p abstractC4698p = AbstractC4698p.this;
            int i4 = this.f47903d;
            return abstractC4698p.subList(i2 + i4, i3 + i4);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        @CheckForNull
        /* renamed from: c */
        public final Object[] mo22015c() {
            return AbstractC4698p.this.mo22015c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: d */
        public final int mo22016d() {
            return AbstractC4698p.this.mo22017e() + this.f47903d + this.f47904e;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: e */
        public final int mo22017e() {
            return AbstractC4698p.this.mo22017e() + this.f47903d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: f */
        public final boolean mo22018f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i2) {
            tr0.m28729a(i2, this.f47904e);
            return AbstractC4698p.this.get(i2 + this.f47903d);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f47904e;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    /* renamed from: a */
    public static <E> AbstractC4698p<E> m22048a(E e2) {
        return m22051a(e2);
    }

    /* renamed from: b */
    public static AbstractC4698p m22052b(int i2, Object[] objArr) {
        return i2 == 0 ? C4679f0.f47854f : new C4679f0(i2, objArr);
    }

    /* renamed from: h */
    public static <E> a<E> m22054h() {
        return new a<>();
    }

    /* renamed from: i */
    public static <E> AbstractC4698p<E> m22055i() {
        return (AbstractC4698p<E>) C4679f0.f47854f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @DoNotCall
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    @InlineMe
    @Deprecated
    /* renamed from: b */
    public final AbstractC4698p<E> mo22031b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return C4706v.m22079a(this, obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: g */
    public final AbstractC4699p0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj != null) {
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                if (obj.equals(get(i2))) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    public Object writeReplace() {
        return new c(toArray());
    }

    /* renamed from: a */
    public static <E> AbstractC4698p<E> m22049a(E e2, E e3) {
        return m22051a(e2, e3);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: a */
    public static AbstractC4698p m22047a(Long l2, Long l3, Long l4, Long l5, Long l6) {
        return m22051a(l2, l3, l4, l5, l6);
    }

    /* renamed from: b */
    public static <E> AbstractC4698p<E> m22053b(E[] eArr) {
        if (eArr.length == 0) {
            return (AbstractC4698p<E>) C4679f0.f47854f;
        }
        return m22051a((Object[]) eArr.clone());
    }

    /* renamed from: a */
    private static <E> AbstractC4698p<E> m22051a(Object... objArr) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(k60.m26036a("at index ", i2));
            }
        }
        return m22052b(objArr.length, objArr);
    }

    /* renamed from: a */
    public static <E> AbstractC4698p<E> m22050a(Collection<? extends E> collection) {
        if (collection instanceof AbstractC4694n) {
            AbstractC4698p<E> mo22031b = ((AbstractC4694n) collection).mo22031b();
            if (!mo22031b.mo22018f()) {
                return mo22031b;
            }
            Object[] array = mo22031b.toArray();
            return m22052b(array.length, array);
        }
        return m22051a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC4701q0<E> listIterator(int i2) {
        tr0.m28733b(i2, size());
        if (isEmpty()) {
            return (AbstractC4701q0<E>) f47899b;
        }
        return new b(i2, this);
    }

    @Override // java.util.List
    /* renamed from: a */
    public AbstractC4698p<E> subList(int i2, int i3) {
        tr0.m28730a(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return (AbstractC4698p<E>) C4679f0.f47854f;
        }
        return new d(i2, i4);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: a */
    public int mo22014a(int i2, Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }
}

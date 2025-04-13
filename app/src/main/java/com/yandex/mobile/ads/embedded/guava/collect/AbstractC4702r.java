package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.yandex.mobile.ads.impl.k60;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.r */
/* loaded from: classes2.dex */
public abstract class AbstractC4702r<E> extends AbstractC4694n<E> implements Set<E> {

    /* renamed from: b */
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient AbstractC4698p<E> f47913b;

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.r$a */
    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        public final Object[] f47914a;

        public a(Object[] objArr) {
            this.f47914a = objArr;
        }

        public Object readResolve() {
            return AbstractC4702r.m22074a(this.f47914a);
        }
    }

    /* renamed from: a */
    public static AbstractC4702r m22071a(String str, String str2) {
        return m22075b(2, str, str2);
    }

    /* renamed from: b */
    private static <E> AbstractC4702r<E> m22075b(int i2, Object... objArr) {
        if (i2 == 0) {
            return C4683h0.f47876i;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C4695n0(obj);
        }
        int m22070a = m22070a(i2);
        Object[] objArr2 = new Object[m22070a];
        int i3 = m22070a - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                throw new NullPointerException(k60.m26036a("at index ", i6));
            }
            int hashCode = obj2.hashCode();
            int m22038a = C4692m.m22038a(hashCode);
            while (true) {
                int i7 = m22038a & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += hashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                m22038a++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C4695n0(obj4);
        }
        if (m22070a(i5) < m22070a / 2) {
            return m22075b(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new C4683h0(objArr, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4702r) && (this instanceof C4683h0)) {
            AbstractC4702r abstractC4702r = (AbstractC4702r) obj;
            Objects.requireNonNull(abstractC4702r);
            if ((abstractC4702r instanceof C4683h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return C4693m0.m22043a(this, obj);
    }

    /* renamed from: h */
    public AbstractC4698p<E> mo22030h() {
        Object[] array = toArray();
        int i2 = AbstractC4698p.f47900c;
        return AbstractC4698p.m22052b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C4693m0.m22039a(this);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    public Object writeReplace() {
        return new a(toArray());
    }

    /* renamed from: a */
    public static AbstractC4702r m22072a(String str, String str2, String str3) {
        return m22075b(3, str, str2, str3);
    }

    /* renamed from: a */
    public static int m22070a(int i2) {
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: a */
    public static AbstractC4702r m22073a(Set set) {
        if ((set instanceof AbstractC4702r) && !(set instanceof SortedSet)) {
            AbstractC4702r abstractC4702r = (AbstractC4702r) set;
            if (!abstractC4702r.mo22018f()) {
                return abstractC4702r;
            }
        }
        Object[] array = set.toArray();
        return m22075b(array.length, array);
    }

    /* renamed from: a */
    public static <E> AbstractC4702r<E> m22074a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return C4683h0.f47876i;
        }
        if (length != 1) {
            return m22075b(eArr.length, (Object[]) eArr.clone());
        }
        return new C4695n0(eArr[0]);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: b */
    public AbstractC4698p<E> mo22031b() {
        AbstractC4698p<E> abstractC4698p = this.f47913b;
        if (abstractC4698p != null) {
            return abstractC4698p;
        }
        AbstractC4698p<E> mo22030h = mo22030h();
        this.f47913b = mo22030h;
        return mo22030h;
    }
}

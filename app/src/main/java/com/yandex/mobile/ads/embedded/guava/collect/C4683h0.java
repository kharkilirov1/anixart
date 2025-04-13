package com.yandex.mobile.ads.embedded.guava.collect;

import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.h0 */
/* loaded from: classes2.dex */
final class C4683h0<E> extends AbstractC4702r<E> {

    /* renamed from: h */
    private static final Object[] f47875h;

    /* renamed from: i */
    public static final C4683h0<Object> f47876i;

    /* renamed from: c */
    public final transient Object[] f47877c;

    /* renamed from: d */
    private final transient int f47878d;

    /* renamed from: e */
    public final transient Object[] f47879e;

    /* renamed from: f */
    private final transient int f47880f;

    /* renamed from: g */
    private final transient int f47881g;

    static {
        Object[] objArr = new Object[0];
        f47875h = objArr;
        f47876i = new C4683h0<>(objArr, 0, objArr, 0, 0);
    }

    public C4683h0(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f47877c = objArr;
        this.f47878d = i2;
        this.f47879e = objArr2;
        this.f47880f = i3;
        this.f47881g = i4;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: a */
    public final int mo22014a(int i2, Object[] objArr) {
        System.arraycopy(this.f47877c, 0, objArr, i2, this.f47881g);
        return i2 + this.f47881g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: c */
    public final Object[] mo22015c() {
        return this.f47877c;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f47879e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m22038a = C4692m.m22038a(obj.hashCode());
        while (true) {
            int i2 = m22038a & this.f47880f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m22038a = i2 + 1;
        }
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: d */
    public final int mo22016d() {
        return this.f47881g;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: e */
    public final int mo22017e() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: f */
    public final boolean mo22018f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final AbstractC4699p0<E> iterator() {
        return mo22031b().listIterator(0);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r
    /* renamed from: h */
    public final AbstractC4698p<E> mo22030h() {
        return AbstractC4698p.m22052b(this.f47881g, this.f47877c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f47878d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47881g;
    }
}

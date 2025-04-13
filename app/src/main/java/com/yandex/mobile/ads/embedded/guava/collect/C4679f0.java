package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.f0 */
/* loaded from: classes2.dex */
final class C4679f0<E> extends AbstractC4698p<E> {

    /* renamed from: f */
    public static final AbstractC4698p<Object> f47854f = new C4679f0(0, new Object[0]);

    /* renamed from: d */
    public final transient Object[] f47855d;

    /* renamed from: e */
    private final transient int f47856e;

    public C4679f0(int i2, Object[] objArr) {
        this.f47855d = objArr;
        this.f47856e = i2;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: a */
    public final int mo22014a(int i2, Object[] objArr) {
        System.arraycopy(this.f47855d, 0, objArr, i2, this.f47856e);
        return i2 + this.f47856e;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: c */
    public final Object[] mo22015c() {
        return this.f47855d;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: d */
    public final int mo22016d() {
        return this.f47856e;
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

    @Override // java.util.List
    public final E get(int i2) {
        tr0.m28729a(i2, this.f47856e);
        E e2 = (E) this.f47855d[i2];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47856e;
    }
}

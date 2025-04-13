package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.o */
/* loaded from: classes2.dex */
final class C4696o<K, V> extends AbstractC4678f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final K f47896a;

    /* renamed from: b */
    public final V f47897b;

    public C4696o(K k2, V v) {
        this.f47896a = k2;
        this.f47897b = v;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4678f, java.util.Map.Entry
    public final K getKey() {
        return this.f47896a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4678f, java.util.Map.Entry
    public final V getValue() {
        return this.f47897b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}

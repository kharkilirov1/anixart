package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4710z;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.y */
/* loaded from: classes2.dex */
final class C4709y extends AbstractC4710z.c<Object> {

    /* renamed from: a */
    public final /* synthetic */ Comparator f47925a;

    public C4709y(Comparator comparator) {
        this.f47925a = comparator;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4710z.c
    /* renamed from: b */
    public final <K, V> Map<K, Collection<V>> mo22081b() {
        return new TreeMap(this.f47925a);
    }
}

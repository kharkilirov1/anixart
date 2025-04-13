package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.e80;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.c */
/* loaded from: classes2.dex */
abstract class AbstractC4672c<K, V> extends AbstractC4676e<K, V> implements e80<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractC4672c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4680g, com.yandex.mobile.ads.impl.vg0
    /* renamed from: a */
    public final Map<K, Collection<V>> mo21982a() {
        return super.mo21982a();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4680g
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e, com.yandex.mobile.ads.impl.vg0
    @CanIgnoreReturnValue
    public final boolean put(K k2, V v) {
        return super.put(k2, v);
    }
}

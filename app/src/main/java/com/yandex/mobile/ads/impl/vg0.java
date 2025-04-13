package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

@DoNotMock
/* loaded from: classes3.dex */
public interface vg0<K, V> {
    /* renamed from: a */
    Map<K, Collection<V>> mo21982a();

    @CanIgnoreReturnValue
    boolean put(K k2, V v);

    Collection<V> values();
}

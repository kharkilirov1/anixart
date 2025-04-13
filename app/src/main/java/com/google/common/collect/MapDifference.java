package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public interface MapDifference<K, V> {

    @DoNotMock
    public interface ValueDifference<V> {
        /* renamed from: a */
        V mo11744a();

        /* renamed from: b */
        V mo11745b();
    }

    /* renamed from: a */
    Map<K, V> mo11740a();

    /* renamed from: b */
    Map<K, ValueDifference<V>> mo11741b();

    /* renamed from: c */
    Map<K, V> mo11742c();

    /* renamed from: d */
    Map<K, V> mo11743d();
}

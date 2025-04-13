package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.concurrent.ExecutionException;

@GwtCompatible
/* loaded from: classes.dex */
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    @Override // com.google.common.base.Function
    @Deprecated
    V apply(K k2);

    V get(K k2) throws ExecutionException;
}

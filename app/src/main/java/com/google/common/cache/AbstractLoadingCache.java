package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K k2) {
        try {
            return get(k2);
        } catch (ExecutionException e2) {
            throw new UncheckedExecutionException(e2.getCause());
        }
    }
}

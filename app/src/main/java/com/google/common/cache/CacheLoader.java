package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.Callable;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class CacheLoader<K, V> {

    /* renamed from: com.google.common.cache.CacheLoader$1 */
    class C15841 extends CacheLoader<Object, Object> {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public Object mo11237a(Object obj) throws Exception {
            throw null;
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: b */
        public ListenableFuture<Object> mo11238b(final Object obj, final Object obj2) throws Exception {
            new ListenableFutureTask(new Callable<Object>() { // from class: com.google.common.cache.CacheLoader.1.1
                @Override // java.util.concurrent.Callable
                public Object call() throws Exception {
                    Objects.requireNonNull(C15841.this);
                    throw null;
                }
            });
            throw null;
        }
    }

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public V mo11237a(K k2) {
            Objects.requireNonNull(k2);
            throw null;
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public V mo11237a(Object obj) {
            Objects.requireNonNull(obj);
            throw null;
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* renamed from: a */
    public abstract V mo11237a(K k2) throws Exception;

    @GwtIncompatible
    /* renamed from: b */
    public ListenableFuture<V> mo11238b(K k2, V v) throws Exception {
        Objects.requireNonNull(k2);
        return Futures.m12195c(mo11237a(k2));
    }
}

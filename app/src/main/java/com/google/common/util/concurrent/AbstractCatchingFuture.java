package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FluentFuture;
import java.lang.Throwable;

@GwtCompatible
/* loaded from: classes2.dex */
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {

    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
    }

    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: c */
    public final void mo12134c() {
        m12147k(null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: l */
    public String mo12135l() {
        String mo12135l = super.mo12135l();
        if (mo12135l == null) {
            return null;
        }
        String valueOf = String.valueOf("");
        return mo12135l.length() != 0 ? valueOf.concat(mo12135l) : new String(valueOf);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

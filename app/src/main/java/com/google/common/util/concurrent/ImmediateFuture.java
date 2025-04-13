package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* renamed from: c */
    public static final ListenableFuture<?> f22189c = new ImmediateFuture(null);

    /* renamed from: d */
    public static final Logger f22190d = Logger.getLogger(ImmediateFuture.class.getName());

    /* renamed from: b */
    @NullableDecl
    public final V f22191b;

    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public ImmediateFailedFuture(Throwable th) {
            mo12150o(th);
        }
    }

    public ImmediateFuture(@NullableDecl V v) {
        this.f22191b = v;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f22191b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public void mo1145r(Runnable runnable, Executor executor) {
        Preconditions.m11187k(runnable, "Runnable was null.");
        Preconditions.m11187k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f22190d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, C1008a.m6437d(valueOf2.length() + valueOf.length() + 57, "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f22191b);
        return C1008a.m6437d(valueOf.length() + C0576a.m4106e(obj, 27), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return get();
    }
}

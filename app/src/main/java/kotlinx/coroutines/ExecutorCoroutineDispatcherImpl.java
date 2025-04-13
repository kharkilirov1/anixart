package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Executors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {

    /* renamed from: c */
    @NotNull
    public final Executor f67009c;

    public ExecutorCoroutineDispatcherImpl(@NotNull Executor executor) {
        Method method;
        this.f67009c = executor;
        Method method2 = ConcurrentKt.f68240a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ConcurrentKt.f68240a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.f67009c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).f67009c == this.f67009c;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: g */
    public void mo34030g(long j2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        Executor executor = this.f67009c;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> m34058v = scheduledExecutorService != null ? m34058v(scheduledExecutorService, new ResumeUndispatchedRunnable(this, cancellableContinuation), cancellableContinuation.getF66944f(), j2) : null;
        if (m34058v != null) {
            cancellableContinuation.mo33966r(new CancelFutureOnCancel(m34058v));
        } else {
            DefaultExecutor.f66979h.mo34030g(j2, cancellableContinuation);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f67009c);
    }

    @Override // kotlinx.coroutines.Delay
    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor executor = this.f67009c;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> m34058v = scheduledExecutorService != null ? m34058v(scheduledExecutorService, runnable, coroutineContext, j2) : null;
        return m34058v != null ? new DisposableFutureHandle(m34058v) : DefaultExecutor.f66979h.mo34028l(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            this.f67009c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            JobKt.m34070b(coroutineContext, ExceptionsKt.m34057a("The task was rejected", e2));
            Objects.requireNonNull((DefaultIoScheduler) Dispatchers.f66989b);
            DefaultIoScheduler.f68347d.mo3221m(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return this.f67009c.toString();
    }

    /* renamed from: v */
    public final ScheduledFuture<?> m34058v(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            JobKt.m34070b(coroutineContext, ExceptionsKt.m34057a("The task was rejected", e2));
            return null;
        }
    }
}

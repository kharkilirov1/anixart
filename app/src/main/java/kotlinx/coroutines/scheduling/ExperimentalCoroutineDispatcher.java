package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes3.dex */
public class ExperimentalCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            CoroutineScheduler.m34355g(null, runnable, null, false, 6);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f66979h.mo34025D0(runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            CoroutineScheduler.m34355g(null, runnable, null, true, 2);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f66979h.mo34025D0(runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return super.toString() + "[scheduler = " + ((Object) null) + ']';
    }
}

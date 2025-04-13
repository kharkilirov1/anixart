package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class LimitingDispatcher extends ExecutorCoroutineDispatcher implements TaskContext, Executor {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68349c = AtomicIntegerFieldUpdater.newUpdater(LimitingDispatcher.class, "inFlightTasks");

    @NotNull
    private volatile /* synthetic */ int inFlightTasks;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m34378v(runnable, false);
        throw null;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: h */
    public void mo34376h() {
        throw null;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: j */
    public int getF68358b() {
        return 0;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        m34378v(runnable, false);
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        m34378v(runnable, true);
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return super.toString() + "[dispatcher = " + ((Object) null) + ']';
    }

    /* renamed from: v */
    public final void m34378v(Runnable runnable, boolean z) {
        if (f68349c.incrementAndGet(this) > 0) {
            throw null;
        }
        throw null;
    }
}

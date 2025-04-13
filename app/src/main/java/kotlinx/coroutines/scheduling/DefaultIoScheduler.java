package kotlinx.coroutines.scheduling;

import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: c */
    @NotNull
    public static final DefaultIoScheduler f68346c = new DefaultIoScheduler();

    /* renamed from: d */
    @NotNull
    public static final CoroutineDispatcher f68347d;

    static {
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.f68367c;
        int m34329a = SystemPropsKt.m34329a();
        int m34334f = SystemPropsKt.m34334f("kotlinx.coroutines.io.parallelism", 64 < m34329a ? m34329a : 64, 0, 0, 12, null);
        Objects.requireNonNull(unlimitedIoScheduler);
        if (!(m34334f >= 1)) {
            throw new IllegalArgumentException(Intrinsics.m32187p("Expected positive parallelism level, but got ", Integer.valueOf(m34334f)).toString());
        }
        f68347d = new LimitedDispatcher(unlimitedIoScheduler, m34334f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        f68347d.mo3221m(EmptyCoroutineContext.f63224b, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f68347d.mo3221m(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f68347d.mo34014p(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}

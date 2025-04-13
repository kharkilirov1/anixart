package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0010\b\u0007\u0010\u0002\"\u00020\u00002\u00020\u0000B\u0002\b\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ExecutorsKt {
    @JvmName
    @NotNull
    /* renamed from: a */
    public static final CoroutineDispatcher m34059a(@NotNull Executor executor) {
        if (executor instanceof DispatcherExecutor) {
        }
        return new ExecutorCoroutineDispatcherImpl(executor);
    }
}

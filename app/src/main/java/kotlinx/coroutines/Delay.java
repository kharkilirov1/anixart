package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: Delay.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/Delay;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface Delay {

    /* compiled from: Delay.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: a */
        public static DisposableHandle m34031a(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            return DefaultExecutorKt.f66982b.mo34028l(j2, runnable, coroutineContext);
        }
    }

    /* renamed from: g */
    void mo34030g(long j2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation);

    @NotNull
    /* renamed from: l */
    DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext);
}

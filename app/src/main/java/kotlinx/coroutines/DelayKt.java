package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DelayKt {
    @Nullable
    /* renamed from: a */
    public static final Object m34032a(long j2, @NotNull Continuation<? super Unit> continuation) {
        if (j2 <= 0) {
            return Unit.f63088a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
        cancellableContinuationImpl.m33993y();
        if (j2 < Long.MAX_VALUE) {
            m34033b(cancellableContinuationImpl.f66944f).mo34030g(j2, cancellableContinuationImpl);
        }
        Object m33992v = cancellableContinuationImpl.m33992v();
        return m33992v == CoroutineSingletons.COROUTINE_SUSPENDED ? m33992v : Unit.f63088a;
    }

    @NotNull
    /* renamed from: b */
    public static final Delay m34033b(@NotNull CoroutineContext coroutineContext) {
        int i2 = ContinuationInterceptor.f63221G1;
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key.f63222b);
        Delay delay = element instanceof Delay ? (Delay) element : null;
        return delay == null ? DefaultExecutorKt.f66982b : delay;
    }
}

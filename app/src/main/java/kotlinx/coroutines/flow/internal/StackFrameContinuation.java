package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/StackFrameContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class StackFrameContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: b */
    @NotNull
    public final Continuation<T> f68224b;

    /* renamed from: c */
    @NotNull
    public final CoroutineContext f68225c;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(@NotNull Continuation<? super T> continuation, @NotNull CoroutineContext coroutineContext) {
        this.f68224b = continuation;
        this.f68225c = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g, reason: from getter */
    public CoroutineContext getF68225c() {
        return this.f68225c;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<T> continuation = this.f68224b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        this.f68224b.mo31877j(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }
}

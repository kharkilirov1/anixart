package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/flow/ReadonlyStateFlow;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: b */
    @Nullable
    public final Job f68019b;

    /* renamed from: c */
    public final /* synthetic */ StateFlow<T> f68020c;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlyStateFlow(@NotNull StateFlow<? extends T> stateFlow, @Nullable Job job) {
        this.f68019b = job;
        this.f68020c = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation) {
        return this.f68020c.mo4140a(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    /* renamed from: d */
    public Flow<T> mo34223d(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return StateFlowKt.m34248a(this, coroutineContext, i2, bufferOverflow);
    }
}

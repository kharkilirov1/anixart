package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* renamed from: f */
    @NotNull
    public final Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> f68122f;

    public ChannelFlowTransformLatest(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, int i3) {
        super(flow, (i3 & 4) != 0 ? EmptyCoroutineContext.f63224b : null, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : null);
        this.f68122f = function3;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: h */
    public ChannelFlow<R> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f68122f, this.f68118e, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    /* renamed from: k */
    public Object mo34256k(@NotNull FlowCollector<? super R> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object m34021c = CoroutineScopeKt.m34021c(new ChannelFlowTransformLatest$flowCollect$3(this, flowCollector, null), continuation);
        return m34021c == CoroutineSingletons.COROUTINE_SUSPENDED ? m34021c : Unit.f63088a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(@NotNull Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Flow<? extends T> flow, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        super(flow, coroutineContext, i2, bufferOverflow);
        this.f68122f = function3;
    }
}

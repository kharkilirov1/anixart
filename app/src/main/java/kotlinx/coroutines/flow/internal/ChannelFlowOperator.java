package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Flow<S> f68118e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull Flow<? extends S> flow, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.f68118e = flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f68094c == -3) {
            CoroutineContext f66944f = continuation.getF66944f();
            CoroutineContext plus = f66944f.plus(this.f68093b);
            if (Intrinsics.m32174c(plus, f66944f)) {
                Object mo34256k = mo34256k(flowCollector, continuation);
                return mo34256k == coroutineSingletons ? mo34256k : Unit.f63088a;
            }
            int i2 = ContinuationInterceptor.f63221G1;
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key.f63222b;
            if (Intrinsics.m32174c(plus.get(key), f66944f.get(key))) {
                CoroutineContext f66944f2 = continuation.getF66944f();
                if (!(flowCollector instanceof SendingCollector ? true : flowCollector instanceof NopCollector)) {
                    flowCollector = new UndispatchedContextCollector(flowCollector, f66944f2);
                }
                Object m34254a = ChannelFlowKt.m34254a(plus, flowCollector, ThreadContextKt.m34337b(plus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation);
                if (m34254a != coroutineSingletons) {
                    m34254a = Unit.f63088a;
                }
                return m34254a == coroutineSingletons ? m34254a : Unit.f63088a;
            }
        }
        Object mo4140a = super.mo4140a(flowCollector, continuation);
        return mo4140a == coroutineSingletons ? mo4140a : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* renamed from: g */
    public Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation) {
        Object mo34256k = mo34256k(new SendingCollector(producerScope), continuation);
        return mo34256k == CoroutineSingletons.COROUTINE_SUSPENDED ? mo34256k : Unit.f63088a;
    }

    @Nullable
    /* renamed from: k */
    public abstract Object mo34256k(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.f68118e + " -> " + super.toString();
    }
}

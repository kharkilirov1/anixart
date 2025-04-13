package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Builders.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {

    /* renamed from: e */
    @NotNull
    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> f67450e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowBuilder(@NotNull Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.f67450e = function2;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* renamed from: g */
    public Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation) {
        Object invoke = this.f67450e.invoke(producerScope, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: h */
    public ChannelFlow<T> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.f67450e, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("block[");
        m24u.append(this.f67450e);
        m24u.append("] -> ");
        m24u.append(super.toString());
        return m24u.toString();
    }
}

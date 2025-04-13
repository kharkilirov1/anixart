package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67447g = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed");

    @NotNull
    private volatile /* synthetic */ int consumed;

    /* renamed from: e */
    @NotNull
    public final ReceiveChannel<T> f67448e;

    /* renamed from: f */
    public final boolean f67449f;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(@NotNull ReceiveChannel<? extends T> receiveChannel, boolean z, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.f67448e = receiveChannel;
        this.f67449f = z;
        this.consumed = 0;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f68094c != -3) {
            Object mo4140a = super.mo4140a(flowCollector, continuation);
            return mo4140a == coroutineSingletons ? mo4140a : Unit.f63088a;
        }
        m34208k();
        Object m34216a = FlowKt__ChannelsKt.m34216a(flowCollector, this.f67448e, this.f67449f, continuation);
        return m34216a == coroutineSingletons ? m34216a : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: f */
    public String mo34206f() {
        return Intrinsics.m32187p("channel=", this.f67448e);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* renamed from: g */
    public Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation) {
        Object m34216a = FlowKt__ChannelsKt.m34216a(new SendingCollector(producerScope), this.f67448e, this.f67449f, continuation);
        return m34216a == CoroutineSingletons.COROUTINE_SUSPENDED ? m34216a : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: h */
    public ChannelFlow<T> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.f67448e, this.f67449f, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: j */
    public ReceiveChannel<T> mo34207j(@NotNull CoroutineScope coroutineScope) {
        m34208k();
        return this.f68094c == -3 ? this.f67448e : super.mo34207j(coroutineScope);
    }

    /* renamed from: k */
    public final void m34208k() {
        if (this.f67449f) {
            if (!(f67447g.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}

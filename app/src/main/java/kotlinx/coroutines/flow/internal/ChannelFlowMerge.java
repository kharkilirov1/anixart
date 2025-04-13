package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: e */
    @NotNull
    public final Flow<Flow<T>> f68103e;

    /* renamed from: f */
    public final int f68104f;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(@NotNull Flow<? extends Flow<? extends T>> flow, int i2, @NotNull CoroutineContext coroutineContext, int i3, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i3, bufferOverflow);
        this.f68103e = flow;
        this.f68104f = i2;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: f */
    public String mo34206f() {
        return Intrinsics.m32187p("concurrency=", Integer.valueOf(this.f68104f));
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* renamed from: g */
    public Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation) {
        Semaphore m34403a = SemaphoreKt.m34403a(this.f68104f, 0, 2);
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        CoroutineContext coroutineContext = ((ContinuationImpl) continuation).f63244c;
        Intrinsics.m32176e(coroutineContext);
        Object mo4140a = this.f68103e.mo4140a(new ChannelFlowMerge$collectTo$2((Job) coroutineContext.get(Job.Key.f67019b), m34403a, producerScope, sendingCollector), continuation);
        return mo4140a == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4140a : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: h */
    public ChannelFlow<T> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.f68103e, this.f68104f, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: j */
    public ReceiveChannel<T> mo34207j(@NotNull CoroutineScope coroutineScope) {
        return ProduceKt.m34187a(coroutineScope, this.f68093b, this.f68094c, m34253i());
    }
}

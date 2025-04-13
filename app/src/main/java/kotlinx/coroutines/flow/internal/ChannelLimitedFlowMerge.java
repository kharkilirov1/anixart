package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: e */
    @NotNull
    public final Iterable<Flow<T>> f68141e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(@NotNull Iterable<? extends Flow<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.f68141e = iterable;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* renamed from: g */
    public Object mo34204g(@NotNull ProducerScope<? super T> producerScope, @NotNull Continuation<? super Unit> continuation) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator<Flow<T>> it = this.f68141e.iterator();
        while (it.hasNext()) {
            BuildersKt.m33962a(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(it.next(), sendingCollector, null), 3, null);
        }
        return Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: h */
    public ChannelFlow<T> mo34205h(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f68141e, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* renamed from: j */
    public ReceiveChannel<T> mo34207j(@NotNull CoroutineScope coroutineScope) {
        return ProduceKt.m34187a(coroutineScope, this.f68093b, this.f68094c, m34253i());
    }
}

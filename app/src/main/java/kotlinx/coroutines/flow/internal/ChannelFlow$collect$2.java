package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m32126f = "ChannelFlow.kt", m32127l = {123}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelFlow$collect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68096f;

    /* renamed from: g */
    public /* synthetic */ Object f68097g;

    /* renamed from: h */
    public final /* synthetic */ FlowCollector<Object> f68098h;

    /* renamed from: i */
    public final /* synthetic */ ChannelFlow<Object> f68099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(FlowCollector<Object> flowCollector, ChannelFlow<Object> channelFlow, Continuation<? super ChannelFlow$collect$2> continuation) {
        super(2, continuation);
        this.f68098h = flowCollector;
        this.f68099i = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.f68098h, this.f68099i, continuation);
        channelFlow$collect$2.f68097g = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.f68098h, this.f68099i, continuation);
        channelFlow$collect$2.f68097g = coroutineScope;
        return channelFlow$collect$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68096f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f68097g;
            FlowCollector<Object> flowCollector = this.f68098h;
            ReceiveChannel<Object> mo34207j = this.f68099i.mo34207j(coroutineScope);
            this.f68096f = 1;
            if (FlowKt.m34211c(flowCollector, mo34207j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}

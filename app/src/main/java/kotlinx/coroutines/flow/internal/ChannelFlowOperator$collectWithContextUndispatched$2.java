package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"S", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m32126f = "ChannelFlow.kt", m32127l = {152}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68119f;

    /* renamed from: g */
    public /* synthetic */ Object f68120g;

    /* renamed from: h */
    public final /* synthetic */ ChannelFlowOperator<Object, Object> f68121h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<Object, Object> channelFlowOperator, Continuation<? super ChannelFlowOperator$collectWithContextUndispatched$2> continuation) {
        super(2, continuation);
        this.f68121h = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f68121h, continuation);
        channelFlowOperator$collectWithContextUndispatched$2.f68120g = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f68121h, continuation);
        channelFlowOperator$collectWithContextUndispatched$2.f68120g = flowCollector;
        return channelFlowOperator$collectWithContextUndispatched$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68119f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector<? super Object> flowCollector = (FlowCollector) this.f68120g;
            ChannelFlowOperator<Object, Object> channelFlowOperator = this.f68121h;
            this.f68119f = 1;
            if (channelFlowOperator.mo34256k(flowCollector, this) == coroutineSingletons) {
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

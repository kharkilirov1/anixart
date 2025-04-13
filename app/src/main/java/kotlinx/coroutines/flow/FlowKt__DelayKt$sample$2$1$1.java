package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/channels/ChannelResult;", "", "result", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m32126f = "Delay.kt", m32127l = {}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public /* synthetic */ Object f67576f;

    /* renamed from: g */
    public final /* synthetic */ Ref.ObjectRef<Object> f67577g;

    /* renamed from: h */
    public final /* synthetic */ ReceiveChannel<Unit> f67578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> objectRef, ReceiveChannel<Unit> receiveChannel, Continuation<? super FlowKt__DelayKt$sample$2$1$1> continuation) {
        super(2, continuation);
        this.f67577g = objectRef;
        this.f67578h = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f67577g, this.f67578h, continuation);
        flowKt__DelayKt$sample$2$1$1.f67576f = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ChannelResult<? extends Object> channelResult, Continuation<? super Unit> continuation) {
        ChannelResult channelResult2 = new ChannelResult(channelResult.f67141a);
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f67577g, this.f67578h, continuation);
        flowKt__DelayKt$sample$2$1$1.f67576f = channelResult2;
        Unit unit = Unit.f63088a;
        flowKt__DelayKt$sample$2$1$1.mo2379m(unit);
        return unit;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        ?? r4 = ((ChannelResult) this.f67576f).f67141a;
        Ref.ObjectRef<Object> objectRef = this.f67577g;
        boolean z = r4 instanceof ChannelResult.Failed;
        if (!z) {
            objectRef.f63351b = r4;
        }
        ReceiveChannel<Unit> receiveChannel = this.f67578h;
        if (z) {
            Throwable m34177a = ChannelResult.m34177a(r4);
            if (m34177a != null) {
                throw m34177a;
            }
            receiveChannel.mo34129b(new ChildCancelledException());
            objectRef.f63351b = NullSurrogateKt.f68211c;
        }
        return Unit.f63088a;
    }
}

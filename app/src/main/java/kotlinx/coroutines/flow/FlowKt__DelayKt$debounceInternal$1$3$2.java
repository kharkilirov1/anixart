package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/channels/ChannelResult;", "", "value", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m32126f = "Delay.kt", m32127l = {243}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67553f;

    /* renamed from: g */
    public int f67554g;

    /* renamed from: h */
    public /* synthetic */ Object f67555h;

    /* renamed from: i */
    public final /* synthetic */ Ref.ObjectRef<Object> f67556i;

    /* renamed from: j */
    public final /* synthetic */ FlowCollector<Object> f67557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, FlowCollector<Object> flowCollector, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$2> continuation) {
        super(2, continuation);
        this.f67556i = objectRef;
        this.f67557j = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f67556i, this.f67557j, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.f67555h = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ChannelResult<? extends Object> channelResult, Continuation<? super Unit> continuation) {
        ChannelResult channelResult2 = new ChannelResult(channelResult.f67141a);
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f67556i, this.f67557j, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.f67555h = channelResult2;
        return flowKt__DelayKt$debounceInternal$1$3$2.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67554g;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            ?? r7 = ((ChannelResult) this.f67555h).f67141a;
            objectRef = this.f67556i;
            boolean z = r7 instanceof ChannelResult.Failed;
            if (!z) {
                objectRef.f63351b = r7;
            }
            FlowCollector<Object> flowCollector = this.f67557j;
            if (z) {
                Throwable m34177a = ChannelResult.m34177a(r7);
                if (m34177a != null) {
                    throw m34177a;
                }
                Object obj2 = objectRef.f63351b;
                if (obj2 != null) {
                    if (obj2 == NullSurrogateKt.f68209a) {
                        obj2 = null;
                    }
                    this.f67555h = r7;
                    this.f67553f = objectRef;
                    this.f67554g = 1;
                    if (flowCollector.mo4139f(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.f63351b = NullSurrogateKt.f68211c;
            }
            return Unit.f63088a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) this.f67553f;
        ResultKt.m31892b(obj);
        objectRef = objectRef2;
        objectRef.f63351b = NullSurrogateKt.f68211c;
        return Unit.f63088a;
    }
}

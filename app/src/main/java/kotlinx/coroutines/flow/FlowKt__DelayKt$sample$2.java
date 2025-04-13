package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m32126f = "Delay.kt", m32127l = {352}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67569f;

    /* renamed from: g */
    public Object f67570g;

    /* renamed from: h */
    public int f67571h;

    /* renamed from: i */
    public /* synthetic */ Object f67572i;

    /* renamed from: j */
    public /* synthetic */ Object f67573j;

    /* renamed from: k */
    public final /* synthetic */ long f67574k;

    /* renamed from: l */
    public final /* synthetic */ Flow<Object> f67575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j2, Flow<Object> flow, Continuation<? super FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.f67574k = j2;
        this.f67575l = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(CoroutineScope coroutineScope, FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f67574k, this.f67575l, continuation);
        flowKt__DelayKt$sample$2.f67572i = coroutineScope;
        flowKt__DelayKt$sample$2.f67573j = flowCollector;
        return flowKt__DelayKt$sample$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowCollector flowCollector;
        ReceiveChannel m34189c;
        Ref.ObjectRef objectRef;
        ReceiveChannel m34189c2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67571h;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f67572i;
            flowCollector = (FlowCollector) this.f67573j;
            m34189c = ProduceKt.m34189c(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.f67575l, null), 1);
            objectRef = new Ref.ObjectRef();
            long j2 = this.f67574k;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
            }
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
            }
            m34189c2 = ProduceKt.m34189c(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j2, j2, null), 1);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m34189c2 = (ReceiveChannel) this.f67570g;
            objectRef = (Ref.ObjectRef) this.f67569f;
            m34189c = (ReceiveChannel) this.f67573j;
            flowCollector = (FlowCollector) this.f67572i;
            ResultKt.m31892b(obj);
        }
        while (objectRef.f63351b != NullSurrogateKt.f68211c) {
            this.f67572i = flowCollector;
            this.f67573j = m34189c;
            this.f67569f = objectRef;
            this.f67570g = m34189c2;
            this.f67571h = 1;
            SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(this);
            try {
                m34189c.mo34131m().mo34002f(selectBuilderImpl, new FlowKt__DelayKt$sample$2$1$1(objectRef, m34189c2, null));
                m34189c2.mo34130l().mo34002f(selectBuilderImpl, new FlowKt__DelayKt$sample$2$1$2(objectRef, flowCollector, null));
            } catch (Throwable th) {
                selectBuilderImpl.m34390T(th);
            }
            if (selectBuilderImpl.m34389S() == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}

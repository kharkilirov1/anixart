package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FlowCoroutine.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m32126f = "FlowCoroutine.kt", m32127l = {51}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68203f;

    /* renamed from: g */
    public /* synthetic */ Object f68204g;

    /* renamed from: h */
    public final /* synthetic */ Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> f68205h;

    /* renamed from: i */
    public final /* synthetic */ FlowCollector<Object> f68206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(Function3<? super CoroutineScope, ? super FlowCollector<Object>, ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<Object> flowCollector, Continuation<? super FlowCoroutineKt$scopedFlow$1$1> continuation) {
        super(2, continuation);
        this.f68205h = function3;
        this.f68206i = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f68205h, this.f68206i, continuation);
        flowCoroutineKt$scopedFlow$1$1.f68204g = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f68205h, this.f68206i, continuation);
        flowCoroutineKt$scopedFlow$1$1.f68204g = coroutineScope;
        return flowCoroutineKt$scopedFlow$1$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68203f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f68204g;
            Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> function3 = this.f68205h;
            FlowCollector<Object> flowCollector = this.f68206i;
            this.f68203f = 1;
            if (function3.mo16505k(coroutineScope, flowCollector, this) == coroutineSingletons) {
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

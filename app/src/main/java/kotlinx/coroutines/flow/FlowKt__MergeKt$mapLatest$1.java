package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m32126f = "Merge.kt", m32127l = {214, 214}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67739f;

    /* renamed from: g */
    public /* synthetic */ Object f67740g;

    /* renamed from: h */
    public /* synthetic */ Object f67741h;

    /* renamed from: i */
    public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f67742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(Function2<Object, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super FlowKt__MergeKt$mapLatest$1> continuation) {
        super(3, continuation);
        this.f67742i = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(FlowCollector<Object> flowCollector, Object obj, Continuation<? super Unit> continuation) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f67742i, continuation);
        flowKt__MergeKt$mapLatest$1.f67740g = flowCollector;
        flowKt__MergeKt$mapLatest$1.f67741h = obj;
        return flowKt__MergeKt$mapLatest$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67739f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            flowCollector = (FlowCollector) this.f67740g;
            Object obj2 = this.f67741h;
            Function2<Object, Continuation<Object>, Object> function2 = this.f67742i;
            this.f67740g = flowCollector;
            this.f67739f = 1;
            obj = function2.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m31892b(obj);
                return Unit.f63088a;
            }
            flowCollector = (FlowCollector) this.f67740g;
            ResultKt.m31892b(obj);
        }
        this.f67740g = null;
        this.f67739f = 2;
        if (flowCollector.mo4139f(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Unit.f63088a;
    }
}

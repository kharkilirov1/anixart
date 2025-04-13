package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Zip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, m31884d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m32126f = "Zip.kt", m32127l = {33, 33}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67977f;

    /* renamed from: g */
    public /* synthetic */ Object f67978g;

    /* renamed from: h */
    public /* synthetic */ Object f67979h;

    /* renamed from: i */
    public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f67980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combine$1$1> continuation) {
        super(3, continuation);
        this.f67980i = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f67980i, continuation);
        flowKt__ZipKt$combine$1$1.f67978g = flowCollector;
        flowKt__ZipKt$combine$1$1.f67979h = objArr;
        return flowKt__ZipKt$combine$1$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67977f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            flowCollector = (FlowCollector) this.f67978g;
            Object[] objArr = (Object[]) this.f67979h;
            Function3<Object, Object, Continuation<Object>, Object> function3 = this.f67980i;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f67978g = flowCollector;
            this.f67977f = 1;
            obj = function3.mo16505k(obj2, obj3, this);
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
            flowCollector = (FlowCollector) this.f67978g;
            ResultKt.m31892b(obj);
        }
        this.f67978g = null;
        this.f67977f = 2;
        if (flowCollector.mo4139f(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Unit.f63088a;
    }
}

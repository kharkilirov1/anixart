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

/* compiled from: Zip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", m32126f = "Zip.kt", m32127l = {262, 262}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combineUnsafe$1$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68014f;

    /* renamed from: g */
    public /* synthetic */ Object f68015g;

    /* renamed from: h */
    public /* synthetic */ Object f68016h;

    /* renamed from: i */
    public final /* synthetic */ Function2<Object[], Continuation<Object>, Object> f68017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineUnsafe$1$1(Function2<? super Object[], ? super Continuation<Object>, ? extends Object> function2, Continuation<? super FlowKt__ZipKt$combineUnsafe$1$1> continuation) {
        super(3, continuation);
        this.f68017i = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.f68017i, continuation);
        flowKt__ZipKt$combineUnsafe$1$1.f68015g = flowCollector;
        flowKt__ZipKt$combineUnsafe$1$1.f68016h = objArr;
        return flowKt__ZipKt$combineUnsafe$1$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68014f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            flowCollector = (FlowCollector) this.f68015g;
            Object[] objArr = (Object[]) this.f68016h;
            Function2<Object[], Continuation<Object>, Object> function2 = this.f68017i;
            this.f68015g = flowCollector;
            this.f68014f = 1;
            obj = function2.invoke(objArr, this);
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
            flowCollector = (FlowCollector) this.f68015g;
            ResultKt.m31892b(obj);
        }
        this.f68015g = null;
        this.f68014f = 2;
        if (flowCollector.mo4139f(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Unit.f63088a;
    }
}

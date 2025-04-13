package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements Flow<Object> {

    /* compiled from: Zip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m32126f = "Zip.kt", m32127l = {333, 333}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
    public static final class C68262 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f67923f;

        /* renamed from: g */
        public /* synthetic */ Object f67924g;

        /* renamed from: h */
        public /* synthetic */ Object f67925h;

        /* renamed from: i */
        public final /* synthetic */ Function5 f67926i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68262(Continuation continuation, Function5 function5) {
            super(3, continuation);
            this.f67926i = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
            C68262 c68262 = new C68262(continuation, this.f67926i);
            c68262.f67924g = flowCollector;
            c68262.f67925h = objArr;
            return c68262.mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f67923f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                flowCollector = (FlowCollector) this.f67924g;
                Object[] objArr = (Object[]) this.f67925h;
                Function5 function5 = this.f67926i;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f67924g = flowCollector;
                this.f67923f = 1;
                obj = function5.mo32151v(obj2, obj3, obj4, obj5, this);
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
                flowCollector = (FlowCollector) this.f67924g;
                ResultKt.m31892b(obj);
            }
            this.f67924g = null;
            this.f67923f = 2;
            if (flowCollector.mo4139f(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return Unit.f63088a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
        Object m34257a = CombineKt.m34257a(flowCollector, null, FlowKt__ZipKt$nullArrayFactory$1.f68018b, new C68262(null, null), continuation);
        return m34257a == CoroutineSingletons.COROUTINE_SUSPENDED ? m34257a : Unit.f63088a;
    }
}

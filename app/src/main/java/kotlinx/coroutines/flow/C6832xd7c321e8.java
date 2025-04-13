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
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Zip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m32126f = "Zip.kt", m32127l = {273}, m32128m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 */
/* loaded from: classes3.dex */
public final class C6832xd7c321e8 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67951f;

    /* renamed from: g */
    public /* synthetic */ Object f67952g;

    /* renamed from: h */
    public final /* synthetic */ Flow[] f67953h;

    /* renamed from: i */
    public final /* synthetic */ Function5 f67954i;

    /* compiled from: Zip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m32126f = "Zip.kt", m32127l = {333}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f67955f;

        /* renamed from: g */
        public /* synthetic */ Object f67956g;

        /* renamed from: h */
        public /* synthetic */ Object f67957h;

        /* renamed from: i */
        public final /* synthetic */ Function5 f67958i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function5 function5) {
            super(3, continuation);
            this.f67958i = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f67958i);
            anonymousClass1.f67956g = flowCollector;
            anonymousClass1.f67957h = objArr;
            return anonymousClass1.mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f67955f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f67956g;
                Object[] objArr = (Object[]) this.f67957h;
                Function5 function5 = this.f67958i;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f67955f = 1;
                if (function5.mo32151v(flowCollector, obj2, obj3, obj4, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6832xd7c321e8(Flow[] flowArr, Continuation continuation, Function5 function5) {
        super(2, continuation);
        this.f67953h = flowArr;
        this.f67954i = function5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C6832xd7c321e8 c6832xd7c321e8 = new C6832xd7c321e8(this.f67953h, continuation, this.f67954i);
        c6832xd7c321e8.f67952g = obj;
        return c6832xd7c321e8;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        C6832xd7c321e8 c6832xd7c321e8 = new C6832xd7c321e8(this.f67953h, continuation, this.f67954i);
        c6832xd7c321e8.f67952g = flowCollector;
        return c6832xd7c321e8.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67951f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f67952g;
            Flow[] flowArr = this.f67953h;
            FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.f68018b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f67954i);
            this.f67951f = 1;
            if (CombineKt.m34257a(flowCollector, flowArr, flowKt__ZipKt$nullArrayFactory$1, anonymousClass1, this) == coroutineSingletons) {
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

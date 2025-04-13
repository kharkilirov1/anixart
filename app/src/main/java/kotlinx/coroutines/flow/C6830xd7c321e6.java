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
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Zip.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m32126f = "Zip.kt", m32127l = {273}, m32128m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 */
/* loaded from: classes3.dex */
public final class C6830xd7c321e6 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67935f;

    /* renamed from: g */
    public /* synthetic */ Object f67936g;

    /* renamed from: h */
    public final /* synthetic */ Flow[] f67937h;

    /* renamed from: i */
    public final /* synthetic */ Function4 f67938i;

    /* compiled from: Zip.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m32126f = "Zip.kt", m32127l = {333}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f67939f;

        /* renamed from: g */
        public /* synthetic */ Object f67940g;

        /* renamed from: h */
        public /* synthetic */ Object f67941h;

        /* renamed from: i */
        public final /* synthetic */ Function4 f67942i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function4 function4) {
            super(3, continuation);
            this.f67942i = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Object mo16505k(FlowCollector<Object> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f67942i);
            anonymousClass1.f67940g = flowCollector;
            anonymousClass1.f67941h = objArr;
            return anonymousClass1.mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f67939f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f67940g;
                Object[] objArr = (Object[]) this.f67941h;
                Function4 function4 = this.f67942i;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f67939f = 1;
                if (function4.mo1110n(flowCollector, obj2, obj3, this) == coroutineSingletons) {
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
    public C6830xd7c321e6(Flow[] flowArr, Continuation continuation, Function4 function4) {
        super(2, continuation);
        this.f67937h = flowArr;
        this.f67938i = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C6830xd7c321e6 c6830xd7c321e6 = new C6830xd7c321e6(this.f67937h, continuation, this.f67938i);
        c6830xd7c321e6.f67936g = obj;
        return c6830xd7c321e6;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        C6830xd7c321e6 c6830xd7c321e6 = new C6830xd7c321e6(this.f67937h, continuation, this.f67938i);
        c6830xd7c321e6.f67936g = flowCollector;
        return c6830xd7c321e6.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67935f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f67936g;
            Flow[] flowArr = this.f67937h;
            FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.f68018b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f67938i);
            this.f67935f = 1;
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

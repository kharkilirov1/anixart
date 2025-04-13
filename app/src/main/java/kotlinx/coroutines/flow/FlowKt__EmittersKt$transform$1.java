package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Emitters.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m32126f = "Emitters.kt", m32127l = {40}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67620f;

    /* renamed from: g */
    public /* synthetic */ Object f67621g;

    /* renamed from: h */
    public final /* synthetic */ Flow<Object> f67622h;

    /* renamed from: i */
    public final /* synthetic */ Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> f67623i;

    /* compiled from: Emitters.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 */
    public static final class C67981<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ Function3<FlowCollector<Object>, T, Continuation<? super Unit>, Object> f67624b;

        /* renamed from: c */
        public final /* synthetic */ FlowCollector<Object> f67625c;

        /* JADX WARN: Multi-variable type inference failed */
        public C67981(Function3<? super FlowCollector<Object>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<Object> flowCollector) {
            this.f67624b = function3;
            this.f67625c = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4139f(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                int r1 = r0.f67628g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67628g = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f67626e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f67628g
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.m31892b(r6)
                goto L3f
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.m31892b(r6)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<java.lang.Object>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r4.f67624b
                kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r2 = r4.f67625c
                r0.f67628g = r3
                java.lang.Object r5 = r6.mo16505k(r2, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.Unit r5 = kotlin.Unit.f63088a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.C67981.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(Flow<Object> flow, Function3<? super FlowCollector<Object>, Object, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__EmittersKt$transform$1> continuation) {
        super(2, continuation);
        this.f67622h = flow;
        this.f67623i = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.f67622h, this.f67623i, continuation);
        flowKt__EmittersKt$transform$1.f67621g = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.f67622h, this.f67623i, continuation);
        flowKt__EmittersKt$transform$1.f67621g = flowCollector;
        return flowKt__EmittersKt$transform$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67620f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f67621g;
            Flow<Object> flow = this.f67622h;
            C67981 c67981 = new C67981(this.f67623i, flowCollector);
            this.f67620f = 1;
            if (flow.mo4140a(c67981, this) == coroutineSingletons) {
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

package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.StartedLazily$command$1", m32126f = "SharingStarted.kt", m32127l = {155}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements Function2<FlowCollector<? super SharingCommand>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68051f;

    /* renamed from: g */
    public /* synthetic */ Object f68052g;

    /* renamed from: h */
    public final /* synthetic */ StateFlow<Integer> f68053h;

    /* compiled from: SharingStarted.kt */
    @Metadata(m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "count", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    public static final class C68411<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f68054b;

        /* renamed from: c */
        public final /* synthetic */ FlowCollector<SharingCommand> f68055c;

        /* JADX WARN: Multi-variable type inference failed */
        public C68411(Ref.BooleanRef booleanRef, FlowCollector<? super SharingCommand> flowCollector) {
            this.f68054b = booleanRef;
            this.f68055c = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object m34247a(int r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.f68058g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68058g = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f68056e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f68058g
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.m31892b(r6)
                goto L49
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.m31892b(r6)
                if (r5 <= 0) goto L4c
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f68054b
                boolean r6 = r5.f63347b
                if (r6 != 0) goto L4c
                r5.f63347b = r3
                kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> r5 = r4.f68055c
                kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                r0.f68058g = r3
                java.lang.Object r5 = r5.mo4139f(r6, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                kotlin.Unit r5 = kotlin.Unit.f63088a
                return r5
            L4c:
                kotlin.Unit r5 = kotlin.Unit.f63088a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.C68411.m34247a(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo4139f(Object obj, Continuation continuation) {
            return m34247a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow<Integer> stateFlow, Continuation<? super StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.f68053h = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f68053h, continuation);
        startedLazily$command$1.f68052g = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<? super SharingCommand> flowCollector, Continuation<? super Unit> continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f68053h, continuation);
        startedLazily$command$1.f68052g = flowCollector;
        startedLazily$command$1.mo2379m(Unit.f63088a);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68051f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f68052g;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            StateFlow<Integer> stateFlow = this.f68053h;
            C68411 c68411 = new C68411(booleanRef, flowCollector);
            this.f68051f = 1;
            if (stateFlow.mo4140a(c68411, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        throw new KotlinNothingValueException();
    }
}

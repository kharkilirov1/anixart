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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m32126f = "Share.kt", m32127l = {340}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67835f;

    /* renamed from: g */
    public /* synthetic */ Object f67836g;

    /* renamed from: h */
    public final /* synthetic */ Flow<Object> f67837h;

    /* renamed from: i */
    public final /* synthetic */ CompletableDeferred<StateFlow<Object>> f67838i;

    /* compiled from: Share.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 */
    public static final class C68111<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<MutableStateFlow<T>> f67839b;

        /* renamed from: c */
        public final /* synthetic */ CoroutineScope f67840c;

        /* renamed from: d */
        public final /* synthetic */ CompletableDeferred<StateFlow<T>> f67841d;

        public C68111(Ref.ObjectRef<MutableStateFlow<T>> objectRef, CoroutineScope coroutineScope, CompletableDeferred<StateFlow<T>> completableDeferred) {
            this.f67839b = objectRef;
            this.f67840c = coroutineScope;
            this.f67841d = completableDeferred;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, kotlinx.coroutines.flow.StateFlow, kotlinx.coroutines.flow.StateFlowImpl] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        /* renamed from: f */
        public final Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
            Unit unit;
            MutableStateFlow<T> mutableStateFlow = this.f67839b.f63351b;
            if (mutableStateFlow == null) {
                unit = null;
            } else {
                mutableStateFlow.setValue(t);
                unit = Unit.f63088a;
            }
            if (unit == null) {
                CoroutineScope coroutineScope = this.f67840c;
                Ref.ObjectRef<MutableStateFlow<T>> objectRef = this.f67839b;
                CompletableDeferred<StateFlow<T>> completableDeferred = this.f67841d;
                if (t == null) {
                    t = (T) NullSurrogateKt.f68209a;
                }
                ?? r2 = (T) new StateFlowImpl(t);
                completableDeferred.mo34001N(new ReadonlyStateFlow(r2, JobKt.m34073e(coroutineScope.getF68244b())));
                objectRef.f63351b = r2;
            }
            return Unit.f63088a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow<Object> flow, CompletableDeferred<StateFlow<Object>> completableDeferred, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.f67837h = flow;
        this.f67838i = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f67837h, this.f67838i, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.f67836g = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f67837h, this.f67838i, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.f67836g = coroutineScope;
        return flowKt__ShareKt$launchSharingDeferred$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67835f;
        try {
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f67836g;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Flow<Object> flow = this.f67837h;
                C68111 c68111 = new C68111(objectRef, coroutineScope, this.f67838i);
                this.f67835f = 1;
                if (flow.mo4140a(c68111, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m31892b(obj);
            }
            return Unit.f63088a;
        } catch (Throwable th) {
            this.f67838i.mo34000C(th);
            throw th;
        }
    }
}

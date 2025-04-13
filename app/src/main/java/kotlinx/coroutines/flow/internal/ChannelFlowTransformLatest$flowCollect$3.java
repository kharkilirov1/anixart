package kotlinx.coroutines.flow.internal;

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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m32126f = "Merge.kt", m32127l = {27}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68123f;

    /* renamed from: g */
    public /* synthetic */ Object f68124g;

    /* renamed from: h */
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> f68125h;

    /* renamed from: i */
    public final /* synthetic */ FlowCollector<R> f68126i;

    /* compiled from: Merge.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    public static final class C68431<T> implements FlowCollector, SuspendFunction {

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<Job> f68127b;

        /* renamed from: c */
        public final /* synthetic */ CoroutineScope f68128c;

        /* renamed from: d */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f68129d;

        /* renamed from: e */
        public final /* synthetic */ FlowCollector<R> f68130e;

        /* compiled from: Merge.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
        @DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m32126f = "Merge.kt", m32127l = {34}, m32128m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: f */
            public int f68131f;

            /* renamed from: g */
            public final /* synthetic */ ChannelFlowTransformLatest<T, R> f68132g;

            /* renamed from: h */
            public final /* synthetic */ FlowCollector<R> f68133h;

            /* renamed from: i */
            public final /* synthetic */ T f68134i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, T t, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f68132g = channelFlowTransformLatest;
                this.f68133h = flowCollector;
                this.f68134i = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            /* renamed from: a */
            public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.f68132g, this.f68133h, this.f68134i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(this.f68132g, this.f68133h, this.f68134i, continuation).mo2379m(Unit.f63088a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public final Object mo2379m(@NotNull Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.f68131f;
                if (i2 == 0) {
                    ResultKt.m31892b(obj);
                    Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> function3 = this.f68132g.f68122f;
                    Object obj3 = this.f68133h;
                    T t = this.f68134i;
                    this.f68131f = 1;
                    if (function3.mo16505k(obj3, t, this) == obj2) {
                        return obj2;
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

        /* JADX WARN: Multi-variable type inference failed */
        public C68431(Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector) {
            this.f68127b = objectRef;
            this.f68128c = coroutineScope;
            this.f68129d = channelFlowTransformLatest;
            this.f68130e = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @org.jetbrains.annotations.Nullable
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4139f(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.f68140j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68140j = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f68138h
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f68140j
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f68137g
                kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                java.lang.Object r8 = r0.f68136f
                java.lang.Object r0 = r0.f68135e
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C68431) r0
                kotlin.ResultKt.m31892b(r9)
                goto L5d
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.ResultKt.m31892b(r9)
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r7.f68127b
                T r9 = r9.f63351b
                kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                if (r9 != 0) goto L45
                goto L5c
            L45:
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.mo34061b(r2)
                r0.f68135e = r7
                r0.f68136f = r8
                r0.f68137g = r9
                r0.f68140j = r3
                java.lang.Object r9 = r9.mo34062k(r0)
                if (r9 != r1) goto L5c
                return r1
            L5c:
                r0 = r7
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r0.f68127b
                kotlinx.coroutines.CoroutineScope r1 = r0.f68128c
                r2 = 0
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r0.f68129d
                kotlinx.coroutines.flow.FlowCollector<R> r0 = r0.f68130e
                r6 = 0
                r4.<init>(r5, r0, r8, r6)
                r5 = 1
                kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.m33962a(r1, r2, r3, r4, r5, r6)
                r9.f63351b = r8
                kotlin.Unit r8 = kotlin.Unit.f63088a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C68431.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.f68125h = channelFlowTransformLatest;
        this.f68126i = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f68125h, this.f68126i, continuation);
        channelFlowTransformLatest$flowCollect$3.f68124g = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f68125h, this.f68126i, continuation);
        channelFlowTransformLatest$flowCollect$3.f68124g = coroutineScope;
        return channelFlowTransformLatest$flowCollect$3.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68123f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f68124g;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.f68125h;
            Flow<S> flow = channelFlowTransformLatest.f68118e;
            C68431 c68431 = new C68431(objectRef, coroutineScope, channelFlowTransformLatest, this.f68126i);
            this.f68123f = 1;
            if (flow.mo4140a(c68431, this) == coroutineSingletons) {
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

package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Combine.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, m31884d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m32126f = "Combine.kt", m32127l = {129}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68165f;

    /* renamed from: g */
    public /* synthetic */ Object f68166g;

    /* renamed from: h */
    public final /* synthetic */ FlowCollector<Object> f68167h;

    /* renamed from: i */
    public final /* synthetic */ Flow<Object> f68168i;

    /* renamed from: j */
    public final /* synthetic */ Flow<Object> f68169j;

    /* renamed from: k */
    public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f68170k;

    /* compiled from: Combine.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m31884d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m32126f = "Combine.kt", m32127l = {130}, m32128m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    public static final class C68462 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

        /* renamed from: f */
        public int f68173f;

        /* renamed from: g */
        public final /* synthetic */ Flow<Object> f68174g;

        /* renamed from: h */
        public final /* synthetic */ CoroutineContext f68175h;

        /* renamed from: i */
        public final /* synthetic */ Object f68176i;

        /* renamed from: j */
        public final /* synthetic */ ReceiveChannel<Object> f68177j;

        /* renamed from: k */
        public final /* synthetic */ FlowCollector<Object> f68178k;

        /* renamed from: l */
        public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f68179l;

        /* compiled from: Combine.kt */
        @Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m31884d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector, SuspendFunction {

            /* renamed from: b */
            public final /* synthetic */ CoroutineContext f68180b;

            /* renamed from: c */
            public final /* synthetic */ Object f68181c;

            /* renamed from: d */
            public final /* synthetic */ ReceiveChannel<Object> f68182d;

            /* renamed from: e */
            public final /* synthetic */ FlowCollector<Object> f68183e;

            /* renamed from: f */
            public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f68184f;

            /* compiled from: Combine.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m31884d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
            @DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m32126f = "Combine.kt", m32127l = {132, 135, 135}, m32128m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C70241 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

                /* renamed from: f */
                public Object f68185f;

                /* renamed from: g */
                public int f68186g;

                /* renamed from: h */
                public final /* synthetic */ ReceiveChannel<Object> f68187h;

                /* renamed from: i */
                public final /* synthetic */ FlowCollector<Object> f68188i;

                /* renamed from: j */
                public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f68189j;

                /* renamed from: k */
                public final /* synthetic */ Object f68190k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C70241(ReceiveChannel<? extends Object> receiveChannel, FlowCollector<Object> flowCollector, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Object obj, Continuation<? super C70241> continuation) {
                    super(2, continuation);
                    this.f68187h = receiveChannel;
                    this.f68188i = flowCollector;
                    this.f68189j = function3;
                    this.f68190k = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                /* renamed from: a */
                public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C70241(this.f68187h, this.f68188i, this.f68189j, this.f68190k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return new C70241(this.f68187h, this.f68188i, this.f68189j, this.f68190k, continuation).mo2379m(Unit.f63088a);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /* renamed from: m */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                    /*
                        r8 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r8.f68186g
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2c
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L14
                        kotlin.ResultKt.m31892b(r9)
                        goto L6b
                    L14:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1c:
                        java.lang.Object r1 = r8.f68185f
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        kotlin.ResultKt.m31892b(r9)
                        goto L60
                    L24:
                        kotlin.ResultKt.m31892b(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.f67141a
                        goto L3a
                    L2c:
                        kotlin.ResultKt.m31892b(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.f68187h
                        r8.f68186g = r5
                        java.lang.Object r9 = r9.mo34134q(r8)
                        if (r9 != r0) goto L3a
                        return r0
                    L3a:
                        kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r1 = r8.f68188i
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r5 == 0) goto L4c
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m34177a(r9)
                        if (r9 != 0) goto L4b
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4b:
                        throw r9
                    L4c:
                        kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r5 = r8.f68189j
                        java.lang.Object r6 = r8.f68190k
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
                        if (r9 != r7) goto L55
                        r9 = r2
                    L55:
                        r8.f68185f = r1
                        r8.f68186g = r4
                        java.lang.Object r9 = r5.mo16505k(r6, r9, r8)
                        if (r9 != r0) goto L60
                        return r0
                    L60:
                        r8.f68185f = r2
                        r8.f68186g = r3
                        java.lang.Object r9 = r1.mo4139f(r9, r8)
                        if (r9 != r0) goto L6b
                        return r0
                    L6b:
                        kotlin.Unit r9 = kotlin.Unit.f63088a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C68462.AnonymousClass1.C70241.mo2379m(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<Object> flowCollector, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3) {
                this.f68180b = coroutineContext;
                this.f68181c = obj;
                this.f68182d = receiveChannel;
                this.f68183e = flowCollector;
                this.f68184f = function3;
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
            public final java.lang.Object mo4139f(java.lang.Object r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.f68193g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f68193g = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f68191e
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f68193g
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.ResultKt.m31892b(r14)
                    goto L4f
                L27:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2f:
                    kotlin.ResultKt.m31892b(r14)
                    kotlin.coroutines.CoroutineContext r14 = r12.f68180b
                    kotlin.Unit r2 = kotlin.Unit.f63088a
                    java.lang.Object r4 = r12.f68181c
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.f68182d
                    kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r7 = r12.f68183e
                    kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r8 = r12.f68184f
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.f68193g = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.m34254a(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.Unit r13 = kotlin.Unit.f63088a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C68462.AnonymousClass1.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C68462(Flow<Object> flow, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<Object> flowCollector, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super C68462> continuation) {
            super(2, continuation);
            this.f68174g = flow;
            this.f68175h = coroutineContext;
            this.f68176i = obj;
            this.f68177j = receiveChannel;
            this.f68178k = flowCollector;
            this.f68179l = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C68462(this.f68174g, this.f68175h, this.f68176i, this.f68177j, this.f68178k, this.f68179l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C68462) mo2378a(unit, continuation)).mo2379m(Unit.f63088a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f68173f;
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                Flow<Object> flow = this.f68174g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f68175h, this.f68176i, this.f68177j, this.f68178k, this.f68179l);
                this.f68173f = 1;
                if (flow.mo4140a(anonymousClass1, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(FlowCollector<Object> flowCollector, Flow<Object> flow, Flow<Object> flow2, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.f68167h = flowCollector;
        this.f68168i = flow;
        this.f68169j = flow2;
        this.f68170k = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f68167h, this.f68168i, this.f68169j, this.f68170k, continuation);
        combineKt$zipImpl$1$1.f68166g = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f68167h, this.f68168i, this.f68169j, this.f68170k, continuation);
        combineKt$zipImpl$1$1.f68166g = coroutineScope;
        return combineKt$zipImpl$1$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[Catch: all -> 0x0013, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:7:0x000e, B:13:0x007a, B:15:0x0086), top: B:2:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.f68165f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r14.f68166g
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.ResultKt.m31892b(r15)     // Catch: java.lang.Throwable -> L13 kotlinx.coroutines.flow.internal.AbortFlowException -> L16
            goto L80
        L13:
            r15 = move-exception
            goto L87
        L16:
            r15 = move-exception
            goto L7a
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            kotlin.ResultKt.m31892b(r15)
            java.lang.Object r15 = r14.f68166g
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            r1 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow<java.lang.Object> r5 = r14.f68168i
            r4.<init>(r5, r2)
            r5 = 3
            kotlinx.coroutines.channels.ReceiveChannel r1 = kotlinx.coroutines.channels.ProduceKt.m34189c(r15, r2, r1, r4, r5)
            kotlinx.coroutines.CompletableJob r4 = kotlinx.coroutines.JobKt.m34069a(r2, r3, r2)
            r5 = r1
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r7 = r14.f68167h
            r6.<init>()
            r5.mo34164z(r6)
            kotlin.coroutines.CoroutineContext r8 = r15.getF68244b()     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            java.lang.Object r9 = kotlinx.coroutines.internal.ThreadContextKt.m34337b(r8)     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlin.coroutines.CoroutineContext r15 = r15.getF68244b()     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlin.coroutines.CoroutineContext r15 = r15.plus(r4)     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlin.Unit r4 = kotlin.Unit.f63088a     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlinx.coroutines.flow.Flow<java.lang.Object> r7 = r14.f68169j     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r11 = r14.f68167h     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r12 = r14.f68170k     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            r13 = 0
            r6 = r5
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            r14.f68166g = r1     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            r14.f68165f = r3     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.m34337b(r15)     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            java.lang.Object r15 = kotlinx.coroutines.flow.internal.ChannelFlowKt.m34254a(r15, r4, r3, r5, r14)     // Catch: java.lang.Throwable -> L76 kotlinx.coroutines.flow.internal.AbortFlowException -> L78
            if (r15 != r0) goto L74
            return r0
        L74:
            r0 = r1
            goto L80
        L76:
            r15 = move-exception
            goto L88
        L78:
            r15 = move-exception
            r0 = r1
        L7a:
            kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r1 = r14.f68167h     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.flow.FlowCollector<?> r3 = r15.f68087b     // Catch: java.lang.Throwable -> L13
            if (r3 != r1) goto L86
        L80:
            r0.mo34129b(r2)
            kotlin.Unit r15 = kotlin.Unit.f63088a
            return r15
        L86:
            throw r15     // Catch: java.lang.Throwable -> L13
        L87:
            r1 = r0
        L88:
            r1.mo34129b(r2)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, m31885k = 4, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class FlowKt {
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(3:16|17|18)))|46|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r0 = r3;
        r3 = (java.lang.Throwable) r4.f63351b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        r2 = r2.f63244c;
        kotlin.jvm.internal.Intrinsics.m32176e(r2);
        r2 = (kotlinx.coroutines.Job) r2.get(kotlinx.coroutines.Job.Key.f67019b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r1 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r3 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if ((r0 instanceof java.util.concurrent.CancellationException) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        kotlin.ExceptionsKt.m31878a(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        kotlin.ExceptionsKt.m31878a(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m34209a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Throwable> r4) {
        /*
            boolean r2 = r4 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r2 == 0) goto L13
            r2 = r4
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r2
            int r3 = r2.f67648g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r0
            if (r1 == 0) goto L13
            int r3 = r3 - r0
            r2.f67648g = r3
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r2.<init>(r4)
        L18:
            java.lang.Object r3 = r2.f67647f
            int r4 = r2.f67648g
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L32
            if (r4 != r1) goto L2a
            java.lang.Object r4 = r2.f67646e
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.ResultKt.m31892b(r3)     // Catch: java.lang.Throwable -> L3b
            goto L76
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L32:
            kotlin.jvm.internal.Ref$ObjectRef r4 = com.yandex.div2.C3033a.m17746h(r3)
            r2.f67646e = r4     // Catch: java.lang.Throwable -> L3b
            r2.f67648g = r1     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r3
            T r3 = r4.f63351b
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L4b
            boolean r4 = kotlin.jvm.internal.Intrinsics.m32174c(r3, r0)
            if (r4 == 0) goto L4b
            r4 = 1
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 != 0) goto L83
            kotlin.coroutines.CoroutineContext r2 = r2.f63244c
            kotlin.jvm.internal.Intrinsics.m32176e(r2)
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key.f67019b
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r4)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            if (r2 == 0) goto L71
            boolean r4 = r2.isCancelled()
            if (r4 != 0) goto L64
            goto L71
        L64:
            java.util.concurrent.CancellationException r2 = r2.mo34064o()
            if (r2 == 0) goto L71
            boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r0)
            if (r2 == 0) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            if (r1 != 0) goto L83
            if (r3 != 0) goto L77
        L76:
            return r0
        L77:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L7f
            kotlin.ExceptionsKt.m31878a(r3, r0)
            throw r3
        L7f:
            kotlin.ExceptionsKt.m31878a(r0, r3)
            throw r0
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.m34209a(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: b */
    public static final <T> Flow<T> m34210b(@NotNull Flow<? extends T> flow) {
        Function1<Object, Object> function1 = FlowKt__DistinctKt.f67589a;
        if (flow instanceof StateFlow) {
            return flow;
        }
        Function1<Object, Object> function12 = FlowKt__DistinctKt.f67589a;
        Function2<Object, Object, Boolean> function2 = FlowKt__DistinctKt.f67590b;
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.f67452c == function12 && distinctFlowImpl.f67453d == function2) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, function12, function2);
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m34211c(@NotNull FlowCollector<? super T> flowCollector, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull Continuation<? super Unit> continuation) {
        Object m34216a = FlowKt__ChannelsKt.m34216a(flowCollector, receiveChannel, true, continuation);
        return m34216a == CoroutineSingletons.COROUTINE_SUSPENDED ? m34216a : Unit.f63088a;
    }

    @Nullable
    /* renamed from: d */
    public static final <T> Object m34212d(@NotNull FlowCollector<? super T> flowCollector, @NotNull Flow<? extends T> flow, @NotNull Continuation<? super Unit> continuation) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).f68086b;
        }
        Object mo4140a = flow.mo4140a(flowCollector, continuation);
        return mo4140a == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4140a : Unit.f63088a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r5.mo4140a(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m34213e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.f67781i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67781i = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f67780h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67781i
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f67779g
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r5 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r5
            java.lang.Object r6 = r0.f67778f
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r0 = r0.f67777e
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.ResultKt.m31892b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L33
            goto L66
        L33:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L60
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.jvm.internal.Ref$ObjectRef r7 = com.yandex.div2.C3033a.m17746h(r7)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            r7.f63351b = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r6, r7)
            r0.f67777e = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f67778f = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f67779g = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f67781i = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            java.lang.Object r5 = r5.mo4140a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            if (r5 != r1) goto L64
            goto L6c
        L5d:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L60:
            kotlinx.coroutines.flow.FlowCollector<?> r1 = r0.f68087b
            if (r1 != r5) goto L79
        L64:
            r0 = r6
            r6 = r7
        L66:
            T r1 = r6.f63351b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            if (r1 == r5) goto L6d
        L6c:
            return r1
        L6d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.m32187p(r6, r0)
            r5.<init>(r6)
            throw r5
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.m34213e(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    /* renamed from: f */
    public static final <T> Flow<T> m34214f(@BuilderInference @NotNull Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SafeFlow(function2);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    /* renamed from: g */
    public static final <T, R> Flow<R> m34215g(@NotNull Flow<? extends T> flow, @BuilderInference @NotNull Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        int i2 = FlowKt__MergeKt.f67718a;
        return new ChannelFlowTransformLatest(function3, flow, null, 0, null, 28);
    }
}

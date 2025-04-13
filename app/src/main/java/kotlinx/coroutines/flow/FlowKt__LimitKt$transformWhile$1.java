package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m32126f = "Limit.kt", m32127l = {153}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67714f;

    /* renamed from: g */
    public /* synthetic */ Object f67715g;

    /* renamed from: h */
    public final /* synthetic */ Flow<Object> f67716h;

    /* renamed from: i */
    public final /* synthetic */ Function3<FlowCollector<Object>, Object, Continuation<? super Boolean>, Object> f67717i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(Flow<Object> flow, Function3<? super FlowCollector<Object>, Object, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super FlowKt__LimitKt$transformWhile$1> continuation) {
        super(2, continuation);
        this.f67716h = flow;
        this.f67717i = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f67716h, this.f67717i, continuation);
        flowKt__LimitKt$transformWhile$1.f67715g = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f67716h, this.f67717i, continuation);
        flowKt__LimitKt$transformWhile$1.f67715g = flowCollector;
        return flowKt__LimitKt$transformWhile$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.f67714f
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f67715g
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.C6804xdf1aa1b6) r0
            kotlin.ResultKt.m31892b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            goto L3c
        L11:
            r6 = move-exception
            goto L38
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.m31892b(r6)
            java.lang.Object r6 = r5.f67715g
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlinx.coroutines.flow.Flow<java.lang.Object> r1 = r5.f67716h
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<java.lang.Object>, java.lang.Object, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f67717i
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            r4.<init>(r3, r6)
            r5.f67715g = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            r5.f67714f = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            java.lang.Object r6 = r1.mo4140a(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            if (r6 != r0) goto L3c
            return r0
        L36:
            r6 = move-exception
            r0 = r4
        L38:
            kotlinx.coroutines.flow.FlowCollector<?> r1 = r6.f68087b
            if (r1 != r0) goto L3f
        L3c:
            kotlin.Unit r6 = kotlin.Unit.f63088a
            return r6
        L3f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

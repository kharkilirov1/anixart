package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: Limit.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f67697b;

    /* renamed from: c */
    public final /* synthetic */ FlowCollector<T> f67698c;

    /* renamed from: d */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f67699d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, FlowCollector<? super T> flowCollector, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.f67697b = booleanRef;
        this.f67698c = flowCollector;
        this.f67699d = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4139f(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.f67704i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67704i = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f67702g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67704i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.m31892b(r8)
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f67701f
            java.lang.Object r2 = r0.f67700e
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.ResultKt.m31892b(r8)
            goto L6a
        L3f:
            kotlin.ResultKt.m31892b(r8)
            goto L57
        L43:
            kotlin.ResultKt.m31892b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f67697b
            boolean r8 = r8.f63347b
            if (r8 == 0) goto L5a
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r6.f67698c
            r0.f67704i = r5
            java.lang.Object r7 = r8.mo4139f(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            kotlin.Unit r7 = kotlin.Unit.f63088a
            return r7
        L5a:
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f67699d
            r0.f67700e = r6
            r0.f67701f = r7
            r0.f67704i = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r2 = r6
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L89
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f67697b
            r8.f63347b = r5
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r2.f67698c
            r2 = 0
            r0.f67700e = r2
            r0.f67701f = r2
            r0.f67704i = r3
            java.lang.Object r7 = r8.mo4139f(r7, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            kotlin.Unit r7 = kotlin.Unit.f63088a
            return r7
        L89:
            kotlin.Unit r7 = kotlin.Unit.f63088a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

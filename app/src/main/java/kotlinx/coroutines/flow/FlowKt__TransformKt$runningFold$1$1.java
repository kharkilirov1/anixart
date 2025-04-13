package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: Transform.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f67898b;

    /* renamed from: c */
    public final /* synthetic */ Function3<Object, T, Continuation<Object>, Object> f67899c;

    /* renamed from: d */
    public final /* synthetic */ FlowCollector<Object> f67900d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
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
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.f67905i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67905i = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f67903g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67905i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.m31892b(r9)
            goto L6e
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.f67902f
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.f67901e
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            kotlin.ResultKt.m31892b(r9)
            goto L58
        L3e:
            kotlin.ResultKt.m31892b(r9)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f67898b
            kotlin.jvm.functions.Function3<java.lang.Object, T, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r2 = r7.f67899c
            T r5 = r9.f63351b
            r0.f67901e = r7
            r0.f67902f = r9
            r0.f67905i = r4
            java.lang.Object r8 = r2.mo16505k(r5, r8, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L58:
            r8.f63351b = r9
            kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r8 = r2.f67900d
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.f67898b
            T r9 = r9.f63351b
            r2 = 0
            r0.f67901e = r2
            r0.f67902f = r2
            r0.f67905i = r3
            java.lang.Object r8 = r8.mo4139f(r9, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

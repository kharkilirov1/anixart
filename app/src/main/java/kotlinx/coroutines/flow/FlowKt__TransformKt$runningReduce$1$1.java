package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: Transform.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f67906b;

    /* renamed from: c */
    public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f67907c;

    /* renamed from: d */
    public final /* synthetic */ FlowCollector<T> f67908d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
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
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.f67913i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67913i = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f67911g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67913i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.m31892b(r9)
            goto L77
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.f67910f
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.f67909e
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r2
            kotlin.ResultKt.m31892b(r9)
            goto L5e
        L3e:
            kotlin.ResultKt.m31892b(r9)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f67906b
            T r2 = r9.f63351b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            if (r2 != r5) goto L4b
            r2 = r7
            goto L61
        L4b:
            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r5 = r7.f67907c
            r0.f67909e = r7
            r0.f67910f = r9
            r0.f67913i = r4
            java.lang.Object r8 = r5.mo16505k(r2, r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L5e:
            r6 = r9
            r9 = r8
            r8 = r6
        L61:
            r9.f63351b = r8
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r2.f67908d
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.f67906b
            T r9 = r9.f63351b
            r2 = 0
            r0.f67909e = r2
            r0.f67910f = r2
            r0.f67913i = r3
            java.lang.Object r8 = r8.mo4139f(r9, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

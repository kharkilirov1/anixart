package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;

/* compiled from: Context.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class CancellableFlowImpl$collect$2<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ FlowCollector<T> f67443b;

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
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) r0
            int r1 = r0.f67446g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67446g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f67444e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67446g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.m31892b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.m31892b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.f63244c
            kotlin.jvm.internal.Intrinsics.m32176e(r6)
            kotlinx.coroutines.JobKt.m34072d(r6)
            kotlinx.coroutines.flow.FlowCollector<T> r6 = r4.f67443b
            r0.f67446g = r3
            java.lang.Object r5 = r6.mo4139f(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f63088a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

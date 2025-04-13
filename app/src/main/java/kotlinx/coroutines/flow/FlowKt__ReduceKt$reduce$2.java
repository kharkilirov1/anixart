package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: Reduce.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$reduce$2<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f67810b;

    /* renamed from: c */
    public final /* synthetic */ Function3<Object, T, Continuation<Object>, Object> f67811c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
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
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) r0
            int r1 = r0.f67815h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67815h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f67813f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67815h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f67812e
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.m31892b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.m31892b(r8)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r8 = r6.f67810b
            T r2 = r8.f63351b
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            if (r2 == r4) goto L51
            kotlin.jvm.functions.Function3<java.lang.Object, T, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r4 = r6.f67811c
            r0.f67812e = r8
            r0.f67815h = r3
            java.lang.Object r7 = r4.mo16505k(r2, r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r5 = r8
            r8 = r7
            r7 = r5
        L4e:
            r5 = r8
            r8 = r7
            r7 = r5
        L51:
            r8.f63351b = r7
            kotlin.Unit r7 = kotlin.Unit.f63088a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

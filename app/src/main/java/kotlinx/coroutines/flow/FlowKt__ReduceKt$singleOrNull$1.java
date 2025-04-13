package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {183}, m32128m = "singleOrNull")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67820e;

    /* renamed from: f */
    public Object f67821f;

    /* renamed from: g */
    public /* synthetic */ Object f67822g;

    /* renamed from: h */
    public int f67823h;

    public FlowKt__ReduceKt$singleOrNull$1(Continuation<? super FlowKt__ReduceKt$singleOrNull$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
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
            r5.f67822g = r6
            int r6 = r5.f67823h
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.f67823h = r6
            r1 = r6 & r0
            if (r1 == 0) goto L12
            int r6 = r6 - r0
            r5.f67823h = r6
            r6 = r5
            goto L17
        L12:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 r6 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1
            r6.<init>(r5)
        L17:
            java.lang.Object r0 = r6.f67822g
            int r1 = r6.f67823h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r1 = r6.f67821f
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) r1
            java.lang.Object r6 = r6.f67820e
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L53
        L2d:
            r0 = move-exception
            goto L4f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.jvm.internal.Ref$ObjectRef r0 = com.yandex.div2.C3033a.m17746h(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            r0.f63351b = r1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            r1.<init>()
            r6.f67820e = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r6.f67821f = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r6.f67823h = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            throw r3
        L4b:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L4f:
            kotlinx.coroutines.flow.FlowCollector<?> r2 = r0.f68087b
            if (r2 != r1) goto L5c
        L53:
            T r6 = r6.f63351b
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            if (r6 != r0) goto L5a
            goto L5b
        L5a:
            r3 = r6
        L5b:
            return r3
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

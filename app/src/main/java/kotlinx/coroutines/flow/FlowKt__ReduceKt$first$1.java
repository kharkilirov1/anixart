package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {183}, m32128m = "first")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67773e;

    /* renamed from: f */
    public Object f67774f;

    /* renamed from: g */
    public /* synthetic */ Object f67775g;

    /* renamed from: h */
    public int f67776h;

    public FlowKt__ReduceKt$first$1(Continuation<? super FlowKt__ReduceKt$first$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            r4.f67775g = r5
            int r5 = r4.f67776h
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r0
            r4.f67776h = r5
            r1 = r5 & r0
            if (r1 == 0) goto L12
            int r5 = r5 - r0
            r4.f67776h = r5
            r5 = r4
            goto L17
        L12:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r5.<init>(r4)
        L17:
            java.lang.Object r0 = r5.f67775g
            int r1 = r5.f67776h
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r1 = r5.f67774f
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) r1
            java.lang.Object r5 = r5.f67773e
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.m31892b(r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2c
            goto L53
        L2c:
            r0 = move-exception
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            kotlin.jvm.internal.Ref$ObjectRef r0 = com.yandex.div2.C3033a.m17746h(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            r0.f63351b = r1
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
            r1.<init>()
            r5.f67773e = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r5.f67774f = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r5.f67776h = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r5 = 0
            throw r5
        L4b:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L4f:
            kotlinx.coroutines.flow.FlowCollector<?> r2 = r0.f68087b
            if (r2 != r1) goto L62
        L53:
            T r5 = r5.f63351b
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f68209a
            if (r5 == r0) goto L5a
            return r5
        L5a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r5.<init>(r0)
            throw r5
        L62:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

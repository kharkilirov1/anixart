package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements FlowCollector<Object> {

    /* renamed from: b */
    public final /* synthetic */ Function2 f67765b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f67766c;

    /* compiled from: Limit.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m32126f = "Reduce.kt", m32127l = {143}, m32128m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    public static final class C68081 extends ContinuationImpl {

        /* renamed from: e */
        public Object f67767e;

        /* renamed from: f */
        public /* synthetic */ Object f67768f;

        /* renamed from: g */
        public int f67769g;

        /* renamed from: i */
        public Object f67771i;

        public C68081(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67768f = obj;
            this.f67769g |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.mo4139f(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(Function2 function2, Ref.ObjectRef objectRef) {
        this.f67765b = function2;
        this.f67766c = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4139f(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.C68081
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.C68081) r0
            int r1 = r0.f67769g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67769g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67768f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67769g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f67771i
            java.lang.Object r0 = r0.f67767e
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r0
            kotlin.ResultKt.m31892b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.m31892b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f67765b
            r0.f67767e = r4
            r0.f67771i = r5
            r0.f67769g = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f67766c
            r6.f63351b = r5
            r3 = 0
        L55:
            if (r3 == 0) goto L5a
            kotlin.Unit r5 = kotlin.Unit.f63088a
            return r5
        L5a:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.mo4139f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

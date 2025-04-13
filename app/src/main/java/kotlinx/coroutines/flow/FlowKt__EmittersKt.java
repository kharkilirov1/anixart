package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: Emitters.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 5, m31886mv = {1, 6, 0}, m31889xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m34217a(kotlinx.coroutines.flow.FlowCollector r2, kotlin.jvm.functions.Function3 r3, java.lang.Throwable r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r2 == 0) goto L13
            r2 = r5
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r2
            int r3 = r2.f67614g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r0
            if (r1 == 0) goto L13
            int r3 = r3 - r0
            r2.f67614g = r3
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r2 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r2.<init>(r5)
        L18:
            java.lang.Object r3 = r2.f67613f
            int r5 = r2.f67614g
            r0 = 1
            if (r5 == 0) goto L34
            if (r5 != r0) goto L2c
            java.lang.Object r2 = r2.f67612e
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.m31892b(r3)     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r2 = kotlin.Unit.f63088a
            return r2
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L34:
            kotlin.ResultKt.m31892b(r3)
            r2.f67612e = r4     // Catch: java.lang.Throwable -> L3d
            r2.f67614g = r0     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            throw r2     // Catch: java.lang.Throwable -> L3d
        L3d:
            r2 = move-exception
            if (r4 == 0) goto L45
            if (r4 == r2) goto L45
            kotlin.ExceptionsKt.m31878a(r2, r4)
        L45:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.m34217a(kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: Share.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SubscribedSharedFlow<T> implements SharedFlow<T> {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r4 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) r4
            int r0 = r4.f68085g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f68085g = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r4 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f68083e
            int r0 = r4.f68085g
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            kotlin.ResultKt.m31892b(r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L32:
            kotlin.ResultKt.m31892b(r5)
            r4.f68085g = r1
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

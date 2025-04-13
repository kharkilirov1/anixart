package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* compiled from: TickerChannels.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class TickerChannelsKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (kotlinx.coroutines.DelayKt.m34032a(r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (kotlinx.coroutines.DelayKt.m34032a(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:12:0x007d). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m34193a(long r6, long r8, kotlinx.coroutines.channels.SendChannel r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.f67380h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67380h = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f67379g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67380h
            r3 = 1
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L50
            if (r2 == r3) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            long r6 = r0.f67377e
            java.lang.Object r8 = r0.f67378f
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.m31892b(r11)
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            long r6 = r0.f67377e
            java.lang.Object r8 = r0.f67378f
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.m31892b(r11)
            goto L70
        L45:
            long r6 = r0.f67377e
            java.lang.Object r8 = r0.f67378f
            r10 = r8
            kotlinx.coroutines.channels.SendChannel r10 = (kotlinx.coroutines.channels.SendChannel) r10
            kotlin.ResultKt.m31892b(r11)
            goto L60
        L50:
            kotlin.ResultKt.m31892b(r11)
            r0.f67378f = r10
            r0.f67377e = r6
            r0.f67380h = r3
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m34032a(r8, r0)
            if (r8 != r1) goto L60
            goto L7c
        L60:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            r0.f67378f = r10
            r0.f67377e = r6
            r0.f67380h = r5
            java.lang.Object r8 = r10.mo34151E(r8, r0)
            if (r8 != r1) goto L6f
            goto L7c
        L6f:
            r8 = r10
        L70:
            r0.f67378f = r8
            r0.f67377e = r6
            r0.f67380h = r4
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m34032a(r6, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r10 = r8
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m34193a(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        if (kotlinx.coroutines.DelayKt.m34032a(r13 / 1000000, r1) != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d1 -> B:16:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e3 -> B:16:0x0043). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m34194b(long r20, long r22, kotlinx.coroutines.channels.SendChannel r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m34194b(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

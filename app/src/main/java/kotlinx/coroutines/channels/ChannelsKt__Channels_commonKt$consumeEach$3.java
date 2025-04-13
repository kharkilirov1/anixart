package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channels.common.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m32126f = "Channels.common.kt", m32127l = {129}, m32128m = "consumeEach")
/* loaded from: classes3.dex */
final class ChannelsKt__Channels_commonKt$consumeEach$3<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67155e;

    /* renamed from: f */
    public Object f67156f;

    /* renamed from: g */
    public Object f67157g;

    /* renamed from: h */
    public /* synthetic */ Object f67158h;

    /* renamed from: i */
    public int f67159i;

    public ChannelsKt__Channels_commonKt$consumeEach$3(Continuation<? super ChannelsKt__Channels_commonKt$consumeEach$3> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r1 = kotlin.Unit.f63088a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r5.mo34129b(null);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            r7.f67158h = r8
            int r8 = r7.f67159i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f67159i = r8
            r1 = r8 & r0
            if (r1 == 0) goto L12
            int r8 = r8 - r0
            r7.f67159i = r8
            r8 = r7
            goto L17
        L12:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r8 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            r8.<init>(r7)
        L17:
            java.lang.Object r0 = r8.f67158h
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.f67159i
            r3 = 0
            if (r2 == 0) goto L64
            r4 = 1
            if (r2 != r4) goto L5c
            java.lang.Object r2 = r8.f67157g
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r8.f67156f
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r8.f67155e
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlin.ResultKt.m31892b(r0)     // Catch: java.lang.Throwable -> L50
        L32:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L50
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L52
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L50
            r6.invoke(r0)     // Catch: java.lang.Throwable -> L50
            r8.f67155e = r6     // Catch: java.lang.Throwable -> L50
            r8.f67156f = r5     // Catch: java.lang.Throwable -> L50
            r8.f67157g = r2     // Catch: java.lang.Throwable -> L50
            r8.f67159i = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r2.mo34140a(r8)     // Catch: java.lang.Throwable -> L50
            if (r0 != r1) goto L32
            goto L57
        L50:
            r8 = move-exception
            goto L58
        L52:
            kotlin.Unit r1 = kotlin.Unit.f63088a     // Catch: java.lang.Throwable -> L50
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m34190a(r5, r3, r4, r3)
        L57:
            return r1
        L58:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m34190a(r5, r3, r4, r3)
            throw r8
        L5c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L64:
            kotlin.ResultKt.m31892b(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3.mo2379m(java.lang.Object):java.lang.Object");
    }
}

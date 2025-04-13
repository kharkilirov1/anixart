package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Broadcast.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m31884d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m32126f = "Broadcast.kt", m32127l = {53, 54}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BroadcastKt$broadcast$2 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67125f;

    /* renamed from: g */
    public int f67126g;

    /* renamed from: h */
    public /* synthetic */ Object f67127h;

    /* renamed from: i */
    public final /* synthetic */ ReceiveChannel<Object> f67128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$2(ReceiveChannel<Object> receiveChannel, Continuation<? super BroadcastKt$broadcast$2> continuation) {
        super(2, continuation);
        this.f67128i = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.f67128i, continuation);
        broadcastKt$broadcast$2.f67127h = obj;
        return broadcastKt$broadcast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.f67128i, continuation);
        broadcastKt$broadcast$2.f67127h = producerScope;
        return broadcastKt$broadcast$2.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:7:0x003c). Please report as a decompilation issue!!! */
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f67126g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r7.f67125f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.f67127h
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.m31892b(r8)
            r8 = r4
            goto L3b
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.f67125f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.f67127h
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.m31892b(r8)
            r5 = r7
            goto L4d
        L2e:
            kotlin.ResultKt.m31892b(r8)
            java.lang.Object r8 = r7.f67127h
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r7.f67128i
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L3b:
            r4 = r7
        L3c:
            r4.f67127h = r8
            r4.f67125f = r1
            r4.f67126g = r3
            java.lang.Object r5 = r1.mo34140a(r4)
            if (r5 != r0) goto L49
            return r0
        L49:
            r6 = r4
            r4 = r8
            r8 = r5
            r5 = r6
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r1.next()
            r5.f67127h = r4
            r5.f67125f = r1
            r5.f67126g = r2
            java.lang.Object r8 = r4.mo34151E(r8, r5)
            if (r8 != r0) goto L66
            return r0
        L66:
            r8 = r4
            r4 = r5
            goto L3c
        L69:
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.mo2379m(java.lang.Object):java.lang.Object");
    }
}

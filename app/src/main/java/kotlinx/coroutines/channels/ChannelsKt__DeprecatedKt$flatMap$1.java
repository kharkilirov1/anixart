package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m32126f = "Deprecated.kt", m32127l = {321, 322, 322}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements Function2 {

    /* renamed from: f */
    public Object f67241f;

    /* renamed from: g */
    public int f67242g;

    /* renamed from: h */
    public /* synthetic */ Object f67243h;

    /* renamed from: i */
    public final /* synthetic */ ReceiveChannel f67244i;

    /* renamed from: j */
    public final /* synthetic */ Function2 f67245j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f67244i = receiveChannel;
        this.f67245j = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.f67244i, this.f67245j, continuation);
        channelsKt__DeprecatedKt$flatMap$1.f67243h = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.f67244i, this.f67245j, (Continuation) obj2);
        channelsKt__DeprecatedKt$flatMap$1.f67243h = (ProducerScope) obj;
        return channelsKt__DeprecatedKt$flatMap$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008f -> B:8:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f67242g
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L43
            if (r1 == r4) goto L33
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r9.f67241f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f67243h
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r10)
            goto L51
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f67241f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f67243h
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L80
        L33:
            java.lang.Object r1 = r9.f67241f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f67243h
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L65
        L43:
            kotlin.ResultKt.m31892b(r10)
            java.lang.Object r10 = r9.f67243h
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            kotlinx.coroutines.channels.ReceiveChannel r1 = r9.f67244i
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r10
        L51:
            r10 = r9
        L52:
            r10.f67243h = r5
            r10.f67241f = r1
            r10.f67242g = r4
            java.lang.Object r6 = r1.mo34140a(r10)
            if (r6 != r0) goto L5f
            return r0
        L5f:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r5.next()
            kotlin.jvm.functions.Function2 r7 = r0.f67245j
            r0.f67243h = r6
            r0.f67241f = r5
            r0.f67242g = r3
            java.lang.Object r10 = r7.invoke(r10, r0)
            if (r10 != r1) goto L80
            return r1
        L80:
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            r0.f67243h = r6
            r0.f67241f = r5
            r0.f67242g = r2
            java.lang.Object r10 = kotlinx.coroutines.channels.ChannelsKt.m34180b(r10, r6, r0)
            if (r10 != r1) goto L8f
            return r1
        L8f:
            r10 = r0
            r0 = r1
            r1 = r5
            r5 = r6
            goto L52
        L94:
            kotlin.Unit r10 = kotlin.Unit.f63088a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

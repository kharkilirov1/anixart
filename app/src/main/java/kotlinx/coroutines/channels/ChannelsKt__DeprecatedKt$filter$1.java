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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m31884d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", m32126f = "Deprecated.kt", m32127l = {198, 199, 199}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67206f;

    /* renamed from: g */
    public Object f67207g;

    /* renamed from: h */
    public int f67208h;

    /* renamed from: i */
    public /* synthetic */ Object f67209i;

    /* renamed from: j */
    public final /* synthetic */ ReceiveChannel<Object> f67210j;

    /* renamed from: k */
    public final /* synthetic */ Function2<Object, Continuation<? super Boolean>, Object> f67211k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$filter$1> continuation) {
        super(2, continuation);
        this.f67210j = receiveChannel;
        this.f67211k = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.f67210j, this.f67211k, continuation);
        channelsKt__DeprecatedKt$filter$1.f67209i = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.f67210j, this.f67211k, continuation);
        channelsKt__DeprecatedKt$filter$1.f67209i = producerScope;
        return channelsKt__DeprecatedKt$filter$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r11 = r0;
        r0 = r1;
        r1 = r6;
        r6 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.f67208h
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L46
            if (r1 == r5) goto L36
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            java.lang.Object r1 = r10.f67206f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.f67209i
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.m31892b(r11)
            goto L54
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            java.lang.Object r1 = r10.f67207g
            java.lang.Object r6 = r10.f67206f
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.f67209i
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.m31892b(r11)
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r10
            goto L8b
        L36:
            java.lang.Object r1 = r10.f67206f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.f67209i
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.m31892b(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L6a
        L46:
            kotlin.ResultKt.m31892b(r11)
            java.lang.Object r11 = r10.f67209i
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r10.f67210j
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r11
        L54:
            r11 = r10
        L55:
            r11.f67209i = r6
            r11.f67206f = r1
            r11.f67207g = r2
            r11.f67208h = r5
            java.lang.Object r7 = r1.mo34140a(r11)
            if (r7 != r0) goto L64
            return r0
        L64:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La7
            java.lang.Object r11 = r6.next()
            kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r0.f67211k
            r0.f67209i = r7
            r0.f67206f = r6
            r0.f67207g = r11
            r0.f67208h = r4
            java.lang.Object r8 = r8.invoke(r11, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            r9 = r7
            r7 = r11
            r11 = r8
            r8 = r9
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La2
            r0.f67209i = r8
            r0.f67206f = r6
            r0.f67207g = r2
            r0.f67208h = r3
            java.lang.Object r11 = r8.mo34151E(r7, r0)
            if (r11 != r1) goto La2
            return r1
        La2:
            r11 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            goto L55
        La7:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

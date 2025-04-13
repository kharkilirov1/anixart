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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m31884d2 = {"E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m32126f = "Deprecated.kt", m32127l = {370, 371}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements Function2 {

    /* renamed from: f */
    public Object f67336f;

    /* renamed from: g */
    public int f67337g;

    /* renamed from: h */
    public int f67338h;

    /* renamed from: i */
    public /* synthetic */ Object f67339i;

    /* renamed from: j */
    public final /* synthetic */ ReceiveChannel f67340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f67340j = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.f67340j, continuation);
        channelsKt__DeprecatedKt$withIndex$1.f67339i = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.f67340j, (Continuation) obj2);
        channelsKt__DeprecatedKt$withIndex$1.f67339i = (ProducerScope) obj;
        return channelsKt__DeprecatedKt$withIndex$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:7:0x0041). Please report as a decompilation issue!!! */
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
            int r1 = r10.f67338h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            int r1 = r10.f67337g
            java.lang.Object r4 = r10.f67336f
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.f67339i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r11)
            r11 = r5
            goto L40
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            int r1 = r10.f67337g
            java.lang.Object r4 = r10.f67336f
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.f67339i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r11)
            r6 = r10
            goto L54
        L32:
            kotlin.ResultKt.m31892b(r11)
            java.lang.Object r11 = r10.f67339i
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel r4 = r10.f67340j
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L40:
            r5 = r10
        L41:
            r5.f67339i = r11
            r5.f67336f = r4
            r5.f67337g = r1
            r5.f67338h = r3
            java.lang.Object r6 = r4.mo34140a(r5)
            if (r6 != r0) goto L50
            return r0
        L50:
            r9 = r5
            r5 = r11
            r11 = r6
            r6 = r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7a
            java.lang.Object r11 = r4.next()
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
            int r8 = r1 + 1
            r7.<init>(r1, r11)
            r6.f67339i = r5
            r6.f67336f = r4
            r6.f67337g = r8
            r6.f67338h = r2
            java.lang.Object r11 = r5.mo34151E(r7, r6)
            if (r11 != r0) goto L76
            return r0
        L76:
            r11 = r5
            r5 = r6
            r1 = r8
            goto L41
        L7a:
            kotlin.Unit r11 = kotlin.Unit.f63088a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", m32126f = "Deprecated.kt", m32127l = {269, 270, 271}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements Function2 {

    /* renamed from: f */
    public Object f67315f;

    /* renamed from: g */
    public Object f67316g;

    /* renamed from: h */
    public int f67317h;

    /* renamed from: i */
    public /* synthetic */ Object f67318i;

    /* renamed from: j */
    public final /* synthetic */ ReceiveChannel f67319j;

    /* renamed from: k */
    public final /* synthetic */ Function2 f67320k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f67319j = receiveChannel;
        this.f67320k = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.f67319j, this.f67320k, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.f67318i = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.f67319j, this.f67320k, (Continuation) obj2);
        channelsKt__DeprecatedKt$takeWhile$1.f67318i = (ProducerScope) obj;
        return channelsKt__DeprecatedKt$takeWhile$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:8:0x0055). Please report as a decompilation issue!!! */
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
            int r1 = r9.f67317h
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L46
            if (r1 == r4) goto L36
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r9.f67315f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f67318i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r10)
            goto L54
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f67316g
            java.lang.Object r5 = r9.f67315f
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r9.f67318i
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.m31892b(r10)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L8a
        L36:
            java.lang.Object r1 = r9.f67315f
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f67318i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L68
        L46:
            kotlin.ResultKt.m31892b(r10)
            java.lang.Object r10 = r9.f67318i
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            kotlinx.coroutines.channels.ReceiveChannel r1 = r9.f67319j
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r10
        L54:
            r10 = r9
        L55:
            r10.f67318i = r5
            r10.f67315f = r1
            r10.f67317h = r4
            java.lang.Object r6 = r1.mo34140a(r10)
            if (r6 != r0) goto L62
            return r0
        L62:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r5.next()
            kotlin.jvm.functions.Function2 r7 = r0.f67320k
            r0.f67318i = r6
            r0.f67315f = r5
            r0.f67316g = r10
            r0.f67317h = r3
            java.lang.Object r7 = r7.invoke(r10, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            r8 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L8a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L95
            kotlin.Unit r10 = kotlin.Unit.f63088a
            return r10
        L95:
            r0.f67318i = r7
            r0.f67315f = r6
            r10 = 0
            r0.f67316g = r10
            r0.f67317h = r2
            java.lang.Object r10 = r7.mo34151E(r5, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            r10 = r0
            r0 = r1
            r1 = r6
            r5 = r7
            goto L55
        Laa:
            kotlin.Unit r10 = kotlin.Unit.f63088a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

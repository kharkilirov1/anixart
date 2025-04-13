package kotlinx.coroutines.channels;

import kotlin.KotlinVersion;
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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m32126f = "Deprecated.kt", m32127l = {254, KotlinVersion.MAX_COMPONENT_VALUE}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2 {

    /* renamed from: f */
    public Object f67309f;

    /* renamed from: g */
    public int f67310g;

    /* renamed from: h */
    public int f67311h;

    /* renamed from: i */
    public /* synthetic */ Object f67312i;

    /* renamed from: j */
    public final /* synthetic */ int f67313j;

    /* renamed from: k */
    public final /* synthetic */ ReceiveChannel f67314k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i2, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f67313j = i2;
        this.f67314k = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f67313j, this.f67314k, continuation);
        channelsKt__DeprecatedKt$take$1.f67312i = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f67313j, this.f67314k, (Continuation) obj2);
        channelsKt__DeprecatedKt$take$1.f67312i = (ProducerScope) obj;
        return channelsKt__DeprecatedKt$take$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:6:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.f67311h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r8.f67310g
            java.lang.Object r4 = r8.f67309f
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.f67312i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r9)
            r9 = r5
            r5 = r8
            goto L7e
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            int r1 = r8.f67310g
            java.lang.Object r4 = r8.f67309f
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.f67312i
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.m31892b(r9)
            r6 = r5
            r5 = r8
            goto L62
        L34:
            kotlin.ResultKt.m31892b(r9)
            java.lang.Object r9 = r8.f67312i
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            int r1 = r8.f67313j
            if (r1 != 0) goto L42
            kotlin.Unit r9 = kotlin.Unit.f63088a
            return r9
        L42:
            if (r1 < 0) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            if (r4 == 0) goto L88
            kotlinx.coroutines.channels.ReceiveChannel r4 = r8.f67314k
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r5 = r8
        L50:
            r5.f67312i = r9
            r5.f67309f = r4
            r5.f67310g = r1
            r5.f67311h = r3
            java.lang.Object r6 = r4.mo34140a(r5)
            if (r6 != r0) goto L5f
            return r0
        L5f:
            r7 = r6
            r6 = r9
            r9 = r7
        L62:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            java.lang.Object r9 = r4.next()
            r5.f67312i = r6
            r5.f67309f = r4
            r5.f67310g = r1
            r5.f67311h = r2
            java.lang.Object r9 = r6.mo34151E(r9, r5)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            r9 = r6
        L7e:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L50
            kotlin.Unit r9 = kotlin.Unit.f63088a
            return r9
        L85:
            kotlin.Unit r9 = kotlin.Unit.f63088a
            return r9
        L88:
            java.lang.String r9 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r9 = p000a.C0000a.m8e(r9, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, m31884d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m32126f = "Deprecated.kt", m32127l = {487, 469, 471}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67341f;

    /* renamed from: g */
    public Object f67342g;

    /* renamed from: h */
    public Object f67343h;

    /* renamed from: i */
    public Object f67344i;

    /* renamed from: j */
    public Object f67345j;

    /* renamed from: k */
    public int f67346k;

    /* renamed from: l */
    public /* synthetic */ Object f67347l;

    /* renamed from: m */
    public final /* synthetic */ ReceiveChannel<Object> f67348m;

    /* renamed from: n */
    public final /* synthetic */ ReceiveChannel<Object> f67349n;

    /* renamed from: o */
    public final /* synthetic */ Function2<Object, Object, Object> f67350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel<Object> receiveChannel, ReceiveChannel<Object> receiveChannel2, Function2<Object, Object, Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.f67348m = receiveChannel;
        this.f67349n = receiveChannel2;
        this.f67350o = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.f67348m, this.f67349n, this.f67350o, continuation);
        channelsKt__DeprecatedKt$zip$2.f67347l = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.f67348m, this.f67349n, this.f67350o, continuation);
        channelsKt__DeprecatedKt$zip$2.f67347l = producerScope;
        return channelsKt__DeprecatedKt$zip$2.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        r14 = r0;
        r0 = r1;
        r1 = r6;
        r6 = r8;
        r7 = r9;
        r8 = r10;
        r9 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:15:0x00af, B:17:0x00b7, B:38:0x0107, B:49:0x0048), top: B:48:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:22:0x00d7, B:25:0x00e7), top: B:21:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:15:0x00af, B:17:0x00b7, B:38:0x0107, B:49:0x0048), top: B:48:0x0048 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.mo2379m(java.lang.Object):java.lang.Object");
    }
}

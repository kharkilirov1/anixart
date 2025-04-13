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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m32126f = "Deprecated.kt", m32127l = {487, 333, 333}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f67269f;

    /* renamed from: g */
    public Object f67270g;

    /* renamed from: h */
    public Object f67271h;

    /* renamed from: i */
    public Object f67272i;

    /* renamed from: j */
    public int f67273j;

    /* renamed from: k */
    public /* synthetic */ Object f67274k;

    /* renamed from: l */
    public final /* synthetic */ ReceiveChannel<Object> f67275l;

    /* renamed from: m */
    public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f67276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<Object> receiveChannel, Function2<Object, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$map$1> continuation) {
        super(2, continuation);
        this.f67275l = receiveChannel;
        this.f67276m = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.f67275l, this.f67276m, continuation);
        channelsKt__DeprecatedKt$map$1.f67274k = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.f67275l, this.f67276m, continuation);
        channelsKt__DeprecatedKt$map$1.f67274k = producerScope;
        return channelsKt__DeprecatedKt$map$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:8:0x0020, B:10:0x0074, B:15:0x0089, B:17:0x0091, B:34:0x00c7, B:45:0x005c, B:48:0x006c), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: all -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:8:0x0020, B:10:0x0074, B:15:0x0089, B:17:0x0091, B:34:0x00c7, B:45:0x005c, B:48:0x006c), top: B:2:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c1 -> B:10:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

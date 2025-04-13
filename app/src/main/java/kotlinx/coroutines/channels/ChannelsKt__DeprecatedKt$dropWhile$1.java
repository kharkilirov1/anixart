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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m32126f = "Deprecated.kt", m32127l = {181, 182, 183, 187, 188}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements Function2 {

    /* renamed from: f */
    public Object f67188f;

    /* renamed from: g */
    public Object f67189g;

    /* renamed from: h */
    public int f67190h;

    /* renamed from: i */
    public /* synthetic */ Object f67191i;

    /* renamed from: j */
    public final /* synthetic */ ReceiveChannel f67192j;

    /* renamed from: k */
    public final /* synthetic */ Function2 f67193k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f67192j = receiveChannel;
        this.f67193k = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.f67192j, this.f67193k, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.f67191i = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.f67192j, this.f67193k, (Continuation) obj2);
        channelsKt__DeprecatedKt$dropWhile$1.f67191i = (ProducerScope) obj;
        return channelsKt__DeprecatedKt$dropWhile$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0100 -> B:9:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:29:0x00b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}

package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ChannelResult;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m32126f = "Channels.kt", m32127l = {39}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResult<? extends Unit>>, Object> {

    /* renamed from: f */
    public int f67146f;

    /* renamed from: g */
    public /* synthetic */ Object f67147g;

    /* renamed from: h */
    public final /* synthetic */ SendChannel<Object> f67148h;

    /* renamed from: i */
    public final /* synthetic */ Object f67149i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(SendChannel<Object> sendChannel, Object obj, Continuation<? super ChannelsKt__ChannelsKt$trySendBlocking$2> continuation) {
        super(2, continuation);
        this.f67148h = sendChannel;
        this.f67149i = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f67148h, this.f67149i, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.f67147g = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super ChannelResult<? extends Unit>> continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f67148h, this.f67149i, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.f67147g = coroutineScope;
        return channelsKt__ChannelsKt$trySendBlocking$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        Object m31891a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67146f;
        try {
            if (i2 == 0) {
                ResultKt.m31892b(obj);
                SendChannel<Object> sendChannel = this.f67148h;
                Object obj2 = this.f67149i;
                this.f67146f = 1;
                if (sendChannel.mo34151E(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m31892b(obj);
            }
            m31891a = Unit.f63088a;
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        return new ChannelResult((m31891a instanceof Result.Failure) ^ true ? Unit.f63088a : new ChannelResult.Closed(Result.m31890a(m31891a)));
    }
}

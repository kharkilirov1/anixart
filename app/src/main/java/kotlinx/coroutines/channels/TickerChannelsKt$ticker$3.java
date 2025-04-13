package kotlinx.coroutines.channels;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TickerChannels.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m32126f = "TickerChannels.kt", m32127l = {C4632R.styleable.AppCompatTheme_imageButtonStyle, C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TickerChannelsKt$ticker$3 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67386f;

    /* renamed from: g */
    public /* synthetic */ Object f67387g;

    /* renamed from: h */
    public final /* synthetic */ TickerMode f67388h;

    /* renamed from: i */
    public final /* synthetic */ long f67389i;

    /* renamed from: j */
    public final /* synthetic */ long f67390j;

    /* compiled from: TickerChannels.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TickerMode.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j2, long j3, Continuation<? super TickerChannelsKt$ticker$3> continuation) {
        super(2, continuation);
        this.f67388h = tickerMode;
        this.f67389i = j2;
        this.f67390j = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.f67388h, this.f67389i, this.f67390j, continuation);
        tickerChannelsKt$ticker$3.f67387g = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ProducerScope<? super Unit> producerScope, Continuation<? super Unit> continuation) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.f67388h, this.f67389i, this.f67390j, continuation);
        tickerChannelsKt$ticker$3.f67387g = producerScope;
        return tickerChannelsKt$ticker$3.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67386f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            ProducerScope producerScope = (ProducerScope) this.f67387g;
            int ordinal = this.f67388h.ordinal();
            if (ordinal == 0) {
                long j2 = this.f67389i;
                long j3 = this.f67390j;
                SendChannel mo34175v = producerScope.mo34175v();
                this.f67386f = 1;
                if (TickerChannelsKt.m34194b(j2, j3, mo34175v, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (ordinal == 1) {
                long j4 = this.f67389i;
                long j5 = this.f67390j;
                SendChannel mo34175v2 = producerScope.mo34175v();
                this.f67386f = 2;
                if (TickerChannelsKt.m34193a(j4, j5, mo34175v2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}

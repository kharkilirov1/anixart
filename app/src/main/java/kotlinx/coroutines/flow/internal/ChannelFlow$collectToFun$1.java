package kotlinx.coroutines.flow.internal;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m32126f = "ChannelFlow.kt", m32127l = {C4632R.styleable.AppCompatTheme_controlBackground}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChannelFlow$collectToFun$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68100f;

    /* renamed from: g */
    public /* synthetic */ Object f68101g;

    /* renamed from: h */
    public final /* synthetic */ ChannelFlow<T> f68102h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, Continuation<? super ChannelFlow$collectToFun$1> continuation) {
        super(2, continuation);
        this.f68102h = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f68102h, continuation);
        channelFlow$collectToFun$1.f68101g = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Continuation<? super Unit> continuation) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f68102h, continuation);
        channelFlow$collectToFun$1.f68101g = (ProducerScope) obj;
        return channelFlow$collectToFun$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68100f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            ProducerScope<? super T> producerScope = (ProducerScope) this.f68101g;
            ChannelFlow<T> channelFlow = this.f68102h;
            this.f68100f = 1;
            if (channelFlow.mo34204g(producerScope, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}

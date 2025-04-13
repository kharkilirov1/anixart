package kotlinx.coroutines.channels;

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

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"R", "E", "Lkotlinx/coroutines/channels/ChannelResult;", "it", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", m32126f = "Channel.kt", m32127l = {375}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1<R> extends SuspendLambda implements Function2<ChannelResult<Object>, Continuation<? super R>, Object> {

    /* renamed from: f */
    public int f67369f;

    /* renamed from: g */
    public /* synthetic */ Object f67370g;

    /* renamed from: h */
    public final /* synthetic */ Function2<Object, Continuation<? super R>, Object> f67371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> continuation) {
        super(2, continuation);
        this.f67371h = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.f67371h, continuation);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.f67370g = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(ChannelResult<Object> channelResult, Object obj) {
        ChannelResult channelResult2 = new ChannelResult(channelResult.f67141a);
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.f67371h, (Continuation) obj);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.f67370g = channelResult2;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67369f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            Object obj2 = ((ChannelResult) this.f67370g).f67141a;
            Throwable m34177a = ChannelResult.m34177a(obj2);
            if (m34177a != null) {
                throw m34177a;
            }
            Function2<Object, Continuation<? super R>, Object> function2 = this.f67371h;
            Object m34178b = ChannelResult.m34178b(obj2);
            this.f67369f = 1;
            obj = function2.invoke(m34178b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return obj;
    }
}

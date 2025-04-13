package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.internal.NopCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collect.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m32126f = "Collect.kt", m32127l = {50}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67524f;

    /* renamed from: g */
    public final /* synthetic */ Flow<Object> f67525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(Flow<Object> flow, Continuation<? super FlowKt__CollectKt$launchIn$1> continuation) {
        super(2, continuation);
        this.f67525g = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__CollectKt$launchIn$1(this.f67525g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new FlowKt__CollectKt$launchIn$1(this.f67525g, continuation).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67524f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            Flow<Object> flow = this.f67525g;
            this.f67524f = 1;
            Object mo4140a = flow.mo4140a(NopCollector.f68208b, this);
            if (mo4140a != obj2) {
                mo4140a = Unit.f63088a;
            }
            if (mo4140a == obj2) {
                return obj2;
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

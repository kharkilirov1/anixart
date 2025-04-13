package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m31884d2 = {"T", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m32126f = "Delay.kt", m32127l = {233}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67550f;

    /* renamed from: g */
    public final /* synthetic */ FlowCollector<Object> f67551g;

    /* renamed from: h */
    public final /* synthetic */ Ref.ObjectRef<Object> f67552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector<Object> flowCollector, Ref.ObjectRef<Object> objectRef, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$1> continuation) {
        super(1, continuation);
        this.f67551g = flowCollector;
        this.f67552h = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Continuation<? super Unit> continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f67551g, this.f67552h, continuation).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: l */
    public final Continuation<Unit> mo32123l(@NotNull Continuation<?> continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f67551g, this.f67552h, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67550f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector<Object> flowCollector = this.f67551g;
            Symbol symbol = NullSurrogateKt.f68209a;
            Object obj2 = this.f67552h.f63351b;
            if (obj2 == symbol) {
                obj2 = null;
            }
            this.f67550f = 1;
            if (flowCollector.mo4139f(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        this.f67552h.f63351b = null;
        return Unit.f63088a;
    }
}

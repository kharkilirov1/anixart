package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m31884d2 = {"T", "", "it", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m32126f = "Delay.kt", m32127l = {300}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67579f;

    /* renamed from: g */
    public final /* synthetic */ Ref.ObjectRef<Object> f67580g;

    /* renamed from: h */
    public final /* synthetic */ FlowCollector<Object> f67581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref.ObjectRef<Object> objectRef, FlowCollector<Object> flowCollector, Continuation<? super FlowKt__DelayKt$sample$2$1$2> continuation) {
        super(2, continuation);
        this.f67580g = objectRef;
        this.f67581h = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(this.f67580g, this.f67581h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(this.f67580g, this.f67581h, continuation).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67579f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            Ref.ObjectRef<Object> objectRef = this.f67580g;
            Object obj2 = objectRef.f63351b;
            if (obj2 == null) {
                return Unit.f63088a;
            }
            objectRef.f63351b = null;
            FlowCollector<Object> flowCollector = this.f67581h;
            if (obj2 == NullSurrogateKt.f68209a) {
                obj2 = null;
            }
            this.f67579f = 1;
            if (flowCollector.mo4139f(obj2, this) == coroutineSingletons) {
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

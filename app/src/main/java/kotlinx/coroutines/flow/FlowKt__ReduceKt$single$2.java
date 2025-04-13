package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$single$2<T> implements FlowCollector, SuspendFunction {

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f67819b;

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public final Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        Ref.ObjectRef<Object> objectRef = this.f67819b;
        if (!(objectRef.f63351b == NullSurrogateKt.f68209a)) {
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
        objectRef.f63351b = t;
        return Unit.f63088a;
    }
}

package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Distinct.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class DistinctFlowImpl<T> implements Flow<T> {

    /* renamed from: b */
    @NotNull
    public final Flow<T> f67451b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Function1<T, Object> f67452c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Function2<Object, Object, Boolean> f67453d;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull Flow<? extends T> flow, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.f67451b = flow;
        this.f67452c = function1;
        this.f67453d = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = (T) NullSurrogateKt.f68209a;
        Object mo4140a = this.f67451b.mo4140a(new DistinctFlowImpl$collect$2(this, objectRef, flowCollector), continuation);
        return mo4140a == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4140a : Unit.f63088a;
    }
}

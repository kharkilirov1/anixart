package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/SafeFlow;", "T", "Lkotlinx/coroutines/flow/AbstractFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SafeFlow<T> extends AbstractFlow<T> {

    /* renamed from: b */
    @NotNull
    public final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f68021b;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeFlow(@NotNull Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f68021b = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @Nullable
    /* renamed from: f */
    public Object mo34203f(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object invoke = this.f68021b.invoke(flowCollector, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.f63088a;
    }
}

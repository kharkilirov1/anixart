package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {

    /* renamed from: b */
    @NotNull
    public final CoroutineContext f68226b;

    /* renamed from: c */
    @NotNull
    public final Object f68227c;

    /* renamed from: d */
    @NotNull
    public final Function2<T, Continuation<? super Unit>, Object> f68228d;

    public UndispatchedContextCollector(@NotNull FlowCollector<? super T> flowCollector, @NotNull CoroutineContext coroutineContext) {
        this.f68226b = coroutineContext;
        this.f68227c = ThreadContextKt.m34337b(coroutineContext);
        this.f68228d = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        Object m34254a = ChannelFlowKt.m34254a(this.f68226b, t, this.f68227c, this.f68228d, continuation);
        return m34254a == CoroutineSingletons.COROUTINE_SUSPENDED ? m34254a : Unit.f63088a;
    }
}

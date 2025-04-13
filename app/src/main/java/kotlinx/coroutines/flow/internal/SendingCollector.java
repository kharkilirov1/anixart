package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendingCollector.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/SendingCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SendingCollector<T> implements FlowCollector<T> {

    /* renamed from: b */
    @NotNull
    public final SendChannel<T> f68223b;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingCollector(@NotNull SendChannel<? super T> sendChannel) {
        this.f68223b = sendChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        Object mo34151E = this.f68223b.mo34151E(t, continuation);
        return mo34151E == CoroutineSingletons.COROUTINE_SUSPENDED ? mo34151E : Unit.f63088a;
    }
}

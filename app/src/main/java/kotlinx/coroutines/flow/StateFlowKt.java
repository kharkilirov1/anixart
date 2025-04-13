package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* compiled from: StateFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class StateFlowKt {

    /* renamed from: a */
    @NotNull
    public static final Symbol f68073a = new Symbol("NONE");

    /* renamed from: b */
    @NotNull
    public static final Symbol f68074b = new Symbol("PENDING");

    @NotNull
    /* renamed from: a */
    public static final <T> Flow<T> m34248a(@NotNull StateFlow<? extends T> stateFlow, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return (((i2 >= 0 && i2 < 2) || i2 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? stateFlow : SharedFlowKt.m34243a(stateFlow, coroutineContext, i2, bufferOverflow);
    }
}

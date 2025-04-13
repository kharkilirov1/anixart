package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "F", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AbstractSharedFlowSlot<F> {
    /* renamed from: a */
    public abstract boolean mo34244a(F f2);

    @NotNull
    /* renamed from: b */
    public abstract Continuation<Unit>[] mo34245b(F f2);
}

package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {

    /* renamed from: a */
    @JvmField
    public long f68042a = -1;

    /* renamed from: b */
    @JvmField
    @Nullable
    public Continuation<? super Unit> f68043b;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: a */
    public boolean mo34244a(SharedFlowImpl<?> sharedFlowImpl) {
        SharedFlowImpl<?> sharedFlowImpl2 = sharedFlowImpl;
        if (this.f68042a >= 0) {
            return false;
        }
        long j2 = sharedFlowImpl2.f68026j;
        if (j2 < sharedFlowImpl2.f68027k) {
            sharedFlowImpl2.f68027k = j2;
        }
        this.f68042a = j2;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: b */
    public Continuation[] mo34245b(SharedFlowImpl<?> sharedFlowImpl) {
        long j2 = this.f68042a;
        this.f68042a = -1L;
        this.f68043b = null;
        return sharedFlowImpl.m34227A(j2);
    }
}

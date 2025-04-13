package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChildContinuation extends JobCancellingNode {

    /* renamed from: f */
    @JvmField
    @NotNull
    public final CancellableContinuationImpl<?> f66948f;

    public ChildContinuation(@NotNull CancellableContinuationImpl<?> cancellableContinuationImpl) {
        this.f66948f = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        CancellableContinuationImpl<?> cancellableContinuationImpl = this.f66948f;
        Throwable mo33991u = cancellableContinuationImpl.mo33991u(m34074S());
        if (!cancellableContinuationImpl.m33970A() ? false : ((DispatchedContinuation) cancellableContinuationImpl.f66943e).m34277m(mo33991u)) {
            return;
        }
        cancellableContinuationImpl.m33987n(mo33991u);
        cancellableContinuationImpl.m33989p();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }
}

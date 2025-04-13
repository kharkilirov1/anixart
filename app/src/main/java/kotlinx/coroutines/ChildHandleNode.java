package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/ChildHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {

    /* renamed from: f */
    @JvmField
    @NotNull
    public final ChildJob f66949f;

    public ChildHandleNode(@NotNull ChildJob childJob) {
        this.f66949f = childJob;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        this.f66949f.mo33999u(m34074S());
    }

    @Override // kotlinx.coroutines.ChildHandle
    @NotNull
    public Job getParent() {
        return m34074S();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: l */
    public boolean mo33998l(@NotNull Throwable th) {
        return m34074S().mo34080O(th);
    }
}

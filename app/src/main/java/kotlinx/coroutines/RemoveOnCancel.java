package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CancellableContinuation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/RemoveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class RemoveOnCancel extends BeforeResumeCancelHandler {

    /* renamed from: b */
    @NotNull
    public final LockFreeLinkedListNode f67045b;

    public RemoveOnCancel(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f67045b = lockFreeLinkedListNode;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo33959a(@Nullable Throwable th) {
        this.f67045b.mo34192O();
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        this.f67045b.mo34192O();
        return Unit.f63088a;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("RemoveOnCancel[");
        m24u.append(this.f67045b);
        m24u.append(']');
        return m24u.toString();
    }
}

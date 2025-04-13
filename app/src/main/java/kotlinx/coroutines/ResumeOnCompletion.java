package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ResumeOnCompletion extends JobNode {

    /* renamed from: f */
    @NotNull
    public final Continuation<Unit> f67046f;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(@NotNull Continuation<? super Unit> continuation) {
        this.f67046f = continuation;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        this.f67046f.mo31877j(Unit.f63088a);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }
}

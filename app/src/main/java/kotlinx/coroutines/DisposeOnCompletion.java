package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/DisposeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DisposeOnCompletion extends JobNode {

    /* renamed from: f */
    @NotNull
    public final DisposableHandle f66992f;

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        this.f66992f.mo34038f();
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        this.f66992f.mo34038f();
        return Unit.f63088a;
    }
}

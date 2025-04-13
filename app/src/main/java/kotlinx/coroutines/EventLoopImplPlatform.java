package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class EventLoopImplPlatform extends EventLoop {
    @NotNull
    /* renamed from: o0 */
    public abstract Thread getF66939h();

    /* renamed from: s0 */
    public void mo34029s0(long j2, @NotNull EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.f66979h.m34051O0(j2, delayedTask);
    }
}

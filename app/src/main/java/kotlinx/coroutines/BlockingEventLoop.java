package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class BlockingEventLoop extends EventLoopImplBase {

    /* renamed from: h */
    @NotNull
    public final Thread f66939h;

    public BlockingEventLoop(@NotNull Thread thread) {
        this.f66939h = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    @NotNull
    /* renamed from: o0, reason: from getter */
    public Thread getF66939h() {
        return this.f66939h;
    }
}

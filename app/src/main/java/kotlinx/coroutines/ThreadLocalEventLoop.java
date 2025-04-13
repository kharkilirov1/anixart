package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/ThreadLocalEventLoop;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ThreadLocalEventLoop {

    /* renamed from: a */
    @NotNull
    public static final ThreadLocalEventLoop f67053a = new ThreadLocalEventLoop();

    /* renamed from: b */
    @NotNull
    public static final ThreadLocal<EventLoop> f67054b = new ThreadLocal<>();

    @NotNull
    /* renamed from: a */
    public final EventLoop m34117a() {
        ThreadLocal<EventLoop> threadLocal = f67054b;
        EventLoop eventLoop = threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        BlockingEventLoop blockingEventLoop = new BlockingEventLoop(Thread.currentThread());
        threadLocal.set(blockingEventLoop);
        return blockingEventLoop;
    }
}

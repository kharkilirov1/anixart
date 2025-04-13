package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.EventLoopImplBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    @NotNull
    public static final DefaultExecutor f66979h;

    /* renamed from: i */
    public static final long f66980i;

    static {
        Long l2;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f66979h = defaultExecutor;
        defaultExecutor.m34042b0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f66980i = timeUnit.toNanos(l2.longValue());
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    /* renamed from: D0 */
    public void mo34025D0(@NotNull Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo34025D0(runnable);
    }

    /* renamed from: R0 */
    public final synchronized void m34026R0() {
        if (m34027Z0()) {
            debugStatus = 3;
            m34050N0();
            notifyAll();
        }
    }

    /* renamed from: Z0 */
    public final boolean m34027Z0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long m34056a = EventLoop_commonKt.m34056a(j2);
        if (m34056a >= 4611686018427387903L) {
            return NonDisposableHandle.f67044b;
        }
        long nanoTime = System.nanoTime();
        EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new EventLoopImplBase.DelayedRunnableTask(m34056a + nanoTime, runnable);
        m34051O0(nanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    @NotNull
    /* renamed from: o0 */
    public Thread getF66939h() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        ThreadLocalEventLoop threadLocalEventLoop = ThreadLocalEventLoop.f67053a;
        ThreadLocalEventLoop.f67054b.set(this);
        try {
            synchronized (this) {
                if (m34027Z0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                _thread = null;
                m34026R0();
                if (m34048K0()) {
                    return;
                }
                getF66939h();
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m34049L0 = m34049L0();
                if (m34049L0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f66980i + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        m34026R0();
                        if (m34048K0()) {
                            return;
                        }
                        getF66939h();
                        return;
                    }
                    m34049L0 = RangesKt.m32237d(m34049L0, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (m34049L0 > 0) {
                    if (m34027Z0()) {
                        _thread = null;
                        m34026R0();
                        if (m34048K0()) {
                            return;
                        }
                        getF66939h();
                        return;
                    }
                    LockSupport.parkNanos(this, m34049L0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m34026R0();
            if (!m34048K0()) {
                getF66939h();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: s0 */
    public void mo34029s0(long j2, @NotNull EventLoopImplBase.DelayedTask delayedTask) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}

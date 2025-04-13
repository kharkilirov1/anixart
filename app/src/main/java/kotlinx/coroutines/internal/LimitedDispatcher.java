package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* compiled from: LimitedDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "", "runningWorkers", "I", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Runnable, Delay {

    /* renamed from: c */
    @NotNull
    public final CoroutineDispatcher f68261c;

    /* renamed from: d */
    public final int f68262d;

    /* renamed from: e */
    public final /* synthetic */ Delay f68263e;

    /* renamed from: f */
    @NotNull
    public final LockFreeTaskQueue<Runnable> f68264f;

    /* renamed from: g */
    @NotNull
    public final Object f68265g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher, int i2) {
        this.f68261c = coroutineDispatcher;
        this.f68262d = i2;
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f68263e = delay == null ? DefaultExecutorKt.f66982b : delay;
        this.f68264f = new LockFreeTaskQueue<>(false);
        this.f68265g = new Object();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: g */
    public void mo34030g(long j2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f68263e.mo34030g(j2, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.Delay
    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f68263e.mo34028l(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.f68264f.m34305a(runnable);
        if (!(this.runningWorkers >= this.f68262d) && m34284v()) {
            this.f68261c.mo3221m(this, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.f68264f.m34305a(runnable);
        if (!(this.runningWorkers >= this.f68262d) && m34284v()) {
            this.f68261c.mo34014p(this, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.f68265g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.f68264f.m34307c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.runningWorkers++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r4.f68264f
            java.lang.Object r2 = r2.m34308d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f63224b
            kotlinx.coroutines.CoroutineExceptionHandlerKt.m34016a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f68261c
            boolean r2 = r2.mo3222q(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f68261c
            r0.mo3221m(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f68265g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r4.f68264f     // Catch: java.lang.Throwable -> L45
            int r2 = r2.m34307c()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LimitedDispatcher.run():void");
    }

    /* renamed from: v */
    public final boolean m34284v() {
        synchronized (this.f68265g) {
            if (this.runningWorkers >= this.f68262d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }
}

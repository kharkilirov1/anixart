package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.ArrayQueue;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: EventLoop.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66997f = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66998g = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");

    @NotNull
    private volatile /* synthetic */ Object _queue = null;

    @NotNull
    private volatile /* synthetic */ Object _delayed = null;

    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class DelayedResumeTask extends DelayedTask {

        /* renamed from: e */
        @NotNull
        public final CancellableContinuation<Unit> f66999e;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j2);
            this.f66999e = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66999e.mo33969x(EventLoopImplBase.this, Unit.f63088a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        @NotNull
        public String toString() {
            return Intrinsics.m32187p(super.toString(), this.f66999e);
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DelayedRunnableTask extends DelayedTask {

        /* renamed from: e */
        @NotNull
        public final Runnable f67001e;

        public DelayedRunnableTask(long j2, @NotNull Runnable runnable) {
            super(j2);
            this.f67001e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67001e.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        @NotNull
        public String toString() {
            return Intrinsics.m32187p(super.toString(), this.f67001e);
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {

        /* renamed from: b */
        @JvmField
        public long f67002b;

        /* renamed from: c */
        @Nullable
        public Object f67003c;

        /* renamed from: d */
        public int f67004d = -1;

        public DelayedTask(long j2) {
            this.f67002b = j2;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: a */
        public void mo34052a(@Nullable ThreadSafeHeap<?> threadSafeHeap) {
            if (!(this.f67003c != EventLoop_commonKt.f67006a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f67003c = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        @Nullable
        /* renamed from: b */
        public ThreadSafeHeap<?> mo34053b() {
            Object obj = this.f67003c;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        public int compareTo(DelayedTask delayedTask) {
            long j2 = this.f67002b - delayedTask.f67002b;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: e */
        public void mo34054e(int i2) {
            this.f67004d = i2;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: f */
        public final synchronized void mo34038f() {
            Object obj = this.f67003c;
            Symbol symbol = EventLoop_commonKt.f67006a;
            if (obj == symbol) {
                return;
            }
            DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
            if (delayedTaskQueue != null) {
                delayedTaskQueue.m34342d(this);
            }
            this.f67003c = symbol;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: h, reason: from getter */
        public int getF68465f() {
            return this.f67004d;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Delayed[nanos=");
            m24u.append(this.f67002b);
            m24u.append(']');
            return m24u.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* renamed from: b */
        @JvmField
        public long f67005b;

        public DelayedTaskQueue(long j2) {
            this.f67005b = j2;
        }
    }

    /* renamed from: D0 */
    public void mo34025D0(@NotNull Runnable runnable) {
        if (!m34047F0(runnable)) {
            DefaultExecutor.f66979h.mo34025D0(runnable);
            return;
        }
        Thread f66939h = getF66939h();
        if (Thread.currentThread() != f66939h) {
            LockSupport.unpark(f66939h);
        }
    }

    /* renamed from: F0 */
    public final boolean m34047F0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66997f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int m34309a = lockFreeTaskQueueCore.m34309a(runnable);
                if (m34309a == 0) {
                    return true;
                }
                if (m34309a == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66997f;
                    LockFreeTaskQueueCore m34313e = lockFreeTaskQueueCore.m34313e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, m34313e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (m34309a == 2) {
                    return false;
                }
            } else {
                if (obj == EventLoop_commonKt.f67007b) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore2.m34309a((Runnable) obj);
                lockFreeTaskQueueCore2.m34309a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f66997f;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, lockFreeTaskQueueCore2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    /* renamed from: K0 */
    public boolean m34048K0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f66996e;
        if (!(arrayQueue == null || arrayQueue.f68233b == arrayQueue.f68234c)) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) this._delayed;
        if (delayedTaskQueue != null && !delayedTaskQueue.m34341c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        return obj instanceof LockFreeTaskQueueCore ? ((LockFreeTaskQueueCore) obj).m34312d() : obj == EventLoop_commonKt.f67007b;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m34049L0() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.m34049L0():long");
    }

    /* renamed from: N0 */
    public final void m34050N0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34051O0(long r13, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTask r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L9
            goto L41
        L9:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.EventLoopImplBase.f66998g
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r6 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r6.<init>(r13)
        L16:
            boolean r0 = r5.compareAndSet(r12, r4, r6)
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L16
        L23:
            java.lang.Object r0 = r12._delayed
            kotlin.jvm.internal.Intrinsics.m32176e(r0)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
        L2a:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f67003c     // Catch: java.lang.Throwable -> Lae
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.EventLoop_commonKt.f67006a     // Catch: java.lang.Throwable -> Lae
            if (r5 != r6) goto L34
            monitor-exit(r15)
            r0 = 2
            goto L6e
        L34:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lae
            kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = r0.m34340b()     // Catch: java.lang.Throwable -> Lab
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r5 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r5     // Catch: java.lang.Throwable -> Lab
            int r6 = r12._isCompleted     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r15)
        L41:
            r0 = 1
            goto L6e
        L43:
            r6 = 0
            if (r5 != 0) goto L4a
            r0.f67005b = r13     // Catch: java.lang.Throwable -> Lab
            goto L5d
        L4a:
            long r8 = r5.f67002b     // Catch: java.lang.Throwable -> Lab
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L53
            r8 = r13
        L53:
            long r10 = r0.f67005b     // Catch: java.lang.Throwable -> Lab
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L5d
            r0.f67005b = r8     // Catch: java.lang.Throwable -> Lab
        L5d:
            long r8 = r15.f67002b     // Catch: java.lang.Throwable -> Lab
            long r10 = r0.f67005b     // Catch: java.lang.Throwable -> Lab
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L68
            r15.f67002b = r10     // Catch: java.lang.Throwable -> Lab
        L68:
            r0.m34339a(r15)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r15)
            r0 = 0
        L6e:
            if (r0 == 0) goto L85
            if (r0 == r3) goto L81
            if (r0 != r1) goto L75
            goto La7
        L75:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L81:
            r12.mo34029s0(r13, r15)
            goto La7
        L85:
            java.lang.Object r13 = r12._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r13 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r13
            if (r13 != 0) goto L8c
            goto L95
        L8c:
            monitor-enter(r13)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r14 = r13.m34340b()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r13)
            r4 = r14
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r4 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r4
        L95:
            if (r4 != r15) goto L98
            r2 = 1
        L98:
            if (r2 == 0) goto La7
            java.lang.Thread r13 = r12.getF66939h()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto La7
            java.util.concurrent.locks.LockSupport.unpark(r13)
        La7:
            return
        La8:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        Lab:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r13     // Catch: java.lang.Throwable -> Lae
        Lae:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.m34051O0(long, kotlinx.coroutines.EventLoopImplBase$DelayedTask):void");
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: g */
    public void mo34030g(long j2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        long m34056a = EventLoop_commonKt.m34056a(j2);
        if (m34056a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(m34056a + nanoTime, cancellableContinuation);
            CancellableContinuationKt.m33995a(cancellableContinuation, delayedResumeTask);
            m34051O0(nanoTime, delayedResumeTask);
        }
    }

    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.m34031a(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public final void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        mo34025D0(runnable);
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop threadLocalEventLoop = ThreadLocalEventLoop.f67053a;
        ThreadLocalEventLoop.f67054b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66997f;
                Symbol symbol = EventLoop_commonKt.f67007b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof LockFreeTaskQueueCore) {
                    ((LockFreeTaskQueueCore) obj).m34310b();
                    break;
                }
                if (obj == EventLoop_commonKt.f67007b) {
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.m34309a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66997f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        while (m34049L0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) this._delayed;
            DelayedTask m34344f = delayedTaskQueue == null ? null : delayedTaskQueue.m34344f();
            if (m34344f == null) {
                return;
            } else {
                mo34029s0(nanoTime, m34344f);
            }
        }
    }
}

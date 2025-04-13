package kotlinx.coroutines.scheduling;

import androidx.room.util.C0576a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CoroutineScheduler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    @NotNull
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: b */
    @JvmField
    public final int f68325b;

    /* renamed from: c */
    @JvmField
    public final int f68326c;

    @NotNull
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    @JvmField
    public final long f68327d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final String f68328e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final GlobalQueue f68329f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final GlobalQueue f68330g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final ResizableAtomicArray<Worker> f68331h;

    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: l */
    @JvmField
    @NotNull
    public static final Symbol f68324l = new Symbol("NOT_IN_STACK");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f68321i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f68322j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68323k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/Symbol;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "", "index", "indexInArray", "I", "b", "()I", "f", "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class Worker extends Thread {

        /* renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f68332i = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");

        /* renamed from: b */
        @JvmField
        @NotNull
        public final WorkQueue f68333b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public WorkerState f68334c;

        /* renamed from: d */
        public long f68335d;

        /* renamed from: e */
        public long f68336e;

        /* renamed from: f */
        public int f68337f;

        /* renamed from: g */
        @JvmField
        public boolean f68338g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;

        @NotNull
        public volatile /* synthetic */ int workerCtl;

        public Worker(int i2) {
            CoroutineScheduler.this = CoroutineScheduler.this;
            setDaemon(true);
            this.f68333b = new WorkQueue();
            this.f68334c = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f68324l;
            this.f68337f = Random.f63365b.mo32226b();
            m34372f(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlinx.coroutines.scheduling.Task m34367a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r10.f68334c
                r2 = 1
                r3 = 0
                if (r1 != r0) goto L9
                goto L30
            L9:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            Lb:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r5 = (int) r4
                if (r5 != 0) goto L1b
                r1 = 0
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.f68322j
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto Lb
                r1 = 1
            L2c:
                if (r1 == 0) goto L32
                r10.f68334c = r0
            L30:
                r0 = 1
                goto L33
            L32:
                r0 = 0
            L33:
                if (r0 == 0) goto L69
                if (r11 == 0) goto L5e
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.f68325b
                int r11 = r11 * 2
                int r11 = r10.m34370d(r11)
                if (r11 != 0) goto L44
                goto L45
            L44:
                r2 = 0
            L45:
                if (r2 == 0) goto L4d
                kotlinx.coroutines.scheduling.Task r11 = r10.m34371e()
                if (r11 != 0) goto L68
            L4d:
                kotlinx.coroutines.scheduling.WorkQueue r11 = r10.f68333b
                kotlinx.coroutines.scheduling.Task r11 = r11.m34383e()
                if (r11 != 0) goto L68
                if (r2 != 0) goto L64
                kotlinx.coroutines.scheduling.Task r11 = r10.m34371e()
                if (r11 != 0) goto L68
                goto L64
            L5e:
                kotlinx.coroutines.scheduling.Task r11 = r10.m34371e()
                if (r11 != 0) goto L68
            L64:
                kotlinx.coroutines.scheduling.Task r11 = r10.m34375i(r3)
            L68:
                return r11
            L69:
                if (r11 == 0) goto L7e
                kotlinx.coroutines.scheduling.WorkQueue r11 = r10.f68333b
                kotlinx.coroutines.scheduling.Task r11 = r11.m34383e()
                if (r11 != 0) goto L88
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                kotlinx.coroutines.scheduling.GlobalQueue r11 = r11.f68330g
                java.lang.Object r11 = r11.m34308d()
                kotlinx.coroutines.scheduling.Task r11 = (kotlinx.coroutines.scheduling.Task) r11
                goto L88
            L7e:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                kotlinx.coroutines.scheduling.GlobalQueue r11 = r11.f68330g
                java.lang.Object r11 = r11.m34308d()
                kotlinx.coroutines.scheduling.Task r11 = (kotlinx.coroutines.scheduling.Task) r11
            L88:
                if (r11 != 0) goto L8e
                kotlinx.coroutines.scheduling.Task r11 = r10.m34375i(r2)
            L8e:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.m34367a(boolean):kotlinx.coroutines.scheduling.Task");
        }

        /* renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        /* renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int m34370d(int i2) {
            int i3 = this.f68337f;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f68337f = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        /* renamed from: e */
        public final Task m34371e() {
            if (m34370d(2) == 0) {
                Task m34308d = CoroutineScheduler.this.f68329f.m34308d();
                return m34308d == null ? CoroutineScheduler.this.f68330g.m34308d() : m34308d;
            }
            Task m34308d2 = CoroutineScheduler.this.f68330g.m34308d();
            return m34308d2 == null ? CoroutineScheduler.this.f68329f.m34308d() : m34308d2;
        }

        /* renamed from: f */
        public final void m34372f(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f68328e);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        /* renamed from: g */
        public final void m34373g(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean m34374h(@NotNull WorkerState workerState) {
            WorkerState workerState2 = this.f68334c;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.f68322j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f68334c = workerState;
            }
            return z;
        }

        /* renamed from: i */
        public final Task m34375i(boolean z) {
            long m34386h;
            int i2 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int m34370d = m34370d(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i3 = 0;
            long j2 = Long.MAX_VALUE;
            while (i3 < i2) {
                i3++;
                m34370d++;
                if (m34370d > i2) {
                    m34370d = 1;
                }
                Worker m34323b = coroutineScheduler.f68331h.m34323b(m34370d);
                if (m34323b != null && m34323b != this) {
                    if (z) {
                        m34386h = this.f68333b.m34385g(m34323b.f68333b);
                    } else {
                        WorkQueue workQueue = this.f68333b;
                        WorkQueue workQueue2 = m34323b.f68333b;
                        Objects.requireNonNull(workQueue);
                        Task m34384f = workQueue2.m34384f();
                        if (m34384f != null) {
                            workQueue.m34379a(m34384f, false);
                            m34386h = -1;
                        } else {
                            m34386h = workQueue.m34386h(workQueue2, false);
                        }
                    }
                    if (m34386h == -1) {
                        return this.f68333b.m34383e();
                    }
                    if (m34386h > 0) {
                        j2 = Math.min(j2, m34386h);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f68336e = j2;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WorkerState workerState = WorkerState.PARKING;
            WorkerState workerState2 = WorkerState.TERMINATED;
            loop0: while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f68334c != workerState2) {
                    Task m34367a = m34367a(this.f68338g);
                    if (m34367a != null) {
                        this.f68336e = 0L;
                        WorkerState workerState3 = WorkerState.BLOCKING;
                        int f68358b = m34367a.f68357c.getF68358b();
                        this.f68335d = 0L;
                        if (this.f68334c == workerState) {
                            this.f68334c = workerState3;
                        }
                        if (f68358b != 0 && m34374h(workerState3)) {
                            CoroutineScheduler.this.m34364l();
                        }
                        CoroutineScheduler.this.m34363k(m34367a);
                        if (f68358b != 0) {
                            CoroutineScheduler.f68322j.addAndGet(CoroutineScheduler.this, -2097152L);
                            if (this.f68334c != workerState2) {
                                this.f68334c = WorkerState.DORMANT;
                            }
                        }
                    } else {
                        this.f68338g = false;
                        if (this.f68336e == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.f68324l) {
                                this.workerCtl = -1;
                                while (true) {
                                    if ((this.nextParkedWorker != CoroutineScheduler.f68324l) && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f68334c != workerState2) {
                                        m34374h(workerState);
                                        Thread.interrupted();
                                        if (this.f68335d == 0) {
                                            this.f68335d = System.nanoTime() + CoroutineScheduler.this.f68327d;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.f68327d);
                                        if (System.nanoTime() - this.f68335d >= 0) {
                                            this.f68335d = 0L;
                                            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler.f68331h) {
                                                if (!coroutineScheduler.isTerminated()) {
                                                    if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f68325b) {
                                                        if (f68332i.compareAndSet(this, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            m34372f(0);
                                                            coroutineScheduler.m34362j(this, i2, 0);
                                                            int andDecrement = (int) (CoroutineScheduler.f68322j.getAndDecrement(coroutineScheduler) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Worker m34323b = coroutineScheduler.f68331h.m34323b(andDecrement);
                                                                Intrinsics.m32176e(m34323b);
                                                                Worker worker = m34323b;
                                                                coroutineScheduler.f68331h.m34324c(i2, worker);
                                                                worker.m34372f(i2);
                                                                coroutineScheduler.m34362j(worker, andDecrement, i2);
                                                            }
                                                            coroutineScheduler.f68331h.m34324c(andDecrement, null);
                                                            this.f68334c = workerState2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.m34361i(this);
                            }
                        } else if (z) {
                            m34374h(workerState);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f68336e);
                            this.f68336e = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            m34374h(workerState2);
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i2, int i3, long j2, @NotNull String str) {
        this.f68325b = i2;
        this.f68326c = i3;
        this.f68327d = j2;
        this.f68328e = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(C0000a.m8e("Core pool size ", i2, " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(C0000a.m9f("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(C0000a.m8e("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f68329f = new GlobalQueue();
        this.f68330g = new GlobalQueue();
        this.parkedWorkersStack = 0L;
        this.f68331h = new ResizableAtomicArray<>(i2 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: g */
    public static /* synthetic */ void m34355g(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext taskContext, boolean z, int i2) {
        TaskContext taskContext2 = (i2 & 2) != 0 ? TasksKt.f68365f : null;
        if ((i2 & 4) != 0) {
            z = false;
        }
        coroutineScheduler.m34359e(runnable, taskContext2, z);
    }

    /* renamed from: a */
    public final int m34356a() {
        synchronized (this.f68331h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.f68325b) {
                return 0;
            }
            if (i2 >= this.f68326c) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i4 > 0 && this.f68331h.m34323b(i4) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Worker worker = new Worker(i4);
            this.f68331h.m34324c(i4, worker);
            if (!(i4 == ((int) (2097151 & f68322j.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            worker.start();
            return i3 + 1;
        }
    }

    @NotNull
    /* renamed from: b */
    public final Task m34357b(@NotNull Runnable runnable, @NotNull TaskContext taskContext) {
        Objects.requireNonNull((NanoTimeSource) TasksKt.f68364e);
        long nanoTime = System.nanoTime();
        if (!(runnable instanceof Task)) {
            return new TaskImpl(runnable, nanoTime, taskContext);
        }
        Task task = (Task) runnable;
        task.f68356b = nanoTime;
        task.f68357c = taskContext;
        return task;
    }

    /* renamed from: c */
    public final Worker m34358c() {
        Thread currentThread = Thread.currentThread();
        Worker worker = currentThread instanceof Worker ? (Worker) currentThread : null;
        if (worker != null && Intrinsics.m32174c(CoroutineScheduler.this, this)) {
            return worker;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i2;
        boolean z;
        if (f68323k.compareAndSet(this, 0, 1)) {
            Worker m34358c = m34358c();
            synchronized (this.f68331h) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    Worker m34323b = this.f68331h.m34323b(i3);
                    Intrinsics.m32176e(m34323b);
                    Worker worker = m34323b;
                    if (worker != m34358c) {
                        while (worker.isAlive()) {
                            LockSupport.unpark(worker);
                            worker.join(10000L);
                        }
                        WorkQueue workQueue = worker.f68333b;
                        GlobalQueue globalQueue = this.f68330g;
                        Objects.requireNonNull(workQueue);
                        Task task = (Task) WorkQueue.f68368b.getAndSet(workQueue, null);
                        if (task != null) {
                            globalQueue.m34305a(task);
                        }
                        do {
                            Task m34384f = workQueue.m34384f();
                            if (m34384f == null) {
                                z = false;
                            } else {
                                globalQueue.m34305a(m34384f);
                                z = true;
                            }
                        } while (z);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.f68330g.m34306b();
            this.f68329f.m34306b();
            while (true) {
                Task m34367a = m34358c == null ? null : m34358c.m34367a(true);
                if (m34367a == null && (m34367a = this.f68329f.m34308d()) == null && (m34367a = this.f68330g.m34308d()) == null) {
                    break;
                } else {
                    m34363k(m34367a);
                }
            }
            if (m34358c != null) {
                m34358c.m34374h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* renamed from: e */
    public final void m34359e(@NotNull Runnable runnable, @NotNull TaskContext taskContext, boolean z) {
        Task m34379a;
        Task m34357b = m34357b(runnable, taskContext);
        Worker m34358c = m34358c();
        if (m34358c == null || m34358c.f68334c == WorkerState.TERMINATED || (m34357b.f68357c.getF68358b() == 0 && m34358c.f68334c == WorkerState.BLOCKING)) {
            m34379a = m34357b;
        } else {
            m34358c.f68338g = true;
            m34379a = m34358c.f68333b.m34379a(m34357b, z);
        }
        if (m34379a != null) {
            if (!(m34379a.f68357c.getF68358b() == 1 ? this.f68330g.m34305a(m34379a) : this.f68329f.m34305a(m34379a))) {
                throw new RejectedExecutionException(Intrinsics.m32187p(this.f68328e, " was terminated"));
            }
        }
        boolean z2 = z && m34358c != null;
        if (m34357b.f68357c.getF68358b() == 0) {
            if (z2) {
                return;
            }
            m34364l();
        } else {
            long addAndGet = f68322j.addAndGet(this, 2097152L);
            if (z2 || m34366n() || m34365m(addAndGet)) {
                return;
            }
            m34366n();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m34355g(this, runnable, null, false, 6);
    }

    /* renamed from: h */
    public final int m34360h(Worker worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f68324l) {
            if (nextParkedWorker == null) {
                return 0;
            }
            Worker worker2 = (Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    /* renamed from: i */
    public final boolean m34361i(@NotNull Worker worker) {
        long j2;
        int indexInArray;
        if (worker.getNextParkedWorker() != f68324l) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            indexInArray = worker.getIndexInArray();
            worker.m34373g(this.f68331h.m34323b((int) (2097151 & j2)));
        } while (!f68321i.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | indexInArray));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j */
    public final void m34362j(@NotNull Worker worker, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? m34360h(worker) : i3;
            }
            if (i4 >= 0 && f68321i.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m34363k(@NotNull Task task) {
        try {
            task.run();
        } finally {
        }
    }

    /* renamed from: l */
    public final void m34364l() {
        if (m34366n() || m34365m(this.controlState)) {
            return;
        }
        m34366n();
    }

    /* renamed from: m */
    public final boolean m34365m(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f68325b) {
            int m34356a = m34356a();
            if (m34356a == 1 && this.f68325b > 1) {
                m34356a();
            }
            if (m34356a > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m34366n() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            Worker m34323b = this.f68331h.m34323b((int) (2097151 & j2));
            if (m34323b == null) {
                m34323b = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                int m34360h = m34360h(m34323b);
                if (m34360h >= 0 && f68321i.compareAndSet(this, j2, m34360h | j3)) {
                    m34323b.m34373g(f68324l);
                }
            }
            if (m34323b == null) {
                return false;
            }
            if (Worker.f68332i.compareAndSet(m34323b, -1, 0)) {
                LockSupport.unpark(m34323b);
                return true;
            }
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m34322a = this.f68331h.m34322a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < m34322a) {
            int i8 = i7 + 1;
            Worker m34323b = this.f68331h.m34323b(i7);
            if (m34323b != null) {
                int m34382d = m34323b.f68333b.m34382d();
                int ordinal = m34323b.f68334c.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m34382d);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m34382d);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (m34382d > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m34382d);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
            }
            i7 = i8;
        }
        long j2 = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f68328e);
        sb4.append('@');
        sb4.append(DebugStringsKt.m34023b(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f68325b);
        sb4.append(", max = ");
        C0576a.m4127z(sb4, this.f68326c, "}, Worker States {CPU = ", i2, ", blocking = ");
        C0576a.m4127z(sb4, i3, ", parked = ", i4, ", dormant = ");
        C0576a.m4127z(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f68329f.m34307c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f68330g.m34307c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f68325b - ((int) ((9223367638808264704L & j2) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

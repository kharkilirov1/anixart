package kotlinx.coroutines.scheduling;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WorkQueue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class WorkQueue {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68368b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68369c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68370d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68371e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* renamed from: a */
    @NotNull
    public final AtomicReferenceArray<Task> f68372a = new AtomicReferenceArray<>(128);

    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    @Nullable
    /* renamed from: a */
    public final Task m34379a(@NotNull Task task, boolean z) {
        if (z) {
            return m34380b(task);
        }
        Task task2 = (Task) f68368b.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return m34380b(task2);
    }

    /* renamed from: b */
    public final Task m34380b(Task task) {
        if (task.f68357c.getF68358b() == 1) {
            f68371e.incrementAndGet(this);
        }
        if (m34381c() == 127) {
            return task;
        }
        int i2 = this.producerIndex & 127;
        while (this.f68372a.get(i2) != null) {
            Thread.yield();
        }
        this.f68372a.lazySet(i2, task);
        f68369c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int m34381c() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final int m34382d() {
        return this.lastScheduledTask != null ? m34381c() + 1 : m34381c();
    }

    @Nullable
    /* renamed from: e */
    public final Task m34383e() {
        Task task = (Task) f68368b.getAndSet(this, null);
        return task == null ? m34384f() : task;
    }

    /* renamed from: f */
    public final Task m34384f() {
        Task andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f68370d.compareAndSet(this, i2, i2 + 1) && (andSet = this.f68372a.getAndSet(i3, null)) != null) {
                if (andSet.f68357c.getF68358b() == 1) {
                    f68371e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: g */
    public final long m34385g(@NotNull WorkQueue workQueue) {
        int i2 = workQueue.consumerIndex;
        int i3 = workQueue.producerIndex;
        AtomicReferenceArray<Task> atomicReferenceArray = workQueue.f68372a;
        while (true) {
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & 127;
            if (workQueue.blockingTasksInBuffer == 0) {
                break;
            }
            Task task = atomicReferenceArray.get(i4);
            if (task != null) {
                if ((task.f68357c.getF68358b() == 1) && atomicReferenceArray.compareAndSet(i4, task, null)) {
                    f68371e.decrementAndGet(workQueue);
                    m34379a(task, false);
                    return -1L;
                }
            }
            i2++;
        }
        return m34386h(workQueue, true);
    }

    /* renamed from: h */
    public final long m34386h(WorkQueue workQueue, boolean z) {
        Task task;
        boolean z2;
        do {
            task = (Task) workQueue.lastScheduledTask;
            if (task != null) {
                z2 = true;
                if (z) {
                    if (!(task.f68357c.getF68358b() == 1)) {
                        return -2L;
                    }
                }
                Objects.requireNonNull((NanoTimeSource) TasksKt.f68364e);
                long nanoTime = System.nanoTime() - task.f68356b;
                long j2 = TasksKt.f68360a;
                if (nanoTime >= j2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68368b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task, null)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(workQueue) != task) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    return j2 - nanoTime;
                }
            } else {
                return -2L;
            }
        } while (!z2);
        m34379a(task, false);
        return -1L;
    }
}

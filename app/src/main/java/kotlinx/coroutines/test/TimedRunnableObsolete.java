package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TestCoroutineContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/test/TimedRunnableObsolete;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class TimedRunnableObsolete implements Comparable<TimedRunnableObsolete>, Runnable, ThreadSafeHeapNode {

    /* renamed from: b */
    @NotNull
    public final Runnable f68461b;

    /* renamed from: c */
    public final long f68462c;

    /* renamed from: d */
    @JvmField
    public final long f68463d;

    /* renamed from: e */
    @Nullable
    public ThreadSafeHeap<?> f68464e;

    /* renamed from: f */
    public int f68465f;

    public TimedRunnableObsolete(@NotNull Runnable runnable, long j2, long j3) {
        this.f68461b = runnable;
        this.f68462c = j2;
        this.f68463d = j3;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    /* renamed from: a */
    public void mo34052a(@Nullable ThreadSafeHeap<?> threadSafeHeap) {
        this.f68464e = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    @Nullable
    /* renamed from: b */
    public ThreadSafeHeap<?> mo34053b() {
        return this.f68464e;
    }

    @Override // java.lang.Comparable
    public int compareTo(TimedRunnableObsolete timedRunnableObsolete) {
        TimedRunnableObsolete timedRunnableObsolete2 = timedRunnableObsolete;
        long j2 = this.f68463d;
        long j3 = timedRunnableObsolete2.f68463d;
        return j2 == j3 ? Intrinsics.m32182k(this.f68462c, timedRunnableObsolete2.f68462c) : Intrinsics.m32182k(j2, j3);
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    /* renamed from: e */
    public void mo34054e(int i2) {
        this.f68465f = i2;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    /* renamed from: h, reason: from getter */
    public int getF68465f() {
        return this.f68465f;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f68461b.run();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TimedRunnable(time=");
        m24u.append(this.f68463d);
        m24u.append(", run=");
        m24u.append(this.f68461b);
        m24u.append(')');
        return m24u.toString();
    }

    public TimedRunnableObsolete(Runnable runnable, long j2, long j3, int i2) {
        j2 = (i2 & 2) != 0 ? 0L : j2;
        j3 = (i2 & 4) != 0 ? 0L : j3;
        this.f68461b = runnable;
        this.f68462c = j2;
        this.f68463d = j3;
    }
}

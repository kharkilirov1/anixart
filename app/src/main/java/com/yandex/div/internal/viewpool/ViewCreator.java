package com.yandex.div.internal.viewpool;

import android.os.Process;
import com.google.firebase.auth.C2052a;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewCreator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator;", "", "Companion", "CreateViewTask", "ViewCreatorThread", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewCreator {

    /* renamed from: a */
    @NotNull
    public final ViewCreatorThread f33925a;

    /* compiled from: ViewCreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$Companion;", "", "", "CPU_USAGE_HISTOGRAM_NAME", "Ljava/lang/String;", "", "TASK_HIGHEST_PRIORITY", "I", "TASK_QUEUE_INITIAL_CAPACITY", "THREAD_DEFAULT_PRIORITY", "THREAD_LOW_PRIORITY", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: ViewCreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$CreateViewTask;", "Ljava/lang/Runnable;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {

        /* renamed from: e */
        public static final /* synthetic */ KProperty<Object>[] f33926e = {C2052a.m12277l(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0)};

        /* renamed from: b */
        public final int f33927b;

        /* renamed from: c */
        @NotNull
        public final String f33928c;

        /* renamed from: d */
        @NotNull
        public final ReadWriteProperty f33929d;

        public CreateViewTask(@NotNull AdvanceViewPool.Channel<?> channel, int i2) {
            this.f33927b = i2;
            this.f33928c = channel.f33909a;
            this.f33929d = UtilsKt.m17398a(channel);
        }

        @Override // java.lang.Comparable
        public int compareTo(CreateViewTask createViewTask) {
            CreateViewTask other = createViewTask;
            Intrinsics.m32179h(other, "other");
            int i2 = this.f33927b - other.f33927b;
            return i2 != 0 ? i2 : !Intrinsics.m32174c(this.f33928c, other.f33928c) ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.m32174c(CreateViewTask.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            CreateViewTask createViewTask = (CreateViewTask) obj;
            return Intrinsics.m32174c(this.f33928c, createViewTask.f33928c) && this.f33927b == createViewTask.f33927b;
        }

        public int hashCode() {
            return this.f33928c.hashCode() + ((6913 + this.f33927b) * 31);
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel channel = (AdvanceViewPool.Channel) this.f33929d.getValue(this, f33926e[0]);
            if (channel == null || channel.f33914f.get()) {
                return;
            }
            try {
                channel.f33913e.offer(channel.f33911c.mo16909a());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ViewCreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/ViewCreator$ViewCreatorThread;", "Ljava/lang/Thread;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ViewCreatorThread extends Thread {

        /* renamed from: b */
        @NotNull
        public final CpuUsageHistogramReporter f33930b;

        /* renamed from: c */
        @NotNull
        public final BatchBlockingQueue<CreateViewTask> f33931c;

        /* renamed from: d */
        @Nullable
        public volatile String f33932d;

        public ViewCreatorThread(@NotNull String str, @NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(str);
            this.f33930b = cpuUsageHistogramReporter;
            this.f33931c = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        /* renamed from: a */
        public final void m17407a() throws InterruptedException {
            CreateViewTask poll = this.f33931c.poll();
            if (poll == null) {
                try {
                    setPriority(3);
                    poll = this.f33931c.take();
                    setPriority(5);
                    Intrinsics.m32178g(poll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.f33932d = poll.f33928c;
            poll.run();
            this.f33932d = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable mo17275a = this.f33930b.mo17275a("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        m17407a();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        mo17275a.cancel();
                        return;
                    }
                } catch (Throwable th) {
                    mo17275a.cancel();
                    throw th;
                }
            }
        }
    }

    public ViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.f33925a = viewCreatorThread;
        viewCreatorThread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r2.remove();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17406a(@org.jetbrains.annotations.NotNull com.yandex.div.internal.viewpool.AdvanceViewPool.Channel<?> r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f33909a
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.f33925a
            java.lang.String r1 = r1.f33932d
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r0, r1)
            if (r0 != 0) goto L79
            boolean r0 = r6.f33915g
            if (r0 == 0) goto L11
            goto L79
        L11:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r0 = r5.f33925a
            com.yandex.div.internal.viewpool.BatchBlockingQueue<com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask> r0 = r0.f33931c
            java.util.concurrent.locks.ReentrantLock r1 = r0.f33917c
            r1.lock()
            java.lang.String r1 = r6.f33909a     // Catch: java.lang.Throwable -> L72
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r2 = r5.f33925a     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = r2.f33932d     // Catch: java.lang.Throwable -> L72
            boolean r1 = kotlin.jvm.internal.Intrinsics.m32174c(r1, r2)     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L65
            boolean r1 = r6.f33915g     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L2b
            goto L65
        L2b:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.f33925a     // Catch: java.lang.Throwable -> L72
            com.yandex.div.internal.viewpool.BatchBlockingQueue<com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask> r1 = r1.f33931c     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.locks.ReentrantLock r2 = r1.f33917c     // Catch: java.lang.Throwable -> L72
            r2.lock()     // Catch: java.lang.Throwable -> L72
            java.util.Queue<E> r2 = r1.f33916b     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6b
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6b
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r3 = (com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask) r3     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = r3.f33928c     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = r6.f33909a     // Catch: java.lang.Throwable -> L6b
            boolean r3 = kotlin.jvm.internal.Intrinsics.m32174c(r3, r4)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L3a
            r2.remove()     // Catch: java.lang.Throwable -> L6b
        L53:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f33917c     // Catch: java.lang.Throwable -> L72
            r1.unlock()     // Catch: java.lang.Throwable -> L72
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.f33925a     // Catch: java.lang.Throwable -> L72
            com.yandex.div.internal.viewpool.BatchBlockingQueue<com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask> r1 = r1.f33931c     // Catch: java.lang.Throwable -> L72
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r2 = new com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask     // Catch: java.lang.Throwable -> L72
            r3 = -1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L72
            r1.offer(r2)     // Catch: java.lang.Throwable -> L72
        L65:
            java.util.concurrent.locks.ReentrantLock r6 = r0.f33917c
            r6.unlock()
            return
        L6b:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r1.f33917c     // Catch: java.lang.Throwable -> L72
            r1.unlock()     // Catch: java.lang.Throwable -> L72
            throw r6     // Catch: java.lang.Throwable -> L72
        L72:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r0.f33917c
            r0.unlock()
            throw r6
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.ViewCreator.m17406a(com.yandex.div.internal.viewpool.AdvanceViewPool$Channel):void");
    }
}

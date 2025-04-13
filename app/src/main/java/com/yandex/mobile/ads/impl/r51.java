package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r51 {

    /* renamed from: h */
    @JvmField
    @NotNull
    public static final r51 f54199h = new r51(new C5673c(t91.m28507a(t91.f54985g + " TaskRunner", true)));

    /* renamed from: i */
    @NotNull
    private static final Logger f54200i;

    /* renamed from: a */
    @NotNull
    private final InterfaceC5671a f54201a;

    /* renamed from: b */
    private int f54202b;

    /* renamed from: c */
    private boolean f54203c;

    /* renamed from: d */
    private long f54204d;

    /* renamed from: e */
    @NotNull
    private final ArrayList f54205e;

    /* renamed from: f */
    @NotNull
    private final ArrayList f54206f;

    /* renamed from: g */
    @NotNull
    private final s51 f54207g;

    /* renamed from: com.yandex.mobile.ads.impl.r51$a */
    public interface InterfaceC5671a {
        /* renamed from: a */
        long mo27851a();

        /* renamed from: a */
        void mo27852a(@NotNull r51 r51Var);

        /* renamed from: a */
        void mo27853a(@NotNull r51 r51Var, long j2);

        void execute(@NotNull Runnable runnable);
    }

    /* renamed from: com.yandex.mobile.ads.impl.r51$b */
    public static final class C5672b {
        @NotNull
        /* renamed from: a */
        public static Logger m27854a() {
            return r51.f54200i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.r51$c */
    public static final class C5673c implements InterfaceC5671a {

        /* renamed from: a */
        @NotNull
        private final ThreadPoolExecutor f54208a;

        public C5673c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.m32179h(threadFactory, "threadFactory");
            this.f54208a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.r51.InterfaceC5671a
        /* renamed from: a */
        public final long mo27851a() {
            return System.nanoTime();
        }

        @Override // com.yandex.mobile.ads.impl.r51.InterfaceC5671a
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.m32179h(runnable, "runnable");
            this.f54208a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.r51.InterfaceC5671a
        /* renamed from: a */
        public final void mo27853a(@NotNull r51 taskRunner, long j2) throws InterruptedException {
            Intrinsics.m32179h(taskRunner, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                taskRunner.wait(j3, (int) j4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.r51.InterfaceC5671a
        /* renamed from: a */
        public final void mo27852a(@NotNull r51 taskRunner) {
            Intrinsics.m32179h(taskRunner, "taskRunner");
            taskRunner.notify();
        }
    }

    static {
        Logger logger = Logger.getLogger(r51.class.getName());
        Intrinsics.m32178g(logger, "getLogger(TaskRunner::class.java.name)");
        f54200i = logger;
    }

    public r51(@NotNull C5673c backend) {
        Intrinsics.m32179h(backend, "backend");
        this.f54201a = backend;
        this.f54202b = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f54205e = new ArrayList();
        this.f54206f = new ArrayList();
        this.f54207g = new s51(this);
    }

    @Nullable
    /* renamed from: b */
    public final n51 m27847b() {
        long j2;
        boolean z;
        if (t91.f54984f && !Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        while (!this.f54206f.isEmpty()) {
            long mo27851a = this.f54201a.mo27851a();
            long j3 = Long.MAX_VALUE;
            Iterator it = this.f54206f.iterator();
            n51 n51Var = null;
            while (true) {
                if (!it.hasNext()) {
                    j2 = mo27851a;
                    z = false;
                    break;
                }
                n51 n51Var2 = (n51) ((q51) it.next()).m27639e().get(0);
                j2 = mo27851a;
                long max = Math.max(0L, n51Var2.m26802c() - mo27851a);
                if (max > 0) {
                    j3 = Math.min(max, j3);
                } else {
                    if (n51Var != null) {
                        z = true;
                        break;
                    }
                    n51Var = n51Var2;
                }
                mo27851a = j2;
            }
            if (n51Var != null) {
                if (t91.f54984f && !Thread.holdsLock(this)) {
                    StringBuilder m26356a2 = l60.m26356a("Thread ");
                    m26356a2.append(Thread.currentThread().getName());
                    m26356a2.append(" MUST hold lock on ");
                    m26356a2.append(this);
                    throw new AssertionError(m26356a2.toString());
                }
                n51Var.m26798a(-1L);
                q51 m26803d = n51Var.m26803d();
                Intrinsics.m32176e(m26803d);
                m26803d.m27639e().remove(n51Var);
                this.f54206f.remove(m26803d);
                m26803d.m27633a(n51Var);
                this.f54205e.add(m26803d);
                if (z || (!this.f54203c && (!this.f54206f.isEmpty()))) {
                    this.f54201a.execute(this.f54207g);
                }
                return n51Var;
            }
            if (this.f54203c) {
                if (j3 >= this.f54204d - j2) {
                    return null;
                }
                this.f54201a.mo27852a(this);
                return null;
            }
            this.f54203c = true;
            this.f54204d = j2 + j3;
            try {
                try {
                    this.f54201a.mo27853a(this, j3);
                } catch (InterruptedException unused) {
                    m27848c();
                }
            } finally {
                this.f54203c = false;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m27848c() {
        int size = this.f54205e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((q51) this.f54205e.get(size)).m27636b();
            }
        }
        for (int size2 = this.f54206f.size() - 1; -1 < size2; size2--) {
            q51 q51Var = (q51) this.f54206f.get(size2);
            q51Var.m27636b();
            if (q51Var.m27639e().isEmpty()) {
                this.f54206f.remove(size2);
            }
        }
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC5671a m27849d() {
        return this.f54201a;
    }

    @NotNull
    /* renamed from: e */
    public final q51 m27850e() {
        int i2;
        synchronized (this) {
            i2 = this.f54202b;
            this.f54202b = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new q51(this, sb.toString());
    }

    /* renamed from: a */
    public static final void m27845a(r51 r51Var, n51 n51Var) {
        Objects.requireNonNull(r51Var);
        if (t91.f54984f && Thread.holdsLock(r51Var)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(r51Var);
            throw new AssertionError(m26356a.toString());
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(n51Var.m26801b());
        try {
            long mo26804e = n51Var.mo26804e();
            synchronized (r51Var) {
                r51Var.m27844a(n51Var, mo26804e);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (r51Var) {
                r51Var.m27844a(n51Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m27846a(@NotNull q51 taskQueue) {
        Intrinsics.m32179h(taskQueue, "taskQueue");
        if (t91.f54984f && !Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        if (taskQueue.m27637c() == null) {
            if (!taskQueue.m27639e().isEmpty()) {
                t91.m28511a(this.f54206f, taskQueue);
            } else {
                this.f54206f.remove(taskQueue);
            }
        }
        if (this.f54203c) {
            this.f54201a.mo27852a(this);
        } else {
            this.f54201a.execute(this.f54207g);
        }
    }

    /* renamed from: a */
    private final void m27844a(n51 n51Var, long j2) {
        if (t91.f54984f && !Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        q51 m26803d = n51Var.m26803d();
        Intrinsics.m32176e(m26803d);
        if (m26803d.m27637c() == n51Var) {
            boolean m27638d = m26803d.m27638d();
            m26803d.m27643i();
            m26803d.m27633a(null);
            this.f54205e.remove(m26803d);
            if (j2 != -1 && !m27638d && !m26803d.m27641g()) {
                m26803d.m27635a(n51Var, j2, true);
            }
            if (!m26803d.m27639e().isEmpty()) {
                this.f54206f.add(m26803d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

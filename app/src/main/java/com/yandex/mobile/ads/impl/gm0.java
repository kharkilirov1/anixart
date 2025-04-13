package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class gm0 extends Thread {

    /* renamed from: b */
    private final BlockingQueue<zv0<?>> f50669b;

    /* renamed from: c */
    private final fm0 f50670c;

    /* renamed from: d */
    private final InterfaceC6025xf f50671d;

    /* renamed from: e */
    private final bx0 f50672e;

    /* renamed from: f */
    private volatile boolean f50673f = false;

    public gm0(PriorityBlockingQueue priorityBlockingQueue, fm0 fm0Var, InterfaceC6025xf interfaceC6025xf, bx0 bx0Var) {
        this.f50669b = priorityBlockingQueue;
        this.f50670c = fm0Var;
        this.f50671d = interfaceC6025xf;
        this.f50672e = bx0Var;
    }

    /* renamed from: a */
    private void m24940a() throws InterruptedException {
        zv0<?> take = this.f50669b.take();
        SystemClock.elapsedRealtime();
        take.m30309a(3);
        try {
            try {
                try {
                    take.m30316a("network-queue-take");
                } catch (qh1 e2) {
                    SystemClock.elapsedRealtime();
                    ((C4822as) this.f50672e).m22618a(take, take.mo24816b(e2));
                    take.m30330q();
                }
            } catch (Exception e3) {
                Object[] objArr = {e3.toString()};
                boolean z = rh1.f54313a;
                n60.m26808a(e3, "Unhandled exception %s", objArr);
                qh1 qh1Var = new qh1((Throwable) e3);
                SystemClock.elapsedRealtime();
                ((C4822as) this.f50672e).m22618a(take, qh1Var);
                take.m30330q();
            }
            if (take.m30328o()) {
                take.m30319c("network-discard-cancelled");
                take.m30330q();
            } else {
                TrafficStats.setThreadStatsTag(take.m30326l());
                km0 m25875a = ((C5281je) this.f50670c).m25875a(take);
                take.m30316a("network-http-complete");
                if (!m25875a.f52036e || !take.m30327n()) {
                    tw0<?> mo22616a = take.mo22616a(m25875a);
                    take.m30316a("network-parse-complete");
                    if (take.m30332s() && mo22616a.f55248b != null) {
                        this.f50671d.mo29748a(take.m30321e(), mo22616a.f55248b);
                        take.m30316a("network-cache-written");
                    }
                    take.m30329p();
                    ((C4822as) this.f50672e).m22619a(take, mo22616a, null);
                    take.m30313a(mo22616a);
                    return;
                }
                take.m30319c("not-modified");
                take.m30330q();
            }
        } finally {
            take.m30309a(4);
        }
    }

    /* renamed from: b */
    public final void m24941b() {
        this.f50673f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m24940a();
            } catch (InterruptedException unused) {
                if (this.f50673f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z = rh1.f54313a;
                    n60.m26810c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                }
            } catch (Throwable unused2) {
                boolean z2 = rh1.f54313a;
                n60.m26810c("Fatal exception during request process in NetworkDispatcher", new Object[0]);
                return;
            }
        }
    }
}

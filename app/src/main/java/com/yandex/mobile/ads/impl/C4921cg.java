package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.cg */
/* loaded from: classes3.dex */
public final class C4921cg extends Thread {

    /* renamed from: h */
    private static final boolean f49228h = rh1.f54313a;

    /* renamed from: b */
    private final BlockingQueue<zv0<?>> f49229b;

    /* renamed from: c */
    private final BlockingQueue<zv0<?>> f49230c;

    /* renamed from: d */
    private final InterfaceC6025xf f49231d;

    /* renamed from: e */
    private final bx0 f49232e;

    /* renamed from: f */
    private volatile boolean f49233f = false;

    /* renamed from: g */
    private final ci1 f49234g;

    public C4921cg(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, InterfaceC6025xf interfaceC6025xf, bx0 bx0Var) {
        this.f49229b = priorityBlockingQueue;
        this.f49230c = priorityBlockingQueue2;
        this.f49231d = interfaceC6025xf;
        this.f49232e = bx0Var;
        this.f49234g = new ci1(this, priorityBlockingQueue2, bx0Var);
    }

    /* renamed from: b */
    public final void m23251b() {
        this.f49233f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f49228h) {
            n60.m26812e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f49231d.mo29746a();
        while (true) {
            try {
                m23250a();
            } catch (InterruptedException unused) {
                if (this.f49233f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n60.m26810c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            } catch (Throwable unused2) {
                n60.m26810c("Fatal exception during request process in CacheDispatcher", new Object[0]);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m23250a() throws InterruptedException {
        zv0<?> take = this.f49229b.take();
        take.m30316a("cache-queue-take");
        take.m30309a(1);
        try {
            if (take.m30328o()) {
                take.m30319c("cache-discard-canceled");
                return;
            }
            InterfaceC6025xf.a aVar = this.f49231d.get(take.m30321e());
            if (aVar == null) {
                take.m30316a("cache-miss");
                if (!this.f49234g.m23288a(take)) {
                    this.f49230c.put(take);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.f56466e < currentTimeMillis) {
                    take.m30316a("cache-hit-expired");
                    take.m30314a(aVar);
                    if (!this.f49234g.m23288a(take)) {
                        this.f49230c.put(take);
                    }
                } else {
                    take.m30316a("cache-hit");
                    tw0<?> mo22616a = take.mo22616a(new km0(aVar.f56462a, aVar.f56468g));
                    take.m30316a("cache-hit-parsed");
                    if (mo22616a.f55249c == null) {
                        if (aVar.f56467f < currentTimeMillis) {
                            take.m30316a("cache-hit-refresh-needed");
                            take.m30314a(aVar);
                            mo22616a.f55250d = true;
                            if (this.f49234g.m23288a(take)) {
                                ((C4822as) this.f49232e).m22619a(take, mo22616a, null);
                            } else {
                                ((C4822as) this.f49232e).m22619a(take, mo22616a, new RunnableC4864bg(this, take));
                            }
                        } else {
                            ((C4822as) this.f49232e).m22619a(take, mo22616a, null);
                        }
                    } else {
                        take.m30316a("cache-parsing-failed");
                        this.f49231d.mo29747a(take.m30321e());
                        take.m30314a((InterfaceC6025xf.a) null);
                        if (!this.f49234g.m23288a(take)) {
                            this.f49230c.put(take);
                        }
                    }
                }
            }
        } finally {
            take.m30309a(2);
        }
    }
}

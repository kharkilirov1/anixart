package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class kw0 {

    /* renamed from: a */
    private final AtomicInteger f52177a;

    /* renamed from: b */
    private final HashSet f52178b;

    /* renamed from: c */
    private final PriorityBlockingQueue<zv0<?>> f52179c;

    /* renamed from: d */
    private final PriorityBlockingQueue<zv0<?>> f52180d;

    /* renamed from: e */
    private final InterfaceC6025xf f52181e;

    /* renamed from: f */
    private final fm0 f52182f;

    /* renamed from: g */
    private final bx0 f52183g;

    /* renamed from: h */
    private final gm0[] f52184h;

    /* renamed from: i */
    private C4921cg f52185i;

    /* renamed from: j */
    private final ArrayList f52186j;

    /* renamed from: k */
    private final ArrayList f52187k;

    /* renamed from: com.yandex.mobile.ads.impl.kw0$a */
    public interface InterfaceC5363a {
        /* renamed from: a */
        void m26295a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.kw0$b */
    public interface InterfaceC5364b {
        /* renamed from: a */
        boolean mo25742a(zv0<?> zv0Var);
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.kw0$c */
    public interface InterfaceC5365c<T> {
        /* renamed from: a */
        void m26296a();
    }

    public kw0(InterfaceC6025xf interfaceC6025xf, C5281je c5281je, int i2, C4822as c4822as) {
        this.f52177a = new AtomicInteger();
        this.f52178b = new HashSet();
        this.f52179c = new PriorityBlockingQueue<>();
        this.f52180d = new PriorityBlockingQueue<>();
        this.f52186j = new ArrayList();
        this.f52187k = new ArrayList();
        this.f52181e = interfaceC6025xf;
        this.f52182f = c5281je;
        this.f52184h = new gm0[i2];
        this.f52183g = c4822as;
    }

    /* renamed from: a */
    public final void m26290a() {
        C4921cg c4921cg = this.f52185i;
        if (c4921cg != null) {
            c4921cg.m23251b();
        }
        for (gm0 gm0Var : this.f52184h) {
            if (gm0Var != null) {
                gm0Var.m24941b();
            }
        }
        C4921cg c4921cg2 = new C4921cg(this.f52179c, this.f52180d, this.f52181e, this.f52183g);
        this.f52185i = c4921cg2;
        c4921cg2.start();
        for (int i2 = 0; i2 < this.f52184h.length; i2++) {
            gm0 gm0Var2 = new gm0(this.f52180d, this.f52182f, this.f52181e, this.f52183g);
            this.f52184h[i2] = gm0Var2;
            gm0Var2.start();
        }
    }

    /* renamed from: b */
    public final <T> void m26294b(zv0<T> zv0Var) {
        synchronized (this.f52178b) {
            this.f52178b.remove(zv0Var);
        }
        synchronized (this.f52186j) {
            Iterator it = this.f52186j.iterator();
            while (it.hasNext()) {
                ((InterfaceC5365c) it.next()).m26296a();
            }
        }
        m26293a(zv0Var, 5);
    }

    /* renamed from: a */
    public final void m26291a(InterfaceC5364b interfaceC5364b) {
        synchronized (this.f52178b) {
            Iterator it = this.f52178b.iterator();
            while (it.hasNext()) {
                zv0<?> zv0Var = (zv0) it.next();
                if (interfaceC5364b.mo25742a(zv0Var)) {
                    zv0Var.mo26796a();
                }
            }
        }
    }

    public kw0(InterfaceC6025xf interfaceC6025xf, C5281je c5281je, int i2) {
        this(interfaceC6025xf, c5281je, i2, new C4822as(new Handler(Looper.getMainLooper())));
    }

    /* renamed from: a */
    public final void m26292a(zv0 zv0Var) {
        zv0Var.m30311a(this);
        synchronized (this.f52178b) {
            this.f52178b.add(zv0Var);
        }
        zv0Var.m30317b(this.f52177a.incrementAndGet());
        zv0Var.m30316a("add-to-queue");
        m26293a(zv0Var, 0);
        if (!zv0Var.m30332s()) {
            this.f52180d.add(zv0Var);
        } else {
            this.f52179c.add(zv0Var);
        }
    }

    /* renamed from: a */
    public final void m26293a(zv0<?> zv0Var, int i2) {
        synchronized (this.f52187k) {
            Iterator it = this.f52187k.iterator();
            while (it.hasNext()) {
                ((InterfaceC5363a) it.next()).m26295a();
            }
        }
    }
}

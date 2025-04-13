package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import com.yandex.mobile.ads.impl.zv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
final class ci1 implements zv0.InterfaceC6144b {

    /* renamed from: a */
    private final HashMap f49281a = new HashMap();

    /* renamed from: b */
    private final bx0 f49282b;

    /* renamed from: c */
    @Nullable
    private final C4921cg f49283c;

    /* renamed from: d */
    @Nullable
    private final BlockingQueue<zv0<?>> f49284d;

    public ci1(@NonNull C4921cg c4921cg, @NonNull PriorityBlockingQueue priorityBlockingQueue, bx0 bx0Var) {
        this.f49282b = bx0Var;
        this.f49283c = c4921cg;
        this.f49284d = priorityBlockingQueue;
    }

    /* renamed from: a */
    public final void m23287a(zv0<?> zv0Var, tw0<?> tw0Var) {
        List list;
        InterfaceC6025xf.a aVar = tw0Var.f55248b;
        if (aVar != null) {
            if (!(aVar.f56466e < System.currentTimeMillis())) {
                String m30321e = zv0Var.m30321e();
                synchronized (this) {
                    list = (List) this.f49281a.remove(m30321e);
                }
                if (list != null) {
                    if (rh1.f54313a) {
                        n60.m26812e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), m30321e);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C4822as) this.f49282b).m22619a((zv0) it.next(), tw0Var, null);
                    }
                    return;
                }
                return;
            }
        }
        m23289b(zv0Var);
    }

    /* renamed from: b */
    public final synchronized void m23289b(zv0<?> zv0Var) {
        BlockingQueue<zv0<?>> blockingQueue;
        String m30321e = zv0Var.m30321e();
        List list = (List) this.f49281a.remove(m30321e);
        if (list != null && !list.isEmpty()) {
            if (rh1.f54313a) {
                n60.m26812e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), m30321e);
            }
            zv0<?> zv0Var2 = (zv0) list.remove(0);
            this.f49281a.put(m30321e, list);
            zv0Var2.m30315a((zv0.InterfaceC6144b) this);
            if (this.f49283c != null && (blockingQueue = this.f49284d) != null) {
                try {
                    blockingQueue.put(zv0Var2);
                } catch (InterruptedException e2) {
                    n60.m26810c("Couldn't add request to queue. %s", e2.toString());
                    Thread.currentThread().interrupt();
                    this.f49283c.m23251b();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean m23288a(zv0<?> zv0Var) {
        String m30321e = zv0Var.m30321e();
        if (this.f49281a.containsKey(m30321e)) {
            List list = (List) this.f49281a.get(m30321e);
            if (list == null) {
                list = new ArrayList();
            }
            zv0Var.m30316a("waiting-for-response");
            list.add(zv0Var);
            this.f49281a.put(m30321e, list);
            if (rh1.f54313a) {
                n60.m26809b("Request for cacheKey=%s is in flight, putting on hold.", m30321e);
            }
            return true;
        }
        this.f49281a.put(m30321e, null);
        zv0Var.m30315a((zv0.InterfaceC6144b) this);
        if (rh1.f54313a) {
            n60.m26809b("new request, sending to network %s", m30321e);
        }
        return false;
    }
}

package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.R1 */
/* loaded from: classes2.dex */
public class C3582R1 extends C4375vn implements InterfaceC3284F2 {

    /* renamed from: b */
    @NonNull
    private final Executor f43786b;

    /* renamed from: g */
    private volatile b f43791g;

    /* renamed from: h */
    @NonNull
    private C3594Rd f43792h;

    /* renamed from: i */
    @NonNull
    private final C3366I9 f43793i;

    /* renamed from: d */
    private final BlockingQueue<b> f43788d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final Object f43789e = new Object();

    /* renamed from: f */
    private final Object f43790f = new Object();

    /* renamed from: c */
    private Executor f43787c = new ExecutorC4193on();

    /* renamed from: com.yandex.metrica.impl.ob.R1$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        public final AbstractC3632T1 f43794a;

        /* renamed from: b */
        @NonNull
        private final String f43795b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.f43795b.equals(((b) obj).f43795b);
        }

        public int hashCode() {
            return this.f43795b.hashCode();
        }

        private b(@NonNull AbstractC3632T1 abstractC3632T1) {
            this.f43794a = abstractC3632T1;
            this.f43795b = abstractC3632T1.mo18426a();
        }
    }

    public C3582R1(@NonNull Context context, @NonNull Executor executor, @NonNull C3366I9 c3366i9) {
        this.f43786b = executor;
        this.f43793i = c3366i9;
        this.f43792h = new C3594Rd(context);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public RunnableC3707W1 m18934a(@NonNull AbstractC3632T1 abstractC3632T1) {
        return new RunnableC3707W1(this.f43792h, new C3619Sd(new C3644Td(this.f43793i, abstractC3632T1.mo18428b()), abstractC3632T1.mo18430j()), abstractC3632T1, this, new C3682V1(), "NetworkTaskQueue");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public void mo17988a() {
    }

    /* renamed from: b */
    public void m18935b(AbstractC3632T1 abstractC3632T1) {
        boolean z;
        synchronized (this.f43789e) {
            b bVar = new b(abstractC3632T1);
            if (mo20676c()) {
                if (!this.f43788d.contains(bVar) && !bVar.equals(this.f43791g)) {
                    z = false;
                    if (!z && bVar.f43794a.m19130u()) {
                        this.f43788d.offer(bVar);
                    }
                }
                z = true;
                if (!z) {
                    this.f43788d.offer(bVar);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC3632T1 abstractC3632T1 = null;
        while (mo20676c()) {
            try {
                synchronized (this.f43790f) {
                }
                this.f43791g = this.f43788d.take();
                abstractC3632T1 = this.f43791g.f43794a;
                (abstractC3632T1.mo18436z() ? this.f43786b : this.f43787c).execute(m18934a(abstractC3632T1));
                synchronized (this.f43790f) {
                    this.f43791g = null;
                    abstractC3632T1.mo19132w();
                    abstractC3632T1.mo19133x();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f43790f) {
                    this.f43791g = null;
                    if (abstractC3632T1 != null) {
                        abstractC3632T1.mo19132w();
                        abstractC3632T1.mo19133x();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f43790f) {
                    this.f43791g = null;
                    if (abstractC3632T1 != null) {
                        abstractC3632T1.mo19132w();
                        abstractC3632T1.mo19133x();
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public void mo17990b() {
        synchronized (this.f43790f) {
            b bVar = this.f43791g;
            if (bVar != null) {
                bVar.f43794a.mo19133x();
            }
            ArrayList arrayList = new ArrayList(this.f43788d.size());
            this.f43788d.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f43794a.mo19133x();
            }
        }
    }
}

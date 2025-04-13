package com.yandex.metrica.impl.p023ob;

import androidx.annotation.WorkerThread;

/* renamed from: com.yandex.metrica.impl.ob.Tg */
/* loaded from: classes2.dex */
class RunnableC3647Tg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3747Xg f44097a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f44098b;

    public RunnableC3647Tg(C3622Sg c3622Sg, InterfaceC3747Xg interfaceC3747Xg, Throwable th) {
        this.f44097a = interfaceC3747Xg;
        this.f44098b = th;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        this.f44097a.mo18758a(this.f44098b);
    }
}

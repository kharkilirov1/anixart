package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.m1 */
/* loaded from: classes2.dex */
class RunnableC4119m1 implements Runnable {

    /* renamed from: a */
    private final WeakReference<Handler> f45929a;

    /* renamed from: b */
    private final WeakReference<AbstractC3381J> f45930b;

    public RunnableC4119m1(Handler handler, AbstractC3381J abstractC3381J) {
        this.f45929a = new WeakReference<>(handler);
        this.f45930b = new WeakReference<>(abstractC3381J);
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.f45929a.get();
        AbstractC3381J abstractC3381J = this.f45930b.get();
        if (handler == null || abstractC3381J == null || !abstractC3381J.m18357e()) {
            return;
        }
        C4093l1.m20311a(handler, abstractC3381J, this);
    }
}

package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.l1 */
/* loaded from: classes2.dex */
class C4093l1 {

    /* renamed from: a */
    private final Handler f45844a;

    /* renamed from: b */
    private final AbstractC3381J f45845b;

    /* renamed from: c */
    private final RunnableC4119m1 f45846c;

    public C4093l1(Handler handler, AbstractC3381J abstractC3381J) {
        this.f45844a = handler;
        this.f45845b = abstractC3381J;
        this.f45846c = new RunnableC4119m1(handler, abstractC3381J);
    }

    /* renamed from: a */
    public void m20312a() {
        this.f45844a.removeCallbacks(this.f45846c, this.f45845b.f43154b.m19136b().m17753c());
    }

    /* renamed from: b */
    public void m20313b() {
        m20311a(this.f45844a, this.f45845b, this.f45846c);
    }

    /* renamed from: a */
    public static void m20311a(Handler handler, AbstractC3381J abstractC3381J, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC3381J.f43154b.m19136b().m17753c());
        String m17753c = abstractC3381J.f43154b.m19136b().m17753c();
        long uptimeMillis = SystemClock.uptimeMillis();
        Integer asInteger = abstractC3381J.f43154b.m19136b().f42234b.getAsInteger("CFG_SESSION_TIMEOUT");
        if (asInteger == null) {
            asInteger = 10;
        }
        handler.postAtTime(runnable, m17753c, uptimeMillis + (asInteger.intValue() * 500));
    }
}

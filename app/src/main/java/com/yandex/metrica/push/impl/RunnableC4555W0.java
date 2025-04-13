package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4557X0;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.push.impl.W0 */
/* loaded from: classes2.dex */
class RunnableC4555W0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4557X0 f47323a;

    public RunnableC4555W0(C4557X0 c4557x0) {
        this.f47323a = c4557x0;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4557X0.a aVar;
        CountDownLatch countDownLatch;
        aVar = this.f47323a.f47325a;
        countDownLatch = this.f47323a.f47327c;
        aVar.mo21485a(countDownLatch);
    }
}

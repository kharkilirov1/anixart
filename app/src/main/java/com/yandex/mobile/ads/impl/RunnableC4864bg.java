package com.yandex.mobile.ads.impl;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.bg */
/* loaded from: classes3.dex */
final class RunnableC4864bg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zv0 f48865b;

    /* renamed from: c */
    public final /* synthetic */ C4921cg f48866c;

    public RunnableC4864bg(C4921cg c4921cg, zv0 zv0Var) {
        this.f48866c = c4921cg;
        this.f48865b = zv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f48866c.f49230c;
            blockingQueue.put(this.f48865b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

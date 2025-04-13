package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
abstract class zaav implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zaaw f15477b;

    public /* synthetic */ zaav(zaaw zaawVar) {
        this.f15477b = zaawVar;
    }

    @WorkerThread
    /* renamed from: a */
    public abstract void mo8026a();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        this.f15477b.f15479b.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            mo8026a();
        } catch (RuntimeException e2) {
            zabi zabiVar = this.f15477b.f15478a;
            zabiVar.f15509c.sendMessage(zabiVar.f15509c.obtainMessage(2, e2));
        } finally {
            this.f15477b.f15479b.unlock();
        }
    }
}

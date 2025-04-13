package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.C6073ye;

/* renamed from: com.yandex.mobile.ads.impl.xe */
/* loaded from: classes3.dex */
final class RunnableC6024xe implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bitmap f56460b;

    /* renamed from: c */
    public final /* synthetic */ C6073ye.a f56461c;

    public RunnableC6024xe(C6073ye.a aVar, Bitmap bitmap) {
        this.f56461c = aVar;
        this.f56460b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6073ye.b bVar;
        bVar = this.f56461c.f56813e;
        bVar.mo25989a(this.f56460b);
    }
}

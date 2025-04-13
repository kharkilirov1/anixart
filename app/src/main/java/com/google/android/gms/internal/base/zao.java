package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zao implements zam {
    public zao() {
    }

    public /* synthetic */ zao(zan zanVar) {
    }

    @Override // com.google.android.gms.internal.base.zam
    /* renamed from: a */
    public final ExecutorService mo8540a(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.base.zam
    /* renamed from: b */
    public final ExecutorService mo8541b(ThreadFactory threadFactory, int i2) {
        return mo8540a(1, threadFactory, 1);
    }
}

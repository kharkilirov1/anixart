package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.xn */
/* loaded from: classes2.dex */
class ExecutorC4427xn implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f46954a;

    public ExecutorC4427xn(C4453yn c4453yn, Handler handler) {
        this.f46954a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f46954a.post(runnable);
    }
}

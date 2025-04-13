package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.An */
/* loaded from: classes2.dex */
public class C3180An extends ExecutorC4193on {
    @Override // com.yandex.metrica.impl.p023ob.ExecutorC4193on, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}

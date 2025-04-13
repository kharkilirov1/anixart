package com.yandex.metrica.impl.p023ob;

import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.on */
/* loaded from: classes2.dex */
public class ExecutorC4193on implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}

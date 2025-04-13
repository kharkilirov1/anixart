package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class SafeLoggingExecutor implements Executor {

    /* renamed from: b */
    public final Executor f9155b;

    public static class SafeLoggingRunnable implements Runnable {

        /* renamed from: b */
        public final Runnable f9156b;

        public SafeLoggingRunnable(Runnable runnable) {
            this.f9156b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9156b.run();
            } catch (Exception e2) {
                Logging.m5546c("Executor", "Background execution failure.", e2);
            }
        }
    }

    public SafeLoggingExecutor(Executor executor) {
        this.f9155b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f9155b.execute(new SafeLoggingRunnable(runnable));
    }
}

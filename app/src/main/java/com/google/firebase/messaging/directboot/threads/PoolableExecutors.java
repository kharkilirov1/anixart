package com.google.firebase.messaging.directboot.threads;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class PoolableExecutors {

    /* renamed from: a */
    public static final ExecutorFactory f23378a;

    /* renamed from: b */
    public static volatile ExecutorFactory f23379b;

    public static class DefaultExecutorFactory implements ExecutorFactory {
        public DefaultExecutorFactory() {
        }

        @Override // com.google.firebase.messaging.directboot.threads.ExecutorFactory
        @NonNull
        /* renamed from: a */
        public ExecutorService mo12713a(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        public DefaultExecutorFactory(C21601 c21601) {
        }
    }

    static {
        DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory(null);
        f23378a = defaultExecutorFactory;
        f23379b = defaultExecutorFactory;
    }
}

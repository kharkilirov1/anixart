package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SchedulerPoolFactory {

    /* renamed from: a */
    public static final boolean f62680a;

    /* renamed from: b */
    public static final int f62681b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f62682c = new AtomicReference<>();

    /* renamed from: d */
    public static final Map<ScheduledThreadPoolExecutor, Object> f62683d = new ConcurrentHashMap();

    public static final class PurgeProperties {

        /* renamed from: a */
        public boolean f62684a;

        /* renamed from: b */
        public int f62685b;
    }

    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(((ConcurrentHashMap) SchedulerPoolFactory.f62683d).keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    ((ConcurrentHashMap) SchedulerPoolFactory.f62683d).remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        if (properties.containsKey("rx2.purge-enabled")) {
            purgeProperties.f62684a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            purgeProperties.f62684a = true;
        }
        if (purgeProperties.f62684a && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                purgeProperties.f62685b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                purgeProperties.f62685b = 1;
            }
        } else {
            purgeProperties.f62685b = 1;
        }
        boolean z = purgeProperties.f62684a;
        f62680a = z;
        f62681b = purgeProperties.f62685b;
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f62682c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                ScheduledTask scheduledTask = new ScheduledTask();
                long j2 = f62681b;
                newScheduledThreadPool.scheduleAtFixedRate(scheduledTask, j2, j2, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static ScheduledExecutorService m31773a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f62680a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            ((ConcurrentHashMap) f62683d).put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}

package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public final class SharedResourceHolder {

    /* renamed from: d */
    public static final SharedResourceHolder f59143d = new SharedResourceHolder(new ScheduledExecutorFactory() { // from class: io.grpc.internal.SharedResourceHolder.1
        @Override // io.grpc.internal.SharedResourceHolder.ScheduledExecutorFactory
        /* renamed from: a */
        public ScheduledExecutorService mo31197a() {
            return Executors.newSingleThreadScheduledExecutor(GrpcUtil.m31095f("grpc-shared-destroyer-%d", true));
        }
    });

    /* renamed from: a */
    public final IdentityHashMap<Resource<?>, Instance> f59144a = new IdentityHashMap<>();

    /* renamed from: b */
    public final ScheduledExecutorFactory f59145b;

    /* renamed from: c */
    public ScheduledExecutorService f59146c;

    public static class Instance {

        /* renamed from: a */
        public final Object f59151a;

        /* renamed from: b */
        public int f59152b;

        /* renamed from: c */
        public ScheduledFuture<?> f59153c;

        public Instance(Object obj) {
            this.f59151a = obj;
        }
    }

    public interface Resource<T> {
        /* renamed from: a */
        T mo31098a();

        /* renamed from: b */
        void mo31099b(T t);
    }

    public interface ScheduledExecutorFactory {
        /* renamed from: a */
        ScheduledExecutorService mo31197a();
    }

    public SharedResourceHolder(ScheduledExecutorFactory scheduledExecutorFactory) {
        this.f59145b = scheduledExecutorFactory;
    }

    /* renamed from: a */
    public static <T> T m31195a(Resource<T> resource) {
        T t;
        SharedResourceHolder sharedResourceHolder = f59143d;
        synchronized (sharedResourceHolder) {
            Instance instance = sharedResourceHolder.f59144a.get(resource);
            if (instance == null) {
                instance = new Instance(resource.mo31098a());
                sharedResourceHolder.f59144a.put(resource, instance);
            }
            ScheduledFuture<?> scheduledFuture = instance.f59153c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                instance.f59153c = null;
            }
            instance.f59152b++;
            t = (T) instance.f59151a;
        }
        return t;
    }

    /* renamed from: b */
    public static <T> T m31196b(final Resource<T> resource, final T t) {
        SharedResourceHolder sharedResourceHolder = f59143d;
        synchronized (sharedResourceHolder) {
            final Instance instance = sharedResourceHolder.f59144a.get(resource);
            if (instance == null) {
                throw new IllegalArgumentException("No cached instance found for " + resource);
            }
            Preconditions.m11179c(t == instance.f59151a, "Releasing the wrong instance");
            Preconditions.m11192p(instance.f59152b > 0, "Refcount has already reached zero");
            int i2 = instance.f59152b - 1;
            instance.f59152b = i2;
            if (i2 == 0) {
                Preconditions.m11192p(instance.f59153c == null, "Destroy task already scheduled");
                if (sharedResourceHolder.f59146c == null) {
                    sharedResourceHolder.f59146c = sharedResourceHolder.f59145b.mo31197a();
                }
                instance.f59153c = sharedResourceHolder.f59146c.schedule(new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.SharedResourceHolder.2
                    /* JADX WARN: Finally extract failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (SharedResourceHolder.this) {
                            if (instance.f59152b == 0) {
                                try {
                                    resource.mo31099b(t);
                                    SharedResourceHolder.this.f59144a.remove(resource);
                                    if (SharedResourceHolder.this.f59144a.isEmpty()) {
                                        SharedResourceHolder.this.f59146c.shutdown();
                                        SharedResourceHolder.this.f59146c = null;
                                    }
                                } catch (Throwable th) {
                                    SharedResourceHolder.this.f59144a.remove(resource);
                                    if (SharedResourceHolder.this.f59144a.isEmpty()) {
                                        SharedResourceHolder.this.f59146c.shutdown();
                                        SharedResourceHolder.this.f59146c = null;
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                }), 1L, TimeUnit.SECONDS);
            }
        }
        return null;
    }
}

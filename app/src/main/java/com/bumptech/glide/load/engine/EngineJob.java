package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class EngineJob<R> implements DecodeJob.Callback<R>, FactoryPools.Poolable {

    /* renamed from: y */
    public static final EngineResourceFactory f8230y = new EngineResourceFactory();

    /* renamed from: b */
    public final ResourceCallbacksAndExecutors f8231b;

    /* renamed from: c */
    public final StateVerifier f8232c;

    /* renamed from: d */
    public final Pools.Pool<EngineJob<?>> f8233d;

    /* renamed from: e */
    public final EngineResourceFactory f8234e;

    /* renamed from: f */
    public final EngineJobListener f8235f;

    /* renamed from: g */
    public final GlideExecutor f8236g;

    /* renamed from: h */
    public final GlideExecutor f8237h;

    /* renamed from: i */
    public final GlideExecutor f8238i;

    /* renamed from: j */
    public final GlideExecutor f8239j;

    /* renamed from: k */
    public final AtomicInteger f8240k;

    /* renamed from: l */
    public Key f8241l;

    /* renamed from: m */
    public boolean f8242m;

    /* renamed from: n */
    public boolean f8243n;

    /* renamed from: o */
    public boolean f8244o;

    /* renamed from: p */
    public boolean f8245p;

    /* renamed from: q */
    public Resource<?> f8246q;

    /* renamed from: r */
    public DataSource f8247r;

    /* renamed from: s */
    public boolean f8248s;

    /* renamed from: t */
    public GlideException f8249t;

    /* renamed from: u */
    public boolean f8250u;

    /* renamed from: v */
    public EngineResource<?> f8251v;

    /* renamed from: w */
    public DecodeJob<R> f8252w;

    /* renamed from: x */
    public volatile boolean f8253x;

    public class CallLoadFailed implements Runnable {

        /* renamed from: b */
        public final ResourceCallback f8254b;

        public CallLoadFailed(ResourceCallback resourceCallback) {
            this.f8254b = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (EngineJob.this) {
                if (EngineJob.this.f8231b.f8260b.contains(new ResourceCallbackAndExecutor(this.f8254b, Executors.f8840b))) {
                    EngineJob engineJob = EngineJob.this;
                    ResourceCallback resourceCallback = this.f8254b;
                    synchronized (engineJob) {
                        try {
                            resourceCallback.mo5299a(engineJob.f8249t);
                        } finally {
                        }
                    }
                }
                EngineJob.this.m5036e();
            }
        }
    }

    public class CallResourceReady implements Runnable {

        /* renamed from: b */
        public final ResourceCallback f8256b;

        public CallResourceReady(ResourceCallback resourceCallback) {
            this.f8256b = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (EngineJob.this) {
                if (EngineJob.this.f8231b.f8260b.contains(new ResourceCallbackAndExecutor(this.f8256b, Executors.f8840b))) {
                    EngineJob.this.f8251v.m5042a();
                    EngineJob engineJob = EngineJob.this;
                    ResourceCallback resourceCallback = this.f8256b;
                    synchronized (engineJob) {
                        try {
                            resourceCallback.mo5300b(engineJob.f8251v, engineJob.f8247r);
                        } finally {
                        }
                    }
                    EngineJob.this.m5040j(this.f8256b);
                }
                EngineJob.this.m5036e();
            }
        }
    }

    @VisibleForTesting
    public static class EngineResourceFactory {
    }

    public static final class ResourceCallbackAndExecutor {

        /* renamed from: a */
        public final ResourceCallback f8258a;

        /* renamed from: b */
        public final Executor f8259b;

        public ResourceCallbackAndExecutor(ResourceCallback resourceCallback, Executor executor) {
            this.f8258a = resourceCallback;
            this.f8259b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ResourceCallbackAndExecutor) {
                return this.f8258a.equals(((ResourceCallbackAndExecutor) obj).f8258a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8258a.hashCode();
        }
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, Pools.Pool<EngineJob<?>> pool) {
        EngineResourceFactory engineResourceFactory = f8230y;
        this.f8231b = new ResourceCallbacksAndExecutors();
        this.f8232c = StateVerifier.m5356a();
        this.f8240k = new AtomicInteger();
        this.f8236g = glideExecutor;
        this.f8237h = glideExecutor2;
        this.f8238i = glideExecutor3;
        this.f8239j = glideExecutor4;
        this.f8235f = engineJobListener;
        this.f8233d = pool;
        this.f8234e = engineResourceFactory;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    /* renamed from: a */
    public void mo5014a(GlideException glideException) {
        synchronized (this) {
            this.f8249t = glideException;
        }
        synchronized (this) {
            this.f8232c.mo5358c();
            if (this.f8253x) {
                m5039i();
                return;
            }
            if (this.f8231b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f8250u) {
                throw new IllegalStateException("Already failed once");
            }
            this.f8250u = true;
            Key key = this.f8241l;
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = this.f8231b;
            Objects.requireNonNull(resourceCallbacksAndExecutors);
            ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.f8260b);
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors2 = new ResourceCallbacksAndExecutors(arrayList);
            m5037f(arrayList.size() + 1);
            this.f8235f.mo5027b(this, key, null);
            Iterator<ResourceCallbackAndExecutor> it = resourceCallbacksAndExecutors2.iterator();
            while (it.hasNext()) {
                ResourceCallbackAndExecutor next = it.next();
                next.f8259b.execute(new CallLoadFailed(next.f8258a));
            }
            m5036e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    /* renamed from: b */
    public void mo5015b(Resource<R> resource, DataSource dataSource) {
        synchronized (this) {
            this.f8246q = resource;
            this.f8247r = dataSource;
        }
        synchronized (this) {
            this.f8232c.mo5358c();
            if (this.f8253x) {
                this.f8246q.mo5044c();
                m5039i();
                return;
            }
            if (this.f8231b.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f8248s) {
                throw new IllegalStateException("Already have resource");
            }
            EngineResourceFactory engineResourceFactory = this.f8234e;
            Resource<?> resource2 = this.f8246q;
            boolean z = this.f8242m;
            Objects.requireNonNull(engineResourceFactory);
            this.f8251v = new EngineResource<>(resource2, z, true);
            this.f8248s = true;
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = this.f8231b;
            Objects.requireNonNull(resourceCallbacksAndExecutors);
            ArrayList arrayList = new ArrayList(resourceCallbacksAndExecutors.f8260b);
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors2 = new ResourceCallbacksAndExecutors(arrayList);
            m5037f(arrayList.size() + 1);
            this.f8235f.mo5027b(this, this.f8241l, this.f8251v);
            Iterator<ResourceCallbackAndExecutor> it = resourceCallbacksAndExecutors2.iterator();
            while (it.hasNext()) {
                ResourceCallbackAndExecutor next = it.next();
                next.f8259b.execute(new CallResourceReady(next.f8258a));
            }
            m5036e();
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    /* renamed from: c */
    public void mo5016c(DecodeJob<?> decodeJob) {
        (this.f8243n ? this.f8238i : this.f8244o ? this.f8239j : this.f8237h).f8405b.execute(decodeJob);
    }

    /* renamed from: d */
    public synchronized void m5035d(ResourceCallback resourceCallback, Executor executor) {
        this.f8232c.mo5358c();
        this.f8231b.f8260b.add(new ResourceCallbackAndExecutor(resourceCallback, executor));
        boolean z = true;
        if (this.f8248s) {
            m5037f(1);
            executor.execute(new CallResourceReady(resourceCallback));
        } else if (this.f8250u) {
            m5037f(1);
            executor.execute(new CallLoadFailed(resourceCallback));
        } else {
            if (this.f8253x) {
                z = false;
            }
            Preconditions.m5343a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: e */
    public synchronized void m5036e() {
        this.f8232c.mo5358c();
        Preconditions.m5343a(m5038g(), "Not yet complete!");
        int decrementAndGet = this.f8240k.decrementAndGet();
        Preconditions.m5343a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            EngineResource<?> engineResource = this.f8251v;
            if (engineResource != null) {
                engineResource.m5043b();
            }
            m5039i();
        }
    }

    /* renamed from: f */
    public synchronized void m5037f(int i2) {
        EngineResource<?> engineResource;
        Preconditions.m5343a(m5038g(), "Not yet complete!");
        if (this.f8240k.getAndAdd(i2) == 0 && (engineResource = this.f8251v) != null) {
            engineResource.m5042a();
        }
    }

    /* renamed from: g */
    public final boolean m5038g() {
        return this.f8250u || this.f8248s || this.f8253x;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    /* renamed from: h */
    public StateVerifier mo5005h() {
        return this.f8232c;
    }

    /* renamed from: i */
    public final synchronized void m5039i() {
        boolean m5019a;
        if (this.f8241l == null) {
            throw new IllegalArgumentException();
        }
        this.f8231b.f8260b.clear();
        this.f8241l = null;
        this.f8251v = null;
        this.f8246q = null;
        this.f8250u = false;
        this.f8253x = false;
        this.f8248s = false;
        DecodeJob<R> decodeJob = this.f8252w;
        DecodeJob.ReleaseManager releaseManager = decodeJob.f8157h;
        synchronized (releaseManager) {
            releaseManager.f8184a = true;
            m5019a = releaseManager.m5019a(false);
        }
        if (m5019a) {
            decodeJob.m5010m();
        }
        this.f8252w = null;
        this.f8249t = null;
        this.f8247r = null;
        this.f8233d.mo2026a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r3.f8240k.get() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        m5039i();
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m5040j(com.bumptech.glide.request.ResourceCallback r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.f8232c     // Catch: java.lang.Throwable -> L51
            r0.mo5358c()     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r3.f8231b     // Catch: java.lang.Throwable -> L51
            java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r0.f8260b     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r1 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.Executors.f8840b     // Catch: java.lang.Throwable -> L51
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L51
            r0.remove(r1)     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r4 = r3.f8231b     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L4f
            boolean r4 = r3.m5038g()     // Catch: java.lang.Throwable -> L51
            r0 = 1
            if (r4 == 0) goto L24
            goto L38
        L24:
            r3.f8253x = r0     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.engine.DecodeJob<R> r4 = r3.f8252w     // Catch: java.lang.Throwable -> L51
            r4.f8150F = r0     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.engine.DataFetcherGenerator r4 = r4.f8148D     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L31
            r4.cancel()     // Catch: java.lang.Throwable -> L51
        L31:
            com.bumptech.glide.load.engine.EngineJobListener r4 = r3.f8235f     // Catch: java.lang.Throwable -> L51
            com.bumptech.glide.load.Key r1 = r3.f8241l     // Catch: java.lang.Throwable -> L51
            r4.mo5028c(r3, r1)     // Catch: java.lang.Throwable -> L51
        L38:
            boolean r4 = r3.f8248s     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L42
            boolean r4 = r3.f8250u     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L4f
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f8240k     // Catch: java.lang.Throwable -> L51
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L4f
            r3.m5039i()     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r3)
            return
        L51:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.EngineJob.m5040j(com.bumptech.glide.request.ResourceCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:10:0x0017, B:11:0x002a, B:16:0x001a, B:18:0x001e, B:19:0x0021, B:21:0x0025, B:22:0x0028), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:10:0x0017, B:11:0x002a, B:16:0x001a, B:18:0x001e, B:19:0x0021, B:21:0x0025, B:22:0x0028), top: B:2:0x0001 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m5041k(com.bumptech.glide.load.engine.DecodeJob<R> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f8252w = r3     // Catch: java.lang.Throwable -> L31
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch: java.lang.Throwable -> L31
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r3.m5007j(r0)     // Catch: java.lang.Throwable -> L31
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch: java.lang.Throwable -> L31
            if (r0 == r1) goto L14
            com.bumptech.glide.load.engine.DecodeJob$Stage r1 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L1a
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r2.f8236g     // Catch: java.lang.Throwable -> L31
            goto L2a
        L1a:
            boolean r0 = r2.f8243n     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L21
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r2.f8238i     // Catch: java.lang.Throwable -> L31
            goto L2a
        L21:
            boolean r0 = r2.f8244o     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L28
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r2.f8239j     // Catch: java.lang.Throwable -> L31
            goto L2a
        L28:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r2.f8237h     // Catch: java.lang.Throwable -> L31
        L2a:
            java.util.concurrent.ExecutorService r0 = r0.f8405b     // Catch: java.lang.Throwable -> L31
            r0.execute(r3)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)
            return
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.EngineJob.m5041k(com.bumptech.glide.load.engine.DecodeJob):void");
    }

    public static final class ResourceCallbacksAndExecutors implements Iterable<ResourceCallbackAndExecutor> {

        /* renamed from: b */
        public final List<ResourceCallbackAndExecutor> f8260b;

        public ResourceCallbacksAndExecutors() {
            this.f8260b = new ArrayList(2);
        }

        public boolean isEmpty() {
            return this.f8260b.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<ResourceCallbackAndExecutor> iterator() {
            return this.f8260b.iterator();
        }

        public ResourceCallbacksAndExecutors(List<ResourceCallbackAndExecutor> list) {
            this.f8260b = list;
        }
    }
}

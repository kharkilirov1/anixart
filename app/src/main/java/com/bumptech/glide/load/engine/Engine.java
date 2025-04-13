package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.ActiveResources;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Engine implements EngineJobListener, MemoryCache.ResourceRemovedListener, EngineResource.ResourceListener {

    /* renamed from: h */
    public static final boolean f8206h = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final Jobs f8207a;

    /* renamed from: b */
    public final EngineKeyFactory f8208b;

    /* renamed from: c */
    public final MemoryCache f8209c;

    /* renamed from: d */
    public final EngineJobFactory f8210d;

    /* renamed from: e */
    public final ResourceRecycler f8211e;

    /* renamed from: f */
    public final DecodeJobFactory f8212f;

    /* renamed from: g */
    public final ActiveResources f8213g;

    @VisibleForTesting
    public static class DecodeJobFactory {

        /* renamed from: a */
        public final DecodeJob.DiskCacheProvider f8214a;

        /* renamed from: b */
        public final Pools.Pool<DecodeJob<?>> f8215b = FactoryPools.m5353a(150, new FactoryPools.Factory<DecodeJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.DecodeJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* renamed from: a */
            public DecodeJob<?> mo5033a() {
                DecodeJobFactory decodeJobFactory = DecodeJobFactory.this;
                return new DecodeJob<>(decodeJobFactory.f8214a, decodeJobFactory.f8215b);
            }
        });

        /* renamed from: c */
        public int f8216c;

        public DecodeJobFactory(DecodeJob.DiskCacheProvider diskCacheProvider) {
            this.f8214a = diskCacheProvider;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public <R> DecodeJob<R> m5032a(GlideContext glideContext, Object obj, EngineKey engineKey, Key key, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options options, DecodeJob.Callback<R> callback) {
            DecodeJob<R> decodeJob = (DecodeJob) this.f8215b.mo2027b();
            Objects.requireNonNull(decodeJob, "Argument must not be null");
            int i4 = this.f8216c;
            this.f8216c = i4 + 1;
            DecodeHelper<R> decodeHelper = decodeJob.f8151b;
            DecodeJob.DiskCacheProvider diskCacheProvider = decodeJob.f8154e;
            decodeHelper.f8129c = glideContext;
            decodeHelper.f8130d = obj;
            decodeHelper.f8140n = key;
            decodeHelper.f8131e = i2;
            decodeHelper.f8132f = i3;
            decodeHelper.f8142p = diskCacheStrategy;
            decodeHelper.f8133g = cls;
            decodeHelper.f8134h = diskCacheProvider;
            decodeHelper.f8137k = cls2;
            decodeHelper.f8141o = priority;
            decodeHelper.f8135i = options;
            decodeHelper.f8136j = map;
            decodeHelper.f8143q = z;
            decodeHelper.f8144r = z2;
            decodeJob.f8158i = glideContext;
            decodeJob.f8159j = key;
            decodeJob.f8160k = priority;
            decodeJob.f8161l = engineKey;
            decodeJob.f8162m = i2;
            decodeJob.f8163n = i3;
            decodeJob.f8164o = diskCacheStrategy;
            decodeJob.f8171v = z3;
            decodeJob.f8165p = options;
            decodeJob.f8166q = callback;
            decodeJob.f8167r = i4;
            decodeJob.f8169t = DecodeJob.RunReason.INITIALIZE;
            decodeJob.f8172w = obj;
            return decodeJob;
        }
    }

    @VisibleForTesting
    public static class EngineJobFactory {

        /* renamed from: a */
        public final GlideExecutor f8218a;

        /* renamed from: b */
        public final GlideExecutor f8219b;

        /* renamed from: c */
        public final GlideExecutor f8220c;

        /* renamed from: d */
        public final GlideExecutor f8221d;

        /* renamed from: e */
        public final EngineJobListener f8222e;

        /* renamed from: f */
        public final Pools.Pool<EngineJob<?>> f8223f = FactoryPools.m5353a(150, new FactoryPools.Factory<EngineJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.EngineJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* renamed from: a */
            public EngineJob<?> mo5033a() {
                EngineJobFactory engineJobFactory = EngineJobFactory.this;
                return new EngineJob<>(engineJobFactory.f8218a, engineJobFactory.f8219b, engineJobFactory.f8220c, engineJobFactory.f8221d, engineJobFactory.f8222e, engineJobFactory.f8223f);
            }
        });

        public EngineJobFactory(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener) {
            this.f8218a = glideExecutor;
            this.f8219b = glideExecutor2;
            this.f8220c = glideExecutor3;
            this.f8221d = glideExecutor4;
            this.f8222e = engineJobListener;
        }
    }

    public static class LazyDiskCacheProvider implements DecodeJob.DiskCacheProvider {

        /* renamed from: a */
        public final DiskCache.Factory f8225a;

        /* renamed from: b */
        public volatile DiskCache f8226b;

        public LazyDiskCacheProvider(DiskCache.Factory factory) {
            this.f8225a = factory;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider
        /* renamed from: a */
        public DiskCache mo5018a() {
            if (this.f8226b == null) {
                synchronized (this) {
                    if (this.f8226b == null) {
                        this.f8226b = this.f8225a.mo5106A();
                    }
                    if (this.f8226b == null) {
                        this.f8226b = new DiskCacheAdapter();
                    }
                }
            }
            return this.f8226b;
        }
    }

    public class LoadStatus {

        /* renamed from: a */
        public final EngineJob<?> f8227a;

        /* renamed from: b */
        public final ResourceCallback f8228b;

        public LoadStatus(ResourceCallback resourceCallback, EngineJob<?> engineJob) {
            this.f8228b = resourceCallback;
            this.f8227a = engineJob;
        }

        /* renamed from: a */
        public void m5034a() {
            synchronized (Engine.this) {
                this.f8227a.m5040j(this.f8228b);
            }
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this.f8209c = memoryCache;
        LazyDiskCacheProvider lazyDiskCacheProvider = new LazyDiskCacheProvider(factory);
        ActiveResources activeResources = new ActiveResources(z);
        this.f8213g = activeResources;
        synchronized (this) {
            synchronized (activeResources) {
                activeResources.f8107e = this;
            }
        }
        this.f8208b = new EngineKeyFactory();
        this.f8207a = new Jobs();
        this.f8210d = new EngineJobFactory(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this);
        this.f8212f = new DecodeJobFactory(lazyDiskCacheProvider);
        this.f8211e = new ResourceRecycler();
        memoryCache.mo5112e(this);
    }

    /* renamed from: f */
    public static void m5025f(String str, long j2, Key key) {
        StringBuilder m27x = C0000a.m27x(str, " in ");
        m27x.append(LogTime.m5335a(j2));
        m27x.append("ms, key: ");
        m27x.append(key);
        Log.v("Engine", m27x.toString());
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    /* renamed from: a */
    public void mo5026a(@NonNull Resource<?> resource) {
        this.f8211e.m5058a(resource);
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    /* renamed from: b */
    public synchronized void mo5027b(EngineJob<?> engineJob, Key key, EngineResource<?> engineResource) {
        if (engineResource != null) {
            synchronized (engineResource) {
                engineResource.f8274f = key;
                engineResource.f8273e = this;
            }
            if (engineResource.f8270b) {
                this.f8213g.m4988a(key, engineResource);
            }
        }
        Jobs jobs = this.f8207a;
        Objects.requireNonNull(jobs);
        Map<Key, EngineJob<?>> m5054a = jobs.m5054a(engineJob.f8245p);
        if (engineJob.equals(m5054a.get(key))) {
            m5054a.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    /* renamed from: c */
    public synchronized void mo5028c(EngineJob<?> engineJob, Key key) {
        Jobs jobs = this.f8207a;
        Objects.requireNonNull(jobs);
        Map<Key, EngineJob<?>> m5054a = jobs.m5054a(engineJob.f8245p);
        if (engineJob.equals(m5054a.get(key))) {
            m5054a.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineResource.ResourceListener
    /* renamed from: d */
    public synchronized void mo5029d(Key key, EngineResource<?> engineResource) {
        ActiveResources activeResources = this.f8213g;
        synchronized (activeResources) {
            ActiveResources.ResourceWeakReference remove = activeResources.f8105c.remove(key);
            if (remove != null) {
                remove.f8112c = null;
                remove.clear();
            }
        }
        if (engineResource.f8270b) {
            this.f8209c.mo5116c(key, engineResource);
        } else {
            this.f8211e.m5058a(engineResource);
        }
    }

    /* renamed from: e */
    public synchronized <R> LoadStatus m5030e(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor) {
        long j2;
        EngineResource<?> engineResource;
        EngineResource<?> engineResource2;
        DataSource dataSource = DataSource.MEMORY_CACHE;
        synchronized (this) {
            boolean z7 = f8206h;
            if (z7) {
                int i4 = LogTime.f8843b;
                j2 = SystemClock.elapsedRealtimeNanos();
            } else {
                j2 = 0;
            }
            long j3 = j2;
            Objects.requireNonNull(this.f8208b);
            EngineKey engineKey = new EngineKey(obj, key, i2, i3, map, cls, cls2, options);
            if (z3) {
                ActiveResources activeResources = this.f8213g;
                synchronized (activeResources) {
                    ActiveResources.ResourceWeakReference resourceWeakReference = activeResources.f8105c.get(engineKey);
                    if (resourceWeakReference == null) {
                        engineResource = null;
                    } else {
                        engineResource = resourceWeakReference.get();
                        if (engineResource == null) {
                            activeResources.m4989b(resourceWeakReference);
                        }
                    }
                }
                if (engineResource != null) {
                    engineResource.m5042a();
                }
            } else {
                engineResource = null;
            }
            if (engineResource != null) {
                ((SingleRequest) resourceCallback).mo5300b(engineResource, dataSource);
                if (z7) {
                    m5025f("Loaded resource from active resources", j3, engineKey);
                }
                return null;
            }
            if (z3) {
                Resource<?> mo5111d = this.f8209c.mo5111d(engineKey);
                engineResource2 = mo5111d == null ? null : mo5111d instanceof EngineResource ? (EngineResource) mo5111d : new EngineResource<>(mo5111d, true, true);
                if (engineResource2 != null) {
                    engineResource2.m5042a();
                    this.f8213g.m4988a(engineKey, engineResource2);
                }
            } else {
                engineResource2 = null;
            }
            if (engineResource2 != null) {
                ((SingleRequest) resourceCallback).mo5300b(engineResource2, dataSource);
                if (z7) {
                    m5025f("Loaded resource from cache", j3, engineKey);
                }
                return null;
            }
            Jobs jobs = this.f8207a;
            EngineJob<?> engineJob = (z6 ? jobs.f8286b : jobs.f8285a).get(engineKey);
            if (engineJob != null) {
                engineJob.m5035d(resourceCallback, executor);
                if (z7) {
                    m5025f("Added to existing load", j3, engineKey);
                }
                return new LoadStatus(resourceCallback, engineJob);
            }
            EngineJob<?> mo2027b = this.f8210d.f8223f.mo2027b();
            Objects.requireNonNull(mo2027b, "Argument must not be null");
            synchronized (mo2027b) {
                mo2027b.f8241l = engineKey;
                mo2027b.f8242m = z3;
                mo2027b.f8243n = z4;
                mo2027b.f8244o = z5;
                mo2027b.f8245p = z6;
            }
            DecodeJob<?> m5032a = this.f8212f.m5032a(glideContext, obj, engineKey, key, i2, i3, cls, cls2, priority, diskCacheStrategy, map, z, z2, z6, options, mo2027b);
            Jobs jobs2 = this.f8207a;
            Objects.requireNonNull(jobs2);
            jobs2.m5054a(mo2027b.f8245p).put(engineKey, mo2027b);
            mo2027b.m5035d(resourceCallback, executor);
            mo2027b.m5041k(m5032a);
            if (z7) {
                m5025f("Started new load", j3, engineKey);
            }
            return new LoadStatus(resourceCallback, mo2027b);
        }
    }

    /* renamed from: g */
    public void m5031g(Resource<?> resource) {
        if (!(resource instanceof EngineResource)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((EngineResource) resource).m5043b();
    }
}

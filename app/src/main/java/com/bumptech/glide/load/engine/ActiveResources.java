package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.EngineResource;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class ActiveResources {

    /* renamed from: a */
    public final boolean f8103a;

    /* renamed from: b */
    public final Executor f8104b;

    /* renamed from: c */
    @VisibleForTesting
    public final Map<Key, ResourceWeakReference> f8105c;

    /* renamed from: d */
    public final ReferenceQueue<EngineResource<?>> f8106d;

    /* renamed from: e */
    public EngineResource.ResourceListener f8107e;

    @VisibleForTesting
    public interface DequeuedResourceCallback {
    }

    @VisibleForTesting
    public static final class ResourceWeakReference extends WeakReference<EngineResource<?>> {

        /* renamed from: a */
        public final Key f8110a;

        /* renamed from: b */
        public final boolean f8111b;

        /* renamed from: c */
        @Nullable
        public Resource<?> f8112c;

        public ResourceWeakReference(@NonNull Key key, @NonNull EngineResource<?> engineResource, @NonNull ReferenceQueue<? super EngineResource<?>> referenceQueue, boolean z) {
            super(engineResource, referenceQueue);
            Resource<?> resource;
            Objects.requireNonNull(key, "Argument must not be null");
            this.f8110a = key;
            if (engineResource.f8270b && z) {
                resource = engineResource.f8272d;
                Objects.requireNonNull(resource, "Argument must not be null");
            } else {
                resource = null;
            }
            this.f8112c = resource;
            this.f8111b = engineResource.f8270b;
        }
    }

    public ActiveResources(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bumptech.glide.load.engine.ActiveResources.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull final Runnable runnable) {
                return new Thread(new Runnable(this) { // from class: com.bumptech.glide.load.engine.ActiveResources.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        });
        this.f8105c = new HashMap();
        this.f8106d = new ReferenceQueue<>();
        this.f8103a = z;
        this.f8104b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.2
            @Override // java.lang.Runnable
            public void run() {
                ActiveResources activeResources = ActiveResources.this;
                Objects.requireNonNull(activeResources);
                while (true) {
                    try {
                        activeResources.m4989b((ResourceWeakReference) activeResources.f8106d.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized void m4988a(Key key, EngineResource<?> engineResource) {
        ResourceWeakReference put = this.f8105c.put(key, new ResourceWeakReference(key, engineResource, this.f8106d, this.f8103a));
        if (put != null) {
            put.f8112c = null;
            put.clear();
        }
    }

    /* renamed from: b */
    public void m4989b(@NonNull ResourceWeakReference resourceWeakReference) {
        Resource<?> resource;
        synchronized (this.f8107e) {
            synchronized (this) {
                this.f8105c.remove(resourceWeakReference.f8110a);
                if (resourceWeakReference.f8111b && (resource = resourceWeakReference.f8112c) != null) {
                    EngineResource<?> engineResource = new EngineResource<>(resource, true, false);
                    Key key = resourceWeakReference.f8110a;
                    EngineResource.ResourceListener resourceListener = this.f8107e;
                    synchronized (engineResource) {
                        engineResource.f8274f = key;
                        engineResource.f8273e = resourceListener;
                    }
                    this.f8107e.mo5029d(resourceWeakReference.f8110a, engineResource);
                }
            }
        }
    }
}

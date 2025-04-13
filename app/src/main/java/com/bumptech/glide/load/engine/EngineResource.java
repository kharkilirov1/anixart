package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.util.Objects;

/* loaded from: classes.dex */
class EngineResource<Z> implements Resource<Z> {

    /* renamed from: b */
    public final boolean f8270b;

    /* renamed from: c */
    public final boolean f8271c;

    /* renamed from: d */
    public final Resource<Z> f8272d;

    /* renamed from: e */
    public ResourceListener f8273e;

    /* renamed from: f */
    public Key f8274f;

    /* renamed from: g */
    public int f8275g;

    /* renamed from: h */
    public boolean f8276h;

    public interface ResourceListener {
        /* renamed from: d */
        void mo5029d(Key key, EngineResource<?> engineResource);
    }

    public EngineResource(Resource<Z> resource, boolean z, boolean z2) {
        Objects.requireNonNull(resource, "Argument must not be null");
        this.f8272d = resource;
        this.f8270b = z;
        this.f8271c = z2;
    }

    /* renamed from: a */
    public synchronized void m5042a() {
        if (this.f8276h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f8275g++;
    }

    /* renamed from: b */
    public void m5043b() {
        synchronized (this.f8273e) {
            synchronized (this) {
                int i2 = this.f8275g;
                if (i2 <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                int i3 = i2 - 1;
                this.f8275g = i3;
                if (i3 == 0) {
                    this.f8273e.mo5029d(this.f8274f, this);
                }
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public synchronized void mo5044c() {
        if (this.f8275g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f8276h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f8276h = true;
        if (this.f8271c) {
            this.f8272d.mo5044c();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return this.f8272d.mo5045d();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<Z> mo5046e() {
        return this.f8272d.mo5046e();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Z get() {
        return this.f8272d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f8270b + ", listener=" + this.f8273e + ", key=" + this.f8274f + ", acquired=" + this.f8275g + ", isRecycled=" + this.f8276h + ", resource=" + this.f8272d + '}';
    }
}

package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.Objects;

/* loaded from: classes.dex */
final class LockedResource<Z> implements Resource<Z>, FactoryPools.Poolable {

    /* renamed from: f */
    public static final Pools.Pool<LockedResource<?>> f8290f = FactoryPools.m5353a(20, new FactoryPools.Factory<LockedResource<?>>() { // from class: com.bumptech.glide.load.engine.LockedResource.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public LockedResource<?> mo5033a() {
            return new LockedResource<>();
        }
    });

    /* renamed from: b */
    public final StateVerifier f8291b = StateVerifier.m5356a();

    /* renamed from: c */
    public Resource<Z> f8292c;

    /* renamed from: d */
    public boolean f8293d;

    /* renamed from: e */
    public boolean f8294e;

    @NonNull
    /* renamed from: a */
    public static <Z> LockedResource<Z> m5056a(Resource<Z> resource) {
        LockedResource<Z> lockedResource = (LockedResource) f8290f.mo2027b();
        Objects.requireNonNull(lockedResource, "Argument must not be null");
        lockedResource.f8294e = false;
        lockedResource.f8293d = true;
        lockedResource.f8292c = resource;
        return lockedResource;
    }

    /* renamed from: b */
    public synchronized void m5057b() {
        this.f8291b.mo5358c();
        if (!this.f8293d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f8293d = false;
        if (this.f8294e) {
            mo5044c();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public synchronized void mo5044c() {
        this.f8291b.mo5358c();
        this.f8294e = true;
        if (!this.f8293d) {
            this.f8292c.mo5044c();
            this.f8292c = null;
            f8290f.mo2026a(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return this.f8292c.mo5045d();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<Z> mo5046e() {
        return this.f8292c.mo5046e();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Z get() {
        return this.f8292c.get();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    /* renamed from: h */
    public StateVerifier mo5005h() {
        return this.f8291b;
    }
}

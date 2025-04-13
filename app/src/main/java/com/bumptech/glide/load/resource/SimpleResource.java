package com.bumptech.glide.load.resource;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.util.Objects;

/* loaded from: classes.dex */
public class SimpleResource<T> implements Resource<T> {

    /* renamed from: b */
    public final T f8511b;

    public SimpleResource(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f8511b = t;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public final int mo5045d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<T> mo5046e() {
        return (Class<T>) this.f8511b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final T get() {
        return this.f8511b;
    }
}

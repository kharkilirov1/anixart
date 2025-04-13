package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {

    /* renamed from: b */
    public final Resources f8559b;

    /* renamed from: c */
    public final Resource<Bitmap> f8560c;

    public LazyBitmapDrawableResource(@NonNull Resources resources, @NonNull Resource<Bitmap> resource) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f8559b = resources;
        this.f8560c = resource;
    }

    @Nullable
    /* renamed from: b */
    public static Resource<BitmapDrawable> m5183b(@NonNull Resources resources, @Nullable Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, resource);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    /* renamed from: a */
    public void mo5053a() {
        Resource<Bitmap> resource = this.f8560c;
        if (resource instanceof Initializable) {
            ((Initializable) resource).mo5053a();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
        this.f8560c.mo5044c();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return this.f8560c.mo5045d();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<BitmapDrawable> mo5046e() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f8559b, this.f8560c.get());
    }
}

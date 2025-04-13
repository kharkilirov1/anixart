package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    public NonOwnedDrawableResource(Drawable drawable) {
        super(drawable);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return Math.max(1, this.f8592b.getIntrinsicHeight() * this.f8592b.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<Drawable> mo5046e() {
        return this.f8592b.getClass();
    }
}

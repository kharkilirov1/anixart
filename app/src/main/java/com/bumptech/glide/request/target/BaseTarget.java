package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;

@Deprecated
/* loaded from: classes.dex */
public abstract class BaseTarget<Z> implements Target<Z> {

    /* renamed from: b */
    public Request f8787b;

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: d */
    public void mo5290d(@Nullable Request request) {
        this.f8787b = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: f */
    public void mo5292f(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: i */
    public void mo5294i(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    /* renamed from: j */
    public Request mo5295j() {
        return this.f8787b;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: k */
    public void mo5296k(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }
}

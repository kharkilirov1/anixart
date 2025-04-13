package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;

/* loaded from: classes.dex */
public abstract class CustomTarget<T> implements Target<T> {

    /* renamed from: b */
    public final int f8788b;

    /* renamed from: c */
    public final int f8789c;

    /* renamed from: d */
    @Nullable
    public Request f8790d;

    public CustomTarget() {
        if (!Util.m5352i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f8788b = Integer.MIN_VALUE;
        this.f8789c = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: a */
    public final void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: d */
    public final void mo5290d(@Nullable Request request) {
        this.f8790d = request;
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
    public final Request mo5295j() {
        return this.f8790d;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: l */
    public final void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
        ((SingleRequest) sizeReadyCallback).mo5302e(this.f8788b, this.f8789c);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }
}

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public interface Target<R> extends LifecycleListener {
    /* renamed from: a */
    void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback);

    /* renamed from: c */
    void mo4877c(@NonNull R r, @Nullable Transition<? super R> transition);

    /* renamed from: d */
    void mo5290d(@Nullable Request request);

    /* renamed from: f */
    void mo5292f(@Nullable Drawable drawable);

    /* renamed from: i */
    void mo5294i(@Nullable Drawable drawable);

    @Nullable
    /* renamed from: j */
    Request mo5295j();

    /* renamed from: k */
    void mo5296k(@Nullable Drawable drawable);

    /* renamed from: l */
    void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback);
}

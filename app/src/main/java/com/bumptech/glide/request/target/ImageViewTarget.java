package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.ViewAdapter {

    /* renamed from: e */
    @Nullable
    public Animatable f8801e;

    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
        Animatable animatable = this.f8801e;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: c */
    public void mo4877c(@NonNull Z z, @Nullable Transition<? super Z> transition) {
        if (transition == null || !transition.mo5326a(z, this)) {
            m5318n(z);
        } else {
            if (!(z instanceof Animatable)) {
                this.f8801e = null;
                return;
            }
            Animatable animatable = (Animatable) z;
            this.f8801e = animatable;
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    /* renamed from: e */
    public void mo5316e(Drawable drawable) {
        ((ImageView) this.f8805c).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    /* renamed from: f */
    public void mo5292f(@Nullable Drawable drawable) {
        m5318n(null);
        ((ImageView) this.f8805c).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
        Animatable animatable = this.f8801e;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    @Nullable
    /* renamed from: h */
    public Drawable mo5317h() {
        return ((ImageView) this.f8805c).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    /* renamed from: i */
    public void mo5294i(@Nullable Drawable drawable) {
        m5318n(null);
        ((ImageView) this.f8805c).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    /* renamed from: k */
    public void mo5296k(@Nullable Drawable drawable) {
        this.f8806d.m5319a();
        Animatable animatable = this.f8801e;
        if (animatable != null) {
            animatable.stop();
        }
        m5318n(null);
        ((ImageView) this.f8805c).setImageDrawable(drawable);
    }

    /* renamed from: m */
    public abstract void mo5314m(@Nullable Z z);

    /* renamed from: n */
    public final void m5318n(@Nullable Z z) {
        mo5314m(z);
        if (!(z instanceof Animatable)) {
            this.f8801e = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f8801e = animatable;
        animatable.start();
    }
}

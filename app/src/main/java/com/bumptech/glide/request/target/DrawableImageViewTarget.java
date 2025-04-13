package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {
    public DrawableImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    /* renamed from: m */
    public void mo5314m(@Nullable Drawable drawable) {
        ((ImageView) this.f8805c).setImageDrawable(drawable);
    }
}

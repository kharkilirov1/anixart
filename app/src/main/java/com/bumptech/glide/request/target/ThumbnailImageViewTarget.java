package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.target.FixedSizeDrawable;

/* loaded from: classes.dex */
public abstract class ThumbnailImageViewTarget<T> extends ImageViewTarget<T> {
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    /* renamed from: m */
    public void mo5314m(@Nullable T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f8805c).getLayoutParams();
        Drawable mo5315o = mo5315o(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            mo5315o = new FixedSizeDrawable(new FixedSizeDrawable.State(mo5315o.getConstantState(), layoutParams.width, layoutParams.height), mo5315o);
        }
        ((ImageView) this.f8805c).setImageDrawable(mo5315o);
    }

    /* renamed from: o */
    public abstract Drawable mo5315o(T t);
}

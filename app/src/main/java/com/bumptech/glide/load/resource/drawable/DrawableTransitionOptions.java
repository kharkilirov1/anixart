package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;

/* loaded from: classes.dex */
public final class DrawableTransitionOptions extends TransitionOptions<DrawableTransitionOptions, Drawable> {
    @NonNull
    /* renamed from: b */
    public static DrawableTransitionOptions m5197b() {
        DrawableTransitionOptions drawableTransitionOptions = new DrawableTransitionOptions();
        drawableTransitionOptions.f7959b = new DrawableCrossFadeFactory(300, false);
        return drawableTransitionOptions;
    }
}

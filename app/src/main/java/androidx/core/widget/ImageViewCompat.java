package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class ImageViewCompat {

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static ColorStateList m2596a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        /* renamed from: b */
        public static PorterDuff.Mode m2597b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2598c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2599d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    /* renamed from: a */
    public static ColorStateList m2592a(@NonNull ImageView imageView) {
        return Api21Impl.m2596a(imageView);
    }

    @Nullable
    /* renamed from: b */
    public static PorterDuff.Mode m2593b(@NonNull ImageView imageView) {
        return Api21Impl.m2597b(imageView);
    }

    /* renamed from: c */
    public static void m2594c(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        Api21Impl.m2598c(imageView, colorStateList);
        if (i2 != 21 || (drawable = imageView.getDrawable()) == null || Api21Impl.m2596a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: d */
    public static void m2595d(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        Api21Impl.m2599d(imageView, mode);
        if (i2 != 21 || (drawable = imageView.getDrawable()) == null || Api21Impl.m2596a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}

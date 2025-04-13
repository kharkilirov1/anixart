package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes.dex */
public final class DrawableUtils {
    @Nullable
    /* renamed from: a */
    public static Drawable m10041a(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth2 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth3 = drawable.getIntrinsicWidth();
                int i2 = (int) (intrinsicWidth3 / intrinsicWidth2);
                intrinsicWidth = intrinsicWidth3;
                intrinsicHeight = i2;
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
            }
        } else {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
        } else {
            int intrinsicWidth4 = (drawable.getIntrinsicWidth() - intrinsicWidth) / 2;
            int intrinsicHeight2 = (drawable.getIntrinsicHeight() - intrinsicHeight) / 2;
            layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
        }
        return layerDrawable;
    }

    @Nullable
    /* renamed from: b */
    public static Drawable m10042b(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return m10043c(drawable, colorStateList, mode, false);
    }

    @Nullable
    /* renamed from: c */
    public static Drawable m10043c(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.m1845q(drawable).mutate();
            if (mode != null) {
                DrawableCompat.m1843o(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    @NonNull
    /* renamed from: d */
    public static int[] m10044d(@NonNull int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 16842912) {
                return iArr;
            }
            if (iArr[i2] == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i2] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    /* renamed from: e */
    public static void m10045e(@NonNull Drawable drawable, @ColorInt int i2) {
        boolean z = i2 != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (z) {
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (z) {
            DrawableCompat.m1841m(drawable, i2);
        } else {
            DrawableCompat.m1842n(drawable, null);
        }
    }

    @Nullable
    /* renamed from: f */
    public static PorterDuffColorFilter m10046f(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}

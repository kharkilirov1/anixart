package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
class IconHelper {
    /* renamed from: a */
    public static void m10479a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.m1845q(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                DrawableCompat.m1842n(drawable, colorStateList);
            } else {
                DrawableCompat.m1842n(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m10481c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                DrawableCompat.m1843o(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static ImageView.ScaleType m10480b(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: c */
    public static int[] m10481c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: d */
    public static void m10482d(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m10481c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = DrawableCompat.m1845q(drawable).mutate();
        DrawableCompat.m1842n(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: e */
    public static void m10483e(@NonNull CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(RippleUtils.m10256b(checkableImageButton.getContext(), (int) ViewUtils.m10165b(checkableImageButton.getContext(), 4)));
        }
    }

    /* renamed from: f */
    public static void m10484f(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean m2170J = ViewCompat.m2170J(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = m2170J || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m2170J);
        checkableImageButton.setPressable(m2170J);
        checkableImageButton.setLongClickable(z);
        ViewCompat.m2216o0(checkableImageButton, z2 ? 1 : 2);
    }
}

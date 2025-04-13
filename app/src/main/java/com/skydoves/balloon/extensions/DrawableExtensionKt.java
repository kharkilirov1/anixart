package com.skydoves.balloon.extensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawableExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"balloon_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class DrawableExtensionKt {
    @NotNull
    /* renamed from: a */
    public static final Drawable m13876a(@NotNull Drawable drawable, @NotNull Context context, @Px @Nullable Integer num, @Px @Nullable Integer num2) {
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    @NotNull
    /* renamed from: b */
    public static final Drawable m13877b(@NotNull Drawable drawable, @NotNull Context context, @ColorRes @Nullable Integer num) {
        if (num != null) {
            DrawableCompat.m1842n(DrawableCompat.m1845q(drawable), ColorStateList.valueOf(ContextCompat.m1670c(context, num.intValue())));
        }
        return drawable;
    }
}

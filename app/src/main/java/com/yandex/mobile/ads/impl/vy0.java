package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vy0 {

    /* renamed from: a */
    @NonNull
    private final C4918cf f55900a = new C4918cf();

    @NonNull
    /* renamed from: a */
    public final Bitmap m29285a(@NonNull Drawable drawable) {
        Bitmap createBitmap;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            C4918cf c4918cf = this.f55900a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Objects.requireNonNull(c4918cf);
            createBitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            C4918cf c4918cf2 = this.f55900a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            Objects.requireNonNull(c4918cf2);
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}

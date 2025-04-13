package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class CenterInside extends BitmapTransformation {

    /* renamed from: b */
    public static final byte[] f8524b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Key.f8055a);

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f8524b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /* renamed from: c */
    public Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f8576a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return TransformationUtils.m5188b(bitmapPool, bitmap, i2, i3);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return -670243078;
    }
}

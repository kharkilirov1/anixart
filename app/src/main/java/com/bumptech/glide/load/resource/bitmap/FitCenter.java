package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class FitCenter extends BitmapTransformation {

    /* renamed from: b */
    public static final byte[] f8554b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f8055a);

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f8554b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /* renamed from: c */
    public Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3) {
        return TransformationUtils.m5188b(bitmapPool, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 1572326941;
    }
}

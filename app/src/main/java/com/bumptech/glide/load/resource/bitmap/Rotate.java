package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public class Rotate extends BitmapTransformation {

    /* renamed from: b */
    public static final byte[] f8569b = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(Key.f8055a);

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f8569b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(0).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /* renamed from: c */
    public Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f8576a;
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof Rotate)) {
            return false;
        }
        Objects.requireNonNull((Rotate) obj);
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        char[] cArr = Util.f8851a;
        return -950502859;
    }
}

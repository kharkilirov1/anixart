package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class CircleCrop extends BitmapTransformation {

    /* renamed from: b */
    public static final byte[] f8525b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.f8055a);

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f8525b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /* renamed from: c */
    public Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3) {
        Paint paint = TransformationUtils.f8576a;
        int min = Math.min(i2, i3);
        float f2 = min;
        float f3 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f2 / width, f2 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap m5189c = TransformationUtils.m5189c(bitmapPool, bitmap);
        Bitmap mo5079d = bitmapPool.mo5079d(min, min, TransformationUtils.m5190d(bitmap));
        mo5079d.setHasAlpha(true);
        Lock lock = TransformationUtils.f8579d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(mo5079d);
            canvas.drawCircle(f3, f3, f3, TransformationUtils.f8577b);
            canvas.drawBitmap(m5189c, (Rect) null, rectF, TransformationUtils.f8578c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!m5189c.equals(bitmap)) {
                bitmapPool.mo5078c(m5189c);
            }
            return mo5079d;
        } catch (Throwable th) {
            TransformationUtils.f8579d.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 1101716364;
    }
}

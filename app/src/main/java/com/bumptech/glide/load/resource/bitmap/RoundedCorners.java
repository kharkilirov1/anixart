package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* renamed from: c */
    public static final byte[] f8570c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f8055a);

    /* renamed from: b */
    public final int f8571b;

    public RoundedCorners(int i2) {
        Preconditions.m5343a(i2 > 0, "roundingRadius must be greater than 0.");
        this.f8571b = i2;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f8570c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f8571b).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    /* renamed from: c */
    public Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3) {
        int i4 = this.f8571b;
        Paint paint = TransformationUtils.f8576a;
        Preconditions.m5343a(i4 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config m5190d = TransformationUtils.m5190d(bitmap);
        Bitmap m5189c = TransformationUtils.m5189c(bitmapPool, bitmap);
        Bitmap mo5079d = bitmapPool.mo5079d(m5189c.getWidth(), m5189c.getHeight(), m5190d);
        mo5079d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(m5189c, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, mo5079d.getWidth(), mo5079d.getHeight());
        Lock lock = TransformationUtils.f8579d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(mo5079d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f2 = i4;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
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
        return (obj instanceof RoundedCorners) && this.f8571b == ((RoundedCorners) obj).f8571b;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int i2 = this.f8571b;
        char[] cArr = Util.f8851a;
        return ((i2 + 527) * 31) - 569625254;
    }
}

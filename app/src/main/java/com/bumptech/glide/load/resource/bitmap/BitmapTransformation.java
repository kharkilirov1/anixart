package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class BitmapTransformation implements Transformation<Bitmap> {
    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public final Resource<Bitmap> mo4957b(@NonNull Context context, @NonNull Resource<Bitmap> resource, int i2, int i3) {
        if (!Util.m5352i(i2, i3)) {
            throw new IllegalArgumentException(C0000a.m10g("Cannot apply transformation on width: ", i2, " or height: ", i3, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        BitmapPool bitmapPool = Glide.m4871b(context).f7881b;
        Bitmap bitmap = resource.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap mo5159c = mo5159c(bitmapPool, bitmap, i2, i3);
        return bitmap.equals(mo5159c) ? resource : BitmapResource.m5158b(mo5159c, bitmapPool);
    }

    /* renamed from: c */
    public abstract Bitmap mo5159c(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i2, int i3);
}

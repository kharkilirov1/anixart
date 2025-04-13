package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* renamed from: b */
    public final Transformation<Bitmap> f8552b;

    /* renamed from: c */
    public final boolean f8553c;

    public DrawableTransformation(Transformation<Bitmap> transformation, boolean z) {
        this.f8552b = transformation;
        this.f8553c = z;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        this.f8552b.mo4956a(messageDigest);
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public Resource<Drawable> mo4957b(@NonNull Context context, @NonNull Resource<Drawable> resource, int i2, int i3) {
        BitmapPool bitmapPool = Glide.m4871b(context).f7881b;
        Drawable drawable = resource.get();
        Resource<Bitmap> m5182a = DrawableToBitmapConverter.m5182a(bitmapPool, drawable, i2, i3);
        if (m5182a != null) {
            Resource<Bitmap> mo4957b = this.f8552b.mo4957b(context, m5182a, i2, i3);
            if (!mo4957b.equals(m5182a)) {
                return LazyBitmapDrawableResource.m5183b(context.getResources(), mo4957b);
            }
            mo4957b.mo5044c();
            return resource;
        }
        if (!this.f8553c) {
            return resource;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f8552b.equals(((DrawableTransformation) obj).f8552b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8552b.hashCode();
    }
}

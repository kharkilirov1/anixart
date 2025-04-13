package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* renamed from: b */
    public final Transformation<Bitmap> f8615b;

    public GifDrawableTransformation(Transformation<Bitmap> transformation) {
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f8615b = transformation;
    }

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
        this.f8615b.mo4956a(messageDigest);
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    /* renamed from: b */
    public Resource<GifDrawable> mo4957b(@NonNull Context context, @NonNull Resource<GifDrawable> resource, int i2, int i3) {
        GifDrawable gifDrawable = resource.get();
        Resource<Bitmap> bitmapResource = new BitmapResource(gifDrawable.m5204c(), Glide.m4871b(context).f7881b);
        Resource<Bitmap> mo4957b = this.f8615b.mo4957b(context, bitmapResource, i2, i3);
        if (!bitmapResource.equals(mo4957b)) {
            bitmapResource.mo5044c();
        }
        Bitmap bitmap = mo4957b.get();
        gifDrawable.f8604b.f8614a.m5211d(this.f8615b, bitmap);
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.f8615b.equals(((GifDrawableTransformation) obj).f8615b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f8615b.hashCode();
    }
}

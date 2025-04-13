package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* loaded from: classes.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* renamed from: a */
    public final BitmapPool f8644a;

    /* renamed from: b */
    public final ResourceTranscoder<Bitmap, byte[]> f8645b;

    /* renamed from: c */
    public final ResourceTranscoder<GifDrawable, byte[]> f8646c;

    public DrawableBytesTranscoder(@NonNull BitmapPool bitmapPool, @NonNull ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, @NonNull ResourceTranscoder<GifDrawable, byte[]> resourceTranscoder2) {
        this.f8644a = bitmapPool;
        this.f8645b = resourceTranscoder;
        this.f8646c = resourceTranscoder2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    /* renamed from: a */
    public Resource<byte[]> mo5212a(@NonNull Resource<Drawable> resource, @NonNull Options options) {
        Drawable drawable = resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f8645b.mo5212a(BitmapResource.m5158b(((BitmapDrawable) drawable).getBitmap(), this.f8644a), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.f8646c.mo5212a(resource, options);
        }
        return null;
    }
}

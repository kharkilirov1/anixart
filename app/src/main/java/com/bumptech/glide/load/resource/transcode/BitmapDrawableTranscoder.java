package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;

/* loaded from: classes.dex */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    public final Resources f8643a;

    public BitmapDrawableTranscoder(@NonNull Resources resources) {
        this.f8643a = resources;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    /* renamed from: a */
    public Resource<BitmapDrawable> mo5212a(@NonNull Resource<Bitmap> resource, @NonNull Options options) {
        return LazyBitmapDrawableResource.m5183b(this.f8643a, resource);
    }
}

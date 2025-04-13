package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: classes.dex */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final ResourceDecoder<DataType, Bitmap> f8513a;

    /* renamed from: b */
    public final Resources f8514b;

    public BitmapDrawableDecoder(@NonNull Resources resources, @NonNull ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this.f8514b = resources;
        this.f8513a = resourceDecoder;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull DataType datatype, @NonNull Options options) throws IOException {
        return this.f8513a.mo4962a(datatype, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<BitmapDrawable> mo4963b(@NonNull DataType datatype, int i2, int i3, @NonNull Options options) throws IOException {
        return LazyBitmapDrawableResource.m5183b(this.f8514b, this.f8513a.mo4963b(datatype, i2, i3, options));
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import java.io.IOException;

/* loaded from: classes.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {

    /* renamed from: a */
    public final ResourceDrawableDecoder f8567a;

    /* renamed from: b */
    public final BitmapPool f8568b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, BitmapPool bitmapPool) {
        this.f8567a = resourceDrawableDecoder;
        this.f8568b = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull Uri uri, @NonNull Options options) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull Uri uri, int i2, int i3, @NonNull Options options) throws IOException {
        Resource m5198c = this.f8567a.m5198c(uri);
        if (m5198c == null) {
            return null;
        }
        return DrawableToBitmapConverter.m5182a(this.f8568b, (Drawable) ((DrawableResource) m5198c).get(), i2, i3);
    }
}

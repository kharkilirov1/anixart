package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* loaded from: classes.dex */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {

    /* renamed from: a */
    public final BitmapPool f8515a;

    /* renamed from: b */
    public final ResourceEncoder<Bitmap> f8516b;

    public BitmapDrawableEncoder(BitmapPool bitmapPool, ResourceEncoder<Bitmap> resourceEncoder) {
        this.f8515a = bitmapPool;
        this.f8516b = resourceEncoder;
    }

    @Override // com.bumptech.glide.load.Encoder
    /* renamed from: a */
    public boolean mo4950a(@NonNull Object obj, @NonNull File file, @NonNull Options options) {
        return this.f8516b.mo4950a(new BitmapResource(((BitmapDrawable) ((Resource) obj).get()).getBitmap(), this.f8515a), file, options);
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo4964b(@NonNull Options options) {
        return this.f8516b.mo4964b(options);
    }
}

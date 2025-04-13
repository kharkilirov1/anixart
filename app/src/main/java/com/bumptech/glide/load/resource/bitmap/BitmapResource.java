package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public class BitmapResource implements Resource<Bitmap>, Initializable {

    /* renamed from: b */
    public final Bitmap f8520b;

    /* renamed from: c */
    public final BitmapPool f8521c;

    public BitmapResource(@NonNull Bitmap bitmap, @NonNull BitmapPool bitmapPool) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f8520b = bitmap;
        Objects.requireNonNull(bitmapPool, "BitmapPool must not be null");
        this.f8521c = bitmapPool;
    }

    @Nullable
    /* renamed from: b */
    public static BitmapResource m5158b(@Nullable Bitmap bitmap, @NonNull BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    /* renamed from: a */
    public void mo5053a() {
        this.f8520b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
        this.f8521c.mo5078c(this.f8520b);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return Util.m5347d(this.f8520b);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<Bitmap> mo5046e() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Bitmap get() {
        return this.f8520b;
    }
}

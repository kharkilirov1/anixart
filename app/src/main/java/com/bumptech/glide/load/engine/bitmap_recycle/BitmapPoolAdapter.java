package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class BitmapPoolAdapter implements BitmapPool {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    /* renamed from: a */
    public void mo5076a(int i2) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    /* renamed from: b */
    public void mo5077b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    /* renamed from: c */
    public void mo5078c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    /* renamed from: d */
    public Bitmap mo5079d(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    /* renamed from: e */
    public Bitmap mo5080e(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }
}

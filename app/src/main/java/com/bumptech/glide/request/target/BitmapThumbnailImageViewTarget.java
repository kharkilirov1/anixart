package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class BitmapThumbnailImageViewTarget extends ThumbnailImageViewTarget<Bitmap> {
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    /* renamed from: o */
    public Drawable mo5315o(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f8805c).getResources(), bitmap);
    }
}

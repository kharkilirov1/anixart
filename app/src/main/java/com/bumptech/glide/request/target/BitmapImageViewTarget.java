package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class BitmapImageViewTarget extends ImageViewTarget<Bitmap> {
    public BitmapImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    /* renamed from: m */
    public void mo5314m(Bitmap bitmap) {
        ((ImageView) this.f8805c).setImageBitmap(bitmap);
    }
}

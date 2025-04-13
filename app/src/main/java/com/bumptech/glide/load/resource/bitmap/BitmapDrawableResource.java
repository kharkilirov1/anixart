package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

/* loaded from: classes.dex */
public class BitmapDrawableResource extends DrawableResource<BitmapDrawable> {
    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    /* renamed from: a */
    public void mo5053a() {
        ((BitmapDrawable) this.f8592b).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
        ((BitmapDrawable) this.f8592b).getBitmap();
        throw null;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        return Util.m5347d(((BitmapDrawable) this.f8592b).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<BitmapDrawable> mo5046e() {
        return BitmapDrawable.class;
    }
}

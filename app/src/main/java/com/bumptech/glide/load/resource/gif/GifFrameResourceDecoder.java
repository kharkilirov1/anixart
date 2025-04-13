package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class GifFrameResourceDecoder implements ResourceDecoder<GifDecoder, Bitmap> {

    /* renamed from: a */
    public final BitmapPool f8635a;

    public GifFrameResourceDecoder(BitmapPool bitmapPool) {
        this.f8635a = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo4962a(@NonNull GifDecoder gifDecoder, @NonNull Options options) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull GifDecoder gifDecoder, int i2, int i3, @NonNull Options options) throws IOException {
        return BitmapResource.m5158b(gifDecoder.mo4928b(), this.f8635a);
    }
}

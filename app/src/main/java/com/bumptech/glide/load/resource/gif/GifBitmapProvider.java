package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* loaded from: classes.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    /* renamed from: a */
    public final BitmapPool f8602a;

    /* renamed from: b */
    @Nullable
    public final ArrayPool f8603b;

    public GifBitmapProvider(BitmapPool bitmapPool, @Nullable ArrayPool arrayPool) {
        this.f8602a = bitmapPool;
        this.f8603b = arrayPool;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    /* renamed from: a */
    public Bitmap mo4934a(int i2, int i3, @NonNull Bitmap.Config config) {
        return this.f8602a.mo5080e(i2, i3, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    /* renamed from: b */
    public int[] mo4935b(int i2) {
        ArrayPool arrayPool = this.f8603b;
        return arrayPool == null ? new int[i2] : (int[]) arrayPool.mo5065d(i2, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    /* renamed from: c */
    public void mo4936c(@NonNull Bitmap bitmap) {
        this.f8602a.mo5078c(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    /* renamed from: d */
    public void mo4937d(@NonNull byte[] bArr) {
        ArrayPool arrayPool = this.f8603b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    /* renamed from: e */
    public byte[] mo4938e(int i2) {
        ArrayPool arrayPool = this.f8603b;
        return arrayPool == null ? new byte[i2] : (byte[]) arrayPool.mo5065d(i2, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    /* renamed from: f */
    public void mo4939f(@NonNull int[] iArr) {
        ArrayPool arrayPool = this.f8603b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(iArr);
    }
}

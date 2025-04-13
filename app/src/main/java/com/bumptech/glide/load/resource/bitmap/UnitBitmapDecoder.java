package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    public static final class NonOwnedBitmapResource implements Resource<Bitmap> {

        /* renamed from: b */
        public final Bitmap f8580b;

        public NonOwnedBitmapResource(@NonNull Bitmap bitmap) {
            this.f8580b = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: c */
        public void mo5044c() {
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: d */
        public int mo5045d() {
            return Util.m5347d(this.f8580b);
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
            return this.f8580b;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo4962a(@NonNull Bitmap bitmap, @NonNull Options options) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull Bitmap bitmap, int i2, int i3, @NonNull Options options) throws IOException {
        return new NonOwnedBitmapResource(bitmap);
    }
}

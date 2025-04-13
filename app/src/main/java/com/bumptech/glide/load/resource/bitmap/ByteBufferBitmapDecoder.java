package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final Downsampler f8522a;

    public ByteBufferBitmapDecoder(Downsampler downsampler) {
        this.f8522a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public boolean mo4962a(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        Objects.requireNonNull(this.f8522a);
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<Bitmap> mo4963b(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull Options options) throws IOException {
        return this.f8522a.m5178a(ByteBufferUtil.m5332d(byteBuffer), i2, i3, options, Downsampler.f8544j);
    }
}

package com.bumptech.glide.load.engine.prefill;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;

/* loaded from: classes.dex */
public final class BitmapPreFiller {

    /* renamed from: a */
    public final MemoryCache f8415a;

    /* renamed from: b */
    public final BitmapPool f8416b;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        new Handler(Looper.getMainLooper());
        this.f8415a = memoryCache;
        this.f8416b = bitmapPool;
    }
}

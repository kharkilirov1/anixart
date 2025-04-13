package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface BitmapPool {
    /* renamed from: a */
    void mo5076a(int i2);

    /* renamed from: b */
    void mo5077b();

    /* renamed from: c */
    void mo5078c(Bitmap bitmap);

    @NonNull
    /* renamed from: d */
    Bitmap mo5079d(int i2, int i3, Bitmap.Config config);

    @NonNull
    /* renamed from: e */
    Bitmap mo5080e(int i2, int i3, Bitmap.Config config);
}

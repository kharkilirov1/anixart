package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
interface LruPoolStrategy {
    /* renamed from: a */
    String mo5067a(int i2, int i3, Bitmap.Config config);

    /* renamed from: b */
    int mo5068b(Bitmap bitmap);

    /* renamed from: c */
    void mo5069c(Bitmap bitmap);

    @Nullable
    /* renamed from: d */
    Bitmap mo5070d(int i2, int i3, Bitmap.Config config);

    /* renamed from: e */
    String mo5071e(Bitmap bitmap);

    @Nullable
    Bitmap removeLast();
}

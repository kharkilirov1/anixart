package com.yandex.div.core.images;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes2.dex */
public class CachedBitmap {

    /* renamed from: a */
    @NonNull
    public final Bitmap f31288a;

    /* renamed from: b */
    @Nullable
    public final Uri f31289b;

    /* renamed from: c */
    @Nullable
    public final byte[] f31290c = null;

    /* renamed from: d */
    @NonNull
    public final BitmapSource f31291d;

    public CachedBitmap(@NonNull Bitmap bitmap, @Nullable Uri uri, @NonNull BitmapSource bitmapSource) {
        this.f31288a = bitmap;
        this.f31289b = uri;
        this.f31291d = bitmapSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedBitmap cachedBitmap = (CachedBitmap) obj;
        if (!this.f31288a.equals(cachedBitmap.f31288a) || this.f31291d != cachedBitmap.f31291d) {
            return false;
        }
        Uri uri = cachedBitmap.f31289b;
        Uri uri2 = this.f31289b;
        return uri2 != null ? uri2.equals(uri) : uri == null;
    }

    public int hashCode() {
        int hashCode = (this.f31291d.hashCode() + (this.f31288a.hashCode() * 31)) * 31;
        Uri uri = this.f31289b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}

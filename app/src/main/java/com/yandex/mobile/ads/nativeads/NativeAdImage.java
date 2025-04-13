package com.yandex.mobile.ads.nativeads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class NativeAdImage {

    /* renamed from: a */
    @Nullable
    private Bitmap f57617a;

    /* renamed from: b */
    @Nullable
    private String f57618b;

    /* renamed from: c */
    private int f57619c;

    /* renamed from: d */
    private int f57620d;

    /* renamed from: a */
    public final void m30462a(@Nullable Bitmap bitmap) {
        this.f57617a = bitmap;
    }

    /* renamed from: b */
    public final void m30464b(int i2) {
        this.f57620d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeAdImage.class != obj.getClass()) {
            return false;
        }
        NativeAdImage nativeAdImage = (NativeAdImage) obj;
        if (this.f57619c != nativeAdImage.f57619c || this.f57620d != nativeAdImage.f57620d) {
            return false;
        }
        Bitmap bitmap = this.f57617a;
        if (bitmap == null ? nativeAdImage.f57617a != null : !bitmap.equals(nativeAdImage.f57617a)) {
            return false;
        }
        String str = this.f57618b;
        String str2 = nativeAdImage.f57618b;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.f57617a;
    }

    public int getHeight() {
        return this.f57619c;
    }

    public int getWidth() {
        return this.f57620d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f57617a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.f57618b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f57619c) * 31) + this.f57620d;
    }

    /* renamed from: a */
    public final void m30461a(int i2) {
        this.f57619c = i2;
    }

    /* renamed from: a */
    public final void m30463a(@Nullable String str) {
        this.f57618b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m30460a() {
        return this.f57618b;
    }
}

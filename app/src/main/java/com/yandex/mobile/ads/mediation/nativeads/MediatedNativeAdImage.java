package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class MediatedNativeAdImage {

    /* renamed from: a */
    private final int f57527a;

    /* renamed from: b */
    private final int f57528b;

    /* renamed from: c */
    @NonNull
    private final String f57529c;

    /* renamed from: d */
    @Nullable
    private final Drawable f57530d;

    public static final class Builder {

        /* renamed from: a */
        private int f57531a;

        /* renamed from: b */
        private int f57532b;

        /* renamed from: c */
        @NonNull
        private final String f57533c;

        /* renamed from: d */
        @Nullable
        private Drawable f57534d;

        public Builder(@NonNull String str) {
            this.f57533c = str;
        }

        @NonNull
        public MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this);
        }

        @NonNull
        public Builder setDrawable(@Nullable Drawable drawable) {
            this.f57534d = drawable;
            return this;
        }

        @NonNull
        public Builder setHeight(int i2) {
            this.f57532b = i2;
            return this;
        }

        @NonNull
        public Builder setWidth(int i2) {
            this.f57531a = i2;
            return this;
        }
    }

    @Nullable
    public Drawable getDrawable() {
        return this.f57530d;
    }

    public int getHeight() {
        return this.f57528b;
    }

    @NonNull
    public String getUrl() {
        return this.f57529c;
    }

    public int getWidth() {
        return this.f57527a;
    }

    private MediatedNativeAdImage(@NonNull Builder builder) {
        this.f57529c = builder.f57533c;
        this.f57527a = builder.f57531a;
        this.f57528b = builder.f57532b;
        this.f57530d = builder.f57534d;
    }
}

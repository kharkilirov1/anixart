package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class MediatedNativeAdMedia {

    /* renamed from: a */
    private final float f57535a;

    public static final class Builder {

        /* renamed from: a */
        private final float f57536a;

        public Builder(float f2) {
            this.f57536a = f2;
        }

        @NonNull
        public MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this);
        }
    }

    public float getAspectRatio() {
        return this.f57535a;
    }

    private MediatedNativeAdMedia(@NonNull Builder builder) {
        this.f57535a = builder.f57536a;
    }
}

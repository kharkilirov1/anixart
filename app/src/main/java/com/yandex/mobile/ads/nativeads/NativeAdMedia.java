package com.yandex.mobile.ads.nativeads;

/* loaded from: classes3.dex */
public final class NativeAdMedia {

    /* renamed from: a */
    private final float f57623a;

    public NativeAdMedia(float f2) {
        this.f57623a = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NativeAdMedia.class == obj.getClass() && Float.compare(((NativeAdMedia) obj).f57623a, this.f57623a) == 0;
    }

    public float getAspectRatio() {
        return this.f57623a;
    }

    public int hashCode() {
        float f2 = this.f57623a;
        if (f2 != 0.0f) {
            return Float.floatToIntBits(f2);
        }
        return 0;
    }
}

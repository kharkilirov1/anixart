package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    /* renamed from: a */
    public Float mo4645a(LottieFrameInfo<Float> lottieFrameInfo) {
        float m4848e = MiscUtils.m4848e(lottieFrameInfo.f7867a.floatValue(), lottieFrameInfo.f7868b.floatValue(), lottieFrameInfo.f7869c);
        T t = this.f7873b;
        if (t != 0) {
            return Float.valueOf(((Float) t).floatValue() + m4848e);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}

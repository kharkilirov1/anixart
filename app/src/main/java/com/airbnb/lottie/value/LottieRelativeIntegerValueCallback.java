package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes.dex */
public class LottieRelativeIntegerValueCallback extends LottieValueCallback<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    /* renamed from: a */
    public Integer mo4645a(LottieFrameInfo<Integer> lottieFrameInfo) {
        int m4849f = MiscUtils.m4849f(lottieFrameInfo.f7867a.intValue(), lottieFrameInfo.f7868b.intValue(), lottieFrameInfo.f7869c);
        T t = this.f7873b;
        if (t != 0) {
            return Integer.valueOf(((Integer) t).intValue() + m4849f);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}

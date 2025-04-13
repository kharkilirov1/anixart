package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class LottieValueCallback<T> {

    /* renamed from: a */
    public final LottieFrameInfo<T> f7872a;

    /* renamed from: b */
    @Nullable
    public T f7873b;

    public LottieValueCallback() {
        this.f7872a = new LottieFrameInfo<>();
        this.f7873b = null;
    }

    @Nullable
    /* renamed from: a */
    public T mo4645a(LottieFrameInfo<T> lottieFrameInfo) {
        return this.f7873b;
    }

    @Nullable
    @RestrictTo
    /* renamed from: b */
    public final T m4861b(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        LottieFrameInfo<T> lottieFrameInfo = this.f7872a;
        lottieFrameInfo.f7867a = t;
        lottieFrameInfo.f7868b = t2;
        lottieFrameInfo.f7869c = f5;
        lottieFrameInfo.f7870d = f6;
        return mo4645a(lottieFrameInfo);
    }

    public LottieValueCallback(@Nullable T t) {
        this.f7872a = new LottieFrameInfo<>();
        this.f7873b = null;
        this.f7873b = t;
    }
}

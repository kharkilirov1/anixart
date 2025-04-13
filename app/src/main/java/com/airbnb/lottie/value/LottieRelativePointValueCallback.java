package com.airbnb.lottie.value;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes.dex */
public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {

    /* renamed from: c */
    public final PointF f7871c = new PointF();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    /* renamed from: a */
    public PointF mo4645a(LottieFrameInfo<PointF> lottieFrameInfo) {
        this.f7871c.set(MiscUtils.m4848e(lottieFrameInfo.f7867a.x, lottieFrameInfo.f7868b.x, lottieFrameInfo.f7869c), MiscUtils.m4848e(lottieFrameInfo.f7867a.y, lottieFrameInfo.f7868b.y, lottieFrameInfo.f7869c));
        T t = this.f7873b;
        if (t == 0) {
            throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        PointF pointF = (PointF) t;
        this.f7871c.offset(pointF.x, pointF.y);
        return this.f7871c;
    }
}

package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.Nullable;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

/* loaded from: classes.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {

    /* renamed from: i */
    public final A f7455i;

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, @Nullable A a2) {
        super(Collections.emptyList());
        this.f7414e = lottieValueCallback;
        this.f7455i = a2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: b */
    public float mo4704b() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: e */
    public A mo4707e() {
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        A a2 = this.f7455i;
        float f2 = this.f7413d;
        return lottieValueCallback.m4861b(0.0f, 0.0f, a2, a2, f2, f2, f2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public A mo4708f(Keyframe<K> keyframe, float f2) {
        return mo4707e();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: g */
    public void mo4709g() {
        if (this.f7414e != null) {
            super.mo4709g();
        }
    }
}

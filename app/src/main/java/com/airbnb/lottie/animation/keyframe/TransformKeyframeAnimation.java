package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.Collections;

/* loaded from: classes.dex */
public class TransformKeyframeAnimation {

    /* renamed from: a */
    public final Matrix f7441a = new Matrix();

    /* renamed from: b */
    public final Matrix f7442b;

    /* renamed from: c */
    public final Matrix f7443c;

    /* renamed from: d */
    public final Matrix f7444d;

    /* renamed from: e */
    public final float[] f7445e;

    /* renamed from: f */
    @NonNull
    public BaseKeyframeAnimation<PointF, PointF> f7446f;

    /* renamed from: g */
    @NonNull
    public BaseKeyframeAnimation<?, PointF> f7447g;

    /* renamed from: h */
    @NonNull
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> f7448h;

    /* renamed from: i */
    @NonNull
    public BaseKeyframeAnimation<Float, Float> f7449i;

    /* renamed from: j */
    @NonNull
    public BaseKeyframeAnimation<Integer, Integer> f7450j;

    /* renamed from: k */
    @Nullable
    public FloatKeyframeAnimation f7451k;

    /* renamed from: l */
    @Nullable
    public FloatKeyframeAnimation f7452l;

    /* renamed from: m */
    @Nullable
    public BaseKeyframeAnimation<?, Float> f7453m;

    /* renamed from: n */
    @Nullable
    public BaseKeyframeAnimation<?, Float> f7454n;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        AnimatablePathValue animatablePathValue = animatableTransform.f7507a;
        this.f7446f = animatablePathValue == null ? null : animatablePathValue.mo4737j();
        AnimatableValue<PointF, PointF> animatableValue = animatableTransform.f7508b;
        this.f7447g = animatableValue == null ? null : animatableValue.mo4737j();
        AnimatableScaleValue animatableScaleValue = animatableTransform.f7509c;
        this.f7448h = animatableScaleValue == null ? null : animatableScaleValue.mo4737j();
        AnimatableFloatValue animatableFloatValue = animatableTransform.f7510d;
        this.f7449i = animatableFloatValue == null ? null : animatableFloatValue.mo4737j();
        AnimatableFloatValue animatableFloatValue2 = animatableTransform.f7512f;
        FloatKeyframeAnimation floatKeyframeAnimation = animatableFloatValue2 == null ? null : (FloatKeyframeAnimation) animatableFloatValue2.mo4737j();
        this.f7451k = floatKeyframeAnimation;
        if (floatKeyframeAnimation != null) {
            this.f7442b = new Matrix();
            this.f7443c = new Matrix();
            this.f7444d = new Matrix();
            this.f7445e = new float[9];
        } else {
            this.f7442b = null;
            this.f7443c = null;
            this.f7444d = null;
            this.f7445e = null;
        }
        AnimatableFloatValue animatableFloatValue3 = animatableTransform.f7513g;
        this.f7452l = animatableFloatValue3 == null ? null : (FloatKeyframeAnimation) animatableFloatValue3.mo4737j();
        AnimatableIntegerValue animatableIntegerValue = animatableTransform.f7511e;
        if (animatableIntegerValue != null) {
            this.f7450j = animatableIntegerValue.mo4737j();
        }
        AnimatableFloatValue animatableFloatValue4 = animatableTransform.f7514h;
        if (animatableFloatValue4 != null) {
            this.f7453m = animatableFloatValue4.mo4737j();
        } else {
            this.f7453m = null;
        }
        AnimatableFloatValue animatableFloatValue5 = animatableTransform.f7515i;
        if (animatableFloatValue5 != null) {
            this.f7454n = animatableFloatValue5.mo4737j();
        } else {
            this.f7454n = null;
        }
    }

    /* renamed from: a */
    public void m4722a(BaseLayer baseLayer) {
        baseLayer.m4744e(this.f7450j);
        baseLayer.m4744e(this.f7453m);
        baseLayer.m4744e(this.f7454n);
        baseLayer.m4744e(this.f7446f);
        baseLayer.m4744e(this.f7447g);
        baseLayer.m4744e(this.f7448h);
        baseLayer.m4744e(this.f7449i);
        baseLayer.m4744e(this.f7451k);
        baseLayer.m4744e(this.f7452l);
    }

    /* renamed from: b */
    public void m4723b(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7450j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f7453m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f7454n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f7446f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f7447g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.f7448h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.f7410a.add(animationListener);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f7449i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.f7410a.add(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f7451k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.f7410a.add(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f7452l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.f7410a.add(animationListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public <T> boolean m4724c(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.f7237e) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation3 = this.f7446f;
            if (baseKeyframeAnimation3 == null) {
                this.f7446f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation3.f7414e;
            baseKeyframeAnimation3.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7238f) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.f7447g;
            if (baseKeyframeAnimation4 == null) {
                this.f7447g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation4.f7414e;
            baseKeyframeAnimation4.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7243k) {
            BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation5 = this.f7448h;
            if (baseKeyframeAnimation5 == null) {
                this.f7448h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY(1.0f, 1.0f));
                return true;
            }
            LottieValueCallback<ScaleXY> lottieValueCallback4 = baseKeyframeAnimation5.f7414e;
            baseKeyframeAnimation5.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7244l) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.f7449i;
            if (baseKeyframeAnimation6 == null) {
                this.f7449i = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(0.0f));
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback5 = baseKeyframeAnimation6.f7414e;
            baseKeyframeAnimation6.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7235c) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation7 = this.f7450j;
            if (baseKeyframeAnimation7 == null) {
                this.f7450j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Integer> lottieValueCallback6 = baseKeyframeAnimation7.f7414e;
            baseKeyframeAnimation7.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7257y && (baseKeyframeAnimation2 = this.f7453m) != null) {
            if (baseKeyframeAnimation2 == null) {
                this.f7453m = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback7 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7258z && (baseKeyframeAnimation = this.f7454n) != null) {
            if (baseKeyframeAnimation == null) {
                this.f7454n = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            LottieValueCallback<Float> lottieValueCallback8 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
            return true;
        }
        if (t == LottieProperty.f7245m && (floatKeyframeAnimation2 = this.f7451k) != null) {
            if (floatKeyframeAnimation2 == null) {
                this.f7451k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
            }
            FloatKeyframeAnimation floatKeyframeAnimation3 = this.f7451k;
            Object obj = floatKeyframeAnimation3.f7414e;
            floatKeyframeAnimation3.f7414e = lottieValueCallback;
            return true;
        }
        if (t != LottieProperty.f7246n || (floatKeyframeAnimation = this.f7452l) == null) {
            return false;
        }
        if (floatKeyframeAnimation == null) {
            this.f7452l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
        }
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.f7452l;
        Object obj2 = floatKeyframeAnimation4.f7414e;
        floatKeyframeAnimation4.f7414e = lottieValueCallback;
        return true;
    }

    /* renamed from: d */
    public final void m4725d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f7445e[i2] = 0.0f;
        }
    }

    /* renamed from: e */
    public Matrix m4726e() {
        this.f7441a.reset();
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f7447g;
        if (baseKeyframeAnimation != null) {
            PointF mo4707e = baseKeyframeAnimation.mo4707e();
            float f2 = mo4707e.x;
            if (f2 != 0.0f || mo4707e.y != 0.0f) {
                this.f7441a.preTranslate(f2, mo4707e.y);
            }
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f7449i;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? baseKeyframeAnimation2.mo4707e().floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).m4718i();
            if (floatValue != 0.0f) {
                this.f7441a.preRotate(floatValue);
            }
        }
        if (this.f7451k != null) {
            float cos = this.f7452l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.m4718i()) + 90.0f));
            float sin = this.f7452l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.m4718i()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.f7451k.m4718i()));
            m4725d();
            float[] fArr = this.f7445e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f7442b.setValues(fArr);
            m4725d();
            float[] fArr2 = this.f7445e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f7443c.setValues(fArr2);
            m4725d();
            float[] fArr3 = this.f7445e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f7444d.setValues(fArr3);
            this.f7443c.preConcat(this.f7442b);
            this.f7444d.preConcat(this.f7443c);
            this.f7441a.preConcat(this.f7444d);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation3 = this.f7448h;
        if (baseKeyframeAnimation3 != null) {
            ScaleXY mo4707e2 = baseKeyframeAnimation3.mo4707e();
            float f4 = mo4707e2.f7874a;
            if (f4 != 1.0f || mo4707e2.f7875b != 1.0f) {
                this.f7441a.preScale(f4, mo4707e2.f7875b);
            }
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f7446f;
        if (baseKeyframeAnimation4 != null) {
            PointF mo4707e3 = baseKeyframeAnimation4.mo4707e();
            float f5 = mo4707e3.x;
            if (f5 != 0.0f || mo4707e3.y != 0.0f) {
                this.f7441a.preTranslate(-f5, -mo4707e3.y);
            }
        }
        return this.f7441a;
    }

    /* renamed from: f */
    public Matrix m4727f(float f2) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f7447g;
        PointF mo4707e = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.mo4707e();
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation2 = this.f7448h;
        ScaleXY mo4707e2 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.mo4707e();
        this.f7441a.reset();
        if (mo4707e != null) {
            this.f7441a.preTranslate(mo4707e.x * f2, mo4707e.y * f2);
        }
        if (mo4707e2 != null) {
            double d = f2;
            this.f7441a.preScale((float) Math.pow(mo4707e2.f7874a, d), (float) Math.pow(mo4707e2.f7875b, d));
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f7449i;
        if (baseKeyframeAnimation3 != null) {
            float floatValue = baseKeyframeAnimation3.mo4707e().floatValue();
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f7446f;
            PointF mo4707e3 = baseKeyframeAnimation4 != null ? baseKeyframeAnimation4.mo4707e() : null;
            this.f7441a.preRotate(floatValue * f2, mo4707e3 == null ? 0.0f : mo4707e3.x, mo4707e3 != null ? mo4707e3.y : 0.0f);
        }
        return this.f7441a;
    }
}

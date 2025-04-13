package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes.dex */
public class StrokeContent extends BaseStrokeContent {

    /* renamed from: o */
    public final BaseLayer f7399o;

    /* renamed from: p */
    public final String f7400p;

    /* renamed from: q */
    public final boolean f7401q;

    /* renamed from: r */
    public final BaseKeyframeAnimation<Integer, Integer> f7402r;

    /* renamed from: s */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7403s;

    public StrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeStroke shapeStroke) {
        super(lottieDrawable, baseLayer, shapeStroke.f7611g.m4742a(), shapeStroke.f7612h.m4743a(), shapeStroke.f7613i, shapeStroke.f7609e, shapeStroke.f7610f, shapeStroke.f7607c, shapeStroke.f7606b);
        this.f7399o = baseLayer;
        this.f7400p = shapeStroke.f7605a;
        this.f7401q = shapeStroke.f7614j;
        BaseKeyframeAnimation<Integer, Integer> mo4737j = shapeStroke.f7608d.mo4737j();
        this.f7402r = mo4737j;
        mo4737j.f7410a.add(this);
        baseLayer.m4744e(mo4737j);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        if (this.f7401q) {
            return;
        }
        Paint paint = this.f7285i;
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) this.f7402r;
        paint.setColor(colorKeyframeAnimation.m4717i(colorKeyframeAnimation.m4703a(), colorKeyframeAnimation.m4705c()));
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f7403s;
        if (baseKeyframeAnimation != null) {
            this.f7285i.setColorFilter(baseKeyframeAnimation.mo4707e());
        }
        super.mo4692f(canvas, matrix, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.mo4693g(t, lottieValueCallback);
        if (t == LottieProperty.f7234b) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7402r;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == 0) {
                this.f7403s = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7403s = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f7410a.add(this);
            this.f7399o.m4744e(this.f7402r);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7400p;
    }
}

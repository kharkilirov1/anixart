package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes.dex */
public class SolidLayer extends BaseLayer {

    /* renamed from: A */
    public final Layer f7694A;

    /* renamed from: B */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7695B;

    /* renamed from: w */
    public final RectF f7696w;

    /* renamed from: x */
    public final Paint f7697x;

    /* renamed from: y */
    public final float[] f7698y;

    /* renamed from: z */
    public final Path f7699z;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f7696w = new RectF();
        LPaint lPaint = new LPaint();
        this.f7697x = lPaint;
        this.f7698y = new float[8];
        this.f7699z = new Path();
        this.f7694A = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.f7675l);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        super.mo4691d(rectF, matrix, z);
        RectF rectF2 = this.f7696w;
        Layer layer = this.f7694A;
        rectF2.set(0.0f, 0.0f, layer.f7673j, layer.f7674k);
        this.f7640m.mapRect(this.f7696w);
        rectF.set(this.f7696w);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f7648u.m4724c(t, lottieValueCallback);
        if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == null) {
                this.f7695B = null;
            } else {
                this.f7695B = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: j */
    public void mo4747j(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.f7694A.f7675l);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.f7648u.f7450j == null ? 100 : r1.mo4707e().intValue())) / 100.0f) * (i2 / 255.0f) * 255.0f);
        this.f7697x.setAlpha(intValue);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f7695B;
        if (baseKeyframeAnimation != null) {
            this.f7697x.setColorFilter(baseKeyframeAnimation.mo4707e());
        }
        if (intValue > 0) {
            float[] fArr = this.f7698y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Layer layer = this.f7694A;
            int i3 = layer.f7673j;
            fArr[2] = i3;
            fArr[3] = 0.0f;
            fArr[4] = i3;
            int i4 = layer.f7674k;
            fArr[5] = i4;
            fArr[6] = 0.0f;
            fArr[7] = i4;
            matrix.mapPoints(fArr);
            this.f7699z.reset();
            Path path = this.f7699z;
            float[] fArr2 = this.f7698y;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f7699z;
            float[] fArr3 = this.f7698y;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f7699z;
            float[] fArr4 = this.f7698y;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f7699z;
            float[] fArr5 = this.f7698y;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f7699z;
            float[] fArr6 = this.f7698y;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f7699z.close();
            canvas.drawPath(this.f7699z, this.f7697x);
        }
    }
}

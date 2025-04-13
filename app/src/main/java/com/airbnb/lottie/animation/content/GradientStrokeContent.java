package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes.dex */
public class GradientStrokeContent extends BaseStrokeContent {

    /* renamed from: o */
    public final String f7341o;

    /* renamed from: p */
    public final boolean f7342p;

    /* renamed from: q */
    public final LongSparseArray<LinearGradient> f7343q;

    /* renamed from: r */
    public final LongSparseArray<RadialGradient> f7344r;

    /* renamed from: s */
    public final RectF f7345s;

    /* renamed from: t */
    public final GradientType f7346t;

    /* renamed from: u */
    public final int f7347u;

    /* renamed from: v */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f7348v;

    /* renamed from: w */
    public final BaseKeyframeAnimation<PointF, PointF> f7349w;

    /* renamed from: x */
    public final BaseKeyframeAnimation<PointF, PointF> f7350x;

    /* renamed from: y */
    @Nullable
    public ValueCallbackKeyframeAnimation f7351y;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.f7539h.m4742a(), gradientStroke.f7540i.m4743a(), gradientStroke.f7541j, gradientStroke.f7535d, gradientStroke.f7538g, gradientStroke.f7542k, gradientStroke.f7543l);
        this.f7343q = new LongSparseArray<>(10);
        this.f7344r = new LongSparseArray<>(10);
        this.f7345s = new RectF();
        this.f7341o = gradientStroke.f7532a;
        this.f7346t = gradientStroke.f7533b;
        this.f7342p = gradientStroke.f7544m;
        this.f7347u = (int) (lottieDrawable.f7169c.m4647b() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> mo4737j = gradientStroke.f7534c.mo4737j();
        this.f7348v = mo4737j;
        mo4737j.f7410a.add(this);
        baseLayer.m4744e(mo4737j);
        BaseKeyframeAnimation<PointF, PointF> mo4737j2 = gradientStroke.f7536e.mo4737j();
        this.f7349w = mo4737j2;
        mo4737j2.f7410a.add(this);
        baseLayer.m4744e(mo4737j2);
        BaseKeyframeAnimation<PointF, PointF> mo4737j3 = gradientStroke.f7537f.mo4737j();
        this.f7350x = mo4737j3;
        mo4737j3.f7410a.add(this);
        baseLayer.m4744e(mo4737j3);
    }

    /* renamed from: e */
    public final int[] m4699e(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f7351y;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.mo4707e();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient m1094h;
        if (this.f7342p) {
            return;
        }
        mo4691d(this.f7345s, matrix, false);
        if (this.f7346t == GradientType.LINEAR) {
            long m4700h = m4700h();
            m1094h = this.f7343q.m1094h(m4700h);
            if (m1094h == null) {
                PointF mo4707e = this.f7349w.mo4707e();
                PointF mo4707e2 = this.f7350x.mo4707e();
                GradientColor mo4707e3 = this.f7348v.mo4707e();
                m1094h = new LinearGradient(mo4707e.x, mo4707e.y, mo4707e2.x, mo4707e2.y, m4699e(mo4707e3.f7523b), mo4707e3.f7522a, Shader.TileMode.CLAMP);
                this.f7343q.m1098m(m4700h, m1094h);
            }
        } else {
            long m4700h2 = m4700h();
            m1094h = this.f7344r.m1094h(m4700h2);
            if (m1094h == null) {
                PointF mo4707e4 = this.f7349w.mo4707e();
                PointF mo4707e5 = this.f7350x.mo4707e();
                GradientColor mo4707e6 = this.f7348v.mo4707e();
                int[] m4699e = m4699e(mo4707e6.f7523b);
                float[] fArr = mo4707e6.f7522a;
                m1094h = new RadialGradient(mo4707e4.x, mo4707e4.y, (float) Math.hypot(mo4707e5.x - r9, mo4707e5.y - r10), m4699e, fArr, Shader.TileMode.CLAMP);
                this.f7344r.m1098m(m4700h2, m1094h);
            }
        }
        m1094h.setLocalMatrix(matrix);
        this.f7285i.setShader(m1094h);
        super.mo4692f(canvas, matrix, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.mo4693g(t, lottieValueCallback);
        if (t == LottieProperty.f7232D) {
            if (lottieValueCallback == null) {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f7351y;
                if (valueCallbackKeyframeAnimation != null) {
                    this.f7282f.f7647t.remove(valueCallbackKeyframeAnimation);
                }
                this.f7351y = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7351y = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.f7410a.add(this);
            this.f7282f.m4744e(this.f7351y);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7341o;
    }

    /* renamed from: h */
    public final int m4700h() {
        int round = Math.round(this.f7349w.f7413d * this.f7347u);
        int round2 = Math.round(this.f7350x.f7413d * this.f7347u);
        int round3 = Math.round(this.f7348v.f7413d * this.f7347u);
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }
}

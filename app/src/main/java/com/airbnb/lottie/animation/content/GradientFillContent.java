package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    @NonNull
    public final String f7323a;

    /* renamed from: b */
    public final boolean f7324b;

    /* renamed from: c */
    public final BaseLayer f7325c;

    /* renamed from: d */
    public final LongSparseArray<LinearGradient> f7326d = new LongSparseArray<>(10);

    /* renamed from: e */
    public final LongSparseArray<RadialGradient> f7327e = new LongSparseArray<>(10);

    /* renamed from: f */
    public final Path f7328f;

    /* renamed from: g */
    public final Paint f7329g;

    /* renamed from: h */
    public final RectF f7330h;

    /* renamed from: i */
    public final List<PathContent> f7331i;

    /* renamed from: j */
    public final GradientType f7332j;

    /* renamed from: k */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f7333k;

    /* renamed from: l */
    public final BaseKeyframeAnimation<Integer, Integer> f7334l;

    /* renamed from: m */
    public final BaseKeyframeAnimation<PointF, PointF> f7335m;

    /* renamed from: n */
    public final BaseKeyframeAnimation<PointF, PointF> f7336n;

    /* renamed from: o */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7337o;

    /* renamed from: p */
    @Nullable
    public ValueCallbackKeyframeAnimation f7338p;

    /* renamed from: q */
    public final LottieDrawable f7339q;

    /* renamed from: r */
    public final int f7340r;

    public GradientFillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f7328f = path;
        this.f7329g = new LPaint(1);
        this.f7330h = new RectF();
        this.f7331i = new ArrayList();
        this.f7325c = baseLayer;
        this.f7323a = gradientFill.f7530g;
        this.f7324b = gradientFill.f7531h;
        this.f7339q = lottieDrawable;
        this.f7332j = gradientFill.f7524a;
        path.setFillType(gradientFill.f7525b);
        this.f7340r = (int) (lottieDrawable.f7169c.m4647b() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> mo4737j = gradientFill.f7526c.mo4737j();
        this.f7333k = mo4737j;
        mo4737j.f7410a.add(this);
        baseLayer.m4744e(mo4737j);
        BaseKeyframeAnimation<Integer, Integer> mo4737j2 = gradientFill.f7527d.mo4737j();
        this.f7334l = mo4737j2;
        mo4737j2.f7410a.add(this);
        baseLayer.m4744e(mo4737j2);
        BaseKeyframeAnimation<PointF, PointF> mo4737j3 = gradientFill.f7528e.mo4737j();
        this.f7335m = mo4737j3;
        mo4737j3.f7410a.add(this);
        baseLayer.m4744e(mo4737j3);
        BaseKeyframeAnimation<PointF, PointF> mo4737j4 = gradientFill.f7529f.mo4737j();
        this.f7336n = mo4737j4;
        mo4737j4.f7410a.add(this);
        baseLayer.m4744e(mo4737j4);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7339q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Content content = list2.get(i2);
            if (content instanceof PathContent) {
                this.f7331i.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: c */
    public void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m4850g(keyPath, i2, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        this.f7328f.reset();
        for (int i2 = 0; i2 < this.f7331i.size(); i2++) {
            this.f7328f.addPath(this.f7331i.get(i2).mo4696t(), matrix);
        }
        this.f7328f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: e */
    public final int[] m4697e(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f7338p;
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
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient m1094h;
        if (this.f7324b) {
            return;
        }
        this.f7328f.reset();
        for (int i3 = 0; i3 < this.f7331i.size(); i3++) {
            this.f7328f.addPath(this.f7331i.get(i3).mo4696t(), matrix);
        }
        this.f7328f.computeBounds(this.f7330h, false);
        if (this.f7332j == GradientType.LINEAR) {
            long m4698h = m4698h();
            m1094h = this.f7326d.m1094h(m4698h);
            if (m1094h == null) {
                PointF mo4707e = this.f7335m.mo4707e();
                PointF mo4707e2 = this.f7336n.mo4707e();
                GradientColor mo4707e3 = this.f7333k.mo4707e();
                LinearGradient linearGradient = new LinearGradient(mo4707e.x, mo4707e.y, mo4707e2.x, mo4707e2.y, m4697e(mo4707e3.f7523b), mo4707e3.f7522a, Shader.TileMode.CLAMP);
                this.f7326d.m1098m(m4698h, linearGradient);
                m1094h = linearGradient;
            }
        } else {
            long m4698h2 = m4698h();
            m1094h = this.f7327e.m1094h(m4698h2);
            if (m1094h == null) {
                PointF mo4707e4 = this.f7335m.mo4707e();
                PointF mo4707e5 = this.f7336n.mo4707e();
                GradientColor mo4707e6 = this.f7333k.mo4707e();
                int[] m4697e = m4697e(mo4707e6.f7523b);
                float[] fArr = mo4707e6.f7522a;
                float f2 = mo4707e4.x;
                float f3 = mo4707e4.y;
                float hypot = (float) Math.hypot(mo4707e5.x - f2, mo4707e5.y - f3);
                m1094h = new RadialGradient(f2, f3, hypot <= 0.0f ? 0.001f : hypot, m4697e, fArr, Shader.TileMode.CLAMP);
                this.f7327e.m1098m(m4698h2, m1094h);
            }
        }
        m1094h.setLocalMatrix(matrix);
        this.f7329g.setShader(m1094h);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f7337o;
        if (baseKeyframeAnimation != null) {
            this.f7329g.setColorFilter(baseKeyframeAnimation.mo4707e());
        }
        this.f7329g.setAlpha(MiscUtils.m4846c((int) ((((i2 / 255.0f) * this.f7334l.mo4707e().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        canvas.drawPath(this.f7328f, this.f7329g);
        C0720L.m4640a("GradientFillContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f7236d) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7334l;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == 0) {
                this.f7337o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7337o = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f7410a.add(this);
            this.f7325c.m4744e(this.f7337o);
            return;
        }
        if (t == LottieProperty.f7232D) {
            if (lottieValueCallback == 0) {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.f7338p;
                if (valueCallbackKeyframeAnimation2 != null) {
                    this.f7325c.f7647t.remove(valueCallbackKeyframeAnimation2);
                }
                this.f7338p = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7338p = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.f7410a.add(this);
            this.f7325c.m4744e(this.f7338p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7323a;
    }

    /* renamed from: h */
    public final int m4698h() {
        int round = Math.round(this.f7335m.f7413d * this.f7340r);
        int round2 = Math.round(this.f7336n.f7413d * this.f7340r);
        int round3 = Math.round(this.f7333k.f7413d * this.f7340r);
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }
}

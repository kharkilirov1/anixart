package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {

    /* renamed from: e */
    public final LottieDrawable f7281e;

    /* renamed from: f */
    public final BaseLayer f7282f;

    /* renamed from: h */
    public final float[] f7284h;

    /* renamed from: i */
    public final Paint f7285i;

    /* renamed from: j */
    public final BaseKeyframeAnimation<?, Float> f7286j;

    /* renamed from: k */
    public final BaseKeyframeAnimation<?, Integer> f7287k;

    /* renamed from: l */
    public final List<BaseKeyframeAnimation<?, Float>> f7288l;

    /* renamed from: m */
    @Nullable
    public final BaseKeyframeAnimation<?, Float> f7289m;

    /* renamed from: n */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7290n;

    /* renamed from: a */
    public final PathMeasure f7277a = new PathMeasure();

    /* renamed from: b */
    public final Path f7278b = new Path();

    /* renamed from: c */
    public final Path f7279c = new Path();

    /* renamed from: d */
    public final RectF f7280d = new RectF();

    /* renamed from: g */
    public final List<PathGroup> f7283g = new ArrayList();

    public static final class PathGroup {

        /* renamed from: a */
        public final List<PathContent> f7291a = new ArrayList();

        /* renamed from: b */
        @Nullable
        public final TrimPathContent f7292b;

        public PathGroup(TrimPathContent trimPathContent, C07591 c07591) {
            this.f7292b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f2, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f7285i = lPaint;
        this.f7281e = lottieDrawable;
        this.f7282f = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f2);
        this.f7287k = animatableIntegerValue.mo4737j();
        this.f7286j = animatableFloatValue.mo4737j();
        if (animatableFloatValue2 == null) {
            this.f7289m = null;
        } else {
            this.f7289m = animatableFloatValue2.mo4737j();
        }
        this.f7288l = new ArrayList(list.size());
        this.f7284h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7288l.add(list.get(i2).mo4737j());
        }
        baseLayer.m4744e(this.f7287k);
        baseLayer.m4744e(this.f7286j);
        for (int i3 = 0; i3 < this.f7288l.size(); i3++) {
            baseLayer.m4744e(this.f7288l.get(i3));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f7289m;
        if (baseKeyframeAnimation != null) {
            baseLayer.m4744e(baseKeyframeAnimation);
        }
        this.f7287k.f7410a.add(this);
        this.f7286j.f7410a.add(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f7288l.get(i4).f7410a.add(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f7289m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.f7410a.add(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7281e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        ShapeTrimPath.Type type = ShapeTrimPath.Type.INDIVIDUALLY;
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.f7406c == type) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.f7405b.add(this);
        }
        PathGroup pathGroup = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.f7406c == type) {
                    if (pathGroup != null) {
                        this.f7283g.add(pathGroup);
                    }
                    pathGroup = new PathGroup(trimPathContent3, null);
                    trimPathContent3.f7405b.add(this);
                }
            }
            if (content2 instanceof PathContent) {
                if (pathGroup == null) {
                    pathGroup = new PathGroup(trimPathContent, null);
                }
                pathGroup.f7291a.add((PathContent) content2);
            }
        }
        if (pathGroup != null) {
            this.f7283g.add(pathGroup);
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
        this.f7278b.reset();
        for (int i2 = 0; i2 < this.f7283g.size(); i2++) {
            PathGroup pathGroup = this.f7283g.get(i2);
            for (int i3 = 0; i3 < pathGroup.f7291a.size(); i3++) {
                this.f7278b.addPath(pathGroup.f7291a.get(i3).mo4696t(), matrix);
            }
        }
        this.f7278b.computeBounds(this.f7280d, false);
        float m4718i = ((FloatKeyframeAnimation) this.f7286j).m4718i();
        RectF rectF2 = this.f7280d;
        float f2 = m4718i / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f7280d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C0720L.m4640a("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        float[] fArr = Utils.f7850d;
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            C0720L.m4640a("StrokeContent#draw");
            return;
        }
        IntegerKeyframeAnimation integerKeyframeAnimation = (IntegerKeyframeAnimation) this.f7287k;
        float m4720i = (i2 / 255.0f) * integerKeyframeAnimation.m4720i(integerKeyframeAnimation.m4703a(), integerKeyframeAnimation.m4705c());
        float f2 = 100.0f;
        this.f7285i.setAlpha(MiscUtils.m4846c((int) ((m4720i / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        this.f7285i.setStrokeWidth(Utils.m4854d(matrix) * ((FloatKeyframeAnimation) this.f7286j).m4718i());
        if (this.f7285i.getStrokeWidth() <= 0.0f) {
            C0720L.m4640a("StrokeContent#draw");
            return;
        }
        float f3 = 1.0f;
        if (this.f7288l.isEmpty()) {
            C0720L.m4640a("StrokeContent#applyDashPattern");
        } else {
            float m4854d = Utils.m4854d(matrix);
            for (int i3 = 0; i3 < this.f7288l.size(); i3++) {
                this.f7284h[i3] = this.f7288l.get(i3).mo4707e().floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr2 = this.f7284h;
                    if (fArr2[i3] < 1.0f) {
                        fArr2[i3] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f7284h;
                    if (fArr3[i3] < 0.1f) {
                        fArr3[i3] = 0.1f;
                    }
                }
                float[] fArr4 = this.f7284h;
                fArr4[i3] = fArr4[i3] * m4854d;
            }
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f7289m;
            this.f7285i.setPathEffect(new DashPathEffect(this.f7284h, baseKeyframeAnimation == null ? 0.0f : baseKeyframeAnimation.mo4707e().floatValue() * m4854d));
            C0720L.m4640a("StrokeContent#applyDashPattern");
        }
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.f7290n;
        if (baseKeyframeAnimation2 != null) {
            this.f7285i.setColorFilter(baseKeyframeAnimation2.mo4707e());
        }
        int i4 = 0;
        while (i4 < this.f7283g.size()) {
            PathGroup pathGroup = this.f7283g.get(i4);
            TrimPathContent trimPathContent = pathGroup.f7292b;
            if (trimPathContent == null) {
                this.f7278b.reset();
                for (int size = pathGroup.f7291a.size() - 1; size >= 0; size--) {
                    this.f7278b.addPath(pathGroup.f7291a.get(size).mo4696t(), matrix);
                }
                C0720L.m4640a("StrokeContent#buildPath");
                canvas.drawPath(this.f7278b, this.f7285i);
                C0720L.m4640a("StrokeContent#drawPath");
            } else if (trimPathContent == null) {
                C0720L.m4640a("StrokeContent#applyTrimPath");
            } else {
                this.f7278b.reset();
                int size2 = pathGroup.f7291a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        this.f7278b.addPath(pathGroup.f7291a.get(size2).mo4696t(), matrix);
                    }
                }
                this.f7277a.setPath(this.f7278b, z);
                float length = this.f7277a.getLength();
                while (this.f7277a.nextContour()) {
                    length += this.f7277a.getLength();
                }
                float floatValue = (pathGroup.f7292b.f7409f.mo4707e().floatValue() * length) / 360.0f;
                float floatValue2 = ((pathGroup.f7292b.f7407d.mo4707e().floatValue() * length) / f2) + floatValue;
                float floatValue3 = ((pathGroup.f7292b.f7408e.mo4707e().floatValue() * length) / f2) + floatValue;
                int size3 = pathGroup.f7291a.size() - 1;
                float f4 = 0.0f;
                while (size3 >= 0) {
                    this.f7279c.set(pathGroup.f7291a.get(size3).mo4696t());
                    this.f7279c.transform(matrix);
                    this.f7277a.setPath(this.f7279c, z);
                    float length2 = this.f7277a.getLength();
                    if (floatValue3 > length) {
                        float f5 = floatValue3 - length;
                        if (f5 < f4 + length2 && f4 < f5) {
                            Utils.m4851a(this.f7279c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f5 / length2, f3), 0.0f);
                            canvas.drawPath(this.f7279c, this.f7285i);
                            f4 += length2;
                            size3--;
                            z = false;
                            f3 = 1.0f;
                        }
                    }
                    float f6 = f4 + length2;
                    if (f6 >= floatValue2 && f4 <= floatValue3) {
                        if (f6 > floatValue3 || floatValue2 >= f4) {
                            Utils.m4851a(this.f7279c, floatValue2 < f4 ? 0.0f : (floatValue2 - f4) / length2, floatValue3 > f6 ? 1.0f : (floatValue3 - f4) / length2, 0.0f);
                            canvas.drawPath(this.f7279c, this.f7285i);
                        } else {
                            canvas.drawPath(this.f7279c, this.f7285i);
                        }
                    }
                    f4 += length2;
                    size3--;
                    z = false;
                    f3 = 1.0f;
                }
                C0720L.m4640a("StrokeContent#applyTrimPath");
            }
            i4++;
            z = false;
            f2 = 100.0f;
            f3 = 1.0f;
        }
        C0720L.m4640a("StrokeContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f7236d) {
            BaseKeyframeAnimation<?, Integer> baseKeyframeAnimation = this.f7287k;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7247o) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f7286j;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == 0) {
                this.f7290n = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7290n = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f7410a.add(this);
            this.f7282f.m4744e(this.f7290n);
        }
    }
}

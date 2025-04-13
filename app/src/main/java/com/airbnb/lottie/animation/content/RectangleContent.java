package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {

    /* renamed from: c */
    public final String f7375c;

    /* renamed from: d */
    public final boolean f7376d;

    /* renamed from: e */
    public final LottieDrawable f7377e;

    /* renamed from: f */
    public final BaseKeyframeAnimation<?, PointF> f7378f;

    /* renamed from: g */
    public final BaseKeyframeAnimation<?, PointF> f7379g;

    /* renamed from: h */
    public final BaseKeyframeAnimation<?, Float> f7380h;

    /* renamed from: j */
    public boolean f7382j;

    /* renamed from: a */
    public final Path f7373a = new Path();

    /* renamed from: b */
    public final RectF f7374b = new RectF();

    /* renamed from: i */
    public CompoundTrimPathContent f7381i = new CompoundTrimPathContent();

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.f7375c = rectangleShape.f7579a;
        this.f7376d = rectangleShape.f7583e;
        this.f7377e = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> mo4737j = rectangleShape.f7580b.mo4737j();
        this.f7378f = mo4737j;
        BaseKeyframeAnimation<PointF, PointF> mo4737j2 = rectangleShape.f7581c.mo4737j();
        this.f7379g = mo4737j2;
        BaseKeyframeAnimation<Float, Float> mo4737j3 = rectangleShape.f7582d.mo4737j();
        this.f7380h = mo4737j3;
        baseLayer.m4744e(mo4737j);
        baseLayer.m4744e(mo4737j2);
        baseLayer.m4744e(mo4737j3);
        mo4737j.f7410a.add(this);
        mo4737j2.f7410a.add(this);
        mo4737j3.f7410a.add(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7382j = false;
        this.f7377e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f7406c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f7381i.f7293a.add(trimPathContent);
                    trimPathContent.f7405b.add(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: c */
    public void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m4850g(keyPath, i2, list, keyPath2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f7240h) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f7379g;
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7242j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f7378f;
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7241i) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f7380h;
            LottieValueCallback<Float> lottieValueCallback4 = baseKeyframeAnimation3.f7414e;
            baseKeyframeAnimation3.f7414e = lottieValueCallback;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7375c;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        if (this.f7382j) {
            return this.f7373a;
        }
        this.f7373a.reset();
        if (this.f7376d) {
            this.f7382j = true;
            return this.f7373a;
        }
        PointF mo4707e = this.f7379g.mo4707e();
        float f2 = mo4707e.x / 2.0f;
        float f3 = mo4707e.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f7380h;
        float m4718i = baseKeyframeAnimation == null ? 0.0f : ((FloatKeyframeAnimation) baseKeyframeAnimation).m4718i();
        float min = Math.min(f2, f3);
        if (m4718i > min) {
            m4718i = min;
        }
        PointF mo4707e2 = this.f7378f.mo4707e();
        this.f7373a.moveTo(mo4707e2.x + f2, (mo4707e2.y - f3) + m4718i);
        this.f7373a.lineTo(mo4707e2.x + f2, (mo4707e2.y + f3) - m4718i);
        if (m4718i > 0.0f) {
            RectF rectF = this.f7374b;
            float f4 = mo4707e2.x;
            float f5 = m4718i * 2.0f;
            float f6 = mo4707e2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f7373a.arcTo(this.f7374b, 0.0f, 90.0f, false);
        }
        this.f7373a.lineTo((mo4707e2.x - f2) + m4718i, mo4707e2.y + f3);
        if (m4718i > 0.0f) {
            RectF rectF2 = this.f7374b;
            float f7 = mo4707e2.x;
            float f8 = mo4707e2.y;
            float f9 = m4718i * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f7373a.arcTo(this.f7374b, 90.0f, 90.0f, false);
        }
        this.f7373a.lineTo(mo4707e2.x - f2, (mo4707e2.y - f3) + m4718i);
        if (m4718i > 0.0f) {
            RectF rectF3 = this.f7374b;
            float f10 = mo4707e2.x;
            float f11 = mo4707e2.y;
            float f12 = m4718i * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f7373a.arcTo(this.f7374b, 180.0f, 90.0f, false);
        }
        this.f7373a.lineTo((mo4707e2.x + f2) - m4718i, mo4707e2.y - f3);
        if (m4718i > 0.0f) {
            RectF rectF4 = this.f7374b;
            float f13 = mo4707e2.x;
            float f14 = m4718i * 2.0f;
            float f15 = mo4707e2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f7373a.arcTo(this.f7374b, 270.0f, 90.0f, false);
        }
        this.f7373a.close();
        this.f7381i.m4694a(this.f7373a);
        this.f7382j = true;
        return this.f7373a;
    }
}

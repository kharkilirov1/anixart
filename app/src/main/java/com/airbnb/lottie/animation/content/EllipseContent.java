package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class EllipseContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: b */
    public final String f7306b;

    /* renamed from: c */
    public final LottieDrawable f7307c;

    /* renamed from: d */
    public final BaseKeyframeAnimation<?, PointF> f7308d;

    /* renamed from: e */
    public final BaseKeyframeAnimation<?, PointF> f7309e;

    /* renamed from: f */
    public final CircleShape f7310f;

    /* renamed from: h */
    public boolean f7312h;

    /* renamed from: a */
    public final Path f7305a = new Path();

    /* renamed from: g */
    public CompoundTrimPathContent f7311g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.f7306b = circleShape.f7517a;
        this.f7307c = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> mo4737j = circleShape.f7519c.mo4737j();
        this.f7308d = mo4737j;
        BaseKeyframeAnimation<PointF, PointF> mo4737j2 = circleShape.f7518b.mo4737j();
        this.f7309e = mo4737j2;
        this.f7310f = circleShape;
        baseLayer.m4744e(mo4737j);
        baseLayer.m4744e(mo4737j2);
        mo4737j.f7410a.add(this);
        mo4737j2.f7410a.add(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7312h = false;
        this.f7307c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f7406c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f7311g.f7293a.add(trimPathContent);
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
        if (t == LottieProperty.f7239g) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f7308d;
            LottieValueCallback<PointF> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7242j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f7309e;
            LottieValueCallback<PointF> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7306b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        if (this.f7312h) {
            return this.f7305a;
        }
        this.f7305a.reset();
        if (this.f7310f.f7521e) {
            this.f7312h = true;
            return this.f7305a;
        }
        PointF mo4707e = this.f7308d.mo4707e();
        float f2 = mo4707e.x / 2.0f;
        float f3 = mo4707e.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f7305a.reset();
        if (this.f7310f.f7520d) {
            float f6 = -f3;
            this.f7305a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f7305a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f7305a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f7305a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f7305a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f7305a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f7305a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f7305a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f7305a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f7305a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF mo4707e2 = this.f7309e.mo4707e();
        this.f7305a.offset(mo4707e2.x, mo4707e2.y);
        this.f7305a.close();
        this.f7311g.m4694a(this.f7305a);
        this.f7312h = true;
        return this.f7305a;
    }
}

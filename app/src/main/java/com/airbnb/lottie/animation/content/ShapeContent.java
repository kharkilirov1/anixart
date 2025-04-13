package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeContent implements PathContent, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: b */
    public final boolean f7394b;

    /* renamed from: c */
    public final LottieDrawable f7395c;

    /* renamed from: d */
    public final BaseKeyframeAnimation<?, Path> f7396d;

    /* renamed from: e */
    public boolean f7397e;

    /* renamed from: a */
    public final Path f7393a = new Path();

    /* renamed from: f */
    public CompoundTrimPathContent f7398f = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.f7394b = shapePath.f7604d;
        this.f7395c = lottieDrawable;
        BaseKeyframeAnimation<ShapeData, Path> mo4737j = shapePath.f7603c.mo4737j();
        this.f7396d = mo4737j;
        baseLayer.m4744e(mo4737j);
        mo4737j.f7410a.add(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7397e = false;
        this.f7395c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f7406c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f7398f.f7293a.add(trimPathContent);
                    trimPathContent.f7405b.add(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        if (this.f7397e) {
            return this.f7393a;
        }
        this.f7393a.reset();
        if (this.f7394b) {
            this.f7397e = true;
            return this.f7393a;
        }
        this.f7393a.set(this.f7396d.mo4707e());
        this.f7393a.setFillType(Path.FillType.EVEN_ODD);
        this.f7398f.m4694a(this.f7393a);
        this.f7397e = true;
        return this.f7393a;
    }
}

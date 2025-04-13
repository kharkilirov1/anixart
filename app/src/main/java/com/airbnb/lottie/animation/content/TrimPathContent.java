package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a */
    public final boolean f7404a;

    /* renamed from: b */
    public final List<BaseKeyframeAnimation.AnimationListener> f7405b = new ArrayList();

    /* renamed from: c */
    public final ShapeTrimPath.Type f7406c;

    /* renamed from: d */
    public final BaseKeyframeAnimation<?, Float> f7407d;

    /* renamed from: e */
    public final BaseKeyframeAnimation<?, Float> f7408e;

    /* renamed from: f */
    public final BaseKeyframeAnimation<?, Float> f7409f;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.f7404a = shapeTrimPath.f7624f;
        this.f7406c = shapeTrimPath.f7620b;
        BaseKeyframeAnimation<Float, Float> mo4737j = shapeTrimPath.f7621c.mo4737j();
        this.f7407d = mo4737j;
        BaseKeyframeAnimation<Float, Float> mo4737j2 = shapeTrimPath.f7622d.mo4737j();
        this.f7408e = mo4737j2;
        BaseKeyframeAnimation<Float, Float> mo4737j3 = shapeTrimPath.f7623e.mo4737j();
        this.f7409f = mo4737j3;
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
        for (int i2 = 0; i2 < this.f7405b.size(); i2++) {
            this.f7405b.get(i2).mo4688a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
    }
}

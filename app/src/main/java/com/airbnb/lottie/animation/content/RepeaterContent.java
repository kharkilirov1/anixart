package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class RepeaterContent implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final Matrix f7383a = new Matrix();

    /* renamed from: b */
    public final Path f7384b = new Path();

    /* renamed from: c */
    public final LottieDrawable f7385c;

    /* renamed from: d */
    public final BaseLayer f7386d;

    /* renamed from: e */
    public final String f7387e;

    /* renamed from: f */
    public final boolean f7388f;

    /* renamed from: g */
    public final BaseKeyframeAnimation<Float, Float> f7389g;

    /* renamed from: h */
    public final BaseKeyframeAnimation<Float, Float> f7390h;

    /* renamed from: i */
    public final TransformKeyframeAnimation f7391i;

    /* renamed from: j */
    public ContentGroup f7392j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.f7385c = lottieDrawable;
        this.f7386d = baseLayer;
        this.f7387e = repeater.f7584a;
        this.f7388f = repeater.f7588e;
        BaseKeyframeAnimation<Float, Float> mo4737j = repeater.f7585b.mo4737j();
        this.f7389g = mo4737j;
        baseLayer.m4744e(mo4737j);
        mo4737j.f7410a.add(this);
        BaseKeyframeAnimation<Float, Float> mo4737j2 = repeater.f7586c.mo4737j();
        this.f7390h = mo4737j2;
        baseLayer.m4744e(mo4737j2);
        mo4737j2.f7410a.add(this);
        AnimatableTransform animatableTransform = repeater.f7587d;
        Objects.requireNonNull(animatableTransform);
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f7391i = transformKeyframeAnimation;
        transformKeyframeAnimation.m4722a(baseLayer);
        transformKeyframeAnimation.m4723b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7385c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        this.f7392j.mo4689b(list, list2);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: c */
    public void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.m4850g(keyPath, i2, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        this.f7392j.mo4691d(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    /* renamed from: e */
    public void mo4701e(ListIterator<Content> listIterator) {
        if (this.f7392j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f7392j = new ContentGroup(this.f7385c, this.f7386d, "Repeater", this.f7388f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.f7389g.mo4707e().floatValue();
        float floatValue2 = this.f7390h.mo4707e().floatValue();
        float floatValue3 = this.f7391i.f7453m.mo4707e().floatValue() / 100.0f;
        float floatValue4 = this.f7391i.f7454n.mo4707e().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.f7383a.set(matrix);
            float f2 = i3;
            this.f7383a.preConcat(this.f7391i.m4727f(f2 + floatValue2));
            this.f7392j.mo4692f(canvas, this.f7383a, (int) (MiscUtils.m4848e(floatValue3, floatValue4, f2 / floatValue) * i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (this.f7391i.m4724c(t, lottieValueCallback)) {
            return;
        }
        if (t == LottieProperty.f7249q) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f7389g;
            LottieValueCallback<Float> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7250r) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f7390h;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7387e;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        Path mo4696t = this.f7392j.mo4696t();
        this.f7384b.reset();
        float floatValue = this.f7389g.mo4707e().floatValue();
        float floatValue2 = this.f7390h.mo4707e().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f7383a.set(this.f7391i.m4727f(i2 + floatValue2));
            this.f7384b.addPath(mo4696t, this.f7383a);
        }
        return this.f7384b;
    }
}

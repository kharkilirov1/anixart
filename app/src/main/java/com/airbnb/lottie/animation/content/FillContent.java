package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    public final Path f7313a;

    /* renamed from: b */
    public final Paint f7314b;

    /* renamed from: c */
    public final BaseLayer f7315c;

    /* renamed from: d */
    public final String f7316d;

    /* renamed from: e */
    public final boolean f7317e;

    /* renamed from: f */
    public final List<PathContent> f7318f;

    /* renamed from: g */
    public final BaseKeyframeAnimation<Integer, Integer> f7319g;

    /* renamed from: h */
    public final BaseKeyframeAnimation<Integer, Integer> f7320h;

    /* renamed from: i */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7321i;

    /* renamed from: j */
    public final LottieDrawable f7322j;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path = new Path();
        this.f7313a = path;
        this.f7314b = new LPaint(1);
        this.f7318f = new ArrayList();
        this.f7315c = baseLayer;
        this.f7316d = shapeFill.f7594c;
        this.f7317e = shapeFill.f7597f;
        this.f7322j = lottieDrawable;
        if (shapeFill.f7595d == null || shapeFill.f7596e == null) {
            this.f7319g = null;
            this.f7320h = null;
            return;
        }
        path.setFillType(shapeFill.f7593b);
        BaseKeyframeAnimation<Integer, Integer> mo4737j = shapeFill.f7595d.mo4737j();
        this.f7319g = mo4737j;
        mo4737j.f7410a.add(this);
        baseLayer.m4744e(mo4737j);
        BaseKeyframeAnimation<Integer, Integer> mo4737j2 = shapeFill.f7596e.mo4737j();
        this.f7320h = mo4737j2;
        mo4737j2.f7410a.add(this);
        baseLayer.m4744e(mo4737j2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7322j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Content content = list2.get(i2);
            if (content instanceof PathContent) {
                this.f7318f.add((PathContent) content);
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
        this.f7313a.reset();
        for (int i2 = 0; i2 < this.f7318f.size(); i2++) {
            this.f7313a.addPath(this.f7318f.get(i2).mo4696t(), matrix);
        }
        this.f7313a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        if (this.f7317e) {
            return;
        }
        Paint paint = this.f7314b;
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) this.f7319g;
        paint.setColor(colorKeyframeAnimation.m4717i(colorKeyframeAnimation.m4703a(), colorKeyframeAnimation.m4705c()));
        this.f7314b.setAlpha(MiscUtils.m4846c((int) ((((i2 / 255.0f) * this.f7320h.mo4707e().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f7321i;
        if (baseKeyframeAnimation != null) {
            this.f7314b.setColorFilter(baseKeyframeAnimation.mo4707e());
        }
        this.f7313a.reset();
        for (int i3 = 0; i3 < this.f7318f.size(); i3++) {
            this.f7313a.addPath(this.f7318f.get(i3).mo4696t(), matrix);
        }
        canvas.drawPath(this.f7313a, this.f7314b);
        C0720L.m4640a("FillContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.f7233a) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7319g;
            LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7236d) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f7320h;
            LottieValueCallback<Integer> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == 0) {
                this.f7321i = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7321i = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f7410a.add(this);
            this.f7315c.m4744e(this.f7321i);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7316d;
    }
}

package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.PerformanceTracker;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.MeanCalculator;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* renamed from: a */
    public final Path f7628a = new Path();

    /* renamed from: b */
    public final Matrix f7629b = new Matrix();

    /* renamed from: c */
    public final Paint f7630c = new LPaint(1);

    /* renamed from: d */
    public final Paint f7631d = new LPaint(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    public final Paint f7632e = new LPaint(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    public final Paint f7633f;

    /* renamed from: g */
    public final Paint f7634g;

    /* renamed from: h */
    public final RectF f7635h;

    /* renamed from: i */
    public final RectF f7636i;

    /* renamed from: j */
    public final RectF f7637j;

    /* renamed from: k */
    public final RectF f7638k;

    /* renamed from: l */
    public final String f7639l;

    /* renamed from: m */
    public final Matrix f7640m;

    /* renamed from: n */
    public final LottieDrawable f7641n;

    /* renamed from: o */
    public final Layer f7642o;

    /* renamed from: p */
    @Nullable
    public MaskKeyframeAnimation f7643p;

    /* renamed from: q */
    @Nullable
    public BaseLayer f7644q;

    /* renamed from: r */
    @Nullable
    public BaseLayer f7645r;

    /* renamed from: s */
    public List<BaseLayer> f7646s;

    /* renamed from: t */
    public final List<BaseKeyframeAnimation<?, ?>> f7647t;

    /* renamed from: u */
    public final TransformKeyframeAnimation f7648u;

    /* renamed from: v */
    public boolean f7649v;

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$2 */
    public static /* synthetic */ class C07652 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7652a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7653b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f7653b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7653b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7653b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7653b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f7652a = iArr2;
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7652a[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7652a[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7652a[2] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7652a[3] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7652a[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7652a[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        LPaint lPaint = new LPaint(1);
        this.f7633f = lPaint;
        this.f7634g = new LPaint(PorterDuff.Mode.CLEAR);
        this.f7635h = new RectF();
        this.f7636i = new RectF();
        this.f7637j = new RectF();
        this.f7638k = new RectF();
        this.f7640m = new Matrix();
        this.f7647t = new ArrayList();
        this.f7649v = true;
        this.f7641n = lottieDrawable;
        this.f7642o = layer;
        this.f7639l = C0000a.m20q(new StringBuilder(), layer.f7666c, "#draw");
        if (layer.f7684u == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        AnimatableTransform animatableTransform = layer.f7672i;
        Objects.requireNonNull(animatableTransform);
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f7648u = transformKeyframeAnimation;
        transformKeyframeAnimation.m4723b(this);
        List<Mask> list = layer.f7671h;
        if (list != null && !list.isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.f7671h);
            this.f7643p = maskKeyframeAnimation;
            Iterator<BaseKeyframeAnimation<ShapeData, Path>> it = maskKeyframeAnimation.f7425a.iterator();
            while (it.hasNext()) {
                it.next().f7410a.add(this);
            }
            for (BaseKeyframeAnimation<?, ?> baseKeyframeAnimation : this.f7643p.f7426b) {
                m4744e(baseKeyframeAnimation);
                baseKeyframeAnimation.f7410a.add(this);
            }
        }
        if (this.f7642o.f7683t.isEmpty()) {
            m4753p(true);
            return;
        }
        final FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.f7642o.f7683t);
        floatKeyframeAnimation.f7411b = true;
        floatKeyframeAnimation.f7410a.add(new BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.model.layer.BaseLayer.1
            @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
            /* renamed from: a */
            public void mo4688a() {
                BaseLayer baseLayer = BaseLayer.this;
                boolean z = floatKeyframeAnimation.m4718i() == 1.0f;
                if (z != baseLayer.f7649v) {
                    baseLayer.f7649v = z;
                    baseLayer.f7641n.invalidateSelf();
                }
            }
        });
        m4753p(floatKeyframeAnimation.mo4707e().floatValue() == 1.0f);
        m4744e(floatKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7641n.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: c */
    public void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        if (keyPath.m4734e(this.f7642o.f7666c, i2)) {
            if (!"__container".equals(this.f7642o.f7666c)) {
                keyPath2 = keyPath2.m4730a(this.f7642o.f7666c);
                if (keyPath.m4732c(this.f7642o.f7666c, i2)) {
                    list.add(keyPath2.m4736g(this));
                }
            }
            if (keyPath.m4735f(this.f7642o.f7666c, i2)) {
                mo4751n(keyPath, keyPath.m4733d(this.f7642o.f7666c, i2) + i2, list, keyPath2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        this.f7635h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m4745h();
        this.f7640m.set(matrix);
        if (z) {
            List<BaseLayer> list = this.f7646s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f7640m.preConcat(this.f7646s.get(size).f7648u.m4726e());
                }
            } else {
                BaseLayer baseLayer = this.f7645r;
                if (baseLayer != null) {
                    this.f7640m.preConcat(baseLayer.f7648u.m4726e());
                }
            }
        }
        this.f7640m.preConcat(this.f7648u.m4726e());
    }

    /* renamed from: e */
    public void m4744e(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.f7647t.add(baseKeyframeAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ae A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4692f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.BaseLayer.mo4692f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f7648u.m4724c(t, lottieValueCallback);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7642o.f7666c;
    }

    /* renamed from: h */
    public final void m4745h() {
        if (this.f7646s != null) {
            return;
        }
        if (this.f7645r == null) {
            this.f7646s = Collections.emptyList();
            return;
        }
        this.f7646s = new ArrayList();
        for (BaseLayer baseLayer = this.f7645r; baseLayer != null; baseLayer = baseLayer.f7645r) {
            this.f7646s.add(baseLayer);
        }
    }

    /* renamed from: i */
    public final void m4746i(Canvas canvas) {
        RectF rectF = this.f7635h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7634g);
        C0720L.m4640a("Layer#clearLayer");
    }

    /* renamed from: j */
    public abstract void mo4747j(Canvas canvas, Matrix matrix, int i2);

    /* renamed from: k */
    public boolean m4748k() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.f7643p;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.f7425a.isEmpty()) ? false : true;
    }

    /* renamed from: l */
    public boolean m4749l() {
        return this.f7644q != null;
    }

    /* renamed from: m */
    public final void m4750m(float f2) {
        PerformanceTracker performanceTracker = this.f7641n.f7169c.f7139a;
        String str = this.f7642o.f7666c;
        if (performanceTracker.f7268a) {
            MeanCalculator meanCalculator = performanceTracker.f7270c.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                performanceTracker.f7270c.put(str, meanCalculator);
            }
            float f3 = meanCalculator.f7844a + f2;
            meanCalculator.f7844a = f3;
            int i2 = meanCalculator.f7845b + 1;
            meanCalculator.f7845b = i2;
            if (i2 == Integer.MAX_VALUE) {
                meanCalculator.f7844a = f3 / 2.0f;
                meanCalculator.f7845b = i2 / 2;
            }
            if (str.equals("__container")) {
                Iterator<PerformanceTracker.FrameListener> it = performanceTracker.f7269b.iterator();
                while (it.hasNext()) {
                    it.next().m4687a(f2);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo4751n(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
    }

    /* renamed from: o */
    public void mo4752o(@FloatRange float f2) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f7648u;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = transformKeyframeAnimation.f7450j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.mo4710h(f2);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = transformKeyframeAnimation.f7453m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo4710h(f2);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = transformKeyframeAnimation.f7454n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.mo4710h(f2);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = transformKeyframeAnimation.f7446f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.mo4710h(f2);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = transformKeyframeAnimation.f7447g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.mo4710h(f2);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = transformKeyframeAnimation.f7448h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.mo4710h(f2);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = transformKeyframeAnimation.f7449i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.mo4710h(f2);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = transformKeyframeAnimation.f7451k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.mo4710h(f2);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = transformKeyframeAnimation.f7452l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.mo4710h(f2);
        }
        if (this.f7643p != null) {
            for (int i2 = 0; i2 < this.f7643p.f7425a.size(); i2++) {
                this.f7643p.f7425a.get(i2).mo4710h(f2);
            }
        }
        float f3 = this.f7642o.f7676m;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        BaseLayer baseLayer = this.f7644q;
        if (baseLayer != null) {
            baseLayer.mo4752o(baseLayer.f7642o.f7676m * f2);
        }
        for (int i3 = 0; i3 < this.f7647t.size(); i3++) {
            this.f7647t.get(i3).mo4710h(f2);
        }
    }

    /* renamed from: p */
    public final void m4753p(boolean z) {
        if (z != this.f7649v) {
            this.f7649v = z;
            this.f7641n.invalidateSelf();
        }
    }
}

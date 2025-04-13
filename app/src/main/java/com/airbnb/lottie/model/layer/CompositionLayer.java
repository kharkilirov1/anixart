package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class CompositionLayer extends BaseLayer {

    /* renamed from: A */
    public Paint f7654A;

    /* renamed from: w */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f7655w;

    /* renamed from: x */
    public final List<BaseLayer> f7656x;

    /* renamed from: y */
    public final RectF f7657y;

    /* renamed from: z */
    public final RectF f7658z;

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$1 */
    public static /* synthetic */ class C07661 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7659a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f7659a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7659a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        int i2;
        BaseLayer baseLayer;
        BaseLayer compositionLayer;
        this.f7656x = new ArrayList();
        this.f7657y = new RectF();
        this.f7658z = new RectF();
        this.f7654A = new Paint();
        AnimatableFloatValue animatableFloatValue = layer.f7682s;
        if (animatableFloatValue != null) {
            BaseKeyframeAnimation<Float, Float> mo4737j = animatableFloatValue.mo4737j();
            this.f7655w = mo4737j;
            m4744e(mo4737j);
            this.f7655w.f7410a.add(this);
        } else {
            this.f7655w = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.f7147i.size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int ordinal = layer2.f7668e.ordinal();
            if (ordinal == 0) {
                compositionLayer = new CompositionLayer(lottieDrawable, layer2, lottieComposition.f7141c.get(layer2.f7670g), lottieComposition);
            } else if (ordinal == 1) {
                compositionLayer = new SolidLayer(lottieDrawable, layer2);
            } else if (ordinal == 2) {
                compositionLayer = new ImageLayer(lottieDrawable, layer2);
            } else if (ordinal == 3) {
                compositionLayer = new NullLayer(lottieDrawable, layer2);
            } else if (ordinal == 4) {
                compositionLayer = new ShapeLayer(lottieDrawable, layer2);
            } else if (ordinal != 5) {
                StringBuilder m24u = C0000a.m24u("Unknown layer type ");
                m24u.append(layer2.f7668e);
                Logger.m4833a(m24u.toString());
                compositionLayer = null;
            } else {
                compositionLayer = new TextLayer(lottieDrawable, layer2);
            }
            if (compositionLayer != null) {
                longSparseArray.m1098m(compositionLayer.f7642o.f7667d, compositionLayer);
                if (baseLayer2 != null) {
                    baseLayer2.f7644q = compositionLayer;
                    baseLayer2 = null;
                } else {
                    this.f7656x.add(0, compositionLayer);
                    int ordinal2 = layer2.f7684u.ordinal();
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        baseLayer2 = compositionLayer;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < longSparseArray.m1100o(); i2++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.m1094h(longSparseArray.m1097l(i2));
            if (baseLayer3 != null && (baseLayer = (BaseLayer) longSparseArray.m1094h(baseLayer3.f7642o.f7669f)) != null) {
                baseLayer3.f7645r = baseLayer;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        super.mo4691d(rectF, matrix, z);
        for (int size = this.f7656x.size() - 1; size >= 0; size--) {
            this.f7657y.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f7656x.get(size).mo4691d(this.f7657y, this.f7640m, true);
            rectF.union(this.f7657y);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f7648u.m4724c(t, lottieValueCallback);
        if (t == LottieProperty.f7229A) {
            if (lottieValueCallback == null) {
                this.f7655w = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7655w = valueCallbackKeyframeAnimation;
            m4744e(valueCallbackKeyframeAnimation);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: j */
    public void mo4747j(Canvas canvas, Matrix matrix, int i2) {
        RectF rectF = this.f7658z;
        Layer layer = this.f7642o;
        rectF.set(0.0f, 0.0f, layer.f7678o, layer.f7679p);
        matrix.mapRect(this.f7658z);
        boolean z = this.f7641n.f7186t && this.f7656x.size() > 1 && i2 != 255;
        if (z) {
            this.f7654A.setAlpha(i2);
            Utils.m4856f(canvas, this.f7658z, this.f7654A, 31);
        } else {
            canvas.save();
        }
        if (z) {
            i2 = KotlinVersion.MAX_COMPONENT_VALUE;
        }
        for (int size = this.f7656x.size() - 1; size >= 0; size--) {
            if (!this.f7658z.isEmpty() ? canvas.clipRect(this.f7658z) : true) {
                this.f7656x.get(size).mo4692f(canvas, matrix, i2);
            }
        }
        canvas.restore();
        C0720L.m4640a("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: n */
    public void mo4751n(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        for (int i3 = 0; i3 < this.f7656x.size(); i3++) {
            this.f7656x.get(i3).mo4690c(keyPath, i2, list, keyPath2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: o */
    public void mo4752o(@FloatRange float f2) {
        super.mo4752o(f2);
        if (this.f7655w != null) {
            f2 = ((this.f7655w.mo4707e().floatValue() * this.f7642o.f7665b.f7151m) - this.f7642o.f7665b.f7149k) / (this.f7641n.f7169c.m4648c() + 0.01f);
        }
        Layer layer = this.f7642o;
        float f3 = layer.f7676m;
        if (f3 != 0.0f) {
            f2 /= f3;
        }
        if (this.f7655w == null) {
            f2 -= layer.f7677n / layer.f7665b.m4648c();
        }
        int size = this.f7656x.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f7656x.get(size).mo4752o(f2);
            }
        }
    }
}

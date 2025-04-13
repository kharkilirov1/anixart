package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: b */
    public final String f7359b;

    /* renamed from: c */
    public final LottieDrawable f7360c;

    /* renamed from: d */
    public final PolystarShape.Type f7361d;

    /* renamed from: e */
    public final boolean f7362e;

    /* renamed from: f */
    public final BaseKeyframeAnimation<?, Float> f7363f;

    /* renamed from: g */
    public final BaseKeyframeAnimation<?, PointF> f7364g;

    /* renamed from: h */
    public final BaseKeyframeAnimation<?, Float> f7365h;

    /* renamed from: i */
    @Nullable
    public final BaseKeyframeAnimation<?, Float> f7366i;

    /* renamed from: j */
    public final BaseKeyframeAnimation<?, Float> f7367j;

    /* renamed from: k */
    @Nullable
    public final BaseKeyframeAnimation<?, Float> f7368k;

    /* renamed from: l */
    public final BaseKeyframeAnimation<?, Float> f7369l;

    /* renamed from: n */
    public boolean f7371n;

    /* renamed from: a */
    public final Path f7358a = new Path();

    /* renamed from: m */
    public CompoundTrimPathContent f7370m = new CompoundTrimPathContent();

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1 */
    public static /* synthetic */ class C07611 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7372a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f7372a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7372a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.f7360c = lottieDrawable;
        this.f7359b = polystarShape.f7566a;
        PolystarShape.Type type = polystarShape.f7567b;
        this.f7361d = type;
        this.f7362e = polystarShape.f7575j;
        BaseKeyframeAnimation<Float, Float> mo4737j = polystarShape.f7568c.mo4737j();
        this.f7363f = mo4737j;
        BaseKeyframeAnimation<PointF, PointF> mo4737j2 = polystarShape.f7569d.mo4737j();
        this.f7364g = mo4737j2;
        BaseKeyframeAnimation<Float, Float> mo4737j3 = polystarShape.f7570e.mo4737j();
        this.f7365h = mo4737j3;
        BaseKeyframeAnimation<Float, Float> mo4737j4 = polystarShape.f7572g.mo4737j();
        this.f7367j = mo4737j4;
        BaseKeyframeAnimation<Float, Float> mo4737j5 = polystarShape.f7574i.mo4737j();
        this.f7369l = mo4737j5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f7366i = polystarShape.f7571f.mo4737j();
            this.f7368k = polystarShape.f7573h.mo4737j();
        } else {
            this.f7366i = null;
            this.f7368k = null;
        }
        baseLayer.m4744e(mo4737j);
        baseLayer.m4744e(mo4737j2);
        baseLayer.m4744e(mo4737j3);
        baseLayer.m4744e(mo4737j4);
        baseLayer.m4744e(mo4737j5);
        if (type == type2) {
            baseLayer.m4744e(this.f7366i);
            baseLayer.m4744e(this.f7368k);
        }
        mo4737j.f7410a.add(this);
        mo4737j2.f7410a.add(this);
        mo4737j3.f7410a.add(this);
        mo4737j4.f7410a.add(this);
        mo4737j5.f7410a.add(this);
        if (type == type2) {
            this.f7366i.f7410a.add(this);
            this.f7368k.f7410a.add(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7371n = false;
        this.f7360c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f7406c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f7370m.f7293a.add(trimPathContent);
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
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.f7251s) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f7363f;
            LottieValueCallback<Float> lottieValueCallback2 = baseKeyframeAnimation3.f7414e;
            baseKeyframeAnimation3.f7414e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f7252t) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation4 = this.f7365h;
            LottieValueCallback<Float> lottieValueCallback3 = baseKeyframeAnimation4.f7414e;
            baseKeyframeAnimation4.f7414e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f7242j) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f7364g;
            LottieValueCallback<PointF> lottieValueCallback4 = baseKeyframeAnimation5.f7414e;
            baseKeyframeAnimation5.f7414e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f7253u && (baseKeyframeAnimation2 = this.f7366i) != null) {
            LottieValueCallback<Float> lottieValueCallback5 = baseKeyframeAnimation2.f7414e;
            baseKeyframeAnimation2.f7414e = lottieValueCallback;
            return;
        }
        if (t == LottieProperty.f7254v) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation6 = this.f7367j;
            LottieValueCallback<Float> lottieValueCallback6 = baseKeyframeAnimation6.f7414e;
            baseKeyframeAnimation6.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7255w && (baseKeyframeAnimation = this.f7368k) != null) {
            LottieValueCallback<Float> lottieValueCallback7 = baseKeyframeAnimation.f7414e;
            baseKeyframeAnimation.f7414e = lottieValueCallback;
        } else if (t == LottieProperty.f7256x) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation7 = this.f7369l;
            LottieValueCallback<Float> lottieValueCallback8 = baseKeyframeAnimation7.f7414e;
            baseKeyframeAnimation7.f7414e = lottieValueCallback;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7359b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        float f2;
        float f3;
        float sin;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        double d3;
        double d4;
        double d5;
        if (this.f7371n) {
            return this.f7358a;
        }
        this.f7358a.reset();
        if (this.f7362e) {
            this.f7371n = true;
            return this.f7358a;
        }
        int ordinal = this.f7361d.ordinal();
        if (ordinal == 0) {
            float floatValue = this.f7363f.mo4707e().floatValue();
            double radians = Math.toRadians((this.f7365h != null ? r2.mo4707e().floatValue() : 0.0d) - 90.0d);
            double d6 = floatValue;
            float f12 = (float) (6.283185307179586d / d6);
            float f13 = f12 / 2.0f;
            float f14 = floatValue - ((int) floatValue);
            if (f14 != 0.0f) {
                radians += (1.0f - f14) * f13;
            }
            float floatValue2 = this.f7367j.mo4707e().floatValue();
            float floatValue3 = this.f7366i.mo4707e().floatValue();
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f7368k;
            float floatValue4 = baseKeyframeAnimation != null ? baseKeyframeAnimation.mo4707e().floatValue() / 100.0f : 0.0f;
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f7369l;
            float floatValue5 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.mo4707e().floatValue() / 100.0f : 0.0f;
            if (f14 != 0.0f) {
                f5 = C0000a.m4a(floatValue2, floatValue3, f14, floatValue3);
                double d7 = f5;
                f2 = floatValue3;
                f3 = floatValue4;
                f4 = (float) (Math.cos(radians) * d7);
                sin = (float) (d7 * Math.sin(radians));
                this.f7358a.moveTo(f4, sin);
                d = radians + ((f12 * f14) / 2.0f);
            } else {
                f2 = floatValue3;
                f3 = floatValue4;
                double d8 = floatValue2;
                float cos = (float) (Math.cos(radians) * d8);
                sin = (float) (Math.sin(radians) * d8);
                this.f7358a.moveTo(cos, sin);
                d = radians + f13;
                f4 = cos;
                f5 = 0.0f;
            }
            double ceil = Math.ceil(d6) * 2.0d;
            int i2 = 0;
            boolean z = false;
            while (true) {
                double d9 = i2;
                if (d9 >= ceil) {
                    break;
                }
                float f15 = z ? floatValue2 : f2;
                if (f5 == 0.0f || d9 != ceil - 2.0d) {
                    f6 = f12;
                    f7 = f13;
                } else {
                    f6 = f12;
                    f7 = (f12 * f14) / 2.0f;
                }
                if (f5 == 0.0f || d9 != ceil - 1.0d) {
                    f8 = f5;
                    f5 = f15;
                    f9 = f7;
                } else {
                    f9 = f7;
                    f8 = f5;
                }
                double d10 = f5;
                float cos2 = (float) (Math.cos(d) * d10);
                float sin2 = (float) (d10 * Math.sin(d));
                if (f3 == 0.0f && floatValue5 == 0.0f) {
                    this.f7358a.lineTo(cos2, sin2);
                    f10 = sin2;
                    d2 = d;
                    f11 = floatValue5;
                } else {
                    d2 = d;
                    float f16 = sin;
                    double atan2 = (float) (Math.atan2(sin, f4) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f10 = sin2;
                    f11 = floatValue5;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f17 = z ? f3 : f11;
                    float f18 = z ? f11 : f3;
                    float f19 = (z ? f2 : floatValue2) * f17 * 0.47829f;
                    float f20 = cos3 * f19;
                    float f21 = f19 * sin3;
                    float f22 = (z ? floatValue2 : f2) * f18 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin4;
                    if (f14 != 0.0f) {
                        if (i2 == 0) {
                            f20 *= f14;
                            f21 *= f14;
                        } else if (d9 == ceil - 1.0d) {
                            f23 *= f14;
                            f24 *= f14;
                        }
                    }
                    this.f7358a.cubicTo(f4 - f20, f16 - f21, cos2 + f23, f10 + f24, cos2, f10);
                }
                d = d2 + f9;
                z = !z;
                i2++;
                f4 = cos2;
                f5 = f8;
                f12 = f6;
                sin = f10;
                floatValue5 = f11;
            }
            PointF mo4707e = this.f7364g.mo4707e();
            this.f7358a.offset(mo4707e.x, mo4707e.y);
            this.f7358a.close();
        } else if (ordinal == 1) {
            int floor = (int) Math.floor(this.f7363f.mo4707e().floatValue());
            double radians2 = Math.toRadians((this.f7365h != null ? r2.mo4707e().floatValue() : 0.0d) - 90.0d);
            double d11 = floor;
            float floatValue6 = this.f7369l.mo4707e().floatValue() / 100.0f;
            float floatValue7 = this.f7367j.mo4707e().floatValue();
            double d12 = floatValue7;
            float cos5 = (float) (Math.cos(radians2) * d12);
            float sin5 = (float) (Math.sin(radians2) * d12);
            this.f7358a.moveTo(cos5, sin5);
            double d13 = (float) (6.283185307179586d / d11);
            double d14 = radians2 + d13;
            double ceil2 = Math.ceil(d11);
            int i3 = 0;
            while (i3 < ceil2) {
                float cos6 = (float) (Math.cos(d14) * d12);
                double d15 = ceil2;
                float sin6 = (float) (Math.sin(d14) * d12);
                if (floatValue6 != 0.0f) {
                    d4 = d12;
                    d3 = d14;
                    double atan23 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    d5 = d13;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float f25 = floatValue7 * floatValue6 * 0.25f;
                    this.f7358a.cubicTo(cos5 - (cos7 * f25), sin5 - (sin7 * f25), cos6 + (((float) Math.cos(atan24)) * f25), sin6 + (f25 * ((float) Math.sin(atan24))), cos6, sin6);
                } else {
                    d3 = d14;
                    d4 = d12;
                    d5 = d13;
                    this.f7358a.lineTo(cos6, sin6);
                }
                d14 = d3 + d5;
                i3++;
                sin5 = sin6;
                cos5 = cos6;
                ceil2 = d15;
                d12 = d4;
                d13 = d5;
            }
            PointF mo4707e2 = this.f7364g.mo4707e();
            this.f7358a.offset(mo4707e2.x, mo4707e2.y);
            this.f7358a.close();
        }
        this.f7358a.close();
        this.f7370m.m4694a(this.f7358a);
        this.f7371n = true;
        return this.f7358a;
    }
}

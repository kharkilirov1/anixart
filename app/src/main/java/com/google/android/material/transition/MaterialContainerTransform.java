package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.TransitionUtils;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MaterialContainerTransform extends Transition {

    /* renamed from: K */
    public static final String[] f19372K = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: L */
    public static final ProgressThresholdsGroup f19373L = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: M */
    public static final ProgressThresholdsGroup f19374M = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: N */
    public static final ProgressThresholdsGroup f19375N = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: O */
    public static final ProgressThresholdsGroup f19376O = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);

    /* renamed from: C */
    public boolean f19377C = false;

    /* renamed from: D */
    @IdRes
    public int f19378D = R.id.content;

    /* renamed from: E */
    @IdRes
    public int f19379E = -1;

    /* renamed from: F */
    @IdRes
    public int f19380F = -1;

    /* renamed from: G */
    @ColorInt
    public int f19381G = 1375731712;

    /* renamed from: H */
    public boolean f19382H;

    /* renamed from: I */
    public float f19383I;

    /* renamed from: J */
    public float f19384J;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        /* renamed from: a */
        @FloatRange
        public final float f19391a;

        /* renamed from: b */
        @FloatRange
        public final float f19392b;

        public ProgressThresholds(@FloatRange float f2, @FloatRange float f3) {
            this.f19391a = f2;
            this.f19392b = f3;
        }
    }

    public static class ProgressThresholdsGroup {

        /* renamed from: a */
        @NonNull
        public final ProgressThresholds f19393a;

        /* renamed from: b */
        @NonNull
        public final ProgressThresholds f19394b;

        /* renamed from: c */
        @NonNull
        public final ProgressThresholds f19395c;

        /* renamed from: d */
        @NonNull
        public final ProgressThresholds f19396d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C14591 c14591) {
            this.f19393a = progressThresholds;
            this.f19394b = progressThresholds2;
            this.f19395c = progressThresholds3;
            this.f19396d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TransitionDirection {
    }

    public static final class TransitionDrawable extends Drawable {

        /* renamed from: A */
        public final ProgressThresholdsGroup f19397A;

        /* renamed from: B */
        public final FadeModeEvaluator f19398B;

        /* renamed from: C */
        public final FitModeEvaluator f19399C;

        /* renamed from: D */
        public final boolean f19400D;

        /* renamed from: E */
        public final Paint f19401E;

        /* renamed from: F */
        public final Path f19402F;

        /* renamed from: G */
        public FadeModeResult f19403G;

        /* renamed from: H */
        public FitModeResult f19404H;

        /* renamed from: I */
        public RectF f19405I;

        /* renamed from: J */
        public float f19406J;

        /* renamed from: K */
        public float f19407K;

        /* renamed from: L */
        public float f19408L;

        /* renamed from: a */
        public final View f19409a;

        /* renamed from: b */
        public final RectF f19410b;

        /* renamed from: c */
        public final ShapeAppearanceModel f19411c;

        /* renamed from: d */
        public final float f19412d;

        /* renamed from: e */
        public final View f19413e;

        /* renamed from: f */
        public final RectF f19414f;

        /* renamed from: g */
        public final ShapeAppearanceModel f19415g;

        /* renamed from: h */
        public final float f19416h;

        /* renamed from: i */
        public final Paint f19417i;

        /* renamed from: j */
        public final Paint f19418j;

        /* renamed from: k */
        public final Paint f19419k;

        /* renamed from: l */
        public final Paint f19420l;

        /* renamed from: m */
        public final Paint f19421m;

        /* renamed from: n */
        public final MaskEvaluator f19422n;

        /* renamed from: o */
        public final PathMeasure f19423o;

        /* renamed from: p */
        public final float f19424p;

        /* renamed from: q */
        public final float[] f19425q;

        /* renamed from: r */
        public final boolean f19426r;

        /* renamed from: s */
        public final float f19427s;

        /* renamed from: t */
        public final float f19428t;

        /* renamed from: u */
        public final boolean f19429u;

        /* renamed from: v */
        public final MaterialShapeDrawable f19430v;

        /* renamed from: w */
        public final RectF f19431w;

        /* renamed from: x */
        public final RectF f19432x;

        /* renamed from: y */
        public final RectF f19433y;

        /* renamed from: z */
        public final RectF f19434z;

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f2, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f3, int i2, int i3, int i4, int i5, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3, C14591 c14591) {
            Paint paint = new Paint();
            this.f19417i = paint;
            Paint paint2 = new Paint();
            this.f19418j = paint2;
            Paint paint3 = new Paint();
            this.f19419k = paint3;
            this.f19420l = new Paint();
            Paint paint4 = new Paint();
            this.f19421m = paint4;
            this.f19422n = new MaskEvaluator();
            this.f19425q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f19430v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f19401E = paint5;
            this.f19402F = new Path();
            this.f19409a = view;
            this.f19410b = rectF;
            this.f19411c = shapeAppearanceModel;
            this.f19412d = f2;
            this.f19413e = view2;
            this.f19414f = rectF2;
            this.f19415g = shapeAppearanceModel2;
            this.f19416h = f3;
            this.f19426r = z;
            this.f19429u = z2;
            this.f19398B = fadeModeEvaluator;
            this.f19399C = fitModeEvaluator;
            this.f19397A = progressThresholdsGroup;
            this.f19400D = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f19427s = r12.widthPixels;
            this.f19428t = r12.heightPixels;
            paint.setColor(i2);
            paint2.setColor(i3);
            paint3.setColor(i4);
            materialShapeDrawable.m10301x(ColorStateList.valueOf(0));
            materialShapeDrawable.m10271C(2);
            materialShapeDrawable.f18655x = false;
            materialShapeDrawable.m10269A(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f19431w = rectF3;
            this.f19432x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f19433y = rectF4;
            this.f19434z = new RectF(rectF4);
            PointF m10587c = m10587c(rectF);
            PointF m10587c2 = m10587c(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.mo4184a(m10587c.x, m10587c.y, m10587c2.x, m10587c2.y), false);
            this.f19423o = pathMeasure;
            this.f19424p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f19453a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i5, i5, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m10591e(0.0f);
        }

        /* renamed from: c */
        public static PointF m10587c(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: a */
        public final void m10588a(Canvas canvas) {
            m10590d(canvas, this.f19419k);
            Rect bounds = getBounds();
            RectF rectF = this.f19433y;
            TransitionUtils.m10606h(canvas, bounds, rectF.left, rectF.top, this.f19404H.f19362b, this.f19403G.f19342b, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
                /* renamed from: a */
                public void mo10592a(Canvas canvas2) {
                    TransitionDrawable.this.f19413e.draw(canvas2);
                }
            });
        }

        /* renamed from: b */
        public final void m10589b(Canvas canvas) {
            m10590d(canvas, this.f19418j);
            Rect bounds = getBounds();
            RectF rectF = this.f19431w;
            TransitionUtils.m10606h(canvas, bounds, rectF.left, rectF.top, this.f19404H.f19361a, this.f19403G.f19341a, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
                /* renamed from: a */
                public void mo10592a(Canvas canvas2) {
                    TransitionDrawable.this.f19409a.draw(canvas2);
                }
            });
        }

        /* renamed from: d */
        public final void m10590d(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f19421m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f19421m);
            }
            int save = this.f19400D ? canvas.save() : -1;
            if (this.f19429u && this.f19406J > 0.0f) {
                canvas.save();
                canvas.clipPath(this.f19422n.f19367a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = this.f19422n.f19371e;
                    if (shapeAppearanceModel.m10316f(this.f19405I)) {
                        float mo10265a = shapeAppearanceModel.f18688e.mo10265a(this.f19405I);
                        canvas.drawRoundRect(this.f19405I, mo10265a, mo10265a, this.f19420l);
                    } else {
                        canvas.drawPath(this.f19422n.f19367a, this.f19420l);
                    }
                } else {
                    MaterialShapeDrawable materialShapeDrawable = this.f19430v;
                    RectF rectF = this.f19405I;
                    materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.f19430v.m10300w(this.f19406J);
                    this.f19430v.m10272D((int) this.f19407K);
                    this.f19430v.setShapeAppearanceModel(this.f19422n.f19371e);
                    this.f19430v.draw(canvas);
                }
                canvas.restore();
            }
            MaskEvaluator maskEvaluator = this.f19422n;
            if (Build.VERSION.SDK_INT >= 23) {
                canvas.clipPath(maskEvaluator.f19367a);
            } else {
                canvas.clipPath(maskEvaluator.f19368b);
                canvas.clipPath(maskEvaluator.f19369c, Region.Op.UNION);
            }
            m10590d(canvas, this.f19417i);
            if (this.f19403G.f19343c) {
                m10589b(canvas);
                m10588a(canvas);
            } else {
                m10588a(canvas);
                m10589b(canvas);
            }
            if (this.f19400D) {
                canvas.restoreToCount(save);
                RectF rectF2 = this.f19431w;
                Path path = this.f19402F;
                PointF m10587c = m10587c(rectF2);
                if (this.f19408L == 0.0f) {
                    path.reset();
                    path.moveTo(m10587c.x, m10587c.y);
                } else {
                    path.lineTo(m10587c.x, m10587c.y);
                    this.f19401E.setColor(-65281);
                    canvas.drawPath(path, this.f19401E);
                }
                RectF rectF3 = this.f19432x;
                this.f19401E.setColor(-256);
                canvas.drawRect(rectF3, this.f19401E);
                RectF rectF4 = this.f19431w;
                this.f19401E.setColor(-16711936);
                canvas.drawRect(rectF4, this.f19401E);
                RectF rectF5 = this.f19434z;
                this.f19401E.setColor(-16711681);
                canvas.drawRect(rectF5, this.f19401E);
                RectF rectF6 = this.f19433y;
                this.f19401E.setColor(-16776961);
                canvas.drawRect(rectF6, this.f19401E);
            }
        }

        /* renamed from: e */
        public final void m10591e(float f2) {
            float f3;
            float f4;
            this.f19408L = f2;
            this.f19421m.setAlpha((int) (this.f19426r ? TransitionUtils.m10601c(0.0f, 255.0f, f2) : TransitionUtils.m10601c(255.0f, 0.0f, f2)));
            this.f19423o.getPosTan(this.f19424p * f2, this.f19425q, null);
            float[] fArr = this.f19425q;
            float f5 = fArr[0];
            float f6 = fArr[1];
            if (f2 > 1.0f || f2 < 0.0f) {
                if (f2 > 1.0f) {
                    f3 = 0.99f;
                    f4 = (f2 - 1.0f) / 0.00999999f;
                } else {
                    f3 = 0.01f;
                    f4 = (f2 / 0.01f) * (-1.0f);
                }
                this.f19423o.getPosTan(this.f19424p * f3, fArr, null);
                float[] fArr2 = this.f19425q;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                f5 = C0000a.m4a(f5, f7, f4, f5);
                f6 = C0000a.m4a(f6, f8, f4, f6);
            }
            float f9 = f5;
            float f10 = f6;
            Float valueOf = Float.valueOf(this.f19397A.f19394b.f19391a);
            Objects.requireNonNull(valueOf);
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.f19397A.f19394b.f19392b);
            Objects.requireNonNull(valueOf2);
            FitModeResult mo10582a = this.f19399C.mo10582a(f2, floatValue, valueOf2.floatValue(), this.f19410b.width(), this.f19410b.height(), this.f19414f.width(), this.f19414f.height());
            this.f19404H = mo10582a;
            RectF rectF = this.f19431w;
            float f11 = mo10582a.f19363c / 2.0f;
            rectF.set(f9 - f11, f10, f11 + f9, mo10582a.f19364d + f10);
            RectF rectF2 = this.f19433y;
            FitModeResult fitModeResult = this.f19404H;
            float f12 = fitModeResult.f19365e / 2.0f;
            rectF2.set(f9 - f12, f10, f12 + f9, fitModeResult.f19366f + f10);
            this.f19432x.set(this.f19431w);
            this.f19434z.set(this.f19433y);
            Float valueOf3 = Float.valueOf(this.f19397A.f19395c.f19391a);
            Objects.requireNonNull(valueOf3);
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.f19397A.f19395c.f19392b);
            Objects.requireNonNull(valueOf4);
            float floatValue3 = valueOf4.floatValue();
            boolean mo10583b = this.f19399C.mo10583b(this.f19404H);
            RectF rectF3 = mo10583b ? this.f19432x : this.f19434z;
            float m10602d = TransitionUtils.m10602d(0.0f, 1.0f, floatValue2, floatValue3, f2);
            if (!mo10583b) {
                m10602d = 1.0f - m10602d;
            }
            this.f19399C.mo10584c(rectF3, m10602d, this.f19404H);
            this.f19405I = new RectF(Math.min(this.f19432x.left, this.f19434z.left), Math.min(this.f19432x.top, this.f19434z.top), Math.max(this.f19432x.right, this.f19434z.right), Math.max(this.f19432x.bottom, this.f19434z.bottom));
            MaskEvaluator maskEvaluator = this.f19422n;
            ShapeAppearanceModel shapeAppearanceModel = this.f19411c;
            ShapeAppearanceModel shapeAppearanceModel2 = this.f19415g;
            RectF rectF4 = this.f19431w;
            RectF rectF5 = this.f19432x;
            RectF rectF6 = this.f19434z;
            ProgressThresholds progressThresholds = this.f19397A.f19396d;
            Objects.requireNonNull(maskEvaluator);
            float f13 = progressThresholds.f19391a;
            float f14 = progressThresholds.f19392b;
            RectF rectF7 = TransitionUtils.f19453a;
            if (f2 >= f13) {
                if (f2 > f14) {
                    shapeAppearanceModel = shapeAppearanceModel2;
                } else {
                    TransitionUtils.C14661 c14661 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1

                        /* renamed from: a */
                        public final /* synthetic */ RectF f19454a;

                        /* renamed from: b */
                        public final /* synthetic */ RectF f19455b;

                        /* renamed from: c */
                        public final /* synthetic */ float f19456c;

                        /* renamed from: d */
                        public final /* synthetic */ float f19457d;

                        /* renamed from: e */
                        public final /* synthetic */ float f19458e;

                        public C14661(RectF rectF42, RectF rectF62, float f132, float f142, float f22) {
                            r1 = rectF42;
                            r2 = rectF62;
                            r3 = f132;
                            r4 = f142;
                            r5 = f22;
                        }

                        @NonNull
                        /* renamed from: a */
                        public CornerSize m10607a(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                            return new AbsoluteCornerSize(TransitionUtils.m10602d(cornerSize.mo10265a(r1), cornerSize2.mo10265a(r2), r3, r4, r5));
                        }
                    };
                    ShapeAppearanceModel shapeAppearanceModel3 = (shapeAppearanceModel.f18688e.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18688e.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18689f.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18689f.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18690g.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18690g.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18691h.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18691h.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 ? shapeAppearanceModel : shapeAppearanceModel2;
                    Objects.requireNonNull(shapeAppearanceModel3);
                    ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel3);
                    builder.f18700e = c14661.m10607a(shapeAppearanceModel.f18688e, shapeAppearanceModel2.f18688e);
                    builder.f18701f = c14661.m10607a(shapeAppearanceModel.f18689f, shapeAppearanceModel2.f18689f);
                    builder.f18703h = c14661.m10607a(shapeAppearanceModel.f18691h, shapeAppearanceModel2.f18691h);
                    builder.f18702g = c14661.m10607a(shapeAppearanceModel.f18690g, shapeAppearanceModel2.f18690g);
                    shapeAppearanceModel = builder.m10320a();
                }
            }
            maskEvaluator.f19371e = shapeAppearanceModel;
            maskEvaluator.f19370d.m10327a(shapeAppearanceModel, 1.0f, rectF5, maskEvaluator.f19368b);
            maskEvaluator.f19370d.m10327a(maskEvaluator.f19371e, 1.0f, rectF62, maskEvaluator.f19369c);
            if (Build.VERSION.SDK_INT >= 23) {
                maskEvaluator.f19367a.op(maskEvaluator.f19368b, maskEvaluator.f19369c, Path.Op.UNION);
            }
            this.f19406J = TransitionUtils.m10601c(this.f19412d, this.f19416h, f22);
            float centerX = ((this.f19405I.centerX() / (this.f19427s / 2.0f)) - 1.0f) * 0.3f;
            float centerY = (this.f19405I.centerY() / this.f19428t) * 1.5f;
            float f15 = this.f19406J;
            float f16 = (int) (centerY * f15);
            this.f19407K = f16;
            this.f19420l.setShadowLayer(f15, (int) (centerX * f15), f16, 754974720);
            Float valueOf5 = Float.valueOf(this.f19397A.f19393a.f19391a);
            Objects.requireNonNull(valueOf5);
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.f19397A.f19393a.f19392b);
            Objects.requireNonNull(valueOf6);
            this.f19403G = this.f19398B.mo10576a(f22, floatValue4, valueOf6.floatValue(), 0.35f);
            if (this.f19418j.getColor() != 0) {
                this.f19418j.setAlpha(this.f19403G.f19341a);
            }
            if (this.f19419k.getColor() != 0) {
                this.f19419k.setAlpha(this.f19403G.f19342b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public MaterialContainerTransform() {
        this.f19382H = Build.VERSION.SDK_INT >= 28;
        this.f19383I = -1.0f;
        this.f19384J = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static void m10585O(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i2, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        RectF m10600b;
        ShapeAppearanceModel m10320a;
        if (i2 != -1) {
            View view2 = transitionValues.f6318b;
            RectF rectF = TransitionUtils.f19453a;
            View findViewById = view2.findViewById(i2);
            if (findViewById == null) {
                findViewById = TransitionUtils.m10599a(view2, i2);
            }
            transitionValues.f6318b = findViewById;
        } else if (transitionValues.f6318b.getTag(C2507R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view3 = (View) transitionValues.f6318b.getTag(C2507R.id.mtrl_motion_snapshot_view);
            transitionValues.f6318b.setTag(C2507R.id.mtrl_motion_snapshot_view, null);
            transitionValues.f6318b = view3;
        }
        View view4 = transitionValues.f6318b;
        if (!ViewCompat.m2174N(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        if (view4.getParent() == null) {
            RectF rectF2 = TransitionUtils.f19453a;
            m10600b = new RectF(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
        } else {
            m10600b = TransitionUtils.m10600b(view4);
        }
        transitionValues.f6317a.put("materialContainerTransition:bounds", m10600b);
        Map<String, Object> map = transitionValues.f6317a;
        if (view4.getTag(C2507R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            m10320a = (ShapeAppearanceModel) view4.getTag(C2507R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view4.getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C2507R.attr.transitionShapeAppearance});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            m10320a = resourceId != -1 ? ShapeAppearanceModel.m10311a(context, resourceId, 0).m10320a() : view4 instanceof Shapeable ? ((Shapeable) view4).getShapeAppearanceModel() : new ShapeAppearanceModel.Builder().m10320a();
        }
        RectF rectF3 = TransitionUtils.f19453a;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(m10320a);
        builder.f18700e = RelativeCornerSize.m10310b(m10600b, m10320a.f18688e);
        builder.f18701f = RelativeCornerSize.m10310b(m10600b, m10320a.f18689f);
        builder.f18703h = RelativeCornerSize.m10310b(m10600b, m10320a.f18691h);
        builder.f18702g = RelativeCornerSize.m10310b(m10600b, m10320a.f18690g);
        map.put("materialContainerTransition:shapeAppearance", builder.m10320a());
    }

    @Override // androidx.transition.Transition
    /* renamed from: J */
    public void mo4232J(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f6288y = Transition.f6262A;
        } else {
            this.f6288y = pathMotion;
        }
        this.f19377C = true;
    }

    /* renamed from: P */
    public final ProgressThresholdsGroup m10586P(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        ProgressThresholds progressThresholds = progressThresholdsGroup.f19393a;
        RectF rectF = TransitionUtils.f19453a;
        return new ProgressThresholdsGroup(progressThresholds, progressThresholdsGroup.f19394b, progressThresholdsGroup.f19395c, progressThresholdsGroup.f19396d, null);
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m10585O(transitionValues, null, this.f19380F, null);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m10585O(transitionValues, null, this.f19379E, null);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View m10599a;
        View view;
        RectF rectF;
        PathMotion pathMotion = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF2 = (RectF) transitionValues.f6317a.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.f6317a.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && shapeAppearanceModel != null) {
                RectF rectF3 = (RectF) transitionValues2.f6317a.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.f6317a.get("materialContainerTransition:shapeAppearance");
                if (rectF3 == null || shapeAppearanceModel2 == null) {
                    Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = transitionValues.f6318b;
                final View view3 = transitionValues2.f6318b;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f19378D == view4.getId()) {
                    m10599a = (View) view4.getParent();
                    view = view4;
                } else {
                    m10599a = TransitionUtils.m10599a(view4, this.f19378D);
                    view = null;
                }
                RectF m10600b = TransitionUtils.m10600b(m10599a);
                float f2 = -m10600b.left;
                float f3 = -m10600b.top;
                if (view != null) {
                    rectF = TransitionUtils.m10600b(view);
                    rectF.offset(f2, f3);
                } else {
                    rectF = new RectF(0.0f, 0.0f, m10599a.getWidth(), m10599a.getHeight());
                }
                rectF2.offset(f2, f3);
                rectF3.offset(f2, f3);
                RectF rectF4 = TransitionUtils.f19453a;
                boolean z = true;
                boolean z2 = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                Context context = view4.getContext();
                TimeInterpolator timeInterpolator = AnimationUtils.f17343b;
                if (this.f6268e == null) {
                    this.f6268e = MotionUtils.m10185d(context, C2507R.attr.motionEasingEmphasizedInterpolator, timeInterpolator);
                }
                TransitionUtils.m10605g(this, context, z2 ? C2507R.attr.motionDurationLong2 : C2507R.attr.motionDurationMedium4);
                if (!this.f19377C) {
                    TypedValue typedValue = new TypedValue();
                    if (context.getTheme().resolveAttribute(C2507R.attr.motionPath, typedValue, true)) {
                        int i2 = typedValue.type;
                        if (i2 == 16) {
                            int i3 = typedValue.data;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    throw new IllegalArgumentException(C0000a.m7d("Invalid motion path type: ", i3));
                                }
                                pathMotion = new MaterialArcMotion();
                            }
                        } else {
                            if (i2 != 3) {
                                throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                            }
                            pathMotion = new PatternPathMotion(PathParser.m1789d(String.valueOf(typedValue.string)));
                        }
                    }
                    if (pathMotion != null) {
                        mo4232J(pathMotion);
                    }
                }
                PathMotion pathMotion2 = this.f6288y;
                float f4 = this.f19383I;
                if (f4 == -1.0f) {
                    f4 = ViewCompat.m2221r(view2);
                }
                float f5 = f4;
                float f6 = this.f19384J;
                if (f6 == -1.0f) {
                    f6 = ViewCompat.m2221r(view3);
                }
                float f7 = f6;
                int i4 = this.f19381G;
                boolean z3 = this.f19382H;
                FadeModeEvaluator fadeModeEvaluator = z2 ? FadeModeEvaluators.f19337a : FadeModeEvaluators.f19338b;
                float width = rectF2.width();
                float height = rectF2.height();
                float width2 = rectF3.width();
                float height2 = rectF3.height();
                float f8 = (height2 * width) / width2;
                float f9 = (width2 * height) / width;
                if (!z2 ? f9 < height2 : f8 < height) {
                    z = false;
                }
                FitModeEvaluator fitModeEvaluator = z ? FitModeEvaluators.f19359a : FitModeEvaluators.f19360b;
                PathMotion pathMotion3 = this.f6288y;
                final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion2, view2, rectF2, shapeAppearanceModel, f5, view3, rectF3, shapeAppearanceModel2, f7, 0, 0, 0, i4, z2, z3, fadeModeEvaluator, fitModeEvaluator, ((pathMotion3 instanceof ArcMotion) || (pathMotion3 instanceof MaterialArcMotion)) ? m10586P(z2, f19375N, f19376O) : m10586P(z2, f19373L, f19374M), false, null);
                transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TransitionDrawable transitionDrawable2 = transitionDrawable;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (transitionDrawable2.f19408L != animatedFraction) {
                            transitionDrawable2.m10591e(animatedFraction);
                        }
                    }
                });
                final View view5 = m10599a;
                mo4237a(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    /* renamed from: a */
                    public void mo4211a(@NonNull Transition transition) {
                        ViewUtils.m10168e(view5).mo10162a(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }

                    @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    /* renamed from: c */
                    public void mo4192c(@NonNull Transition transition) {
                        MaterialContainerTransform.this.mo4255z(this);
                        Objects.requireNonNull(MaterialContainerTransform.this);
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        ViewUtils.m10168e(view5).mo10163b(transitionDrawable);
                    }
                });
                return ofFloat;
            }
            Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: t */
    public String[] mo4190t() {
        return f19372K;
    }
}

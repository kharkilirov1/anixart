package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
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
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.platform.TransitionUtils;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

@RequiresApi
/* loaded from: classes.dex */
public final class MaterialContainerTransform extends Transition {

    /* renamed from: k */
    public static final String[] f19494k = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: l */
    public static final ProgressThresholdsGroup f19495l = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f), null);

    /* renamed from: m */
    public static final ProgressThresholdsGroup f19496m = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f), null);

    /* renamed from: n */
    public static final ProgressThresholdsGroup f19497n = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f), null);

    /* renamed from: o */
    public static final ProgressThresholdsGroup f19498o = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f), null);

    /* renamed from: b */
    public boolean f19499b = false;

    /* renamed from: c */
    public boolean f19500c = false;

    /* renamed from: d */
    @IdRes
    public int f19501d = R.id.content;

    /* renamed from: e */
    @IdRes
    public int f19502e = -1;

    /* renamed from: f */
    @IdRes
    public int f19503f = -1;

    /* renamed from: g */
    @ColorInt
    public int f19504g = 1375731712;

    /* renamed from: h */
    public boolean f19505h;

    /* renamed from: i */
    public float f19506i;

    /* renamed from: j */
    public float f19507j;

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
        public final float f19514a;

        /* renamed from: b */
        @FloatRange
        public final float f19515b;

        public ProgressThresholds(@FloatRange float f2, @FloatRange float f3) {
            this.f19514a = f2;
            this.f19515b = f3;
        }
    }

    public static class ProgressThresholdsGroup {

        /* renamed from: a */
        @NonNull
        public final ProgressThresholds f19516a;

        /* renamed from: b */
        @NonNull
        public final ProgressThresholds f19517b;

        /* renamed from: c */
        @NonNull
        public final ProgressThresholds f19518c;

        /* renamed from: d */
        @NonNull
        public final ProgressThresholds f19519d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, C14771 c14771) {
            this.f19516a = progressThresholds;
            this.f19517b = progressThresholds2;
            this.f19518c = progressThresholds3;
            this.f19519d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TransitionDirection {
    }

    public static final class TransitionDrawable extends Drawable {

        /* renamed from: A */
        public final ProgressThresholdsGroup f19520A;

        /* renamed from: B */
        public final FadeModeEvaluator f19521B;

        /* renamed from: C */
        public final FitModeEvaluator f19522C;

        /* renamed from: D */
        public final boolean f19523D;

        /* renamed from: E */
        public final Paint f19524E;

        /* renamed from: F */
        public final Path f19525F;

        /* renamed from: G */
        public FadeModeResult f19526G;

        /* renamed from: H */
        public FitModeResult f19527H;

        /* renamed from: I */
        public RectF f19528I;

        /* renamed from: J */
        public float f19529J;

        /* renamed from: K */
        public float f19530K;

        /* renamed from: L */
        public float f19531L;

        /* renamed from: a */
        public final View f19532a;

        /* renamed from: b */
        public final RectF f19533b;

        /* renamed from: c */
        public final ShapeAppearanceModel f19534c;

        /* renamed from: d */
        public final float f19535d;

        /* renamed from: e */
        public final View f19536e;

        /* renamed from: f */
        public final RectF f19537f;

        /* renamed from: g */
        public final ShapeAppearanceModel f19538g;

        /* renamed from: h */
        public final float f19539h;

        /* renamed from: i */
        public final Paint f19540i;

        /* renamed from: j */
        public final Paint f19541j;

        /* renamed from: k */
        public final Paint f19542k;

        /* renamed from: l */
        public final Paint f19543l;

        /* renamed from: m */
        public final Paint f19544m;

        /* renamed from: n */
        public final MaskEvaluator f19545n;

        /* renamed from: o */
        public final PathMeasure f19546o;

        /* renamed from: p */
        public final float f19547p;

        /* renamed from: q */
        public final float[] f19548q;

        /* renamed from: r */
        public final boolean f19549r;

        /* renamed from: s */
        public final float f19550s;

        /* renamed from: t */
        public final float f19551t;

        /* renamed from: u */
        public final boolean f19552u;

        /* renamed from: v */
        public final MaterialShapeDrawable f19553v;

        /* renamed from: w */
        public final RectF f19554w;

        /* renamed from: x */
        public final RectF f19555x;

        /* renamed from: y */
        public final RectF f19556y;

        /* renamed from: z */
        public final RectF f19557z;

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f2, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f3, int i2, int i3, int i4, int i5, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3, C14771 c14771) {
            Paint paint = new Paint();
            this.f19540i = paint;
            Paint paint2 = new Paint();
            this.f19541j = paint2;
            Paint paint3 = new Paint();
            this.f19542k = paint3;
            this.f19543l = new Paint();
            Paint paint4 = new Paint();
            this.f19544m = paint4;
            this.f19545n = new MaskEvaluator();
            this.f19548q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f19553v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f19524E = paint5;
            this.f19525F = new Path();
            this.f19532a = view;
            this.f19533b = rectF;
            this.f19534c = shapeAppearanceModel;
            this.f19535d = f2;
            this.f19536e = view2;
            this.f19537f = rectF2;
            this.f19538g = shapeAppearanceModel2;
            this.f19539h = f3;
            this.f19549r = z;
            this.f19552u = z2;
            this.f19521B = fadeModeEvaluator;
            this.f19522C = fitModeEvaluator;
            this.f19520A = progressThresholdsGroup;
            this.f19523D = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f19550s = r12.widthPixels;
            this.f19551t = r12.heightPixels;
            paint.setColor(i2);
            paint2.setColor(i3);
            paint3.setColor(i4);
            materialShapeDrawable.m10301x(ColorStateList.valueOf(0));
            materialShapeDrawable.m10271C(2);
            materialShapeDrawable.f18655x = false;
            materialShapeDrawable.m10269A(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f19554w = rectF3;
            this.f19555x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f19556y = rectF4;
            this.f19557z = new RectF(rectF4);
            PointF m10619c = m10619c(rectF);
            PointF m10619c2 = m10619c(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m10619c.x, m10619c.y, m10619c2.x, m10619c2.y), false);
            this.f19546o = pathMeasure;
            this.f19547p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f19584a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i5, i5, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m10623e(0.0f);
        }

        /* renamed from: c */
        public static PointF m10619c(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: a */
        public final void m10620a(Canvas canvas) {
            m10622d(canvas, this.f19542k);
            Rect bounds = getBounds();
            RectF rectF = this.f19556y;
            TransitionUtils.m10641i(canvas, bounds, rectF.left, rectF.top, this.f19527H.f19484b, this.f19526G.f19464b, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                /* renamed from: a */
                public void mo10624a(Canvas canvas2) {
                    TransitionDrawable.this.f19536e.draw(canvas2);
                }
            });
        }

        /* renamed from: b */
        public final void m10621b(Canvas canvas) {
            m10622d(canvas, this.f19541j);
            Rect bounds = getBounds();
            RectF rectF = this.f19554w;
            TransitionUtils.m10641i(canvas, bounds, rectF.left, rectF.top, this.f19527H.f19483a, this.f19526G.f19463a, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                /* renamed from: a */
                public void mo10624a(Canvas canvas2) {
                    TransitionDrawable.this.f19532a.draw(canvas2);
                }
            });
        }

        /* renamed from: d */
        public final void m10622d(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f19544m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f19544m);
            }
            int save = this.f19523D ? canvas.save() : -1;
            if (this.f19552u && this.f19529J > 0.0f) {
                canvas.save();
                canvas.clipPath(this.f19545n.f19489a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = this.f19545n.f19493e;
                    if (shapeAppearanceModel.m10316f(this.f19528I)) {
                        float mo10265a = shapeAppearanceModel.f18688e.mo10265a(this.f19528I);
                        canvas.drawRoundRect(this.f19528I, mo10265a, mo10265a, this.f19543l);
                    } else {
                        canvas.drawPath(this.f19545n.f19489a, this.f19543l);
                    }
                } else {
                    MaterialShapeDrawable materialShapeDrawable = this.f19553v;
                    RectF rectF = this.f19528I;
                    materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.f19553v.m10300w(this.f19529J);
                    this.f19553v.m10272D((int) this.f19530K);
                    this.f19553v.setShapeAppearanceModel(this.f19545n.f19493e);
                    this.f19553v.draw(canvas);
                }
                canvas.restore();
            }
            MaskEvaluator maskEvaluator = this.f19545n;
            if (Build.VERSION.SDK_INT >= 23) {
                canvas.clipPath(maskEvaluator.f19489a);
            } else {
                canvas.clipPath(maskEvaluator.f19490b);
                canvas.clipPath(maskEvaluator.f19491c, Region.Op.UNION);
            }
            m10622d(canvas, this.f19540i);
            if (this.f19526G.f19465c) {
                m10621b(canvas);
                m10620a(canvas);
            } else {
                m10620a(canvas);
                m10621b(canvas);
            }
            if (this.f19523D) {
                canvas.restoreToCount(save);
                RectF rectF2 = this.f19554w;
                Path path = this.f19525F;
                PointF m10619c = m10619c(rectF2);
                if (this.f19531L == 0.0f) {
                    path.reset();
                    path.moveTo(m10619c.x, m10619c.y);
                } else {
                    path.lineTo(m10619c.x, m10619c.y);
                    this.f19524E.setColor(-65281);
                    canvas.drawPath(path, this.f19524E);
                }
                RectF rectF3 = this.f19555x;
                this.f19524E.setColor(-256);
                canvas.drawRect(rectF3, this.f19524E);
                RectF rectF4 = this.f19554w;
                this.f19524E.setColor(-16711936);
                canvas.drawRect(rectF4, this.f19524E);
                RectF rectF5 = this.f19557z;
                this.f19524E.setColor(-16711681);
                canvas.drawRect(rectF5, this.f19524E);
                RectF rectF6 = this.f19556y;
                this.f19524E.setColor(-16776961);
                canvas.drawRect(rectF6, this.f19524E);
            }
        }

        /* renamed from: e */
        public final void m10623e(float f2) {
            float f3;
            float f4;
            this.f19531L = f2;
            this.f19544m.setAlpha((int) (this.f19549r ? TransitionUtils.m10635c(0.0f, 255.0f, f2) : TransitionUtils.m10635c(255.0f, 0.0f, f2)));
            this.f19546o.getPosTan(this.f19547p * f2, this.f19548q, null);
            float[] fArr = this.f19548q;
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
                this.f19546o.getPosTan(this.f19547p * f3, fArr, null);
                float[] fArr2 = this.f19548q;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                f5 = C0000a.m4a(f5, f7, f4, f5);
                f6 = C0000a.m4a(f6, f8, f4, f6);
            }
            float f9 = f5;
            float f10 = f6;
            Float valueOf = Float.valueOf(this.f19520A.f19517b.f19514a);
            Objects.requireNonNull(valueOf);
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.f19520A.f19517b.f19515b);
            Objects.requireNonNull(valueOf2);
            FitModeResult mo10614a = this.f19522C.mo10614a(f2, floatValue, valueOf2.floatValue(), this.f19533b.width(), this.f19533b.height(), this.f19537f.width(), this.f19537f.height());
            this.f19527H = mo10614a;
            RectF rectF = this.f19554w;
            float f11 = mo10614a.f19485c / 2.0f;
            rectF.set(f9 - f11, f10, f11 + f9, mo10614a.f19486d + f10);
            RectF rectF2 = this.f19556y;
            FitModeResult fitModeResult = this.f19527H;
            float f12 = fitModeResult.f19487e / 2.0f;
            rectF2.set(f9 - f12, f10, f12 + f9, fitModeResult.f19488f + f10);
            this.f19555x.set(this.f19554w);
            this.f19557z.set(this.f19556y);
            Float valueOf3 = Float.valueOf(this.f19520A.f19518c.f19514a);
            Objects.requireNonNull(valueOf3);
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.f19520A.f19518c.f19515b);
            Objects.requireNonNull(valueOf4);
            float floatValue3 = valueOf4.floatValue();
            boolean mo10615b = this.f19522C.mo10615b(this.f19527H);
            RectF rectF3 = mo10615b ? this.f19555x : this.f19557z;
            float m10636d = TransitionUtils.m10636d(0.0f, 1.0f, floatValue2, floatValue3, f2);
            if (!mo10615b) {
                m10636d = 1.0f - m10636d;
            }
            this.f19522C.mo10616c(rectF3, m10636d, this.f19527H);
            this.f19528I = new RectF(Math.min(this.f19555x.left, this.f19557z.left), Math.min(this.f19555x.top, this.f19557z.top), Math.max(this.f19555x.right, this.f19557z.right), Math.max(this.f19555x.bottom, this.f19557z.bottom));
            MaskEvaluator maskEvaluator = this.f19545n;
            ShapeAppearanceModel shapeAppearanceModel = this.f19534c;
            ShapeAppearanceModel shapeAppearanceModel2 = this.f19538g;
            RectF rectF4 = this.f19554w;
            RectF rectF5 = this.f19555x;
            RectF rectF6 = this.f19557z;
            ProgressThresholds progressThresholds = this.f19520A.f19519d;
            Objects.requireNonNull(maskEvaluator);
            float f13 = progressThresholds.f19514a;
            float f14 = progressThresholds.f19515b;
            RectF rectF7 = TransitionUtils.f19584a;
            if (f2 >= f13) {
                if (f2 > f14) {
                    shapeAppearanceModel = shapeAppearanceModel2;
                } else {
                    TransitionUtils.C14871 c14871 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1

                        /* renamed from: a */
                        public final /* synthetic */ RectF f19585a;

                        /* renamed from: b */
                        public final /* synthetic */ RectF f19586b;

                        /* renamed from: c */
                        public final /* synthetic */ float f19587c;

                        /* renamed from: d */
                        public final /* synthetic */ float f19588d;

                        /* renamed from: e */
                        public final /* synthetic */ float f19589e;

                        public C14871(RectF rectF42, RectF rectF62, float f132, float f142, float f22) {
                            r1 = rectF42;
                            r2 = rectF62;
                            r3 = f132;
                            r4 = f142;
                            r5 = f22;
                        }

                        @NonNull
                        /* renamed from: a */
                        public CornerSize m10642a(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                            return new AbsoluteCornerSize(TransitionUtils.m10636d(cornerSize.mo10265a(r1), cornerSize2.mo10265a(r2), r3, r4, r5));
                        }
                    };
                    ShapeAppearanceModel shapeAppearanceModel3 = (shapeAppearanceModel.f18688e.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18688e.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18689f.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18689f.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18690g.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18690g.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 || (shapeAppearanceModel.f18691h.mo10265a(rectF42) > 0.0f ? 1 : (shapeAppearanceModel.f18691h.mo10265a(rectF42) == 0.0f ? 0 : -1)) != 0 ? shapeAppearanceModel : shapeAppearanceModel2;
                    Objects.requireNonNull(shapeAppearanceModel3);
                    ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel3);
                    builder.f18700e = c14871.m10642a(shapeAppearanceModel.f18688e, shapeAppearanceModel2.f18688e);
                    builder.f18701f = c14871.m10642a(shapeAppearanceModel.f18689f, shapeAppearanceModel2.f18689f);
                    builder.f18703h = c14871.m10642a(shapeAppearanceModel.f18691h, shapeAppearanceModel2.f18691h);
                    builder.f18702g = c14871.m10642a(shapeAppearanceModel.f18690g, shapeAppearanceModel2.f18690g);
                    shapeAppearanceModel = builder.m10320a();
                }
            }
            maskEvaluator.f19493e = shapeAppearanceModel;
            maskEvaluator.f19492d.m10327a(shapeAppearanceModel, 1.0f, rectF5, maskEvaluator.f19490b);
            maskEvaluator.f19492d.m10327a(maskEvaluator.f19493e, 1.0f, rectF62, maskEvaluator.f19491c);
            if (Build.VERSION.SDK_INT >= 23) {
                maskEvaluator.f19489a.op(maskEvaluator.f19490b, maskEvaluator.f19491c, Path.Op.UNION);
            }
            this.f19529J = TransitionUtils.m10635c(this.f19535d, this.f19539h, f22);
            float centerX = ((this.f19528I.centerX() / (this.f19550s / 2.0f)) - 1.0f) * 0.3f;
            float centerY = (this.f19528I.centerY() / this.f19551t) * 1.5f;
            float f15 = this.f19529J;
            float f16 = (int) (centerY * f15);
            this.f19530K = f16;
            this.f19543l.setShadowLayer(f15, (int) (centerX * f15), f16, 754974720);
            Float valueOf5 = Float.valueOf(this.f19520A.f19516a.f19514a);
            Objects.requireNonNull(valueOf5);
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.f19520A.f19516a.f19515b);
            Objects.requireNonNull(valueOf6);
            this.f19526G = this.f19521B.mo10608a(f22, floatValue4, valueOf6.floatValue(), 0.35f);
            if (this.f19541j.getColor() != 0) {
                this.f19541j.setAlpha(this.f19526G.f19463a);
            }
            if (this.f19542k.getColor() != 0) {
                this.f19542k.setAlpha(this.f19526G.f19464b);
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
        this.f19505h = Build.VERSION.SDK_INT >= 28;
        this.f19506i = -1.0f;
        this.f19507j = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m10617a(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i2, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        RectF m10634b;
        ShapeAppearanceModel m10320a;
        if (i2 != -1) {
            View view2 = transitionValues.view;
            RectF rectF = TransitionUtils.f19584a;
            View findViewById = view2.findViewById(i2);
            if (findViewById == null) {
                findViewById = TransitionUtils.m10633a(view2, i2);
            }
            transitionValues.view = findViewById;
        } else if (transitionValues.view.getTag(C2507R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view3 = (View) transitionValues.view.getTag(C2507R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(C2507R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view3;
        }
        View view4 = transitionValues.view;
        if (!ViewCompat.m2174N(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        if (view4.getParent() == null) {
            RectF rectF2 = TransitionUtils.f19584a;
            m10634b = new RectF(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
        } else {
            m10634b = TransitionUtils.m10634b(view4);
        }
        transitionValues.values.put("materialContainerTransition:bounds", m10634b);
        Map map = transitionValues.values;
        if (view4.getTag(C2507R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            m10320a = (ShapeAppearanceModel) view4.getTag(C2507R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view4.getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C2507R.attr.transitionShapeAppearance});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            m10320a = resourceId != -1 ? ShapeAppearanceModel.m10311a(context, resourceId, 0).m10320a() : view4 instanceof Shapeable ? ((Shapeable) view4).getShapeAppearanceModel() : new ShapeAppearanceModel.Builder().m10320a();
        }
        RectF rectF3 = TransitionUtils.f19584a;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(m10320a);
        builder.f18700e = RelativeCornerSize.m10310b(m10634b, m10320a.f18688e);
        builder.f18701f = RelativeCornerSize.m10310b(m10634b, m10320a.f18689f);
        builder.f18703h = RelativeCornerSize.m10310b(m10634b, m10320a.f18691h);
        builder.f18702g = RelativeCornerSize.m10310b(m10634b, m10320a.f18690g);
        map.put("materialContainerTransition:shapeAppearance", builder.m10320a());
    }

    /* renamed from: b */
    public final ProgressThresholdsGroup m10618b(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        ProgressThresholds progressThresholds = progressThresholdsGroup.f19516a;
        RectF rectF = TransitionUtils.f19584a;
        return new ProgressThresholdsGroup(progressThresholds, progressThresholdsGroup.f19517b, progressThresholdsGroup.f19518c, progressThresholdsGroup.f19519d, null);
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m10617a(transitionValues, null, this.f19503f, null);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m10617a(transitionValues, null, this.f19502e, null);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View m10633a;
        View view;
        RectF rectF;
        PathMotion pathMotion = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF2 = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && shapeAppearanceModel != null) {
                RectF rectF3 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF3 == null || shapeAppearanceModel2 == null) {
                    Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = transitionValues.view;
                final View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f19501d == view4.getId()) {
                    m10633a = (View) view4.getParent();
                    view = view4;
                } else {
                    m10633a = TransitionUtils.m10633a(view4, this.f19501d);
                    view = null;
                }
                RectF m10634b = TransitionUtils.m10634b(m10633a);
                float f2 = -m10634b.left;
                float f3 = -m10634b.top;
                if (view != null) {
                    rectF = TransitionUtils.m10634b(view);
                    rectF.offset(f2, f3);
                } else {
                    rectF = new RectF(0.0f, 0.0f, m10633a.getWidth(), m10633a.getHeight());
                }
                rectF2.offset(f2, f3);
                rectF3.offset(f2, f3);
                RectF rectF4 = TransitionUtils.f19584a;
                boolean z = true;
                boolean z2 = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                Context context = view4.getContext();
                TransitionUtils.m10640h(this, context, C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17343b);
                TransitionUtils.m10639g(this, context, z2 ? C2507R.attr.motionDurationLong2 : C2507R.attr.motionDurationMedium4);
                if (!this.f19500c) {
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
                        super.setPathMotion(pathMotion);
                        this.f19500c = true;
                    }
                }
                PathMotion pathMotion2 = getPathMotion();
                float f4 = this.f19506i;
                if (f4 == -1.0f) {
                    f4 = ViewCompat.m2221r(view2);
                }
                float f5 = f4;
                float f6 = this.f19507j;
                if (f6 == -1.0f) {
                    f6 = ViewCompat.m2221r(view3);
                }
                float f7 = f6;
                int i4 = this.f19504g;
                boolean z3 = this.f19505h;
                FadeModeEvaluator fadeModeEvaluator = z2 ? FadeModeEvaluators.f19459a : FadeModeEvaluators.f19460b;
                float width = rectF2.width();
                float height = rectF2.height();
                float width2 = rectF3.width();
                float height2 = rectF3.height();
                float f8 = (height2 * width) / width2;
                float f9 = (width2 * height) / width;
                if (!z2 ? f9 < height2 : f8 < height) {
                    z = false;
                }
                FitModeEvaluator fitModeEvaluator = z ? FitModeEvaluators.f19481a : FitModeEvaluators.f19482b;
                PathMotion pathMotion3 = getPathMotion();
                final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion2, view2, rectF2, shapeAppearanceModel, f5, view3, rectF3, shapeAppearanceModel2, f7, 0, 0, 0, i4, z2, z3, fadeModeEvaluator, fitModeEvaluator, ((pathMotion3 instanceof ArcMotion) || (pathMotion3 instanceof MaterialArcMotion)) ? m10618b(z2, f19497n, f19498o) : m10618b(z2, f19495l, f19496m), false, null);
                transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TransitionDrawable transitionDrawable2 = transitionDrawable;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (transitionDrawable2.f19531L != animatedFraction) {
                            transitionDrawable2.m10623e(animatedFraction);
                        }
                    }
                });
                final View view5 = m10633a;
                addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(@NonNull Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (MaterialContainerTransform.this.f19499b) {
                            return;
                        }
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        ViewUtils.m10168e(view5).mo10163b(transitionDrawable);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(@NonNull Transition transition) {
                        ViewUtils.m10168e(view5).mo10162a(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }
                });
                return ofFloat;
            }
            Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f19494k;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f19500c = true;
    }
}

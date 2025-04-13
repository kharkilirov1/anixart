package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
class FloatingActionButtonImpl {

    /* renamed from: D */
    public static final TimeInterpolator f18140D = AnimationUtils.f17344c;

    /* renamed from: E */
    public static final int f18141E = C2507R.attr.motionDurationLong2;

    /* renamed from: F */
    public static final int f18142F = C2507R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: G */
    public static final int f18143G = C2507R.attr.motionDurationMedium1;

    /* renamed from: H */
    public static final int f18144H = C2507R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: I */
    public static final int[] f18145I = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: J */
    public static final int[] f18146J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: K */
    public static final int[] f18147K = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: L */
    public static final int[] f18148L = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: M */
    public static final int[] f18149M = {R.attr.state_enabled};

    /* renamed from: N */
    public static final int[] f18150N = new int[0];

    /* renamed from: C */
    @Nullable
    public ViewTreeObserver.OnPreDrawListener f18153C;

    /* renamed from: a */
    @Nullable
    public ShapeAppearanceModel f18154a;

    /* renamed from: b */
    @Nullable
    public MaterialShapeDrawable f18155b;

    /* renamed from: c */
    @Nullable
    public Drawable f18156c;

    /* renamed from: d */
    @Nullable
    public BorderDrawable f18157d;

    /* renamed from: e */
    @Nullable
    public Drawable f18158e;

    /* renamed from: f */
    public boolean f18159f;

    /* renamed from: h */
    public float f18161h;

    /* renamed from: i */
    public float f18162i;

    /* renamed from: j */
    public float f18163j;

    /* renamed from: k */
    public int f18164k;

    /* renamed from: l */
    @NonNull
    public final StateListAnimator f18165l;

    /* renamed from: m */
    @Nullable
    public Animator f18166m;

    /* renamed from: n */
    @Nullable
    public MotionSpec f18167n;

    /* renamed from: o */
    @Nullable
    public MotionSpec f18168o;

    /* renamed from: p */
    public float f18169p;

    /* renamed from: r */
    public int f18171r;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f18173t;

    /* renamed from: u */
    public ArrayList<Animator.AnimatorListener> f18174u;

    /* renamed from: v */
    public ArrayList<InternalTransformationCallback> f18175v;

    /* renamed from: w */
    public final FloatingActionButton f18176w;

    /* renamed from: x */
    public final ShadowViewDelegate f18177x;

    /* renamed from: g */
    public boolean f18160g = true;

    /* renamed from: q */
    public float f18170q = 1.0f;

    /* renamed from: s */
    public int f18172s = 0;

    /* renamed from: y */
    public final Rect f18178y = new Rect();

    /* renamed from: z */
    public final RectF f18179z = new RectF();

    /* renamed from: A */
    public final RectF f18151A = new RectF();

    /* renamed from: B */
    public final Matrix f18152B = new Matrix();

    public class DisabledElevationAnimation extends ShadowAnimatorImpl {
        public DisabledElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        /* renamed from: a */
        public float mo10105a() {
            return 0.0f;
        }
    }

    public class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        public ElevateToHoveredFocusedTranslationZAnimation() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        /* renamed from: a */
        public float mo10105a() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.f18161h + floatingActionButtonImpl.f18162i;
        }
    }

    public class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        public ElevateToPressedTranslationZAnimation() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        /* renamed from: a */
        public float mo10105a() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.f18161h + floatingActionButtonImpl.f18163j;
        }
    }

    public interface InternalTransformationCallback {
        /* renamed from: a */
        void mo10078a();

        /* renamed from: b */
        void mo10079b();
    }

    public interface InternalVisibilityChangedListener {
        /* renamed from: a */
        void mo10070a();

        /* renamed from: b */
        void mo10071b();
    }

    public class ResetElevationAnimation extends ShadowAnimatorImpl {
        public ResetElevationAnimation() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        /* renamed from: a */
        public float mo10105a() {
            return FloatingActionButtonImpl.this.f18161h;
        }
    }

    public abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f18202a;

        /* renamed from: b */
        public float f18203b;

        /* renamed from: c */
        public float f18204c;

        public ShadowAnimatorImpl(C13061 c13061) {
        }

        /* renamed from: a */
        public abstract float mo10105a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.m10104y((int) this.f18204c);
            this.f18202a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f18202a) {
                MaterialShapeDrawable materialShapeDrawable = FloatingActionButtonImpl.this.f18155b;
                this.f18203b = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.m10289l();
                this.f18204c = mo10105a();
                this.f18202a = true;
            }
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            float f2 = this.f18203b;
            floatingActionButtonImpl.m10104y((int) ((valueAnimator.getAnimatedFraction() * (this.f18204c - f2)) + f2));
        }
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f18176w = floatingActionButton;
        this.f18177x = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f18165l = stateListAnimator;
        stateListAnimator.m10149a(f18145I, m10083d(new ElevateToPressedTranslationZAnimation()));
        stateListAnimator.m10149a(f18146J, m10083d(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.m10149a(f18147K, m10083d(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.m10149a(f18148L, m10083d(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.m10149a(f18149M, m10083d(new ResetElevationAnimation()));
        stateListAnimator.m10149a(f18150N, m10083d(new DisabledElevationAnimation(this)));
        this.f18169p = floatingActionButton.getRotation();
    }

    /* renamed from: a */
    public final void m10080a(float f2, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.f18176w.getDrawable() == null || this.f18171r == 0) {
            return;
        }
        RectF rectF = this.f18179z;
        RectF rectF2 = this.f18151A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.f18171r;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.f18171r;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    @NonNull
    /* renamed from: b */
    public final AnimatorSet m10081b(@NonNull MotionSpec motionSpec, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18176w, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        motionSpec.m9746d("opacity").m9747a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18176w, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        motionSpec.m9746d("scale").m9747a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new TypeEvaluator<Float>(this) { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5

                /* renamed from: a */
                public FloatEvaluator f18197a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public Float evaluate(float f5, Float f6, Float f7) {
                    float floatValue = this.f18197a.evaluate(f5, (Number) f6, (Number) f7).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f18176w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        motionSpec.m9746d("scale").m9747a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new TypeEvaluator<Float>(this) { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5

                /* renamed from: a */
                public FloatEvaluator f18197a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public Float evaluate(float f5, Float f6, Float f7) {
                    float floatValue = this.f18197a.evaluate(f5, (Number) f6, (Number) f7).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat3);
        m10080a(f4, this.f18152B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f18176w, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            @Override // com.google.android.material.animation.MatrixEvaluator
            /* renamed from: a */
            public Matrix evaluate(float f5, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.f18170q = f5;
                return super.evaluate(f5, matrix, matrix2);
            }

            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f5, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.f18170q = f5;
                return super.evaluate(f5, matrix, matrix2);
            }
        }, new Matrix(this.f18152B));
        motionSpec.m9746d("iconScale").m9747a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m9740a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet m10082c(final float f2, final float f3, final float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f18176w.getAlpha();
        final float scaleX = this.f18176w.getScaleX();
        final float scaleY = this.f18176w.getScaleY();
        final float f5 = this.f18170q;
        final Matrix matrix = new Matrix(this.f18152B);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButtonImpl.this.f18176w.setAlpha(AnimationUtils.m9738b(alpha, f2, 0.0f, 0.2f, floatValue));
                FloatingActionButtonImpl.this.f18176w.setScaleX(AnimationUtils.m9737a(scaleX, f3, floatValue));
                FloatingActionButtonImpl.this.f18176w.setScaleY(AnimationUtils.m9737a(scaleY, f3, floatValue));
                FloatingActionButtonImpl.this.f18170q = AnimationUtils.m9737a(f5, f4, floatValue);
                FloatingActionButtonImpl.this.m10080a(AnimationUtils.m9737a(f5, f4, floatValue), matrix);
                FloatingActionButtonImpl.this.f18176w.setImageMatrix(matrix);
            }
        });
        arrayList.add(ofFloat);
        AnimatorSetCompat.m9740a(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.m10184c(this.f18176w.getContext(), i2, this.f18176w.getContext().getResources().getInteger(C2507R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.m10185d(this.f18176w.getContext(), i3, AnimationUtils.f17343b));
        return animatorSet;
    }

    @NonNull
    /* renamed from: d */
    public final ValueAnimator m10083d(@NonNull ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f18140D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: e */
    public MaterialShapeDrawable mo10084e() {
        ShapeAppearanceModel shapeAppearanceModel = this.f18154a;
        Objects.requireNonNull(shapeAppearanceModel);
        return new MaterialShapeDrawable(shapeAppearanceModel);
    }

    /* renamed from: f */
    public float mo10085f() {
        return this.f18161h;
    }

    /* renamed from: g */
    public void mo10086g(@NonNull Rect rect) {
        int sizeDimension = this.f18159f ? (this.f18164k - this.f18176w.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f18160g ? mo10085f() + this.f18163j : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: h */
    public void mo10087h(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        MaterialShapeDrawable mo10084e = mo10084e();
        this.f18155b = mo10084e;
        mo10084e.setTintList(colorStateList);
        if (mode != null) {
            this.f18155b.setTintMode(mode);
        }
        this.f18155b.m10269A(-12303292);
        this.f18155b.m10296s(this.f18176w.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f18155b.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.m10258d(colorStateList2));
        this.f18156c = rippleDrawableCompat;
        MaterialShapeDrawable materialShapeDrawable = this.f18155b;
        Objects.requireNonNull(materialShapeDrawable);
        this.f18158e = new LayerDrawable(new Drawable[]{materialShapeDrawable, rippleDrawableCompat});
    }

    /* renamed from: i */
    public boolean m10088i() {
        return this.f18176w.getVisibility() == 0 ? this.f18172s == 1 : this.f18172s != 2;
    }

    /* renamed from: j */
    public boolean m10089j() {
        return this.f18176w.getVisibility() != 0 ? this.f18172s == 2 : this.f18172s != 1;
    }

    /* renamed from: k */
    public void mo10090k() {
        StateListAnimator stateListAnimator = this.f18165l;
        ValueAnimator valueAnimator = stateListAnimator.f18329c;
        if (valueAnimator != null) {
            valueAnimator.end();
            stateListAnimator.f18329c = null;
        }
    }

    /* renamed from: l */
    public void mo10091l() {
    }

    /* renamed from: m */
    public void mo10092m(int[] iArr) {
        this.f18165l.m10150b(iArr);
    }

    /* renamed from: n */
    public void mo10093n(float f2, float f3, float f4) {
        m10103x();
        MaterialShapeDrawable materialShapeDrawable = this.f18155b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m10300w(f2);
        }
    }

    /* renamed from: o */
    public void m10094o() {
        ArrayList<InternalTransformationCallback> arrayList = this.f18175v;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo10079b();
            }
        }
    }

    /* renamed from: p */
    public void m10095p() {
        ArrayList<InternalTransformationCallback> arrayList = this.f18175v;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo10078a();
            }
        }
    }

    /* renamed from: q */
    public final void m10096q(float f2) {
        this.f18170q = f2;
        Matrix matrix = this.f18152B;
        m10080a(f2, matrix);
        this.f18176w.setImageMatrix(matrix);
    }

    /* renamed from: r */
    public void mo10097r(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f18156c;
        if (drawable != null) {
            DrawableCompat.m1842n(drawable, RippleUtils.m10258d(colorStateList));
        }
    }

    /* renamed from: s */
    public final void m10098s(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f18154a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f18155b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.f18156c;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.f18157d;
        if (borderDrawable != null) {
            borderDrawable.f18098o = shapeAppearanceModel;
            borderDrawable.invalidateSelf();
        }
    }

    /* renamed from: t */
    public boolean mo10099t() {
        return true;
    }

    /* renamed from: u */
    public final boolean m10100u() {
        return ViewCompat.m2174N(this.f18176w) && !this.f18176w.isInEditMode();
    }

    /* renamed from: v */
    public final boolean m10101v() {
        return !this.f18159f || this.f18176w.getSizeDimension() >= this.f18164k;
    }

    /* renamed from: w */
    public void mo10102w() {
        MaterialShapeDrawable materialShapeDrawable = this.f18155b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m10270B((int) this.f18169p);
        }
    }

    /* renamed from: x */
    public final void m10103x() {
        Rect rect = this.f18178y;
        mo10086g(rect);
        Preconditions.m2032e(this.f18158e, "Didn't initialize content background");
        if (mo10099t()) {
            this.f18177x.mo10076b(new InsetDrawable(this.f18158e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f18177x.mo10076b(this.f18158e);
        }
        this.f18177x.mo10075a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: y */
    public void m10104y(float f2) {
        MaterialShapeDrawable materialShapeDrawable = this.f18155b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m10300w(f2);
        }
    }
}

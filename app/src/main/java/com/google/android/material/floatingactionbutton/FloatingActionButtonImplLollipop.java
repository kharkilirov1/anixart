package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {

    /* renamed from: O */
    @Nullable
    public StateListAnimator f18206O;

    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        public AlwaysStatefulMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    @NonNull
    /* renamed from: e */
    public MaterialShapeDrawable mo10084e() {
        ShapeAppearanceModel shapeAppearanceModel = this.f18154a;
        Objects.requireNonNull(shapeAppearanceModel);
        return new AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: f */
    public float mo10085f() {
        return this.f18176w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: g */
    public void mo10086g(@NonNull Rect rect) {
        if (this.f18177x.mo10077c()) {
            super.mo10086g(rect);
        } else if (m10101v()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f18164k - this.f18176w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: h */
    public void mo10087h(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable drawable;
        ShapeAppearanceModel shapeAppearanceModel = this.f18154a;
        Objects.requireNonNull(shapeAppearanceModel);
        AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = new AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
        this.f18155b = alwaysStatefulMaterialShapeDrawable;
        alwaysStatefulMaterialShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.f18155b.setTintMode(mode);
        }
        this.f18155b.m10296s(this.f18176w.getContext());
        if (i2 > 0) {
            Context context = this.f18176w.getContext();
            ShapeAppearanceModel shapeAppearanceModel2 = this.f18154a;
            Objects.requireNonNull(shapeAppearanceModel2);
            BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel2);
            int m1670c = ContextCompat.m1670c(context, C2507R.color.design_fab_stroke_top_outer_color);
            int m1670c2 = ContextCompat.m1670c(context, C2507R.color.design_fab_stroke_top_inner_color);
            int m1670c3 = ContextCompat.m1670c(context, C2507R.color.design_fab_stroke_end_inner_color);
            int m1670c4 = ContextCompat.m1670c(context, C2507R.color.design_fab_stroke_end_outer_color);
            borderDrawable.f18092i = m1670c;
            borderDrawable.f18093j = m1670c2;
            borderDrawable.f18094k = m1670c3;
            borderDrawable.f18095l = m1670c4;
            float f2 = i2;
            if (borderDrawable.f18091h != f2) {
                borderDrawable.f18091h = f2;
                borderDrawable.f18085b.setStrokeWidth(f2 * 1.3333f);
                borderDrawable.f18097n = true;
                borderDrawable.invalidateSelf();
            }
            borderDrawable.m10052b(colorStateList);
            this.f18157d = borderDrawable;
            BorderDrawable borderDrawable2 = this.f18157d;
            Objects.requireNonNull(borderDrawable2);
            MaterialShapeDrawable materialShapeDrawable = this.f18155b;
            Objects.requireNonNull(materialShapeDrawable);
            drawable = new LayerDrawable(new Drawable[]{borderDrawable2, materialShapeDrawable});
        } else {
            this.f18157d = null;
            drawable = this.f18155b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m10258d(colorStateList2), drawable, null);
        this.f18156c = rippleDrawable;
        this.f18158e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: k */
    public void mo10090k() {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: l */
    public void mo10091l() {
        m10103x();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: m */
    public void mo10092m(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.f18176w.isEnabled()) {
                this.f18176w.setElevation(0.0f);
                this.f18176w.setTranslationZ(0.0f);
                return;
            }
            this.f18176w.setElevation(this.f18161h);
            if (this.f18176w.isPressed()) {
                this.f18176w.setTranslationZ(this.f18163j);
            } else if (this.f18176w.isFocused() || this.f18176w.isHovered()) {
                this.f18176w.setTranslationZ(this.f18162i);
            } else {
                this.f18176w.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: n */
    public void mo10093n(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.f18176w.refreshDrawableState();
        } else if (this.f18176w.getStateListAnimator() == this.f18206O) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(FloatingActionButtonImpl.f18145I, m10106z(f2, f4));
            stateListAnimator.addState(FloatingActionButtonImpl.f18146J, m10106z(f2, f3));
            stateListAnimator.addState(FloatingActionButtonImpl.f18147K, m10106z(f2, f3));
            stateListAnimator.addState(FloatingActionButtonImpl.f18148L, m10106z(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f18176w, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.f18176w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f18176w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(FloatingActionButtonImpl.f18140D);
            stateListAnimator.addState(FloatingActionButtonImpl.f18149M, animatorSet);
            stateListAnimator.addState(FloatingActionButtonImpl.f18150N, m10106z(0.0f, 0.0f));
            this.f18206O = stateListAnimator;
            this.f18176w.setStateListAnimator(stateListAnimator);
        }
        if (mo10099t()) {
            m10103x();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: r */
    public void mo10097r(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f18156c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.m10258d(colorStateList));
        } else if (drawable != null) {
            DrawableCompat.m1842n(drawable, RippleUtils.m10258d(colorStateList));
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: t */
    public boolean mo10099t() {
        return this.f18177x.mo10077c() || !m10101v();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    /* renamed from: w */
    public void mo10102w() {
    }

    @NonNull
    /* renamed from: z */
    public final Animator m10106z(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f18176w, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f18176w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(FloatingActionButtonImpl.f18140D);
        return animatorSet;
    }
}

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.C1195R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {

    /* renamed from: c */
    @Nullable
    public ColorStateList f18117c;

    /* renamed from: d */
    @Nullable
    public PorterDuff.Mode f18118d;

    /* renamed from: e */
    @Nullable
    public ColorStateList f18119e;

    /* renamed from: f */
    @Nullable
    public PorterDuff.Mode f18120f;

    /* renamed from: g */
    @Nullable
    public ColorStateList f18121g;

    /* renamed from: h */
    public int f18122h;

    /* renamed from: i */
    public int f18123i;

    /* renamed from: j */
    public int f18124j;

    /* renamed from: k */
    public int f18125k;

    /* renamed from: l */
    public int f18126l;

    /* renamed from: m */
    public boolean f18127m;

    /* renamed from: n */
    public final Rect f18128n;

    /* renamed from: o */
    public final Rect f18129o;

    /* renamed from: p */
    @NonNull
    public final AppCompatImageHelper f18130p;

    /* renamed from: q */
    @NonNull
    public final ExpandableWidgetHelper f18131q;

    /* renamed from: r */
    public FloatingActionButtonImpl f18132r;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1 */
    class C13051 implements FloatingActionButtonImpl.InternalVisibilityChangedListener {

        /* renamed from: a */
        public final /* synthetic */ OnVisibilityChangedListener f18133a;

        public C13051(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f18133a = onVisibilityChangedListener;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        /* renamed from: a */
        public void mo10070a() {
            this.f18133a.mo9835b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        /* renamed from: b */
        public void mo10071b() {
            this.f18133a.mo9834a(FloatingActionButton.this);
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        /* renamed from: a */
        public void mo9834a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo9835b(FloatingActionButton floatingActionButton) {
        }
    }

    public class ShadowDelegateImpl implements ShadowViewDelegate {
        public ShadowDelegateImpl() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        /* renamed from: a */
        public void mo10075a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.f18128n.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            int i6 = floatingActionButton.f18125k;
            floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        /* renamed from: b */
        public void mo10076b(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        /* renamed from: c */
        public boolean mo10077c() {
            return FloatingActionButton.this.f18127m;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Size {
    }

    public class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {

        /* renamed from: a */
        @NonNull
        public final TransformationCallback<T> f18138a;

        public TransformationCallbackWrapper(@NonNull TransformationCallback<T> transformationCallback) {
            this.f18138a = transformationCallback;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        /* renamed from: a */
        public void mo10078a() {
            this.f18138a.mo9750b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        /* renamed from: b */
        public void mo10079b() {
            this.f18138a.mo9749a(FloatingActionButton.this);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).f18138a.equals(this.f18138a);
        }

        public int hashCode() {
            return this.f18138a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.floatingActionButtonStyle, C2507R.style.Widget_Design_FloatingActionButton), attributeSet, C2507R.attr.floatingActionButtonStyle);
        this.f18128n = new Rect();
        this.f18129o = new Rect();
        Context context2 = getContext();
        TypedArray m10159d = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17329n, C2507R.attr.floatingActionButtonStyle, C2507R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f18117c = MaterialResources.m10240a(context2, m10159d, 1);
        this.f18118d = ViewUtils.m10172i(m10159d.getInt(2, -1), null);
        this.f18121g = MaterialResources.m10240a(context2, m10159d, 12);
        this.f18123i = m10159d.getInt(7, -1);
        this.f18124j = m10159d.getDimensionPixelSize(6, 0);
        this.f18122h = m10159d.getDimensionPixelSize(3, 0);
        float dimension = m10159d.getDimension(4, 0.0f);
        float dimension2 = m10159d.getDimension(9, 0.0f);
        float dimension3 = m10159d.getDimension(11, 0.0f);
        this.f18127m = m10159d.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C2507R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(m10159d.getDimensionPixelSize(10, 0));
        MotionSpec m9743a = MotionSpec.m9743a(context2, m10159d, 15);
        MotionSpec m9743a2 = MotionSpec.m9743a(context2, m10159d, 8);
        ShapeAppearanceModel m10320a = ShapeAppearanceModel.m10314d(context2, attributeSet, C2507R.attr.floatingActionButtonStyle, C2507R.style.Widget_Design_FloatingActionButton, ShapeAppearanceModel.f18683m).m10320a();
        boolean z = m10159d.getBoolean(5, false);
        setEnabled(m10159d.getBoolean(0, true));
        m10159d.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f18130p = appCompatImageHelper;
        appCompatImageHelper.m748b(attributeSet, C2507R.attr.floatingActionButtonStyle);
        this.f18131q = new ExpandableWidgetHelper(this);
        getImpl().m10098s(m10320a);
        getImpl().mo10087h(this.f18117c, this.f18118d, this.f18121g, this.f18122h);
        getImpl().f18164k = dimensionPixelSize;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18161h != dimension) {
            impl.f18161h = dimension;
            impl.mo10093n(dimension, impl.f18162i, impl.f18163j);
        }
        FloatingActionButtonImpl impl2 = getImpl();
        if (impl2.f18162i != dimension2) {
            impl2.f18162i = dimension2;
            impl2.mo10093n(impl2.f18161h, dimension2, impl2.f18163j);
        }
        FloatingActionButtonImpl impl3 = getImpl();
        if (impl3.f18163j != dimension3) {
            impl3.f18163j = dimension3;
            impl3.mo10093n(impl3.f18161h, impl3.f18162i, dimension3);
        }
        getImpl().f18167n = m9743a;
        getImpl().f18168o = m9743a2;
        getImpl().f18159f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.f18132r == null) {
            this.f18132r = new FloatingActionButtonImplLollipop(this, new ShadowDelegateImpl());
        }
        return this.f18132r;
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    /* renamed from: a */
    public boolean mo10048a() {
        return this.f18131q.f18081b;
    }

    /* renamed from: d */
    public void m10058d(@NonNull Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18174u == null) {
            impl.f18174u = new ArrayList<>();
        }
        impl.f18174u.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo10092m(getDrawableState());
    }

    /* renamed from: e */
    public void m10059e(@NonNull Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18173t == null) {
            impl.f18173t = new ArrayList<>();
        }
        impl.f18173t.add(animatorListener);
    }

    /* renamed from: f */
    public void m10060f(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        FloatingActionButtonImpl impl = getImpl();
        TransformationCallbackWrapper transformationCallbackWrapper = new TransformationCallbackWrapper(null);
        if (impl.f18175v == null) {
            impl.f18175v = new ArrayList<>();
        }
        impl.f18175v.add(transformationCallbackWrapper);
    }

    @Deprecated
    /* renamed from: g */
    public boolean m10061g(@NonNull Rect rect) {
        if (!ViewCompat.m2174N(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m10066l(rect);
        return true;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f18117c;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f18118d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo10085f();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f18162i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f18163j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().f18158e;
    }

    @Px
    public int getCustomSize() {
        return this.f18124j;
    }

    public int getExpandedComponentIdHint() {
        return this.f18131q.f18082c;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return getImpl().f18168o;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f18121g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f18121g;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = getImpl().f18154a;
        Objects.requireNonNull(shapeAppearanceModel);
        return shapeAppearanceModel;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return getImpl().f18167n;
    }

    public int getSize() {
        return this.f18123i;
    }

    public int getSizeDimension() {
        return m10062h(this.f18123i);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f18119e;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f18120f;
    }

    public boolean getUseCompatPadding() {
        return this.f18127m;
    }

    /* renamed from: h */
    public final int m10062h(int i2) {
        int i3 = this.f18124j;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i2 != -1 ? i2 != 1 ? resources.getDimensionPixelSize(C2507R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(C2507R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m10062h(1) : m10062h(0);
    }

    /* renamed from: i */
    public void m10063i(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, final boolean z) {
        final FloatingActionButtonImpl impl = getImpl();
        final C13051 c13051 = onVisibilityChangedListener == null ? null : new C13051(onVisibilityChangedListener);
        if (impl.m10088i()) {
            return;
        }
        Animator animator = impl.f18166m;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m10100u()) {
            impl.f18176w.m10174b(z ? 8 : 4, z);
            if (c13051 != null) {
                c13051.mo10071b();
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.f18168o;
        AnimatorSet m10081b = motionSpec != null ? impl.m10081b(motionSpec, 0.0f, 0.0f, 0.0f) : impl.m10082c(0.0f, 0.4f, 0.4f, FloatingActionButtonImpl.f18143G, FloatingActionButtonImpl.f18144H);
        m10081b.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1

            /* renamed from: a */
            public boolean f18180a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                this.f18180a = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f18172s = 0;
                floatingActionButtonImpl.f18166m = null;
                if (this.f18180a) {
                    return;
                }
                FloatingActionButton floatingActionButton = floatingActionButtonImpl.f18176w;
                boolean z2 = z;
                floatingActionButton.m10174b(z2 ? 8 : 4, z2);
                InternalVisibilityChangedListener internalVisibilityChangedListener = c13051;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.mo10071b();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.f18176w.m10174b(0, z);
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f18172s = 1;
                floatingActionButtonImpl.f18166m = animator2;
                this.f18180a = false;
            }
        });
        ArrayList<Animator.AnimatorListener> arrayList = impl.f18174u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m10081b.addListener(it.next());
            }
        }
        m10081b.start();
    }

    /* renamed from: j */
    public boolean m10064j() {
        return getImpl().m10088i();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo10090k();
    }

    /* renamed from: k */
    public boolean m10065k() {
        return getImpl().m10089j();
    }

    /* renamed from: l */
    public final void m10066l(@NonNull Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.f18128n;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: m */
    public final void m10067m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f18119e;
        if (colorStateList == null) {
            DrawableCompat.m1831c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f18120f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.m727c(colorForState, mode));
    }

    /* renamed from: n */
    public void m10068n() {
        m10069o(null, true);
    }

    /* renamed from: o */
    public void m10069o(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, final boolean z) {
        final FloatingActionButtonImpl impl = getImpl();
        final C13051 c13051 = onVisibilityChangedListener == null ? null : new C13051(onVisibilityChangedListener);
        if (impl.m10089j()) {
            return;
        }
        Animator animator = impl.f18166m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.f18167n == null;
        if (!impl.m10100u()) {
            impl.f18176w.m10174b(0, z);
            impl.f18176w.setAlpha(1.0f);
            impl.f18176w.setScaleY(1.0f);
            impl.f18176w.setScaleX(1.0f);
            impl.m10096q(1.0f);
            if (c13051 != null) {
                c13051.mo10070a();
                return;
            }
            return;
        }
        if (impl.f18176w.getVisibility() != 0) {
            impl.f18176w.setAlpha(0.0f);
            impl.f18176w.setScaleY(z2 ? 0.4f : 0.0f);
            impl.f18176w.setScaleX(z2 ? 0.4f : 0.0f);
            impl.m10096q(z2 ? 0.4f : 0.0f);
        }
        MotionSpec motionSpec = impl.f18167n;
        AnimatorSet m10081b = motionSpec != null ? impl.m10081b(motionSpec, 1.0f, 1.0f, 1.0f) : impl.m10082c(1.0f, 1.0f, 1.0f, FloatingActionButtonImpl.f18141E, FloatingActionButtonImpl.f18142F);
        m10081b.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f18172s = 0;
                floatingActionButtonImpl.f18166m = null;
                InternalVisibilityChangedListener internalVisibilityChangedListener = c13051;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.mo10070a();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.f18176w.m10174b(0, z);
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.f18172s = 2;
                floatingActionButtonImpl.f18166m = animator2;
            }
        });
        ArrayList<Animator.AnimatorListener> arrayList = impl.f18173t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m10081b.addListener(it.next());
            }
        }
        m10081b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final FloatingActionButtonImpl impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f18155b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.m10309c(impl.f18176w, materialShapeDrawable);
        }
        if (!(impl instanceof FloatingActionButtonImplLollipop)) {
            ViewTreeObserver viewTreeObserver = impl.f18176w.getViewTreeObserver();
            if (impl.f18153C == null) {
                impl.f18153C = new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.6
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                        float rotation = floatingActionButtonImpl.f18176w.getRotation();
                        if (floatingActionButtonImpl.f18169p == rotation) {
                            return true;
                        }
                        floatingActionButtonImpl.f18169p = rotation;
                        floatingActionButtonImpl.mo10102w();
                        return true;
                    }
                };
            }
            viewTreeObserver.addOnPreDrawListener(impl.f18153C);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FloatingActionButtonImpl impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f18176w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f18153C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f18153C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f18125k = (sizeDimension - this.f18126l) / 2;
        getImpl().m10103x();
        int min = Math.min(View.resolveSize(sizeDimension, i2), View.resolveSize(sizeDimension, i3));
        Rect rect = this.f18128n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f3875b);
        ExpandableWidgetHelper expandableWidgetHelper = this.f18131q;
        Bundle bundle = extendableSavedState.f18878d.get("expandableWidgetHelper");
        Objects.requireNonNull(bundle);
        Objects.requireNonNull(expandableWidgetHelper);
        expandableWidgetHelper.f18081b = bundle.getBoolean("expanded", false);
        expandableWidgetHelper.f18082c = bundle.getInt("expandedComponentIdHint", 0);
        if (expandableWidgetHelper.f18081b) {
            ViewParent parent = expandableWidgetHelper.f18080a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m1476e(expandableWidgetHelper.f18080a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        SimpleArrayMap<String, Bundle> simpleArrayMap = extendableSavedState.f18878d;
        ExpandableWidgetHelper expandableWidgetHelper = this.f18131q;
        Objects.requireNonNull(expandableWidgetHelper);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", expandableWidgetHelper.f18081b);
        bundle.putInt("expandedComponentIdHint", expandableWidgetHelper.f18082c);
        simpleArrayMap.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m10061g(this.f18129o) && !this.f18129o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f18117c != colorStateList) {
            this.f18117c = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f18155b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.f18157d;
            if (borderDrawable != null) {
                borderDrawable.m10052b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f18118d != mode) {
            this.f18118d = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f18155b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f2) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18161h != f2) {
            impl.f18161h = f2;
            impl.mo10093n(f2, impl.f18162i, impl.f18163j);
        }
    }

    public void setCompatElevationResource(@DimenRes int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18162i != f2) {
            impl.f18162i = f2;
            impl.mo10093n(impl.f18161h, f2, impl.f18163j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18163j != f2) {
            impl.f18163j = f2;
            impl.mo10093n(impl.f18161h, impl.f18162i, f2);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(@Px int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f18124j) {
            this.f18124j = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeDrawable materialShapeDrawable = getImpl().f18155b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m10300w(f2);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f18159f) {
            getImpl().f18159f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i2) {
        this.f18131q.f18082c = i2;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().f18168o = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
        setHideMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            FloatingActionButtonImpl impl = getImpl();
            impl.m10096q(impl.f18170q);
            if (this.f18119e != null) {
                m10067m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i2) {
        this.f18130p.m749c(i2);
        m10067m();
    }

    public void setMaxImageSize(int i2) {
        this.f18126l = i2;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f18171r != i2) {
            impl.f18171r = i2;
            impl.m10096q(impl.f18170q);
        }
    }

    public void setRippleColor(@ColorInt int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().m10094o();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().m10094o();
    }

    @RestrictTo
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        FloatingActionButtonImpl impl = getImpl();
        impl.f18160g = z;
        impl.m10103x();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().m10098s(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().f18167n = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
        setShowMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f18124j = 0;
        if (i2 != this.f18123i) {
            this.f18123i = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f18119e != colorStateList) {
            this.f18119e = colorStateList;
            m10067m();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f18120f != mode) {
            this.f18120f = mode;
            m10067m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().m10095p();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().m10095p();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().m10095p();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f18127m != z) {
            this.f18127m = z;
            getImpl().mo10091l();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f18135a;

        /* renamed from: b */
        public boolean f18136b;

        public BaseBehavior() {
            this.f18136b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean mo1492a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f18128n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: c */
        public void mo1494c(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.f3077h == 0) {
                layoutParams.f3077h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: d */
        public boolean mo1495d(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m10073t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f3070a instanceof BottomSheetBehavior : false) {
                    m10074u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h */
        public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> m1478h = coordinatorLayout.m1478h(floatingActionButton);
            int size = m1478h.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = m1478h.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f3070a instanceof BottomSheetBehavior : false) && m10074u(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m10073t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1486u(floatingActionButton, i2);
            Rect rect = floatingActionButton.f18128n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i5 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                ViewCompat.m2179S(floatingActionButton, i3);
            }
            if (i5 == 0) {
                return true;
            }
            ViewCompat.m2178R(floatingActionButton, i5);
            return true;
        }

        /* renamed from: s */
        public final boolean m10072s(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f18136b && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).f3075f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: t */
        public final boolean m10073t(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!m10072s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f18135a == null) {
                this.f18135a = new Rect();
            }
            Rect rect = this.f18135a;
            DescendantOffsetUtils.m10143a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m10063i(null, false);
                return true;
            }
            floatingActionButton.m10069o(null, false);
            return true;
        }

        /* renamed from: u */
        public final boolean m10074u(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!m10072s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m10063i(null, false);
                return true;
            }
            floatingActionButton.m10069o(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17330o);
            this.f18136b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f18121g != colorStateList) {
            this.f18121g = colorStateList;
            getImpl().mo10097r(this.f18121g);
        }
    }
}

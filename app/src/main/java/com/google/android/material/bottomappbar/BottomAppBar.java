package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: m0 */
    public static final /* synthetic */ int f17533m0 = 0;

    /* renamed from: S */
    @Nullable
    public Integer f17534S;

    /* renamed from: T */
    @Nullable
    public Animator f17535T;

    /* renamed from: U */
    @Nullable
    public Animator f17536U;

    /* renamed from: V */
    public int f17537V;

    /* renamed from: W */
    public int f17538W;

    /* renamed from: a0 */
    public int f17539a0;

    /* renamed from: b0 */
    @Px
    public int f17540b0;

    /* renamed from: c0 */
    public int f17541c0;

    /* renamed from: d0 */
    public boolean f17542d0;

    /* renamed from: e0 */
    public int f17543e0;

    /* renamed from: f0 */
    @MenuRes
    public int f17544f0;

    /* renamed from: g0 */
    public boolean f17545g0;

    /* renamed from: h0 */
    public boolean f17546h0;

    /* renamed from: i0 */
    public Behavior f17547i0;

    /* renamed from: j0 */
    public int f17548j0;

    /* renamed from: k0 */
    public int f17549k0;

    /* renamed from: l0 */
    public int f17550l0;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$1 */
    public class C12141 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$2 */
    public class C12152 implements TransformationCallback<FloatingActionButton> {
        @Override // com.google.android.material.animation.TransformationCallback
        /* renamed from: a */
        public void mo9749a(@NonNull FloatingActionButton floatingActionButton) {
            int i2 = BottomAppBar.f17533m0;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.material.animation.TransformationCallback
        /* renamed from: b */
        public void mo9750b(@NonNull FloatingActionButton floatingActionButton) {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$3 */
    class C12163 implements ViewUtils.OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo9833a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
            int i2 = BottomAppBar.f17533m0;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$8 */
    class RunnableC12218 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f17561b;

        /* renamed from: c */
        public final /* synthetic */ int f17562c;

        /* renamed from: d */
        public final /* synthetic */ boolean f17563d;

        public RunnableC12218(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f17561b = actionMenuView;
            this.f17562c = i2;
            this.f17563d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17561b.setTranslationX(BottomAppBar.this.m9825D(r0, this.f17562c, this.f17563d));
        }
    }

    public interface AnimationListener {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public int f17571d;

        /* renamed from: e */
        public boolean f17572e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f17571d);
            parcel.writeInt(this.f17572e ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17571d = parcel.readInt();
            this.f17572e = parcel.readInt() != 0;
        }
    }

    /* renamed from: L */
    public static void m9819L(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.f3073d = 17;
        int i2 = bottomAppBar.f17539a0;
        if (i2 == 1) {
            layoutParams.f3073d = 17 | 48;
        }
        if (i2 == 0) {
            layoutParams.f3073d |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f17548j0;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return m9826E(this.f17537V);
    }

    private float getFabTranslationY() {
        if (this.f17539a0 == 1) {
            return -getTopEdgeTreatment().f17576e;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f17550l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f17549k0;
    }

    @NonNull
    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: x */
    public static void m9820x(BottomAppBar bottomAppBar) {
        bottomAppBar.f17543e0--;
    }

    @Nullable
    /* renamed from: B */
    public final FloatingActionButton m9823B() {
        View m9824C = m9824C();
        if (m9824C instanceof FloatingActionButton) {
            return (FloatingActionButton) m9824C;
        }
        return null;
    }

    @Nullable
    /* renamed from: C */
    public final View m9824C() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1479i(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: D */
    public int m9825D(@NonNull ActionMenuView actionMenuView, int i2, boolean z) {
        int i3 = 0;
        if (this.f17541c0 != 1 && (i2 != 1 || !z)) {
            return 0;
        }
        boolean m10171h = ViewUtils.m10171h(this);
        int measuredWidth = m10171h ? getMeasuredWidth() : 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f316a & 8388615) == 8388611) {
                measuredWidth = m10171h ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = m10171h ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i5 = m10171h ? this.f17549k0 : -this.f17550l0;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C2507R.dimen.m3_bottomappbar_horizontal_padding);
            i3 = m10171h ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - ((right + i5) + i3);
    }

    /* renamed from: E */
    public final float m9826E(int i2) {
        boolean m10171h = ViewUtils.m10171h(this);
        if (i2 != 1) {
            return 0.0f;
        }
        View m9824C = m9824C();
        int i3 = m10171h ? this.f17550l0 : this.f17549k0;
        return ((getMeasuredWidth() / 2) - ((this.f17540b0 == -1 || m9824C == null) ? i3 + 0 : ((m9824C.getMeasuredWidth() / 2) + this.f17540b0) + i3)) * (m10171h ? -1 : 1);
    }

    /* renamed from: F */
    public final boolean m9827F() {
        FloatingActionButton m9823B = m9823B();
        return m9823B != null && m9823B.m10065k();
    }

    /* renamed from: G */
    public final void m9828G(final int i2, final boolean z) {
        if (!ViewCompat.m2174N(this)) {
            this.f17545g0 = false;
            int i3 = this.f17544f0;
            if (i3 != 0) {
                this.f17544f0 = 0;
                getMenu().clear();
                m983n(i3);
                return;
            }
            return;
        }
        Animator animator = this.f17536U;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m9827F()) {
            i2 = 0;
            z = false;
        }
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - m9825D(actionMenuView, i2, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7

                    /* renamed from: a */
                    public boolean f17556a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                        this.f17556a = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        if (this.f17556a) {
                            return;
                        }
                        BottomAppBar bottomAppBar = BottomAppBar.this;
                        int i4 = bottomAppBar.f17544f0;
                        boolean z2 = i4 != 0;
                        if (i4 != 0) {
                            bottomAppBar.f17544f0 = 0;
                            bottomAppBar.getMenu().clear();
                            bottomAppBar.m983n(i4);
                        }
                        BottomAppBar bottomAppBar2 = BottomAppBar.this;
                        ActionMenuView actionMenuView2 = actionMenuView;
                        int i5 = i2;
                        boolean z3 = z;
                        Objects.requireNonNull(bottomAppBar2);
                        RunnableC12218 runnableC12218 = bottomAppBar2.new RunnableC12218(actionMenuView2, i5, z3);
                        if (z2) {
                            actionMenuView2.post(runnableC12218);
                        } else {
                            runnableC12218.run();
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f17536U = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.m9820x(BottomAppBar.this);
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.f17545g0 = false;
                bottomAppBar.f17536U = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.f17543e0++;
            }
        });
        this.f17536U.start();
    }

    /* renamed from: H */
    public final void m9829H() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f17536U != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m9827F()) {
            m9832K(actionMenuView, this.f17537V, this.f17546h0);
        } else {
            m9832K(actionMenuView, 0, false);
        }
    }

    /* renamed from: I */
    public final void m9830I() {
        getTopEdgeTreatment().f17577f = getFabTranslationX();
        if (this.f17546h0) {
            m9827F();
        }
        throw null;
    }

    /* renamed from: J */
    public boolean m9831J(@Px int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().f17575d) {
            return false;
        }
        getTopEdgeTreatment().f17575d = f2;
        throw null;
    }

    /* renamed from: K */
    public final void m9832K(@NonNull ActionMenuView actionMenuView, int i2, boolean z) {
        new RunnableC12218(actionMenuView, i2, z).run();
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f17576e;
    }

    public int getFabAlignmentMode() {
        return this.f17537V;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f17540b0;
    }

    public int getFabAnchorMode() {
        return this.f17539a0;
    }

    public int getFabAnimationMode() {
        return this.f17538W;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f17574c;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f17573b;
    }

    public boolean getHideOnScroll() {
        return this.f17542d0;
    }

    public int getMenuAlignmentMode() {
        return this.f17541c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m10309c(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!z) {
            m9829H();
            return;
        }
        Animator animator = this.f17536U;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f17535T;
        if (animator2 != null) {
            animator2.cancel();
        }
        m9830I();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        this.f17537V = savedState.f17571d;
        this.f17546h0 = savedState.f17572e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17571d = this.f17537V;
        savedState.f17572e = this.f17546h0;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.m1842n(null, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f2) {
        if (f2 != getCradleVerticalOffset()) {
            BottomAppBarTopEdgeTreatment topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.f17576e = f2;
            throw null;
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(final int i2) {
        this.f17544f0 = 0;
        this.f17545g0 = true;
        m9828G(i2, this.f17546h0);
        if (this.f17537V != i2 && ViewCompat.m2174N(this)) {
            Animator animator = this.f17535T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f17538W == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m9823B(), "translationX", m9826E(i2));
                ofFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton m9823B = m9823B();
                if (m9823B != null && !m9823B.m10064j()) {
                    this.f17543e0++;
                    m9823B.m10063i(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
                        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                        /* renamed from: a */
                        public void mo9834a(@NonNull FloatingActionButton floatingActionButton) {
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            int i3 = i2;
                            int i4 = BottomAppBar.f17533m0;
                            floatingActionButton.setTranslationX(bottomAppBar.m9826E(i3));
                            floatingActionButton.m10069o(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                                /* renamed from: b */
                                public void mo9835b(FloatingActionButton floatingActionButton2) {
                                    BottomAppBar.m9820x(BottomAppBar.this);
                                }
                            }, true);
                        }
                    }, true);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17342a));
            this.f17535T = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    BottomAppBar.m9820x(BottomAppBar.this);
                    BottomAppBar.this.f17535T = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    BottomAppBar.this.f17543e0++;
                }
            });
            this.f17535T.start();
        }
        this.f17537V = i2;
    }

    public void setFabAlignmentModeEndMargin(@Px int i2) {
        if (this.f17540b0 == i2) {
            return;
        }
        this.f17540b0 = i2;
        m9830I();
        throw null;
    }

    public void setFabAnchorMode(int i2) {
        this.f17539a0 = i2;
        m9830I();
        throw null;
    }

    public void setFabAnimationMode(int i2) {
        this.f17538W = i2;
    }

    public void setFabCornerSize(@Dimension float f2) {
        if (f2 == getTopEdgeTreatment().f17578g) {
            return;
        }
        getTopEdgeTreatment().f17578g = f2;
        throw null;
    }

    public void setFabCradleMargin(@Dimension float f2) {
        if (f2 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f17574c = f2;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f2) {
        if (f2 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f17573b = f2;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f17542d0 = z;
    }

    public void setMenuAlignmentMode(int i2) {
        if (this.f17541c0 != i2) {
            this.f17541c0 = i2;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m9832K(actionMenuView, this.f17537V, m9827F());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f17534S != null) {
            drawable = DrawableCompat.m1845q(drawable.mutate());
            DrawableCompat.m1841m(drawable, this.f17534S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i2) {
        this.f17534S = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f17547i0 == null) {
            this.f17547i0 = new Behavior();
        }
        return this.f17547i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j */
        @NonNull
        public final Rect f17566j;

        /* renamed from: k */
        public WeakReference<BottomAppBar> f17567k;

        /* renamed from: l */
        public int f17568l;

        /* renamed from: m */
        public final View.OnLayoutChangeListener f17569m;

        public Behavior() {
            this.f17569m = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    BottomAppBar bottomAppBar = Behavior.this.f17567k.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        Rect rect = Behavior.this.f17566j;
                        rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        floatingActionButton.m10066l(rect);
                        int height2 = Behavior.this.f17566j.height();
                        bottomAppBar.m9831J(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f18688e.mo10265a(new RectF(Behavior.this.f17566j)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.f17568l == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        int i10 = bottomAppBar.f17539a0;
                        if (i10 == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.m10171h(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += 0;
                        }
                    }
                }
            };
            this.f17566j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h */
        public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
            final BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f17567k = new WeakReference<>(bottomAppBar);
            int i3 = BottomAppBar.f17533m0;
            View m9824C = bottomAppBar.m9824C();
            if (m9824C == null || ViewCompat.m2174N(m9824C)) {
                coordinatorLayout.m1486u(bottomAppBar, i2);
                super.mo1499h(coordinatorLayout, bottomAppBar, i2);
                return false;
            }
            BottomAppBar.m9819L(bottomAppBar, m9824C);
            this.f17568l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) m9824C.getLayoutParams())).bottomMargin;
            if (m9824C instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) m9824C;
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(C2507R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(C2507R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.m10058d(null);
                floatingActionButton.m10059e(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Objects.requireNonNull(BottomAppBar.this);
                        throw null;
                    }
                });
                floatingActionButton.m10060f(null);
            }
            m9824C.addOnLayoutChangeListener(this.f17569m);
            bottomAppBar.m9830I();
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p */
        public boolean mo1507p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i2, int i3) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i2 == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17569m = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    BottomAppBar bottomAppBar = Behavior.this.f17567k.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        Rect rect = Behavior.this.f17566j;
                        rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        floatingActionButton.m10066l(rect);
                        int height2 = Behavior.this.f17566j.height();
                        bottomAppBar.m9831J(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f18688e.mo10265a(new RectF(Behavior.this.f17566j)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.f17568l == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        int i10 = bottomAppBar.f17539a0;
                        if (i10 == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.m10171h(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += 0;
                        }
                    }
                }
            };
            this.f17566j = new Rect();
        }
    }
}

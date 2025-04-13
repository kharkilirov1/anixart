package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C1195R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public final int f18809a;

    /* renamed from: b */
    public final int f18810b;

    /* renamed from: c */
    public final int f18811c;

    /* renamed from: d */
    public final TimeInterpolator f18812d;

    /* renamed from: e */
    public final TimeInterpolator f18813e;

    /* renamed from: f */
    public final TimeInterpolator f18814f;

    /* renamed from: g */
    @NonNull
    public final ViewGroup f18815g;

    /* renamed from: h */
    public final Context f18816h;

    /* renamed from: i */
    @NonNull
    public final SnackbarBaseLayout f18817i;

    /* renamed from: j */
    @NonNull
    public final com.google.android.material.snackbar.ContentViewCallback f18818j;

    /* renamed from: k */
    public int f18819k;

    /* renamed from: m */
    public int f18821m;

    /* renamed from: n */
    public int f18822n;

    /* renamed from: o */
    public int f18823o;

    /* renamed from: p */
    public int f18824p;

    /* renamed from: q */
    public boolean f18825q;

    /* renamed from: r */
    @Nullable
    public final AccessibilityManager f18826r;

    /* renamed from: t */
    public static final TimeInterpolator f18803t = AnimationUtils.f17343b;

    /* renamed from: u */
    public static final TimeInterpolator f18804u = AnimationUtils.f17342a;

    /* renamed from: v */
    public static final TimeInterpolator f18805v = AnimationUtils.f17345d;

    /* renamed from: x */
    public static final int[] f18807x = {C2507R.attr.snackbarStyle};

    /* renamed from: y */
    public static final String f18808y = "BaseTransientBottomBar";

    /* renamed from: w */
    @NonNull
    public static final Handler f18806w = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i2 = message.what;
            if (i2 != 0) {
                if (i2 != 1) {
                    return false;
                }
                final BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                final int i3 = message.arg1;
                if (!baseTransientBottomBar.m10369f() || baseTransientBottomBar.f18817i.getVisibility() != 0) {
                    baseTransientBottomBar.m10367d(i3);
                } else if (baseTransientBottomBar.f18817i.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(baseTransientBottomBar.f18812d);
                    ofFloat.addUpdateListener(new C137811());
                    ofFloat.setDuration(baseTransientBottomBar.f18810b);
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.m10367d(i3);
                        }
                    });
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar.m10366c());
                    valueAnimator.setInterpolator(baseTransientBottomBar.f18813e);
                    valueAnimator.setDuration(baseTransientBottomBar.f18811c);
                    valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.m10367d(i3);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                            baseTransientBottomBar2.f18818j.mo10376b(0, baseTransientBottomBar2.f18810b);
                        }
                    });
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.16
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                            int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            TimeInterpolator timeInterpolator = BaseTransientBottomBar.f18803t;
                            BaseTransientBottomBar.this.f18817i.setTranslationY(intValue);
                        }
                    });
                    valueAnimator.start();
                }
                return true;
            }
            final BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar2.f18817i.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f18817i.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                    Behavior behavior = new Behavior();
                    BehaviorDelegate behaviorDelegate = behavior.f18845i;
                    Objects.requireNonNull(behaviorDelegate);
                    behaviorDelegate.f18846a = baseTransientBottomBar2.f18827s;
                    behavior.f17519b = new SwipeDismissBehavior.OnDismissListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
                        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                        /* renamed from: a */
                        public void mo9816a(@NonNull View view) {
                            if (view.getParent() != null) {
                                view.setVisibility(8);
                            }
                            BaseTransientBottomBar.this.m10365b(0);
                        }

                        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                        /* renamed from: b */
                        public void mo9817b(int i4) {
                            if (i4 == 0) {
                                SnackbarManager.m10382b().m10387f(BaseTransientBottomBar.this.f18827s);
                            } else if (i4 == 1 || i4 == 2) {
                                SnackbarManager.m10382b().m10386e(BaseTransientBottomBar.this.f18827s);
                            }
                        }
                    };
                    layoutParams2.m1511b(behavior);
                    layoutParams2.f3076g = 80;
                }
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar2.f18817i;
                ViewGroup viewGroup = baseTransientBottomBar2.f18815g;
                snackbarBaseLayout.f18858l = true;
                viewGroup.addView(snackbarBaseLayout);
                snackbarBaseLayout.f18858l = false;
                baseTransientBottomBar2.f18817i.setVisibility(4);
            }
            if (ViewCompat.m2174N(baseTransientBottomBar2.f18817i)) {
                baseTransientBottomBar2.m10370g();
            } else {
                baseTransientBottomBar2.f18825q = true;
            }
            return true;
        }
    });

    /* renamed from: l */
    @RequiresApi
    public final Runnable f18820l = new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
        @Override // java.lang.Runnable
        public void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f18817i == null || (context = baseTransientBottomBar.f18816h) == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
            int[] iArr = new int[2];
            baseTransientBottomBar2.f18817i.getLocationOnScreen(iArr);
            int height = (i2 - (baseTransientBottomBar2.f18817i.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f18817i.getTranslationY());
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            if (height >= baseTransientBottomBar3.f18824p) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f18817i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f18808y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.bottomMargin;
            BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
            marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f18824p - height) + i3;
            baseTransientBottomBar4.f18817i.requestLayout();
        }
    };

    /* renamed from: s */
    @NonNull
    public SnackbarManager.Callback f18827s = new SnackbarManager.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        /* renamed from: a */
        public void mo10372a() {
            Handler handler = BaseTransientBottomBar.f18806w;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        /* renamed from: b */
        public void mo10373b(int i2) {
            Handler handler = BaseTransientBottomBar.f18806w;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11 */
    class C137811 implements ValueAnimator.AnimatorUpdateListener {
        public C137811() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f18817i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DismissEvent {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i */
        @NonNull
        public final BehaviorDelegate f18845i = new BehaviorDelegate(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: g */
        public boolean mo1498g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            BehaviorDelegate behaviorDelegate = this.f18845i;
            Objects.requireNonNull(behaviorDelegate);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.m10382b().m10387f(behaviorDelegate.f18846a);
                }
            } else if (coordinatorLayout.m1484s(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                SnackbarManager.m10382b().m10386e(behaviorDelegate.f18846a);
            }
            return super.mo1498g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: s */
        public boolean mo9815s(View view) {
            Objects.requireNonNull(this.f18845i);
            return view instanceof SnackbarBaseLayout;
        }
    }

    @RestrictTo
    public static class BehaviorDelegate {

        /* renamed from: a */
        public SnackbarManager.Callback f18846a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f17523f = SwipeDismissBehavior.m9814t(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f17524g = SwipeDismissBehavior.m9814t(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.f17521d = 0;
        }
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Duration {
    }

    @RestrictTo
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: m */
        public static final View.OnTouchListener f18847m = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };

        /* renamed from: b */
        @Nullable
        public BaseTransientBottomBar<?> f18848b;

        /* renamed from: c */
        @Nullable
        public ShapeAppearanceModel f18849c;

        /* renamed from: d */
        public int f18850d;

        /* renamed from: e */
        public final float f18851e;

        /* renamed from: f */
        public final float f18852f;

        /* renamed from: g */
        public final int f18853g;

        /* renamed from: h */
        public final int f18854h;

        /* renamed from: i */
        public ColorStateList f18855i;

        /* renamed from: j */
        public PorterDuff.Mode f18856j;

        /* renamed from: k */
        @Nullable
        public Rect f18857k;

        /* renamed from: l */
        public boolean f18858l;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.m10534a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Drawable m1845q;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1195R.styleable.f17309J);
            if (obtainStyledAttributes.hasValue(6)) {
                ViewCompat.m2212m0(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f18850d = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f18849c = ShapeAppearanceModel.m10313c(context2, attributeSet, 0, 0).m10320a();
            }
            this.f18851e = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(MaterialResources.m10240a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(ViewUtils.m10172i(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f18852f = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f18853g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f18854h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f18847m);
            setFocusable(true);
            if (getBackground() == null) {
                int m9973f = MaterialColors.m9973f(MaterialColors.m9971d(this, C2507R.attr.colorSurface), MaterialColors.m9971d(this, C2507R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
                ShapeAppearanceModel shapeAppearanceModel = this.f18849c;
                if (shapeAppearanceModel != null) {
                    TimeInterpolator timeInterpolator = BaseTransientBottomBar.f18803t;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.m10301x(ColorStateList.valueOf(m9973f));
                    gradientDrawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    TimeInterpolator timeInterpolator2 = BaseTransientBottomBar.f18803t;
                    float dimension = resources.getDimension(C2507R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(m9973f);
                    gradientDrawable = gradientDrawable2;
                }
                if (this.f18855i != null) {
                    m1845q = DrawableCompat.m1845q(gradientDrawable);
                    DrawableCompat.m1842n(m1845q, this.f18855i);
                } else {
                    m1845q = DrawableCompat.m1845q(gradientDrawable);
                }
                ViewCompat.m2204i0(this, m1845q);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f18848b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f18852f;
        }

        public int getAnimationMode() {
            return this.f18850d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f18851e;
        }

        public int getMaxInlineActionWidth() {
            return this.f18854h;
        }

        public int getMaxWidth() {
            return this.f18853g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18848b;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.f18817i.getRootWindowInsets()) != null) {
                    baseTransientBottomBar.f18824p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    baseTransientBottomBar.m10371h();
                }
            }
            ViewCompat.m2192c0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            final BaseTransientBottomBar<?> baseTransientBottomBar = this.f18848b;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                SnackbarManager m10382b = SnackbarManager.m10382b();
                SnackbarManager.Callback callback = baseTransientBottomBar.f18827s;
                synchronized (m10382b.f18867a) {
                    z = m10382b.m10384c(callback) || m10382b.m10385d(callback);
                }
                if (z) {
                    BaseTransientBottomBar.f18806w.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
                        @Override // java.lang.Runnable
                        public void run() {
                            BaseTransientBottomBar.this.m10367d(3);
                        }
                    });
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18848b;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f18825q) {
                return;
            }
            baseTransientBottomBar.m10370g();
            baseTransientBottomBar.f18825q = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (this.f18853g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = this.f18853g;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        public void setAnimationMode(int i2) {
            this.f18850d = i2;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f18855i != null) {
                drawable = DrawableCompat.m1845q(drawable.mutate());
                DrawableCompat.m1842n(drawable, this.f18855i);
                DrawableCompat.m1843o(drawable, this.f18856j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f18855i = colorStateList;
            if (getBackground() != null) {
                Drawable m1845q = DrawableCompat.m1845q(getBackground().mutate());
                DrawableCompat.m1842n(m1845q, colorStateList);
                DrawableCompat.m1843o(m1845q, this.f18856j);
                if (m1845q != getBackground()) {
                    super.setBackgroundDrawable(m1845q);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f18856j = mode;
            if (getBackground() != null) {
                Drawable m1845q = DrawableCompat.m1845q(getBackground().mutate());
                DrawableCompat.m1843o(m1845q, mode);
                if (m1845q != getBackground()) {
                    super.setBackgroundDrawable(m1845q);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f18858l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f18857k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f18848b;
            if (baseTransientBottomBar != null) {
                TimeInterpolator timeInterpolator = BaseTransientBottomBar.f18803t;
                baseTransientBottomBar.m10371h();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f18847m);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f18815g = viewGroup;
        this.f18818j = contentViewCallback;
        this.f18816h = context;
        ThemeEnforcement.m10158c(context, ThemeEnforcement.f18359a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f18807x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) from.inflate(resourceId != -1 ? C2507R.layout.mtrl_layout_snackbar : C2507R.layout.design_layout_snackbar, viewGroup, false);
        this.f18817i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f18863c.setTextColor(MaterialColors.m9973f(MaterialColors.m9971d(snackbarContentLayout, C2507R.attr.colorSurface), snackbarContentLayout.f18863c.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        ViewCompat.m2200g0(snackbarBaseLayout, 1);
        ViewCompat.m2216o0(snackbarBaseLayout, 1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        ViewCompat.m2224s0(snackbarBaseLayout, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            /* renamed from: a */
            public WindowInsetsCompat mo433a(View view2, @NonNull WindowInsetsCompat windowInsetsCompat) {
                BaseTransientBottomBar.this.f18821m = windowInsetsCompat.m2425f();
                BaseTransientBottomBar.this.f18822n = windowInsetsCompat.m2426g();
                BaseTransientBottomBar.this.f18823o = windowInsetsCompat.m2427h();
                BaseTransientBottomBar.this.m10371h();
                return windowInsetsCompat;
            }
        });
        ViewCompat.m2196e0(snackbarBaseLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.f3743a.addAction(1048576);
                accessibilityNodeInfoCompat.f3743a.setDismissable(true);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: g */
            public boolean mo2047g(View view2, int i2, Bundle bundle) {
                if (i2 != 1048576) {
                    return super.mo2047g(view2, i2, bundle);
                }
                BaseTransientBottomBar.this.mo10364a();
                return true;
            }
        });
        this.f18826r = (AccessibilityManager) context.getSystemService("accessibility");
        this.f18811c = MotionUtils.m10184c(context, C2507R.attr.motionDurationLong2, 250);
        this.f18809a = MotionUtils.m10184c(context, C2507R.attr.motionDurationLong2, 150);
        this.f18810b = MotionUtils.m10184c(context, C2507R.attr.motionDurationMedium1, 75);
        this.f18812d = MotionUtils.m10185d(context, C2507R.attr.motionEasingEmphasizedInterpolator, f18804u);
        this.f18814f = MotionUtils.m10185d(context, C2507R.attr.motionEasingEmphasizedInterpolator, f18805v);
        this.f18813e = MotionUtils.m10185d(context, C2507R.attr.motionEasingEmphasizedInterpolator, f18803t);
    }

    /* renamed from: a */
    public void mo10364a() {
        m10365b(3);
    }

    /* renamed from: b */
    public void m10365b(int i2) {
        SnackbarManager m10382b = SnackbarManager.m10382b();
        SnackbarManager.Callback callback = this.f18827s;
        synchronized (m10382b.f18867a) {
            if (m10382b.m10384c(callback)) {
                m10382b.m10383a(m10382b.f18869c, i2);
            } else if (m10382b.m10385d(callback)) {
                m10382b.m10383a(m10382b.f18870d, i2);
            }
        }
    }

    /* renamed from: c */
    public final int m10366c() {
        int height = this.f18817i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f18817i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: d */
    public void m10367d(int i2) {
        SnackbarManager m10382b = SnackbarManager.m10382b();
        SnackbarManager.Callback callback = this.f18827s;
        synchronized (m10382b.f18867a) {
            if (m10382b.m10384c(callback)) {
                m10382b.f18869c = null;
                if (m10382b.f18870d != null) {
                    m10382b.m10389h();
                }
            }
        }
        ViewParent parent = this.f18817i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f18817i);
        }
    }

    /* renamed from: e */
    public void m10368e() {
        SnackbarManager m10382b = SnackbarManager.m10382b();
        SnackbarManager.Callback callback = this.f18827s;
        synchronized (m10382b.f18867a) {
            if (m10382b.m10384c(callback)) {
                m10382b.m10388g(m10382b.f18869c);
            }
        }
    }

    /* renamed from: f */
    public boolean m10369f() {
        AccessibilityManager accessibilityManager = this.f18826r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: g */
    public final void m10370g() {
        if (m10369f()) {
            this.f18817i.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
                @Override // java.lang.Runnable
                public void run() {
                    SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f18817i;
                    if (snackbarBaseLayout == null) {
                        return;
                    }
                    if (snackbarBaseLayout.getParent() != null) {
                        BaseTransientBottomBar.this.f18817i.setVisibility(0);
                    }
                    if (BaseTransientBottomBar.this.f18817i.getAnimationMode() != 1) {
                        final BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                        int m10366c = baseTransientBottomBar.m10366c();
                        baseTransientBottomBar.f18817i.setTranslationY(m10366c);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(m10366c, 0);
                        valueAnimator.setInterpolator(baseTransientBottomBar.f18813e);
                        valueAnimator.setDuration(baseTransientBottomBar.f18811c);
                        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                BaseTransientBottomBar.this.m10368e();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                                com.google.android.material.snackbar.ContentViewCallback contentViewCallback = baseTransientBottomBar2.f18818j;
                                int i2 = baseTransientBottomBar2.f18811c;
                                int i3 = baseTransientBottomBar2.f18809a;
                                contentViewCallback.mo10375a(i2 - i3, i3);
                            }
                        });
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(m10366c) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                TimeInterpolator timeInterpolator = BaseTransientBottomBar.f18803t;
                                BaseTransientBottomBar.this.f18817i.setTranslationY(intValue);
                            }
                        });
                        valueAnimator.start();
                        return;
                    }
                    final BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    Objects.requireNonNull(baseTransientBottomBar2);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(baseTransientBottomBar2.f18812d);
                    ofFloat.addUpdateListener(new C137811());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat2.setInterpolator(baseTransientBottomBar2.f18814f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            BaseTransientBottomBar.this.f18817i.setScaleX(floatValue);
                            BaseTransientBottomBar.this.f18817i.setScaleY(floatValue);
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(baseTransientBottomBar2.f18809a);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.m10368e();
                        }
                    });
                    animatorSet.start();
                }
            });
            return;
        }
        if (this.f18817i.getParent() != null) {
            this.f18817i.setVisibility(0);
        }
        m10368e();
    }

    /* renamed from: h */
    public final void m10371h() {
        ViewGroup.LayoutParams layoutParams = this.f18817i.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            SnackbarBaseLayout snackbarBaseLayout = this.f18817i;
            if (snackbarBaseLayout.f18857k != null) {
                if (snackbarBaseLayout.getParent() == null) {
                    return;
                }
                int i2 = this.f18821m;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                SnackbarBaseLayout snackbarBaseLayout2 = this.f18817i;
                Rect rect = snackbarBaseLayout2.f18857k;
                marginLayoutParams.bottomMargin = rect.bottom + i2;
                marginLayoutParams.leftMargin = rect.left + this.f18822n;
                marginLayoutParams.rightMargin = rect.right + this.f18823o;
                marginLayoutParams.topMargin = rect.top;
                snackbarBaseLayout2.requestLayout();
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z = false;
                    if (this.f18824p > 0) {
                        ViewGroup.LayoutParams layoutParams2 = this.f18817i.getLayoutParams();
                        if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).f3070a instanceof SwipeDismissBehavior)) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.f18817i.removeCallbacks(this.f18820l);
                        this.f18817i.post(this.f18820l);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.w(f18808y, "Unable to update margins because layout params are not MarginLayoutParams");
    }
}

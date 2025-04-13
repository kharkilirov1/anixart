package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {

    /* renamed from: F */
    public static final int[] f18390F = {R.attr.state_checked};

    /* renamed from: G */
    public static final ActiveIndicatorTransform f18391G = new ActiveIndicatorTransform(null);

    /* renamed from: H */
    public static final ActiveIndicatorTransform f18392H = new ActiveIndicatorUnlabeledTransform(null);

    /* renamed from: A */
    public int f18393A;

    /* renamed from: B */
    public int f18394B;

    /* renamed from: C */
    public boolean f18395C;

    /* renamed from: D */
    public int f18396D;

    /* renamed from: E */
    @Nullable
    public BadgeDrawable f18397E;

    /* renamed from: b */
    public boolean f18398b;

    /* renamed from: c */
    public ColorStateList f18399c;

    /* renamed from: d */
    @Nullable
    public Drawable f18400d;

    /* renamed from: e */
    public int f18401e;

    /* renamed from: f */
    public int f18402f;

    /* renamed from: g */
    public float f18403g;

    /* renamed from: h */
    public float f18404h;

    /* renamed from: i */
    public float f18405i;

    /* renamed from: j */
    public int f18406j;

    /* renamed from: k */
    public boolean f18407k;

    /* renamed from: l */
    @Nullable
    public final FrameLayout f18408l;

    /* renamed from: m */
    @Nullable
    public final View f18409m;

    /* renamed from: n */
    public final ImageView f18410n;

    /* renamed from: o */
    public final ViewGroup f18411o;

    /* renamed from: p */
    public final TextView f18412p;

    /* renamed from: q */
    public final TextView f18413q;

    /* renamed from: r */
    public int f18414r;

    /* renamed from: s */
    @Nullable
    public MenuItemImpl f18415s;

    /* renamed from: t */
    @Nullable
    public ColorStateList f18416t;

    /* renamed from: u */
    @Nullable
    public Drawable f18417u;

    /* renamed from: v */
    @Nullable
    public Drawable f18418v;

    /* renamed from: w */
    public ValueAnimator f18419w;

    /* renamed from: x */
    public ActiveIndicatorTransform f18420x;

    /* renamed from: y */
    public float f18421y;

    /* renamed from: z */
    public boolean f18422z;

    public static class ActiveIndicatorTransform {
        public ActiveIndicatorTransform() {
        }

        /* renamed from: a */
        public float mo10197a(@FloatRange float f2, @FloatRange float f3) {
            return 1.0f;
        }

        public ActiveIndicatorTransform(ViewOnLayoutChangeListenerC13341 viewOnLayoutChangeListenerC13341) {
        }
    }

    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        public ActiveIndicatorUnlabeledTransform() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        /* renamed from: a */
        public float mo10197a(float f2, float f3) {
            return AnimationUtils.m9737a(0.4f, 1.0f, f2);
        }

        public ActiveIndicatorUnlabeledTransform(ViewOnLayoutChangeListenerC13341 viewOnLayoutChangeListenerC13341) {
            super(null);
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f18398b = false;
        this.f18414r = -1;
        this.f18420x = f18391G;
        this.f18421y = 0.0f;
        this.f18422z = false;
        this.f18393A = 0;
        this.f18394B = 0;
        this.f18395C = false;
        this.f18396D = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f18408l = (FrameLayout) findViewById(C2507R.id.navigation_bar_item_icon_container);
        this.f18409m = findViewById(C2507R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C2507R.id.navigation_bar_item_icon_view);
        this.f18410n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C2507R.id.navigation_bar_item_labels_group);
        this.f18411o = viewGroup;
        TextView textView = (TextView) findViewById(C2507R.id.navigation_bar_item_small_label_view);
        this.f18412p = textView;
        TextView textView2 = (TextView) findViewById(C2507R.id.navigation_bar_item_large_label_view);
        this.f18413q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f18401e = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f18402f = viewGroup.getPaddingBottom();
        ViewCompat.m2216o0(textView, 2);
        ViewCompat.m2216o0(textView2, 2);
        setFocusable(true);
        m10190a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (NavigationBarItemView.this.f18410n.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        ImageView imageView2 = navigationBarItemView.f18410n;
                        if (navigationBarItemView.m10191b()) {
                            BadgeUtils.m9810c(navigationBarItemView.f18397E, imageView2, null);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10186g(android.widget.TextView r4, @androidx.annotation.StyleRes int r5) {
        /*
            androidx.core.widget.TextViewCompat.m2649k(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = 0
            goto L59
        Lc:
            int[] r2 = com.google.android.material.C1195R.styleable.f17311L
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L2c
            int r5 = r2.getComplexUnit()
            goto L31
        L2c:
            int r5 = r2.data
            int r5 = r5 >> r1
            r5 = r5 & 15
        L31:
            r3 = 2
            if (r5 != r3) goto L4b
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L59
        L4b:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L59:
            if (r5 == 0) goto L5f
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.m10186g(android.widget.TextView, int):void");
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f18408l;
        return frameLayout != null ? frameLayout : this.f18410n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < indexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        return i2;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.f18397E;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.f18410n.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.f18397E;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.f18397E.f17471f.f17484b.f17500n.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f18410n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* renamed from: h */
    public static void m10187h(@NonNull View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    /* renamed from: i */
    public static void m10188i(@NonNull View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: l */
    public static void m10189l(@NonNull View view, int i2) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
    }

    /* renamed from: a */
    public final void m10190a(float f2, float f3) {
        this.f18403g = f2 - f3;
        this.f18404h = (f3 * 1.0f) / f2;
        this.f18405i = (f2 * 1.0f) / f3;
    }

    /* renamed from: b */
    public final boolean m10191b() {
        return this.f18397E != null;
    }

    /* renamed from: c */
    public final void m10192c() {
        MenuItemImpl menuItemImpl = this.f18415s;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* renamed from: d */
    public final void m10193d() {
        Drawable drawable = this.f18400d;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f18399c != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f18422z && getActiveIndicatorDrawable() != null && this.f18408l != null && activeIndicatorDrawable != null) {
                z = false;
                rippleDrawable = new RippleDrawable(RippleUtils.m10258d(this.f18399c), null, activeIndicatorDrawable);
            } else if (drawable == null) {
                drawable = new RippleDrawable(RippleUtils.m10255a(this.f18399c), null, null);
            }
        }
        FrameLayout frameLayout = this.f18408l;
        if (frameLayout != null) {
            ViewCompat.m2204i0(frameLayout, rippleDrawable);
        }
        ViewCompat.m2204i0(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f18408l;
        if (frameLayout != null && this.f18422z) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m10194e(@FloatRange float f2, float f3) {
        View view = this.f18409m;
        if (view != null) {
            ActiveIndicatorTransform activeIndicatorTransform = this.f18420x;
            Objects.requireNonNull(activeIndicatorTransform);
            view.setScaleX(AnimationUtils.m9737a(0.4f, 1.0f, f2));
            view.setScaleY(activeIndicatorTransform.mo10197a(f2, f3));
            view.setAlpha(AnimationUtils.m9738b(0.0f, 1.0f, f3 == 0.0f ? 0.8f : 0.0f, f3 == 0.0f ? 1.0f : 0.2f, f2));
        }
        this.f18421y = f2;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /* renamed from: f */
    public void mo550f(@NonNull MenuItemImpl menuItemImpl, int i2) {
        this.f18415s = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.f899e);
        setId(menuItemImpl.f895a);
        if (!TextUtils.isEmpty(menuItemImpl.f911q)) {
            setContentDescription(menuItemImpl.f911q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(menuItemImpl.f912r) ? menuItemImpl.f912r : menuItemImpl.f899e;
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.m998a(this, charSequence);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.f18398b = true;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f18409m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f18397E;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return C2507R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.f18415s;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return C2507R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f18414r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18411o.getLayoutParams();
        return this.f18411o.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18411o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f18411o.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    /* renamed from: j */
    public final void m10195j(@Nullable View view) {
        if (m10191b()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.m9809b(this.f18397E, view);
            }
            this.f18397E = null;
        }
    }

    /* renamed from: k */
    public final void m10196k(int i2) {
        if (this.f18409m == null) {
            return;
        }
        int min = Math.min(this.f18393A, i2 - (this.f18396D * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18409m.getLayoutParams();
        layoutParams.height = this.f18395C && this.f18406j == 2 ? min : this.f18394B;
        layoutParams.width = min;
        this.f18409m.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemImpl menuItemImpl = this.f18415s;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f18415s.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f18390F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f18397E;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            MenuItemImpl menuItemImpl = this.f18415s;
            CharSequence charSequence = menuItemImpl.f899e;
            if (!TextUtils.isEmpty(menuItemImpl.f911q)) {
                charSequence = this.f18415s.f911q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f18397E.m9802c()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f3762a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3748g);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(C2507R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(final int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                int i6 = i2;
                int[] iArr = NavigationBarItemView.f18390F;
                navigationBarItemView.m10196k(i6);
            }
        });
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f18409m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m10193d();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f18422z = z;
        m10193d();
        View view = this.f18409m;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i2) {
        this.f18394B = i2;
        m10196k(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i2) {
        this.f18396D = i2;
        m10196k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f18395C = z;
    }

    public void setActiveIndicatorWidth(int i2) {
        this.f18393A = i2;
        m10196k(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.f18397E == badgeDrawable) {
            return;
        }
        if (m10191b() && this.f18410n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m10195j(this.f18410n);
        }
        this.f18397E = badgeDrawable;
        ImageView imageView = this.f18410n;
        if (imageView == null || !m10191b() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeUtils.m9808a(this.f18397E, imageView, null);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f18413q.setPivotX(r0.getWidth() / 2);
        this.f18413q.setPivotY(r0.getBaseline());
        this.f18412p.setPivotX(r0.getWidth() / 2);
        this.f18412p.setPivotY(r0.getBaseline());
        final float f2 = z ? 1.0f : 0.0f;
        if (this.f18422z && this.f18398b && ViewCompat.m2173M(this)) {
            ValueAnimator valueAnimator = this.f18419w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f18419w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f18421y, f2);
            this.f18419w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                    float f3 = f2;
                    int[] iArr = NavigationBarItemView.f18390F;
                    navigationBarItemView.m10194e(floatValue, f3);
                }
            });
            this.f18419w.setInterpolator(MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17343b));
            this.f18419w.setDuration(MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationLong2, getResources().getInteger(C2507R.integer.material_motion_duration_long_1)));
            this.f18419w.start();
        } else {
            m10194e(f2, f2);
        }
        int i2 = this.f18406j;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    m10188i(getIconOrContainer(), this.f18401e, 49);
                    m10189l(this.f18411o, this.f18402f);
                    this.f18413q.setVisibility(0);
                } else {
                    m10188i(getIconOrContainer(), this.f18401e, 17);
                    m10189l(this.f18411o, 0);
                    this.f18413q.setVisibility(4);
                }
                this.f18412p.setVisibility(4);
            } else if (i2 == 1) {
                m10189l(this.f18411o, this.f18402f);
                if (z) {
                    m10188i(getIconOrContainer(), (int) (this.f18401e + this.f18403g), 49);
                    m10187h(this.f18413q, 1.0f, 1.0f, 0);
                    TextView textView = this.f18412p;
                    float f3 = this.f18404h;
                    m10187h(textView, f3, f3, 4);
                } else {
                    m10188i(getIconOrContainer(), this.f18401e, 49);
                    TextView textView2 = this.f18413q;
                    float f4 = this.f18405i;
                    m10187h(textView2, f4, f4, 4);
                    m10187h(this.f18412p, 1.0f, 1.0f, 0);
                }
            } else if (i2 == 2) {
                m10188i(getIconOrContainer(), this.f18401e, 17);
                this.f18413q.setVisibility(8);
                this.f18412p.setVisibility(8);
            }
        } else if (this.f18407k) {
            if (z) {
                m10188i(getIconOrContainer(), this.f18401e, 49);
                m10189l(this.f18411o, this.f18402f);
                this.f18413q.setVisibility(0);
            } else {
                m10188i(getIconOrContainer(), this.f18401e, 17);
                m10189l(this.f18411o, 0);
                this.f18413q.setVisibility(4);
            }
            this.f18412p.setVisibility(4);
        } else {
            m10189l(this.f18411o, this.f18402f);
            if (z) {
                m10188i(getIconOrContainer(), (int) (this.f18401e + this.f18403g), 49);
                m10187h(this.f18413q, 1.0f, 1.0f, 0);
                TextView textView3 = this.f18412p;
                float f5 = this.f18404h;
                m10187h(textView3, f5, f5, 4);
            } else {
                m10188i(getIconOrContainer(), this.f18401e, 49);
                TextView textView4 = this.f18413q;
                float f6 = this.f18405i;
                m10187h(textView4, f6, f6, 4);
                m10187h(this.f18412p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f18412p.setEnabled(z);
        this.f18413q.setEnabled(z);
        this.f18410n.setEnabled(z);
        if (z) {
            ViewCompat.m2228u0(this, PointerIconCompat.m2151a(getContext(), 1002));
        } else {
            ViewCompat.m2228u0(this, null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f18417u) {
            return;
        }
        this.f18417u = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.m1845q(drawable).mutate();
            this.f18418v = drawable;
            ColorStateList colorStateList = this.f18416t;
            if (colorStateList != null) {
                DrawableCompat.m1842n(drawable, colorStateList);
            }
        }
        this.f18410n.setImageDrawable(drawable);
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18410n.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f18410n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f18416t = colorStateList;
        if (this.f18415s == null || (drawable = this.f18418v) == null) {
            return;
        }
        DrawableCompat.m1842n(drawable, colorStateList);
        this.f18418v.invalidateSelf();
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : ContextCompat.m1671d(getContext(), i2));
    }

    public void setItemPaddingBottom(int i2) {
        if (this.f18402f != i2) {
            this.f18402f = i2;
            m10192c();
        }
    }

    public void setItemPaddingTop(int i2) {
        if (this.f18401e != i2) {
            this.f18401e = i2;
            m10192c();
        }
    }

    public void setItemPosition(int i2) {
        this.f18414r = i2;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f18399c = colorStateList;
        m10193d();
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f18406j != i2) {
            this.f18406j = i2;
            if (this.f18395C && i2 == 2) {
                this.f18420x = f18392H;
            } else {
                this.f18420x = f18391G;
            }
            m10196k(getWidth());
            m10192c();
        }
    }

    public void setShifting(boolean z) {
        if (this.f18407k != z) {
            this.f18407k = z;
            m10192c();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i2) {
        m10186g(this.f18413q, i2);
        m10190a(this.f18412p.getTextSize(), this.f18413q.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i2) {
        m10186g(this.f18412p, i2);
        m10190a(this.f18412p.getTextSize(), this.f18413q.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f18412p.setTextColor(colorStateList);
            this.f18413q.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f18412p.setText(charSequence);
        this.f18413q.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f18415s;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.f911q)) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f18415s;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.f912r)) {
            charSequence = this.f18415s.f912r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.m998a(this, charSequence);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f18400d = drawable;
        m10193d();
    }
}

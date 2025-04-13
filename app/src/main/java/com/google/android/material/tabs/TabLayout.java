package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.C1195R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@ViewPager.DecorView
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: T */
    public static final Pools.Pool<Tab> f18882T = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    public int f18883A;

    /* renamed from: B */
    public boolean f18884B;

    /* renamed from: C */
    public boolean f18885C;

    /* renamed from: D */
    public int f18886D;

    /* renamed from: E */
    public int f18887E;

    /* renamed from: F */
    public boolean f18888F;

    /* renamed from: G */
    public TabIndicatorInterpolator f18889G;

    /* renamed from: H */
    public final TimeInterpolator f18890H;

    /* renamed from: I */
    @Nullable
    public BaseOnTabSelectedListener f18891I;

    /* renamed from: J */
    public final ArrayList<BaseOnTabSelectedListener> f18892J;

    /* renamed from: K */
    @Nullable
    public BaseOnTabSelectedListener f18893K;

    /* renamed from: L */
    public ValueAnimator f18894L;

    /* renamed from: M */
    @Nullable
    public ViewPager f18895M;

    /* renamed from: N */
    @Nullable
    public PagerAdapter f18896N;

    /* renamed from: O */
    public DataSetObserver f18897O;

    /* renamed from: P */
    public TabLayoutOnPageChangeListener f18898P;

    /* renamed from: Q */
    public AdapterChangeListener f18899Q;

    /* renamed from: R */
    public boolean f18900R;

    /* renamed from: S */
    public final Pools.Pool<TabView> f18901S;

    /* renamed from: b */
    public final ArrayList<Tab> f18902b;

    /* renamed from: c */
    @Nullable
    public Tab f18903c;

    /* renamed from: d */
    @NonNull
    public final SlidingTabIndicator f18904d;

    /* renamed from: e */
    public int f18905e;

    /* renamed from: f */
    public int f18906f;

    /* renamed from: g */
    public int f18907g;

    /* renamed from: h */
    public int f18908h;

    /* renamed from: i */
    public int f18909i;

    /* renamed from: j */
    public ColorStateList f18910j;

    /* renamed from: k */
    public ColorStateList f18911k;

    /* renamed from: l */
    public ColorStateList f18912l;

    /* renamed from: m */
    @NonNull
    public Drawable f18913m;

    /* renamed from: n */
    public int f18914n;

    /* renamed from: o */
    public PorterDuff.Mode f18915o;

    /* renamed from: p */
    public float f18916p;

    /* renamed from: q */
    public float f18917q;

    /* renamed from: r */
    public final int f18918r;

    /* renamed from: s */
    public int f18919s;

    /* renamed from: t */
    public final int f18920t;

    /* renamed from: u */
    public final int f18921u;

    /* renamed from: v */
    public final int f18922v;

    /* renamed from: w */
    public int f18923w;

    /* renamed from: x */
    public int f18924x;

    /* renamed from: y */
    public int f18925y;

    /* renamed from: z */
    public int f18926z;

    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        public boolean f18928a;

        public AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        /* renamed from: a */
        public void mo4342a(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f18895M == viewPager) {
                tabLayout.m10405m(pagerAdapter2, this.f18928a);
            }
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        /* renamed from: a */
        void mo10411a(T t);

        /* renamed from: b */
        void mo10412b(T t);

        /* renamed from: c */
        void mo10413c(T t);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m10402j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m10402j();
        }
    }

    public class SlidingTabIndicator extends LinearLayout {

        /* renamed from: e */
        public static final /* synthetic */ int f18931e = 0;

        /* renamed from: b */
        public ValueAnimator f18932b;

        /* renamed from: c */
        public int f18933c;

        public SlidingTabIndicator(Context context) {
            super(context);
            this.f18933c = -1;
            setWillNotDraw(false);
        }

        /* renamed from: a */
        public final void m10414a() {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            TabLayout tabLayout = TabLayout.this;
            TabIndicatorInterpolator tabIndicatorInterpolator = tabLayout.f18889G;
            Drawable drawable = tabLayout.f18913m;
            Objects.requireNonNull(tabIndicatorInterpolator);
            RectF m10392a = TabIndicatorInterpolator.m10392a(tabLayout, childAt);
            drawable.setBounds((int) m10392a.left, drawable.getBounds().top, (int) m10392a.right, drawable.getBounds().bottom);
        }

        /* renamed from: b */
        public void m10415b(int i2) {
            Rect bounds = TabLayout.this.f18913m.getBounds();
            TabLayout.this.f18913m.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        /* renamed from: c */
        public final void m10416c(View view, View view2, float f2) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f18889G.mo10391b(tabLayout, view, view2, f2, tabLayout.f18913m);
            } else {
                Drawable drawable = TabLayout.this.f18913m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f18913m.getBounds().bottom);
            }
            ViewCompat.m2183W(this);
        }

        /* renamed from: d */
        public final void m10417d(boolean z, int i2, int i3) {
            final View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            final View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                m10414a();
                return;
            }
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                    View view = childAt;
                    View view2 = childAt2;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i4 = SlidingTabIndicator.f18931e;
                    slidingTabIndicator.m10416c(view, view2, animatedFraction);
                }
            };
            if (!z) {
                this.f18932b.removeAllUpdateListeners();
                this.f18932b.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18932b = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f18890H);
            valueAnimator.setDuration(i3);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height = TabLayout.this.f18913m.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f18913m.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.f18926z;
            int i3 = 0;
            if (i2 == 0) {
                i3 = getHeight() - height;
                height = getHeight();
            } else if (i2 == 1) {
                i3 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i2 != 2) {
                height = i2 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f18913m.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f18913m.getBounds();
                TabLayout.this.f18913m.setBounds(bounds.left, i3, bounds.right, height);
                TabLayout.this.f18913m.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f18932b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m10414a();
            } else {
                m10417d(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f18924x == 1 || tabLayout.f18883A == 2) {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                    }
                }
                if (i4 <= 0) {
                    return;
                }
                if (i4 * childCount <= getMeasuredWidth() - (((int) ViewUtils.m10165b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                        if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i4;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f18924x = 0;
                    tabLayout2.m10410r(false);
                }
                if (z) {
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT >= 23 || this.f18933c == i2) {
                return;
            }
            requestLayout();
            this.f18933c = i2;
        }
    }

    public static class Tab {

        /* renamed from: a */
        @Nullable
        public Drawable f18938a;

        /* renamed from: b */
        @Nullable
        public CharSequence f18939b;

        /* renamed from: c */
        @Nullable
        public CharSequence f18940c;

        /* renamed from: e */
        @Nullable
        public View f18942e;

        /* renamed from: f */
        @Nullable
        public TabLayout f18943f;

        /* renamed from: g */
        @NonNull
        public TabView f18944g;

        /* renamed from: d */
        public int f18941d = -1;

        /* renamed from: h */
        public int f18945h = -1;

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: a */
        public Tab m10418a(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f18940c) && !TextUtils.isEmpty(charSequence)) {
                this.f18944g.setContentDescription(charSequence);
            }
            this.f18939b = charSequence;
            m10419b();
            return this;
        }

        /* renamed from: b */
        public void m10419b() {
            TabView tabView = this.f18944g;
            if (tabView != null) {
                tabView.m10425f();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        @NonNull
        public final WeakReference<TabLayout> f18946a;

        /* renamed from: b */
        public int f18947b;

        /* renamed from: c */
        public int f18948c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f18946a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: b */
        public void mo4343b(int i2) {
            TabLayout tabLayout = this.f18946a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f18948c;
            tabLayout.m10404l(tabLayout.m10399g(i2), i3 == 0 || (i3 == 2 && this.f18947b == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
            TabLayout tabLayout = this.f18946a.get();
            if (tabLayout != null) {
                int i4 = this.f18948c;
                tabLayout.m10406n(i2, f2, i4 != 2 || this.f18947b == 1, (i4 == 2 && this.f18947b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
            this.f18947b = this.f18948c;
            this.f18948c = i2;
        }
    }

    public final class TabView extends LinearLayout {

        /* renamed from: m */
        public static final /* synthetic */ int f18949m = 0;

        /* renamed from: b */
        public Tab f18950b;

        /* renamed from: c */
        public TextView f18951c;

        /* renamed from: d */
        public ImageView f18952d;

        /* renamed from: e */
        @Nullable
        public View f18953e;

        /* renamed from: f */
        @Nullable
        public BadgeDrawable f18954f;

        /* renamed from: g */
        @Nullable
        public View f18955g;

        /* renamed from: h */
        @Nullable
        public TextView f18956h;

        /* renamed from: i */
        @Nullable
        public ImageView f18957i;

        /* renamed from: j */
        @Nullable
        public Drawable f18958j;

        /* renamed from: k */
        public int f18959k;

        public TabView(@NonNull Context context) {
            super(context);
            this.f18959k = 2;
            m10426g(context);
            ViewCompat.m2226t0(this, TabLayout.this.f18905e, TabLayout.this.f18906f, TabLayout.this.f18907g, TabLayout.this.f18908h);
            setGravity(17);
            setOrientation(!TabLayout.this.f18884B ? 1 : 0);
            setClickable(true);
            ViewCompat.m2228u0(this, PointerIconCompat.m2151a(getContext(), 1002));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f18954f;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f18954f == null) {
                this.f18954f = new BadgeDrawable(getContext(), 0, C2507R.attr.badgeStyle, C2507R.style.Widget_MaterialComponents_Badge, null);
            }
            m10423d();
            BadgeDrawable badgeDrawable = this.f18954f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: a */
        public final boolean m10420a() {
            return this.f18954f != null;
        }

        /* renamed from: b */
        public final void m10421b(@Nullable View view) {
            if (m10420a() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeUtils.m9808a(this.f18954f, view, null);
                this.f18953e = view;
            }
        }

        /* renamed from: c */
        public final void m10422c() {
            if (m10420a()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f18953e;
                if (view != null) {
                    BadgeUtils.m9809b(this.f18954f, view);
                    this.f18953e = null;
                }
            }
        }

        /* renamed from: d */
        public final void m10423d() {
            Tab tab;
            Tab tab2;
            if (m10420a()) {
                if (this.f18955g != null) {
                    m10422c();
                    return;
                }
                ImageView imageView = this.f18952d;
                if (imageView != null && (tab2 = this.f18950b) != null && tab2.f18938a != null) {
                    if (this.f18953e == imageView) {
                        m10424e(imageView);
                        return;
                    } else {
                        m10422c();
                        m10421b(this.f18952d);
                        return;
                    }
                }
                if (this.f18951c == null || (tab = this.f18950b) == null) {
                    m10422c();
                    return;
                }
                Objects.requireNonNull(tab);
                View view = this.f18953e;
                TextView textView = this.f18951c;
                if (view == textView) {
                    m10424e(textView);
                } else {
                    m10422c();
                    m10421b(this.f18951c);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f18958j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f18958j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* renamed from: e */
        public final void m10424e(@NonNull View view) {
            if (m10420a() && view == this.f18953e) {
                BadgeUtils.m9810c(this.f18954f, view, null);
            }
        }

        /* renamed from: f */
        public final void m10425f() {
            Tab tab = this.f18950b;
            View view = tab != null ? tab.f18942e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f18955g = view;
                TextView textView = this.f18951c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f18952d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f18952d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f18956h = textView2;
                if (textView2 != null) {
                    this.f18959k = TextViewCompat.m2640b(textView2);
                }
                this.f18957i = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f18955g;
                if (view2 != null) {
                    removeView(view2);
                    this.f18955g = null;
                }
                this.f18956h = null;
                this.f18957i = null;
            }
            boolean z = false;
            if (this.f18955g == null) {
                if (this.f18952d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C2507R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f18952d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f18951c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C2507R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f18951c = textView3;
                    addView(textView3);
                    this.f18959k = TextViewCompat.m2640b(this.f18951c);
                }
                TextViewCompat.m2649k(this.f18951c, TabLayout.this.f18909i);
                ColorStateList colorStateList = TabLayout.this.f18910j;
                if (colorStateList != null) {
                    this.f18951c.setTextColor(colorStateList);
                }
                m10427h(this.f18951c, this.f18952d);
                m10423d();
                final ImageView imageView3 = this.f18952d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            if (imageView3.getVisibility() == 0) {
                                TabView tabView = TabView.this;
                                View view4 = imageView3;
                                int i10 = TabView.f18949m;
                                tabView.m10424e(view4);
                            }
                        }
                    });
                }
                final TextView textView4 = this.f18951c;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            if (textView4.getVisibility() == 0) {
                                TabView tabView = TabView.this;
                                View view4 = textView4;
                                int i10 = TabView.f18949m;
                                tabView.m10424e(view4);
                            }
                        }
                    });
                }
            } else {
                TextView textView5 = this.f18956h;
                if (textView5 != null || this.f18957i != null) {
                    m10427h(textView5, this.f18957i);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.f18940c)) {
                setContentDescription(tab.f18940c);
            }
            if (tab != null) {
                TabLayout tabLayout = tab.f18943f;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == tab.f18941d) {
                    z = true;
                }
            }
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: g */
        public final void m10426g(Context context) {
            int i2 = TabLayout.this.f18918r;
            if (i2 != 0) {
                Drawable m497b = AppCompatResources.m497b(context, i2);
                this.f18958j = m497b;
                if (m497b != null && m497b.isStateful()) {
                    this.f18958j.setState(getDrawableState());
                }
            } else {
                this.f18958j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f18912l != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m10255a = RippleUtils.m10255a(TabLayout.this.f18912l);
                boolean z = TabLayout.this.f18888F;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(m10255a, gradientDrawable, z ? null : gradientDrawable2);
            }
            ViewCompat.m2204i0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        public int getContentHeight() {
            View[] viewArr = {this.f18951c, this.f18952d, this.f18955g};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getTop()) : view.getTop();
                    i2 = z ? Math.max(i2, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i2 - i3;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f18951c, this.f18952d, this.f18955g};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        @Nullable
        public Tab getTab() {
            return this.f18950b;
        }

        /* renamed from: h */
        public final void m10427h(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable;
            Tab tab = this.f18950b;
            Drawable mutate = (tab == null || (drawable = tab.f18938a) == null) ? null : DrawableCompat.m1845q(drawable).mutate();
            if (mutate != null) {
                DrawableCompat.m1842n(mutate, TabLayout.this.f18911k);
                PorterDuff.Mode mode = TabLayout.this.f18915o;
                if (mode != null) {
                    DrawableCompat.m1843o(mutate, mode);
                }
            }
            Tab tab2 = this.f18950b;
            CharSequence charSequence = tab2 != null ? tab2.f18939b : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = true;
            boolean z2 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z2) {
                    Objects.requireNonNull(this.f18950b);
                } else {
                    z = false;
                }
                textView.setText(z2 ? charSequence : null);
                textView.setVisibility(z ? 0 : 8);
                if (z2) {
                    setVisibility(0);
                }
            } else {
                z = false;
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m10165b = (z && imageView.getVisibility() == 0) ? (int) ViewUtils.m10165b(getContext(), 8) : 0;
                if (TabLayout.this.f18884B) {
                    if (m10165b != MarginLayoutParamsCompat.m2090a(marginLayoutParams)) {
                        MarginLayoutParamsCompat.m2092c(marginLayoutParams, m10165b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m10165b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m10165b;
                    MarginLayoutParamsCompat.m2092c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f18950b;
            CharSequence charSequence2 = tab3 != null ? tab3.f18940c : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z2) {
                    charSequence = charSequence2;
                }
                TooltipCompat.m998a(this, charSequence);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f18954f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f18954f.m9802c()));
            }
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(0, 1, this.f18950b.f18941d, 1, false, isSelected()).f3762a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3748g);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(C2507R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L31;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.f18919s
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f18951c
                if (r0 == 0) goto La6
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f18916p
                int r1 = r7.f18959k
                android.widget.ImageView r2 = r7.f18952d
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = 1
                goto L46
            L38:
                android.widget.TextView r2 = r7.f18951c
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f18917q
            L46:
                android.widget.TextView r2 = r7.f18951c
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f18951c
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f18951c
                int r5 = androidx.core.widget.TextViewCompat.m2640b(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto La6
                if (r1 == r5) goto La6
            L60:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.f18883A
                r6 = 0
                if (r5 != r3) goto L97
                if (r2 <= 0) goto L97
                if (r4 != r3) goto L97
                android.widget.TextView r2 = r7.f18951c
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L96
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L97
            L96:
                r3 = 0
            L97:
                if (r3 == 0) goto La6
                android.widget.TextView r2 = r7.f18951c
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f18951c
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            La6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f18950b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            Tab tab = this.f18950b;
            TabLayout tabLayout = tab.f18943f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m10404l(tab, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f18951c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f18952d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f18955g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable Tab tab) {
            if (tab != this.f18950b) {
                this.f18950b = tab;
                m10425f();
            }
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a */
        public final ViewPager f18963a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f18963a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: a */
        public void mo10411a(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: b */
        public void mo10412b(@NonNull Tab tab) {
            this.f18963a.setCurrentItem(tab.f18941d);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: c */
        public void mo10413c(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.tabStyle, C2507R.style.Widget_Design_TabLayout), attributeSet, C2507R.attr.tabStyle);
        this.f18902b = new ArrayList<>();
        this.f18914n = 0;
        this.f18919s = Integer.MAX_VALUE;
        this.f18886D = -1;
        this.f18892J = new ArrayList<>();
        this.f18901S = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f18904d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m10159d = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17310K, C2507R.attr.tabStyle, C2507R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m10301x(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.m10296s(context2);
            materialShapeDrawable.m10300w(ViewCompat.m2221r(this));
            ViewCompat.m2204i0(this, materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.m10243d(context2, m10159d, 5));
        setSelectedTabIndicatorColor(m10159d.getColor(8, 0));
        slidingTabIndicator.m10415b(m10159d.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(m10159d.getInt(10, 0));
        setTabIndicatorAnimationMode(m10159d.getInt(7, 0));
        setTabIndicatorFullWidth(m10159d.getBoolean(9, true));
        int dimensionPixelSize = m10159d.getDimensionPixelSize(16, 0);
        this.f18908h = dimensionPixelSize;
        this.f18907g = dimensionPixelSize;
        this.f18906f = dimensionPixelSize;
        this.f18905e = dimensionPixelSize;
        this.f18905e = m10159d.getDimensionPixelSize(19, dimensionPixelSize);
        this.f18906f = m10159d.getDimensionPixelSize(20, this.f18906f);
        this.f18907g = m10159d.getDimensionPixelSize(18, this.f18907g);
        this.f18908h = m10159d.getDimensionPixelSize(17, this.f18908h);
        int resourceId = m10159d.getResourceId(23, C2507R.style.TextAppearance_Design_Tab);
        this.f18909i = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0055R.styleable.f314y);
        try {
            this.f18916p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f18910j = MaterialResources.m10240a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (m10159d.hasValue(24)) {
                this.f18910j = MaterialResources.m10240a(context2, m10159d, 24);
            }
            if (m10159d.hasValue(22)) {
                this.f18910j = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{m10159d.getColor(22, 0), this.f18910j.getDefaultColor()});
            }
            this.f18911k = MaterialResources.m10240a(context2, m10159d, 3);
            this.f18915o = ViewUtils.m10172i(m10159d.getInt(4, -1), null);
            this.f18912l = MaterialResources.m10240a(context2, m10159d, 21);
            this.f18925y = m10159d.getInt(6, 300);
            this.f18890H = MotionUtils.m10185d(context2, C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17343b);
            this.f18920t = m10159d.getDimensionPixelSize(14, -1);
            this.f18921u = m10159d.getDimensionPixelSize(13, -1);
            this.f18918r = m10159d.getResourceId(0, 0);
            this.f18923w = m10159d.getDimensionPixelSize(1, 0);
            this.f18883A = m10159d.getInt(15, 1);
            this.f18924x = m10159d.getInt(2, 0);
            this.f18884B = m10159d.getBoolean(12, false);
            this.f18888F = m10159d.getBoolean(25, false);
            m10159d.recycle();
            Resources resources = getResources();
            this.f18917q = resources.getDimensionPixelSize(C2507R.dimen.design_tab_text_size_2line);
            this.f18922v = resources.getDimensionPixelSize(C2507R.dimen.design_tab_scrollable_min_width);
            m10396d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Dimension
    private int getDefaultHeight() {
        int size = this.f18902b.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Tab tab = this.f18902b.get(i2);
                if (tab != null && tab.f18938a != null && !TextUtils.isEmpty(tab.f18939b)) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z || this.f18884B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.f18920t;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.f18883A;
        if (i3 == 0 || i3 == 2) {
            return this.f18922v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f18904d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f18904d.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f18904d.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    /* renamed from: a */
    public void m10393a(@NonNull Tab tab, boolean z) {
        int size = this.f18902b.size();
        if (tab.f18943f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tab.f18941d = size;
        this.f18902b.add(size, tab);
        int size2 = this.f18902b.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f18902b.get(size).f18941d = size;
            }
        }
        TabView tabView = tab.f18944g;
        tabView.setSelected(false);
        tabView.setActivated(false);
        SlidingTabIndicator slidingTabIndicator = this.f18904d;
        int i2 = tab.f18941d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m10409q(layoutParams);
        slidingTabIndicator.addView(tabView, i2, layoutParams);
        if (z) {
            TabLayout tabLayout = tab.f18943f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m10404l(tab, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m10394b(view);
    }

    /* renamed from: b */
    public final void m10394b(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        Tab m10401i = m10401i();
        Objects.requireNonNull(tabItem);
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m10401i.f18940c = tabItem.getContentDescription();
            m10401i.m10419b();
        }
        m10393a(m10401i, this.f18902b.isEmpty());
    }

    /* renamed from: c */
    public final void m10395c(int i2) {
        boolean z;
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.m2174N(this)) {
            SlidingTabIndicator slidingTabIndicator = this.f18904d;
            int childCount = slidingTabIndicator.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (slidingTabIndicator.getChildAt(i3).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int m10397e = m10397e(i2, 0.0f);
                if (scrollX != m10397e) {
                    m10398f();
                    this.f18894L.setIntValues(scrollX, m10397e);
                    this.f18894L.start();
                }
                SlidingTabIndicator slidingTabIndicator2 = this.f18904d;
                int i4 = this.f18925y;
                ValueAnimator valueAnimator = slidingTabIndicator2.f18932b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    slidingTabIndicator2.f18932b.cancel();
                }
                slidingTabIndicator2.m10417d(true, i2, i4);
                return;
            }
        }
        m10406n(i2, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10396d() {
        /*
            r4 = this;
            int r0 = r4.f18883A
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.f18923w
            int r3 = r4.f18905e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.f18904d
            androidx.core.view.ViewCompat.m2226t0(r3, r0, r2, r2, r2)
            int r0 = r4.f18883A
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L25
            if (r0 == r1) goto L25
            goto L50
        L25:
            int r0 = r4.f18924x
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.f18904d
            r0.setGravity(r3)
            goto L50
        L34:
            int r0 = r4.f18924x
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r1) goto L48
            goto L50
        L3d:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.f18904d
            r0.setGravity(r3)
            goto L50
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.f18904d
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L50:
            r4.m10410r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m10396d():void");
    }

    /* renamed from: e */
    public final int m10397e(int i2, float f2) {
        View childAt;
        int i3 = this.f18883A;
        if ((i3 != 0 && i3 != 2) || (childAt = this.f18904d.getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f18904d.getChildCount() ? this.f18904d.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return ViewCompat.m2231w(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: f */
    public final void m10398f() {
        if (this.f18894L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18894L = valueAnimator;
            valueAnimator.setInterpolator(this.f18890H);
            this.f18894L.setDuration(this.f18925y);
            this.f18894L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    @Nullable
    /* renamed from: g */
    public Tab m10399g(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f18902b.get(i2);
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f18903c;
        if (tab != null) {
            return tab.f18941d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f18902b.size();
    }

    public int getTabGravity() {
        return this.f18924x;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f18911k;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f18887E;
    }

    public int getTabIndicatorGravity() {
        return this.f18926z;
    }

    public int getTabMaxWidth() {
        return this.f18919s;
    }

    public int getTabMode() {
        return this.f18883A;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f18912l;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f18913m;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f18910j;
    }

    /* renamed from: h */
    public final boolean m10400h() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    @NonNull
    /* renamed from: i */
    public Tab m10401i() {
        Tab tab = (Tab) ((Pools.SynchronizedPool) f18882T).mo2027b();
        if (tab == null) {
            tab = new Tab();
        }
        tab.f18943f = this;
        Pools.Pool<TabView> pool = this.f18901S;
        TabView mo2027b = pool != null ? pool.mo2027b() : null;
        if (mo2027b == null) {
            mo2027b = new TabView(getContext());
        }
        mo2027b.setTab(tab);
        mo2027b.setFocusable(true);
        mo2027b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f18940c)) {
            mo2027b.setContentDescription(tab.f18939b);
        } else {
            mo2027b.setContentDescription(tab.f18940c);
        }
        tab.f18944g = mo2027b;
        int i2 = tab.f18945h;
        if (i2 != -1) {
            mo2027b.setId(i2);
        }
        return tab;
    }

    /* renamed from: j */
    public void m10402j() {
        int currentItem;
        m10403k();
        PagerAdapter pagerAdapter = this.f18896N;
        if (pagerAdapter != null) {
            int mo4336c = pagerAdapter.mo4336c();
            for (int i2 = 0; i2 < mo4336c; i2++) {
                Tab m10401i = m10401i();
                m10401i.m10418a(this.f18896N.mo4338e(i2));
                m10393a(m10401i, false);
            }
            ViewPager viewPager = this.f18895M;
            if (viewPager == null || mo4336c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m10404l(m10399g(currentItem), true);
        }
    }

    /* renamed from: k */
    public void m10403k() {
        int childCount = this.f18904d.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) this.f18904d.getChildAt(childCount);
            this.f18904d.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f18901S.mo2026a(tabView);
            }
            requestLayout();
        }
        Iterator<Tab> it = this.f18902b.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.f18943f = null;
            next.f18944g = null;
            next.f18938a = null;
            next.f18945h = -1;
            next.f18939b = null;
            next.f18940c = null;
            next.f18941d = -1;
            next.f18942e = null;
            ((Pools.SynchronizedPool) f18882T).mo2026a(next);
        }
        this.f18903c = null;
    }

    /* renamed from: l */
    public void m10404l(@Nullable Tab tab, boolean z) {
        Tab tab2 = this.f18903c;
        if (tab2 == tab) {
            if (tab2 != null) {
                for (int size = this.f18892J.size() - 1; size >= 0; size--) {
                    this.f18892J.get(size).mo10411a(tab);
                }
                m10395c(tab.f18941d);
                return;
            }
            return;
        }
        int i2 = tab != null ? tab.f18941d : -1;
        if (z) {
            if ((tab2 == null || tab2.f18941d == -1) && i2 != -1) {
                m10406n(i2, 0.0f, true, true);
            } else {
                m10395c(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.f18903c = tab;
        if (tab2 != null) {
            for (int size2 = this.f18892J.size() - 1; size2 >= 0; size2--) {
                this.f18892J.get(size2).mo10413c(tab2);
            }
        }
        if (tab != null) {
            for (int size3 = this.f18892J.size() - 1; size3 >= 0; size3--) {
                this.f18892J.get(size3).mo10412b(tab);
            }
        }
    }

    /* renamed from: m */
    public void m10405m(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f18896N;
        if (pagerAdapter2 != null && (dataSetObserver = this.f18897O) != null) {
            pagerAdapter2.f6504a.unregisterObserver(dataSetObserver);
        }
        this.f18896N = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f18897O == null) {
                this.f18897O = new PagerAdapterObserver();
            }
            pagerAdapter.f6504a.registerObserver(this.f18897O);
        }
        m10402j();
    }

    /* renamed from: n */
    public void m10406n(int i2, float f2, boolean z, boolean z2) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.f18904d.getChildCount()) {
            return;
        }
        if (z2) {
            SlidingTabIndicator slidingTabIndicator = this.f18904d;
            ValueAnimator valueAnimator = slidingTabIndicator.f18932b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                slidingTabIndicator.f18932b.cancel();
            }
            slidingTabIndicator.m10416c(slidingTabIndicator.getChildAt(i2), slidingTabIndicator.getChildAt(i2 + 1), f2);
        }
        ValueAnimator valueAnimator2 = this.f18894L;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f18894L.cancel();
        }
        scrollTo(i2 < 0 ? 0 : m10397e(i2, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: o */
    public final void m10407o(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        List<ViewPager.OnAdapterChangeListener> list;
        List<ViewPager.OnPageChangeListener> list2;
        ViewPager viewPager2 = this.f18895M;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f18898P;
            if (tabLayoutOnPageChangeListener != null && (list2 = viewPager2.f6542S) != null) {
                list2.remove(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.f18899Q;
            if (adapterChangeListener != null && (list = this.f18895M.f6545V) != null) {
                list.remove(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.f18893K;
        if (baseOnTabSelectedListener != null) {
            this.f18892J.remove(baseOnTabSelectedListener);
            this.f18893K = null;
        }
        if (viewPager != null) {
            this.f18895M = viewPager;
            if (this.f18898P == null) {
                this.f18898P = new TabLayoutOnPageChangeListener(this);
            }
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.f18898P;
            tabLayoutOnPageChangeListener2.f18948c = 0;
            tabLayoutOnPageChangeListener2.f18947b = 0;
            viewPager.m4348b(tabLayoutOnPageChangeListener2);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.f18893K = viewPagerOnTabSelectedListener;
            if (!this.f18892J.contains(viewPagerOnTabSelectedListener)) {
                this.f18892J.add(viewPagerOnTabSelectedListener);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                m10405m(adapter, z);
            }
            if (this.f18899Q == null) {
                this.f18899Q = new AdapterChangeListener();
            }
            AdapterChangeListener adapterChangeListener2 = this.f18899Q;
            adapterChangeListener2.f18928a = z;
            if (viewPager.f6545V == null) {
                viewPager.f6545V = new ArrayList();
            }
            viewPager.f6545V.add(adapterChangeListener2);
            m10406n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f18895M = null;
            m10405m(null, false);
        }
        this.f18900R = z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.m10309c(this, (MaterialShapeDrawable) background);
        }
        if (this.f18895M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m10407o((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f18900R) {
            setupWithViewPager(null);
            this.f18900R = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        for (int i2 = 0; i2 < this.f18904d.getChildCount(); i2++) {
            View childAt = this.f18904d.getChildAt(i2);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f18958j) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f18958j.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m10400h() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.m10165b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f18921u
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.m10165b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f18919s = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f18883A
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m10400h()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public final void m10408p() {
        int size = this.f18902b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f18902b.get(i2).m10419b();
        }
    }

    /* renamed from: q */
    public final void m10409q(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f18883A == 1 && this.f18924x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* renamed from: r */
    public void m10410r(boolean z) {
        for (int i2 = 0; i2 < this.f18904d.getChildCount(); i2++) {
            View childAt = this.f18904d.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            m10409q((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.m10308b(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.f18884B != z) {
            this.f18884B = z;
            for (int i2 = 0; i2 < this.f18904d.getChildCount(); i2++) {
                View childAt = this.f18904d.getChildAt(i2);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    tabView.setOrientation(!TabLayout.this.f18884B ? 1 : 0);
                    TextView textView = tabView.f18956h;
                    if (textView == null && tabView.f18957i == null) {
                        tabView.m10427h(tabView.f18951c, tabView.f18952d);
                    } else {
                        tabView.m10427h(textView, tabView.f18957i);
                    }
                }
            }
            m10396d();
        }
    }

    public void setInlineLabelResource(@BoolRes int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m10398f();
        this.f18894L.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.m1845q(drawable).mutate();
        this.f18913m = mutate;
        DrawableUtils.m10045e(mutate, this.f18914n);
        int i2 = this.f18886D;
        if (i2 == -1) {
            i2 = this.f18913m.getIntrinsicHeight();
        }
        this.f18904d.m10415b(i2);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i2) {
        this.f18914n = i2;
        DrawableUtils.m10045e(this.f18913m, i2);
        m10410r(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.f18926z != i2) {
            this.f18926z = i2;
            ViewCompat.m2183W(this.f18904d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f18886D = i2;
        this.f18904d.m10415b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.f18924x != i2) {
            this.f18924x = i2;
            m10396d();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f18911k != colorStateList) {
            this.f18911k = colorStateList;
            m10408p();
        }
    }

    public void setTabIconTintResource(@ColorRes int i2) {
        setTabIconTint(AppCompatResources.m496a(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.f18887E = i2;
        if (i2 == 0) {
            this.f18889G = new TabIndicatorInterpolator();
            return;
        }
        if (i2 == 1) {
            this.f18889G = new ElasticTabIndicatorInterpolator();
        } else {
            if (i2 == 2) {
                this.f18889G = new FadeTabIndicatorInterpolator();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f18885C = z;
        SlidingTabIndicator slidingTabIndicator = this.f18904d;
        int i2 = SlidingTabIndicator.f18931e;
        slidingTabIndicator.m10414a();
        ViewCompat.m2183W(this.f18904d);
    }

    public void setTabMode(int i2) {
        if (i2 != this.f18883A) {
            this.f18883A = i2;
            m10396d();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f18912l != colorStateList) {
            this.f18912l = colorStateList;
            for (int i2 = 0; i2 < this.f18904d.getChildCount(); i2++) {
                View childAt = this.f18904d.getChildAt(i2);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i3 = TabView.f18949m;
                    ((TabView) childAt).m10426g(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i2) {
        setTabRippleColor(AppCompatResources.m496a(getContext(), i2));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f18910j != colorStateList) {
            this.f18910j = colorStateList;
            m10408p();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m10405m(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f18888F != z) {
            this.f18888F = z;
            for (int i2 = 0; i2 < this.f18904d.getChildCount(); i2++) {
                View childAt = this.f18904d.getChildAt(i2);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i3 = TabView.f18949m;
                    ((TabView) childAt).m10426g(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m10407o(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        m10394b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f18891I;
        if (baseOnTabSelectedListener2 != null) {
            this.f18892J.remove(baseOnTabSelectedListener2);
        }
        this.f18891I = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener == null || this.f18892J.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.f18892J.add(baseOnTabSelectedListener);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m10394b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        m10394b(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(AppCompatResources.m497b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

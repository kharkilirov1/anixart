package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C1195R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: b */
    @Nullable
    public ViewGroup f17413b;

    /* renamed from: c */
    @Nullable
    public View f17414c;

    /* renamed from: d */
    public View f17415d;

    /* renamed from: e */
    public int f17416e;

    /* renamed from: f */
    public int f17417f;

    /* renamed from: g */
    public int f17418g;

    /* renamed from: h */
    public int f17419h;

    /* renamed from: i */
    public boolean f17420i;

    /* renamed from: j */
    public boolean f17421j;

    /* renamed from: k */
    @Nullable
    public Drawable f17422k;

    /* renamed from: l */
    @Nullable
    public Drawable f17423l;

    /* renamed from: m */
    public int f17424m;

    /* renamed from: n */
    public boolean f17425n;

    /* renamed from: o */
    public ValueAnimator f17426o;

    /* renamed from: p */
    public long f17427p;

    /* renamed from: q */
    public int f17428q;

    /* renamed from: r */
    public AppBarLayout.OnOffsetChangedListener f17429r;

    /* renamed from: s */
    public int f17430s;

    /* renamed from: t */
    public int f17431t;

    /* renamed from: u */
    @Nullable
    public WindowInsetsCompat f17432u;

    /* renamed from: v */
    public int f17433v;

    /* renamed from: w */
    public boolean f17434w;

    /* renamed from: x */
    public boolean f17435x;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$1 */
    class C12031 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        /* renamed from: a */
        public WindowInsetsCompat mo433a(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            throw null;
        }
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        /* renamed from: a */
        public void mo9774a(AppBarLayout appBarLayout, int i2) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f17430s = i2;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f17432u;
            int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper m9782d = CollapsingToolbarLayout.m9782d(childAt);
                int i4 = layoutParams.f17437a;
                if (i4 == 1) {
                    m9782d.m9798b(MathUtils.m1934b(-i2, 0, CollapsingToolbarLayout.this.m9784c(childAt)));
                } else if (i4 == 2) {
                    m9782d.m9798b(Math.round((-i2) * layoutParams.f17438b));
                }
            }
            CollapsingToolbarLayout.this.m9788h();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f17423l != null && m2428i > 0) {
                ViewCompat.m2183W(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int m2233x = (height - ViewCompat.m2233x(CollapsingToolbarLayout.this)) - m2428i;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            Objects.requireNonNull(CollapsingToolbarLayout.this);
            Math.min(1.0f, scrimVisibleHeightTrigger / m2233x);
            throw null;
        }
    }

    @RequiresApi
    @RestrictTo
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TitleCollapseMode {
    }

    /* renamed from: b */
    public static int m9781b(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @NonNull
    /* renamed from: d */
    public static ViewOffsetHelper m9782d(@NonNull View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(C2507R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(C2507R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    /* renamed from: a */
    public final void m9783a() {
    }

    /* renamed from: c */
    public final int m9784c(@NonNull View view) {
        return ((getHeight() - m9782d(view).f17462b) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m9783a();
        if (this.f17413b == null && (drawable = this.f17422k) != null && this.f17424m > 0) {
            drawable.mutate().setAlpha(this.f17424m);
            this.f17422k.draw(canvas);
        }
        if (this.f17420i && this.f17421j) {
            if (this.f17413b == null) {
                throw null;
            }
            if (this.f17422k == null) {
                throw null;
            }
            if (this.f17424m <= 0) {
                throw null;
            }
            if (!m9785e()) {
                throw null;
            }
            throw null;
        }
        if (this.f17423l == null || this.f17424m <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f17432u;
        int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : 0;
        if (m2428i > 0) {
            this.f17423l.setBounds(0, -this.f17430s, getWidth(), m2428i - this.f17430s);
            this.f17423l.mutate().setAlpha(this.f17424m);
            this.f17423l.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r6, android.view.View r7, long r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f17422k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            int r3 = r5.f17424m
            if (r3 <= 0) goto L3a
            android.view.View r3 = r5.f17414c
            if (r3 == 0) goto L14
            if (r3 != r5) goto L11
            goto L14
        L11:
            if (r7 != r3) goto L1a
            goto L18
        L14:
            android.view.ViewGroup r3 = r5.f17413b
            if (r7 != r3) goto L1a
        L18:
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L3a
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            r5.m9786f(r0, r7, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f17422k
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r5.f17424m
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r5.f17422k
            r0.draw(r6)
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            boolean r6 = super.drawChild(r6, r7, r8)
            if (r6 != 0) goto L45
            if (r0 == 0) goto L44
            goto L45
        L44:
            r1 = 0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17423l;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f17422k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m9785e() {
        return this.f17431t == 1;
    }

    /* renamed from: f */
    public final void m9786f(@NonNull Drawable drawable, @Nullable View view, int i2, int i3) {
        if (m9785e() && view != null && this.f17420i) {
            i3 = view.getBottom();
        }
        drawable.setBounds(0, 0, i2, i3);
    }

    /* renamed from: g */
    public final void m9787g() {
        View view;
        if (!this.f17420i && (view = this.f17415d) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f17415d);
            }
        }
        if (!this.f17420i || this.f17413b == null) {
            return;
        }
        if (this.f17415d == null) {
            this.f17415d = new View(getContext());
        }
        if (this.f17415d.getParent() == null) {
            this.f17413b.addView(this.f17415d, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        throw null;
    }

    public float getCollapsedTitleTextSize() {
        throw null;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        throw null;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f17422k;
    }

    public int getExpandedTitleGravity() {
        throw null;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f17419h;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f17418g;
    }

    public int getExpandedTitleMarginStart() {
        return this.f17416e;
    }

    public int getExpandedTitleMarginTop() {
        return this.f17417f;
    }

    public float getExpandedTitleTextSize() {
        throw null;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        throw null;
    }

    @RequiresApi
    @RestrictTo
    public int getHyphenationFrequency() {
        throw null;
    }

    @RestrictTo
    public int getLineCount() {
        throw null;
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingAdd() {
        throw null;
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingMultiplier() {
        throw null;
    }

    @RestrictTo
    public int getMaxLines() {
        throw null;
    }

    public int getScrimAlpha() {
        return this.f17424m;
    }

    public long getScrimAnimationDuration() {
        return this.f17427p;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.f17428q;
        if (i2 >= 0) {
            return i2 + this.f17433v + 0;
        }
        WindowInsetsCompat windowInsetsCompat = this.f17432u;
        int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : 0;
        int m2233x = ViewCompat.m2233x(this);
        return m2233x > 0 ? Math.min((m2233x * 2) + m2428i, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f17423l;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f17420i) {
            throw null;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f17431t;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        throw null;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        throw null;
    }

    /* renamed from: h */
    public final void m9788h() {
        if (this.f17422k == null && this.f17423l == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f17430s < getScrimVisibleHeightTrigger());
    }

    /* renamed from: i */
    public final void m9789i(int i2, int i3, int i4, int i5, boolean z) {
        View view;
        if (!this.f17420i || (view = this.f17415d) == null) {
            return;
        }
        boolean z2 = ViewCompat.m2173M(view) && this.f17415d.getVisibility() == 0;
        this.f17421j = z2;
        if (z2 || z) {
            ViewCompat.m2231w(this);
            View view2 = this.f17414c;
            if (view2 == null) {
                view2 = this.f17413b;
            }
            m9784c(view2);
            DescendantOffsetUtils.m10143a(this, this.f17415d, null);
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (m9785e()) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(ViewCompat.m2225t(appBarLayout));
            if (this.f17429r == null) {
                this.f17429r = new OffsetUpdateListener();
            }
            AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f17429r;
            if (appBarLayout.f17371i == null) {
                appBarLayout.f17371i = new ArrayList();
            }
            if (onOffsetChangedListener != null && !appBarLayout.f17371i.contains(onOffsetChangedListener)) {
                appBarLayout.f17371i.add(onOffsetChangedListener);
            }
            ViewCompat.m2192c0(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<AppBarLayout.BaseOnOffsetChangedListener> list;
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f17429r;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).f17371i) != null && onOffsetChangedListener != null) {
            list.remove(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        WindowInsetsCompat windowInsetsCompat = this.f17432u;
        if (windowInsetsCompat != null) {
            int m2428i = windowInsetsCompat.m2428i();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!ViewCompat.m2225t(childAt) && childAt.getTop() < m2428i) {
                    ViewCompat.m2179S(childAt, m2428i);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            ViewOffsetHelper m9782d = m9782d(getChildAt(i7));
            m9782d.f17462b = m9782d.f17461a.getTop();
            m9782d.f17463c = m9782d.f17461a.getLeft();
        }
        m9789i(i2, i3, i4, i5, false);
        if (this.f17413b != null && this.f17420i) {
            throw null;
        }
        m9788h();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            m9782d(getChildAt(i8)).m9797a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        WindowInsetsCompat windowInsetsCompat = this.f17432u;
        int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : 0;
        if ((mode == 0 || this.f17434w) && m2428i > 0) {
            this.f17433v = m2428i;
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m2428i, 1073741824));
        }
        if (this.f17435x) {
            throw null;
        }
        ViewGroup viewGroup = this.f17413b;
        if (viewGroup != null) {
            View view = this.f17414c;
            if (view == null || view == this) {
                setMinimumHeight(m9781b(viewGroup));
            } else {
                setMinimumHeight(m9781b(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.f17422k;
        if (drawable != null) {
            m9786f(drawable, this.f17413b, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        throw null;
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i2) {
        throw null;
    }

    public void setCollapsedTitleTextColor(@ColorInt int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextSize(float f2) {
        throw null;
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        throw null;
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17422k;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f17422k = mutate;
            if (mutate != null) {
                m9786f(mutate, this.f17413b, getWidth(), getHeight());
                this.f17422k.setCallback(this);
                this.f17422k.setAlpha(this.f17424m);
            }
            ViewCompat.m2183W(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(@DrawableRes int i2) {
        setContentScrim(ContextCompat.m1671d(getContext(), i2));
    }

    public void setExpandedTitleColor(@ColorInt int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        throw null;
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.f17419h = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f17418g = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f17416e = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f17417f = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i2) {
        throw null;
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        throw null;
    }

    public void setExpandedTitleTextSize(float f2) {
        throw null;
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        throw null;
    }

    @RestrictTo
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f17435x = z;
    }

    @RestrictTo
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f17434w = z;
    }

    @RequiresApi
    @RestrictTo
    public void setHyphenationFrequency(int i2) {
        throw null;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingAdd(float f2) {
        throw null;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingMultiplier(@FloatRange float f2) {
        throw null;
    }

    @RestrictTo
    public void setMaxLines(int i2) {
        throw null;
    }

    @RestrictTo
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        throw null;
    }

    public void setScrimAlpha(int i2) {
        ViewGroup viewGroup;
        if (i2 != this.f17424m) {
            if (this.f17422k != null && (viewGroup = this.f17413b) != null) {
                ViewCompat.m2183W(viewGroup);
            }
            this.f17424m = i2;
            ViewCompat.m2183W(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange long j2) {
        this.f17427p = j2;
    }

    public void setScrimVisibleHeightTrigger(@IntRange int i2) {
        if (this.f17428q != i2) {
            this.f17428q = i2;
            m9788h();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = ViewCompat.m2174N(this) && !isInEditMode();
        if (this.f17425n != z) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                m9783a();
                ValueAnimator valueAnimator = this.f17426o;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f17426o = valueAnimator2;
                    valueAnimator2.setInterpolator(i2 > this.f17424m ? AnimationUtils.f17344c : AnimationUtils.f17345d);
                    this.f17426o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.f17426o.cancel();
                }
                this.f17426o.setDuration(this.f17427p);
                this.f17426o.setIntValues(this.f17424m, i2);
                this.f17426o.start();
            } else {
                setScrimAlpha(z ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            }
            this.f17425n = z;
        }
    }

    @RequiresApi
    @RestrictTo
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        throw null;
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17423l;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f17423l = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f17423l.setState(getDrawableState());
                }
                DrawableCompat.m1840l(this.f17423l, ViewCompat.m2231w(this));
                this.f17423l.setVisible(getVisibility() == 0, false);
                this.f17423l.setCallback(this);
                this.f17423l.setAlpha(this.f17424m);
            }
            ViewCompat.m2183W(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(@DrawableRes int i2) {
        setStatusBarScrim(ContextCompat.m1671d(getContext(), i2));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        throw null;
    }

    public void setTitleCollapseMode(int i2) {
        this.f17431t = i2;
        throw null;
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        throw null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f17420i) {
            this.f17420i = z;
            setContentDescription(getTitle());
            m9787g();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        throw null;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f17423l;
        if (drawable != null && drawable.isVisible() != z) {
            this.f17423l.setVisible(z, false);
        }
        Drawable drawable2 = this.f17422k;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f17422k.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17422k || drawable == this.f17423l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f17437a;

        /* renamed from: b */
        public float f17438b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17437a = 0;
            this.f17438b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17327l);
            this.f17437a = obtainStyledAttributes.getInt(0, 0);
            this.f17438b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f17437a = 0;
            this.f17438b = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17437a = 0;
            this.f17438b = 0.5f;
        }
    }
}

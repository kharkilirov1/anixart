package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.swiftsoft.anixartd.C2507R;
import p000a.C0000a;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: C */
    public static final int[] f1007C = {C2507R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    public final Runnable f1008A;

    /* renamed from: B */
    public final NestedScrollingParentHelper f1009B;

    /* renamed from: b */
    public int f1010b;

    /* renamed from: c */
    public int f1011c;

    /* renamed from: d */
    public ContentFrameLayout f1012d;

    /* renamed from: e */
    public ActionBarContainer f1013e;

    /* renamed from: f */
    public DecorToolbar f1014f;

    /* renamed from: g */
    public Drawable f1015g;

    /* renamed from: h */
    public boolean f1016h;

    /* renamed from: i */
    public boolean f1017i;

    /* renamed from: j */
    public boolean f1018j;

    /* renamed from: k */
    public boolean f1019k;

    /* renamed from: l */
    public boolean f1020l;

    /* renamed from: m */
    public int f1021m;

    /* renamed from: n */
    public int f1022n;

    /* renamed from: o */
    public final Rect f1023o;

    /* renamed from: p */
    public final Rect f1024p;

    /* renamed from: q */
    public final Rect f1025q;

    /* renamed from: r */
    @NonNull
    public WindowInsetsCompat f1026r;

    /* renamed from: s */
    @NonNull
    public WindowInsetsCompat f1027s;

    /* renamed from: t */
    @NonNull
    public WindowInsetsCompat f1028t;

    /* renamed from: u */
    @NonNull
    public WindowInsetsCompat f1029u;

    /* renamed from: v */
    public ActionBarVisibilityCallback f1030v;

    /* renamed from: w */
    public OverScroller f1031w;

    /* renamed from: x */
    public ViewPropertyAnimator f1032x;

    /* renamed from: y */
    public final AnimatorListenerAdapter f1033y;

    /* renamed from: z */
    public final Runnable f1034z;

    public interface ActionBarVisibilityCallback {
        /* renamed from: a */
        void mo475a();

        /* renamed from: b */
        void mo476b();

        /* renamed from: c */
        void mo477c(boolean z);

        /* renamed from: d */
        void mo478d();

        /* renamed from: e */
        void mo479e();

        /* renamed from: f */
        void mo480f(int i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1011c = 0;
        this.f1023o = new Rect();
        this.f1024p = new Rect();
        this.f1025q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f3698b;
        this.f1026r = windowInsetsCompat;
        this.f1027s = windowInsetsCompat;
        this.f1028t = windowInsetsCompat;
        this.f1029u = windowInsetsCompat;
        this.f1033y = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1032x = null;
                actionBarOverlayLayout.f1020l = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1032x = null;
                actionBarOverlayLayout.f1020l = false;
            }
        };
        this.f1034z = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m685q();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1032x = actionBarOverlayLayout.f1013e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1033y);
            }
        };
        this.f1008A = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m685q();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1032x = actionBarOverlayLayout.f1013e.animate().translationY(-ActionBarOverlayLayout.this.f1013e.getHeight()).setListener(ActionBarOverlayLayout.this.f1033y);
            }
        };
        m686r(context);
        this.f1009B = new NestedScrollingParentHelper();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: a */
    public void mo669a(Menu menu, MenuPresenter.Callback callback) {
        m687s();
        this.f1014f.mo825a(menu, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m670b(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m670b(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: c */
    public boolean mo671c() {
        m687s();
        return this.f1014f.mo827c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: d */
    public void mo672d() {
        m687s();
        this.f1014f.mo828d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1015g == null || this.f1016h) {
            return;
        }
        if (this.f1013e.getVisibility() == 0) {
            i2 = (int) (this.f1013e.getTranslationY() + this.f1013e.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1015g.setBounds(0, i2, getWidth(), this.f1015g.getIntrinsicHeight() + i2);
        this.f1015g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: e */
    public boolean mo673e() {
        m687s();
        return this.f1014f.mo829e();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: f */
    public boolean mo674f() {
        m687s();
        return this.f1014f.mo830f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    /* renamed from: g */
    public void mo675g(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1013e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1009B.m2146a();
    }

    public CharSequence getTitle() {
        m687s();
        return this.f1014f.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: h */
    public boolean mo676h() {
        m687s();
        return this.f1014f.mo832h();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: i */
    public boolean mo677i() {
        m687s();
        return this.f1014f.mo833i();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: j */
    public void mo678j(int i2) {
        m687s();
        if (i2 == 2) {
            this.f1014f.mo846v();
        } else if (i2 == 5) {
            this.f1014f.mo847w();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    /* renamed from: k */
    public void mo679k() {
        m687s();
        this.f1014f.mo834j();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: l */
    public void mo680l(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: m */
    public boolean mo681m(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: n */
    public void mo682n(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: o */
    public void mo683o(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @RequiresApi
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m687s();
        WindowInsetsCompat m2419p = WindowInsetsCompat.m2419p(windowInsets, this);
        boolean m670b = m670b(this.f1013e, new Rect(m2419p.m2426g(), m2419p.m2428i(), m2419p.m2427h(), m2419p.m2425f()), true, true, false, true);
        ViewCompat.m2195e(this, m2419p, this.f1023o);
        Rect rect = this.f1023o;
        WindowInsetsCompat m2429j = m2419p.m2429j(rect.left, rect.top, rect.right, rect.bottom);
        this.f1026r = m2429j;
        boolean z = true;
        if (!this.f1027s.equals(m2429j)) {
            this.f1027s = this.f1026r;
            m670b = true;
        }
        if (this.f1024p.equals(this.f1023o)) {
            z = m670b;
        } else {
            this.f1024p.set(this.f1023o);
        }
        if (z) {
            requestLayout();
        }
        return m2419p.m2420a().m2422c().m2421b().m2432n();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m686r(getContext());
        ViewCompat.m2192c0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m685q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        m687s();
        measureChildWithMargins(this.f1013e, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1013e.getLayoutParams();
        int max = Math.max(0, this.f1013e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f1013e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1013e.getMeasuredState());
        boolean z = (ViewCompat.m2168H(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1010b;
            if (this.f1018j && this.f1013e.getTabContainer() != null) {
                measuredHeight += this.f1010b;
            }
        } else {
            measuredHeight = this.f1013e.getVisibility() != 8 ? this.f1013e.getMeasuredHeight() : 0;
        }
        this.f1025q.set(this.f1023o);
        WindowInsetsCompat windowInsetsCompat = this.f1026r;
        this.f1028t = windowInsetsCompat;
        if (this.f1017i || z) {
            Insets m1779b = Insets.m1779b(windowInsetsCompat.m2426g(), this.f1028t.m2428i() + measuredHeight, this.f1028t.m2427h(), this.f1028t.m2425f() + 0);
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(this.f1028t);
            builder.m2434b(m1779b);
            this.f1028t = builder.m2433a();
        } else {
            Rect rect = this.f1025q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f1028t = windowInsetsCompat.m2429j(0, measuredHeight, 0, 0);
        }
        m670b(this.f1012d, this.f1025q, true, true, true, true);
        if (!this.f1029u.equals(this.f1028t)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f1028t;
            this.f1029u = windowInsetsCompat2;
            ViewCompat.m2197f(this.f1012d, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f1012d, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1012d.getLayoutParams();
        int max3 = Math.max(max, this.f1012d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f1012d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1012d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.f1019k || !z) {
            return false;
        }
        this.f1031w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1031w.getFinalY() > this.f1013e.getHeight()) {
            m685q();
            this.f1008A.run();
        } else {
            m685q();
            this.f1034z.run();
        }
        this.f1020l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1021m + i3;
        this.f1021m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1009B.f3632a = i2;
        this.f1021m = getActionBarHideOffset();
        m685q();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f1030v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.mo479e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1013e.getVisibility() != 0) {
            return false;
        }
        return this.f1019k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1019k && !this.f1020l) {
            if (this.f1021m <= this.f1013e.getHeight()) {
                m685q();
                postDelayed(this.f1034z, 600L);
            } else {
                m685q();
                postDelayed(this.f1008A, 600L);
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f1030v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.mo476b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m687s();
        int i3 = this.f1022n ^ i2;
        this.f1022n = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f1030v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.mo477c(!z2);
            if (z || !z2) {
                this.f1030v.mo475a();
            } else {
                this.f1030v.mo478d();
            }
        }
        if ((i3 & 256) == 0 || this.f1030v == null) {
            return;
        }
        ViewCompat.m2192c0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1011c = i2;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f1030v;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.mo480f(i2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: p */
    public void mo684p(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    /* renamed from: q */
    public void m685q() {
        removeCallbacks(this.f1034z);
        removeCallbacks(this.f1008A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1032x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void m686r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1007C);
        this.f1010b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1015g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1016h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1031w = new OverScroller(context);
    }

    /* renamed from: s */
    public void m687s() {
        DecorToolbar wrapper;
        if (this.f1012d == null) {
            this.f1012d = (ContentFrameLayout) findViewById(C2507R.id.action_bar_activity_content);
            this.f1013e = (ActionBarContainer) findViewById(C2507R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C2507R.id.action_bar);
            if (findViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    StringBuilder m24u = C0000a.m24u("Can't make a decor toolbar out of ");
                    m24u.append(findViewById.getClass().getSimpleName());
                    throw new IllegalStateException(m24u.toString());
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1014f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i2) {
        m685q();
        this.f1013e.setTranslationY(-Math.max(0, Math.min(i2, this.f1013e.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f1030v = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f1030v.mo480f(this.f1011c);
            int i2 = this.f1022n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ViewCompat.m2192c0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1018j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1019k) {
            this.f1019k = z;
            if (z) {
                return;
            }
            m685q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m687s();
        this.f1014f.setIcon(i2);
    }

    public void setLogo(int i2) {
        m687s();
        this.f1014f.mo839o(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f1017i = z;
        this.f1016h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        m687s();
        this.f1014f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        m687s();
        this.f1014f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m687s();
        this.f1014f.setIcon(drawable);
    }
}

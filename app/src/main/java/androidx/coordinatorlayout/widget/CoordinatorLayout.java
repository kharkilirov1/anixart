package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.C0219R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.mobile.ads.C4632R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {

    /* renamed from: u */
    public static final String f3044u;

    /* renamed from: v */
    public static final Class<?>[] f3045v;

    /* renamed from: w */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f3046w;

    /* renamed from: x */
    public static final Comparator<View> f3047x;

    /* renamed from: y */
    public static final Pools.Pool<Rect> f3048y;

    /* renamed from: b */
    public final List<View> f3049b;

    /* renamed from: c */
    public final DirectedAcyclicGraph<View> f3050c;

    /* renamed from: d */
    public final List<View> f3051d;

    /* renamed from: e */
    public final List<View> f3052e;

    /* renamed from: f */
    public final int[] f3053f;

    /* renamed from: g */
    public final int[] f3054g;

    /* renamed from: h */
    public boolean f3055h;

    /* renamed from: i */
    public boolean f3056i;

    /* renamed from: j */
    public int[] f3057j;

    /* renamed from: k */
    public View f3058k;

    /* renamed from: l */
    public View f3059l;

    /* renamed from: m */
    public OnPreDrawListener f3060m;

    /* renamed from: n */
    public boolean f3061n;

    /* renamed from: o */
    public WindowInsetsCompat f3062o;

    /* renamed from: p */
    public boolean f3063p;

    /* renamed from: q */
    public Drawable f3064q;

    /* renamed from: r */
    public ViewGroup.OnHierarchyChangeListener f3065r;

    /* renamed from: s */
    public OnApplyWindowInsetsListener f3066s;

    /* renamed from: t */
    public final NestedScrollingParentHelper f3067t;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: a */
        public boolean mo1492a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1493b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        /* renamed from: c */
        public void mo1494c(@NonNull LayoutParams layoutParams) {
        }

        /* renamed from: d */
        public boolean mo1495d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        /* renamed from: e */
        public void mo1496e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        /* renamed from: f */
        public void mo1497f() {
        }

        /* renamed from: g */
        public boolean mo1498g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: h */
        public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
            return false;
        }

        /* renamed from: i */
        public boolean mo1500i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        /* renamed from: j */
        public boolean mo1501j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
            return false;
        }

        /* renamed from: k */
        public void mo1502k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        }

        /* renamed from: l */
        public void mo1503l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }

        /* renamed from: m */
        public boolean mo1504m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        /* renamed from: n */
        public void mo1505n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }

        @Nullable
        /* renamed from: o */
        public Parcelable mo1506o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: p */
        public boolean mo1507p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
            return false;
        }

        /* renamed from: q */
        public void mo1508q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2) {
        }

        /* renamed from: r */
        public boolean mo1509r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DispatchChangeEvent {
    }

    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3065r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m1485t(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3065r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m1485t(0);
            return true;
        }
    }

    public static class ViewElevationComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            float m2169I = ViewCompat.m2169I(view);
            float m2169I2 = ViewCompat.m2169I(view2);
            if (m2169I > m2169I2) {
                return -1;
            }
            return m2169I < m2169I2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3044u = r0 != null ? r0.getName() : null;
        f3047x = new ViewElevationComparator();
        f3045v = new Class[]{Context.class, AttributeSet.class};
        f3046w = new ThreadLocal<>();
        f3048y = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.coordinatorLayoutStyle);
        this.f3049b = new ArrayList();
        this.f3050c = new DirectedAcyclicGraph<>();
        this.f3051d = new ArrayList();
        this.f3052e = new ArrayList();
        this.f3053f = new int[2];
        this.f3054g = new int[2];
        this.f3067t = new NestedScrollingParentHelper();
        int[] iArr = C0219R.styleable.f3042a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C2507R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, C2507R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3057j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f3057j.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f3057j[i2] = (int) (r2[i2] * f2);
            }
        }
        this.f3064q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m1474B();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        if (ViewCompat.m2227u(this) == 0) {
            ViewCompat.m2216o0(this, 1);
        }
    }

    @NonNull
    /* renamed from: c */
    public static Rect m1472c() {
        Rect rect = (Rect) ((Pools.SynchronizedPool) f3048y).mo2027b();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: A */
    public final void m1473A(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.f3079j;
        if (i3 != i2) {
            ViewCompat.m2179S(view, i2 - i3);
            layoutParams.f3079j = i2;
        }
    }

    /* renamed from: B */
    public final void m1474B() {
        if (!ViewCompat.m2225t(this)) {
            ViewCompat.m2224s0(this, null);
            return;
        }
        if (this.f3066s == null) {
            this.f3066s = new OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                /* renamed from: a */
                public WindowInsetsCompat mo433a(View view, WindowInsetsCompat windowInsetsCompat) {
                    CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                    if (!ObjectsCompat.m2022a(coordinatorLayout.f3062o, windowInsetsCompat)) {
                        coordinatorLayout.f3062o = windowInsetsCompat;
                        boolean z = windowInsetsCompat.m2428i() > 0;
                        coordinatorLayout.f3063p = z;
                        coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                        if (!windowInsetsCompat.m2430l()) {
                            int childCount = coordinatorLayout.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = coordinatorLayout.getChildAt(i2);
                                if (ViewCompat.m2225t(childAt) && ((LayoutParams) childAt.getLayoutParams()).f3070a != null && windowInsetsCompat.m2430l()) {
                                    break;
                                }
                            }
                        }
                        coordinatorLayout.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            };
        }
        ViewCompat.m2224s0(this, this.f3066s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void m1475d(LayoutParams layoutParams, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f3070a;
        if (behavior != null) {
            Objects.requireNonNull(behavior);
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3064q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public void m1476e(@NonNull View view) {
        ArrayList<View> arrayList = this.f3050c.f3090b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view2 = arrayList.get(i2);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).f3070a;
            if (behavior != null) {
                behavior.mo1495d(this, view2, view);
            }
        }
    }

    /* renamed from: f */
    public void m1477f(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1480j(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    /* renamed from: g */
    public void mo675g(@NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m1510a(i6) && (behavior = layoutParams.f3070a) != null) {
                    int[] iArr2 = this.f3053f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.mo1503l(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f3053f;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    i8 = i5 > 0 ? Math.max(i8, this.f3053f[1]) : Math.min(i8, this.f3053f[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            m1485t(1);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        m1489x();
        return Collections.unmodifiableList(this.f3049b);
    }

    @RestrictTo
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f3062o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3067t.m2146a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f3064q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @NonNull
    /* renamed from: h */
    public List<View> m1478h(@NonNull View view) {
        DirectedAcyclicGraph<View> directedAcyclicGraph = this.f3050c;
        int size = directedAcyclicGraph.f3090b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<View> m1126m = directedAcyclicGraph.f3090b.m1126m(i2);
            if (m1126m != null && m1126m.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(directedAcyclicGraph.f3090b.m1122i(i2));
            }
        }
        this.f3052e.clear();
        if (arrayList != null) {
            this.f3052e.addAll(arrayList);
        }
        return this.f3052e;
    }

    @NonNull
    /* renamed from: i */
    public List<View> m1479i(@NonNull View view) {
        ArrayList<View> arrayList = this.f3050c.f3090b.get(view);
        this.f3052e.clear();
        if (arrayList != null) {
            this.f3052e.addAll(arrayList);
        }
        return this.f3052e;
    }

    /* renamed from: j */
    public void m1480j(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = ViewGroupUtils.f3093a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = ViewGroupUtils.f3093a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils.m1514a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = ViewGroupUtils.f3094b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: k */
    public final void m1481k(int i2, Rect rect, Rect rect2, LayoutParams layoutParams, int i3, int i4) {
        int i5 = layoutParams.f3072c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = layoutParams.f3073d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: l */
    public void mo680l(View view, int i2, int i3, int i4, int i5, int i6) {
        mo675g(view, i2, i3, i4, i5, 0, this.f3054g);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: m */
    public boolean mo681m(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.f3070a;
                if (behavior != null) {
                    boolean mo1507p = behavior.mo1507p(this, childAt, view, view2, i2, i3);
                    z |= mo1507p;
                    layoutParams.m1512c(i3, mo1507p);
                } else {
                    layoutParams.m1512c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: n */
    public void mo682n(View view, View view2, int i2, int i3) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f3067t;
        if (i3 == 1) {
            nestedScrollingParentHelper.f3633b = i2;
        } else {
            nestedScrollingParentHelper.f3632a = i2;
        }
        this.f3059l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((LayoutParams) getChildAt(i4).getLayoutParams()).m1510a(i3);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: o */
    public void mo683o(View view, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f3067t;
        if (i2 == 1) {
            nestedScrollingParentHelper.f3633b = 0;
        } else {
            nestedScrollingParentHelper.f3632a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.m1510a(i2)) {
                Behavior behavior = layoutParams.f3070a;
                if (behavior != null) {
                    behavior.mo1508q(this, childAt, view, i2);
                }
                layoutParams.m1512c(i2, false);
                layoutParams.f3085p = false;
            }
        }
        this.f3059l = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1490y(false);
        if (this.f3061n) {
            if (this.f3060m == null) {
                this.f3060m = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3060m);
        }
        if (this.f3062o == null && ViewCompat.m2225t(this)) {
            ViewCompat.m2192c0(this);
        }
        this.f3056i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1490y(false);
        if (this.f3061n && this.f3060m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3060m);
        }
        View view = this.f3059l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3056i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3063p || this.f3064q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f3062o;
        int m2428i = windowInsetsCompat != null ? windowInsetsCompat.m2428i() : 0;
        if (m2428i > 0) {
            this.f3064q.setBounds(0, 0, getWidth(), m2428i);
            this.f3064q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1490y(true);
        }
        boolean m1488w = m1488w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1490y(true);
        }
        return m1488w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Behavior behavior;
        int m2231w = ViewCompat.m2231w(this);
        int size = this.f3049b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f3049b.get(i6);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).f3070a) == null || !behavior.mo1499h(this, view, m2231w))) {
                m1486u(view, m2231w);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        if (r0.mo1500i(r30, r20, r8, r21, r23, 0) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m1510a(0)) {
                    Behavior behavior = layoutParams.f3070a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m1510a(0) && (behavior = layoutParams.f3070a) != null) {
                    z |= behavior.mo1501j(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo684p(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo675g(view, i2, i3, i4, i5, 0, this.f3054g);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        mo682n(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        SparseArray<Parcelable> sparseArray = savedState.f3088d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id2 = childAt.getId();
            Behavior behavior = m1483r(childAt).f3070a;
            if (id2 != -1 && behavior != null && (parcelable2 = sparseArray.get(id2)) != null) {
                behavior.mo1505n(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo1506o;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id2 = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f3070a;
            if (id2 != -1 && behavior != null && (mo1506o = behavior.mo1506o(this, childAt)) != null) {
                sparseArray.append(id2, mo1506o);
            }
        }
        savedState.f3088d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo681m(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo683o(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3058k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m1488w(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f3058k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f3070a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f3058k
            boolean r6 = r6.mo1509r(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.f3058k
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m1490y(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: p */
    public void mo684p(View view, int i2, int i3, int[] iArr, int i4) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m1510a(i4) && (behavior = layoutParams.f3070a) != null) {
                    int[] iArr2 = this.f3053f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.mo1502k(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f3053f;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f3053f;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            m1485t(1);
        }
    }

    /* renamed from: q */
    public final int m1482q(int i2) {
        int[] iArr = this.f3057j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public LayoutParams m1483r(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f3071b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.m1511b(behavior);
                layoutParams.f3071b = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.m1511b(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder m24u = C0000a.m24u("Default behavior class ");
                        m24u.append(defaultBehavior.value().getName());
                        m24u.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", m24u.toString(), e2);
                    }
                }
                layoutParams.f3071b = true;
            }
        }
        return layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f3070a;
        if (behavior == null || !behavior.mo1504m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f3055h) {
            return;
        }
        m1490y(false);
        this.f3055h = true;
    }

    /* renamed from: s */
    public boolean m1484s(@NonNull View view, int i2, int i3) {
        Rect m1472c = m1472c();
        m1480j(view, m1472c);
        try {
            return m1472c.contains(i2, i3);
        } finally {
            m1472c.setEmpty();
            ((Pools.SynchronizedPool) f3048y).mo2026a(m1472c);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1474B();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3065r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f3064q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3064q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3064q.setState(getDrawableState());
                }
                DrawableCompat.m1840l(this.f3064q, ViewCompat.m2231w(this));
                this.f3064q.setVisible(getVisibility() == 0, false);
                this.f3064q.setCallback(this);
            }
            ViewCompat.m2183W(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i2) {
        setStatusBarBackground(i2 != 0 ? ContextCompat.m1671d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f3064q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f3064q.setVisible(z, false);
    }

    /* renamed from: t */
    public final void m1485t(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        LayoutParams layoutParams;
        Behavior behavior;
        int m2231w = ViewCompat.m2231w(this);
        int size = this.f3049b.size();
        Rect m1472c = m1472c();
        Rect m1472c2 = m1472c();
        Rect m1472c3 = m1472c();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f3049b.get(i14);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = m1472c3;
                i3 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (layoutParams2.f3081l == this.f3049b.get(i15)) {
                        LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
                        if (layoutParams3.f3080k != null) {
                            Rect m1472c4 = m1472c();
                            Rect m1472c5 = m1472c();
                            Rect m1472c6 = m1472c();
                            m1480j(layoutParams3.f3080k, m1472c4);
                            m1477f(view, false, m1472c5);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = i14;
                            i11 = i15;
                            rect2 = m1472c3;
                            layoutParams = layoutParams2;
                            m1481k(m2231w, m1472c4, m1472c6, layoutParams3, measuredWidth, measuredHeight);
                            boolean z4 = (m1472c6.left == m1472c5.left && m1472c6.top == m1472c5.top) ? false : true;
                            m1475d(layoutParams3, m1472c6, measuredWidth, measuredHeight);
                            int i16 = m1472c6.left - m1472c5.left;
                            int i17 = m1472c6.top - m1472c5.top;
                            if (i16 != 0) {
                                ViewCompat.m2178R(view, i16);
                            }
                            if (i17 != 0) {
                                ViewCompat.m2179S(view, i17);
                            }
                            if (z4 && (behavior = layoutParams3.f3070a) != null) {
                                behavior.mo1495d(this, view, layoutParams3.f3080k);
                            }
                            m1472c4.setEmpty();
                            Pools.SynchronizedPool synchronizedPool = (Pools.SynchronizedPool) f3048y;
                            synchronizedPool.mo2026a(m1472c4);
                            m1472c5.setEmpty();
                            synchronizedPool.mo2026a(m1472c5);
                            m1472c6.setEmpty();
                            synchronizedPool.mo2026a(m1472c6);
                            i15 = i11 + 1;
                            layoutParams2 = layoutParams;
                            size = i12;
                            i14 = i13;
                            m1472c3 = rect2;
                        }
                    }
                    i11 = i15;
                    i12 = size;
                    rect2 = m1472c3;
                    i13 = i14;
                    layoutParams = layoutParams2;
                    i15 = i11 + 1;
                    layoutParams2 = layoutParams;
                    size = i12;
                    i14 = i13;
                    m1472c3 = rect2;
                }
                int i18 = size;
                Rect rect3 = m1472c3;
                i3 = i14;
                LayoutParams layoutParams4 = layoutParams2;
                m1477f(view, true, m1472c2);
                if (layoutParams4.f3076g != 0 && !m1472c2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams4.f3076g, m2231w);
                    int i19 = absoluteGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i19 == 48) {
                        m1472c.top = Math.max(m1472c.top, m1472c2.bottom);
                    } else if (i19 == 80) {
                        m1472c.bottom = Math.max(m1472c.bottom, getHeight() - m1472c2.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        m1472c.left = Math.max(m1472c.left, m1472c2.right);
                    } else if (i20 == 5) {
                        m1472c.right = Math.max(m1472c.right, getWidth() - m1472c2.left);
                    }
                }
                if (layoutParams4.f3077h != 0 && view.getVisibility() == 0 && ViewCompat.m2174N(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    LayoutParams layoutParams5 = (LayoutParams) view.getLayoutParams();
                    Behavior behavior2 = layoutParams5.f3070a;
                    Rect m1472c7 = m1472c();
                    Rect m1472c8 = m1472c();
                    m1472c8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (behavior2 == null || !behavior2.mo1492a(this, view, m1472c7)) {
                        m1472c7.set(m1472c8);
                    } else if (!m1472c8.contains(m1472c7)) {
                        StringBuilder m24u = C0000a.m24u("Rect should be within the child's bounds. Rect:");
                        m24u.append(m1472c7.toShortString());
                        m24u.append(" | Bounds:");
                        m24u.append(m1472c8.toShortString());
                        throw new IllegalArgumentException(m24u.toString());
                    }
                    m1472c8.setEmpty();
                    Pools.SynchronizedPool synchronizedPool2 = (Pools.SynchronizedPool) f3048y;
                    synchronizedPool2.mo2026a(m1472c8);
                    if (m1472c7.isEmpty()) {
                        m1472c7.setEmpty();
                        synchronizedPool2.mo2026a(m1472c7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(layoutParams5.f3077h, m2231w);
                        if ((absoluteGravity2 & 48) != 48 || (i9 = (m1472c7.top - ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin) - layoutParams5.f3079j) >= (i10 = m1472c.top)) {
                            z2 = false;
                        } else {
                            m1473A(view, i10 - i9);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - m1472c7.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) + layoutParams5.f3079j) < (i8 = m1472c.bottom)) {
                            m1473A(view, height - i8);
                            z2 = true;
                        }
                        if (!z2) {
                            m1473A(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i6 = (m1472c7.left - ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin) - layoutParams5.f3078i) >= (i7 = m1472c.left)) {
                            z3 = false;
                        } else {
                            m1491z(view, i7 - i6);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - m1472c7.right) - ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin) + layoutParams5.f3078i) < (i5 = m1472c.right)) {
                            m1491z(view, width - i5);
                            z3 = true;
                        }
                        if (!z3) {
                            m1491z(view, 0);
                        }
                        m1472c7.setEmpty();
                        synchronizedPool2.mo2026a(m1472c7);
                    }
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((LayoutParams) view.getLayoutParams()).f3086q);
                    if (rect.equals(m1472c2)) {
                        i4 = i18;
                    } else {
                        ((LayoutParams) view.getLayoutParams()).f3086q.set(m1472c2);
                    }
                } else {
                    rect = rect3;
                }
                i4 = i18;
                for (int i21 = i3 + 1; i21 < i4; i21++) {
                    View view2 = this.f3049b.get(i21);
                    LayoutParams layoutParams6 = (LayoutParams) view2.getLayoutParams();
                    Behavior behavior3 = layoutParams6.f3070a;
                    if (behavior3 != null && behavior3.mo1493b(this, view2, view)) {
                        if (i2 == 0 && layoutParams6.f3085p) {
                            layoutParams6.f3085p = false;
                        } else {
                            if (i2 != 2) {
                                z = behavior3.mo1495d(this, view2, view);
                            } else {
                                behavior3.mo1496e(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                layoutParams6.f3085p = z;
                            }
                        }
                    }
                }
            }
            i14 = i3 + 1;
            size = i4;
            m1472c3 = rect;
        }
        Rect rect4 = m1472c3;
        m1472c.setEmpty();
        Pools.SynchronizedPool synchronizedPool3 = (Pools.SynchronizedPool) f3048y;
        synchronizedPool3.mo2026a(m1472c);
        m1472c2.setEmpty();
        synchronizedPool3.mo2026a(m1472c2);
        rect4.setEmpty();
        synchronizedPool3.mo2026a(rect4);
    }

    /* renamed from: u */
    public void m1486u(@NonNull View view, int i2) {
        Rect m1472c;
        Rect m1472c2;
        Pools.SynchronizedPool synchronizedPool;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.f3080k;
        int i3 = 0;
        if (view2 == null && layoutParams.f3075f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m1472c = m1472c();
            m1472c2 = m1472c();
            try {
                m1480j(view2, m1472c);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1481k(i2, m1472c, m1472c2, layoutParams2, measuredWidth, measuredHeight);
                m1475d(layoutParams2, m1472c2, measuredWidth, measuredHeight);
                view.layout(m1472c2.left, m1472c2.top, m1472c2.right, m1472c2.bottom);
                return;
            } finally {
                m1472c.setEmpty();
                synchronizedPool = (Pools.SynchronizedPool) f3048y;
                synchronizedPool.mo2026a(m1472c);
                m1472c2.setEmpty();
                synchronizedPool.mo2026a(m1472c2);
            }
        }
        int i4 = layoutParams.f3074e;
        if (i4 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            m1472c = m1472c();
            m1472c.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.f3062o != null && ViewCompat.m2225t(this) && !ViewCompat.m2225t(view)) {
                m1472c.left = this.f3062o.m2426g() + m1472c.left;
                m1472c.top = this.f3062o.m2428i() + m1472c.top;
                m1472c.right -= this.f3062o.m2427h();
                m1472c.bottom -= this.f3062o.m2425f();
            }
            m1472c2 = m1472c();
            int i5 = layoutParams3.f3072c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i5 |= 48;
            }
            GravityCompat.m2084a(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), m1472c, m1472c2, i2);
            view.layout(m1472c2.left, m1472c2.top, m1472c2.right, m1472c2.bottom);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i6 = layoutParams4.f3072c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int m1482q = m1482q(i4) - measuredWidth2;
        if (i7 == 1) {
            m1482q += measuredWidth2 / 2;
        } else if (i7 == 5) {
            m1482q += measuredWidth2;
        }
        if (i8 == 16) {
            i3 = 0 + (measuredHeight2 / 2);
        } else if (i8 == 80) {
            i3 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(m1482q, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* renamed from: v */
    public void m1487v(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3064q;
    }

    /* renamed from: w */
    public final boolean m1488w(MotionEvent motionEvent, int i2) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3051d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f3047x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.f3070a;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && behavior != null) {
                    if (i2 == 0) {
                        z2 = behavior.mo1498g(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z2 = behavior.mo1509r(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f3058k = view;
                    }
                }
                if (layoutParams.f3070a == null) {
                    layoutParams.f3082m = false;
                }
                boolean z4 = layoutParams.f3082m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    layoutParams.f3082m = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    behavior.mo1498g(this, view, motionEvent2);
                } else if (i2 == 1) {
                    behavior.mo1509r(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0075, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f A[SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1489x() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1489x():void");
    }

    /* renamed from: y */
    public final void m1490y(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f3070a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.mo1498g(this, childAt, obtain);
                } else {
                    behavior.mo1509r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).f3082m = false;
        }
        this.f3058k = null;
        this.f3055h = false;
    }

    /* renamed from: z */
    public final void m1491z(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.f3078i;
        if (i3 != i2) {
            ViewCompat.m2178R(view, i2 - i3);
            layoutParams.f3078i = i2;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public SparseArray<Parcelable> f3088d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3088d = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f3088d.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            SparseArray<Parcelable> sparseArray = this.f3088d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f3088d.keyAt(i3);
                parcelableArr[i3] = this.f3088d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f3070a;

        /* renamed from: b */
        public boolean f3071b;

        /* renamed from: c */
        public int f3072c;

        /* renamed from: d */
        public int f3073d;

        /* renamed from: e */
        public int f3074e;

        /* renamed from: f */
        public int f3075f;

        /* renamed from: g */
        public int f3076g;

        /* renamed from: h */
        public int f3077h;

        /* renamed from: i */
        public int f3078i;

        /* renamed from: j */
        public int f3079j;

        /* renamed from: k */
        public View f3080k;

        /* renamed from: l */
        public View f3081l;

        /* renamed from: m */
        public boolean f3082m;

        /* renamed from: n */
        public boolean f3083n;

        /* renamed from: o */
        public boolean f3084o;

        /* renamed from: p */
        public boolean f3085p;

        /* renamed from: q */
        public final Rect f3086q;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f3071b = false;
            this.f3072c = 0;
            this.f3073d = 0;
            this.f3074e = -1;
            this.f3075f = -1;
            this.f3076g = 0;
            this.f3077h = 0;
            this.f3086q = new Rect();
        }

        /* renamed from: a */
        public boolean m1510a(int i2) {
            if (i2 == 0) {
                return this.f3083n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f3084o;
        }

        /* renamed from: b */
        public void m1511b(@Nullable Behavior behavior) {
            Behavior behavior2 = this.f3070a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo1497f();
                }
                this.f3070a = behavior;
                this.f3071b = true;
                if (behavior != null) {
                    behavior.mo1494c(this);
                }
            }
        }

        /* renamed from: c */
        public void m1512c(int i2, boolean z) {
            if (i2 == 0) {
                this.f3083n = z;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f3084o = z;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior newInstance;
            this.f3071b = false;
            this.f3072c = 0;
            this.f3073d = 0;
            this.f3074e = -1;
            this.f3075f = -1;
            this.f3076g = 0;
            this.f3077h = 0;
            this.f3086q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0219R.styleable.f3043b);
            this.f3072c = obtainStyledAttributes.getInteger(0, 0);
            this.f3075f = obtainStyledAttributes.getResourceId(1, -1);
            this.f3073d = obtainStyledAttributes.getInteger(2, 0);
            this.f3074e = obtainStyledAttributes.getInteger(6, -1);
            this.f3076g = obtainStyledAttributes.getInt(5, 0);
            this.f3077h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f3071b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f3044u;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f3044u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f3046w;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3045v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(C0000a.m14k("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f3070a = newInstance;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f3070a;
            if (behavior != null) {
                behavior.mo1494c(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3071b = false;
            this.f3072c = 0;
            this.f3073d = 0;
            this.f3074e = -1;
            this.f3075f = -1;
            this.f3076g = 0;
            this.f3077h = 0;
            this.f3086q = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3071b = false;
            this.f3072c = 0;
            this.f3073d = 0;
            this.f3074e = -1;
            this.f3075f = -1;
            this.f3076g = 0;
            this.f3077h = 0;
            this.f3086q = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3071b = false;
            this.f3072c = 0;
            this.f3073d = 0;
            this.f3074e = -1;
            this.f3075f = -1;
            this.f3076g = 0;
            this.f3077h = 0;
            this.f3086q = new Rect();
        }
    }
}

package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements Openable {

    /* renamed from: q */
    public static final int[] f3923q = {R.attr.layout_gravity};

    /* renamed from: r */
    public static final boolean f3924r;

    /* renamed from: s */
    public static final boolean f3925s;

    /* renamed from: t */
    public static boolean f3926t;

    /* renamed from: b */
    public float f3927b;

    /* renamed from: c */
    public float f3928c;

    /* renamed from: d */
    public boolean f3929d;

    /* renamed from: e */
    public boolean f3930e;

    /* renamed from: f */
    public int f3931f;

    /* renamed from: g */
    public int f3932g;

    /* renamed from: h */
    public int f3933h;

    /* renamed from: i */
    public int f3934i;

    /* renamed from: j */
    @Nullable
    public DrawerListener f3935j;

    /* renamed from: k */
    public List<DrawerListener> f3936k;

    /* renamed from: l */
    public Drawable f3937l;

    /* renamed from: m */
    public Object f3938m;

    /* renamed from: n */
    public boolean f3939n;

    /* renamed from: o */
    public Rect f3940o;

    /* renamed from: p */
    public Matrix f3941p;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$1 */
    public class C02881 implements AccessibilityViewCommand {
        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: d */
        public boolean mo2531d(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
            throw null;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$2 */
    class ViewOnApplyWindowInsetsListenerC02892 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f3938m = windowInsets;
            drawerLayout.f3939n = z;
            drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: a */
        public boolean mo2041a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f3570a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: c */
        public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
            this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f3924r) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f3743a);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(obtain);
                this.f3570a.onInitializeAccessibilityNodeInfo(view, obtain);
                accessibilityNodeInfoCompat.f3745c = -1;
                accessibilityNodeInfoCompat.f3743a.setSource(view);
                Object m2161C = ViewCompat.m2161C(view);
                if (m2161C instanceof View) {
                    accessibilityNodeInfoCompat.m2514t((View) m2161C);
                }
                obtain.getBoundsInScreen(null);
                accessibilityNodeInfoCompat.f3743a.setBoundsInScreen(null);
                accessibilityNodeInfoCompat.f3743a.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfoCompat.f3743a.setPackageName(accessibilityNodeInfoCompat2.m2503i());
                accessibilityNodeInfoCompat.f3743a.setClassName(accessibilityNodeInfoCompat2.m2500e());
                accessibilityNodeInfoCompat.f3743a.setContentDescription(accessibilityNodeInfoCompat2.m2501g());
                accessibilityNodeInfoCompat.f3743a.setEnabled(accessibilityNodeInfoCompat2.m2505k());
                accessibilityNodeInfoCompat.f3743a.setFocused(accessibilityNodeInfoCompat2.m2507m());
                accessibilityNodeInfoCompat.f3743a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfoCompat.f3743a.setSelected(accessibilityNodeInfoCompat2.m2508n());
                accessibilityNodeInfoCompat.f3743a.addAction(accessibilityNodeInfoCompat2.m2499d());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.m2753k(childAt)) {
                        accessibilityNodeInfoCompat.f3743a.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.f3743a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.f3743a.setFocusable(false);
            accessibilityNodeInfoCompat.f3743a.setFocused(false);
            accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746e);
            accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3747f);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: f */
        public boolean mo2046f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3924r || DrawerLayout.m2753k(view)) {
                return this.f3570a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        public ChildAccessibilityDelegate() {
            super(AccessibilityDelegateCompat.f3569c);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            if (DrawerLayout.m2753k(view)) {
                return;
            }
            accessibilityNodeInfoCompat.m2514t(null);
        }
    }

    public interface DrawerListener {
        /* renamed from: a */
        void mo354a(@NonNull View view, float f2);
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        /* renamed from: a */
        public void mo354a(View view, float f2) {
        }
    }

    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1 */
        public class RunnableC02911 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: a */
        public int mo2737a(View view, int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: b */
        public int mo2738b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: c */
        public int mo2739c(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: e */
        public void mo2741e(int i2, int i3) {
            if ((i2 & 1) != 1) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: f */
        public void mo2742f(int i2, int i3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: g */
        public void mo2743g(View view, int i2) {
            Objects.requireNonNull((LayoutParams) view.getLayoutParams());
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: h */
        public void mo2744h(int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: i */
        public void mo2745i(View view, int i2, int i3, int i4, int i5) {
            view.getWidth();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: j */
        public void mo2746j(View view, float f2, float f3) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: k */
        public boolean mo2747k(View view, int i2) {
            throw null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f3924r = true;
        f3925s = true;
        f3926t = i2 >= 29;
    }

    /* renamed from: j */
    public static String m2752j(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    /* renamed from: k */
    public static boolean m2753k(View view) {
        return (ViewCompat.m2227u(view) == 4 || ViewCompat.m2227u(view) == 2) ? false : true;
    }

    /* renamed from: a */
    public boolean m2754a(View view, int i2) {
        return (m2762i(view) & i2) == i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!m2765n(childAt)) {
                throw null;
            }
            if (m2764m(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z = true;
            }
        }
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (m2758e() != null || m2765n(view)) {
            ViewCompat.m2216o0(view, 4);
        } else {
            ViewCompat.m2216o0(view, 1);
        }
        if (f3924r) {
            return;
        }
        ViewCompat.m2196e0(view, null);
    }

    /* renamed from: b */
    public void m2755b(@NonNull View view, boolean z) {
        if (!m2765n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f3930e) {
            layoutParams.f3943b = 0.0f;
            layoutParams.f3944c = 0;
            invalidate();
        } else {
            if (!z) {
                m2767p(view, 0.0f);
                throw null;
            }
            layoutParams.f3944c |= 4;
            if (m2754a(view, 3)) {
                view.getWidth();
                view.getTop();
                throw null;
            }
            getWidth();
            view.getTop();
            throw null;
        }
    }

    /* renamed from: c */
    public void m2756c(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2765n(childAt)) {
                if (!z) {
                    childAt.getWidth();
                    if (m2754a(childAt, 3)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
                Objects.requireNonNull(layoutParams);
            }
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).f3943b);
        }
        this.f3928c = f2;
        throw null;
    }

    /* renamed from: d */
    public View m2757d(int i2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, ViewCompat.m2231w(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m2762i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3928c <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (this.f3940o == null) {
                this.f3940o = new Rect();
            }
            childAt.getHitRect(this.f3940o);
            if (this.f3940o.contains((int) x, (int) y) && !m2763l(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f3941p == null) {
                            this.f3941p = new Matrix();
                        }
                        matrix.invert(this.f3941p);
                        obtain.transform(this.f3941p);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean m2763l = m2763l(view);
        int width = getWidth();
        int save = canvas.save();
        if (m2763l) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m2765n(childAt) && childAt.getHeight() >= height) {
                        if (m2754a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        if (this.f3928c <= 0.0f || !m2763l) {
            return drawChild;
        }
        throw null;
    }

    /* renamed from: e */
    public View m2758e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).f3944c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m2759f() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (m2765n(childAt) && m2766o(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public int m2760g(int i2) {
        int m2231w = ViewCompat.m2231w(this);
        if (i2 == 3) {
            int i3 = this.f3931f;
            if (i3 != 3) {
                return i3;
            }
            int i4 = m2231w == 0 ? this.f3933h : this.f3934i;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.f3932g;
            if (i5 != 3) {
                return i5;
            }
            int i6 = m2231w == 0 ? this.f3934i : this.f3933h;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.f3933h;
            if (i7 != 3) {
                return i7;
            }
            int i8 = m2231w == 0 ? this.f3931f : this.f3932g;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.f3934i;
        if (i9 != 3) {
            return i9;
        }
        int i10 = m2231w == 0 ? this.f3932g : this.f3931f;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f3925s) {
            return this.f3927b;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3937l;
    }

    /* renamed from: h */
    public int m2761h(@NonNull View view) {
        if (m2765n(view)) {
            return m2760g(((LayoutParams) view.getLayoutParams()).f3942a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: i */
    public int m2762i(View view) {
        return Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f3942a, ViewCompat.m2231w(this));
    }

    /* renamed from: l */
    public boolean m2763l(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3942a == 0;
    }

    /* renamed from: m */
    public boolean m2764m(@NonNull View view) {
        if (m2765n(view)) {
            return (((LayoutParams) view.getLayoutParams()).f3944c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: n */
    public boolean m2765n(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f3942a, ViewCompat.m2231w(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: o */
    public boolean m2766o(@NonNull View view) {
        if (m2765n(view)) {
            return ((LayoutParams) view.getLayoutParams()).f3943b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3930e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3930e = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3939n || this.f3937l == null) {
            return;
        }
        Object obj = this.f3938m;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f3937l.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f3937l.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (m2759f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View m2759f = m2759f();
        if (m2759f == null || m2761h(m2759f) != 0) {
            return m2759f != null;
        }
        m2756c(false);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f2;
        int i6;
        this.f3929d = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2763l(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2754a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.f3943b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - r11) / f4;
                        i6 = i7 - ((int) (layoutParams.f3943b * f4));
                    }
                    boolean z2 = f2 != layoutParams.f3943b;
                    int i10 = layoutParams.f3942a & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z2) {
                        m2770s(childAt, f2);
                    }
                    int i18 = layoutParams.f3943b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f3926t && (rootWindowInsets = getRootWindowInsets()) != null) {
            WindowInsetsCompat.m2419p(rootWindowInsets, null).m2424e();
            throw null;
        }
        this.f3929d = false;
        this.f3930e = false;
    }

    @Override // android.view.View
    @SuppressLint
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z = this.f3938m != null && ViewCompat.m2225t(this);
        int m2231w = ViewCompat.m2231w(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f3942a, m2231w);
                    if (ViewCompat.m2225t(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f3938m;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f3938m;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m2763l(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!m2765n(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f3925s) {
                        float m2221r = ViewCompat.m2221r(childAt);
                        float f2 = this.f3927b;
                        if (m2221r != f2) {
                            ViewCompat.m2212m0(childAt, f2);
                        }
                    }
                    int m2762i = m2762i(childAt) & 7;
                    boolean z4 = m2762i == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        StringBuilder m24u = C0000a.m24u("Child drawer has absolute gravity ");
                        m24u.append(m2752j(m2762i));
                        m24u.append(" but this ");
                        m24u.append("DrawerLayout");
                        m24u.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(m24u.toString());
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + i4 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    i5++;
                    i4 = 0;
                }
            }
            i5++;
            i4 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View m2757d;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        int i2 = savedState.f3945d;
        if (i2 != 0 && (m2757d = m2757d(i2)) != null) {
            m2768q(m2757d, true);
        }
        int i3 = savedState.f3946e;
        if (i3 != 3) {
            m2769r(i3, 3);
        }
        int i4 = savedState.f3947f;
        if (i4 != 3) {
            m2769r(i4, 5);
        }
        int i5 = savedState.f3948g;
        if (i5 != 3) {
            m2769r(i5, 8388611);
        }
        int i6 = savedState.f3949h;
        if (i6 != 3) {
            m2769r(i6, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (f3925s) {
            return;
        }
        ViewCompat.m2231w(this);
        ViewCompat.m2231w(this);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int i3 = layoutParams.f3944c;
            boolean z = i3 == 1;
            boolean z2 = i3 == 2;
            if (z || z2) {
                savedState.f3945d = layoutParams.f3942a;
                break;
            }
        }
        savedState.f3946e = this.f3931f;
        savedState.f3947f = this.f3932g;
        savedState.f3948g = this.f3933h;
        savedState.f3949h = this.f3934i;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    /* renamed from: p */
    public void m2767p(View view, float f2) {
        float f3 = ((LayoutParams) view.getLayoutParams()).f3943b;
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (f3 * width));
        if (!m2754a(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        m2770s(view, f2);
    }

    /* renamed from: q */
    public void m2768q(@NonNull View view, boolean z) {
        if (!m2765n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f3930e) {
            layoutParams.f3943b = 1.0f;
            layoutParams.f3944c = 1;
            m2772u(view, true);
            m2771t(view);
            invalidate();
            return;
        }
        if (!z) {
            m2767p(view, 1.0f);
            throw null;
        }
        layoutParams.f3944c |= 2;
        if (m2754a(view, 3)) {
            view.getTop();
            throw null;
        }
        getWidth();
        view.getWidth();
        view.getTop();
        throw null;
    }

    /* renamed from: r */
    public void m2769r(int i2, int i3) {
        View m2757d;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, ViewCompat.m2231w(this));
        if (i3 == 3) {
            this.f3931f = i2;
        } else if (i3 == 5) {
            this.f3932g = i2;
        } else if (i3 == 8388611) {
            this.f3933h = i2;
        } else if (i3 == 8388613) {
            this.f3934i = i2;
        }
        if (i2 != 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 && (m2757d = m2757d(absoluteGravity)) != null) {
                m2768q(m2757d, true);
                return;
            }
            return;
        }
        View m2757d2 = m2757d(absoluteGravity);
        if (m2757d2 != null) {
            m2755b(m2757d2, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m2756c(true);
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3929d) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public void m2770s(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 == layoutParams.f3943b) {
            return;
        }
        layoutParams.f3943b = f2;
        List<DrawerListener> list = this.f3936k;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f3936k.get(size).mo354a(view, f2);
            }
        }
    }

    public void setDrawerElevation(float f2) {
        this.f3927b = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (m2765n(childAt)) {
                ViewCompat.m2212m0(childAt, this.f3927b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        List<DrawerListener> list;
        DrawerListener drawerListener2 = this.f3935j;
        if (drawerListener2 != null && drawerListener2 != null && (list = this.f3936k) != null) {
            list.remove(drawerListener2);
        }
        if (drawerListener != null) {
            if (this.f3936k == null) {
                this.f3936k = new ArrayList();
            }
            this.f3936k.add(drawerListener);
        }
        this.f3935j = drawerListener;
    }

    public void setDrawerLockMode(int i2) {
        m2769r(i2, 3);
        m2769r(i2, 5);
    }

    public void setScrimColor(@ColorInt int i2) {
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f3937l = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        this.f3937l = new ColorDrawable(i2);
        invalidate();
    }

    /* renamed from: t */
    public final void m2771t(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3753l;
        ViewCompat.m2188a0(accessibilityActionCompat.m2516a(), view);
        ViewCompat.m2177Q(view, 0);
        if (!m2764m(view) || m2761h(view) == 2) {
            return;
        }
        ViewCompat.m2190b0(view, accessibilityActionCompat, null, null);
    }

    /* renamed from: u */
    public final void m2772u(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || m2765n(childAt)) && !(z && childAt == view)) {
                ViewCompat.m2216o0(childAt, 4);
            } else {
                ViewCompat.m2216o0(childAt, 1);
            }
        }
    }

    public void setStatusBarBackground(int i2) {
        this.f3937l = i2 != 0 ? ContextCompat.m1671d(getContext(), i2) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3942a;

        /* renamed from: b */
        public float f3943b;

        /* renamed from: c */
        public int f3944c;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3942a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3923q);
            this.f3942a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f3942a = 0;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3942a = 0;
            this.f3942a = layoutParams.f3942a;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3942a = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3942a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.1
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
        public int f3945d;

        /* renamed from: e */
        public int f3946e;

        /* renamed from: f */
        public int f3947f;

        /* renamed from: g */
        public int f3948g;

        /* renamed from: h */
        public int f3949h;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3945d = 0;
            this.f3945d = parcel.readInt();
            this.f3946e = parcel.readInt();
            this.f3947f = parcel.readInt();
            this.f3948g = parcel.readInt();
            this.f3949h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f3945d);
            parcel.writeInt(this.f3946e);
            parcel.writeInt(this.f3947f);
            parcel.writeInt(this.f3948g);
            parcel.writeInt(this.f3949h);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f3945d = 0;
        }
    }
}

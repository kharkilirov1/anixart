package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.EdgeEffectCompat;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import p000a.C0000a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {

    /* renamed from: B */
    public static final AccessibilityDelegate f3819B = new AccessibilityDelegate();

    /* renamed from: C */
    public static final int[] f3820C = {R.attr.fillViewport};

    /* renamed from: A */
    public OnScrollChangeListener f3821A;

    /* renamed from: b */
    public long f3822b;

    /* renamed from: c */
    public final Rect f3823c;

    /* renamed from: d */
    public OverScroller f3824d;

    /* renamed from: e */
    @NonNull
    @RestrictTo
    @VisibleForTesting
    public EdgeEffect f3825e;

    /* renamed from: f */
    @NonNull
    @RestrictTo
    @VisibleForTesting
    public EdgeEffect f3826f;

    /* renamed from: g */
    public int f3827g;

    /* renamed from: h */
    public boolean f3828h;

    /* renamed from: i */
    public boolean f3829i;

    /* renamed from: j */
    public View f3830j;

    /* renamed from: k */
    public boolean f3831k;

    /* renamed from: l */
    public VelocityTracker f3832l;

    /* renamed from: m */
    public boolean f3833m;

    /* renamed from: n */
    public boolean f3834n;

    /* renamed from: o */
    public int f3835o;

    /* renamed from: p */
    public int f3836p;

    /* renamed from: q */
    public int f3837q;

    /* renamed from: r */
    public int f3838r;

    /* renamed from: s */
    public final int[] f3839s;

    /* renamed from: t */
    public final int[] f3840t;

    /* renamed from: u */
    public int f3841u;

    /* renamed from: v */
    public int f3842v;

    /* renamed from: w */
    public SavedState f3843w;

    /* renamed from: x */
    public final NestedScrollingParentHelper f3844x;

    /* renamed from: y */
    public final NestedScrollingChildHelper f3845y;

    /* renamed from: z */
    public float f3846z;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public AccessibilityDelegate() {
            super(AccessibilityDelegateCompat.f3569c);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: c */
        public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
            this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.m2523a(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.m2524b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.f3743a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.f3743a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i);
                accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3754m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3749h);
                accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755n);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: g */
        public boolean mo2047g(View view, int i2, Bundle bundle) {
            if (super.mo2047g(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2606A(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m2606A(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2628a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface OnScrollChangeListener {
        /* renamed from: a */
        void mo363a(@NonNull NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f3847b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("HorizontalScrollView.SavedState{");
            m24u.append(Integer.toHexString(System.identityHashCode(this)));
            m24u.append(" scrollPosition=");
            return C0000a.m18o(m24u, this.f3847b, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3847b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3847b = parcel.readInt();
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.nestedScrollViewStyle);
        this.f3823c = new Rect();
        this.f3828h = true;
        this.f3829i = false;
        this.f3830j = null;
        this.f3831k = false;
        this.f3834n = true;
        this.f3838r = -1;
        this.f3839s = new int[2];
        this.f3840t = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        this.f3825e = i2 >= 31 ? EdgeEffectCompat.Api31Impl.m2589a(context, attributeSet) : new EdgeEffect(context);
        this.f3826f = i2 >= 31 ? EdgeEffectCompat.Api31Impl.m2589a(context, attributeSet) : new EdgeEffect(context);
        this.f3824d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3835o = viewConfiguration.getScaledTouchSlop();
        this.f3836p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3837q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3820C, C2507R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3844x = new NestedScrollingParentHelper();
        this.f3845y = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m2196e0(this, f3819B);
    }

    /* renamed from: d */
    public static int m2604d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3846z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3846z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3846z;
    }

    /* renamed from: r */
    public static boolean m2605r(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2605r((View) parent, view2);
    }

    /* renamed from: A */
    public final void m2606A(int i2, int i3, int i4, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3822b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3824d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i4);
            m2625x(z);
        } else {
            if (!this.f3824d.isFinished()) {
                m2610a();
            }
            scrollBy(i2, i3);
        }
        this.f3822b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: B */
    public boolean m2607B(int i2, int i3) {
        return this.f3845y.m2144j(i2, i3);
    }

    /* renamed from: C */
    public final boolean m2608C(MotionEvent motionEvent) {
        boolean z;
        if (EdgeEffectCompat.m2585a(this.f3825e) != 0.0f) {
            EdgeEffectCompat.m2587c(this.f3825e, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (EdgeEffectCompat.m2585a(this.f3826f) == 0.0f) {
            return z;
        }
        EdgeEffectCompat.m2587c(this.f3826f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: D */
    public void m2609D(int i2) {
        this.f3845y.m2145k(i2);
    }

    /* renamed from: a */
    public final void m2610a() {
        this.f3824d.abortAnimation();
        this.f3845y.m2145k(1);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* renamed from: b */
    public boolean m2611b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2620s(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2615h(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3823c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3823c);
            m2615h(m2613e(this.f3823c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!m2620s(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m2612c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    @RestrictTo
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    @RestrictTo
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3824d.isFinished()) {
            return;
        }
        this.f3824d.computeScrollOffset();
        int currY = this.f3824d.getCurrY();
        int i2 = currY - this.f3842v;
        this.f3842v = currY;
        int[] iArr = this.f3840t;
        boolean z = false;
        iArr[1] = 0;
        m2614f(0, i2, iArr, null, 1);
        int i3 = i2 - this.f3840t[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            m2623v(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.f3840t;
            iArr2[1] = 0;
            this.f3845y.m2140f(0, scrollY2, 0, i4, this.f3839s, 1, iArr2);
            i3 = i4 - this.f3840t[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i3 < 0) {
                    if (this.f3825e.isFinished()) {
                        this.f3825e.onAbsorb((int) this.f3824d.getCurrVelocity());
                    }
                } else if (this.f3826f.isFinished()) {
                    this.f3826f.onAbsorb((int) this.f3824d.getCurrVelocity());
                }
            }
            m2610a();
        }
        if (this.f3824d.isFinished()) {
            this.f3845y.m2145k(1);
        } else {
            ViewCompat.m2183W(this);
        }
    }

    @Override // android.view.View
    @RestrictTo
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    @RestrictTo
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2616i(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f3845y.m2135a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f3845y.m2136b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return m2614f(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr) {
        return this.f3845y.m2139e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.f3825e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (Api21Impl.m2628a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft() + 0;
            } else {
                i2 = 0;
            }
            if (Api21Impl.m2628a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            this.f3825e.setSize(width, height);
            if (this.f3825e.draw(canvas)) {
                ViewCompat.m2183W(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f3826f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (Api21Impl.m2628a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = 0 + getPaddingLeft();
        }
        if (Api21Impl.m2628a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3826f.setSize(width2, height2);
        if (this.f3826f.draw(canvas)) {
            ViewCompat.m2183W(this);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: e */
    public int m2613e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: f */
    public boolean m2614f(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2, int i4) {
        return this.f3845y.m2137c(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    /* renamed from: g */
    public void mo675g(@NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        m2621t(i5, i6, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3844x.m2146a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final void m2615h(int i2) {
        if (i2 != 0) {
            if (this.f3834n) {
                m2606A(0, i2, 250, false);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m2619q(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2616i(@androidx.annotation.NonNull android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2616i(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3845y.f3630d;
    }

    /* renamed from: j */
    public void m2617j(int i2) {
        if (getChildCount() > 0) {
            this.f3824d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2625x(true);
        }
    }

    /* renamed from: k */
    public boolean m2618k(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f3823c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3823c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f3823c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3823c;
        return m2626y(i2, rect3.top, rect3.bottom);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: l */
    public void mo680l(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
        m2621t(i5, i6, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: m */
    public boolean mo681m(@NonNull View view, @NonNull View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: n */
    public void mo682n(@NonNull View view, @NonNull View view2, int i2, int i3) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f3844x;
        if (i3 == 1) {
            nestedScrollingParentHelper.f3633b = i2;
        } else {
            nestedScrollingParentHelper.f3632a = i2;
        }
        m2607B(2, i3);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: o */
    public void mo683o(@NonNull View view, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f3844x;
        if (i2 == 1) {
            nestedScrollingParentHelper.f3633b = 0;
        } else {
            nestedScrollingParentHelper.f3632a = 0;
        }
        m2609D(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3829i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int i2 = 0;
        if (motionEvent.getAction() == 8 && !this.f3831k) {
            float axisValue = MotionEventCompat.m2134a(motionEvent, 2) ? motionEvent.getAxisValue(9) : MotionEventCompat.m2134a(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY - verticalScrollFactorCompat;
                if (i3 < 0) {
                    if (m2612c() && !MotionEventCompat.m2134a(motionEvent, 8194)) {
                        EdgeEffectCompat.m2587c(this.f3825e, (-i3) / getHeight(), 0.5f);
                        this.f3825e.onRelease();
                        invalidate();
                        z = 1;
                    }
                    z = 0;
                } else if (i3 > scrollRange) {
                    if (m2612c() && !MotionEventCompat.m2134a(motionEvent, 8194)) {
                        EdgeEffectCompat.m2587c(this.f3826f, (i3 - scrollRange) / getHeight(), 0.5f);
                        this.f3826f.onRelease();
                        invalidate();
                        i2 = 1;
                    }
                    z = i2;
                    i2 = scrollRange;
                } else {
                    i2 = i3;
                    z = 0;
                }
                if (i2 == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        this.f3828h = false;
        View view = this.f3830j;
        if (view != null && m2605r(view, this)) {
            m2627z(this.f3830j);
        }
        this.f3830j = null;
        if (!this.f3829i) {
            if (this.f3843w != null) {
                scrollTo(getScrollX(), this.f3843w.f3847b);
                this.f3843w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m2604d = m2604d(scrollY, paddingTop, i6);
            if (m2604d != scrollY) {
                scrollTo(getScrollX(), m2604d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3829i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3833m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m2617j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i2, int i3, @NonNull int[] iArr) {
        m2614f(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(@NonNull View view, int i2, int i3, int i4, int i5) {
        m2621t(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i2) {
        this.f3844x.f3632a = i2;
        m2607B(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || (true ^ m2620s(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3843w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3847b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        OnScrollChangeListener onScrollChangeListener = this.f3821A;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.mo363a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m2620s(findFocus, 0, i5)) {
            return;
        }
        findFocus.getDrawingRect(this.f3823c);
        offsetDescendantRectToMyCoords(findFocus, this.f3823c);
        m2615h(m2613e(this.f3823c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f3844x.f3632a = 0;
        m2609D(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0252  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: p */
    public void mo684p(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        m2614f(i2, i3, iArr, null, i4);
    }

    /* renamed from: q */
    public boolean m2619q(int i2) {
        return this.f3845y.m2141g(i2) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3828h) {
            this.f3830j = view2;
        } else {
            m2627z(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m2613e = m2613e(rect);
        boolean z2 = m2613e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m2613e);
            } else {
                m2606A(0, m2613e, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2624w();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3828h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m2620s(View view, int i2, int i3) {
        view.getDrawingRect(this.f3823c);
        offsetDescendantRectToMyCoords(view, this.f3823c);
        return this.f3823c.bottom + i2 >= getScrollY() && this.f3823c.top - i2 <= getScrollY() + i3;
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m2604d = m2604d(i2, width, width2);
            int m2604d2 = m2604d(i3, height, height2);
            if (m2604d == getScrollX() && m2604d2 == getScrollY()) {
                return;
            }
            super.scrollTo(m2604d, m2604d2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3833m) {
            this.f3833m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f3845y.m2143i(z);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.f3821A = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3834n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f3845y.m2144j(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3845y.m2145k(0);
    }

    /* renamed from: t */
    public final void m2621t(int i2, int i3, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3845y.m2138d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* renamed from: u */
    public final void m2622u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3838r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f3827g = (int) motionEvent.getY(i2);
            this.f3838r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f3832l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2623v(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m2619q(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f3824d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2623v(int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: w */
    public final void m2624w() {
        VelocityTracker velocityTracker = this.f3832l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3832l = null;
        }
    }

    /* renamed from: x */
    public final void m2625x(boolean z) {
        if (z) {
            m2607B(2, 1);
        } else {
            this.f3845y.m2145k(1);
        }
        this.f3842v = getScrollY();
        ViewCompat.m2183W(this);
    }

    /* renamed from: y */
    public final boolean m2626y(int i2, int i3, int i4) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = i2 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z4 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m2615h(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z;
    }

    /* renamed from: z */
    public final void m2627z(View view) {
        view.getDrawingRect(this.f3823c);
        offsetDescendantRectToMyCoords(view, this.f3823c);
        int m2613e = m2613e(this.f3823c);
        if (m2613e != 0) {
            scrollBy(0, m2613e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}

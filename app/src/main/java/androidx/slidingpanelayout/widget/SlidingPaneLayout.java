package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.C0686a;
import androidx.window.layout.FoldingFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {

    /* renamed from: z */
    public static boolean f5976z;

    /* renamed from: b */
    public int f5977b;

    /* renamed from: c */
    public int f5978c;

    /* renamed from: d */
    public Drawable f5979d;

    /* renamed from: e */
    public Drawable f5980e;

    /* renamed from: f */
    public boolean f5981f;

    /* renamed from: g */
    public View f5982g;

    /* renamed from: h */
    public float f5983h;

    /* renamed from: i */
    public float f5984i;

    /* renamed from: j */
    public int f5985j;

    /* renamed from: k */
    public boolean f5986k;

    /* renamed from: l */
    public int f5987l;

    /* renamed from: m */
    public float f5988m;

    /* renamed from: n */
    public float f5989n;

    /* renamed from: o */
    public final List<PanelSlideListener> f5990o;

    /* renamed from: p */
    @Nullable
    public PanelSlideListener f5991p;

    /* renamed from: q */
    public final ViewDragHelper f5992q;

    /* renamed from: r */
    public boolean f5993r;

    /* renamed from: s */
    public boolean f5994s;

    /* renamed from: t */
    public final Rect f5995t;

    /* renamed from: u */
    public final ArrayList<DisableLayerRunnable> f5996u;

    /* renamed from: v */
    public int f5997v;

    /* renamed from: w */
    public FoldingFeature f5998w;

    /* renamed from: x */
    public FoldingFeatureObserver.OnFoldingFeatureChangeListener f5999x;

    /* renamed from: y */
    public FoldingFeatureObserver f6000y;

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final Rect f6002d;

        public AccessibilityDelegate() {
            super(AccessibilityDelegateCompat.f3569c);
            this.f6002d = new Rect();
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: c */
        public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
            this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f3743a);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(obtain);
            this.f3570a.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.f6002d;
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.f3743a.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.f3743a.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfoCompat.f3743a.setPackageName(accessibilityNodeInfoCompat2.m2503i());
            accessibilityNodeInfoCompat.f3743a.setClassName(accessibilityNodeInfoCompat2.m2500e());
            accessibilityNodeInfoCompat.f3743a.setContentDescription(accessibilityNodeInfoCompat2.m2501g());
            accessibilityNodeInfoCompat.f3743a.setEnabled(accessibilityNodeInfoCompat2.m2505k());
            accessibilityNodeInfoCompat.f3743a.setClickable(obtain.isClickable());
            accessibilityNodeInfoCompat.f3743a.setFocusable(accessibilityNodeInfoCompat2.m2506l());
            accessibilityNodeInfoCompat.f3743a.setFocused(accessibilityNodeInfoCompat2.m2507m());
            accessibilityNodeInfoCompat.f3743a.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfoCompat.f3743a.setSelected(accessibilityNodeInfoCompat2.m2508n());
            accessibilityNodeInfoCompat.f3743a.setLongClickable(obtain.isLongClickable());
            accessibilityNodeInfoCompat.f3743a.addAction(accessibilityNodeInfoCompat2.m2499d());
            accessibilityNodeInfoCompat.f3743a.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            accessibilityNodeInfoCompat.f3743a.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.f3745c = -1;
            accessibilityNodeInfoCompat.f3743a.setSource(view);
            Object m2161C = ViewCompat.m2161C(view);
            if (m2161C instanceof View) {
                accessibilityNodeInfoCompat.m2514t((View) m2161C);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i2);
                if (!SlidingPaneLayout.this.m4144c(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.m2216o0(childAt, 1);
                    accessibilityNodeInfoCompat.f3743a.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: f */
        public boolean mo2046f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.m4144c(view)) {
                return false;
            }
            return this.f3570a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class DisableLayerRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public class DragHelperCallback extends ViewDragHelper.Callback {
        public DragHelperCallback() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: a */
        public int mo2737a(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f5982g.getLayoutParams();
            if (!SlidingPaneLayout.this.m4145d()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i2, paddingLeft), SlidingPaneLayout.this.f5985j + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f5982g.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i2, width), width - SlidingPaneLayout.this.f5985j);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: b */
        public int mo2738b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: c */
        public int mo2739c(View view) {
            return SlidingPaneLayout.this.f5985j;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: e */
        public void mo2741e(int i2, int i3) {
            if (m4152l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f5992q.m2714c(slidingPaneLayout.f5982g, i3);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: f */
        public void mo2742f(int i2, int i3) {
            if (m4152l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f5992q.m2714c(slidingPaneLayout.f5982g, i3);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: g */
        public void mo2743g(View view, int i2) {
            SlidingPaneLayout.this.m4149h();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: h */
        public void mo2744h(int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f5992q.f3895a == 0) {
                if (slidingPaneLayout.f5983h != 1.0f) {
                    View view = slidingPaneLayout.f5982g;
                    Iterator<PanelSlideListener> it = slidingPaneLayout.f5990o.iterator();
                    while (it.hasNext()) {
                        it.next().mo3444b(view);
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    SlidingPaneLayout.this.f5993r = true;
                    return;
                }
                slidingPaneLayout.m4151j(slidingPaneLayout.f5982g);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                View view2 = slidingPaneLayout2.f5982g;
                Iterator<PanelSlideListener> it2 = slidingPaneLayout2.f5990o.iterator();
                while (it2.hasNext()) {
                    it2.next().mo3445c(view2);
                }
                slidingPaneLayout2.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.f5993r = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: i */
        public void mo2745i(View view, int i2, int i3, int i4, int i5) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f5982g == null) {
                slidingPaneLayout.f5983h = 0.0f;
            } else {
                boolean m4145d = slidingPaneLayout.m4145d();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f5982g.getLayoutParams();
                int width = slidingPaneLayout.f5982g.getWidth();
                if (m4145d) {
                    i2 = (slidingPaneLayout.getWidth() - i2) - width;
                }
                float paddingRight = (i2 - ((m4145d ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (m4145d ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f5985j;
                slidingPaneLayout.f5983h = paddingRight;
                if (slidingPaneLayout.f5987l != 0) {
                    slidingPaneLayout.m4148g(paddingRight);
                }
                View view2 = slidingPaneLayout.f5982g;
                Iterator<PanelSlideListener> it = slidingPaneLayout.f5990o.iterator();
                while (it.hasNext()) {
                    it.next().mo3443a(view2, slidingPaneLayout.f5983h);
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: j */
        public void mo2746j(View view, float f2, float f3) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m4145d()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f2 < 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.f5983h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f5985j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f5982g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f2 > 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.f5983h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f5985j;
                }
            }
            SlidingPaneLayout.this.f5992q.m2734x(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: k */
        public boolean mo2747k(View view, int i2) {
            if (m4152l()) {
                return ((LayoutParams) view.getLayoutParams()).f6007b;
            }
            return false;
        }

        /* renamed from: l */
        public final boolean m4152l() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f5986k || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.m4146e() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.m4146e() || SlidingPaneLayout.this.getLockMode() != 2;
        }
    }

    public interface PanelSlideListener {
        /* renamed from: a */
        void mo3443a(@NonNull View view, float f2);

        /* renamed from: b */
        void mo3444b(@NonNull View view);

        /* renamed from: c */
        void mo3445c(@NonNull View view);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
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
        public boolean f6009d;

        /* renamed from: e */
        public int f6010e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f6009d ? 1 : 0);
            parcel.writeInt(this.f6010e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            this.f6009d = parcel.readInt() != 0;
            this.f6010e = parcel.readInt();
        }
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: a */
        public void mo3443a(@NonNull View view, float f2) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: b */
        public void mo3444b(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        /* renamed from: c */
        public void mo3445c(@NonNull View view) {
        }
    }

    public static class TouchBlocker extends FrameLayout {
        public TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f5976z = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context) {
        super(context, null, 0);
        this.f5977b = 0;
        this.f5983h = 1.0f;
        this.f5990o = new CopyOnWriteArrayList();
        this.f5994s = true;
        this.f5995t = new Rect();
        this.f5996u = new ArrayList<>();
        this.f5999x = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            /* renamed from: a */
            public void mo4141a(@NonNull FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.f5998w = foldingFeature;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.f6267d = 300L;
                changeBounds.f6268e = PathInterpolatorCompat.m2548a(0.2f, 0.0f, 0.0f, 1.0f);
                TransitionManager.m4256a(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.m2196e0(this, new AccessibilityDelegate());
        ViewCompat.m2216o0(this, 1);
        ViewDragHelper m2710k = ViewDragHelper.m2710k(this, 0.5f, new DragHelperCallback());
        this.f5992q = m2710k;
        m2710k.f3908n = f2 * 400.0f;
        setFoldingFeatureObserver(new FoldingFeatureObserver(C0686a.m4469a(context), ContextCompat.m1672e(context)));
    }

    /* renamed from: b */
    public static int m4142b(View view) {
        return view instanceof TouchBlocker ? ViewCompat.m2235y(((TouchBlocker) view).getChildAt(0)) : ViewCompat.m2235y(view);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat m2163D;
        if (!f5976z || (m2163D = ViewCompat.m2163D(this)) == null) {
            return null;
        }
        return m2163D.m2424e();
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.f6000y = foldingFeatureObserver;
        FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = this.f5999x;
        Objects.requireNonNull(foldingFeatureObserver);
        Intrinsics.m32179h(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        foldingFeatureObserver.f5964d = onFoldingFeatureChangeListener;
    }

    /* renamed from: a */
    public final boolean m4143a(int i2) {
        if (!this.f5981f) {
            this.f5993r = false;
        }
        if (!this.f5994s && !m4150i(1.0f)) {
            return false;
        }
        this.f5993r = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i2, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    /* renamed from: c */
    public boolean m4144c(View view) {
        if (view == null) {
            return false;
        }
        return this.f5981f && ((LayoutParams) view.getLayoutParams()).f6008c && this.f5983h > 0.0f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f5992q.m2721j(true)) {
            if (this.f5981f) {
                ViewCompat.m2183W(this);
            } else {
                this.f5992q.m2712a();
            }
        }
    }

    /* renamed from: d */
    public boolean m4145d() {
        return ViewCompat.m2231w(this) == 1;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        super.draw(canvas);
        Drawable drawable = m4145d() ? this.f5980e : this.f5979d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m4145d()) {
            i3 = childAt.getRight();
            i2 = intrinsicWidth + i3;
        } else {
            int left = childAt.getLeft();
            int i4 = left - intrinsicWidth;
            i2 = left;
            i3 = i4;
        }
        drawable.setBounds(i3, top, i2, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        if (m4145d() ^ m4146e()) {
            this.f5992q.f3911q = 1;
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                ViewDragHelper viewDragHelper = this.f5992q;
                viewDragHelper.f3909o = Math.max(viewDragHelper.f3910p, systemGestureInsets.f3368a);
            }
        } else {
            this.f5992q.f3911q = 2;
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                ViewDragHelper viewDragHelper2 = this.f5992q;
                viewDragHelper2.f3909o = Math.max(viewDragHelper2.f3910p, systemGestureInsets2.f3370c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f5981f && !layoutParams.f6007b && this.f5982g != null) {
            canvas.getClipBounds(this.f5995t);
            if (m4145d()) {
                Rect rect = this.f5995t;
                rect.left = Math.max(rect.left, this.f5982g.getRight());
            } else {
                Rect rect2 = this.f5995t;
                rect2.right = Math.min(rect2.right, this.f5982g.getLeft());
            }
            canvas.clipRect(this.f5995t);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public boolean m4146e() {
        return !this.f5981f || this.f5983h == 0.0f;
    }

    /* renamed from: f */
    public boolean m4147f() {
        if (!this.f5981f) {
            this.f5993r = true;
        }
        if (!this.f5994s && !m4150i(0.0f)) {
            return false;
        }
        this.f5993r = true;
        return true;
    }

    /* renamed from: g */
    public final void m4148g(float f2) {
        boolean m4145d = m4145d();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.f5982g) {
                float f3 = 1.0f - this.f5984i;
                int i3 = this.f5987l;
                this.f5984i = f2;
                int i4 = ((int) (f3 * i3)) - ((int) ((1.0f - f2) * i3));
                if (m4145d) {
                    i4 = -i4;
                }
                childAt.offsetLeftAndRight(i4);
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f5978c;
    }

    public final int getLockMode() {
        return this.f5997v;
    }

    @Px
    public int getParallaxDistance() {
        return this.f5987l;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.f5977b;
    }

    /* renamed from: h */
    public void m4149h() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: i */
    public boolean m4150i(float f2) {
        int paddingLeft;
        if (!this.f5981f) {
            return false;
        }
        boolean m4145d = m4145d();
        LayoutParams layoutParams = (LayoutParams) this.f5982g.getLayoutParams();
        if (m4145d) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f2 * this.f5985j) + paddingRight) + this.f5982g.getWidth()));
        } else {
            paddingLeft = (int) ((f2 * this.f5985j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        ViewDragHelper viewDragHelper = this.f5992q;
        View view = this.f5982g;
        if (!viewDragHelper.m2736z(view, paddingLeft, view.getTop())) {
            return false;
        }
        m4149h();
        ViewCompat.m2183W(this);
        return true;
    }

    /* renamed from: j */
    public void m4151j(View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        View childAt;
        boolean z;
        View view2 = view;
        boolean m4145d = m4145d();
        int width = m4145d ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = m4145d ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            i2 = view.getLeft();
            i3 = view.getRight();
            i4 = view.getTop();
            i5 = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount && (childAt = getChildAt(i6)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = m4145d;
            } else {
                z = m4145d;
                childAt.setVisibility((Math.max(m4145d ? paddingLeft : width, childAt.getLeft()) < i2 || Math.max(paddingTop, childAt.getTop()) < i4 || Math.min(m4145d ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i5) ? 0 : 4);
            }
            i6++;
            view2 = view;
            m4145d = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f5994s = true;
        if (this.f6000y != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                FoldingFeatureObserver foldingFeatureObserver = this.f6000y;
                Objects.requireNonNull(foldingFeatureObserver);
                Job job = foldingFeatureObserver.f5963c;
                if (job != null) {
                    job.mo34061b(null);
                }
                foldingFeatureObserver.f5963c = BuildersKt.m33962a(CoroutineScopeKt.m34019a(ExecutorsKt.m34059a(foldingFeatureObserver.f5962b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(foldingFeatureObserver, activity, null), 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Job job;
        super.onDetachedFromWindow();
        this.f5994s = true;
        FoldingFeatureObserver foldingFeatureObserver = this.f6000y;
        if (foldingFeatureObserver != null && (job = foldingFeatureObserver.f5963c) != null) {
            job.mo34061b(null);
        }
        int size = this.f5996u.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5996u.get(i2).run();
        }
        this.f5996u.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f5981f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f5993r = this.f5992q.m2727q(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f5981f || (this.f5986k && actionMasked != 0)) {
            this.f5992q.m2713b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f5992q.m2713b();
            return false;
        }
        if (actionMasked == 0) {
            this.f5986k = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5988m = x;
            this.f5989n = y;
            if (this.f5992q.m2727q(this.f5982g, (int) x, (int) y) && m4144c(this.f5982g)) {
                z = true;
                return this.f5992q.m2735y(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float abs = Math.abs(x2 - this.f5988m);
            float abs2 = Math.abs(y2 - this.f5989n);
            ViewDragHelper viewDragHelper = this.f5992q;
            if (abs > viewDragHelper.f3896b && abs2 > abs) {
                viewDragHelper.m2713b();
                this.f5986k = true;
                return false;
            }
        }
        z = false;
        if (this.f5992q.m2735y(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean m4145d = m4145d();
        int i11 = i4 - i2;
        int paddingRight = m4145d ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = m4145d ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f5994s) {
            this.f5983h = (this.f5981f && this.f5993r) ? 0.0f : 1.0f;
        }
        int i12 = paddingRight;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i6 = i12;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f6007b) {
                    int i14 = i11 - paddingLeft;
                    int min = (Math.min(paddingRight, i14) - i12) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f5985j = min;
                    int i15 = m4145d ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f6008c = (measuredWidth / 2) + ((i12 + i15) + min) > i14;
                    int i16 = (int) (min * this.f5983h);
                    i6 = i15 + i16 + i12;
                    this.f5983h = i16 / min;
                    i7 = 0;
                } else if (!this.f5981f || (i8 = this.f5987l) == 0) {
                    i6 = paddingRight;
                    i7 = 0;
                } else {
                    i7 = (int) ((1.0f - this.f5983h) * i8);
                    i6 = paddingRight;
                }
                if (m4145d) {
                    i10 = (i11 - i6) + i7;
                    i9 = i10 - measuredWidth;
                } else {
                    i9 = i6 - i7;
                    i10 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i10, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature = this.f5998w;
                paddingRight = Math.abs((foldingFeature != null && foldingFeature.mo4441b() == FoldingFeature.Orientation.f6741b && this.f5998w.mo4440a()) ? this.f5998w.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
            }
            i13++;
            i12 = i6;
        }
        if (this.f5994s) {
            if (this.f5981f && this.f5987l != 0) {
                m4148g(this.f5983h);
            }
            m4151j(this.f5982g);
        }
        this.f5994s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0278  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v36 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        if (savedState.f6009d) {
            m4147f();
        } else {
            m4143a(0);
        }
        this.f5993r = savedState.f6009d;
        setLockMode(savedState.f6010e);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6009d = this.f5981f ? m4146e() : this.f5993r;
        savedState.f6010e = this.f5997v;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.f5994s = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5981f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f5992q.m2728r(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5988m = x;
            this.f5989n = y;
        } else if (actionMasked == 1 && m4144c(this.f5982g)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.f5988m;
            float f3 = y2 - this.f5989n;
            ViewDragHelper viewDragHelper = this.f5992q;
            int i2 = viewDragHelper.f3896b;
            if ((f3 * f3) + (f2 * f2) < i2 * i2 && viewDragHelper.m2727q(this.f5982g, (int) x2, (int) y2)) {
                m4143a(0);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f5981f) {
            return;
        }
        this.f5993r = view == this.f5982g;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i2) {
        this.f5978c = i2;
    }

    public final void setLockMode(int i2) {
        this.f5997v = i2;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.f5991p;
        if (panelSlideListener2 != null) {
            this.f5990o.remove(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            this.f5990o.add(panelSlideListener);
        }
        this.f5991p = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i2) {
        this.f5987l = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f5979d = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f5980e = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i2) {
        setShadowDrawableLeft(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.m1671d(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.m1671d(getContext(), i2));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i2) {
        this.f5977b = i2;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        public static final int[] f6005d = {R.attr.layout_weight};

        /* renamed from: a */
        public float f6006a;

        /* renamed from: b */
        public boolean f6007b;

        /* renamed from: c */
        public boolean f6008c;

        public LayoutParams() {
            super(-1, -1);
            this.f6006a = 0.0f;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f6006a = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6006a = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6006a = 0.0f;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6006a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6005d);
            this.f6006a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}

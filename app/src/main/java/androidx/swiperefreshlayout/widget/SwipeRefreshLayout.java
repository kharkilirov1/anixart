package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {

    /* renamed from: L */
    public static final int[] f6082L = {R.attr.enabled};

    /* renamed from: A */
    public CircularProgressDrawable f6083A;

    /* renamed from: B */
    public Animation f6084B;

    /* renamed from: C */
    public Animation f6085C;

    /* renamed from: D */
    public Animation f6086D;

    /* renamed from: E */
    public Animation f6087E;

    /* renamed from: F */
    public boolean f6088F;

    /* renamed from: G */
    public int f6089G;

    /* renamed from: H */
    public OnChildScrollUpCallback f6090H;

    /* renamed from: I */
    public Animation.AnimationListener f6091I;

    /* renamed from: J */
    public final Animation f6092J;

    /* renamed from: K */
    public final Animation f6093K;

    /* renamed from: b */
    public View f6094b;

    /* renamed from: c */
    public OnRefreshListener f6095c;

    /* renamed from: d */
    public boolean f6096d;

    /* renamed from: e */
    public int f6097e;

    /* renamed from: f */
    public float f6098f;

    /* renamed from: g */
    public float f6099g;

    /* renamed from: h */
    public final NestedScrollingParentHelper f6100h;

    /* renamed from: i */
    public final NestedScrollingChildHelper f6101i;

    /* renamed from: j */
    public final int[] f6102j;

    /* renamed from: k */
    public final int[] f6103k;

    /* renamed from: l */
    public boolean f6104l;

    /* renamed from: m */
    public int f6105m;

    /* renamed from: n */
    public int f6106n;

    /* renamed from: o */
    public float f6107o;

    /* renamed from: p */
    public float f6108p;

    /* renamed from: q */
    public boolean f6109q;

    /* renamed from: r */
    public int f6110r;

    /* renamed from: s */
    public final DecelerateInterpolator f6111s;

    /* renamed from: t */
    public CircleImageView f6112t;

    /* renamed from: u */
    public int f6113u;

    /* renamed from: v */
    public int f6114v;

    /* renamed from: w */
    public float f6115w;

    /* renamed from: x */
    public int f6116x;

    /* renamed from: y */
    public int f6117y;

    /* renamed from: z */
    public int f6118z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8 */
    class C06038 extends Animation {

        /* renamed from: b */
        public final /* synthetic */ SwipeRefreshLayout f6128b;

        @Override // android.view.animation.Animation
        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = this.f6128b;
            float f3 = swipeRefreshLayout.f6115w;
            swipeRefreshLayout.setAnimationProgress(((-f3) * f2) + f3);
            this.f6128b.m4175f(f2);
        }
    }

    public interface OnChildScrollUpCallback {
        /* renamed from: a */
        boolean m4182a(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    public interface OnRefreshListener {
        /* renamed from: u */
        void mo2565u();
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6096d = false;
        this.f6098f = -1.0f;
        this.f6102j = new int[2];
        this.f6103k = new int[2];
        this.f6110r = -1;
        this.f6113u = -1;
        this.f6091I = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.f6096d) {
                    swipeRefreshLayout.m4177i();
                    return;
                }
                swipeRefreshLayout.f6083A.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                SwipeRefreshLayout.this.f6083A.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f6088F && (onRefreshListener = swipeRefreshLayout2.f6095c) != null) {
                    onRefreshListener.mo2565u();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f6106n = swipeRefreshLayout3.f6112t.getTop();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f6092J = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f2, Transformation transformation) {
                Objects.requireNonNull(SwipeRefreshLayout.this);
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                int abs = swipeRefreshLayout.f6117y - Math.abs(swipeRefreshLayout.f6116x);
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f6114v + ((int) ((abs - r1) * f2))) - swipeRefreshLayout2.f6112t.getTop());
                CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.f6083A;
                float f3 = 1.0f - f2;
                CircularProgressDrawable.Ring ring = circularProgressDrawable.f6051b;
                if (f3 != ring.f6076p) {
                    ring.f6076p = f3;
                }
                circularProgressDrawable.invalidateSelf();
            }
        };
        this.f6093K = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.m4175f(f2);
            }
        };
        this.f6097e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6105m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f6111s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6089G = (int) (displayMetrics.density * 40.0f);
        this.f6112t = new CircleImageView(getContext(), -328966);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.f6083A = circularProgressDrawable;
        circularProgressDrawable.m4166c(1);
        this.f6112t.setImageDrawable(this.f6083A);
        this.f6112t.setVisibility(8);
        addView(this.f6112t);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f6117y = i2;
        this.f6098f = i2;
        this.f6100h = new NestedScrollingParentHelper();
        this.f6101i = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.f6089G;
        this.f6106n = i3;
        this.f6116x = i3;
        m4175f(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6082L);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.f6112t.getBackground().setAlpha(i2);
        this.f6083A.setAlpha(i2);
    }

    /* renamed from: a */
    public boolean m4170a() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.f6090H;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.m4182a(this, this.f6094b);
        }
        View view = this.f6094b;
        return view instanceof ListView ? ListViewCompat.m2601a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* renamed from: b */
    public final void m4171b() {
        if (this.f6094b == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f6112t)) {
                    this.f6094b = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m4172c(float f2) {
        if (f2 > this.f6098f) {
            m4178j(true, true);
            return;
        }
        this.f6096d = false;
        CircularProgressDrawable circularProgressDrawable = this.f6083A;
        CircularProgressDrawable.Ring ring = circularProgressDrawable.f6051b;
        ring.f6065e = 0.0f;
        ring.f6066f = 0.0f;
        circularProgressDrawable.invalidateSelf();
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Objects.requireNonNull(SwipeRefreshLayout.this);
                SwipeRefreshLayout.this.m4181r(null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f6114v = this.f6106n;
        this.f6093K.reset();
        this.f6093K.setDuration(200L);
        this.f6093K.setInterpolator(this.f6111s);
        CircleImageView circleImageView = this.f6112t;
        circleImageView.f6044b = animationListener;
        circleImageView.clearAnimation();
        this.f6112t.startAnimation(this.f6093K);
        CircularProgressDrawable circularProgressDrawable2 = this.f6083A;
        CircularProgressDrawable.Ring ring2 = circularProgressDrawable2.f6051b;
        if (ring2.f6074n) {
            ring2.f6074n = false;
        }
        circularProgressDrawable2.invalidateSelf();
    }

    /* renamed from: d */
    public final boolean m4173d(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f6101i.m2135a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f6101i.m2136b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f6101i.m2137c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f6101i.m2139e(i2, i3, i4, i5, iArr);
    }

    /* renamed from: e */
    public final void m4174e(float f2) {
        CircularProgressDrawable circularProgressDrawable = this.f6083A;
        CircularProgressDrawable.Ring ring = circularProgressDrawable.f6051b;
        if (!ring.f6074n) {
            ring.f6074n = true;
        }
        circularProgressDrawable.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f2 / this.f6098f));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f6098f;
        int i2 = this.f6118z;
        if (i2 <= 0) {
            i2 = this.f6117y;
        }
        float f3 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.f6116x + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.f6112t.getVisibility() != 0) {
            this.f6112t.setVisibility(0);
        }
        this.f6112t.setScaleX(1.0f);
        this.f6112t.setScaleY(1.0f);
        if (f2 < this.f6098f) {
            if (this.f6083A.getAlpha() > 76 && !m4173d(this.f6086D)) {
                this.f6086D = m4179k(this.f6083A.getAlpha(), 76);
            }
        } else if (this.f6083A.getAlpha() < 255 && !m4173d(this.f6087E)) {
            this.f6087E = m4179k(this.f6083A.getAlpha(), KotlinVersion.MAX_COMPONENT_VALUE);
        }
        CircularProgressDrawable circularProgressDrawable2 = this.f6083A;
        float min2 = Math.min(0.8f, max * 0.8f);
        CircularProgressDrawable.Ring ring2 = circularProgressDrawable2.f6051b;
        ring2.f6065e = 0.0f;
        ring2.f6066f = min2;
        circularProgressDrawable2.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable3 = this.f6083A;
        float min3 = Math.min(1.0f, max);
        CircularProgressDrawable.Ring ring3 = circularProgressDrawable3.f6051b;
        if (min3 != ring3.f6076p) {
            ring3.f6076p = min3;
        }
        circularProgressDrawable3.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable4 = this.f6083A;
        circularProgressDrawable4.f6051b.f6067g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.f6106n);
    }

    /* renamed from: f */
    public void m4175f(float f2) {
        setTargetOffsetTopAndBottom((this.f6114v + ((int) ((this.f6116x - r0) * f2))) - this.f6112t.getTop());
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.f6113u;
        return i4 < 0 ? i3 : i3 == i2 + (-1) ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f6100h.m2146a();
    }

    public int getProgressCircleDiameter() {
        return this.f6089G;
    }

    public int getProgressViewEndOffset() {
        return this.f6117y;
    }

    public int getProgressViewStartOffset() {
        return this.f6116x;
    }

    /* renamed from: h */
    public final void m4176h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6110r) {
            this.f6110r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f6101i.m2142h(0);
    }

    /* renamed from: i */
    public void m4177i() {
        this.f6112t.clearAnimation();
        this.f6083A.stop();
        this.f6112t.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.f6116x - this.f6106n);
        this.f6106n = this.f6112t.getTop();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f6101i.f3630d;
    }

    /* renamed from: j */
    public final void m4178j(boolean z, boolean z2) {
        if (this.f6096d != z) {
            this.f6088F = z2;
            m4171b();
            this.f6096d = z;
            if (!z) {
                m4181r(this.f6091I);
                return;
            }
            int i2 = this.f6106n;
            Animation.AnimationListener animationListener = this.f6091I;
            this.f6114v = i2;
            this.f6092J.reset();
            this.f6092J.setDuration(200L);
            this.f6092J.setInterpolator(this.f6111s);
            if (animationListener != null) {
                this.f6112t.f6044b = animationListener;
            }
            this.f6112t.clearAnimation();
            this.f6112t.startAnimation(this.f6092J);
        }
    }

    /* renamed from: k */
    public final Animation m4179k(final int i2, final int i3) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.f6083A.setAlpha((int) (((i3 - r0) * f2) + i2));
            }
        };
        animation.setDuration(300L);
        CircleImageView circleImageView = this.f6112t;
        circleImageView.f6044b = null;
        circleImageView.clearAnimation();
        this.f6112t.startAnimation(animation);
        return animation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4177i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m4171b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m4170a() || this.f6096d || this.f6104l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f6110r;
                    if (i2 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m4180q(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m4176h(motionEvent);
                    }
                }
            }
            this.f6109q = false;
            this.f6110r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f6116x - this.f6112t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f6110r = pointerId;
            this.f6109q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f6108p = motionEvent.getY(findPointerIndex2);
        }
        return this.f6109q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f6094b == null) {
            m4171b();
        }
        View view = this.f6094b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f6112t.getMeasuredWidth();
        int measuredHeight2 = this.f6112t.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.f6106n;
        this.f6112t.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f6094b == null) {
            m4171b();
        }
        View view = this.f6094b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f6112t.measure(View.MeasureSpec.makeMeasureSpec(this.f6089G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6089G, 1073741824));
        this.f6113u = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f6112t) {
                this.f6113u = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f6099g;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.f6099g = 0.0f;
                } else {
                    this.f6099g = f2 - f3;
                    iArr[1] = i3;
                }
                m4174e(this.f6099g);
            }
        }
        int[] iArr2 = this.f6102j;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.f6103k);
        if (i5 + this.f6103k[1] >= 0 || m4170a()) {
            return;
        }
        float abs = this.f6099g + Math.abs(r11);
        this.f6099g = abs;
        m4174e(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f6100h.f3632a = i2;
        startNestedScroll(i2 & 2);
        this.f6099g = 0.0f;
        this.f6104l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.f6096d || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f6100h.m2147b(0);
        this.f6104l = false;
        float f2 = this.f6099g;
        if (f2 > 0.0f) {
            m4172c(f2);
            this.f6099g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m4170a() || this.f6096d || this.f6104l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f6110r = motionEvent.getPointerId(0);
            this.f6109q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f6110r);
                if (findPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f6109q) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f6107o) * 0.5f;
                    this.f6109q = false;
                    m4172c(y);
                }
                this.f6110r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f6110r);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m4180q(y2);
                if (this.f6109q) {
                    float f2 = (y2 - this.f6107o) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    m4174e(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f6110r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m4176h(motionEvent);
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m4180q(float f2) {
        float f3 = this.f6108p;
        float f4 = f2 - f3;
        int i2 = this.f6097e;
        if (f4 <= i2 || this.f6109q) {
            return;
        }
        this.f6107o = f3 + i2;
        this.f6109q = true;
        this.f6083A.setAlpha(76);
    }

    /* renamed from: r */
    public void m4181r(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.f6085C = animation;
        animation.setDuration(150L);
        CircleImageView circleImageView = this.f6112t;
        circleImageView.f6044b = animationListener;
        circleImageView.clearAnimation();
        this.f6112t.startAnimation(this.f6085C);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f6094b;
        if (view == null || ViewCompat.m2175O(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f2) {
        this.f6112t.setScaleX(f2);
        this.f6112t.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        m4171b();
        CircularProgressDrawable circularProgressDrawable = this.f6083A;
        CircularProgressDrawable.Ring ring = circularProgressDrawable.f6051b;
        ring.f6069i = iArr;
        ring.m4168a(0);
        circularProgressDrawable.f6051b.m4168a(0);
        circularProgressDrawable.invalidateSelf();
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.m1670c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f6098f = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m4177i();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f6101i.m2143i(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f6090H = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.f6095c = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i2) {
        this.f6112t.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i2) {
        setProgressBackgroundColorSchemeColor(ContextCompat.m1670c(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f6096d == z) {
            m4178j(z, false);
            return;
        }
        this.f6096d = z;
        setTargetOffsetTopAndBottom((this.f6117y + this.f6116x) - this.f6106n);
        this.f6088F = false;
        Animation.AnimationListener animationListener = this.f6091I;
        this.f6112t.setVisibility(0);
        this.f6083A.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f2);
            }
        };
        this.f6084B = animation;
        animation.setDuration(this.f6105m);
        if (animationListener != null) {
            this.f6112t.f6044b = animationListener;
        }
        this.f6112t.clearAnimation();
        this.f6112t.startAnimation(this.f6084B);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.f6089G = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f6089G = (int) (displayMetrics.density * 40.0f);
            }
            this.f6112t.setImageDrawable(null);
            this.f6083A.m4166c(i2);
            this.f6112t.setImageDrawable(this.f6083A);
        }
    }

    public void setSlingshotDistance(@Px int i2) {
        this.f6118z = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.f6112t.bringToFront();
        ViewCompat.m2179S(this.f6112t, i2);
        this.f6106n = this.f6112t.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f6101i.m2144j(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f6101i.m2145k(0);
    }
}

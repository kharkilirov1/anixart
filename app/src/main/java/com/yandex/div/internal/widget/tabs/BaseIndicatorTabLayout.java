package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.C2806R;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.math.MathKt;

/* loaded from: classes2.dex */
public class BaseIndicatorTabLayout extends HorizontalScrollView {

    /* renamed from: F */
    public static final TimeInterpolator f34185F = new FastOutSlowInInterpolator();

    /* renamed from: G */
    public static final Pools.Pool<Tab> f34186G = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    public ViewPager f34187A;

    /* renamed from: B */
    public PagerAdapter f34188B;

    /* renamed from: C */
    public DataSetObserver f34189C;

    /* renamed from: D */
    public TabLayoutOnPageChangeListener f34190D;

    /* renamed from: E */
    @NonNull
    public final Pools.Pool<TabView> f34191E;

    /* renamed from: b */
    public final ArrayList<Tab> f34192b;

    /* renamed from: c */
    public Tab f34193c;

    /* renamed from: d */
    public final OvalIndicators f34194d;

    /* renamed from: e */
    public int f34195e;

    /* renamed from: f */
    public int f34196f;

    /* renamed from: g */
    public int f34197g;

    /* renamed from: h */
    public int f34198h;

    /* renamed from: i */
    public long f34199i;

    /* renamed from: j */
    public int f34200j;

    /* renamed from: k */
    public DivTypefaceProvider f34201k;

    /* renamed from: l */
    public ColorStateList f34202l;

    /* renamed from: m */
    public boolean f34203m;

    /* renamed from: n */
    public int f34204n;

    /* renamed from: o */
    public final int f34205o;

    /* renamed from: p */
    public final int f34206p;

    /* renamed from: q */
    public final int f34207q;

    /* renamed from: r */
    public final boolean f34208r;

    /* renamed from: s */
    public final boolean f34209s;

    /* renamed from: t */
    public final int f34210t;

    /* renamed from: u */
    public final NestedHorizontalScrollCompanion f34211u;

    /* renamed from: v */
    public int f34212v;

    /* renamed from: w */
    public int f34213w;

    /* renamed from: x */
    public int f34214x;

    /* renamed from: y */
    public OnTabSelectedListener f34215y;

    /* renamed from: z */
    public ValueAnimator f34216z;

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$1 */
    public static /* synthetic */ class C29111 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34217a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f34217a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34217a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AnimationType {
        SLIDE,
        FADE,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener {
        /* renamed from: a */
        void mo17491a(Tab tab);

        /* renamed from: b */
        void mo17492b(Tab tab);

        /* renamed from: c */
        void mo17493c(Tab tab);
    }

    public static class OvalIndicators extends LinearLayout {

        /* renamed from: w */
        public static final /* synthetic */ int f34222w = 0;

        /* renamed from: b */
        public int f34223b;

        /* renamed from: c */
        public int f34224c;

        /* renamed from: d */
        public int f34225d;

        /* renamed from: e */
        public int f34226e;

        /* renamed from: f */
        public float f34227f;

        /* renamed from: g */
        public int f34228g;

        /* renamed from: h */
        public int[] f34229h;

        /* renamed from: i */
        public int[] f34230i;

        /* renamed from: j */
        public float[] f34231j;

        /* renamed from: k */
        public int f34232k;

        /* renamed from: l */
        public int f34233l;

        /* renamed from: m */
        public int f34234m;

        /* renamed from: n */
        public ValueAnimator f34235n;

        /* renamed from: o */
        public final Paint f34236o;

        /* renamed from: p */
        public final Path f34237p;

        /* renamed from: q */
        public final RectF f34238q;

        /* renamed from: r */
        public final int f34239r;

        /* renamed from: s */
        public final int f34240s;

        /* renamed from: t */
        public float f34241t;

        /* renamed from: u */
        public int f34242u;

        /* renamed from: v */
        public AnimationType f34243v;

        public OvalIndicators(Context context, int i2, int i3) {
            super(context);
            this.f34224c = -1;
            this.f34225d = -1;
            this.f34226e = -1;
            this.f34228g = 0;
            this.f34232k = -1;
            this.f34233l = -1;
            this.f34241t = 1.0f;
            this.f34242u = -1;
            this.f34243v = AnimationType.SLIDE;
            setId(C2507R.id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.f34234m = childCount;
            m17496c(childCount);
            Paint paint = new Paint();
            this.f34236o = paint;
            paint.setAntiAlias(true);
            this.f34238q = new RectF();
            this.f34239r = i2;
            this.f34240s = i3;
            this.f34237p = new Path();
            this.f34231j = new float[8];
        }

        /* renamed from: a */
        public void m17494a(int i2, long j2) {
            ValueAnimator valueAnimator = this.f34235n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f34235n.cancel();
                j2 = Math.round((1.0f - this.f34235n.getAnimatedFraction()) * this.f34235n.getDuration());
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                m17500g();
                return;
            }
            int ordinal = this.f34243v.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    m17499f(i2, 0.0f);
                    return;
                }
                if (i2 != this.f34226e) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(BaseIndicatorTabLayout.f34185F);
                    ofFloat.setDuration(j2);
                    ofFloat.addUpdateListener(new C2920e(this, 0));
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.2

                        /* renamed from: a */
                        public boolean f34246a = false;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            this.f34246a = true;
                            OvalIndicators.this.f34241t = 1.0f;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (this.f34246a) {
                                return;
                            }
                            OvalIndicators ovalIndicators = OvalIndicators.this;
                            ovalIndicators.f34226e = ovalIndicators.f34242u;
                            ovalIndicators.f34227f = 0.0f;
                        }
                    });
                    this.f34242u = i2;
                    this.f34235n = ofFloat;
                    ofFloat.start();
                    return;
                }
                return;
            }
            final int i3 = this.f34232k;
            final int i4 = this.f34233l;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (i3 == left && i4 == right) {
                return;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setInterpolator(BaseIndicatorTabLayout.f34185F);
            ofFloat2.setDuration(j2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BaseIndicatorTabLayout.OvalIndicators ovalIndicators = BaseIndicatorTabLayout.OvalIndicators.this;
                    int i5 = i3;
                    int i6 = left;
                    int i7 = i4;
                    int i8 = right;
                    int i9 = BaseIndicatorTabLayout.OvalIndicators.f34222w;
                    Objects.requireNonNull(ovalIndicators);
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    int round = Math.round((i6 - i5) * animatedFraction) + i5;
                    int round2 = Math.round(animatedFraction * (i8 - i7)) + i7;
                    if (round != ovalIndicators.f34232k || round2 != ovalIndicators.f34233l) {
                        ovalIndicators.f34232k = round;
                        ovalIndicators.f34233l = round2;
                        ViewCompat.m2183W(ovalIndicators);
                    }
                    ViewCompat.m2183W(ovalIndicators);
                }
            });
            ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.1

                /* renamed from: a */
                public boolean f34244a = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.f34244a = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.f34244a) {
                        return;
                    }
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.f34226e = ovalIndicators.f34242u;
                    ovalIndicators.f34227f = 0.0f;
                }
            });
            this.f34242u = i2;
            this.f34235n = ofFloat2;
            ofFloat2.start();
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i2 < 0) {
                i2 = childCount;
            }
            if (i2 != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = this.f34228g;
                super.addView(view, i2, marginLayoutParams);
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams2.leftMargin = this.f34228g;
                updateViewLayout(childAt, marginLayoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams3.leftMargin = 0;
            super.addView(view, i2, marginLayoutParams3);
        }

        /* renamed from: b */
        public final void m17495b(Canvas canvas, int i2, int i3, float f2, int i4, float f3) {
            if (i2 < 0 || i3 <= i2) {
                return;
            }
            this.f34238q.set(i2, this.f34239r, i3, f2 - this.f34240s);
            float width = this.f34238q.width();
            float height = this.f34238q.height();
            float[] fArr = new float[8];
            for (int i5 = 0; i5 < 8; i5++) {
                float f4 = this.f34231j[i5];
                float f5 = 0.0f;
                if (height > 0.0f && width > 0.0f) {
                    f5 = Math.min(height, width) / 2.0f;
                    if (f4 != -1.0f) {
                        f5 = Math.min(f4, f5);
                    }
                }
                fArr[i5] = f5;
            }
            this.f34237p.reset();
            this.f34237p.addRoundRect(this.f34238q, fArr, Path.Direction.CW);
            this.f34237p.close();
            this.f34236o.setColor(i4);
            this.f34236o.setAlpha(Math.round(this.f34236o.getAlpha() * f3));
            canvas.drawPath(this.f34237p, this.f34236o);
        }

        /* renamed from: c */
        public final void m17496c(int i2) {
            this.f34234m = i2;
            this.f34229h = new int[i2];
            this.f34230i = new int[i2];
            for (int i3 = 0; i3 < this.f34234m; i3++) {
                this.f34229h[i3] = -1;
                this.f34230i[i3] = -1;
            }
        }

        /* renamed from: d */
        public void m17497d(@ColorInt int i2) {
            if (this.f34225d != i2) {
                if ((i2 >> 24) == 0) {
                    this.f34225d = -1;
                } else {
                    this.f34225d = i2;
                }
                ViewCompat.m2183W(this);
            }
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float height = getHeight();
            if (this.f34225d != -1) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    m17495b(canvas, this.f34229h[i2], this.f34230i[i2], height, this.f34225d, 1.0f);
                }
            }
            if (this.f34224c != -1) {
                int ordinal = this.f34243v.ordinal();
                if (ordinal == 0) {
                    m17495b(canvas, this.f34232k, this.f34233l, height, this.f34224c, 1.0f);
                } else if (ordinal != 1) {
                    int[] iArr = this.f34229h;
                    int i3 = this.f34226e;
                    m17495b(canvas, iArr[i3], this.f34230i[i3], height, this.f34224c, 1.0f);
                } else {
                    int[] iArr2 = this.f34229h;
                    int i4 = this.f34226e;
                    m17495b(canvas, iArr2[i4], this.f34230i[i4], height, this.f34224c, this.f34241t);
                    int i5 = this.f34242u;
                    if (i5 != -1) {
                        m17495b(canvas, this.f34229h[i5], this.f34230i[i5], height, this.f34224c, 1.0f - this.f34241t);
                    }
                }
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public void m17498e(@ColorInt int i2) {
            if (this.f34224c != i2) {
                if ((i2 >> 24) == 0) {
                    this.f34224c = -1;
                } else {
                    this.f34224c = i2;
                }
                ViewCompat.m2183W(this);
            }
        }

        /* renamed from: f */
        public void m17499f(int i2, float f2) {
            ValueAnimator valueAnimator = this.f34235n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f34235n.cancel();
            }
            this.f34226e = i2;
            this.f34227f = f2;
            m17500g();
            float f3 = 1.0f - this.f34227f;
            if (f3 != this.f34241t) {
                this.f34241t = f3;
                int i3 = this.f34226e + 1;
                if (i3 >= this.f34234m) {
                    i3 = -1;
                }
                this.f34242u = i3;
                ViewCompat.m2183W(this);
            }
        }

        /* renamed from: g */
        public void m17500g() {
            int i2;
            int i3;
            int i4;
            int childCount = getChildCount();
            if (childCount != this.f34234m) {
                m17496c(childCount);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                int i6 = -1;
                if (childAt == null || childAt.getWidth() <= 0) {
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                } else {
                    i6 = childAt.getLeft();
                    i2 = childAt.getRight();
                    if (this.f34243v != AnimationType.SLIDE || i5 != this.f34226e || this.f34227f <= 0.0f || i5 >= childCount - 1) {
                        i3 = i2;
                        i4 = i6;
                    } else {
                        View childAt2 = getChildAt(i5 + 1);
                        float left = this.f34227f * childAt2.getLeft();
                        float f2 = this.f34227f;
                        i4 = (int) (((1.0f - f2) * i6) + left);
                        i3 = (int) (((1.0f - this.f34227f) * i2) + (f2 * childAt2.getRight()));
                    }
                }
                int[] iArr = this.f34229h;
                int i7 = iArr[i5];
                int[] iArr2 = this.f34230i;
                int i8 = iArr2[i5];
                if (i6 != i7 || i2 != i8) {
                    iArr[i5] = i6;
                    iArr2[i5] = i2;
                    ViewCompat.m2183W(this);
                }
                if (i5 == this.f34226e && (i4 != this.f34232k || i3 != this.f34233l)) {
                    this.f34232k = i4;
                    this.f34233l = i3;
                    ViewCompat.m2183W(this);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            m17500g();
            ValueAnimator valueAnimator = this.f34235n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f34235n.cancel();
            m17494a(this.f34242u, Math.round((1.0f - this.f34235n.getAnimatedFraction()) * this.f34235n.getDuration()));
        }
    }

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver(C29111 c29111) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = BaseIndicatorTabLayout.this;
            TimeInterpolator timeInterpolator = BaseIndicatorTabLayout.f34185F;
            baseIndicatorTabLayout.m17486p();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = BaseIndicatorTabLayout.this;
            TimeInterpolator timeInterpolator = BaseIndicatorTabLayout.f34185F;
            baseIndicatorTabLayout.m17486p();
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public final WeakReference<BaseIndicatorTabLayout> f34253a;

        /* renamed from: b */
        public int f34254b;

        /* renamed from: c */
        public int f34255c;

        public TabLayoutOnPageChangeListener(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.f34253a = new WeakReference<>(baseIndicatorTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: b */
        public void mo4343b(int i2) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f34253a.get();
            if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i2) {
                return;
            }
            int i3 = this.f34255c;
            baseIndicatorTabLayout.m17488r(baseIndicatorTabLayout.f34192b.get(i2), i3 == 0 || (i3 == 2 && this.f34254b == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f34253a.get();
            if (baseIndicatorTabLayout != null) {
                if (this.f34255c != 2 || this.f34254b == 1) {
                    TimeInterpolator timeInterpolator = BaseIndicatorTabLayout.f34185F;
                    baseIndicatorTabLayout.m17490t(i2, f2, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
            this.f34254b = this.f34255c;
            this.f34255c = i2;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a */
        public final ViewPager f34256a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f34256a = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        /* renamed from: a */
        public void mo17491a(Tab tab) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        /* renamed from: b */
        public void mo17492b(Tab tab) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo17493c(Tab tab) {
            this.f34256a.setCurrentItem(tab.f34250b);
        }
    }

    @SuppressLint
    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f34192b = new ArrayList<>();
        this.f34199i = 300L;
        this.f34201k = DivTypefaceProvider.f31272b;
        this.f34204n = Integer.MAX_VALUE;
        this.f34211u = new NestedHorizontalScrollCompanion(this);
        this.f34191E = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2806R.styleable.f30864e, i2, 2132018071);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2806R.styleable.f30861b, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.f34203m = obtainStyledAttributes2.getBoolean(6, false);
        this.f34213w = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f34208r = obtainStyledAttributes2.getBoolean(1, true);
        this.f34209s = obtainStyledAttributes2.getBoolean(5, false);
        this.f34210t = obtainStyledAttributes2.getDimensionPixelSize(4, 0);
        obtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2);
        this.f34194d = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (ovalIndicators.f34223b != dimensionPixelSize3) {
            ovalIndicators.f34223b = dimensionPixelSize3;
            ViewCompat.m2183W(ovalIndicators);
        }
        ovalIndicators.m17498e(obtainStyledAttributes.getColor(8, 0));
        ovalIndicators.m17497d(obtainStyledAttributes.getColor(0, 0));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f34198h = dimensionPixelSize4;
        this.f34197g = dimensionPixelSize4;
        this.f34196f = dimensionPixelSize4;
        this.f34195e = dimensionPixelSize4;
        this.f34195e = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize4);
        this.f34196f = obtainStyledAttributes.getDimensionPixelSize(20, this.f34196f);
        this.f34197g = obtainStyledAttributes.getDimensionPixelSize(18, this.f34197g);
        this.f34198h = obtainStyledAttributes.getDimensionPixelSize(17, this.f34198h);
        int resourceId = obtainStyledAttributes.getResourceId(23, 2132017722);
        this.f34200j = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, C2806R.styleable.f30865f);
        try {
            this.f34202l = obtainStyledAttributes3.getColorStateList(3);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(24)) {
                this.f34202l = obtainStyledAttributes.getColorStateList(24);
            }
            if (obtainStyledAttributes.hasValue(22)) {
                this.f34202l = m17477l(this.f34202l.getDefaultColor(), obtainStyledAttributes.getColor(22, 0));
            }
            this.f34205o = obtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.f34206p = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f34212v = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f34214x = obtainStyledAttributes.getInt(15, 1);
            obtainStyledAttributes.recycle();
            this.f34207q = getResources().getDimensionPixelSize(C2507R.dimen.tab_scrollable_min_width);
            m17481j();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.f34204n;
    }

    private int getTabMinWidth() {
        int i2 = this.f34205o;
        if (i2 != -1) {
            return i2;
        }
        if (this.f34214x == 0) {
            return this.f34207q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f34194d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: l */
    public static ColorStateList m17477l(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f34194d.getChildCount();
        if (i2 >= childCount || this.f34194d.getChildAt(i2).isSelected()) {
            return;
        }
        int i3 = 0;
        while (i3 < childCount) {
            this.f34194d.getChildAt(i3).setSelected(i3 == i2);
            i3++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m17479h(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f34211u.m17393b(motionEvent);
        return dispatchTouchEvent;
    }

    /* renamed from: g */
    public void m17478g(@NonNull Tab tab, boolean z) {
        if (tab.f34251c != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        TabView tabView = tab.f34252d;
        OvalIndicators ovalIndicators = this.f34194d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        ovalIndicators.addView(tabView, layoutParams);
        if (z) {
            tabView.setSelected(true);
        }
        int size = this.f34192b.size();
        tab.f34250b = size;
        this.f34192b.add(size, tab);
        int size2 = this.f34192b.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f34192b.get(size).f34250b = size;
            }
        }
        if (z) {
            tab.m17501a();
        }
    }

    @NonNull
    public TabLayoutOnPageChangeListener getPageChangeListener() {
        if (this.f34190D == null) {
            this.f34190D = new TabLayoutOnPageChangeListener(this);
        }
        return this.f34190D;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f34193c;
        if (tab != null) {
            return tab.f34250b;
        }
        return -1;
    }

    @ColorInt
    public int getSelectedTabTextColor() {
        return this.f34202l.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public int getTabCount() {
        return this.f34192b.size();
    }

    public int getTabMode() {
        return this.f34214x;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f34202l;
    }

    /* renamed from: h */
    public final void m17479h(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        Tab m17485o = m17485o();
        Objects.requireNonNull((TabItem) view);
        m17478g(m17485o, this.f34192b.isEmpty());
    }

    /* renamed from: i */
    public final void m17480i(int i2) {
        boolean z;
        if (i2 == -1) {
            return;
        }
        int i3 = 1;
        if (getWindowToken() != null && ViewsKt.m16768b(this)) {
            OvalIndicators ovalIndicators = this.f34194d;
            int childCount = ovalIndicators.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (ovalIndicators.getChildAt(i4).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int m17482k = m17482k(i2, 0.0f);
                if (scrollX != m17482k) {
                    if (this.f34216z == null) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                        this.f34216z = ofInt;
                        ofInt.setInterpolator(f34185F);
                        this.f34216z.setDuration(this.f34199i);
                        this.f34216z.addUpdateListener(new C2920e(this, i3));
                    }
                    this.f34216z.setIntValues(scrollX, m17482k);
                    this.f34216z.start();
                }
                this.f34194d.m17494a(i2, this.f34199i);
                return;
            }
        }
        m17490t(i2, 0.0f, true, true);
    }

    /* renamed from: j */
    public final void m17481j() {
        int i2;
        int i3;
        if (this.f34214x == 0) {
            i2 = Math.max(0, this.f34212v - this.f34195e);
            i3 = Math.max(0, this.f34213w - this.f34197g);
        } else {
            i2 = 0;
            i3 = 0;
        }
        ViewCompat.m2226t0(this.f34194d, i2, 0, i3, 0);
        if (this.f34214x != 1) {
            this.f34194d.setGravity(8388611);
        } else {
            this.f34194d.setGravity(1);
        }
        for (int i4 = 0; i4 < this.f34194d.getChildCount(); i4++) {
            View childAt = this.f34194d.getChildAt(i4);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            childAt.requestLayout();
        }
    }

    /* renamed from: k */
    public final int m17482k(int i2, float f2) {
        View childAt;
        if (this.f34214x != 0 || (childAt = this.f34194d.getChildAt(i2)) == null) {
            return 0;
        }
        int width = childAt.getWidth();
        if (this.f34209s) {
            return childAt.getLeft() - this.f34210t;
        }
        int i3 = i2 + 1;
        return ((childAt.getWidth() / 2) + (childAt.getLeft() + ((int) (((width + ((i3 < this.f34194d.getChildCount() ? this.f34194d.getChildAt(i3) : null) != null ? r5.getWidth() : 0)) * f2) * 0.5f)))) - (getWidth() / 2);
    }

    /* renamed from: m */
    public TabView mo17483m(@NonNull Context context) {
        return new TabView(context);
    }

    @Nullable
    /* renamed from: n */
    public Tab m17484n(int i2) {
        return this.f34192b.get(i2);
    }

    @NonNull
    /* renamed from: o */
    public Tab m17485o() {
        Tab tab = (Tab) ((Pools.SynchronizedPool) f34186G).mo2027b();
        if (tab == null) {
            tab = new Tab(null);
        }
        tab.f34251c = this;
        TabView mo2027b = this.f34191E.mo2027b();
        if (mo2027b == null) {
            mo2027b = mo17483m(getContext());
            int i2 = this.f34195e;
            int i3 = this.f34196f;
            int i4 = this.f34197g;
            int i5 = this.f34198h;
            Objects.requireNonNull(mo2027b);
            ViewCompat.m2226t0(mo2027b, i2, i3, i4, i5);
            DivTypefaceProvider divTypefaceProvider = this.f34201k;
            int i6 = this.f34200j;
            mo2027b.f34282h = divTypefaceProvider;
            mo2027b.f34283i = i6;
            if (!mo2027b.isSelected()) {
                mo2027b.setTextAppearance(mo2027b.getContext(), mo2027b.f34283i);
            }
            mo2027b.setTextColorList(this.f34202l);
            mo2027b.setBoldTextOnSelection(this.f34203m);
            mo2027b.setEllipsizeEnabled(this.f34208r);
            mo2027b.setMaxWidthProvider(new C2919d(this));
            mo2027b.setOnUpdateListener(new C2919d(this));
        }
        mo2027b.setTab(tab);
        mo2027b.setFocusable(true);
        mo2027b.setMinimumWidth(getTabMinWidth());
        tab.f34252d = mo2027b;
        return tab;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint
    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = SizeKt.f33901a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + MathKt.m32223c(44 * displayMetrics.density);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.f34206p;
            if (i4 <= 0) {
                i4 = size - MathKt.m32223c(56 * displayMetrics.density);
            }
            this.f34204n = i4;
        }
        super.onMeasure(i2, i3);
        boolean z = true;
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f34214x == 1 ? childAt.getMeasuredWidth() == getMeasuredWidth() : childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                z = false;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.onOverScrolled(i2, i3, z, z2);
        this.f34211u.m17392a(z);
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f34211u.f33890b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        Tab tab;
        int i6;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i4 == 0 || i4 == i2 || (tab = this.f34193c) == null || (i6 = tab.f34250b) == -1) {
            return;
        }
        m17490t(i6, 0.0f, true, true);
    }

    /* renamed from: p */
    public final void m17486p() {
        int currentItem;
        m17487q();
        PagerAdapter pagerAdapter = this.f34188B;
        if (pagerAdapter == null) {
            m17487q();
            return;
        }
        int mo4336c = pagerAdapter.mo4336c();
        for (int i2 = 0; i2 < mo4336c; i2++) {
            Tab m17485o = m17485o();
            m17485o.m17502b(this.f34188B.mo4338e(i2));
            m17478g(m17485o, false);
        }
        ViewPager viewPager = this.f34187A;
        if (viewPager == null || mo4336c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        m17488r(m17484n(currentItem), true);
    }

    /* renamed from: q */
    public void m17487q() {
        int childCount = this.f34194d.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) this.f34194d.getChildAt(childCount);
            this.f34194d.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f34191E.mo2026a(tabView);
            }
            requestLayout();
        }
        Iterator<Tab> it = this.f34192b.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.f34251c = null;
            next.f34252d = null;
            next.f34249a = null;
            next.f34250b = -1;
            ((Pools.SynchronizedPool) f34186G).mo2026a(next);
        }
        this.f34193c = null;
    }

    /* renamed from: r */
    public void m17488r(Tab tab, boolean z) {
        OnTabSelectedListener onTabSelectedListener;
        OnTabSelectedListener onTabSelectedListener2;
        Tab tab2 = this.f34193c;
        if (tab2 == tab) {
            if (tab2 != null) {
                OnTabSelectedListener onTabSelectedListener3 = this.f34215y;
                if (onTabSelectedListener3 != null) {
                    onTabSelectedListener3.mo17491a(tab2);
                }
                m17480i(tab.f34250b);
                return;
            }
            return;
        }
        if (z) {
            int i2 = tab != null ? tab.f34250b : -1;
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
            Tab tab3 = this.f34193c;
            if ((tab3 == null || tab3.f34250b == -1) && i2 != -1) {
                m17490t(i2, 0.0f, true, true);
            } else {
                m17480i(i2);
            }
        }
        Tab tab4 = this.f34193c;
        if (tab4 != null && (onTabSelectedListener2 = this.f34215y) != null) {
            onTabSelectedListener2.mo17492b(tab4);
        }
        this.f34193c = tab;
        if (tab == null || (onTabSelectedListener = this.f34215y) == null) {
            return;
        }
        onTabSelectedListener.mo17493c(tab);
    }

    /* renamed from: s */
    public final void m17489s(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f34188B;
        if (pagerAdapter2 != null && (dataSetObserver = this.f34189C) != null) {
            pagerAdapter2.f6504a.unregisterObserver(dataSetObserver);
        }
        this.f34188B = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f34189C == null) {
                this.f34189C = new PagerAdapterObserver(null);
            }
            pagerAdapter.f6504a.registerObserver(this.f34189C);
        }
        m17486p();
    }

    public void setAnimationDuration(long j2) {
        this.f34199i = j2;
    }

    public void setAnimationType(AnimationType animationType) {
        OvalIndicators ovalIndicators = this.f34194d;
        if (ovalIndicators.f34243v != animationType) {
            ovalIndicators.f34243v = animationType;
            ValueAnimator valueAnimator = ovalIndicators.f34235n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            ovalIndicators.f34235n.cancel();
        }
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.f34215y = onTabSelectedListener;
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i2) {
        this.f34194d.m17498e(i2);
    }

    public void setTabBackgroundColor(@ColorInt int i2) {
        this.f34194d.m17497d(i2);
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        OvalIndicators ovalIndicators = this.f34194d;
        if (Arrays.equals(ovalIndicators.f34231j, fArr)) {
            return;
        }
        ovalIndicators.f34231j = fArr;
        ViewCompat.m2183W(ovalIndicators);
    }

    public void setTabIndicatorHeight(int i2) {
        OvalIndicators ovalIndicators = this.f34194d;
        if (ovalIndicators.f34223b != i2) {
            ovalIndicators.f34223b = i2;
            ViewCompat.m2183W(ovalIndicators);
        }
    }

    public void setTabItemSpacing(int i2) {
        OvalIndicators ovalIndicators = this.f34194d;
        if (i2 != ovalIndicators.f34228g) {
            ovalIndicators.f34228g = i2;
            int childCount = ovalIndicators.getChildCount();
            for (int i3 = 1; i3 < childCount; i3++) {
                View childAt = ovalIndicators.getChildAt(i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams.leftMargin = ovalIndicators.f34228g;
                ovalIndicators.updateViewLayout(childAt, marginLayoutParams);
            }
        }
    }

    public void setTabMode(int i2) {
        if (i2 != this.f34214x) {
            this.f34214x = i2;
            m17481j();
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f34202l != colorStateList) {
            this.f34202l = colorStateList;
            int size = this.f34192b.size();
            for (int i2 = 0; i2 < size; i2++) {
                TabView tabView = this.f34192b.get(i2).f34252d;
                if (tabView != null) {
                    tabView.setTextColorList(this.f34202l);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        for (int i2 = 0; i2 < this.f34192b.size(); i2++) {
            this.f34192b.get(i2).f34252d.setEnabled(z);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        List<ViewPager.OnPageChangeListener> list;
        ViewPager viewPager2 = this.f34187A;
        if (viewPager2 != null && (tabLayoutOnPageChangeListener = this.f34190D) != null && (list = viewPager2.f6542S) != null) {
            list.remove(tabLayoutOnPageChangeListener);
        }
        if (viewPager == null) {
            this.f34187A = null;
            setOnTabSelectedListener(null);
            m17489s(null, true);
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f34187A = viewPager;
        if (this.f34190D == null) {
            this.f34190D = new TabLayoutOnPageChangeListener(this);
        }
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.f34190D;
        tabLayoutOnPageChangeListener2.f34255c = 0;
        tabLayoutOnPageChangeListener2.f34254b = 0;
        viewPager.m4348b(tabLayoutOnPageChangeListener2);
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewPager));
        m17489s(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: t */
    public final void m17490t(int i2, float f2, boolean z, boolean z2) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.f34194d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f34194d.m17499f(i2, f2);
        }
        ValueAnimator valueAnimator = this.f34216z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f34216z.cancel();
        }
        scrollTo(m17482k(i2, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public static final class Tab {

        /* renamed from: a */
        @Nullable
        public CharSequence f34249a;

        /* renamed from: b */
        public int f34250b = -1;

        /* renamed from: c */
        public BaseIndicatorTabLayout f34251c;

        /* renamed from: d */
        public TabView f34252d;

        public Tab() {
        }

        /* renamed from: a */
        public void m17501a() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f34251c;
            if (baseIndicatorTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            baseIndicatorTabLayout.m17488r(this, true);
        }

        @NonNull
        /* renamed from: b */
        public Tab m17502b(@Nullable CharSequence charSequence) {
            this.f34249a = charSequence;
            TabView tabView = this.f34252d;
            if (tabView != null) {
                Tab tab = tabView.f34288n;
                tabView.setText(tab == null ? null : tab.f34249a);
                TabView.OnUpdateListener onUpdateListener = tabView.f34287m;
                if (onUpdateListener != null) {
                    onUpdateListener.mo17513a(tabView);
                }
            }
            return this;
        }

        public Tab(C29111 c29111) {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        m17479h(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m17479h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        m17479h(view);
    }
}

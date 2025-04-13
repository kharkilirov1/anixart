package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1195R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: b */
    public int f17364b;

    /* renamed from: c */
    public int f17365c;

    /* renamed from: d */
    public int f17366d;

    /* renamed from: e */
    public int f17367e;

    /* renamed from: f */
    public boolean f17368f;

    /* renamed from: g */
    public int f17369g;

    /* renamed from: h */
    @Nullable
    public WindowInsetsCompat f17370h;

    /* renamed from: i */
    public List<BaseOnOffsetChangedListener> f17371i;

    /* renamed from: j */
    public boolean f17372j;

    /* renamed from: k */
    public boolean f17373k;

    /* renamed from: l */
    public boolean f17374l;

    /* renamed from: m */
    public boolean f17375m;

    /* renamed from: n */
    @IdRes
    public int f17376n;

    /* renamed from: o */
    @Nullable
    public WeakReference<View> f17377o;

    /* renamed from: p */
    @Nullable
    public ValueAnimator f17378p;

    /* renamed from: q */
    public final List<LiftOnScrollListener> f17379q;

    /* renamed from: r */
    public int[] f17380r;

    /* renamed from: s */
    @Nullable
    public Drawable f17381s;

    /* renamed from: t */
    public Behavior f17382t;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: j */
        public int f17386j;

        /* renamed from: k */
        public int f17387k;

        /* renamed from: l */
        public ValueAnimator f17388l;

        /* renamed from: m */
        public SavedState f17389m;

        /* renamed from: n */
        @Nullable
        public WeakReference<View> f17390n;

        /* renamed from: o */
        public boolean f17391o;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
        }

        public BaseBehavior() {
        }

        /* renamed from: E */
        public static boolean m9760E(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: C */
        public int mo9761C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2, int i3, int i4) {
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int mo9772y = mo9772y();
            int i7 = 0;
            if (i3 == 0 || mo9772y < i3 || mo9772y > i4) {
                this.f17386j = 0;
            } else {
                int m1934b = MathUtils.m1934b(i2, i3, i4);
                if (mo9772y != m1934b) {
                    if (appBarLayout.f17368f) {
                        int abs = Math.abs(m1934b);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f17412c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = layoutParams.f17410a;
                                if ((i9 & 1) != 0) {
                                    i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0;
                                    if ((i9 & 2) != 0) {
                                        i6 -= ViewCompat.m2233x(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                if (ViewCompat.m2225t(childAt)) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f2 = i6;
                                    i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(m1934b);
                                }
                            }
                        }
                    }
                    i5 = m1934b;
                    boolean m9796u = m9796u(i5);
                    int i10 = mo9772y - m1934b;
                    this.f17386j = m1934b - i5;
                    if (m9796u) {
                        while (i7 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i7).getLayoutParams();
                            ChildScrollEffect childScrollEffect = layoutParams2.f17411b;
                            if (childScrollEffect != null && (layoutParams2.f17410a & 1) != 0) {
                                childScrollEffect.mo9775a(appBarLayout, appBarLayout.getChildAt(i7), m9795s());
                            }
                            i7++;
                        }
                    }
                    if (!m9796u && appBarLayout.f17368f) {
                        coordinatorLayout.m1476e(appBarLayout);
                    }
                    appBarLayout.m9754d(m9795s());
                    m9768K(coordinatorLayout, appBarLayout, m1934b, m1934b < mo9772y ? -1 : 1, false);
                    i7 = i10;
                }
            }
            m9767J(coordinatorLayout, appBarLayout);
            return i7;
        }

        /* renamed from: D */
        public final void m9762D(final CoordinatorLayout coordinatorLayout, @NonNull final T t, int i2, float f2) {
            int abs = Math.abs(mo9772y() - i2);
            float abs2 = Math.abs(f2);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            int mo9772y = mo9772y();
            if (mo9772y == i2) {
                ValueAnimator valueAnimator = this.f17388l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f17388l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f17388l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f17388l = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.f17346e);
                this.f17388l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator4) {
                        BaseBehavior.this.m9791B(coordinatorLayout, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f17388l.setDuration(Math.min(round, 600));
            this.f17388l.setIntValues(mo9772y, i2);
            this.f17388l.start();
        }

        @Nullable
        /* renamed from: F */
        public final View m9763F(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: G */
        public void m9764G(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            int i3;
            int i4;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i3 = i5;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i3 != i4) {
                    iArr[1] = m9790A(coordinatorLayout, appBarLayout, i2, i3, i4);
                }
            }
            if (appBarLayout.f17375m) {
                appBarLayout.m9756f(appBarLayout.m9757g(view));
            }
        }

        @Nullable
        /* renamed from: H */
        public SavedState m9765H(@Nullable Parcelable parcelable, @NonNull T t) {
            int m9795s = m9795s();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + m9795s;
                if (childAt.getTop() + m9795s <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f3874c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = m9795s == 0;
                    savedState.f17404e = z;
                    savedState.f17403d = !z && (-m9795s) >= t.getTotalScrollRange();
                    savedState.f17405f = i2;
                    savedState.f17407h = bottom == t.getTopInset() + ViewCompat.m2233x(childAt);
                    savedState.f17406g = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* renamed from: I */
        public final void m9766I(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int mo9772y = mo9772y() - paddingTop;
            int childCount = t.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m9760E(layoutParams.f17410a, 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -mo9772y;
                if (top <= i3 && bottom >= i3) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i4 = layoutParams2.f17410a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == 0 && ViewCompat.m2225t(t) && ViewCompat.m2225t(childAt2)) {
                        i5 -= t.getTopInset();
                    }
                    if (m9760E(i4, 2)) {
                        i6 += ViewCompat.m2233x(childAt2);
                    } else if (m9760E(i4, 5)) {
                        int m2233x = ViewCompat.m2233x(childAt2) + i6;
                        if (mo9772y < m2233x) {
                            i5 = m2233x;
                        } else {
                            i6 = m2233x;
                        }
                    }
                    if (m9760E(i4, 32)) {
                        i5 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (mo9772y < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    m9762D(coordinatorLayout, t, MathUtils.m1934b(i5 + paddingTop, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: J */
        public final void m9767J(final CoordinatorLayout coordinatorLayout, @NonNull final T t) {
            final View view;
            final boolean z;
            boolean z2;
            ViewCompat.m2188a0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3749h.m2516a(), coordinatorLayout);
            final boolean z3 = false;
            ViewCompat.m2177Q(coordinatorLayout, 0);
            ViewCompat.m2188a0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i.m2516a(), coordinatorLayout);
            ViewCompat.m2177Q(coordinatorLayout, 0);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i2);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).f3070a instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i2++;
            }
            if (view == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (((LayoutParams) t.getChildAt(i3).getLayoutParams()).f17410a != 0) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z2) {
                if (!(ViewCompat.m2207k(coordinatorLayout) != null)) {
                    ViewCompat.m2196e0(coordinatorLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                        {
                            View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
                        }

                        @Override // androidx.core.view.AccessibilityDelegateCompat
                        /* renamed from: d */
                        public void mo2044d(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            this.f3570a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f3743a);
                            accessibilityNodeInfoCompat.f3743a.setScrollable(BaseBehavior.this.f17391o);
                            accessibilityNodeInfoCompat.f3743a.setClassName(ScrollView.class.getName());
                        }
                    });
                }
                if (mo9772y() != (-t.getTotalScrollRange())) {
                    ViewCompat.m2190b0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3749h, null, new AccessibilityViewCommand(this) { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.4
                        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                        /* renamed from: d */
                        public boolean mo2531d(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                            t.setExpanded(z3);
                            return true;
                        }
                    });
                    z3 = true;
                }
                if (mo9772y() != 0) {
                    if (view.canScrollVertically(-1)) {
                        final int i4 = -t.getDownNestedPreScrollRange();
                        if (i4 != 0) {
                            ViewCompat.m2190b0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i, null, new AccessibilityViewCommand() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.3
                                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                                /* renamed from: d */
                                public boolean mo2531d(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                                    BaseBehavior.this.m9764G(coordinatorLayout, t, view, i4, new int[]{0, 0});
                                    return true;
                                }
                            });
                        }
                    } else {
                        ViewCompat.m2190b0(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i, null, new AccessibilityViewCommand(this) { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.4
                            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                            /* renamed from: d */
                            public boolean mo2531d(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                                t.setExpanded(z);
                                return true;
                            }
                        });
                    }
                    this.f17391o = z;
                }
                z = z3;
                this.f17391o = z;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m9768K(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.f17410a
                r3 = r1 & 1
                if (r3 == 0) goto L5b
                int r3 = androidx.core.view.ViewCompat.m2233x(r4)
                if (r10 <= 0) goto L48
                r10 = r1 & 12
                if (r10 == 0) goto L48
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5b
                goto L59
            L48:
                r10 = r1 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5b
            L59:
                r9 = 1
                goto L5c
            L5b:
                r9 = 0
            L5c:
                boolean r10 = r8.f17375m
                if (r10 == 0) goto L68
                android.view.View r9 = r6.m9763F(r7)
                boolean r9 = r8.m9757g(r9)
            L68:
                boolean r9 = r8.m9756f(r9)
                if (r11 != 0) goto L9a
                if (r9 == 0) goto L9d
                java.util.List r7 = r7.m1479i(r8)
                int r9 = r7.size()
                r10 = 0
            L79:
                if (r10 >= r9) goto L98
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.f3070a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L95
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f17453f
                if (r7 == 0) goto L98
                r2 = 1
                goto L98
            L95:
                int r10 = r10 + 1
                goto L79
            L98:
                if (r2 == 0) goto L9d
            L9a:
                r8.jumpDrawablesToCurrentState()
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m9768K(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h */
        public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo1499h(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f17389m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m9762D(coordinatorLayout, appBarLayout, i3, 0.0f);
                        } else {
                            m9791B(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m9762D(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            m9791B(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f17403d) {
                m9791B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f17404e) {
                m9791B(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f17405f);
                int i4 = -childAt.getBottom();
                m9791B(coordinatorLayout, appBarLayout, this.f17389m.f17407h ? appBarLayout.getTopInset() + ViewCompat.m2233x(childAt) + i4 : Math.round(childAt.getHeight() * this.f17389m.f17406g) + i4);
            }
            appBarLayout.f17369g = 0;
            this.f17389m = null;
            m9796u(MathUtils.m1934b(m9795s(), -appBarLayout.getTotalScrollRange(), 0));
            m9768K(coordinatorLayout, appBarLayout, m9795s(), 0, true);
            appBarLayout.m9754d(m9795s());
            m9767J(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: i */
        public boolean mo1500i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m1487v(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k */
        public /* bridge */ /* synthetic */ void mo1502k(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i2, int i3, int[] iArr, int i4) {
            m9764G(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l */
        public void mo1503l(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i5 < 0) {
                iArr[1] = m9790A(coordinatorLayout, appBarLayout, i5, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                m9767J(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: n */
        public void mo1505n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f17389m = (SavedState) parcelable;
            } else {
                this.f17389m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: o */
        public Parcelable mo1506o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState m9765H = m9765H(absSavedState, (AppBarLayout) view);
            return m9765H == null ? absSavedState : m9765H;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L18;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1507p(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f17375m
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = 0
            L2d:
                if (r6 == 0) goto L36
                android.animation.ValueAnimator r2 = r1.f17388l
                if (r2 == 0) goto L36
                r2.cancel()
            L36:
                r2 = 0
                r1.f17390n = r2
                r1.f17387k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1507p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: q */
        public void mo1508q(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f17387k == 0 || i2 == 1) {
                m9766I(coordinatorLayout, appBarLayout);
                if (appBarLayout.f17375m) {
                    appBarLayout.m9756f(appBarLayout.m9757g(view2));
                }
            }
            this.f17390n = new WeakReference<>(view2);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: v */
        public boolean mo9769v(View view) {
            WeakReference<View> weakReference = this.f17390n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: w */
        public int mo9770w(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: x */
        public int mo9771x(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: y */
        public int mo9772y() {
            return m9795s() + this.f17386j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: z */
        public void mo9773z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m9766I(coordinatorLayout, appBarLayout);
            if (appBarLayout.f17375m) {
                appBarLayout.m9756f(appBarLayout.m9757g(m9763F(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public Object createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };

            /* renamed from: d */
            public boolean f17403d;

            /* renamed from: e */
            public boolean f17404e;

            /* renamed from: f */
            public int f17405f;

            /* renamed from: g */
            public float f17406g;

            /* renamed from: h */
            public boolean f17407h;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f17403d = parcel.readByte() != 0;
                this.f17404e = parcel.readByte() != 0;
                this.f17405f = parcel.readInt();
                this.f17406g = parcel.readFloat();
                this.f17407h = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i2) {
                parcel.writeParcelable(this.f3875b, i2);
                parcel.writeByte(this.f17403d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f17404e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f17405f);
                parcel.writeFloat(this.f17406g);
                parcel.writeByte(this.f17407h ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        /* renamed from: a */
        void mo9774a(T t, int i2);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        /* renamed from: a */
        public abstract void mo9775a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f2);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* renamed from: a */
        public final Rect f17408a = new Rect();

        /* renamed from: b */
        public final Rect f17409b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        /* renamed from: a */
        public void mo9775a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f2) {
            Rect rect = this.f17408a;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
            float abs = this.f17408a.top - Math.abs(f2);
            if (abs > 0.0f) {
                ViewCompat.m2210l0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float m1933a = 1.0f - MathUtils.m1933a(Math.abs(abs / this.f17408a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f17408a.height() * 0.3f) * (1.0f - (m1933a * m1933a)));
            view.setTranslationY(height);
            view.getDrawingRect(this.f17409b);
            this.f17409b.offset(0, (int) (-height));
            ViewCompat.m2210l0(view, this.f17409b);
        }
    }

    public interface LiftOnScrollListener {
        /* renamed from: a */
        void m9776a(@Dimension float f2, @ColorInt int i2);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: b */
        public boolean mo1493b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: d */
        public boolean mo1495d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).f3070a;
            if (behavior instanceof BaseBehavior) {
                ViewCompat.m2179S(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f17386j) + this.f17452e) - m9793w(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f17375m) {
                return false;
            }
            appBarLayout.m9756f(appBarLayout.m9757g(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: e */
        public void mo1496e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m2188a0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3749h.m2516a(), coordinatorLayout);
                ViewCompat.m2177Q(coordinatorLayout, 0);
                ViewCompat.m2188a0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i.m2516a(), coordinatorLayout);
                ViewCompat.m2177Q(coordinatorLayout, 0);
                ViewCompat.m2196e0(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m */
        public boolean mo1504m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout mo9777v = mo9777v(coordinatorLayout.m1478h(view));
            if (mo9777v != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f17450c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo9777v.m9755e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: x */
        public float mo9778x(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).f3070a;
                int mo9772y = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mo9772y() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + mo9772y > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (mo9772y / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: y */
        public int mo9779y(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo9777v(@NonNull List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17307H);
            this.f17453f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.appBarLayoutStyle, C2507R.style.Widget_Design_AppBarLayout), attributeSet, C2507R.attr.appBarLayoutStyle);
        this.f17365c = -1;
        this.f17366d = -1;
        this.f17367e = -1;
        this.f17369g = 0;
        this.f17379q = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray m10159d = ThemeEnforcement.m10159d(context3, attributeSet, ViewUtilsLollipop.f17466a, C2507R.attr.appBarLayoutStyle, C2507R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (m10159d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, m10159d.getResourceId(0, 0)));
            }
            m10159d.recycle();
            TypedArray m10159d2 = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17316a, C2507R.attr.appBarLayoutStyle, C2507R.style.Widget_Design_AppBarLayout, new int[0]);
            ViewCompat.m2204i0(this, m10159d2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.m10301x(ColorStateList.valueOf(colorDrawable.getColor()));
                materialShapeDrawable.m10296s(context2);
                ViewCompat.m2204i0(this, materialShapeDrawable);
            }
            if (m10159d2.hasValue(4)) {
                m9755e(m10159d2.getBoolean(4, false), false, false);
            }
            if (m10159d2.hasValue(3)) {
                ViewUtilsLollipop.m9799a(this, m10159d2.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (m10159d2.hasValue(2)) {
                    setKeyboardNavigationCluster(m10159d2.getBoolean(2, false));
                }
                if (m10159d2.hasValue(1)) {
                    setTouchscreenBlocksFocus(m10159d2.getBoolean(1, false));
                }
            }
            this.f17375m = m10159d2.getBoolean(5, false);
            this.f17376n = m10159d2.getResourceId(6, -1);
            setStatusBarForeground(m10159d2.getDrawable(7));
            m10159d2.recycle();
            ViewCompat.m2224s0(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                /* renamed from: a */
                public WindowInsetsCompat mo433a(View view, WindowInsetsCompat windowInsetsCompat) {
                    AppBarLayout appBarLayout = AppBarLayout.this;
                    Objects.requireNonNull(appBarLayout);
                    WindowInsetsCompat windowInsetsCompat2 = ViewCompat.m2225t(appBarLayout) ? windowInsetsCompat : null;
                    if (!ObjectsCompat.m2022a(appBarLayout.f17370h, windowInsetsCompat2)) {
                        appBarLayout.f17370h = windowInsetsCompat2;
                        appBarLayout.m9759i();
                        appBarLayout.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            });
        } catch (Throwable th) {
            m10159d.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void m9751a() {
        WeakReference<View> weakReference = this.f17377o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f17377o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void m9753c() {
        Behavior behavior = this.f17382t;
        BaseBehavior.SavedState m9765H = (behavior == null || this.f17365c == -1 || this.f17369g != 0) ? null : behavior.m9765H(AbsSavedState.f3874c, this);
        this.f17365c = -1;
        this.f17366d = -1;
        this.f17367e = -1;
        if (m9765H != null) {
            Behavior behavior2 = this.f17382t;
            if (behavior2.f17389m != null) {
                return;
            }
            behavior2.f17389m = m9765H;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m9754d(int i2) {
        this.f17364b = i2;
        if (!willNotDraw()) {
            ViewCompat.m2183W(this);
        }
        List<BaseOnOffsetChangedListener> list = this.f17371i;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.f17371i.get(i3);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.mo9774a(this, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f17381s != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f17364b);
            this.f17381s.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17381s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final void m9755e(boolean z, boolean z2, boolean z3) {
        this.f17369g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: f */
    public boolean m9756f(boolean z) {
        if (!(!this.f17372j) || this.f17374l == z) {
            return false;
        }
        this.f17374l = z;
        refreshDrawableState();
        if (!this.f17375m || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        final MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        float dimension = getResources().getDimension(C2507R.dimen.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f17378p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.f17378p = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C2507R.integer.app_bar_elevation_anim_duration));
        this.f17378p.setInterpolator(AnimationUtils.f17342a);
        this.f17378p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                materialShapeDrawable.m10300w(floatValue);
                Drawable drawable = AppBarLayout.this.f17381s;
                if (drawable instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) drawable).m10300w(floatValue);
                }
                Iterator<LiftOnScrollListener> it = AppBarLayout.this.f17379q.iterator();
                while (it.hasNext()) {
                    it.next().m9776a(floatValue, materialShapeDrawable.f18653v);
                }
            }
        });
        this.f17378p.start();
        return true;
    }

    /* renamed from: g */
    public boolean m9757g(@Nullable View view) {
        int i2;
        if (this.f17377o == null && (i2 = this.f17376n) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f17376n);
            }
            if (findViewById != null) {
                this.f17377o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f17377o;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f17382t = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int m2233x;
        int i3 = this.f17366d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = layoutParams.f17410a;
                if ((i5 & 5) != 5) {
                    if (i4 > 0) {
                        break;
                    }
                } else {
                    int i6 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i5 & 8) != 0) {
                        m2233x = ViewCompat.m2233x(childAt);
                    } else if ((i5 & 2) != 0) {
                        m2233x = measuredHeight - ViewCompat.m2233x(childAt);
                    } else {
                        i2 = i6 + measuredHeight;
                        if (childCount == 0 && ViewCompat.m2225t(childAt)) {
                            i2 = Math.min(i2, measuredHeight - getTopInset());
                        }
                        i4 += i2;
                    }
                    i2 = m2233x + i6;
                    if (childCount == 0) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
            }
        }
        int max = Math.max(0, i4);
        this.f17366d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f17367e;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i5 = layoutParams.f17410a;
                if ((i5 & 1) == 0) {
                    break;
                }
                i4 += measuredHeight;
                if ((i5 & 2) != 0) {
                    i4 -= ViewCompat.m2233x(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f17367e = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f17376n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m2233x = ViewCompat.m2233x(this);
        if (m2233x == 0) {
            int childCount = getChildCount();
            m2233x = childCount >= 1 ? ViewCompat.m2233x(getChildAt(childCount - 1)) : 0;
            if (m2233x == 0) {
                return getHeight() / 3;
            }
        }
        return (m2233x * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f17369g;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f17381s;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f17370h;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m2428i();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f17365c;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = layoutParams.f17410a;
                if ((i5 & 1) == 0) {
                    break;
                }
                int i6 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i4;
                if (i3 == 0 && ViewCompat.m2225t(childAt)) {
                    i6 -= getTopInset();
                }
                i4 = i6;
                if ((i5 & 2) != 0) {
                    i4 -= ViewCompat.m2233x(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f17365c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public final boolean m9758h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || ViewCompat.m2225t(childAt)) ? false : true;
    }

    /* renamed from: i */
    public final void m9759i() {
        setWillNotDraw(!(this.f17381s != null && getTopInset() > 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.m10309c(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f17380r == null) {
            this.f17380r = new int[4];
        }
        int[] iArr = this.f17380r;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f17373k;
        iArr[0] = z ? C2507R.attr.state_liftable : -2130969747;
        iArr[1] = (z && this.f17374l) ? C2507R.attr.state_lifted : -2130969748;
        iArr[2] = z ? C2507R.attr.state_collapsible : -2130969742;
        iArr[3] = (z && this.f17374l) ? C2507R.attr.state_collapsed : -2130969741;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9751a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i2, i3, i4, i5);
        boolean z3 = true;
        if (ViewCompat.m2225t(this) && m9758h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.m2179S(getChildAt(childCount), topInset);
            }
        }
        m9753c();
        this.f17368f = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i6).getLayoutParams()).f17412c != null) {
                this.f17368f = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.f17381s;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f17372j) {
            return;
        }
        if (!this.f17375m) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i8 = ((LayoutParams) getChildAt(i7).getLayoutParams()).f17410a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f17373k != z3) {
            this.f17373k = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && ViewCompat.m2225t(this) && m9758h()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.m1934b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m9753c();
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.m10308b(this, f2);
    }

    public void setExpanded(boolean z) {
        m9755e(z, ViewCompat.m2174N(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f17375m = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f17376n = -1;
        if (view == null) {
            m9751a();
        } else {
            this.f17377o = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i2) {
        this.f17376n = i2;
        m9751a();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f17372j = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17381s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f17381s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f17381s.setState(getDrawableState());
                }
                DrawableCompat.m1840l(this.f17381s, ViewCompat.m2231w(this));
                this.f17381s.setVisible(getVisibility() == 0, false);
                this.f17381s.setCallback(this);
            }
            m9759i();
            ViewCompat.m2183W(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i2) {
        setStatusBarForeground(AppCompatResources.m497b(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        ViewUtilsLollipop.m9799a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f17381s;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17381s;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f17410a;

        /* renamed from: b */
        public ChildScrollEffect f17411b;

        /* renamed from: c */
        public Interpolator f17412c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17410a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17317b);
            this.f17410a = obtainStyledAttributes.getInt(1, 0);
            this.f17411b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new CompressChildScrollEffect();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f17412c = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f17410a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17410a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17410a = 1;
        }

        @RequiresApi
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17410a = 1;
        }
    }
}

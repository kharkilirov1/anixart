package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: A */
    @Nullable
    public ValueAnimator f17585A;

    /* renamed from: B */
    public int f17586B;

    /* renamed from: C */
    public int f17587C;

    /* renamed from: D */
    public int f17588D;

    /* renamed from: E */
    public float f17589E;

    /* renamed from: F */
    public int f17590F;

    /* renamed from: G */
    public float f17591G;

    /* renamed from: H */
    public boolean f17592H;

    /* renamed from: I */
    public boolean f17593I;

    /* renamed from: J */
    public boolean f17594J;

    /* renamed from: K */
    public int f17595K;

    /* renamed from: L */
    @Nullable
    public ViewDragHelper f17596L;

    /* renamed from: M */
    public boolean f17597M;

    /* renamed from: N */
    public int f17598N;

    /* renamed from: O */
    public boolean f17599O;

    /* renamed from: P */
    public float f17600P;

    /* renamed from: Q */
    public int f17601Q;

    /* renamed from: R */
    public int f17602R;

    /* renamed from: S */
    public int f17603S;

    /* renamed from: T */
    @Nullable
    public WeakReference<V> f17604T;

    /* renamed from: U */
    @Nullable
    public WeakReference<View> f17605U;

    /* renamed from: V */
    @NonNull
    public final ArrayList<BottomSheetCallback> f17606V;

    /* renamed from: W */
    @Nullable
    public VelocityTracker f17607W;

    /* renamed from: X */
    public int f17608X;

    /* renamed from: Y */
    public int f17609Y;

    /* renamed from: Z */
    public boolean f17610Z;

    /* renamed from: a */
    public int f17611a;

    /* renamed from: a0 */
    @Nullable
    public Map<View, Integer> f17612a0;

    /* renamed from: b */
    public boolean f17613b;

    /* renamed from: b0 */
    public int f17614b0;

    /* renamed from: c */
    public float f17615c;

    /* renamed from: c0 */
    public final ViewDragHelper.Callback f17616c0;

    /* renamed from: d */
    public int f17617d;

    /* renamed from: e */
    public int f17618e;

    /* renamed from: f */
    public boolean f17619f;

    /* renamed from: g */
    public int f17620g;

    /* renamed from: h */
    public int f17621h;

    /* renamed from: i */
    public MaterialShapeDrawable f17622i;

    /* renamed from: j */
    @Nullable
    public ColorStateList f17623j;

    /* renamed from: k */
    public int f17624k;

    /* renamed from: l */
    public int f17625l;

    /* renamed from: m */
    public int f17626m;

    /* renamed from: n */
    public boolean f17627n;

    /* renamed from: o */
    public boolean f17628o;

    /* renamed from: p */
    public boolean f17629p;

    /* renamed from: q */
    public boolean f17630q;

    /* renamed from: r */
    public boolean f17631r;

    /* renamed from: s */
    public boolean f17632s;

    /* renamed from: t */
    public boolean f17633t;

    /* renamed from: u */
    public boolean f17634u;

    /* renamed from: v */
    public int f17635v;

    /* renamed from: w */
    public int f17636w;

    /* renamed from: x */
    public ShapeAppearanceModel f17637x;

    /* renamed from: y */
    public boolean f17638y;

    /* renamed from: z */
    public final BottomSheetBehavior<V>.StateSettlingTracker f17639z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$5 */
    class C12305 implements AccessibilityViewCommand {

        /* renamed from: b */
        public final /* synthetic */ int f17647b;

        public C12305(int i2) {
            this.f17647b = i2;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: d */
        public boolean mo2531d(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
            BottomSheetBehavior.this.m9843E(this.f17647b);
            return true;
        }
    }

    public static abstract class BottomSheetCallback {
        /* renamed from: a */
        public void mo9858a(@NonNull View view) {
        }

        /* renamed from: b */
        public abstract void mo9859b(@NonNull View view, float f2);

        /* renamed from: c */
        public abstract void mo9860c(@NonNull View view, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface State {
    }

    public class StateSettlingTracker {

        /* renamed from: a */
        public int f17654a;

        /* renamed from: b */
        public boolean f17655b;

        /* renamed from: c */
        public final Runnable f17656c = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
            @Override // java.lang.Runnable
            public void run() {
                StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                stateSettlingTracker.f17655b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f17596L;
                if (viewDragHelper != null && viewDragHelper.m2721j(true)) {
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    stateSettlingTracker2.m9861a(stateSettlingTracker2.f17654a);
                    return;
                }
                StateSettlingTracker stateSettlingTracker3 = StateSettlingTracker.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f17595K == 2) {
                    bottomSheetBehavior.m9844F(stateSettlingTracker3.f17654a);
                }
            }
        };

        public StateSettlingTracker(RunnableC12261 runnableC12261) {
        }

        /* renamed from: a */
        public void m9861a(int i2) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f17604T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f17654a = i2;
            if (this.f17655b) {
                return;
            }
            ViewCompat.m2184X(BottomSheetBehavior.this.f17604T.get(), this.f17656c);
            this.f17655b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f17611a = 0;
        this.f17613b = true;
        this.f17624k = -1;
        this.f17625l = -1;
        this.f17639z = new StateSettlingTracker(null);
        this.f17589E = 0.5f;
        this.f17591G = -1.0f;
        this.f17594J = true;
        this.f17595K = 4;
        this.f17600P = 0.1f;
        this.f17606V = new ArrayList<>();
        this.f17614b0 = -1;
        this.f17616c0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: a */
            public int mo2737a(@NonNull View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: b */
            public int mo2738b(@NonNull View view, int i2, int i3) {
                int m9857z = BottomSheetBehavior.this.m9857z();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return MathUtils.m1934b(i2, m9857z, bottomSheetBehavior.f17592H ? bottomSheetBehavior.f17603S : bottomSheetBehavior.f17590F);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: d */
            public int mo2740d(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.f17592H ? bottomSheetBehavior.f17603S : bottomSheetBehavior.f17590F;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: h */
            public void mo2744h(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f17594J) {
                        bottomSheetBehavior.m9844F(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: i */
            public void mo2745i(@NonNull View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.m9854v(i3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
            
                if (java.lang.Math.abs(r5.getTop() - r4.f17646a.m9857z()) < java.lang.Math.abs(r5.getTop() - r4.f17646a.f17588D)) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
            
                if (java.lang.Math.abs(r6 - r7.f17587C) < java.lang.Math.abs(r6 - r4.f17646a.f17590F)) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
            
                if (r6 > r4.f17646a.f17588D) goto L55;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: j */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void mo2746j(@androidx.annotation.NonNull android.view.View r5, float r6, float r7) {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C12294.mo2746j(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: k */
            public boolean mo2747k(@NonNull View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.f17595K;
                if (i3 == 1 || bottomSheetBehavior.f17610Z) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.f17608X == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.f17605U;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.f17604T;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    @NonNull
    /* renamed from: x */
    public static <V extends View> BottomSheetBehavior<V> m9838x(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f3070a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* renamed from: A */
    public final int m9839A(int i2) {
        if (i2 == 3) {
            return m9857z();
        }
        if (i2 == 4) {
            return this.f17590F;
        }
        if (i2 == 5) {
            return this.f17603S;
        }
        if (i2 == 6) {
            return this.f17588D;
        }
        throw new IllegalArgumentException(C0000a.m7d("Invalid state to get top offset: ", i2));
    }

    /* renamed from: B */
    public final void m9840B(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i2) {
        ViewCompat.m2190b0(v, accessibilityActionCompat, null, new C12305(i2));
    }

    /* renamed from: C */
    public void m9841C(boolean z) {
        if (this.f17592H != z) {
            this.f17592H = z;
            if (!z && this.f17595K == 5) {
                m9843E(4);
            }
            m9847I();
        }
    }

    /* renamed from: D */
    public void m9842D(int i2) {
        boolean z = true;
        if (i2 == -1) {
            if (!this.f17619f) {
                this.f17619f = true;
            }
            z = false;
        } else {
            if (this.f17619f || this.f17618e != i2) {
                this.f17619f = false;
                this.f17618e = Math.max(0, i2);
            }
            z = false;
        }
        if (z) {
            m9850L(false);
        }
    }

    /* renamed from: E */
    public void m9843E(int i2) {
        if (i2 == 1 || i2 == 2) {
            throw new IllegalArgumentException(C0000a.m20q(C0000a.m24u("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f17592H && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        final int i3 = (i2 == 6 && this.f17613b && m9839A(i2) <= this.f17587C) ? 3 : i2;
        WeakReference<V> weakReference = this.f17604T;
        if (weakReference == null || weakReference.get() == null) {
            m9844F(i2);
            return;
        }
        final V v = this.f17604T.get();
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            @Override // java.lang.Runnable
            public void run() {
                BottomSheetBehavior.this.m9846H(v, i3, false);
            }
        };
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.m2173M(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: F */
    public void m9844F(int i2) {
        V v;
        if (this.f17595K == i2) {
            return;
        }
        this.f17595K = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z = this.f17592H;
        }
        WeakReference<V> weakReference = this.f17604T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m9849K(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m9849K(false);
        }
        m9848J(i2);
        for (int i3 = 0; i3 < this.f17606V.size(); i3++) {
            this.f17606V.get(i3).mo9860c(v, i2);
        }
        m9847I();
    }

    /* renamed from: G */
    public boolean m9845G(@NonNull View view, float f2) {
        if (this.f17593I) {
            return true;
        }
        if (view.getTop() < this.f17590F) {
            return false;
        }
        return Math.abs(((f2 * this.f17600P) + ((float) view.getTop())) - ((float) this.f17590F)) / ((float) m9853u()) > 0.5f;
    }

    /* renamed from: H */
    public final void m9846H(View view, int i2, boolean z) {
        int m9839A = m9839A(i2);
        ViewDragHelper viewDragHelper = this.f17596L;
        if (!(viewDragHelper != null && (!z ? !viewDragHelper.m2736z(view, view.getLeft(), m9839A) : !viewDragHelper.m2734x(view.getLeft(), m9839A)))) {
            m9844F(i2);
            return;
        }
        m9844F(2);
        m9848J(i2);
        this.f17639z.m9861a(i2);
    }

    /* renamed from: I */
    public final void m9847I() {
        V v;
        int i2;
        WeakReference<V> weakReference = this.f17604T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.m2188a0(524288, v);
        ViewCompat.m2177Q(v, 0);
        ViewCompat.m2188a0(PrimitiveArrayBuilder.MAX_CHUNK_SIZE, v);
        ViewCompat.m2177Q(v, 0);
        ViewCompat.m2188a0(1048576, v);
        ViewCompat.m2177Q(v, 0);
        int i3 = this.f17614b0;
        if (i3 != -1) {
            ViewCompat.m2188a0(i3, v);
            ViewCompat.m2177Q(v, 0);
        }
        if (!this.f17613b && this.f17595K != 6) {
            String string = v.getResources().getString(C2507R.string.bottomsheet_action_expand_halfway);
            C12305 c12305 = new C12305(6);
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> m2211m = ViewCompat.m2211m(v);
            int i4 = 0;
            while (true) {
                if (i4 >= m2211m.size()) {
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        int[] iArr = ViewCompat.f3642e;
                        if (i6 >= iArr.length || i5 != -1) {
                            break;
                        }
                        int i7 = iArr[i6];
                        boolean z = true;
                        for (int i8 = 0; i8 < m2211m.size(); i8++) {
                            z &= m2211m.get(i8).m2516a() != i7;
                        }
                        if (z) {
                            i5 = i7;
                        }
                        i6++;
                    }
                    i2 = i5;
                } else {
                    if (TextUtils.equals(string, m2211m.get(i4).m2517b())) {
                        i2 = m2211m.get(i4).m2516a();
                        break;
                    }
                    i4++;
                }
            }
            if (i2 != -1) {
                ViewCompat.m2187a(v, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, i2, string, c12305, null));
            }
            this.f17614b0 = i2;
        }
        if (this.f17592H && this.f17595K != 5) {
            m9840B(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3753l, 5);
        }
        int i9 = this.f17595K;
        if (i9 == 3) {
            m9840B(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3752k, this.f17613b ? 4 : 6);
            return;
        }
        if (i9 == 4) {
            m9840B(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3751j, this.f17613b ? 3 : 6);
        } else {
            if (i9 != 6) {
                return;
            }
            m9840B(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3752k, 4);
            m9840B(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3751j, 3);
        }
    }

    /* renamed from: J */
    public final void m9848J(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.f17638y != z) {
            this.f17638y = z;
            if (this.f17622i == null || (valueAnimator = this.f17585A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f17585A.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.f17585A.setFloatValues(1.0f - f2, f2);
            this.f17585A.start();
        }
    }

    /* renamed from: K */
    public final void m9849K(boolean z) {
        WeakReference<V> weakReference = this.f17604T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f17612a0 != null) {
                    return;
                } else {
                    this.f17612a0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f17604T.get() && z) {
                    this.f17612a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f17612a0 = null;
        }
    }

    /* renamed from: L */
    public final void m9850L(boolean z) {
        V v;
        if (this.f17604T != null) {
            m9852t();
            if (this.f17595K != 4 || (v = this.f17604T.get()) == null) {
                return;
            }
            if (z) {
                m9843E(4);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: c */
    public void mo1494c(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        this.f17604T = null;
        this.f17596L = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: f */
    public void mo1497f() {
        this.f17604T = null;
        this.f17596L = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g */
    public boolean mo1498g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.f17594J) {
            this.f17597M = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17608X = -1;
            VelocityTracker velocityTracker = this.f17607W;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17607W = null;
            }
        }
        if (this.f17607W == null) {
            this.f17607W = VelocityTracker.obtain();
        }
        this.f17607W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f17609Y = (int) motionEvent.getY();
            if (this.f17595K != 2) {
                WeakReference<View> weakReference = this.f17605U;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m1484s(view, x, this.f17609Y)) {
                    this.f17608X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f17610Z = true;
                }
            }
            this.f17597M = this.f17608X == -1 && !coordinatorLayout.m1484s(v, x, this.f17609Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f17610Z = false;
            this.f17608X = -1;
            if (this.f17597M) {
                this.f17597M = false;
                return false;
            }
        }
        if (!this.f17597M && (viewDragHelper = this.f17596L) != null && viewDragHelper.m2735y(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f17605U;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f17597M || this.f17595K == 1 || coordinatorLayout.m1484s(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f17596L == null || Math.abs(((float) this.f17609Y) - motionEvent.getY()) <= ((float) this.f17596L.f3896b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h */
    public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        if (ViewCompat.m2225t(coordinatorLayout) && !ViewCompat.m2225t(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f17604T == null) {
            this.f17620g = coordinatorLayout.getResources().getDimensionPixelSize(C2507R.dimen.design_bottom_sheet_peek_height_min);
            final boolean z = (Build.VERSION.SDK_INT < 29 || this.f17627n || this.f17619f) ? false : true;
            if (this.f17628o || this.f17629p || this.f17630q || this.f17632s || this.f17633t || this.f17634u || z) {
                ViewUtils.m10164a(v, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[ADDED_TO_REGION] */
                    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                    /* renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public androidx.core.view.WindowInsetsCompat mo9833a(android.view.View r12, androidx.core.view.WindowInsetsCompat r13, com.google.android.material.internal.ViewUtils.RelativePadding r14) {
                        /*
                            r11 = this;
                            r0 = 7
                            androidx.core.graphics.Insets r0 = r13.m2423d(r0)
                            r1 = 32
                            androidx.core.graphics.Insets r1 = r13.m2423d(r1)
                            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            int r3 = r0.f3369b
                            r2.f17636w = r3
                            boolean r2 = com.google.android.material.internal.ViewUtils.m10171h(r12)
                            int r3 = r12.getPaddingBottom()
                            int r4 = r12.getPaddingLeft()
                            int r5 = r12.getPaddingRight()
                            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            boolean r7 = r6.f17628o
                            if (r7 == 0) goto L34
                            int r3 = r13.m2425f()
                            r6.f17635v = r3
                            int r3 = r14.f18375d
                            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            int r6 = r6.f17635v
                            int r3 = r3 + r6
                        L34:
                            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            boolean r7 = r6.f17629p
                            if (r7 == 0) goto L44
                            if (r2 == 0) goto L3f
                            int r4 = r14.f18374c
                            goto L41
                        L3f:
                            int r4 = r14.f18372a
                        L41:
                            int r7 = r0.f3368a
                            int r4 = r4 + r7
                        L44:
                            boolean r6 = r6.f17630q
                            if (r6 == 0) goto L53
                            if (r2 == 0) goto L4d
                            int r14 = r14.f18372a
                            goto L4f
                        L4d:
                            int r14 = r14.f18374c
                        L4f:
                            int r2 = r0.f3370c
                            int r5 = r14 + r2
                        L53:
                            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
                            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
                            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            boolean r6 = r2.f17632s
                            r7 = 0
                            r8 = 1
                            if (r6 == 0) goto L6b
                            int r6 = r14.leftMargin
                            int r9 = r0.f3368a
                            if (r6 == r9) goto L6b
                            r14.leftMargin = r9
                            r6 = 1
                            goto L6c
                        L6b:
                            r6 = 0
                        L6c:
                            boolean r9 = r2.f17633t
                            if (r9 == 0) goto L79
                            int r9 = r14.rightMargin
                            int r10 = r0.f3370c
                            if (r9 == r10) goto L79
                            r14.rightMargin = r10
                            r6 = 1
                        L79:
                            boolean r2 = r2.f17634u
                            if (r2 == 0) goto L86
                            int r2 = r14.topMargin
                            int r0 = r0.f3369b
                            if (r2 == r0) goto L86
                            r14.topMargin = r0
                            goto L87
                        L86:
                            r8 = r6
                        L87:
                            if (r8 == 0) goto L8c
                            r12.setLayoutParams(r14)
                        L8c:
                            int r14 = r12.getPaddingTop()
                            r12.setPadding(r4, r14, r5, r3)
                            boolean r12 = r2
                            if (r12 == 0) goto L9d
                            com.google.android.material.bottomsheet.BottomSheetBehavior r14 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            int r0 = r1.f3371d
                            r14.f17626m = r0
                        L9d:
                            com.google.android.material.bottomsheet.BottomSheetBehavior r14 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            boolean r0 = r14.f17628o
                            if (r0 != 0) goto La5
                            if (r12 == 0) goto La8
                        La5:
                            r14.m9850L(r7)
                        La8:
                            return r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C12283.mo9833a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
                    }
                });
            }
            this.f17604T = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.f17622i;
            if (materialShapeDrawable != null) {
                ViewCompat.m2204i0(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f17622i;
                float f2 = this.f17591G;
                if (f2 == -1.0f) {
                    f2 = ViewCompat.m2221r(v);
                }
                materialShapeDrawable2.m10300w(f2);
                boolean z2 = this.f17595K == 3;
                this.f17638y = z2;
                this.f17622i.m10302y(z2 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f17623j;
                if (colorStateList != null) {
                    ViewCompat.m2206j0(v, colorStateList);
                }
            }
            m9847I();
            if (ViewCompat.m2227u(v) == 0) {
                ViewCompat.m2216o0(v, 1);
            }
        }
        if (this.f17596L == null) {
            this.f17596L = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f17616c0);
        }
        int top = v.getTop();
        coordinatorLayout.m1486u(v, i2);
        this.f17602R = coordinatorLayout.getWidth();
        this.f17603S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f17601Q = height;
        int i3 = this.f17603S;
        int i4 = i3 - height;
        int i5 = this.f17636w;
        if (i4 < i5) {
            if (this.f17631r) {
                this.f17601Q = i3;
            } else {
                this.f17601Q = i3 - i5;
            }
        }
        this.f17587C = Math.max(0, i3 - this.f17601Q);
        this.f17588D = (int) ((1.0f - this.f17589E) * this.f17603S);
        m9852t();
        int i6 = this.f17595K;
        if (i6 == 3) {
            ViewCompat.m2179S(v, m9857z());
        } else if (i6 == 6) {
            ViewCompat.m2179S(v, this.f17588D);
        } else if (this.f17592H && i6 == 5) {
            ViewCompat.m2179S(v, this.f17603S);
        } else if (i6 == 4) {
            ViewCompat.m2179S(v, this.f17590F);
        } else if (i6 == 1 || i6 == 2) {
            ViewCompat.m2179S(v, top - v.getTop());
        }
        this.f17605U = new WeakReference<>(m9855w(v));
        for (int i7 = 0; i7 < this.f17606V.size(); i7++) {
            this.f17606V.get(i7).mo9858a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public boolean mo1500i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m9856y(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f17624k, marginLayoutParams.width), m9856y(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.f17625l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: j */
    public boolean mo1501j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
        WeakReference<View> weakReference = this.f17605U;
        return (weakReference == null || view != weakReference.get() || this.f17595K == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public void mo1502k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f17605U;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m9857z()) {
                iArr[1] = top - m9857z();
                ViewCompat.m2179S(v, -iArr[1]);
                m9844F(3);
            } else {
                if (!this.f17594J) {
                    return;
                }
                iArr[1] = i3;
                ViewCompat.m2179S(v, -i3);
                m9844F(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f17590F;
            if (i5 > i6 && !this.f17592H) {
                iArr[1] = top - i6;
                ViewCompat.m2179S(v, -iArr[1]);
                m9844F(4);
            } else {
                if (!this.f17594J) {
                    return;
                }
                iArr[1] = i3;
                ViewCompat.m2179S(v, -i3);
                m9844F(1);
            }
        }
        m9854v(v.getTop());
        this.f17598N = i3;
        this.f17599O = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public void mo1503l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: n */
    public void mo1505n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.f17611a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f17618e = savedState.f17650e;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f17613b = savedState.f17651f;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f17592H = savedState.f17652g;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f17593I = savedState.f17653h;
            }
        }
        int i3 = savedState.f17649d;
        if (i3 == 1 || i3 == 2) {
            this.f17595K = 4;
        } else {
            this.f17595K = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    /* renamed from: o */
    public Parcelable mo1506o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo1507p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
        this.f17598N = 0;
        this.f17599O = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r1.f17588D) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f17587C) < java.lang.Math.abs(r2 - r1.f17590F)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.f17590F)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f17590F)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f17588D) < java.lang.Math.abs(r2 - r1.f17590F)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1508q(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m9857z()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m9844F(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f17605U
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.f17599O
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.f17598N
            if (r2 <= 0) goto L33
            boolean r2 = r1.f17613b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.f17588D
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.f17592H
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.f17607W
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f17615c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f17607W
            int r4 = r1.f17608X
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.m9845G(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.f17598N
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f17613b
            if (r4 == 0) goto L72
            int r4 = r1.f17587C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f17590F
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.f17588D
            if (r2 >= r4) goto L81
            int r4 = r1.f17590F
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f17590F
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f17613b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.f17588D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f17590F
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.m9846H(r3, r0, r2)
            r1.f17599O = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1508q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: r */
    public boolean mo1509r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f17595K;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f17596L;
        if (viewDragHelper != null && (this.f17594J || i2 == 1)) {
            viewDragHelper.m2728r(motionEvent);
        }
        if (actionMasked == 0) {
            this.f17608X = -1;
            VelocityTracker velocityTracker = this.f17607W;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17607W = null;
            }
        }
        if (this.f17607W == null) {
            this.f17607W = VelocityTracker.obtain();
        }
        this.f17607W.addMovement(motionEvent);
        if (this.f17596L != null && (this.f17594J || this.f17595K == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.f17597M) {
            float abs = Math.abs(this.f17609Y - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.f17596L;
            if (abs > viewDragHelper2.f3896b) {
                viewDragHelper2.m2714c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f17597M;
    }

    /* renamed from: s */
    public void m9851s(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (this.f17606V.contains(bottomSheetCallback)) {
            return;
        }
        this.f17606V.add(bottomSheetCallback);
    }

    /* renamed from: t */
    public final void m9852t() {
        int m9853u = m9853u();
        if (this.f17613b) {
            this.f17590F = Math.max(this.f17603S - m9853u, this.f17587C);
        } else {
            this.f17590F = this.f17603S - m9853u;
        }
    }

    /* renamed from: u */
    public final int m9853u() {
        int i2;
        return this.f17619f ? Math.min(Math.max(this.f17620g, this.f17603S - ((this.f17602R * 9) / 16)), this.f17601Q) + this.f17635v : (this.f17627n || this.f17628o || (i2 = this.f17626m) <= 0) ? this.f17618e + this.f17635v : Math.max(this.f17618e, i2 + this.f17621h);
    }

    /* renamed from: v */
    public void m9854v(int i2) {
        float f2;
        float f3;
        V v = this.f17604T.get();
        if (v == null || this.f17606V.isEmpty()) {
            return;
        }
        int i3 = this.f17590F;
        if (i2 > i3 || i3 == m9857z()) {
            int i4 = this.f17590F;
            f2 = i4 - i2;
            f3 = this.f17603S - i4;
        } else {
            int i5 = this.f17590F;
            f2 = i5 - i2;
            f3 = i5 - m9857z();
        }
        float f4 = f2 / f3;
        for (int i6 = 0; i6 < this.f17606V.size(); i6++) {
            this.f17606V.get(i6).mo9859b(v, f4);
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: w */
    public View m9855w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.m2175O(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View m9855w = m9855w(viewGroup.getChildAt(i2));
                if (m9855w != null) {
                    return m9855w;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    public final int m9856y(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* renamed from: z */
    public int m9857z() {
        if (this.f17613b) {
            return this.f17587C;
        }
        return Math.max(this.f17586B, this.f17631r ? 0 : this.f17636w);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: d */
        public final int f17649d;

        /* renamed from: e */
        public int f17650e;

        /* renamed from: f */
        public boolean f17651f;

        /* renamed from: g */
        public boolean f17652g;

        /* renamed from: h */
        public boolean f17653h;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17649d = parcel.readInt();
            this.f17650e = parcel.readInt();
            this.f17651f = parcel.readInt() == 1;
            this.f17652g = parcel.readInt() == 1;
            this.f17653h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f17649d);
            parcel.writeInt(this.f17650e);
            parcel.writeInt(this.f17651f ? 1 : 0);
            parcel.writeInt(this.f17652g ? 1 : 0);
            parcel.writeInt(this.f17653h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f17649d = bottomSheetBehavior.f17595K;
            this.f17650e = bottomSheetBehavior.f17618e;
            this.f17651f = bottomSheetBehavior.f17613b;
            this.f17652g = bottomSheetBehavior.f17592H;
            this.f17653h = bottomSheetBehavior.f17593I;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.f17611a = 0;
        this.f17613b = true;
        this.f17624k = -1;
        this.f17625l = -1;
        this.f17639z = new StateSettlingTracker(null);
        this.f17589E = 0.5f;
        this.f17591G = -1.0f;
        this.f17594J = true;
        this.f17595K = 4;
        this.f17600P = 0.1f;
        this.f17606V = new ArrayList<>();
        this.f17614b0 = -1;
        this.f17616c0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: a */
            public int mo2737a(@NonNull View view, int i22, int i3) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: b */
            public int mo2738b(@NonNull View view, int i22, int i3) {
                int m9857z = BottomSheetBehavior.this.m9857z();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return MathUtils.m1934b(i22, m9857z, bottomSheetBehavior.f17592H ? bottomSheetBehavior.f17603S : bottomSheetBehavior.f17590F);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: d */
            public int mo2740d(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.f17592H ? bottomSheetBehavior.f17603S : bottomSheetBehavior.f17590F;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: h */
            public void mo2744h(int i22) {
                if (i22 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f17594J) {
                        bottomSheetBehavior.m9844F(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: i */
            public void mo2745i(@NonNull View view, int i22, int i3, int i4, int i5) {
                BottomSheetBehavior.this.m9854v(i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: j */
            public void mo2746j(@NonNull View view, float f2, float f3) {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C12294.mo2746j(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /* renamed from: k */
            public boolean mo2747k(@NonNull View view, int i22) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.f17595K;
                if (i3 == 1 || bottomSheetBehavior.f17610Z) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.f17608X == i22) {
                    WeakReference<View> weakReference = bottomSheetBehavior.f17605U;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.f17604T;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.f17621h = context.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17321f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f17623j = MaterialResources.m10240a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f17637x = ShapeAppearanceModel.m10313c(context, attributeSet, C2507R.attr.bottomSheetStyle, C2507R.style.Widget_Design_BottomSheet_Modal).m10320a();
        }
        if (this.f17637x != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f17637x);
            this.f17622i = materialShapeDrawable;
            materialShapeDrawable.m10296s(context);
            ColorStateList colorStateList = this.f17623j;
            if (colorStateList != null) {
                this.f17622i.m10301x(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f17622i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17585A = ofFloat;
        ofFloat.setDuration(500L);
        this.f17585A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable2 = BottomSheetBehavior.this.f17622i;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.m10302y(floatValue);
                }
            }
        });
        this.f17591G = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f17624k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f17625l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            m9842D(i2);
        } else {
            m9842D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        m9841C(obtainStyledAttributes.getBoolean(8, false));
        this.f17627n = obtainStyledAttributes.getBoolean(13, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f17613b != z) {
            this.f17613b = z;
            if (this.f17604T != null) {
                m9852t();
            }
            m9844F((this.f17613b && this.f17595K == 6) ? 3 : this.f17595K);
            m9847I();
        }
        this.f17593I = obtainStyledAttributes.getBoolean(12, false);
        this.f17594J = obtainStyledAttributes.getBoolean(4, true);
        this.f17611a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f17589E = f2;
            if (this.f17604T != null) {
                this.f17588D = (int) ((1.0f - f2) * this.f17603S);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f17586B = i3;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f17586B = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f17617d = obtainStyledAttributes.getInt(11, 500);
            this.f17628o = obtainStyledAttributes.getBoolean(17, false);
            this.f17629p = obtainStyledAttributes.getBoolean(18, false);
            this.f17630q = obtainStyledAttributes.getBoolean(19, false);
            this.f17631r = obtainStyledAttributes.getBoolean(20, true);
            this.f17632s = obtainStyledAttributes.getBoolean(14, false);
            this.f17633t = obtainStyledAttributes.getBoolean(15, false);
            this.f17634u = obtainStyledAttributes.getBoolean(16, false);
            obtainStyledAttributes.recycle();
            this.f17615c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

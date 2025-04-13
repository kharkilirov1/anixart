package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public ViewDragHelper f17518a;

    /* renamed from: b */
    public OnDismissListener f17519b;

    /* renamed from: c */
    public boolean f17520c;

    /* renamed from: d */
    public int f17521d = 2;

    /* renamed from: e */
    public float f17522e = 0.5f;

    /* renamed from: f */
    public float f17523f = 0.0f;

    /* renamed from: g */
    public float f17524g = 0.5f;

    /* renamed from: h */
    public final ViewDragHelper.Callback f17525h = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1

        /* renamed from: a */
        public int f17526a;

        /* renamed from: b */
        public int f17527b = -1;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: a */
        public int mo2737a(@NonNull View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z = ViewCompat.m2231w(view) == 1;
            int i4 = SwipeDismissBehavior.this.f17521d;
            if (i4 == 0) {
                if (z) {
                    width = this.f17526a - view.getWidth();
                    width2 = this.f17526a;
                } else {
                    width = this.f17526a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.f17526a - view.getWidth();
                width2 = view.getWidth() + this.f17526a;
            } else if (z) {
                width = this.f17526a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f17526a - view.getWidth();
                width2 = this.f17526a;
            }
            return Math.min(Math.max(width, i2), width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: b */
        public int mo2738b(@NonNull View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: c */
        public int mo2739c(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: g */
        public void mo2743g(@NonNull View view, int i2) {
            this.f17527b = i2;
            this.f17526a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: h */
        public void mo2744h(int i2) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f17519b;
            if (onDismissListener != null) {
                onDismissListener.mo9817b(i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: i */
        public void mo2745i(@NonNull View view, int i2, int i3, int i4, int i5) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f17523f;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f17524g;
            float abs = Math.abs(i2 - this.f17526a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m9814t(0.0f, 1.0f - ((abs - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0054, code lost:
        
            if (java.lang.Math.abs(r8.getLeft() - r7.f17526a) >= java.lang.Math.round(r8.getWidth() * r7.f17528c.f17522e)) goto L17;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo2746j(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f17527b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L3a
                int r4 = androidx.core.view.ViewCompat.m2231w(r8)
                if (r4 != r2) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f17521d
                r6 = 2
                if (r5 != r6) goto L1f
                goto L2a
            L1f:
                if (r5 != 0) goto L2e
                if (r4 == 0) goto L28
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 >= 0) goto L2c
                goto L2a
            L28:
                if (r3 <= 0) goto L2c
            L2a:
                r3 = 1
                goto L57
            L2c:
                r3 = 0
                goto L57
            L2e:
                if (r5 != r2) goto L2c
                if (r4 == 0) goto L35
                if (r3 <= 0) goto L2c
                goto L39
            L35:
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 >= 0) goto L2c
            L39:
                goto L2a
            L3a:
                int r3 = r8.getLeft()
                int r4 = r7.f17526a
                int r3 = r3 - r4
                int r4 = r8.getWidth()
                float r4 = (float) r4
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r5 = r5.f17522e
                float r4 = r4 * r5
                int r4 = java.lang.Math.round(r4)
                int r3 = java.lang.Math.abs(r3)
                if (r3 < r4) goto L2c
                goto L2a
            L57:
                if (r3 == 0) goto L6e
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 < 0) goto L68
                int r9 = r8.getLeft()
                int r0 = r7.f17526a
                if (r9 >= r0) goto L66
                goto L68
            L66:
                int r0 = r0 + r10
                goto L6c
            L68:
                int r9 = r7.f17526a
                int r0 = r9 - r10
            L6c:
                r1 = 1
                goto L70
            L6e:
                int r0 = r7.f17526a
            L70:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                androidx.customview.widget.ViewDragHelper r9 = r9.f17518a
                int r10 = r8.getTop()
                boolean r9 = r9.m2734x(r0, r10)
                if (r9 == 0) goto L89
                com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable r9 = new com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                androidx.core.view.ViewCompat.m2184X(r8, r9)
                goto L94
            L89:
                if (r1 == 0) goto L94
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r9 = r9.f17519b
                if (r9 == 0) goto L94
                r9.mo9816a(r8)
            L94:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C12121.mo2746j(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /* renamed from: k */
        public boolean mo2747k(View view, int i2) {
            int i3 = this.f17527b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.mo9815s(view);
        }
    };

    public interface OnDismissListener {
        /* renamed from: a */
        void mo9816a(View view);

        /* renamed from: b */
        void mo9817b(int i2);
    }

    public class SettleRunnable implements Runnable {

        /* renamed from: b */
        public final View f17530b;

        /* renamed from: c */
        public final boolean f17531c;

        public SettleRunnable(View view, boolean z) {
            this.f17530b = view;
            this.f17531c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f17518a;
            if (viewDragHelper != null && viewDragHelper.m2721j(true)) {
                ViewCompat.m2184X(this.f17530b, this);
            } else {
                if (!this.f17531c || (onDismissListener = SwipeDismissBehavior.this.f17519b) == null) {
                    return;
                }
                onDismissListener.mo9816a(this.f17530b);
            }
        }
    }

    /* renamed from: t */
    public static float m9814t(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g */
    public boolean mo1498g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.f17520c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m1484s(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f17520c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f17520c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f17518a == null) {
            this.f17518a = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f17525h);
        }
        return this.f17518a.m2735y(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h */
    public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        if (ViewCompat.m2227u(v) == 0) {
            ViewCompat.m2216o0(v, 1);
            ViewCompat.m2188a0(1048576, v);
            ViewCompat.m2177Q(v, 0);
            if (mo9815s(v)) {
                ViewCompat.m2190b0(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3753l, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    /* renamed from: d */
                    public boolean mo2531d(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                        boolean z = false;
                        if (!SwipeDismissBehavior.this.mo9815s(view)) {
                            return false;
                        }
                        boolean z2 = ViewCompat.m2231w(view) == 1;
                        int i3 = SwipeDismissBehavior.this.f17521d;
                        if ((i3 == 0 && z2) || (i3 == 1 && !z2)) {
                            z = true;
                        }
                        int width = view.getWidth();
                        if (z) {
                            width = -width;
                        }
                        ViewCompat.m2178R(view, width);
                        view.setAlpha(0.0f);
                        OnDismissListener onDismissListener = SwipeDismissBehavior.this.f17519b;
                        if (onDismissListener != null) {
                            onDismissListener.mo9816a(view);
                        }
                        return true;
                    }
                });
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: r */
    public boolean mo1509r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f17518a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.m2728r(motionEvent);
        return true;
    }

    /* renamed from: s */
    public boolean mo9815s(@NonNull View view) {
        return true;
    }
}

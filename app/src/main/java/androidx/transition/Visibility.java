package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.AnimatorUtils;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {

    /* renamed from: D */
    public static final String[] f6355D = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: C */
    public int f6356C = 3;

    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener, AnimatorUtils.AnimatorPauseListenerCompat {

        /* renamed from: a */
        public final View f6361a;

        /* renamed from: b */
        public final int f6362b;

        /* renamed from: c */
        public final ViewGroup f6363c;

        /* renamed from: d */
        public final boolean f6364d;

        /* renamed from: e */
        public boolean f6365e;

        /* renamed from: f */
        public boolean f6366f = false;

        public DisappearListener(View view, int i2, boolean z) {
            this.f6361a = view;
            this.f6362b = i2;
            this.f6363c = (ViewGroup) view.getParent();
            this.f6364d = z;
            m4289g(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: a */
        public void mo4211a(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: b */
        public void mo4191b(@NonNull Transition transition) {
            m4289g(false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: c */
        public void mo4192c(@NonNull Transition transition) {
            m4288f();
            transition.mo4255z(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: d */
        public void mo4193d(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: e */
        public void mo4194e(@NonNull Transition transition) {
            m4289g(true);
        }

        /* renamed from: f */
        public final void m4288f() {
            if (!this.f6366f) {
                ViewUtils.f6341a.mo4282g(this.f6361a, this.f6362b);
                ViewGroup viewGroup = this.f6363c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m4289g(false);
        }

        /* renamed from: g */
        public final void m4289g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f6364d || this.f6365e == z || (viewGroup = this.f6363c) == null) {
                return;
            }
            this.f6365e = z;
            ViewGroupUtils.m4271a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6366f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m4288f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f6366f) {
                return;
            }
            ViewUtils.f6341a.mo4282g(this.f6361a, this.f6362b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f6366f) {
                return;
            }
            ViewUtils.f6341a.mo4282g(this.f6361a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    public static class VisibilityInfo {

        /* renamed from: a */
        public boolean f6367a;

        /* renamed from: b */
        public boolean f6368b;

        /* renamed from: c */
        public int f6369c;

        /* renamed from: d */
        public int f6370d;

        /* renamed from: e */
        public ViewGroup f6371e;

        /* renamed from: f */
        public ViewGroup f6372f;
    }

    /* renamed from: O */
    public final void m4283O(TransitionValues transitionValues) {
        transitionValues.f6317a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f6318b.getVisibility()));
        transitionValues.f6317a.put("android:visibility:parent", transitionValues.f6318b.getParent());
        int[] iArr = new int[2];
        transitionValues.f6318b.getLocationOnScreen(iArr);
        transitionValues.f6317a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: P */
    public final VisibilityInfo m4284P(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.f6367a = false;
        visibilityInfo.f6368b = false;
        if (transitionValues == null || !transitionValues.f6317a.containsKey("android:visibility:visibility")) {
            visibilityInfo.f6369c = -1;
            visibilityInfo.f6371e = null;
        } else {
            visibilityInfo.f6369c = ((Integer) transitionValues.f6317a.get("android:visibility:visibility")).intValue();
            visibilityInfo.f6371e = (ViewGroup) transitionValues.f6317a.get("android:visibility:parent");
        }
        if (transitionValues2 == null || !transitionValues2.f6317a.containsKey("android:visibility:visibility")) {
            visibilityInfo.f6370d = -1;
            visibilityInfo.f6372f = null;
        } else {
            visibilityInfo.f6370d = ((Integer) transitionValues2.f6317a.get("android:visibility:visibility")).intValue();
            visibilityInfo.f6372f = (ViewGroup) transitionValues2.f6317a.get("android:visibility:parent");
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i2 = visibilityInfo.f6369c;
            int i3 = visibilityInfo.f6370d;
            if (i2 == i3 && visibilityInfo.f6371e == visibilityInfo.f6372f) {
                return visibilityInfo;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    visibilityInfo.f6368b = false;
                    visibilityInfo.f6367a = true;
                } else if (i3 == 0) {
                    visibilityInfo.f6368b = true;
                    visibilityInfo.f6367a = true;
                }
            } else if (visibilityInfo.f6372f == null) {
                visibilityInfo.f6368b = false;
                visibilityInfo.f6367a = true;
            } else if (visibilityInfo.f6371e == null) {
                visibilityInfo.f6368b = true;
                visibilityInfo.f6367a = true;
            }
        } else if (transitionValues == null && visibilityInfo.f6370d == 0) {
            visibilityInfo.f6368b = true;
            visibilityInfo.f6367a = true;
        } else if (transitionValues2 == null && visibilityInfo.f6369c == 0) {
            visibilityInfo.f6368b = false;
            visibilityInfo.f6367a = true;
        }
        return visibilityInfo;
    }

    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    @Nullable
    /* renamed from: R */
    public Animator mo4285R(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        if ((this.f6356C & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.f6318b.getParent();
            if (m4284P(m4250r(view, false), m4251u(view, false)).f6367a) {
                return null;
            }
        }
        return mo4204Q(viewGroup, transitionValues2.f6318b, transitionValues, transitionValues2);
    }

    @Nullable
    /* renamed from: S */
    public Animator mo4205S(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b1, code lost:
    
        if (r0.f6279p != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
    @androidx.annotation.Nullable
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator mo4286T(final android.view.ViewGroup r20, androidx.transition.TransitionValues r21, int r22, androidx.transition.TransitionValues r23, int r24) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo4286T(android.view.ViewGroup, androidx.transition.TransitionValues, int, androidx.transition.TransitionValues, int):android.animation.Animator");
    }

    /* renamed from: U */
    public void m4287U(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f6356C = i2;
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        VisibilityInfo m4284P = m4284P(transitionValues, transitionValues2);
        if (!m4284P.f6367a) {
            return null;
        }
        if (m4284P.f6371e == null && m4284P.f6372f == null) {
            return null;
        }
        return m4284P.f6368b ? mo4285R(viewGroup, transitionValues, m4284P.f6369c, transitionValues2, m4284P.f6370d) : mo4286T(viewGroup, transitionValues, m4284P.f6369c, transitionValues2, m4284P.f6370d);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: t */
    public String[] mo4190t() {
        return f6355D;
    }

    @Override // androidx.transition.Transition
    /* renamed from: v */
    public boolean mo4252v(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f6317a.containsKey("android:visibility:visibility") != transitionValues.f6317a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo m4284P = m4284P(transitionValues, transitionValues2);
        if (m4284P.f6367a) {
            return m4284P.f6369c == 0 || m4284P.f6370d == 0;
        }
        return false;
    }
}

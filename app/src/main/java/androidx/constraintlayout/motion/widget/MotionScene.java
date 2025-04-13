package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

/* loaded from: classes.dex */
public class MotionScene {

    /* renamed from: a */
    public Transition f2650a;

    /* renamed from: b */
    public int f2651b;

    /* renamed from: c */
    public boolean f2652c;

    public static class Transition {

        /* renamed from: a */
        public int f2654a;

        /* renamed from: b */
        public int f2655b;

        /* renamed from: c */
        public int f2656c;

        /* renamed from: d */
        public String f2657d;

        /* renamed from: e */
        public int f2658e;

        /* renamed from: f */
        public boolean f2659f;

        /* renamed from: g */
        public int f2660g;

        public static class TransitionOnClick implements View.OnClickListener {
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                throw null;
            }
        }

        /* renamed from: a */
        public boolean m1410a(int i2) {
            return (i2 & 0) != 0;
        }
    }

    /* renamed from: a */
    public int m1406a() {
        Transition transition = this.f2650a;
        return transition != null ? transition.f2658e : this.f2651b;
    }

    /* renamed from: b */
    public int m1407b() {
        Transition transition = this.f2650a;
        if (transition == null) {
            return -1;
        }
        return transition.f2654a;
    }

    /* renamed from: c */
    public Interpolator m1408c() {
        Transition transition = this.f2650a;
        int i2 = transition.f2656c;
        if (i2 == -2) {
            throw null;
        }
        if (i2 == -1) {
            final Easing m1217b = Easing.m1217b(transition.f2657d);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f2) {
                    return (float) Easing.this.mo1218a(f2);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: d */
    public void m1409d(int i2, int i3) {
        Transition transition = this.f2650a;
        if (transition == null || transition.f2654a != i3 || transition.f2655b != i2) {
            throw null;
        }
    }
}

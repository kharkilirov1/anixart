package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ViewTransition {

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransition$1 */
    class InterpolatorC02051 implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f2665a;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            return (float) this.f2665a.mo1218a(f2);
        }
    }

    public static class Animate {
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ViewTransition(");
        m24u.append(Debug.m1388b(null, 0));
        m24u.append(")");
        return m24u.toString();
    }
}

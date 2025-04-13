package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MotionController {

    /* renamed from: a */
    public MotionPaths f2560a;

    /* renamed from: b */
    public MotionPaths f2561b;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionController$1 */
    class InterpolatorC01961 implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f2562a;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            return (float) this.f2562a.mo1218a(f2);
        }
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u(" start: x: ");
        m24u.append(this.f2560a.f2639d);
        m24u.append(" y: ");
        m24u.append(this.f2560a.f2640e);
        m24u.append(" end: x: ");
        m24u.append(this.f2561b.f2639d);
        m24u.append(" y: ");
        m24u.append(this.f2561b.f2640e);
        return m24u.toString();
    }
}

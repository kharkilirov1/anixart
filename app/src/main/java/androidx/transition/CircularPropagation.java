package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class CircularPropagation extends VisibilityPropagation {
    @Override // androidx.transition.TransitionPropagation
    /* renamed from: c */
    public long mo4202c(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int round;
        int i3;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || m4291e(transitionValues) == 0) {
            i2 = -1;
        } else {
            transitionValues = transitionValues2;
            i2 = 1;
        }
        int m4290d = VisibilityPropagation.m4290d(transitionValues, 0);
        int m4290d2 = VisibilityPropagation.m4290d(transitionValues, 1);
        Rect m4249q = transition.m4249q();
        if (m4249q != null) {
            i3 = m4249q.centerX();
            round = m4249q.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            i3 = round2;
        }
        float f2 = i3 - m4290d;
        float f3 = round - m4290d2;
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j2 = transition.f6267d;
        if (j2 < 0) {
            j2 = 300;
        }
        return Math.round(((j2 * i2) / 3.0f) * sqrt2);
    }
}

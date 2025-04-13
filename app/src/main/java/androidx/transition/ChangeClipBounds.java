package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: C */
    public static final String[] f6163C = {"android:clipBounds:clip"};

    /* renamed from: O */
    public final void m4195O(TransitionValues transitionValues) {
        View view = transitionValues.f6318b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect m2217p = ViewCompat.m2217p(view);
        transitionValues.f6317a.put("android:clipBounds:clip", m2217p);
        if (m2217p == null) {
            transitionValues.f6317a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4195O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4195O(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        ObjectAnimator objectAnimator = null;
        if (transitionValues != null && transitionValues2 != null && transitionValues.f6317a.containsKey("android:clipBounds:clip") && transitionValues2.f6317a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) transitionValues.f6317a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) transitionValues2.f6317a.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) transitionValues.f6317a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) transitionValues2.f6317a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            ViewCompat.m2210l0(transitionValues2.f6318b, rect);
            objectAnimator = ObjectAnimator.ofObject(transitionValues2.f6318b, (Property<View, V>) ViewUtils.f6343c, (TypeEvaluator) new RectEvaluator(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                final View view = transitionValues2.f6318b;
                objectAnimator.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.transition.ChangeClipBounds.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ViewCompat.m2210l0(view, null);
                    }
                });
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: t */
    public String[] mo4190t() {
        return f6163C;
    }
}

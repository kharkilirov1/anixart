package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class ChangeScroll extends Transition {

    /* renamed from: C */
    public static final String[] f6169C = {"android:changeScroll:x", "android:changeScroll:y"};

    /* renamed from: O */
    public final void m4197O(TransitionValues transitionValues) {
        transitionValues.f6317a.put("android:changeScroll:x", Integer.valueOf(transitionValues.f6318b.getScrollX()));
        transitionValues.f6317a.put("android:changeScroll:y", Integer.valueOf(transitionValues.f6318b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4197O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4197O(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.f6318b;
        int intValue = ((Integer) transitionValues.f6317a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) transitionValues2.f6317a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) transitionValues.f6317a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) transitionValues2.f6317a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return TransitionUtils.m4269a(objectAnimator, objectAnimator2);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: t */
    public String[] mo4190t() {
        return f6169C;
    }
}

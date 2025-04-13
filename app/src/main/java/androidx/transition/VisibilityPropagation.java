package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
public abstract class VisibilityPropagation extends TransitionPropagation {

    /* renamed from: a */
    public static final String[] f6373a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    public static int m4290d(TransitionValues transitionValues, int i2) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.f6317a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i2];
    }

    @Override // androidx.transition.TransitionPropagation
    /* renamed from: a */
    public void mo4261a(TransitionValues transitionValues) {
        View view = transitionValues.f6318b;
        Integer num = (Integer) transitionValues.f6317a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        transitionValues.f6317a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {Math.round(view.getTranslationX()) + r4, 0};
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        iArr[0] = (view.getWidth() / 2) + iArr[0];
        iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = (view.getHeight() / 2) + iArr[1];
        transitionValues.f6317a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.TransitionPropagation
    /* renamed from: b */
    public String[] mo4262b() {
        return f6373a;
    }

    /* renamed from: e */
    public int m4291e(TransitionValues transitionValues) {
        Integer num;
        if (transitionValues == null || (num = (Integer) transitionValues.f6317a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }
}

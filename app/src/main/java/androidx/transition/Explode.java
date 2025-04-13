package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class Explode extends Visibility {

    /* renamed from: F */
    public static final TimeInterpolator f6200F = new DecelerateInterpolator();

    /* renamed from: G */
    public static final TimeInterpolator f6201G = new AccelerateInterpolator();

    /* renamed from: E */
    public int[] f6202E = new int[2];

    public Explode() {
        this.f6286w = new CircularPropagation();
    }

    /* renamed from: O */
    private void m4203O(TransitionValues transitionValues) {
        View view = transitionValues.f6318b;
        view.getLocationOnScreen(this.f6202E);
        int[] iArr = this.f6202E;
        int i2 = iArr[0];
        int i3 = iArr[1];
        transitionValues.f6317a.put("android:explode:screenBounds", new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3));
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Rect rect = (Rect) transitionValues2.f6317a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m4206V(viewGroup, rect, this.f6202E);
        int[] iArr = this.f6202E;
        return TranslationAnimationCreator.m4270a(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f6200F, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f2;
        float f3;
        Rect rect = (Rect) transitionValues.f6317a.get("android:explode:screenBounds");
        int i2 = rect.left;
        int i3 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.f6318b.getTag(C2507R.id.transition_position);
        if (iArr != null) {
            f2 = (iArr[0] - rect.left) + translationX;
            f3 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f3 = translationY;
        }
        m4206V(viewGroup, rect, this.f6202E);
        int[] iArr2 = this.f6202E;
        return TranslationAnimationCreator.m4270a(view, transitionValues, i2, i3, translationX, translationY, f2 + iArr2[0], f3 + iArr2[1], f6201G, this);
    }

    /* renamed from: V */
    public final void m4206V(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.f6202E);
        int[] iArr2 = this.f6202E;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect m4249q = m4249q();
        if (m4249q == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i2;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i3;
        } else {
            centerX = m4249q.centerX();
            centerY = m4249q.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i4 = centerX - i2;
        int i5 = centerY - i3;
        float max = Math.max(i4, view.getWidth() - i4);
        float max2 = Math.max(i5, view.getHeight() - i5);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
        m4203O(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
        m4203O(transitionValues);
    }
}

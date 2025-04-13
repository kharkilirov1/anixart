package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.mobile.ads.C4632R;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f19317c;

    /* renamed from: d */
    public final RectF f19318d;

    /* renamed from: e */
    public final RectF f19319e;

    /* renamed from: f */
    public final int[] f19320f;

    /* renamed from: g */
    public float f19321g;

    /* renamed from: h */
    public float f19322h;

    public static class FabTransformationSpec {

        /* renamed from: a */
        @Nullable
        public MotionSpec f19330a;

        /* renamed from: b */
        public Positioning f19331b;
    }

    public FabTransformationBehavior() {
        this.f19317c = new Rect();
        this.f19318d = new RectF();
        this.f19319e = new RectF();
        this.f19320f = new int[2];
    }

    /* renamed from: A */
    public abstract FabTransformationSpec mo10569A(Context context, boolean z);

    @Nullable
    /* renamed from: B */
    public final ViewGroup m10570B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    /* renamed from: b */
    public boolean mo1493b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    /* renamed from: c */
    public void mo1494c(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.f3077h == 0) {
            layoutParams.f3077h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03ae A[LOOP:0: B:41:0x03ac->B:42:0x03ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @androidx.annotation.NonNull
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.AnimatorSet mo10568u(@androidx.annotation.NonNull final android.view.View r27, @androidx.annotation.NonNull final android.view.View r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo10568u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    @NonNull
    /* renamed from: v */
    public final Pair<MotionTiming, MotionTiming> m10571v(float f2, float f3, boolean z, @NonNull FabTransformationSpec fabTransformationSpec) {
        MotionTiming m9746d;
        MotionTiming m9746d2;
        if (f2 == 0.0f || f3 == 0.0f) {
            m9746d = fabTransformationSpec.f19330a.m9746d("translationXLinear");
            m9746d2 = fabTransformationSpec.f19330a.m9746d("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            m9746d = fabTransformationSpec.f19330a.m9746d("translationXCurveDownwards");
            m9746d2 = fabTransformationSpec.f19330a.m9746d("translationYCurveDownwards");
        } else {
            m9746d = fabTransformationSpec.f19330a.m9746d("translationXCurveUpwards");
            m9746d2 = fabTransformationSpec.f19330a.m9746d("translationYCurveUpwards");
        }
        return new Pair<>(m9746d, m9746d2);
    }

    /* renamed from: w */
    public final float m10572w(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float centerX;
        float centerX2;
        RectF rectF = this.f19318d;
        RectF rectF2 = this.f19319e;
        m10575z(view, rectF);
        rectF.offset(this.f19321g, this.f19322h);
        m10575z(view2, rectF2);
        float f2 = 0.0f;
        int i2 = positioning.f17361a & 7;
        if (i2 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else {
            if (i2 != 3) {
                if (i2 == 5) {
                    centerX = rectF2.right;
                    centerX2 = rectF.right;
                }
                return f2 + positioning.f17362b;
            }
            centerX = rectF2.left;
            centerX2 = rectF.left;
        }
        f2 = centerX - centerX2;
        return f2 + positioning.f17362b;
    }

    /* renamed from: x */
    public final float m10573x(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float centerY;
        float centerY2;
        float f2;
        RectF rectF = this.f19318d;
        RectF rectF2 = this.f19319e;
        m10575z(view, rectF);
        rectF.offset(this.f19321g, this.f19322h);
        m10575z(view2, rectF2);
        int i2 = positioning.f17361a & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i2 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i2 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + positioning.f17363c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f2 = centerY - centerY2;
        return f2 + positioning.f17363c;
    }

    /* renamed from: y */
    public final float m10574y(@NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, float f2, float f3) {
        long j2 = motionTiming.f17356a;
        long j3 = motionTiming.f17357b;
        MotionTiming m9746d = fabTransformationSpec.f19330a.m9746d("expansion");
        return AnimationUtils.m9737a(f2, f3, motionTiming.m9748b().getInterpolation((((m9746d.f17356a + m9746d.f17357b) + 17) - j2) / j3));
    }

    /* renamed from: z */
    public final void m10575z(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f19320f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19317c = new Rect();
        this.f19318d = new RectF();
        this.f19319e = new RectF();
        this.f19320f = new int[2];
    }
}

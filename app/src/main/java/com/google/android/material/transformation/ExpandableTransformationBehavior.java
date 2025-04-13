package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    @Nullable
    public AnimatorSet f19315b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    /* renamed from: t */
    public boolean mo10567t(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f19315b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo10568u = mo10568u(view, view2, z, z3);
        this.f19315b = mo10568u;
        mo10568u.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f19315b = null;
            }
        });
        this.f19315b.start();
        if (!z2) {
            this.f19315b.end();
        }
        return true;
    }

    @NonNull
    /* renamed from: u */
    public abstract AnimatorSet mo10568u(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

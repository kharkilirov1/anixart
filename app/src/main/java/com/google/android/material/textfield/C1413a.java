package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1413a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f19154a;

    /* renamed from: b */
    public final /* synthetic */ Object f19155b;

    public /* synthetic */ C1413a(EndIconDelegate endIconDelegate, int i2) {
        this.f19154a = i2;
        this.f19155b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19154a) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19155b;
                Objects.requireNonNull(clearTextEndIconDelegate);
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                clearTextEndIconDelegate.f19019d.setScaleX(floatValue);
                clearTextEndIconDelegate.f19019d.setScaleY(floatValue);
                break;
            case 1:
                ClearTextEndIconDelegate clearTextEndIconDelegate2 = (ClearTextEndIconDelegate) this.f19155b;
                Objects.requireNonNull(clearTextEndIconDelegate2);
                clearTextEndIconDelegate2.f19019d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19155b;
                Objects.requireNonNull(dropdownMenuEndIconDelegate);
                dropdownMenuEndIconDelegate.f19019d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.util.Property;
import androidx.annotation.CallSuper;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class BaseMotionStrategy implements MotionStrategy {

    /* renamed from: com.google.android.material.floatingactionbutton.BaseMotionStrategy$1 */
    class C12961 extends Property<ExtendedFloatingActionButton, Float> {

        /* renamed from: a */
        public final /* synthetic */ BaseMotionStrategy f18083a;

        @Override // android.util.Property
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            ColorStateList colorStateList = extendedFloatingActionButton2.f18110y;
            extendedFloatingActionButton2.getDrawableState();
            Objects.requireNonNull(this.f18083a);
            throw null;
        }

        @Override // android.util.Property
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f2) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            ColorStateList colorStateList = extendedFloatingActionButton2.f18110y;
            extendedFloatingActionButton2.getDrawableState();
            Objects.requireNonNull(this.f18083a);
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    /* renamed from: a */
    public void mo10049a() {
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    /* renamed from: b */
    public void mo10050b() {
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @CallSuper
    public void onAnimationStart(Animator animator) {
        throw null;
    }
}

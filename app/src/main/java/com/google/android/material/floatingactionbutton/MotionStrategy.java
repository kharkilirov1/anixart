package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.Nullable;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes.dex */
interface MotionStrategy {
    /* renamed from: a */
    void mo10049a();

    /* renamed from: b */
    void mo10050b();

    /* renamed from: c */
    void mo10053c(@Nullable ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void onAnimationStart(Animator animator);
}

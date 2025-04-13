package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* renamed from: a */
    public IndeterminateDrawable f18547a;

    /* renamed from: b */
    public final float[] f18548b;

    /* renamed from: c */
    public final int[] f18549c;

    public IndeterminateAnimatorDelegate(int i2) {
        this.f18548b = new float[i2 * 2];
        this.f18549c = new int[i2];
    }

    /* renamed from: a */
    public abstract void mo10217a();

    /* renamed from: b */
    public float m10233b(int i2, int i3, int i4) {
        return (i2 - i3) / i4;
    }

    /* renamed from: c */
    public abstract void mo10218c();

    /* renamed from: d */
    public abstract void mo10219d(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    /* renamed from: e */
    public abstract void mo10220e();

    /* renamed from: f */
    public abstract void mo10221f();

    /* renamed from: g */
    public abstract void mo10222g();
}

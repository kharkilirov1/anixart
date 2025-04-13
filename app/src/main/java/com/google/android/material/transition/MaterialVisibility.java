package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: E */
    public final P f19437E;

    /* renamed from: F */
    @Nullable
    public VisibilityAnimatorProvider f19438F;

    /* renamed from: G */
    public final List<VisibilityAnimatorProvider> f19439G = new ArrayList();

    public MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f19437E = p;
        this.f19438F = visibilityAnimatorProvider;
    }

    /* renamed from: V */
    public static void m10596V(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator mo10579a = z ? visibilityAnimatorProvider.mo10579a(viewGroup, view) : visibilityAnimatorProvider.mo10580b(viewGroup, view);
        if (mo10579a != null) {
            list.add(mo10579a);
        }
    }

    @Override // androidx.transition.Visibility
    /* renamed from: Q */
    public Animator mo4204Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m10597W(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: S */
    public Animator mo4205S(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m10597W(viewGroup, view, false);
    }

    /* renamed from: W */
    public final Animator m10597W(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m10596V(arrayList, this.f19437E, viewGroup, view, z);
        m10596V(arrayList, this.f19438F, viewGroup, view, z);
        Iterator<VisibilityAnimatorProvider> it = this.f19439G.iterator();
        while (it.hasNext()) {
            m10596V(arrayList, it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        TransitionUtils.m10605g(this, context, mo10594Y(z));
        int mo10595Z = mo10595Z(z);
        TimeInterpolator mo10593X = mo10593X(z);
        if (mo10595Z != 0 && this.f6268e == null) {
            mo4231I(MotionUtils.m10185d(context, mo10595Z, mo10593X));
        }
        AnimatorSetCompat.m9740a(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    /* renamed from: X */
    public TimeInterpolator mo10593X(boolean z) {
        return AnimationUtils.f17343b;
    }

    @AttrRes
    /* renamed from: Y */
    public int mo10594Y(boolean z) {
        return 0;
    }

    @AttrRes
    /* renamed from: Z */
    public int mo10595Z(boolean z) {
        return 0;
    }
}

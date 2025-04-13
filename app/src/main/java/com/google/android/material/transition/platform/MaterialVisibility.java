package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi
/* loaded from: classes.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: b */
    public final P f19568b;

    /* renamed from: c */
    @Nullable
    public VisibilityAnimatorProvider f19569c;

    /* renamed from: d */
    public final List<VisibilityAnimatorProvider> f19570d = new ArrayList();

    public MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f19568b = p;
        this.f19569c = visibilityAnimatorProvider;
    }

    /* renamed from: a */
    public static void m10630a(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator mo10611a = z ? visibilityAnimatorProvider.mo10611a(viewGroup, view) : visibilityAnimatorProvider.mo10612b(viewGroup, view);
        if (mo10611a != null) {
            list.add(mo10611a);
        }
    }

    /* renamed from: b */
    public final Animator m10631b(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m10630a(arrayList, this.f19568b, viewGroup, view, z);
        m10630a(arrayList, this.f19569c, viewGroup, view, z);
        Iterator<VisibilityAnimatorProvider> it = this.f19570d.iterator();
        while (it.hasNext()) {
            m10630a(arrayList, it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        TransitionUtils.m10639g(this, context, mo10628d(z));
        TransitionUtils.m10640h(this, context, mo10629e(z), mo10627c(z));
        AnimatorSetCompat.m9740a(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo10627c(boolean z) {
        return AnimationUtils.f17343b;
    }

    @AttrRes
    /* renamed from: d */
    public int mo10628d(boolean z) {
        return 0;
    }

    @AttrRes
    /* renamed from: e */
    public int mo10629e(boolean z) {
        return 0;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m10631b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m10631b(viewGroup, view, false);
    }
}

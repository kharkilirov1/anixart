package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class ViewTransition<R> implements Transition<R> {

    /* renamed from: a */
    public final ViewTransitionAnimationFactory f8825a = null;

    public interface ViewTransitionAnimationFactory {
        /* renamed from: a */
        Animation mo5327a(Context context);
    }

    public ViewTransition(ViewTransitionAnimationFactory viewTransitionAnimationFactory) {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    /* renamed from: a */
    public boolean mo5326a(R r, Transition.ViewAdapter viewAdapter) {
        View view = viewAdapter.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f8825a.mo5327a(view.getContext()));
        return false;
    }
}

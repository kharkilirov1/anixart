package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.ViewTransition;

/* loaded from: classes.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public Transition<R> f8822a;

    public static class ConcreteViewTransitionAnimationFactory implements ViewTransition.ViewTransitionAnimationFactory {
        @Override // com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory
        /* renamed from: a */
        public Animation mo5327a(Context context) {
            return null;
        }
    }

    public static class ResourceViewTransitionAnimationFactory implements ViewTransition.ViewTransitionAnimationFactory {
        @Override // com.bumptech.glide.request.transition.ViewTransition.ViewTransitionAnimationFactory
        /* renamed from: a */
        public Animation mo5327a(Context context) {
            return AnimationUtils.loadAnimation(context, 0);
        }
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    /* renamed from: a */
    public Transition<R> mo5324a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return NoTransition.f8820a;
        }
        if (this.f8822a == null) {
            this.f8822a = new ViewTransition(null);
        }
        return this.f8822a;
    }
}

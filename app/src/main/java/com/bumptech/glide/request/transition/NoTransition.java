package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class NoTransition<R> implements Transition<R> {

    /* renamed from: a */
    public static final NoTransition<?> f8820a = new NoTransition<>();

    /* renamed from: b */
    public static final TransitionFactory<?> f8821b = new NoAnimationFactory();

    public static class NoAnimationFactory<R> implements TransitionFactory<R> {
        @Override // com.bumptech.glide.request.transition.TransitionFactory
        /* renamed from: a */
        public Transition<R> mo5324a(DataSource dataSource, boolean z) {
            return NoTransition.f8820a;
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition
    /* renamed from: a */
    public boolean mo5326a(Object obj, Transition.ViewAdapter viewAdapter) {
        return false;
    }
}

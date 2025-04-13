package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public class ViewPropertyAnimationFactory<R> implements TransitionFactory<R> {

    /* renamed from: a */
    public ViewPropertyTransition<R> f8823a;

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    /* renamed from: a */
    public Transition<R> mo5324a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return NoTransition.f8820a;
        }
        if (this.f8823a == null) {
            this.f8823a = new ViewPropertyTransition<>(null);
        }
        return this.f8823a;
    }
}

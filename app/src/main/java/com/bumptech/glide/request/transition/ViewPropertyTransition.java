package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class ViewPropertyTransition<R> implements Transition<R> {

    /* renamed from: a */
    public final Animator f8824a = null;

    public interface Animator {
        /* renamed from: a */
        void m5328a(View view);
    }

    public ViewPropertyTransition(Animator animator) {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    /* renamed from: a */
    public boolean mo5326a(R r, Transition.ViewAdapter viewAdapter) {
        if (viewAdapter.getView() == null) {
            return false;
        }
        this.f8824a.m5328a(viewAdapter.getView());
        return false;
    }
}

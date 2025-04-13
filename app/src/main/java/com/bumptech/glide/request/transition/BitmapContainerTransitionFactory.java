package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    public final class BitmapGlideAnimation implements Transition<R> {

        /* renamed from: a */
        public final Transition<Drawable> f8812a;

        /* renamed from: b */
        public final /* synthetic */ BitmapContainerTransitionFactory f8813b;

        @Override // com.bumptech.glide.request.transition.Transition
        /* renamed from: a */
        public boolean mo5326a(R r, Transition.ViewAdapter viewAdapter) {
            return this.f8812a.mo5326a(new BitmapDrawable(viewAdapter.getView().getResources(), this.f8813b.mo5325b(r)), viewAdapter);
        }
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    /* renamed from: a */
    public Transition<R> mo5324a(DataSource dataSource, boolean z) {
        throw null;
    }

    /* renamed from: b */
    public abstract Bitmap mo5325b(R r);
}

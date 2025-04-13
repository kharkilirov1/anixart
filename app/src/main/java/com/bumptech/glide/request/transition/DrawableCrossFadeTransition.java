package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {

    /* renamed from: a */
    public final int f8818a;

    /* renamed from: b */
    public final boolean f8819b;

    public DrawableCrossFadeTransition(int i2, boolean z) {
        this.f8818a = i2;
        this.f8819b = z;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    /* renamed from: a */
    public boolean mo5326a(Drawable drawable, Transition.ViewAdapter viewAdapter) {
        Drawable drawable2 = drawable;
        Drawable mo5317h = viewAdapter.mo5317h();
        if (mo5317h == null) {
            mo5317h = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo5317h, drawable2});
        transitionDrawable.setCrossFadeEnabled(this.f8819b);
        transitionDrawable.startTransition(this.f8818a);
        viewAdapter.mo5316e(transitionDrawable);
        return true;
    }
}

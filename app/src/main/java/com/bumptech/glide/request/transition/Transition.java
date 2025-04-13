package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface Transition<R> {

    public interface ViewAdapter {
        /* renamed from: e */
        void mo5316e(Drawable drawable);

        View getView();

        @Nullable
        /* renamed from: h */
        Drawable mo5317h();
    }

    /* renamed from: a */
    boolean mo5326a(R r, ViewAdapter viewAdapter);
}

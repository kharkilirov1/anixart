package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {

    /* renamed from: a */
    public final int f8814a;

    /* renamed from: b */
    public final boolean f8815b;

    /* renamed from: c */
    public DrawableCrossFadeTransition f8816c;

    public static class Builder {

        /* renamed from: a */
        public final int f8817a = 300;
    }

    public DrawableCrossFadeFactory(int i2, boolean z) {
        this.f8814a = i2;
        this.f8815b = z;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    /* renamed from: a */
    public Transition<Drawable> mo5324a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return NoTransition.f8820a;
        }
        if (this.f8816c == null) {
            this.f8816c = new DrawableCrossFadeTransition(this.f8814a, this.f8815b);
        }
        return this.f8816c;
    }
}

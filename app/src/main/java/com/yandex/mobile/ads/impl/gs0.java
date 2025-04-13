package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class gs0 extends Animation {

    /* renamed from: a */
    @NonNull
    private final WeakReference<ProgressBar> f50726a;

    /* renamed from: b */
    private final int f50727b;

    /* renamed from: c */
    private final int f50728c;

    public gs0(@NonNull ProgressBar progressBar, int i2, int i3) {
        setInterpolator(new LinearInterpolator());
        this.f50726a = new WeakReference<>(progressBar);
        this.f50727b = i2;
        this.f50728c = i3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, @Nullable Transformation transformation) {
        ProgressBar progressBar = this.f50726a.get();
        if (progressBar != null) {
            super.applyTransformation(f2, transformation);
            progressBar.setProgress(Math.round(((this.f50728c - r5) * f2) + this.f50727b));
        }
    }
}

package com.bumptech.glide.util;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {

    /* renamed from: b */
    public int[] f8854b;

    public static final class SizeViewTarget extends ViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: c */
        public void mo4877c(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    /* renamed from: e */
    public void mo5302e(int i2, int i3) {
        this.f8854b = new int[]{i2, i3};
    }
}

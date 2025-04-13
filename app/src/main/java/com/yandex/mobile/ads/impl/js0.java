package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class js0 {

    /* renamed from: a */
    @NonNull
    private final C6084yo f51726a = new C6084yo();

    @NonNull
    /* renamed from: a */
    public final ProgressBar m25937a(@NonNull Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.m1671d(context, C4632R.drawable.yandex_ads_video_progress_bar_background));
        Objects.requireNonNull(this.f51726a);
        int round = Math.round(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(round, round);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }
}

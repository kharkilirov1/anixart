package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* loaded from: classes3.dex */
final class pv0 {

    /* renamed from: a */
    @NonNull
    private final C6084yo f53865a = new C6084yo();

    @NonNull
    /* renamed from: a */
    public final Button m27573a(@NonNull Context context) {
        Button button = new Button(context);
        button.setBackground(ContextCompat.m1671d(context, C4632R.drawable.yandex_ads_video_ic_replay));
        Objects.requireNonNull(this.f53865a);
        int round = Math.round(TypedValue.applyDimension(1, 90.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(round, round);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }
}

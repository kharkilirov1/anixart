package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.ou */
/* loaded from: classes3.dex */
public final class C5551ou {

    /* renamed from: a */
    @NonNull
    private final Context f53327a;

    public C5551ou(@NonNull Context context) {
        this.f53327a = context;
    }

    @NonNull
    /* renamed from: a */
    public final ImageView m27111a(int i2, int i3) {
        ImageView imageView = new ImageView(this.f53327a);
        int m28652a = tg1.m28652a(this.f53327a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m28652a, m28652a);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = i2;
        layoutParams.topMargin = i3;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}

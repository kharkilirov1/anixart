package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

@SuppressLint
/* loaded from: classes3.dex */
public final class te1 extends FrameLayout {

    /* renamed from: a */
    @NonNull
    private final ProgressBar f55102a;

    public te1(@NonNull Context context, @NonNull ProgressBar progressBar) {
        super(context);
        this.f55102a = progressBar;
    }

    @NonNull
    /* renamed from: a */
    public final ProgressBar m28645a() {
        return this.f55102a;
    }
}

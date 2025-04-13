package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ue1 {

    /* renamed from: a */
    @NonNull
    private final js0 f55486a = new js0();

    @NonNull
    /* renamed from: a */
    public final te1 m28986a(@NonNull Context context) {
        ProgressBar m25937a = this.f55486a.m25937a(context);
        m25937a.setVisibility(8);
        te1 te1Var = new te1(context, m25937a);
        te1Var.addView(m25937a);
        te1Var.setBackgroundColor(-16777216);
        return te1Var;
    }
}

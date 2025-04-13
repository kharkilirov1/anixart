package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class vl0 {

    /* renamed from: a */
    @NonNull
    private final C5720s f55832a = new C5720s();

    /* renamed from: b */
    @NonNull
    private final ue1 f55833b = new ue1();

    @NonNull
    /* renamed from: a */
    public final sl0 m29234a(@NonNull Context context, @NonNull qe1 qe1Var, @LayoutRes int i2) {
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        rk0 m28033a = this.f55832a.m28033a(context, qe1Var, i2);
        m28033a.setVisibility(8);
        te1 m28986a = this.f55833b.m28986a(context);
        m28986a.setVisibility(8);
        sl0 sl0Var = new sl0(context, m28986a, textureView, m28033a);
        sl0Var.addView(m28986a);
        sl0Var.addView(textureView);
        sl0Var.addView(m28033a);
        return sl0Var;
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* loaded from: classes3.dex */
public final class xh1 {

    /* renamed from: a */
    private final int f56473a;

    /* renamed from: b */
    private final int f56474b;

    public xh1(int i2, int i3) {
        this.f56473a = i2;
        this.f56474b = i3;
    }

    /* renamed from: a */
    public final void m29752a(@NonNull View view, boolean z) {
        view.setBackground(ContextCompat.m1671d(view.getContext(), z ? this.f56473a : this.f56474b));
    }
}

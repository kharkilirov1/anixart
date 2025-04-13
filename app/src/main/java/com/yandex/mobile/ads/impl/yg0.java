package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class yg0 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final h50 f56839a;

    /* renamed from: b */
    @NonNull
    private final C5162h4 f56840b;

    /* renamed from: c */
    @NonNull
    private final q40 f56841c;

    /* renamed from: d */
    @Nullable
    private final xg0 f56842d;

    public yg0(@NonNull h50 h50Var, @NonNull C5162h4 c5162h4, @NonNull q40 q40Var, @Nullable xg0 xg0Var) {
        this.f56839a = h50Var;
        this.f56840b = c5162h4;
        this.f56841c = q40Var;
        this.f56842d = xg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = !(this.f56839a.getVolume() == 0.0f);
        this.f56840b.m25049a(this.f56841c.m27612a(), z);
        xg0 xg0Var = this.f56842d;
        if (xg0Var != null) {
            xg0Var.setMuted(z);
        }
    }
}

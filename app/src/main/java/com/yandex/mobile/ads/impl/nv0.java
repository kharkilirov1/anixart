package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class nv0 {

    /* renamed from: a */
    @NonNull
    private final pv0 f53095a = new pv0();

    @NonNull
    /* renamed from: a */
    public final lv0 m26959a(@NonNull Context context) {
        Button m27573a = this.f53095a.m27573a(context);
        m27573a.setVisibility(8);
        lv0 lv0Var = new lv0(context, m27573a);
        lv0Var.addView(m27573a);
        return lv0Var;
    }
}

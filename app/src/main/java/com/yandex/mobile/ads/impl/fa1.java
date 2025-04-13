package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class fa1 {

    /* renamed from: a */
    @NonNull
    private final C5726s4 f50193a;

    public fa1(@NonNull pa1 pa1Var) {
        this.f50193a = new C5726s4(pa1Var.m27198a());
    }

    @NonNull
    /* renamed from: a */
    public final String m24379a() {
        String m28067c = this.f50193a.m28067c();
        return TextUtils.isEmpty(m28067c) ? "undefined" : m28067c;
    }

    @NonNull
    /* renamed from: b */
    public final String m24380b() {
        String m28068d = this.f50193a.m28068d();
        return TextUtils.isEmpty(m28068d) ? "undefined" : m28068d;
    }
}

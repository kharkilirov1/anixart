package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class b31 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final d31 f48752a;

    /* renamed from: b */
    @NonNull
    private final k91 f48753b = new k91();

    public b31(@NonNull d31 d31Var) {
        this.f48752a = d31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        this.f48753b.m26091a(view.getContext(), this.f48752a.m23798a());
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class cg1 {

    /* renamed from: a */
    @NonNull
    private final ag1 f49241a;

    public cg1(@NonNull ag1 ag1Var) {
        this.f49241a = ag1Var;
    }

    /* renamed from: a */
    public final boolean m23259a() {
        View view = this.f49241a.getView();
        return (view == null || tg1.m28660d(view) || !tg1.m28655a(view, 50)) ? false : true;
    }
}

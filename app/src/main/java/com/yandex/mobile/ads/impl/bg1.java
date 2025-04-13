package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class bg1 {

    /* renamed from: a */
    @NonNull
    private final ag1 f48868a;

    public bg1(@NonNull ag1 ag1Var) {
        this.f48868a = ag1Var;
    }

    /* renamed from: a */
    public final boolean m22815a() {
        View view = this.f48868a.getView();
        return (view == null || tg1.m28660d(view) || tg1.m28657b(view) < 1) ? false : true;
    }
}

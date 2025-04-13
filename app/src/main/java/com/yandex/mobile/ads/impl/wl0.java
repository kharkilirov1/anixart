package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class wl0 implements ag1 {

    /* renamed from: a */
    @NonNull
    private final zf1 f56157a;

    public wl0(@NonNull zf1 zf1Var) {
        this.f56157a = zf1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    @NonNull
    /* renamed from: a */
    public final List<fc1> mo22500a() {
        return Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    @Nullable
    public final View getView() {
        return this.f56157a.m23881b();
    }
}

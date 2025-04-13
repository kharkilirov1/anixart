package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class y50 implements ag1 {

    /* renamed from: a */
    @NonNull
    private final i40 f56669a;

    public y50(@NonNull i40 i40Var) {
        this.f56669a = i40Var;
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    @NonNull
    /* renamed from: a */
    public final List<fc1> mo22500a() {
        h40 m25440a = this.f56669a.m25440a();
        return m25440a != null ? m25440a.m25050a() : Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.ag1
    @Nullable
    public final View getView() {
        h40 m25440a = this.f56669a.m25440a();
        if (m25440a != null) {
            return m25440a.m25051b();
        }
        return null;
    }
}

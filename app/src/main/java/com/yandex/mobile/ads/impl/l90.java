package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class l90 {

    /* renamed from: a */
    @NonNull
    private final Context f52314a;

    /* renamed from: b */
    @NonNull
    private final C5898v1 f52315b;

    public l90(@NonNull Context context, @NonNull l50 l50Var) {
        this.f52314a = context.getApplicationContext();
        this.f52315b = new C5898v1(l50Var.getAdBreaks());
    }

    @NonNull
    /* renamed from: a */
    public final k90 m26398a(@NonNull m50 m50Var) {
        return new k90(this.f52314a, m50Var, this.f52315b);
    }
}

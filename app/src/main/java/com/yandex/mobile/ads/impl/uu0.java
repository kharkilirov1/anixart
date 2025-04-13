package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class uu0 {

    /* renamed from: a */
    @NonNull
    private final Context f55687a;

    /* renamed from: b */
    @NonNull
    private final C6034xo f55688b = new C6034xo();

    public uu0(@NonNull Context context) {
        this.f55687a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public final lb0 m29139a() {
        return C5782t5.m28464a(3, this.f55688b.m29779a(this.f55687a)) ? new lb0(1920, 1080, 6800) : new lb0(854, 480, 1000);
    }
}

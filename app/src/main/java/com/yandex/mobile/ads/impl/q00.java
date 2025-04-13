package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class q00 {

    /* renamed from: a */
    @NonNull
    private final oe0 f53881a;

    /* renamed from: b */
    @NonNull
    private final my0 f53882b;

    /* renamed from: c */
    @NonNull
    private final Context f53883c;

    public q00(@NonNull Context context, @NonNull ny0 ny0Var) {
        this.f53882b = ny0Var;
        this.f53883c = context.getApplicationContext();
        this.f53881a = r00.m27802a(context);
    }

    @NonNull
    /* renamed from: a */
    public final s00 m27590a() {
        return new s00(this.f53883c, this.f53881a.m27082a(this.f53882b.mo26779a(this.f53883c)));
    }
}

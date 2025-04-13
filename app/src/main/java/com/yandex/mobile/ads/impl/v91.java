package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v91 {

    /* renamed from: a */
    @NonNull
    private final Context f55785a;

    /* renamed from: b */
    @NonNull
    private final z91 f55786b;

    /* renamed from: c */
    @NonNull
    private final xz0 f55787c = xz0.m29823b();

    /* renamed from: d */
    @NonNull
    private final nb1 f55788d = new nb1();

    /* renamed from: e */
    @NonNull
    private final u91 f55789e = new u91();

    public v91(@NonNull Context context) {
        this.f55785a = context.getApplicationContext();
        this.f55786b = new z91(context);
    }

    /* renamed from: a */
    public final void m29200a() {
        nb1 nb1Var = this.f55788d;
        Context context = this.f55785a;
        Objects.requireNonNull(nb1Var);
        if (C5474n6.m26806a(context) && this.f55787c.m29836h() && this.f55789e.m28916a(this.f55785a)) {
            this.f55786b.m30078a();
        }
    }
}

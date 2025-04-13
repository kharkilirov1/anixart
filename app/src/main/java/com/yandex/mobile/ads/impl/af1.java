package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;

/* loaded from: classes3.dex */
public final class af1 {

    /* renamed from: a */
    @NonNull
    private final vv0 f48514a;

    /* renamed from: b */
    @NonNull
    private final yc1 f48515b;

    public af1(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f48514a = C5730s8.m28078a(context);
        this.f48515b = new yc1(c5101g2, adResponse);
    }

    /* renamed from: a */
    public final void m22483a(@Nullable String str) {
        tv0 tv0Var = new tv0(this.f48515b.mo22529a());
        tv0Var.m28761b(str, "error_message");
        this.f48514a.mo23876a(new sv0(sv0.EnumC5764b.f54850r.m28361a(), tv0Var.m28756a()));
    }
}

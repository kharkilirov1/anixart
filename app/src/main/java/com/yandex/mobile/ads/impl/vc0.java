package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vc0<T extends C6164a> {

    /* renamed from: a */
    @NonNull
    private final T f55801a;

    /* renamed from: b */
    @NonNull
    private final qd0 f55802b;

    /* renamed from: c */
    @NonNull
    private final gd0 f55803c;

    public vc0(@NonNull T t, @NonNull qd0 qd0Var, @NonNull gd0 gd0Var) {
        this.f55801a = t;
        this.f55802b = qd0Var;
        this.f55803c = gd0Var;
    }

    @NonNull
    /* renamed from: a */
    public final T m29212a() {
        return this.f55801a;
    }

    @NonNull
    /* renamed from: b */
    public final qd0 m29214b() {
        return this.f55802b;
    }

    @NonNull
    /* renamed from: c */
    public final Map<String, String> m29215c() {
        gd0 gd0Var = this.f55803c;
        qd0 qd0Var = this.f55802b;
        Objects.requireNonNull(gd0Var);
        return qd0Var.m27680g();
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, Object> m29213a(@NonNull Context context) {
        return this.f55803c.mo24843a(context);
    }
}

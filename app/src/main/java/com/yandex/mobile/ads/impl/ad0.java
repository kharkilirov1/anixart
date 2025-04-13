package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.List;

/* loaded from: classes3.dex */
public final class ad0<T extends C6164a> {

    /* renamed from: a */
    @NonNull
    private final List<qd0> f48488a;

    /* renamed from: b */
    @NonNull
    private final gd0 f48489b;

    /* renamed from: c */
    @NonNull
    private final cd0<T> f48490c;

    /* renamed from: d */
    private int f48491d;

    public ad0(@NonNull List<qd0> list, @NonNull gd0 gd0Var, @NonNull ed0 ed0Var) {
        this.f48488a = list;
        this.f48489b = gd0Var;
        this.f48490c = new cd0<>(ed0Var);
    }

    @Nullable
    /* renamed from: a */
    public final vc0<T> m22465a(@NonNull Context context, @NonNull Class<T> cls) {
        vc0<T> vc0Var = null;
        while (vc0Var == null && this.f48491d < this.f48488a.size()) {
            List<qd0> list = this.f48488a;
            int i2 = this.f48491d;
            this.f48491d = i2 + 1;
            qd0 qd0Var = list.get(i2);
            T m23226a = this.f48490c.m23226a(context, qd0Var, cls);
            if (m23226a != null) {
                vc0Var = new vc0<>(m23226a, qd0Var, this.f48489b);
            }
        }
        return vc0Var;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class lz0 implements jw0<cz0> {

    /* renamed from: a */
    @NonNull
    private final Context f52550a;

    /* renamed from: e */
    @NonNull
    private final oz0 f52554e = new oz0();

    /* renamed from: b */
    @NonNull
    private final fz0 f52551b = new fz0();

    /* renamed from: c */
    @NonNull
    private final a01 f52552c = new a01();

    /* renamed from: d */
    @NonNull
    private final C5288jk f52553d = new C5288jk();

    public lz0(@NonNull Context context) {
        this.f52550a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    @Nullable
    /* renamed from: a */
    public final cz0 mo25992a(@NonNull km0 km0Var) {
        return (cz0) this.f52554e.m27131a(km0Var);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    /* renamed from: a */
    public final boolean mo25993a() {
        cz0 m29824a = xz0.m29823b().m29824a(this.f52550a);
        if (m29824a != null && !this.f52551b.m24759a(m29824a)) {
            Objects.requireNonNull(this.f52552c);
            if (!a01.m22357a(m29824a)) {
                Objects.requireNonNull(this.f52553d);
                if (!(xz0.m29823b().m29835g() != m29824a.m23589a0())) {
                    Objects.requireNonNull(this.f52553d);
                    if (!(Boolean.valueOf(xz0.m29823b().m29834f()).booleanValue() != m29824a.m23575N())) {
                        Objects.requireNonNull(this.f52553d);
                        if (!(xz0.m29823b().m29831d() != m29824a.m23611t())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

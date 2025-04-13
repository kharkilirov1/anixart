package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.j6 */
/* loaded from: classes3.dex */
public final class C5272j6 {

    /* renamed from: a */
    @NonNull
    private final i71 f51519a = new i71();

    @NonNull
    /* renamed from: a */
    public final zl0 m25804a(kh0 kh0Var) {
        qi0 m26128c = kh0Var.m26128c();
        List<C5276ja<?>> m27732b = m26128c.m27732b();
        i71 i71Var = this.f51519a;
        List<v01> m27741h = m26128c.m27741h();
        Objects.requireNonNull(i71Var);
        ArrayList m25456a = i71.m25456a(null, m27741h);
        i71 i71Var2 = this.f51519a;
        List<String> m27739f = m26128c.m27739f();
        Objects.requireNonNull(i71Var2);
        return new zl0(m27732b, m25456a, i71.m25456a(null, m27739f), "ad_unit", null);
    }
}

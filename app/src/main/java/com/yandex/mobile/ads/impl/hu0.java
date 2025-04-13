package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class hu0 {

    /* renamed from: a */
    @NonNull
    private final xy0 f51137a;

    /* renamed from: b */
    @NonNull
    private final C5898v1 f51138b;

    public hu0(@NonNull xy0 xy0Var, @NonNull C5898v1 c5898v1) {
        this.f51137a = xy0Var;
        this.f51138b = c5898v1;
    }

    @Nullable
    /* renamed from: a */
    public final m50 m25373a(long j2) {
        Iterator it = this.f51137a.m29821a().iterator();
        while (it.hasNext()) {
            fr0 fr0Var = (fr0) it.next();
            m50 m24725a = fr0Var.m24725a();
            boolean z = Math.abs(fr0Var.m24726b() - j2) < 200;
            EnumC5832u1 m29165a = this.f51138b.m29165a(m24725a);
            if (z && EnumC5832u1.f55319c.equals(m29165a)) {
                return m24725a;
            }
        }
        return null;
    }
}

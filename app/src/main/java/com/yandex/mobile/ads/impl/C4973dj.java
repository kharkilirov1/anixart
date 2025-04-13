package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5029ej;
import com.yandex.mobile.ads.impl.EnumC6028xi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dj */
/* loaded from: classes3.dex */
public final class C4973dj implements w71 {
    /* renamed from: b */
    private static AbstractC5029ej m23895b(p80 p80Var, EnumC6028xi enumC6028xi) {
        AbstractC5029ej bVar;
        String m29754b = enumC6028xi.m29754b();
        try {
            int ordinal = enumC6028xi.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Integer valueOf = Integer.valueOf(p80Var.mo27189b(-1, m29754b));
                    if (!(valueOf.intValue() != -1)) {
                        valueOf = null;
                    }
                    bVar = new AbstractC5029ej.c(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
                } else if (ordinal == 2) {
                    bVar = new AbstractC5029ej.a(p80Var.mo27189b(-1, m29754b) != -1);
                } else if (ordinal == 3) {
                    bVar = new AbstractC5029ej.d(p80Var.mo27190b(m29754b));
                } else {
                    if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new AbstractC5029ej.e(p80Var.mo27190b(m29754b));
                }
            } else {
                bVar = new AbstractC5029ej.b(p80Var.mo27190b(m29754b));
            }
            return bVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w71
    @Nullable
    /* renamed from: a */
    public final AbstractC5029ej mo23292a(@NotNull p80 localStorage, @NotNull String key) {
        Intrinsics.m32179h(localStorage, "localStorage");
        Intrinsics.m32179h(key, "key");
        if (!localStorage.contains(key)) {
            key = null;
        }
        EnumC6028xi m29756b = key != null ? EnumC6028xi.a.m29756b(key) : null;
        if (m29756b != null) {
            return m23895b(localStorage, m29756b);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.w71
    @Nullable
    /* renamed from: a */
    public final AbstractC5029ej mo23291a(@NotNull p80 localStorage, @NotNull EnumC6028xi type) {
        Intrinsics.m32179h(localStorage, "localStorage");
        Intrinsics.m32179h(type, "type");
        if (!localStorage.contains(type.m29754b())) {
            type = null;
        }
        if (type != null) {
            return m23895b(localStorage, type);
        }
        return null;
    }
}

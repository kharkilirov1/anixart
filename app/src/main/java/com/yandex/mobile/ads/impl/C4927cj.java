package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5029ej;
import com.yandex.mobile.ads.impl.EnumC6028xi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cj */
/* loaded from: classes3.dex */
public final class C4927cj implements w71 {
    /* renamed from: b */
    private static AbstractC5029ej m23290b(p80 p80Var, EnumC6028xi enumC6028xi) {
        String m29753a = enumC6028xi.m29753a();
        try {
            int ordinal = enumC6028xi.ordinal();
            if (ordinal == 0) {
                return new AbstractC5029ej.b(p80Var.mo27190b(m29753a));
            }
            if (ordinal == 1) {
                return new AbstractC5029ej.c(p80Var.mo27190b(m29753a));
            }
            if (ordinal == 2) {
                return new AbstractC5029ej.a(p80Var.getBoolean(m29753a, false));
            }
            if (ordinal == 3) {
                return new AbstractC5029ej.d(p80Var.mo27190b(m29753a));
            }
            if (ordinal == 4) {
                return new AbstractC5029ej.e(p80Var.mo27190b(m29753a));
            }
            throw new NoWhenBranchMatchedException();
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
        EnumC6028xi m29755a = key != null ? EnumC6028xi.a.m29755a(key) : null;
        if (m29755a != null) {
            return m23290b(localStorage, m29755a);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.w71
    @Nullable
    /* renamed from: a */
    public final AbstractC5029ej mo23291a(@NotNull p80 localStorage, @NotNull EnumC6028xi type) {
        Intrinsics.m32179h(localStorage, "localStorage");
        Intrinsics.m32179h(type, "type");
        if (!localStorage.contains(type.m29753a())) {
            type = null;
        }
        if (type != null) {
            return m23290b(localStorage, type);
        }
        return null;
    }
}

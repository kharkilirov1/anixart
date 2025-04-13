package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jr */
/* loaded from: classes3.dex */
public final class C5299jr {

    /* renamed from: a */
    @NotNull
    private final m41 f51717a = new m41();

    @NotNull
    /* renamed from: a */
    public final String m25933a(@NotNull Context context, @NotNull String rawQuery) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(rawQuery, "rawQuery");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a == null || !m29824a.m23564C()) {
            return rawQuery;
        }
        Objects.requireNonNull(this.f51717a);
        String m26568a = m41.m26568a(context, rawQuery);
        return m26568a == null ? rawQuery : m26568a;
    }
}

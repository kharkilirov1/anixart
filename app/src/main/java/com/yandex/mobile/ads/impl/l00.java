package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l00 {
    @JvmStatic
    /* renamed from: a */
    public static final void m26308a(@NotNull Context context, @NotNull HashMap headers) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(headers, "headers");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a == null || !m29824a.m23564C()) {
            return;
        }
        String m25753a = j00.m25753a(45);
        Intrinsics.m32178g(m25753a, "ENCRYPTED_REQUEST.key");
        headers.put(m25753a, "1");
    }
}

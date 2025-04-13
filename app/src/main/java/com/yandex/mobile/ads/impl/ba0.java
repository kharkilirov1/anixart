package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ba0 {
    @NotNull
    /* renamed from: a */
    public static String m22754a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.m32178g(uuid, "randomUUID().toString()");
        String lowerCase = StringsKt.m33891Q(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}

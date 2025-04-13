package com.yandex.mobile.ads.impl;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wy */
/* loaded from: classes3.dex */
public final class C5996wy {

    /* renamed from: a */
    @NotNull
    private static final Regex f56287a = new Regex("(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]");

    /* renamed from: a */
    public static boolean m29585a(@Nullable String str) {
        if (str != null) {
            return f56287a.m33872d(str);
        }
        return false;
    }
}

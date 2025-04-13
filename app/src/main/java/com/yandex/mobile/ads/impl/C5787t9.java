package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t9 */
/* loaded from: classes3.dex */
public final class C5787t9 {
    /* renamed from: a */
    public static boolean m28481a(@NotNull C5571p9 appMetricaIdentifiers) {
        Intrinsics.m32179h(appMetricaIdentifiers, "appMetricaIdentifiers");
        return m28482a(appMetricaIdentifiers.m27193c()) && m28482a(appMetricaIdentifiers.m27191a()) && m28482a(appMetricaIdentifiers.m27192b());
    }

    /* renamed from: a */
    private static boolean m28482a(String str) {
        return !(str == null || str.length() == 0);
    }
}

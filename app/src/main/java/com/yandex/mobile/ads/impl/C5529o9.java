package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IIdentifierCallback;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o9 */
/* loaded from: classes3.dex */
public final class C5529o9 {

    /* renamed from: a */
    @Deprecated
    @NotNull
    private static final Map<IIdentifierCallback.Reason, String> f53226a = MapsKt.m32064i(new Pair(IIdentifierCallback.Reason.NETWORK, "Network error"), new Pair(IIdentifierCallback.Reason.INVALID_RESPONSE, "Invalid response"), new Pair(IIdentifierCallback.Reason.UNKNOWN, "Unknown"));

    @NotNull
    /* renamed from: a */
    public static String m27056a(@Nullable IIdentifierCallback.Reason reason) {
        String str = f53226a.get(reason);
        return str == null ? "Unknown" : str;
    }
}

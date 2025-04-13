package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.MediationData;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jp0 {

    /* renamed from: a */
    @Nullable
    private final String f51685a;

    /* renamed from: b */
    @NotNull
    private final MediationData f51686b;

    public jp0(@Nullable String str, @NotNull MediationData mediationData) {
        Intrinsics.m32179h(mediationData, "mediationData");
        this.f51685a = str;
        this.f51686b = mediationData;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m25928a() {
        String str = this.f51685a;
        if (str == null || str.length() == 0) {
            Map<String, String> m21925d = this.f51686b.m21925d();
            Intrinsics.m32178g(m21925d, "mediationData.passbackParameters");
            return m21925d;
        }
        Map<String, String> m21925d2 = this.f51686b.m21925d();
        Intrinsics.m32178g(m21925d2, "mediationData.passbackParameters");
        return MapsKt.m32066k(m21925d2, MapsKt.m32063h(new Pair("adf-resp_time", this.f51685a)));
    }
}

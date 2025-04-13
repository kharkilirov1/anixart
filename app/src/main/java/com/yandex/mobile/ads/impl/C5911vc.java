package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vc */
/* loaded from: classes3.dex */
public final class C5911vc {
    @NotNull
    /* renamed from: a */
    public static InterfaceC6070yc m29211a(@NotNull AdResponse adResponse) {
        Intrinsics.m32179h(adResponse, "adResponse");
        MediationData m21836z = adResponse.m21836z();
        return m21836z != null ? new fd0(adResponse, m21836z) : EnumC5870uk.f55549b == adResponse.m21832v() ? new fl1() : new fk1();
    }
}

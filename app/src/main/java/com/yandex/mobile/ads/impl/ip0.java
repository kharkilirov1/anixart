package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ip0 implements d91 {

    /* renamed from: a */
    @NotNull
    private final jp0 f51356a;

    /* renamed from: b */
    @NotNull
    private final C5299jr f51357b;

    public ip0(@NotNull jp0 passbackUrlParametersProvider) {
        Intrinsics.m32179h(passbackUrlParametersProvider, "passbackUrlParametersProvider");
        this.f51356a = passbackUrlParametersProvider;
        this.f51357b = new C5299jr();
    }

    @Override // com.yandex.mobile.ads.impl.d91
    @NotNull
    /* renamed from: a */
    public final int mo23843a() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.d91
    @Nullable
    /* renamed from: a */
    public final String mo23845a(@NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        return C5605pu.m27381a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.d91
    @NotNull
    /* renamed from: a */
    public final String mo23844a(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull l01 sensitiveModeChecker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(sensitiveModeChecker, "sensitiveModeChecker");
        String m27470a = C5605pu.m27378a(context, adConfiguration, sensitiveModeChecker).m27467a(this.f51356a.m25928a()).m27470a();
        Intrinsics.m32178g(m27470a, "configureFetchUrlBuilder…ers)\n            .build()");
        return this.f51357b.m25933a(context, m27470a);
    }
}

package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.t6 */
/* loaded from: classes3.dex */
public final class C5783t6 implements xp0 {

    /* renamed from: a */
    @NonNull
    private final sv0.EnumC5765c f54955a;

    /* renamed from: b */
    @Nullable
    private final String f54956b;

    public C5783t6(@NonNull sv0.EnumC5765c enumC5765c, @Nullable String str) {
        this.f54955a = enumC5765c;
        this.f54956b = str;
    }

    @Override // com.yandex.mobile.ads.impl.xp0
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo26828a(long j2) {
        tv0 tv0Var = new tv0(new HashMap());
        tv0Var.m28761b(this.f54956b, "adapter");
        tv0Var.m28761b(this.f54955a.m28362a(), "status");
        tv0Var.m28761b(Long.valueOf(j2), "duration");
        return tv0Var.m28756a();
    }
}

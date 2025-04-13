package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class na1 implements xp0 {

    /* renamed from: a */
    @NotNull
    private final String f52891a;

    /* renamed from: b */
    @Nullable
    private final ac1 f52892b;

    public na1(@NotNull String responseStatus, @Nullable ac1 ac1Var) {
        Intrinsics.m32179h(responseStatus, "responseStatus");
        this.f52891a = responseStatus;
        this.f52892b = ac1Var;
    }

    @Override // com.yandex.mobile.ads.impl.xp0
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo26828a(long j2) {
        Map<String, Object> m32065j = MapsKt.m32065j(new Pair("duration", Long.valueOf(j2)), new Pair("status", this.f52891a));
        ac1 ac1Var = this.f52892b;
        if (ac1Var != null) {
            String m22463c = ac1Var.m22463c();
            Intrinsics.m32178g(m22463c, "videoAdError.description");
            m32065j.put("failure_reason", m22463c);
        }
        return m32065j;
    }
}

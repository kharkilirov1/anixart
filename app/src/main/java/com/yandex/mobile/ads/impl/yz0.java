package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yz0 implements n91 {

    /* renamed from: a */
    @NotNull
    private final p91 f56983a;

    public yz0(@NotNull p91 userAgentFormatter) {
        Intrinsics.m32179h(userAgentFormatter, "userAgentFormatter");
        this.f56983a = userAgentFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.n91
    @NotNull
    /* renamed from: a */
    public final String mo26035a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56983a.m27196b());
        Objects.requireNonNull(this.f56983a);
        sb.append(p91.m27195a());
        return sb.toString();
    }
}

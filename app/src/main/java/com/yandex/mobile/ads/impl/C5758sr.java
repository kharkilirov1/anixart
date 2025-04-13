package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sr */
/* loaded from: classes3.dex */
public final class C5758sr {

    /* renamed from: a */
    @NotNull
    private final Set<String> f54805a = SetsKt.m32079f("sysconst-update");

    /* renamed from: a */
    public final boolean m28352a(@NotNull String param) {
        Intrinsics.m32179h(param, "param");
        return !this.f54805a.contains(param);
    }
}

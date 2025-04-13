package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oz0 {

    /* renamed from: a */
    @NotNull
    private final dx0<cz0> f53357a;

    /* renamed from: b */
    @NotNull
    private final sh1 f53358b;

    public oz0() {
        this(0);
    }

    public oz0(@NotNull dx0<cz0> sdkConfigurationResponseParser, @NotNull sh1 volleyMapper) {
        Intrinsics.m32179h(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        Intrinsics.m32179h(volleyMapper, "volleyMapper");
        this.f53357a = sdkConfigurationResponseParser;
        this.f53358b = volleyMapper;
    }

    /* renamed from: a */
    public final Object m27131a(km0 networkResponse) {
        Intrinsics.m32179h(networkResponse, "networkResponse");
        Objects.requireNonNull(this.f53358b);
        return this.f53357a.mo23954a(sh1.m28251a(networkResponse));
    }

    public /* synthetic */ oz0(int i2) {
        this(im0.m25566a(), new sh1());
    }
}

package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class th1 {

    /* renamed from: a */
    @NotNull
    private final sh1 f55123a;

    /* renamed from: b */
    @NotNull
    private final mm0 f55124b;

    public th1(@NotNull sh1 volleyMapper, @NotNull mm0 networkResponseDecoder) {
        Intrinsics.m32179h(volleyMapper, "volleyMapper");
        Intrinsics.m32179h(networkResponseDecoder, "networkResponseDecoder");
        this.f55123a = volleyMapper;
        this.f55124b = networkResponseDecoder;
    }

    @Nullable
    /* renamed from: a */
    public final String m28663a(@NotNull km0 networkResponse) {
        Intrinsics.m32179h(networkResponse, "networkResponse");
        Objects.requireNonNull(this.f55123a);
        return this.f55124b.mo26691a(sh1.m28251a(networkResponse));
    }
}

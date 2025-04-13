package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yw0<T> implements xw0<T> {

    /* renamed from: a */
    @NotNull
    private final wh1<T> f56931a;

    /* renamed from: b */
    @NotNull
    private final sh1 f56932b;

    public yw0(@NotNull wh1<T> responseBodyParser, @NotNull sh1 volleyMapper) {
        Intrinsics.m32179h(responseBodyParser, "responseBodyParser");
        Intrinsics.m32179h(volleyMapper, "volleyMapper");
        this.f56931a = responseBodyParser;
        this.f56932b = volleyMapper;
    }

    @Override // com.yandex.mobile.ads.impl.xw0
    @Nullable
    /* renamed from: a */
    public final T mo29814a(@NotNull sw0 networkResponse) {
        Intrinsics.m32179h(networkResponse, "networkResponse");
        Objects.requireNonNull(this.f56932b);
        return this.f56931a.mo25010a(sh1.m28250a(networkResponse));
    }

    public /* synthetic */ yw0(wh1 wh1Var) {
        this(wh1Var, new sh1());
    }
}

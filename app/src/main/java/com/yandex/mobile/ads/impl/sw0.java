package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sw0 {

    /* renamed from: a */
    private final int f54866a;

    /* renamed from: b */
    @NotNull
    private final ww0 f54867b;

    /* renamed from: c */
    @NotNull
    private final Map<String, String> f54868c;

    public sw0(int i2, @NotNull ww0 body, @NotNull Map<String, String> headers) {
        Intrinsics.m32179h(body, "body");
        Intrinsics.m32179h(headers, "headers");
        this.f54866a = i2;
        this.f54867b = body;
        this.f54868c = headers;
    }

    @NotNull
    /* renamed from: a */
    public final ww0 m28364a() {
        return this.f54867b;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m28365b() {
        return this.f54868c;
    }

    /* renamed from: c */
    public final int m28366c() {
        return this.f54866a;
    }
}

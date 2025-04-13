package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u90 {

    /* renamed from: a */
    @NotNull
    private final C5932vo f55426a;

    public u90() {
        this(0);
    }

    public u90(@NotNull C5932vo deviceInfoProvider) {
        Intrinsics.m32179h(deviceInfoProvider, "deviceInfoProvider");
        this.f55426a = deviceInfoProvider;
    }

    /* renamed from: a */
    public final boolean m28915a() {
        Objects.requireNonNull(this.f55426a);
        return StringsKt.m33927y("Xiaomi", C5932vo.m29243a(), true);
    }

    public /* synthetic */ u90(int i2) {
        this(new C5932vo());
    }
}

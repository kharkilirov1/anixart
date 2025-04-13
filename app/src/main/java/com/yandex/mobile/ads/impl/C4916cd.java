package com.yandex.mobile.ads.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cd */
/* loaded from: classes3.dex */
public final class C4916cd {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final InterfaceC4860bd m23224a(@NotNull EnumC5224id bannerSizeCalculationType) {
        Intrinsics.m32179h(bannerSizeCalculationType, "bannerSizeCalculationType");
        int ordinal = bannerSizeCalculationType.ordinal();
        if (ordinal == 0) {
            return new C5342kk();
        }
        if (ordinal == 1) {
            return new au0();
        }
        if (ordinal == 2) {
            return new yy0();
        }
        if (ordinal == 3) {
            return new zy0();
        }
        throw new NoWhenBranchMatchedException();
    }
}

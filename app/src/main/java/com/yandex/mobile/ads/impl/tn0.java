package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fc1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tn0 {
    @NotNull
    /* renamed from: a */
    public static EnumC6043xv m28693a(@NotNull fc1.EnumC5072a purpose) {
        Intrinsics.m32179h(purpose, "purpose");
        int ordinal = purpose.ordinal();
        if (ordinal == 0) {
            return EnumC6043xv.f56574a;
        }
        if (ordinal == 1) {
            return EnumC6043xv.f56575b;
        }
        if (ordinal == 2) {
            return EnumC6043xv.f56576c;
        }
        if (ordinal == 3) {
            return EnumC6043xv.f56577d;
        }
        throw new NoWhenBranchMatchedException();
    }
}

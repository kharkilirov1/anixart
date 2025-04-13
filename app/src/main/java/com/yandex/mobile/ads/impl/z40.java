package com.yandex.mobile.ads.impl;

import androidx.annotation.LayoutRes;
import com.yandex.mobile.ads.C4632R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z40 {
    @LayoutRes
    /* renamed from: a */
    public static int m30053a(@NotNull u40 instreamDesign) {
        Intrinsics.m32179h(instreamDesign, "instreamDesign");
        int ordinal = instreamDesign.ordinal();
        if (ordinal == 0) {
            return C4632R.layout.yandex_ads_internal_instream_skin_v1;
        }
        if (ordinal == 1) {
            return C4632R.layout.yandex_ads_internal_instream_skin_v2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.div2.C3033a;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r2 */
/* loaded from: classes3.dex */
public final class C5667r2 {
    @JvmStatic
    /* renamed from: a */
    public static final void m27824a(@NotNull String adType, @NotNull ArrayList errors) {
        Intrinsics.m32179h(adType, "adType");
        Intrinsics.m32179h(errors, "errors");
        if (!errors.isEmpty()) {
            e60.m24034a(C3033a.m17745g(new Object[]{adType, CollectionsKt.m31989B(errors, "\n - ", "\n - ", null, 0, null, null, 60, null)}, 2, "Found following errors for %s ad type: %s", "format(this, *args)"), new Object[0]);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m27823a(@NotNull String adConfigurationInfo) {
        Intrinsics.m32179h(adConfigurationInfo, "adConfigurationInfo");
        e60.m24036b(C3033a.m17745g(new Object[]{adConfigurationInfo}, 1, "Ad type %s was integrated successfully", "format(this, *args)"), new Object[0]);
    }
}

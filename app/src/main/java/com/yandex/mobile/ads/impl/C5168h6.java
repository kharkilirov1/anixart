package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.h6 */
/* loaded from: classes3.dex */
public final class C5168h6 {

    /* renamed from: a */
    @Nullable
    private String f50855a;

    @Nullable
    /* renamed from: a */
    public final String m25066a() {
        return this.f50855a;
    }

    /* renamed from: a */
    public final void m25067a(@Nullable String str) {
        if (str == null || StringsKt.m33879E(str)) {
            e60.m24037c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = this.f50855a;
        if (str2 == null || Intrinsics.m32174c(str2, str)) {
            this.f50855a = str;
        } else {
            e60.m24037c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}

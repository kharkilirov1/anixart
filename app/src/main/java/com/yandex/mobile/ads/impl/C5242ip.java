package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ip */
/* loaded from: classes3.dex */
final class C5242ip {
    @Nullable
    /* renamed from: a */
    public static DivExtension m25586a(@NonNull DivBase divBase) {
        List<DivExtension> mo17580n = divBase.mo17580n();
        if (mo17580n == null) {
            return null;
        }
        for (DivExtension divExtension : mo17580n) {
            if ("view".equals(divExtension.f35661a)) {
                return divExtension;
            }
        }
        return null;
    }
}

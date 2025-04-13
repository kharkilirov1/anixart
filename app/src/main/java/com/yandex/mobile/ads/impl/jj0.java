package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class jj0 {
    /* renamed from: a */
    public static long m25897a(@NonNull AdResponse adResponse) {
        EnumC5007e6 m21824n = adResponse.m21824n();
        Long m21831u = adResponse.m21831u();
        if (m21831u == null) {
            m21831u = m21824n == EnumC5007e6.f49818d ? 5000L : 0L;
        }
        return m21831u.longValue();
    }
}

package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.e50;

@MainThread
/* loaded from: classes3.dex */
public final class MobileInstreamAds {
    private MobileInstreamAds() {
    }

    public static void setAdGroupPreloading(boolean z) {
        e50.m24007a().m24008a(z);
    }

    public static void setControlsEnabled(boolean z) {
        e50.m24007a().m24009b(z);
    }

    public static void setDiscardAdGroupOnSkip(boolean z) {
        e50.m24007a().m24011c(z);
    }
}

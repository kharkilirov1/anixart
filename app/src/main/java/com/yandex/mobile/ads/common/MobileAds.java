package com.yandex.mobile.ads.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.impl.C5223ic;
import com.yandex.mobile.ads.impl.e60;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.ot0;
import com.yandex.mobile.ads.impl.qe0;
import com.yandex.mobile.ads.impl.xz0;

/* loaded from: classes2.dex */
public final class MobileAds {
    public static void enableDebugErrorIndicator(boolean z) {
        xz0.m29823b().m29827a(z);
    }

    public static void enableLogging(boolean z) {
        ot0.m27109a(z);
        e60.m24035a(z);
    }

    public static String getLibraryVersion() {
        return BuildConfigFieldProvider.getVersion();
    }

    public static void initialize(@NonNull Context context, @NonNull InitializationListener initializationListener) {
        if (new C5223ic().m25522a()) {
            return;
        }
        new h90(context).m25094a();
        qe0.m27707b().m27710a(context, initializationListener);
    }

    public static void setAgeRestrictedUser(boolean z) {
        xz0.m29823b().m29828b(z);
    }

    public static void setLocationConsent(boolean z) {
        xz0.m29823b().m29830c(z);
    }

    public static void setUserConsent(boolean z) {
        xz0.m29823b().m29832d(z);
    }

    public static void setVideoPoolSize(int i2) {
        xz0.m29823b().m29825a(i2);
    }
}

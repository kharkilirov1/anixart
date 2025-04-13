package com.yandex.mobile.ads.impl;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.mobile.ads.impl.e6 */
/* loaded from: classes3.dex */
public enum EnumC5007e6 {
    f49816b("banner"),
    f49817c("interstitial"),
    f49818d("rewarded"),
    f49819e(PluginErrorDetails.Platform.NATIVE),
    f49820f("vastvideo"),
    f49821g("instream"),
    f49822h("appopenad");


    /* renamed from: a */
    private final String f49824a;

    EnumC5007e6(String str) {
        this.f49824a = str;
    }

    /* renamed from: a */
    public final String m24033a() {
        return this.f49824a;
    }

    /* renamed from: a */
    public static EnumC5007e6 m24032a(String str) {
        for (EnumC5007e6 enumC5007e6 : values()) {
            if (enumC5007e6.f49824a.equals(str)) {
                return enumC5007e6;
            }
        }
        return null;
    }
}

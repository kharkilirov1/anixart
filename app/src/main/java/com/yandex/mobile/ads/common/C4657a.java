package com.yandex.mobile.ads.common;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.common.a */
/* loaded from: classes2.dex */
public final class C4657a {
    @NotNull
    /* renamed from: a */
    public static AdRequest m21968a(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.m32179h(adRequestConfiguration, "adRequestConfiguration");
        String m21950b = adRequestConfiguration.m21950b();
        String m21954f = adRequestConfiguration.m21954f();
        String m21952d = adRequestConfiguration.m21952d();
        List<String> m21953e = adRequestConfiguration.m21953e();
        Location m21955g = adRequestConfiguration.m21955g();
        Map<String, String> m21956h = adRequestConfiguration.m21956h();
        String m21951c = adRequestConfiguration.m21951c();
        AdTheme m21957i = adRequestConfiguration.m21957i();
        AdRequest.Builder builder = new AdRequest.Builder();
        boolean z = false;
        if ((m21950b == null || (StringsKt.m33879E(m21950b) ^ true)) ? false : true) {
            builder = builder.setAge(m21950b);
            Intrinsics.m32178g(builder, "builder.setAge(age)");
        }
        if (m21954f != null && !(!StringsKt.m33879E(m21954f))) {
            z = true;
        }
        if (z) {
            builder = builder.setGender(m21954f);
            Intrinsics.m32178g(builder, "builder.setGender(gender)");
        }
        if (m21952d != null) {
            builder = builder.setContextQuery(m21952d);
            Intrinsics.m32178g(builder, "builder.setContextQuery(contextQuery)");
        }
        if (m21953e != null) {
            builder = builder.setContextTags(m21953e);
            Intrinsics.m32178g(builder, "builder.setContextTags(contextTags)");
        }
        if (m21955g != null) {
            builder = builder.setLocation(m21955g);
            Intrinsics.m32178g(builder, "builder.setLocation(location)");
        }
        if (m21956h != null) {
            builder = builder.setParameters(m21956h);
            Intrinsics.m32178g(builder, "builder.setParameters(parameters)");
        }
        if (m21951c != null) {
            builder = builder.setBiddingData(m21951c);
            Intrinsics.m32178g(builder, "builder.setBiddingData(biddingData)");
        }
        if (m21957i != null) {
            builder = builder.setPreferredTheme(m21957i);
            Intrinsics.m32178g(builder, "builder.setPreferredTheme(preferredTheme)");
        }
        AdRequest build = builder.build();
        Intrinsics.m32178g(build, "builder.build()");
        return build;
    }

    @NotNull
    /* renamed from: b */
    public static String m21969b(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.m32179h(adRequestConfiguration, "adRequestConfiguration");
        String m21949a = adRequestConfiguration.m21949a();
        Intrinsics.m32178g(m21949a, "adRequestConfiguration.adUnitId");
        return m21949a;
    }
}

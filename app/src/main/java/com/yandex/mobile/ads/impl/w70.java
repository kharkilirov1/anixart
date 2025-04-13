package com.yandex.mobile.ads.impl;

import android.os.Build;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w70 {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final SSLSocketFactory m29400a(@NotNull mk1 customCertificatesProvider) {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        ol1 trustManager = m29401b(customCertificatesProvider);
        Intrinsics.m32179h(trustManager, "trustManager");
        SSLSocketFactory socketFactory = new ky0(trustManager).m26299a().getSocketFactory();
        Intrinsics.m32178g(socketFactory, "SSLContextBuilder(trustM…er).build().socketFactory");
        return socketFactory;
    }

    @JvmStatic
    @NotNull
    /* renamed from: b */
    public static final ol1 m29401b(@NotNull mk1 customCertificatesProvider) {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        return Build.VERSION.SDK_INT >= 24 ? C5068f9.m24367a(customCertificatesProvider) : new ql1(customCertificatesProvider);
    }
}

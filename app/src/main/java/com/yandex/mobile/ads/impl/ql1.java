package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ql1 implements ol1 {

    /* renamed from: a */
    @NotNull
    private final pl1 f54075a;

    public ql1(@NotNull mk1 customCertificatesProvider) {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        this.f54075a = new pl1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f54075a.m27341a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f54075a.m27344b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f54075a.m27347c();
    }
}

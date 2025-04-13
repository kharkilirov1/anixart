package com.yandex.mobile.ads.impl;

import androidx.annotation.RequiresApi;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes3.dex */
public final class qk1 extends X509ExtendedTrustManager implements ol1 {

    /* renamed from: a */
    @NotNull
    private final pl1 f54073a;

    public qk1(@NotNull InterfaceC6081yl customCertificatesProvider) {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        this.f54073a = new pl1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        this.f54073a.m27342a(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f54073a.m27344b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f54073a.m27347c();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        this.f54073a.m27343a(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        this.f54073a.m27345b(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f54073a.m27341a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        this.f54073a.m27346b(x509CertificateArr, str, sSLEngine);
    }
}

package com.yandex.mobile.ads.impl;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
@JvmName
/* renamed from: com.yandex.mobile.ads.impl.f9 */
/* loaded from: classes3.dex */
public final class C5068f9 {
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final ol1 m24367a(@NotNull InterfaceC6081yl customCertificatesProvider) throws CertificateException {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        return new qk1(customCertificatesProvider);
    }

    @DoNotInline
    /* renamed from: b */
    public static final void m24370b(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Intrinsics.m32179h(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: a */
    public static final void m24368a(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Intrinsics.m32179h(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: b */
    public static final void m24371b(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Intrinsics.m32179h(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @DoNotInline
    /* renamed from: a */
    public static final void m24369a(@NotNull X509TrustManager trustManager, @Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Intrinsics.m32179h(trustManager, "trustManager");
        if (trustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) trustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }
}

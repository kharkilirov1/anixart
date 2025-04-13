package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jy0 {
    @Nullable
    /* renamed from: a */
    public static final X509Certificate m25998a(@NotNull SslCertificate sslCertificate, @NotNull CertificateFactory x509CertificateFactory) {
        byte[] byteArray;
        Intrinsics.m32179h(sslCertificate, "<this>");
        Intrinsics.m32179h(x509CertificateFactory, "x509CertificateFactory");
        if (!Intrinsics.m32174c(x509CertificateFactory.getType(), "X.509")) {
            StringBuilder m26356a = l60.m26356a("Wrong certificateFactory.\nExpected type: X.509\nActual type: ");
            m26356a.append(x509CertificateFactory.getType());
            n60.m26810c(m26356a.toString(), new Object[0]);
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState == null || (byteArray = saveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate generateCertificate = x509CertificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (generateCertificate instanceof X509Certificate) {
                return (X509Certificate) generateCertificate;
            }
            return null;
        } catch (CertificateException e2) {
            n60.m26808a(e2, "Can't generate X509Certificate", new Object[0]);
            return null;
        }
    }
}

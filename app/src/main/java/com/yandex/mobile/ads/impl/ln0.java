package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ln0 implements HostnameVerifier {

    /* renamed from: a */
    @NotNull
    public static final ln0 f52476a = new ln0();

    private ln0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:1: B:29:0x007d->B:66:?, LOOP_END, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m26506a(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ln0.m26506a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.m32179h(host, "host");
        Intrinsics.m32179h(session, "session");
        if (!(host.length() == ((int) Utf8.m34622a(host, 0, 0, 3)))) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.m32177f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m26506a(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    @NotNull
    /* renamed from: a */
    public static List m26504a(@NotNull X509Certificate certificate) {
        Intrinsics.m32179h(certificate, "certificate");
        return CollectionsKt.m32002O(m26505a(certificate, 7), m26505a(certificate, 2));
    }

    /* renamed from: a */
    private static List m26505a(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.f63144b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.m32174c(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.f63144b;
        }
    }
}

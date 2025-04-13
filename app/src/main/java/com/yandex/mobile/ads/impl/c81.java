package com.yandex.mobile.ads.impl;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c81 {

    /* renamed from: a */
    @NotNull
    private static final Lazy f49180a = LazyKt.m31881b(C4909a.f49182a);

    /* renamed from: b */
    public static final /* synthetic */ int f49181b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.c81$a */
    public static final class C4909a extends Lambda implements Function0<CertificateFactory> {

        /* renamed from: a */
        public static final C4909a f49182a = new C4909a();

        public C4909a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CertificateFactory invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static final X509TrustManager m23075a(@Nullable KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.m32178g(trustManagers, "trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.m32046w(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static final X509Certificate m23074a(@NotNull byte[] certBytes) {
        Intrinsics.m32179h(certBytes, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(certBytes);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f49180a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }

    @ChecksSdkIntAtLeast
    /* renamed from: a */
    public static final boolean m23076a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}

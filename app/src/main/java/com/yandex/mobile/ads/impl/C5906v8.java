package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v8 */
/* loaded from: classes3.dex */
public final class C5906v8 extends AbstractC5027eh {

    /* renamed from: a */
    @NotNull
    private final X509TrustManager f55775a;

    /* renamed from: b */
    @NotNull
    private final X509TrustManagerExtensions f55776b;

    /* renamed from: com.yandex.mobile.ads.impl.v8$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static C5906v8 m29192a(@NotNull X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.m32179h(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C5906v8(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C5906v8(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.m32179h(trustManager, "trustManager");
        Intrinsics.m32179h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f55775a = trustManager;
        this.f55776b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5027eh
    @NotNull
    /* renamed from: a */
    public final List mo24154a(@NotNull String hostname, @NotNull List chain) throws SSLPeerUnverifiedException {
        Intrinsics.m32179h(chain, "chain");
        Intrinsics.m32179h(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        try {
            List<X509Certificate> checkServerTrusted = this.f55776b.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            Intrinsics.m32178g(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C5906v8) && ((C5906v8) obj).f55775a == this.f55775a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f55775a);
    }
}

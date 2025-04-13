package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ky0 {

    /* renamed from: a */
    @NotNull
    private final X509TrustManager f52192a;

    public ky0(@NotNull ol1 trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        this.f52192a = trustManager;
    }

    @NotNull
    /* renamed from: a */
    public final SSLContext m26299a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f52192a}, null);
            return sSLContext;
        } catch (KeyManagementException e2) {
            throw new IllegalStateException("Failed to initialize SSLContext", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalStateException("No system TLS", e3);
        }
    }
}

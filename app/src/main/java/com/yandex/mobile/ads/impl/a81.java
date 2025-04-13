package com.yandex.mobile.ads.impl;

import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a81 {
    @Nullable
    /* renamed from: a */
    public final X509TrustManager m22405a() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m32178g(trustManagers, "trustManagers");
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        return (X509TrustManager) CollectionsKt.m32046w(arrayList);
    }
}

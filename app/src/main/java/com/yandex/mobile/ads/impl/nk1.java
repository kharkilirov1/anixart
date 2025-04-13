package com.yandex.mobile.ads.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nk1 extends C5754sn {

    /* renamed from: s */
    @Nullable
    private final SSLSocketFactory f53028s;

    public nk1(@Nullable String str, int i2, int i3, boolean z, @Nullable i00 i00Var, @Nullable SSLSocketFactory sSLSocketFactory) {
        super(str, i2, i3, z, i00Var);
        this.f53028s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.C5754sn
    @NotNull
    /* renamed from: a */
    public final HttpURLConnection mo26922a(@NotNull URL url) {
        Intrinsics.m32179h(url, "url");
        HttpURLConnection connection = super.mo26922a(url);
        SSLSocketFactory sSLSocketFactory = this.f53028s;
        if (sSLSocketFactory != null && (connection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) connection).setSSLSocketFactory(sSLSocketFactory);
        }
        Intrinsics.m32178g(connection, "connection");
        return connection;
    }
}

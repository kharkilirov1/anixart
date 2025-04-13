package io.grpc.okhttp.internal;

/* loaded from: classes3.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: b */
    public final String f59404b;

    TlsVersion(String str) {
        this.f59404b = str;
    }
}

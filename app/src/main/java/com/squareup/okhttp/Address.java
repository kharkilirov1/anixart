package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class Address {

    /* renamed from: a */
    public final HttpUrl f24770a;

    /* renamed from: b */
    public final Dns f24771b;

    /* renamed from: c */
    public final Authenticator f24772c;

    /* renamed from: d */
    public final List<Protocol> f24773d;

    /* renamed from: e */
    public final List<ConnectionSpec> f24774e;

    /* renamed from: f */
    public final ProxySelector f24775f;

    /* renamed from: g */
    public final Proxy f24776g;

    /* renamed from: h */
    public final SSLSocketFactory f24777h;

    /* renamed from: i */
    public final HostnameVerifier f24778i;

    /* renamed from: j */
    public final CertificatePinner f24779j;

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return this.f24770a.equals(address.f24770a) && this.f24771b.equals(address.f24771b) && this.f24772c.equals(address.f24772c) && this.f24773d.equals(address.f24773d) && this.f24774e.equals(address.f24774e) && this.f24775f.equals(address.f24775f) && Util.m13938f(this.f24776g, address.f24776g) && Util.m13938f(this.f24777h, address.f24777h) && Util.m13938f(this.f24778i, address.f24778i) && Util.m13938f(this.f24779j, address.f24779j);
    }

    public int hashCode() {
        int hashCode = (this.f24775f.hashCode() + ((this.f24774e.hashCode() + ((this.f24773d.hashCode() + ((this.f24772c.hashCode() + ((this.f24771b.hashCode() + ((this.f24770a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f24776g;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f24777h;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f24778i;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        CertificatePinner certificatePinner = this.f24779j;
        return hashCode4 + (certificatePinner != null ? certificatePinner.hashCode() : 0);
    }
}

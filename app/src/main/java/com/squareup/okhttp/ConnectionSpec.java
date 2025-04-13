package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class ConnectionSpec {

    /* renamed from: e */
    public static final ConnectionSpec f24833e;

    /* renamed from: f */
    public static final ConnectionSpec f24834f;

    /* renamed from: g */
    public static final ConnectionSpec f24835g;

    /* renamed from: a */
    public final boolean f24836a;

    /* renamed from: b */
    public final boolean f24837b;

    /* renamed from: c */
    public final String[] f24838c;

    /* renamed from: d */
    public final String[] f24839d;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        Builder builder = new Builder(true);
        String[] strArr = new String[13];
        for (int i2 = 0; i2 < 13; i2++) {
            strArr[i2] = cipherSuiteArr[i2].f24825b;
        }
        builder.m13886b(strArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        builder.m13887c(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion);
        if (!builder.f24840a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder.f24843d = true;
        ConnectionSpec m13885a = builder.m13885a();
        f24833e = m13885a;
        Builder builder2 = new Builder(m13885a);
        builder2.m13887c(tlsVersion);
        if (!builder2.f24840a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder2.f24843d = true;
        f24834f = builder2.m13885a();
        f24835g = new Builder(false).m13885a();
    }

    public ConnectionSpec(Builder builder, C24631 c24631) {
        this.f24836a = builder.f24840a;
        this.f24838c = builder.f24841b;
        this.f24839d = builder.f24842c;
        this.f24837b = builder.f24843d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = this.f24836a;
        if (z != connectionSpec.f24836a) {
            return false;
        }
        return !z || (Arrays.equals(this.f24838c, connectionSpec.f24838c) && Arrays.equals(this.f24839d, connectionSpec.f24839d) && this.f24837b == connectionSpec.f24837b);
    }

    public int hashCode() {
        if (this.f24836a) {
            return ((((527 + Arrays.hashCode(this.f24838c)) * 31) + Arrays.hashCode(this.f24839d)) * 31) + (!this.f24837b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        String str2;
        TlsVersion tlsVersion;
        List m13939g;
        CipherSuite valueOf;
        if (!this.f24836a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f24838c;
        List list = null;
        String str3 = "[all enabled]";
        if (strArr != null) {
            if (strArr == null) {
                m13939g = null;
            } else {
                CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.f24838c;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str4 = strArr2[i2];
                    if (str4.startsWith("SSL_")) {
                        StringBuilder m24u = C0000a.m24u("TLS_");
                        m24u.append(str4.substring(4));
                        valueOf = CipherSuite.valueOf(m24u.toString());
                    } else {
                        valueOf = CipherSuite.valueOf(str4);
                    }
                    cipherSuiteArr[i2] = valueOf;
                    i2++;
                }
                m13939g = Util.m13939g(cipherSuiteArr);
            }
            str = m13939g.toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr3 = this.f24839d;
        if (strArr3 != null) {
            if (strArr3 != null) {
                TlsVersion[] tlsVersionArr = new TlsVersion[strArr3.length];
                int i3 = 0;
                while (true) {
                    String[] strArr4 = this.f24839d;
                    if (i3 < strArr4.length) {
                        str2 = strArr4[i3];
                        Objects.requireNonNull(str2);
                        str2.hashCode();
                        switch (str2) {
                            case "TLSv1.1":
                                tlsVersion = TlsVersion.TLS_1_1;
                                break;
                            case "TLSv1.2":
                                tlsVersion = TlsVersion.TLS_1_2;
                                break;
                            case "SSLv3":
                                tlsVersion = TlsVersion.SSL_3_0;
                                break;
                            case "TLSv1":
                                tlsVersion = TlsVersion.TLS_1_0;
                                break;
                            default:
                                throw new IllegalArgumentException(C0000a.m14k("Unexpected TLS version: ", str2));
                        }
                        tlsVersionArr[i3] = tlsVersion;
                        i3++;
                    } else {
                        list = Util.m13939g(tlsVersionArr);
                    }
                }
            }
            str3 = list.toString();
        }
        StringBuilder m29z = C0000a.m29z("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str3, ", supportsTlsExtensions=");
        m29z.append(this.f24837b);
        m29z.append(")");
        return m29z.toString();
    }

    public static final class Builder {

        /* renamed from: a */
        public boolean f24840a;

        /* renamed from: b */
        public String[] f24841b;

        /* renamed from: c */
        public String[] f24842c;

        /* renamed from: d */
        public boolean f24843d;

        public Builder(boolean z) {
            this.f24840a = z;
        }

        /* renamed from: a */
        public ConnectionSpec m13885a() {
            return new ConnectionSpec(this, null);
        }

        /* renamed from: b */
        public Builder m13886b(String... strArr) {
            if (!this.f24840a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f24841b = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: c */
        public Builder m13887c(TlsVersion... tlsVersionArr) {
            if (!this.f24840a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                strArr[i2] = tlsVersionArr[i2].f24939b;
            }
            m13888d(strArr);
            return this;
        }

        /* renamed from: d */
        public Builder m13888d(String... strArr) {
            if (!this.f24840a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f24842c = (String[]) strArr.clone();
            return this;
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.f24840a = connectionSpec.f24836a;
            this.f24841b = connectionSpec.f24838c;
            this.f24842c = connectionSpec.f24839d;
            this.f24843d = connectionSpec.f24837b;
        }
    }
}

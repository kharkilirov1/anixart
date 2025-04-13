package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ConnectionSpec {

    /* renamed from: e */
    public static final ConnectionSpec f59349e;

    /* renamed from: a */
    public final boolean f59350a;

    /* renamed from: b */
    public final String[] f59351b;

    /* renamed from: c */
    public final String[] f59352c;

    /* renamed from: d */
    public final boolean f59353d;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        Builder builder = new Builder(true);
        builder.m31276b(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.m31278d(tlsVersion, tlsVersion2);
        builder.m31277c(true);
        ConnectionSpec m31275a = builder.m31275a();
        f59349e = m31275a;
        Builder builder2 = new Builder(m31275a);
        builder2.m31278d(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder2.m31277c(true);
        builder2.m31275a();
        new Builder(false).m31275a();
    }

    public ConnectionSpec(Builder builder, C64841 c64841) {
        this.f59350a = builder.f59354a;
        this.f59351b = builder.f59355b;
        this.f59352c = builder.f59356c;
        this.f59353d = builder.f59357d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = this.f59350a;
        if (z != connectionSpec.f59350a) {
            return false;
        }
        return !z || (Arrays.equals(this.f59351b, connectionSpec.f59351b) && Arrays.equals(this.f59352c, connectionSpec.f59352c) && this.f59353d == connectionSpec.f59353d);
    }

    public int hashCode() {
        if (this.f59350a) {
            return ((((527 + Arrays.hashCode(this.f59351b)) * 31) + Arrays.hashCode(this.f59352c)) * 31) + (!this.f59353d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List unmodifiableList;
        CipherSuite valueOf;
        TlsVersion tlsVersion;
        if (!this.f59350a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f59351b;
        int i2 = 0;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f59351b;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str.startsWith("SSL_")) {
                    StringBuilder m24u = C0000a.m24u("TLS_");
                    m24u.append(str.substring(4));
                    valueOf = CipherSuite.valueOf(m24u.toString());
                } else {
                    valueOf = CipherSuite.valueOf(str);
                }
                cipherSuiteArr[i3] = valueOf;
                i3++;
            }
            String[] strArr3 = Util.f59405a;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) cipherSuiteArr.clone()));
        }
        StringBuilder m28y = C0000a.m28y("ConnectionSpec(cipherSuites=", unmodifiableList == null ? "[use default]" : unmodifiableList.toString(), ", tlsVersions=");
        TlsVersion[] tlsVersionArr = new TlsVersion[this.f59352c.length];
        while (true) {
            String[] strArr4 = this.f59352c;
            if (i2 >= strArr4.length) {
                String[] strArr5 = Util.f59405a;
                m28y.append(Collections.unmodifiableList(Arrays.asList((Object[]) tlsVersionArr.clone())));
                m28y.append(", supportsTlsExtensions=");
                m28y.append(this.f59353d);
                m28y.append(")");
                return m28y.toString();
            }
            String str2 = strArr4[i2];
            if ("TLSv1.3".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(C0000a.m14k("Unexpected TLS version: ", str2));
                }
                tlsVersion = TlsVersion.SSL_3_0;
            }
            tlsVersionArr[i2] = tlsVersion;
            i2++;
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public boolean f59354a;

        /* renamed from: b */
        public String[] f59355b;

        /* renamed from: c */
        public String[] f59356c;

        /* renamed from: d */
        public boolean f59357d;

        public Builder(boolean z) {
            this.f59354a = z;
        }

        /* renamed from: a */
        public ConnectionSpec m31275a() {
            return new ConnectionSpec(this, null);
        }

        /* renamed from: b */
        public Builder m31276b(CipherSuite... cipherSuiteArr) {
            if (!this.f59354a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i2 = 0; i2 < cipherSuiteArr.length; i2++) {
                strArr[i2] = cipherSuiteArr[i2].f59348b;
            }
            this.f59355b = strArr;
            return this;
        }

        /* renamed from: c */
        public Builder m31277c(boolean z) {
            if (!this.f59354a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f59357d = z;
            return this;
        }

        /* renamed from: d */
        public Builder m31278d(TlsVersion... tlsVersionArr) {
            if (!this.f59354a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                strArr[i2] = tlsVersionArr[i2].f59404b;
            }
            this.f59356c = strArr;
            return this;
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.f59354a = connectionSpec.f59350a;
            this.f59355b = connectionSpec.f59351b;
            this.f59356c = connectionSpec.f59352c;
            this.f59357d = connectionSpec.f59353d;
        }
    }
}

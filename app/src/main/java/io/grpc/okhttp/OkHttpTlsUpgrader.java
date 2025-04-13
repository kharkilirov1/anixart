package io.grpc.okhttp;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.OkHostnameVerifier;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.Util;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class OkHttpTlsUpgrader {

    /* renamed from: a */
    @VisibleForTesting
    public static final List<Protocol> f59315a = Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2));

    /* renamed from: a */
    public static SSLSocket m31262a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i2, ConnectionSpec connectionSpec) throws IOException {
        Preconditions.m11187k(sSLSocketFactory, "sslSocketFactory");
        Preconditions.m11187k(socket, "socket");
        Preconditions.m11187k(connectionSpec, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i2, true);
        String[] strArr = connectionSpec.f59351b != null ? (String[]) Util.m31295a(String.class, connectionSpec.f59351b, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr2 = (String[]) Util.m31295a(String.class, connectionSpec.f59352c, sSLSocket.getEnabledProtocols());
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
        if (!builder.f59354a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr == null) {
            builder.f59355b = null;
        } else {
            builder.f59355b = (String[]) strArr.clone();
        }
        if (!builder.f59354a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr2 == null) {
            builder.f59356c = null;
        } else {
            builder.f59356c = (String[]) strArr2.clone();
        }
        ConnectionSpec m31275a = builder.m31275a();
        sSLSocket.setEnabledProtocols(m31275a.f59352c);
        String[] strArr3 = m31275a.f59351b;
        if (strArr3 != null) {
            sSLSocket.setEnabledCipherSuites(strArr3);
        }
        String mo31261d = OkHttpProtocolNegotiator.f59299d.mo31261d(sSLSocket, str, connectionSpec.f59353d ? f59315a : null);
        List<Protocol> list = f59315a;
        Protocol protocol = Protocol.HTTP_1_0;
        if (!mo31261d.equals("http/1.0")) {
            protocol = Protocol.HTTP_1_1;
            if (!mo31261d.equals("http/1.1")) {
                protocol = Protocol.HTTP_2;
                if (!mo31261d.equals("h2")) {
                    protocol = Protocol.SPDY_3;
                    if (!mo31261d.equals("spdy/3.1")) {
                        throw new IOException(C0000a.m14k("Unexpected protocol: ", mo31261d));
                    }
                }
            }
        }
        Preconditions.m11194r(list.contains(protocol), "Only " + list + " are supported, but negotiated protocol is %s", mo31261d);
        if (hostnameVerifier == null) {
            hostnameVerifier = OkHostnameVerifier.f59365a;
        }
        if (hostnameVerifier.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException(C0000a.m14k("Cannot verify hostname: ", str));
    }
}

package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ik */
/* loaded from: classes3.dex */
public final class C5234ik {

    /* renamed from: a */
    @NotNull
    private final List<C5189hk> f51317a;

    /* renamed from: b */
    private int f51318b;

    /* renamed from: c */
    private boolean f51319c;

    /* renamed from: d */
    private boolean f51320d;

    public C5234ik(@NotNull List<C5189hk> connectionSpecs) {
        Intrinsics.m32179h(connectionSpecs, "connectionSpecs");
        this.f51317a = connectionSpecs;
    }

    @NotNull
    /* renamed from: a */
    public final C5189hk m25551a(@NotNull SSLSocket sslSocket) throws IOException {
        boolean z;
        C5189hk c5189hk;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        int i2 = this.f51318b;
        int size = this.f51317a.size();
        while (true) {
            z = true;
            if (i2 >= size) {
                c5189hk = null;
                break;
            }
            c5189hk = this.f51317a.get(i2);
            if (c5189hk.m25223a(sslSocket)) {
                this.f51318b = i2 + 1;
                break;
            }
            i2++;
        }
        if (c5189hk != null) {
            int i3 = this.f51318b;
            int size2 = this.f51317a.size();
            while (true) {
                if (i3 >= size2) {
                    z = false;
                    break;
                }
                if (this.f51317a.get(i3).m25223a(sslSocket)) {
                    break;
                }
                i3++;
            }
            this.f51319c = z;
            c5189hk.m25221a(sslSocket, this.f51320d);
            return c5189hk;
        }
        StringBuilder m26356a = l60.m26356a("Unable to find acceptable protocols. isFallback=");
        m26356a.append(this.f51320d);
        m26356a.append(", modes=");
        m26356a.append(this.f51317a);
        m26356a.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.m32176e(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.m32178g(arrays, "toString(this)");
        m26356a.append(arrays);
        throw new UnknownServiceException(m26356a.toString());
    }

    /* renamed from: a */
    public final boolean m25552a(@NotNull IOException e2) {
        Intrinsics.m32179h(e2, "e");
        this.f51320d = true;
        return (!this.f51319c || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException) || ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException) || !(e2 instanceof SSLException)) ? false : true;
    }
}

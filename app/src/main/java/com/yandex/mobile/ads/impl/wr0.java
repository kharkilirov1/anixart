package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wr0 extends SSLSocketFactory {

    /* renamed from: b */
    public static final /* synthetic */ int f56233b = 0;

    /* renamed from: a */
    @NotNull
    private final SSLSocketFactory f56234a;

    static {
        new C5986a(0);
    }

    public wr0(@NotNull SSLSocketFactory delegate) {
        Intrinsics.m32179h(delegate, "delegate");
        this.f56234a = delegate;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i2) throws IOException {
        Intrinsics.m32179h(arg0, "arg0");
        Socket createSocket = this.f56234a.createSocket(arg0, i2);
        String[] m29534a = C5986a.m29534a(this.f56234a);
        Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m29534a);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getDefaultCipherSuites() {
        return C5986a.m29534a(this.f56234a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getSupportedCipherSuites() {
        return C5986a.m29535b(this.f56234a);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i2) throws IOException {
        Intrinsics.m32179h(arg0, "arg0");
        Socket createSocket = this.f56234a.createSocket(arg0, i2);
        String[] m29534a = C5986a.m29534a(this.f56234a);
        Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m29534a);
        return createSocket;
    }

    /* renamed from: com.yandex.mobile.ads.impl.wr0$a */
    public static final class C5986a {
        private C5986a() {
        }

        public /* synthetic */ C5986a(int i2) {
            this();
        }

        /* renamed from: a */
        public static final String[] m29534a(SSLSocketFactory sSLSocketFactory) {
            int i2 = wr0.f56233b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }

        /* renamed from: b */
        public static final String[] m29535b(SSLSocketFactory sSLSocketFactory) {
            int i2 = wr0.f56233b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }

        @Nullable
        /* renamed from: a */
        public static wr0 m29533a() {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException e2) {
                    n60.m26810c("Failed to init SSLContext: %s", e2.getMessage());
                }
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                Intrinsics.m32178g(socketFactory, "context.socketFactory");
                return new wr0(socketFactory);
            } catch (NoSuchAlgorithmException e3) {
                n60.m26810c("Failed to create SSLContext for algorithm %s: %s", "TLSv1", e3.getMessage());
                return null;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final Socket createSocket(@NotNull Socket arg0, @NotNull String arg1, int i2, boolean z) throws IOException {
        Intrinsics.m32179h(arg0, "arg0");
        Intrinsics.m32179h(arg1, "arg1");
        Socket createSocket = this.f56234a.createSocket(arg0, arg1, i2, z);
        String[] m29534a = C5986a.m29534a(this.f56234a);
        Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m29534a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i2, @NotNull InetAddress arg2, int i3) throws IOException {
        Intrinsics.m32179h(arg0, "arg0");
        Intrinsics.m32179h(arg2, "arg2");
        Socket createSocket = this.f56234a.createSocket(arg0, i2, arg2, i3);
        String[] m29534a = C5986a.m29534a(this.f56234a);
        Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m29534a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i2, @NotNull InetAddress arg2, int i3) throws IOException {
        Intrinsics.m32179h(arg0, "arg0");
        Intrinsics.m32179h(arg2, "arg2");
        Socket createSocket = this.f56234a.createSocket(arg0, i2, arg2, i3);
        String[] m29534a = C5986a.m29534a(this.f56234a);
        Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(m29534a);
        return createSocket;
    }
}

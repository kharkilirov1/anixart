package io.grpc.okhttp;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.OptionalMethod;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
class OkHttpProtocolNegotiator {

    /* renamed from: b */
    public static final Logger f59297b = Logger.getLogger(OkHttpProtocolNegotiator.class.getName());

    /* renamed from: c */
    public static final Platform f59298c = Platform.f59372c;

    /* renamed from: d */
    public static OkHttpProtocolNegotiator f59299d;

    /* renamed from: a */
    public final Platform f59300a;

    @VisibleForTesting
    public static final class AndroidNegotiator extends OkHttpProtocolNegotiator {

        /* renamed from: e */
        public static final OptionalMethod<Socket> f59301e;

        /* renamed from: f */
        public static final OptionalMethod<Socket> f59302f;

        /* renamed from: g */
        public static final OptionalMethod<Socket> f59303g;

        /* renamed from: h */
        public static final OptionalMethod<Socket> f59304h;

        /* renamed from: i */
        public static final OptionalMethod<Socket> f59305i;

        /* renamed from: j */
        public static final OptionalMethod<Socket> f59306j;

        /* renamed from: k */
        public static final Method f59307k;

        /* renamed from: l */
        public static final Method f59308l;

        /* renamed from: m */
        public static final Method f59309m;

        /* renamed from: n */
        public static final Method f59310n;

        /* renamed from: o */
        public static final Method f59311o;

        /* renamed from: p */
        public static final Method f59312p;

        /* renamed from: q */
        public static final Constructor<?> f59313q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f59301e = new OptionalMethod<>(null, "setUseSessionTickets", cls2);
            f59302f = new OptionalMethod<>(null, "setHostname", String.class);
            f59303g = new OptionalMethod<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f59304h = new OptionalMethod<>(null, "setAlpnProtocols", byte[].class);
            f59305i = new OptionalMethod<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f59306j = new OptionalMethod<>(null, "setNpnProtocols", byte[].class);
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            method4 = null;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                        method3 = null;
                        method4 = method3;
                        OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f59309m = method2;
                        f59310n = method;
                        f59311o = method3;
                        f59307k = method4;
                        f59308l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f59312p = method6;
                        f59313q = constructor;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        method3 = null;
                        method4 = method3;
                        OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f59309m = method2;
                        f59310n = method;
                        f59311o = method3;
                        f59307k = method4;
                        f59308l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f59312p = method6;
                        f59313q = constructor;
                    }
                    try {
                        method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                    } catch (ClassNotFoundException e6) {
                        e = e6;
                        OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f59309m = method2;
                        f59310n = method;
                        f59311o = method3;
                        f59307k = method4;
                        f59308l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f59312p = method6;
                        f59313q = constructor;
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f59309m = method2;
                        f59310n = method;
                        f59311o = method3;
                        f59307k = method4;
                        f59308l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f59312p = method6;
                        f59313q = constructor;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e9) {
                    e = e9;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e10) {
                e = e10;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method = null;
                method2 = null;
                method3 = null;
            }
            f59309m = method2;
            f59310n = method;
            f59311o = method3;
            f59307k = method4;
            f59308l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException e12) {
                e = e12;
                method6 = null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e14) {
                e = e14;
                OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f59312p = method6;
                f59313q = constructor;
            } catch (NoSuchMethodException e15) {
                e = e15;
                OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f59312p = method6;
                f59313q = constructor;
            }
            f59312p = method6;
            f59313q = constructor;
        }

        public AndroidNegotiator(Platform platform) {
            super(platform);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31259a(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.okhttp.internal.Protocol> r11) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OkHttpProtocolNegotiator.AndroidNegotiator.mo31259a(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        /* renamed from: b */
        public String mo31260b(SSLSocket sSLSocket) {
            Method method = f59311o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e3);
                    }
                    OkHttpProtocolNegotiator.f59297b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f59300a.mo31294e() == Platform.TlsExtensionType.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f59303g.m31289e(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, Util.f59406b);
                    }
                } catch (Exception e4) {
                    OkHttpProtocolNegotiator.f59297b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
                }
            }
            if (this.f59300a.mo31294e() == Platform.TlsExtensionType.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f59305i.m31289e(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, Util.f59406b);
                }
                return null;
            } catch (Exception e5) {
                OkHttpProtocolNegotiator.f59297b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                return null;
            }
        }

        @Override // io.grpc.okhttp.OkHttpProtocolNegotiator
        /* renamed from: d */
        public String mo31261d(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
            String mo31260b = mo31260b(sSLSocket);
            return mo31260b == null ? super.mo31261d(sSLSocket, str, list) : mo31260b;
        }
    }

    static {
        boolean z;
        ClassLoader classLoader = OkHttpProtocolNegotiator.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e2) {
            f59297b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e2);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e3) {
                f59297b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e3);
                z = false;
            }
        }
        z = true;
        f59299d = z ? new AndroidNegotiator(f59298c) : new OkHttpProtocolNegotiator(f59298c);
    }

    @VisibleForTesting
    public OkHttpProtocolNegotiator(Platform platform) {
        Preconditions.m11187k(platform, "platform");
        this.f59300a = platform;
    }

    @VisibleForTesting
    /* renamed from: c */
    public static boolean m31258c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            URI m31090a = GrpcUtil.m31090a(str);
            Preconditions.m11184h(m31090a.getHost() != null, "No host in authority '%s'", str);
            Preconditions.m11184h(m31090a.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo31259a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        this.f59300a.mo31292c(sSLSocket, str, list);
    }

    /* renamed from: b */
    public String mo31260b(SSLSocket sSLSocket) {
        return this.f59300a.mo31293d(sSLSocket);
    }

    /* renamed from: d */
    public String mo31261d(SSLSocket sSLSocket, String str, @Nullable List<Protocol> list) throws IOException {
        if (list != null) {
            mo31259a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String mo31260b = mo31260b(sSLSocket);
            if (mo31260b != null) {
                return mo31260b;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f59300a.mo31291a(sSLSocket);
        }
    }
}

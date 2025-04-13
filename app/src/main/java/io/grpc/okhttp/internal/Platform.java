package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okio.Buffer;

/* loaded from: classes3.dex */
public class Platform {

    /* renamed from: a */
    public static final Logger f59370a = Logger.getLogger(Platform.class.getName());

    /* renamed from: b */
    public static final String[] f59371b = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: c */
    public static final Platform f59372c;

    public static class Android extends Platform {

        /* renamed from: d */
        public final OptionalMethod<Socket> f59373d;

        /* renamed from: e */
        public final OptionalMethod<Socket> f59374e;

        /* renamed from: f */
        public final OptionalMethod<Socket> f59375f;

        /* renamed from: g */
        public final OptionalMethod<Socket> f59376g;

        /* renamed from: h */
        public final TlsExtensionType f59377h;

        public Android(OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, Method method, Method method2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4, Provider provider, TlsExtensionType tlsExtensionType) {
            super(provider);
            this.f59373d = optionalMethod;
            this.f59374e = optionalMethod2;
            this.f59375f = optionalMethod3;
            this.f59376g = optionalMethod4;
            this.f59377h = tlsExtensionType;
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: c */
        public void mo31292c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f59373d.m31288d(sSLSocket, Boolean.TRUE);
                this.f59374e.m31288d(sSLSocket, str);
            }
            OptionalMethod<Socket> optionalMethod = this.f59376g;
            Objects.requireNonNull(optionalMethod);
            if (optionalMethod.m31286a(sSLSocket.getClass()) != null) {
                this.f59376g.m31289e(sSLSocket, Platform.m31290b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: d */
        public String mo31293d(SSLSocket sSLSocket) {
            byte[] bArr;
            OptionalMethod<Socket> optionalMethod = this.f59375f;
            Objects.requireNonNull(optionalMethod);
            if ((optionalMethod.m31286a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f59375f.m31289e(sSLSocket, new Object[0])) != null) {
                return new String(bArr, Util.f59406b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: e */
        public TlsExtensionType mo31294e() {
            return this.f59377h;
        }
    }

    public static class JdkAlpnPlatform extends Platform {

        /* renamed from: d */
        public final Method f59378d;

        /* renamed from: e */
        public final Method f59379e;

        public JdkAlpnPlatform(Provider provider, Method method, Method method2, C64851 c64851) {
            super(provider);
            this.f59378d = method;
            this.f59379e = method2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: c */
        public void mo31292c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (Protocol protocol : list) {
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.f59397b);
                }
            }
            try {
                this.f59378d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: d */
        public String mo31293d(SSLSocket sSLSocket) {
            try {
                return (String) this.f59379e.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: e */
        public TlsExtensionType mo31294e() {
            return TlsExtensionType.ALPN_AND_NPN;
        }
    }

    public static class JdkWithJettyBootPlatform extends Platform {

        /* renamed from: d */
        public final Method f59380d;

        /* renamed from: e */
        public final Method f59381e;

        /* renamed from: f */
        public final Method f59382f;

        /* renamed from: g */
        public final Class<?> f59383g;

        /* renamed from: h */
        public final Class<?> f59384h;

        public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f59380d = method;
            this.f59381e = method2;
            this.f59382f = method3;
            this.f59383g = cls;
            this.f59384h = cls2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: a */
        public void mo31291a(SSLSocket sSLSocket) {
            try {
                this.f59382f.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e2) {
                Platform.f59370a.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e2);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: c */
        public void mo31292c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Protocol protocol = list.get(i2);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.f59397b);
                }
            }
            try {
                this.f59380d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f59383g, this.f59384h}, new JettyNegoProvider(arrayList)));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: d */
        public String mo31293d(SSLSocket sSLSocket) {
            try {
                JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.f59381e.invoke(null, sSLSocket));
                boolean z = jettyNegoProvider.f59386b;
                if (!z && jettyNegoProvider.f59387c == null) {
                    Platform.f59370a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return jettyNegoProvider.f59387c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        /* renamed from: e */
        public TlsExtensionType mo31294e() {
            return TlsExtensionType.ALPN_AND_NPN;
        }
    }

    public static class JettyNegoProvider implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f59385a;

        /* renamed from: b */
        public boolean f59386b;

        /* renamed from: c */
        public String f59387c;

        public JettyNegoProvider(List<String> list) {
            this.f59385a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.f59405a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f59386b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f59385a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f59387c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f59385a.contains(list.get(i2))) {
                    String str = (String) list.get(i2);
                    this.f59387c = str;
                    return str;
                }
            }
            String str2 = this.f59385a.get(0);
            this.f59387c = str2;
            return str2;
        }
    }

    public enum TlsExtensionType {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    static {
        Method method;
        Provider provider;
        Platform platform;
        Platform platform2;
        Method method2;
        Method method3;
        boolean z;
        TlsExtensionType tlsExtensionType = TlsExtensionType.ALPN_AND_NPN;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        boolean z2 = false;
        int i2 = 0;
        loop0: while (true) {
            method = null;
            if (i2 >= length) {
                f59370a.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            for (String str : f59371b) {
                if (str.equals(provider2.getClass().getName())) {
                    f59370a.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            OptionalMethod optionalMethod = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod2 = new OptionalMethod(null, "setHostname", String.class);
            OptionalMethod optionalMethod3 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                Method method4 = cls.getMethod("tagSocket", Socket.class);
                try {
                    method = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
                method2 = method4;
                method3 = method;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
                method3 = null;
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    Platform.class.getClassLoader().loadClass("android.net.Network");
                    z = true;
                } catch (ClassNotFoundException e2) {
                    f59370a.log(Level.FINE, "Can't find class", (Throwable) e2);
                    z = false;
                }
                if (!z) {
                    try {
                        Platform.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        z2 = true;
                    } catch (ClassNotFoundException e3) {
                        f59370a.log(Level.FINE, "Can't find class", (Throwable) e3);
                    }
                    tlsExtensionType = z2 ? TlsExtensionType.NPN : TlsExtensionType.NONE;
                }
            }
            platform2 = new Android(optionalMethod, optionalMethod2, method2, method3, optionalMethod3, optionalMethod4, provider, tlsExtensionType);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.okhttp.internal.Platform.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Method run() throws Exception {
                            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
                        }
                    })).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    platform2 = new JdkAlpnPlatform(provider3, (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.okhttp.internal.Platform.2
                        @Override // java.security.PrivilegedExceptionAction
                        public Method run() throws Exception {
                            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                        }
                    }), (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.grpc.okhttp.internal.Platform.3
                        @Override // java.security.PrivilegedExceptionAction
                        public Method run() throws Exception {
                            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        }
                    }), null);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        platform = new JdkWithJettyBootPlatform(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        platform = new Platform(provider3);
                    }
                    platform2 = platform;
                }
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
        f59372c = platform2;
    }

    public Platform(Provider provider) {
    }

    /* renamed from: b */
    public static byte[] m31290b(List<Protocol> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                buffer.m34524Q(protocol.f59397b.length());
                buffer.m34516D0(protocol.f59397b);
            }
        }
        return buffer.mo34527T();
    }

    /* renamed from: a */
    public void mo31291a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo31292c(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    /* renamed from: d */
    public String mo31293d(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: e */
    public TlsExtensionType mo31294e() {
        return TlsExtensionType.NONE;
    }
}

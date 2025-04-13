package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class Platform {

    /* renamed from: a */
    public static final Platform f24960a;

    public static class Android extends Platform {

        /* renamed from: b */
        public final Class<?> f24961b;

        /* renamed from: c */
        public final OptionalMethod<Socket> f24962c;

        /* renamed from: d */
        public final OptionalMethod<Socket> f24963d;

        /* renamed from: e */
        public final OptionalMethod<Socket> f24964e;

        /* renamed from: f */
        public final OptionalMethod<Socket> f24965f;

        public Android(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, Method method, Method method2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
            this.f24961b = cls;
            this.f24962c = optionalMethod;
            this.f24963d = optionalMethod2;
            this.f24964e = optionalMethod3;
            this.f24965f = optionalMethod4;
        }
    }

    public static class JdkPlatform extends Platform {

        /* renamed from: b */
        public final Class<?> f24966b;

        public JdkPlatform(Class<?> cls) {
            this.f24966b = cls;
        }
    }

    public static class JdkWithJettyBootPlatform extends JdkPlatform {

        /* renamed from: c */
        public final Method f24967c;

        /* renamed from: d */
        public final Method f24968d;

        /* renamed from: e */
        public final Method f24969e;

        /* renamed from: f */
        public final Class<?> f24970f;

        /* renamed from: g */
        public final Class<?> f24971g;

        public JdkWithJettyBootPlatform(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.f24967c = method;
            this.f24968d = method2;
            this.f24969e = method3;
            this.f24970f = cls2;
            this.f24971g = cls3;
        }
    }

    public static class JettyNegoProvider implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f24972a;

        /* renamed from: b */
        public boolean f24973b;

        /* renamed from: c */
        public String f24974c;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.f24977b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f24973b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f24972a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f24974c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f24972a.contains(list.get(i2))) {
                    String str = (String) list.get(i2);
                    this.f24974c = str;
                    return str;
                }
            }
            String str2 = this.f24972a.get(0);
            this.f24974c = str2;
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Platform platform;
        Class<?> cls;
        Platform jdkPlatform;
        Method method;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        Object obj;
        OptionalMethod optionalMethod3;
        Method method2;
        Class<?> cls2;
        Object method3;
        try {
            try {
                try {
                    cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                } catch (ClassNotFoundException unused) {
                    platform = new Platform();
                }
            } catch (ClassNotFoundException unused2) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls3 = cls;
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod5 = new OptionalMethod(null, "setHostname", String.class);
            try {
                cls2 = Class.forName("android.net.TrafficStats");
                method = cls2.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                method = null;
                optionalMethod = null;
            }
            try {
                method3 = cls2.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                optionalMethod = null;
                optionalMethod2 = optionalMethod;
                obj = optionalMethod;
                optionalMethod3 = optionalMethod2;
                method2 = obj;
                platform = new Android(cls3, optionalMethod4, optionalMethod5, method, method2, optionalMethod2, optionalMethod3);
                f24960a = platform;
            }
            try {
                Class.forName("android.net.Network");
                OptionalMethod optionalMethod6 = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                try {
                    optionalMethod3 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    optionalMethod3 = null;
                }
                optionalMethod2 = optionalMethod6;
                method2 = method3;
            } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                obj = method3;
                optionalMethod2 = null;
                optionalMethod3 = optionalMethod2;
                method2 = obj;
                platform = new Android(cls3, optionalMethod4, optionalMethod5, method, method2, optionalMethod2, optionalMethod3);
                f24960a = platform;
            }
            platform = new Android(cls3, optionalMethod4, optionalMethod5, method, method2, optionalMethod2, optionalMethod3);
        } catch (ClassNotFoundException unused7) {
            Class<?> cls4 = Class.forName("sun.security.ssl.SSLContextImpl");
            try {
                Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                jdkPlatform = new JdkWithJettyBootPlatform(cls4, cls5.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls5.getMethod("get", SSLSocket.class), cls5.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
            } catch (ClassNotFoundException | NoSuchMethodException unused8) {
                jdkPlatform = new JdkPlatform(cls4);
                platform = jdkPlatform;
                f24960a = platform;
            }
            platform = jdkPlatform;
        }
        f24960a = platform;
    }
}

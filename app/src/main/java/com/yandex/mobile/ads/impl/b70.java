package com.yandex.mobile.ads.impl;

import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.mobile.ads.impl.eq0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b70 extends eq0 {

    /* renamed from: i */
    public static final /* synthetic */ int f48783i = 0;

    /* renamed from: d */
    @NotNull
    private final Method f48784d;

    /* renamed from: e */
    @NotNull
    private final Method f48785e;

    /* renamed from: f */
    @NotNull
    private final Method f48786f;

    /* renamed from: g */
    @NotNull
    private final Class<?> f48787g;

    /* renamed from: h */
    @NotNull
    private final Class<?> f48788h;

    /* renamed from: com.yandex.mobile.ads.impl.b70$a */
    public static final class C4844a implements InvocationHandler {

        /* renamed from: a */
        @NotNull
        private final List<String> f48789a;

        /* renamed from: b */
        private boolean f48790b;

        /* renamed from: c */
        @Nullable
        private String f48791c;

        public C4844a(@NotNull ArrayList protocols) {
            Intrinsics.m32179h(protocols, "protocols");
            this.f48789a = protocols;
        }

        @Nullable
        /* renamed from: a */
        public final String m22735a() {
            return this.f48791c;
        }

        /* renamed from: b */
        public final boolean m22736b() {
            return this.f48790b;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            Intrinsics.m32179h(proxy, "proxy");
            Intrinsics.m32179h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.m32174c(name, "supports") && Intrinsics.m32174c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.m32174c(name, "unsupported") && Intrinsics.m32174c(Void.TYPE, returnType)) {
                this.f48790b = true;
                return null;
            }
            if (Intrinsics.m32174c(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f48789a;
                }
            }
            if ((Intrinsics.m32174c(name, "selectProtocol") || Intrinsics.m32174c(name, "select")) && Intrinsics.m32174c(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.m32177f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj2 = list.get(i2);
                            Intrinsics.m32177f(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f48789a.contains(str)) {
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            } else {
                                this.f48791c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f48789a.get(0);
                    this.f48791c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.m32174c(name, "protocolSelected") && !Intrinsics.m32174c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.m32177f(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f48791c = (String) obj3;
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b70$b */
    public static final class C4845b {
        @Nullable
        /* renamed from: a */
        public static b70 m22737a() {
            String jvmVersion = System.getProperty("java.specification.version", CoreConstants.Transport.UNKNOWN);
            try {
                Intrinsics.m32178g(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.m32178g(putMethod, "putMethod");
                Intrinsics.m32178g(getMethod, "getMethod");
                Intrinsics.m32178g(removeMethod, "removeMethod");
                Intrinsics.m32178g(clientProviderClass, "clientProviderClass");
                Intrinsics.m32178g(serverProviderClass, "serverProviderClass");
                return new b70(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public b70(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        Intrinsics.m32179h(putMethod, "putMethod");
        Intrinsics.m32179h(getMethod, "getMethod");
        Intrinsics.m32179h(removeMethod, "removeMethod");
        Intrinsics.m32179h(clientProviderClass, "clientProviderClass");
        Intrinsics.m32179h(serverProviderClass, "serverProviderClass");
        this.f48784d = putMethod;
        this.f48785e = getMethod;
        this.f48786f = removeMethod;
        this.f48787g = clientProviderClass;
        this.f48788h = serverProviderClass;
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo22733a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends bt0> protocols) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        try {
            this.f48784d.invoke(null, sslSocket, Proxy.newProxyInstance(eq0.class.getClassLoader(), new Class[]{this.f48787g, this.f48788h}, new C4844a(eq0.C5041a.m24240a(protocols))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @Nullable
    /* renamed from: b */
    public final String mo22734b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f48785e.invoke(null, sslSocket));
            Intrinsics.m32177f(invocationHandler, "null cannot be cast to non-null type com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C4844a c4844a = (C4844a) invocationHandler;
            if (!c4844a.m22736b() && c4844a.m22735a() == null) {
                eq0.m24230a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (c4844a.m22736b()) {
                return null;
            }
            return c4844a.m22735a();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo22732a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        try {
            this.f48786f.invoke(null, sslSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }
}

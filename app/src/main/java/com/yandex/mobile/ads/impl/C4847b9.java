package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b9 */
/* loaded from: classes3.dex */
public class C4847b9 implements g31 {

    /* renamed from: f */
    @NotNull
    private static final C4797a9 f48797f;

    /* renamed from: g */
    public static final /* synthetic */ int f48798g = 0;

    /* renamed from: a */
    @NotNull
    private final Class<? super SSLSocket> f48799a;

    /* renamed from: b */
    @NotNull
    private final Method f48800b;

    /* renamed from: c */
    private final Method f48801c;

    /* renamed from: d */
    private final Method f48802d;

    /* renamed from: e */
    private final Method f48803e;

    static {
        new a(0);
        f48797f = a.m22747a();
    }

    public C4847b9(@NotNull Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.m32179h(sslSocketClass, "sslSocketClass");
        this.f48799a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.m32178g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f48800b = declaredMethod;
        this.f48801c = sslSocketClass.getMethod("setHostname", String.class);
        this.f48802d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f48803e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final void mo22743a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends bt0> protocols) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        if (this.f48799a.isInstance(sslSocket)) {
            try {
                this.f48800b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f48801c.invoke(sslSocket, str);
                }
                Method method = this.f48803e;
                int i2 = eq0.f50037c;
                method.invoke(sslSocket, eq0.C5041a.m24242b(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.g31
    @Nullable
    /* renamed from: b */
    public final String mo22746b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        if (!this.f48799a.isInstance(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f48802d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.m32178g(UTF_8, "UTF_8");
            return new String(bArr, UTF_8);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (NullPointerException e3) {
            if (Intrinsics.m32174c(e3.getMessage(), "ssl == null")) {
                return null;
            }
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b9$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i2) {
            this();
        }

        /* renamed from: a */
        public static final C4847b9 m22748a(Class cls) {
            int i2 = C4847b9.f48798g;
            Class cls2 = cls;
            while (!Intrinsics.m32174c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            return new C4847b9(cls2);
        }

        @NotNull
        /* renamed from: b */
        public static C4797a9 m22749b() {
            return C4847b9.f48797f;
        }

        @NotNull
        /* renamed from: a */
        public static C4797a9 m22747a() {
            return new C4797a9();
        }
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22744a() {
        int i2 = C6111z8.f57079g;
        return C6111z8.f57078f;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22745a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        return this.f48799a.isInstance(sslSocket);
    }
}

package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.C4847b9;
import com.yandex.mobile.ads.impl.C5640qi;
import com.yandex.mobile.ads.impl.C5906v8;
import com.yandex.mobile.ads.impl.eq0;
import com.yandex.mobile.ads.impl.y31;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z8 */
/* loaded from: classes3.dex */
public final class C6111z8 extends eq0 {

    /* renamed from: f */
    private static final boolean f57078f;

    /* renamed from: g */
    public static final /* synthetic */ int f57079g = 0;

    /* renamed from: d */
    @NotNull
    private final ArrayList f57080d;

    /* renamed from: e */
    @NotNull
    private final C5640qi f57081e;

    /* renamed from: com.yandex.mobile.ads.impl.z8$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static C6111z8 m30073a() {
            if (C6111z8.f57078f) {
                return new C6111z8();
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.z8$b */
    public static final class b implements b81 {

        /* renamed from: a */
        @NotNull
        private final X509TrustManager f57082a;

        /* renamed from: b */
        @NotNull
        private final Method f57083b;

        public b(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.m32179h(trustManager, "trustManager");
            Intrinsics.m32179h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f57082a = trustManager;
            this.f57083b = findByIssuerAndSignatureMethod;
        }

        @Override // com.yandex.mobile.ads.impl.b81
        @Nullable
        /* renamed from: a */
        public final X509Certificate mo22741a(@NotNull X509Certificate cert) {
            Intrinsics.m32179h(cert, "cert");
            try {
                Object invoke = this.f57083b.invoke(this.f57082a, cert);
                Intrinsics.m32177f(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.m32174c(this.f57082a, bVar.f57082a) && Intrinsics.m32174c(this.f57083b, bVar.f57083b);
        }

        public final int hashCode() {
            return this.f57083b.hashCode() + (this.f57082a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder m26356a = l60.m26356a("CustomTrustRootIndex(trustManager=");
            m26356a.append(this.f57082a);
            m26356a.append(", findByIssuerAndSignatureMethod=");
            m26356a.append(this.f57083b);
            m26356a.append(')');
            return m26356a.toString();
        }
    }

    static {
        f57078f = eq0.C5041a.m24243c() && Build.VERSION.SDK_INT < 30;
    }

    public C6111z8() {
        int i2 = y31.f56664h;
        int i3 = C4847b9.f48798g;
        List m31996I = CollectionsKt.m31996I(y31.C6055a.m29860a(), new C5453mo(C4847b9.a.m22749b()));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) m31996I).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((g31) next).mo22744a()) {
                arrayList.add(next);
            }
        }
        this.f57080d = arrayList;
        this.f57081e = C5640qi.a.m27726a();
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo24235a(@NotNull Socket socket, @NotNull InetSocketAddress address, int i2) throws IOException {
        Intrinsics.m32179h(socket, "socket");
        Intrinsics.m32179h(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @Nullable
    /* renamed from: b */
    public final String mo22734b(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Iterator it = this.f57080d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g31) obj).mo22745a(sslSocket)) {
                break;
            }
        }
        g31 g31Var = (g31) obj;
        if (g31Var != null) {
            return g31Var.mo22746b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @Nullable
    /* renamed from: b */
    public final Object mo24238b() {
        return this.f57081e.m27724a();
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @NotNull
    /* renamed from: b */
    public final b81 mo24237b(@NotNull X509TrustManager trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo24237b(trustManager);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo22733a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<bt0> protocols) {
        Object obj;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        Iterator it = this.f57080d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((g31) obj).mo22745a(sslSocket)) {
                    break;
                }
            }
        }
        g31 g31Var = (g31) obj;
        if (g31Var != null) {
            g31Var.mo22743a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo24234a(@Nullable Object obj, @NotNull String message) {
        Intrinsics.m32179h(message, "message");
        if (this.f57081e.m27725a(obj)) {
            return;
        }
        eq0.m24230a(this, message, 5, 4);
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final boolean mo24236a(@NotNull String hostname) {
        Intrinsics.m32179h(hostname, "hostname");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        if (i2 >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @NotNull
    /* renamed from: a */
    public final AbstractC5027eh mo24233a(@NotNull X509TrustManager trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        C5906v8 m29192a = C5906v8.a.m29192a(trustManager);
        return m29192a != null ? m29192a : super.mo24233a(trustManager);
    }
}

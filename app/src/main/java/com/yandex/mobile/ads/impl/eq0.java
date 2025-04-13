package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5786t8;
import com.yandex.mobile.ads.impl.C6111z8;
import com.yandex.mobile.ads.impl.b70;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class eq0 {

    /* renamed from: a */
    @NotNull
    private static volatile eq0 f50035a = C5041a.m24239a();

    /* renamed from: b */
    private static final Logger f50036b = Logger.getLogger(mn0.class.getName());

    /* renamed from: c */
    public static final /* synthetic */ int f50037c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.eq0$a */
    public static final class C5041a {
        /* renamed from: a */
        public static final eq0 m24239a() {
            boolean z;
            if (!m24243c()) {
                z = c70.f49119d;
                c70 c70Var = z ? new c70() : null;
                if (c70Var != null) {
                    return c70Var;
                }
                int i2 = b70.f48783i;
                b70 m22737a = b70.C4845b.m22737a();
                return m22737a != null ? m22737a : new eq0();
            }
            C5962w8.m29402a();
            int i3 = C5786t8.f54977f;
            C5786t8 m28480a = C5786t8.a.m28480a();
            if (m28480a != null) {
                return m28480a;
            }
            int i4 = C6111z8.f57079g;
            C6111z8 m30073a = C6111z8.a.m30073a();
            Intrinsics.m32176e(m30073a);
            return m30073a;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public static eq0 m24241b() {
            return eq0.f50035a;
        }

        /* renamed from: c */
        public static boolean m24243c() {
            return Intrinsics.m32174c("Dalvik", System.getProperty("java.vm.name"));
        }

        @NotNull
        /* renamed from: b */
        public static byte[] m24242b(@NotNull List protocols) {
            Intrinsics.m32179h(protocols, "protocols");
            Buffer buffer = new Buffer();
            Iterator it = m24240a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                buffer.m34524Q(str.length());
                buffer.m34516D0(str);
            }
            return buffer.mo34527T();
        }

        @NotNull
        /* renamed from: a */
        public static ArrayList m24240a(@NotNull List protocols) {
            Intrinsics.m32179h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((bt0) obj) != bt0.f48973b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bt0) it.next()).toString());
            }
            return arrayList2;
        }
    }

    @NotNull
    /* renamed from: c */
    public static SSLSocketFactory m24231c(@NotNull X509TrustManager trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            Intrinsics.m32178g(sSLContext, "getInstance(\"TLS\")");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.m32178g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    /* renamed from: a */
    public void mo24234a(@Nullable Object obj, @NotNull String message) {
        Intrinsics.m32179h(message, "message");
        if (obj == null) {
            message = um1.m29049a(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m24229a(5, message, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo22732a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
    }

    /* renamed from: a */
    public void mo22733a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<bt0> protocols) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
    }

    /* renamed from: a */
    public boolean mo24236a(@NotNull String hostname) {
        Intrinsics.m32179h(hostname, "hostname");
        return true;
    }

    @Nullable
    /* renamed from: b */
    public Object mo24238b() {
        if (f50036b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public String mo22734b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        return null;
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName();
    }

    @NotNull
    /* renamed from: b */
    public b81 mo24237b(@NotNull X509TrustManager trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.m32178g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C5334ke((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: a */
    public void mo24235a(@NotNull Socket socket, @NotNull InetSocketAddress address, int i2) throws IOException {
        Intrinsics.m32179h(socket, "socket");
        Intrinsics.m32179h(address, "address");
        socket.connect(address, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m24230a(eq0 eq0Var, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        Objects.requireNonNull(eq0Var);
        m24229a(i2, str, (Throwable) null);
    }

    @NotNull
    /* renamed from: c */
    public static X509TrustManager m24232c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m32176e(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Intrinsics.m32177f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder m26356a = l60.m26356a("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.m32178g(arrays, "toString(this)");
        m26356a.append(arrays);
        throw new IllegalStateException(m26356a.toString().toString());
    }

    /* renamed from: a */
    public static void m24229a(int i2, @NotNull String message, @Nullable Throwable th) {
        Intrinsics.m32179h(message, "message");
        f50036b.log(i2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    @NotNull
    /* renamed from: a */
    public AbstractC5027eh mo24233a(@NotNull X509TrustManager trustManager) {
        Intrinsics.m32179h(trustManager, "trustManager");
        return new C5225ie(mo24237b(trustManager));
    }
}

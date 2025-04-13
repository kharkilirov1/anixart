package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.C4847b9;
import com.yandex.mobile.ads.impl.C5848u8;
import com.yandex.mobile.ads.impl.C5906v8;
import com.yandex.mobile.ads.impl.eq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t8 */
/* loaded from: classes3.dex */
public final class C5786t8 extends eq0 {

    /* renamed from: e */
    private static final boolean f54976e;

    /* renamed from: f */
    public static final /* synthetic */ int f54977f = 0;

    /* renamed from: d */
    @NotNull
    private final ArrayList f54978d;

    /* renamed from: com.yandex.mobile.ads.impl.t8$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static C5786t8 m28480a() {
            if (C5786t8.f54976e) {
                return new C5786t8();
            }
            return null;
        }
    }

    static {
        f54976e = eq0.C5041a.m24243c() && Build.VERSION.SDK_INT >= 29;
    }

    public C5786t8() {
        int i2 = C4847b9.f48798g;
        List m31996I = CollectionsKt.m31996I(C5848u8.a.m28910a(), new C5453mo(C4847b9.a.m22749b()));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) m31996I).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((g31) next).mo22744a()) {
                arrayList.add(next);
            }
        }
        this.f54978d = arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo22733a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends bt0> protocols) {
        Object obj;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        Iterator it = this.f54978d.iterator();
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
    @Nullable
    /* renamed from: b */
    public final String mo22734b(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Iterator it = this.f54978d.iterator();
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
    @SuppressLint
    /* renamed from: a */
    public final boolean mo24236a(@NotNull String hostname) {
        Intrinsics.m32179h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
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

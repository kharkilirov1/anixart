package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.mo */
/* loaded from: classes3.dex */
public final class C5453mo implements g31 {

    /* renamed from: a */
    @NotNull
    private final a f52767a;

    /* renamed from: b */
    @Nullable
    private g31 f52768b;

    /* renamed from: com.yandex.mobile.ads.impl.mo$a */
    public interface a {
        /* renamed from: a */
        boolean mo22406a(@NotNull SSLSocket sSLSocket);

        @NotNull
        /* renamed from: b */
        C4847b9 mo22407b(@NotNull SSLSocket sSLSocket);
    }

    public C5453mo(@NotNull C4797a9 socketAdapterFactory) {
        Intrinsics.m32179h(socketAdapterFactory, "socketAdapterFactory");
        this.f52767a = socketAdapterFactory;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22744a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22745a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        return this.f52767a.mo22406a(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.g31
    @Nullable
    /* renamed from: b */
    public final String mo22746b(@NotNull SSLSocket sslSocket) {
        g31 g31Var;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.f52768b == null && this.f52767a.mo22406a(sslSocket)) {
                this.f52768b = this.f52767a.mo22407b(sslSocket);
            }
            g31Var = this.f52768b;
        }
        if (g31Var != null) {
            return g31Var.mo22746b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final void mo22743a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends bt0> protocols) {
        g31 g31Var;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        synchronized (this) {
            if (this.f52768b == null && this.f52767a.mo22406a(sslSocket)) {
                this.f52768b = this.f52767a.mo22407b(sslSocket);
            }
            g31Var = this.f52768b;
        }
        if (g31Var != null) {
            g31Var.mo22743a(sslSocket, str, protocols);
        }
    }
}

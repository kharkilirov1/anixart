package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.eq0;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.u8 */
/* loaded from: classes3.dex */
public final class C5848u8 implements g31 {

    /* renamed from: com.yandex.mobile.ads.impl.u8$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static C5848u8 m28910a() {
            if (m28911b()) {
                return new C5848u8();
            }
            return null;
        }

        /* renamed from: b */
        public static boolean m28911b() {
            int i2 = eq0.f50037c;
            return eq0.C5041a.m24243c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22745a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.g31
    @SuppressLint
    @Nullable
    /* renamed from: b */
    public final String mo22746b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.m32174c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.g31
    /* renamed from: a */
    public final boolean mo22744a() {
        return a.m28911b();
    }

    @Override // com.yandex.mobile.ads.impl.g31
    @SuppressLint
    /* renamed from: a */
    public final void mo22743a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends bt0> protocols) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i2 = eq0.f50037c;
            Object[] array = eq0.C5041a.m24240a(protocols).toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}

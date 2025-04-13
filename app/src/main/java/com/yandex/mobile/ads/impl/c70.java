package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c70 extends eq0 {

    /* renamed from: d */
    private static final boolean f49119d;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0.intValue() >= 9) goto L12;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = kotlin.text.StringsKt.m33910j0(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L24
            goto L23
        L1a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L24
            r0.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L24
        L23:
            r1 = 1
        L24:
            com.yandex.mobile.ads.impl.c70.f49119d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c70.<clinit>():void");
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    /* renamed from: a */
    public final void mo22733a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<bt0> protocols) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        Intrinsics.m32179h(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = eq0.C5041a.m24240a(protocols).toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // com.yandex.mobile.ads.impl.eq0
    @Nullable
    /* renamed from: b */
    public final String mo22734b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.m32174c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}

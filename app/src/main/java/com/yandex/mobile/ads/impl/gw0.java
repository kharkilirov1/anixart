package com.yandex.mobile.ads.impl;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gw0 {
    @NotNull
    /* renamed from: a */
    public static String m24992a(@NotNull aw0 request, @NotNull Proxy.Type proxyType) {
        Intrinsics.m32179h(request, "request");
        Intrinsics.m32179h(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.m22638f());
        sb.append(' ');
        if (!request.m22637e() && proxyType == Proxy.Type.HTTP) {
            sb.append(request.m22640h());
        } else {
            sb.append(m24993a(request.m22640h()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: a */
    public static String m24993a(@NotNull t00 url) {
        Intrinsics.m32179h(url, "url");
        String m28388c = url.m28388c();
        String m28390e = url.m28390e();
        if (m28390e == null) {
            return m28388c;
        }
        return m28388c + '?' + m28390e;
    }
}

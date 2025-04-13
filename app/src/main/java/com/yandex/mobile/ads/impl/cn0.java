package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cn0 extends ProxySelector {

    /* renamed from: a */
    @NotNull
    public static final cn0 f49320a = new cn0();

    private cn0() {
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @NotNull
    public final List<Proxy> select(@Nullable URI uri) {
        if (uri != null) {
            return CollectionsKt.m31993F(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}

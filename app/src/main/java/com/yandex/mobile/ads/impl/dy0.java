package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dy0 {

    /* renamed from: a */
    @NotNull
    private final C6008x6 f49766a;

    /* renamed from: b */
    @NotNull
    private final Proxy f49767b;

    /* renamed from: c */
    @NotNull
    private final InetSocketAddress f49768c;

    public dy0(@NotNull C6008x6 address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.m32179h(address, "address");
        Intrinsics.m32179h(proxy, "proxy");
        Intrinsics.m32179h(socketAddress, "socketAddress");
        this.f49766a = address;
        this.f49767b = proxy;
        this.f49768c = socketAddress;
    }

    @JvmName
    @NotNull
    /* renamed from: a */
    public final C6008x6 m23960a() {
        return this.f49766a;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final Proxy m23961b() {
        return this.f49767b;
    }

    /* renamed from: c */
    public final boolean m23962c() {
        return this.f49766a.m29676j() != null && this.f49767b.type() == Proxy.Type.HTTP;
    }

    @JvmName
    @NotNull
    /* renamed from: d */
    public final InetSocketAddress m23963d() {
        return this.f49768c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof dy0) {
            dy0 dy0Var = (dy0) obj;
            if (Intrinsics.m32174c(dy0Var.f49766a, this.f49766a) && Intrinsics.m32174c(dy0Var.f49767b, this.f49767b) && Intrinsics.m32174c(dy0Var.f49768c, this.f49768c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49768c.hashCode() + ((this.f49767b.hashCode() + ((this.f49766a.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Route{");
        m26356a.append(this.f49768c);
        m26356a.append('}');
        return m26356a.toString();
    }
}
